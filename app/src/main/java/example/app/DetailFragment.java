package example.app;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Quincy on 8/19/14.
 */
@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class DetailFragment extends Fragment{
    TextView text;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
       // View view = inflater.inflate(R.id.);


    }
}
