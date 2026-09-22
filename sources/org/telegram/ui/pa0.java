package org.telegram.ui;

import android.content.Intent;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class pa0 implements org.telegram.ui.Components.ce0, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ LaunchActivity a;

    public /* synthetic */ pa0(LaunchActivity launchActivity) {
        this.a = launchActivity;
    }

    @Override // org.telegram.ui.Components.ce0
    public void i(org.telegram.ui.Components.de0 de0Var) {
        Pattern pattern = LaunchActivity.B1;
        SharedConfig.isWaitingForPasscodeEnter = false;
        LaunchActivity launchActivity = this.a;
        Intent intent = launchActivity.L0;
        if (intent != null) {
            launchActivity.X(intent, launchActivity.M0, launchActivity.N0, true, null, false, true);
            launchActivity.L0 = null;
        }
        launchActivity.q0.getView().setVisibility(0);
        launchActivity.q0.U(true, true);
        ActionBarLayout actionBarLayout = launchActivity.q0;
        org.telegram.ui.ActionBar.n2 lastFragment = actionBarLayout.getLastFragment();
        if (lastFragment != null) {
            lastFragment.setTitleOverlayText(actionBarLayout.G0, actionBarLayout.H0, actionBarLayout.I0);
        }
        if (AndroidUtilities.isTablet()) {
            launchActivity.r0.U(true, true);
            launchActivity.s0.U(true, true);
            if (launchActivity.r0.getView().getVisibility() == 4) {
                launchActivity.r0.getView().setVisibility(0);
            }
            launchActivity.s0.getView().setVisibility(0);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, de0Var);
        try {
            NotificationsController.getInstance(UserConfig.selectedAccount).showNotifications();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        Pattern pattern = LaunchActivity.B1;
        MessagesController.getInstance(this.a.O).performLogout(2);
    }
}
