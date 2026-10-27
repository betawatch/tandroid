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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ba0 implements org.telegram.ui.Components.ke0, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ LaunchActivity a;

    public /* synthetic */ ba0(LaunchActivity launchActivity) {
        this.a = launchActivity;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        Pattern pattern = LaunchActivity.D1;
        MessagesController.getInstance(this.a.O).performLogout(2);
    }

    @Override // org.telegram.ui.Components.ke0
    public void l(org.telegram.ui.Components.me0 me0Var) {
        Pattern pattern = LaunchActivity.D1;
        SharedConfig.isWaitingForPasscodeEnter = false;
        LaunchActivity launchActivity = this.a;
        Intent intent = launchActivity.L0;
        if (intent != null) {
            launchActivity.X(intent, launchActivity.M0, launchActivity.N0, true, null, false, true);
            launchActivity.L0 = null;
        }
        launchActivity.q0.getView().setVisibility(0);
        launchActivity.q0.W(true, true);
        ActionBarLayout actionBarLayout = launchActivity.q0;
        org.telegram.ui.ActionBar.r2 lastFragment = actionBarLayout.getLastFragment();
        if (lastFragment != null) {
            lastFragment.setTitleOverlayText(actionBarLayout.M0, actionBarLayout.N0, actionBarLayout.O0);
        }
        if (AndroidUtilities.isTablet()) {
            ActionBarLayout actionBarLayout2 = launchActivity.r0;
            if (actionBarLayout2 != null) {
                actionBarLayout2.W(true, true);
                if (launchActivity.r0.getView().getVisibility() == 4) {
                    launchActivity.r0.getView().setVisibility(0);
                }
            }
            ActionBarLayout actionBarLayout3 = launchActivity.s0;
            if (actionBarLayout3 != null) {
                actionBarLayout3.W(true, true);
                launchActivity.s0.getView().setVisibility(0);
            }
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, me0Var);
        try {
            NotificationsController.getInstance(UserConfig.selectedAccount).showNotifications();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
