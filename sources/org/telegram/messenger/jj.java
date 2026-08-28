package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class jj implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ jj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i9, int i10, boolean z10) {
        this.e = sendMessagesHelper;
        this.f = message;
        this.b = i9;
        this.c = i10;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Document f10;
        switch (this.a) {
            case 0:
                ((SendMessagesHelper) this.e).lambda$performSendMessageRequest$98((TLRPC.Message) this.f, this.b, this.c, this.d);
                break;
            case 1:
                qn qnVar = (qn) this.e;
                uj0 uj0Var = (uj0) this.f;
                org.telegram.ui.ActionBar.o1 o1Var = qnVar.M8;
                if (o1Var != null && qnVar.fragmentView != null && !o1Var.isShowing() && AndroidUtilities.isActivityRunning(qnVar.getParentActivity())) {
                    qnVar.M8.showAtLocation(qnVar.t0, 51, this.b, this.c);
                    if (this.d && uj0Var != null) {
                        uj0Var.r(true);
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.gf(qnVar, 25), 420L);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.qb qbVar = (org.telegram.ui.Components.qb) this.e;
                hg.r0 r0Var = (hg.r0) this.f;
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                long j10 = r0Var.g;
                if (j10 == 0) {
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(r0Var.f);
                    if (tL_availableReaction != null) {
                        f10 = tL_availableReaction.activate_animation;
                    }
                } else {
                    f10 = org.telegram.ui.Components.k5.f(UserConfig.selectedAccount, j10);
                }
                if (f10 != null && R != null) {
                    org.telegram.ui.Components.oc.a0(R).y(qbVar.a.h, f10, this.d ? new h3.y(this.b, this.c, R, 7) : null).k(true);
                    break;
                }
                break;
            default:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.e;
                org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) this.f;
                int i9 = this.b;
                boolean z10 = this.d;
                if (i9 == 3) {
                    SharedPreferences.Editor edit = notificationsSettingsActivity.getNotificationsSettings().edit();
                    if (z10) {
                        edit.remove("EnableAllStories");
                    } else {
                        edit.putBoolean("EnableAllStories", true);
                    }
                    edit.apply();
                    notificationsSettingsActivity.getNotificationsController().updateServerNotificationsSettings(i9);
                } else if (i9 == 4 || i9 == 5) {
                    SharedPreferences.Editor edit2 = notificationsSettingsActivity.getNotificationsSettings().edit();
                    if (z10) {
                        edit2.putBoolean("EnableReactionsMessages", false);
                        edit2.putBoolean("EnableReactionsStories", false);
                    } else {
                        edit2.putBoolean("EnableReactionsMessages", true);
                        edit2.putBoolean("EnableReactionsStories", true);
                    }
                    edit2.apply();
                    notificationsSettingsActivity.getNotificationsController().updateServerNotificationsSettings(i9);
                    notificationsSettingsActivity.getNotificationsController().deleteNotificationChannelGlobal(i9);
                } else {
                    notificationsSettingsActivity.getNotificationsController().setGlobalNotificationsEnabled(i9, !z10 ? 0 : ConnectionsManager.DEFAULT_DATACENTER_ID);
                }
                j5Var.e.b(0, !z10, true);
                notificationsSettingsActivity.c.m(this.c);
                break;
        }
    }

    public /* synthetic */ jj(qn qnVar, int i9, int i10, boolean z10, uj0 uj0Var) {
        this.e = qnVar;
        this.b = i9;
        this.c = i10;
        this.d = z10;
        this.f = uj0Var;
    }

    public /* synthetic */ jj(org.telegram.ui.Components.qb qbVar, hg.r0 r0Var, boolean z10, int i9, int i10) {
        this.e = qbVar;
        this.f = r0Var;
        this.d = z10;
        this.b = i9;
        this.c = i10;
    }

    public /* synthetic */ jj(NotificationsSettingsActivity notificationsSettingsActivity, int i9, boolean z10, org.telegram.ui.Cells.j5 j5Var, int i10) {
        this.e = notificationsSettingsActivity;
        this.b = i9;
        this.d = z10;
        this.f = j5Var;
        this.c = i10;
    }
}
