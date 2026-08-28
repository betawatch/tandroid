package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class oa0 implements OnBackInvokedCallback {
    public final /* synthetic */ LaunchActivity a;

    public oa0(LaunchActivity launchActivity) {
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
            ActionBarLayout actionBarLayout = launchActivity.m0;
            if (actionBarLayout == null) {
                launchActivity.onBackPressed();
            } else if (!actionBarLayout.Y0) {
                actionBarLayout.G();
            } else {
                actionBarLayout.Y0 = false;
                actionBarLayout.e(false);
            }
        }
    }
}
