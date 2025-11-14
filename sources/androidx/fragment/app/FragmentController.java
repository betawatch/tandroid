package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.core.util.Preconditions;

/* loaded from: classes.dex */
public class FragmentController {
    private final FragmentHostCallback mHost;

    public static FragmentController createController(FragmentHostCallback fragmentHostCallback) {
        return new FragmentController((FragmentHostCallback) Preconditions.checkNotNull(fragmentHostCallback, "callbacks == null"));
    }

    private FragmentController(FragmentHostCallback fragmentHostCallback) {
        this.mHost = fragmentHostCallback;
    }

    public FragmentManager getSupportFragmentManager() {
        return this.mHost.getFragmentManager();
    }

    public void attachHost(Fragment fragment) {
        FragmentManager fragmentManager = this.mHost.getFragmentManager();
        FragmentHostCallback fragmentHostCallback = this.mHost;
        fragmentManager.attachController(fragmentHostCallback, fragmentHostCallback, fragment);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mHost.getFragmentManager().getLayoutInflaterFactory().onCreateView(view, str, context, attributeSet);
    }

    public void noteStateNotSaved() {
        this.mHost.getFragmentManager().noteStateNotSaved();
    }

    public void dispatchCreate() {
        this.mHost.getFragmentManager().dispatchCreate();
    }

    public void dispatchActivityCreated() {
        this.mHost.getFragmentManager().dispatchActivityCreated();
    }

    public void dispatchStart() {
        this.mHost.getFragmentManager().dispatchStart();
    }

    public void dispatchResume() {
        this.mHost.getFragmentManager().dispatchResume();
    }

    public void dispatchPause() {
        this.mHost.getFragmentManager().dispatchPause();
    }

    public void dispatchStop() {
        this.mHost.getFragmentManager().dispatchStop();
    }

    public void dispatchDestroy() {
        this.mHost.getFragmentManager().dispatchDestroy();
    }

    public boolean dispatchContextItemSelected(MenuItem menuItem) {
        return this.mHost.getFragmentManager().dispatchContextItemSelected(menuItem);
    }

    public boolean execPendingActions() {
        return this.mHost.getFragmentManager().execPendingActions(true);
    }
}
