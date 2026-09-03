package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class uj implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ uj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11, boolean z4) {
        this.e = sendMessagesHelper;
        this.f = message;
        this.b = i10;
        this.c = i11;
        this.d = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Document f10;
        switch (this.a) {
            case 0:
                ((SendMessagesHelper) this.e).lambda$performSendMessageRequest$98((TLRPC.Message) this.f, this.b, this.c, this.d);
                break;
            case 1:
                xn xnVar = (xn) this.e;
                qk0 qk0Var = (qk0) this.f;
                org.telegram.ui.ActionBar.p1 p1Var = xnVar.N8;
                if (p1Var != null && xnVar.fragmentView != null && !p1Var.isShowing() && AndroidUtilities.isActivityRunning(xnVar.getParentActivity())) {
                    xnVar.N8.showAtLocation(xnVar.u0, 51, this.b, this.c);
                    if (this.d && qk0Var != null) {
                        qk0Var.r(true);
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.lf(xnVar, 25), 420L);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.sb sbVar = (org.telegram.ui.Components.sb) this.e;
                ng.q0 q0Var = (ng.q0) this.f;
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                long j10 = q0Var.g;
                if (j10 == 0) {
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(q0Var.f);
                    if (tL_availableReaction != null) {
                        f10 = tL_availableReaction.activate_animation;
                    }
                } else {
                    f10 = org.telegram.ui.Components.l5.f(UserConfig.selectedAccount, j10);
                }
                if (f10 != null && R != null) {
                    org.telegram.ui.Components.qc.a0(R).y(sbVar.a.h, f10, this.d ? new j3.v(this.b, this.c, R, 6) : null).k(true);
                    break;
                }
                break;
            default:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.e;
                org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) this.f;
                int i10 = this.b;
                boolean z4 = this.d;
                if (i10 == 3) {
                    SharedPreferences.Editor edit = notificationsSettingsActivity.getNotificationsSettings().edit();
                    if (z4) {
                        edit.remove("EnableAllStories");
                    } else {
                        edit.putBoolean("EnableAllStories", true);
                    }
                    edit.apply();
                    notificationsSettingsActivity.getNotificationsController().updateServerNotificationsSettings(i10);
                } else if (i10 == 4 || i10 == 5) {
                    SharedPreferences.Editor edit2 = notificationsSettingsActivity.getNotificationsSettings().edit();
                    if (z4) {
                        edit2.putBoolean("EnableReactionsMessages", false);
                        edit2.putBoolean("EnableReactionsStories", false);
                    } else {
                        edit2.putBoolean("EnableReactionsMessages", true);
                        edit2.putBoolean("EnableReactionsStories", true);
                    }
                    edit2.apply();
                    notificationsSettingsActivity.getNotificationsController().updateServerNotificationsSettings(i10);
                    notificationsSettingsActivity.getNotificationsController().deleteNotificationChannelGlobal(i10);
                } else {
                    notificationsSettingsActivity.getNotificationsController().setGlobalNotificationsEnabled(i10, !z4 ? 0 : ConnectionsManager.DEFAULT_DATACENTER_ID);
                }
                j5Var.e.b(0, !z4, true);
                notificationsSettingsActivity.c.m(this.c);
                break;
        }
    }

    public /* synthetic */ uj(xn xnVar, int i10, int i11, boolean z4, qk0 qk0Var) {
        this.e = xnVar;
        this.b = i10;
        this.c = i11;
        this.d = z4;
        this.f = qk0Var;
    }

    public /* synthetic */ uj(org.telegram.ui.Components.sb sbVar, ng.q0 q0Var, boolean z4, int i10, int i11) {
        this.e = sbVar;
        this.f = q0Var;
        this.d = z4;
        this.b = i10;
        this.c = i11;
    }

    public /* synthetic */ uj(NotificationsSettingsActivity notificationsSettingsActivity, int i10, boolean z4, org.telegram.ui.Cells.j5 j5Var, int i11) {
        this.e = notificationsSettingsActivity;
        this.b = i10;
        this.d = z4;
        this.f = j5Var;
        this.c = i11;
    }
}
