package org.telegram.ui;

import android.window.OnBackInvokedCallback;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class eb0 implements OnBackInvokedCallback {
    public final /* synthetic */ LaunchActivity a;

    public eb0(LaunchActivity launchActivity) {
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
