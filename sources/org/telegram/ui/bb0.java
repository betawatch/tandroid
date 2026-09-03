package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class bb0 implements OnBackInvokedCallback {
    public final /* synthetic */ LaunchActivity a;

    public bb0(LaunchActivity launchActivity) {
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
            ActionBarLayout actionBarLayout = launchActivity.n0;
            if (actionBarLayout == null) {
                launchActivity.onBackPressed();
            } else if (!actionBarLayout.Z0) {
                actionBarLayout.G();
            } else {
                actionBarLayout.Z0 = false;
                actionBarLayout.e(false);
            }
        }
    }
}
