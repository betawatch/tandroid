// default package

import android.window.OnBackInvokedCallback;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class b26 implements OnBackInvokedCallback {
    public final /* synthetic */ LaunchActivity a;

    public b26(LaunchActivity launchActivity) {
        this.a = launchActivity;
    }

    public final void onBackInvoked() {
        boolean O1 = hl.O1();
        LaunchActivity launchActivity = this.a;
        if (O1) {
            launchActivity.onBackPressed();
            return;
        }
        if (launchActivity.d0(true)) {
            ActionBarLayout actionBarLayout = launchActivity.p0;
            if (actionBarLayout == null) {
                launchActivity.onBackPressed();
            } else if (!actionBarLayout.j1) {
                actionBarLayout.G();
            } else {
                actionBarLayout.j1 = false;
                actionBarLayout.d(false);
            }
        }
    }
}
