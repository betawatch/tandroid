package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ab0 implements OnBackInvokedCallback {
    public final /* synthetic */ LaunchActivity a;

    public ab0(LaunchActivity launchActivity) {
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
