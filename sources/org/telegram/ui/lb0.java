package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class lb0 implements OnBackInvokedCallback {
    public final /* synthetic */ LaunchActivity a;

    public lb0(LaunchActivity launchActivity) {
        this.a = launchActivity;
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        if (AndroidUtilities.isTablet()) {
            this.a.onBackPressed();
            return;
        }
        if (this.a.c0(true)) {
            LaunchActivity launchActivity = this.a;
            ActionBarLayout actionBarLayout = launchActivity.q0;
            if (actionBarLayout == null) {
                launchActivity.onBackPressed();
            } else if (!actionBarLayout.c1) {
                actionBarLayout.G();
            } else {
                actionBarLayout.c1 = false;
                actionBarLayout.e(false);
            }
        }
    }
}
