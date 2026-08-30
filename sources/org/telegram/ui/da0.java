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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class da0 implements org.telegram.ui.Components.ud0, org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ LaunchActivity a;

    public /* synthetic */ da0(LaunchActivity launchActivity) {
        this.a = launchActivity;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        Pattern pattern = LaunchActivity.y1;
        MessagesController.getInstance(this.a.L).performLogout(2);
    }

    @Override // org.telegram.ui.Components.ud0
    public void j(org.telegram.ui.Components.vd0 vd0Var) {
        Pattern pattern = LaunchActivity.y1;
        SharedConfig.isWaitingForPasscodeEnter = false;
        LaunchActivity launchActivity = this.a;
        Intent intent = launchActivity.I0;
        if (intent != null) {
            launchActivity.X(intent, launchActivity.J0, launchActivity.K0, true, null, false, true);
            launchActivity.I0 = null;
        }
        launchActivity.n0.getView().setVisibility(0);
        launchActivity.n0.U(true, true);
        ActionBarLayout actionBarLayout = launchActivity.n0;
        org.telegram.ui.ActionBar.p2 lastFragment = actionBarLayout.getLastFragment();
        if (lastFragment != null) {
            lastFragment.setTitleOverlayText(actionBarLayout.D0, actionBarLayout.E0, actionBarLayout.F0);
        }
        if (AndroidUtilities.isTablet()) {
            launchActivity.o0.U(true, true);
            launchActivity.p0.U(true, true);
            if (launchActivity.o0.getView().getVisibility() == 4) {
                launchActivity.o0.getView().setVisibility(0);
            }
            launchActivity.p0.getView().setVisibility(0);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, vd0Var);
        try {
            NotificationsController.getInstance(UserConfig.selectedAccount).showNotifications();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
