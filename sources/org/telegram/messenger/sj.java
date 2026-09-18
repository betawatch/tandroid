package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.bo;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final /* synthetic */ class sj implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ sj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11, boolean z10) {
        this.e = sendMessagesHelper;
        this.f = message;
        this.b = i10;
        this.c = i11;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Document f7;
        switch (this.a) {
            case 0:
                ((SendMessagesHelper) this.e).lambda$performSendMessageRequest$98((TLRPC.Message) this.f, this.b, this.c, this.d);
                break;
            case 1:
                bo boVar = (bo) this.e;
                gk0 gk0Var = (gk0) this.f;
                org.telegram.ui.ActionBar.o1 o1Var = boVar.Q8;
                if (o1Var != null && boVar.fragmentView != null && !o1Var.isShowing() && AndroidUtilities.isActivityRunning(boVar.getParentActivity())) {
                    boVar.Q8.showAtLocation(boVar.x0, 51, this.b, this.c);
                    if (this.d && gk0Var != null) {
                        gk0Var.r(true);
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.sf(boVar, 25), 420L);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.yb ybVar = (org.telegram.ui.Components.yb) this.e;
                zg.p0 p0Var = (zg.p0) this.f;
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                long j3 = p0Var.g;
                if (j3 == 0) {
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(p0Var.f);
                    if (tL_availableReaction != null) {
                        f7 = tL_availableReaction.activate_animation;
                    }
                } else {
                    f7 = org.telegram.ui.Components.o5.f(UserConfig.selectedAccount, j3);
                }
                if (f7 != null && R != null) {
                    org.telegram.ui.Components.vc.a0(R).y(ybVar.a.h, f7, this.d ? new gg.n(this.b, this.c, R, 7) : null).k(true);
                    break;
                }
                break;
            default:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.e;
                org.telegram.ui.Cells.i5 i5Var = (org.telegram.ui.Cells.i5) this.f;
                int i10 = this.b;
                boolean z10 = this.d;
                if (i10 == 3) {
                    SharedPreferences.Editor edit = notificationsSettingsActivity.getNotificationsSettings().edit();
                    if (z10) {
                        edit.remove("EnableAllStories");
                    } else {
                        edit.putBoolean("EnableAllStories", true);
                    }
                    edit.apply();
                    notificationsSettingsActivity.getNotificationsController().updateServerNotificationsSettings(i10);
                } else if (i10 == 4 || i10 == 5) {
                    SharedPreferences.Editor edit2 = notificationsSettingsActivity.getNotificationsSettings().edit();
                    if (z10) {
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
                    notificationsSettingsActivity.getNotificationsController().setGlobalNotificationsEnabled(i10, !z10 ? 0 : ConnectionsManager.DEFAULT_DATACENTER_ID);
                }
                i5Var.e.b(0, !z10, true);
                notificationsSettingsActivity.c.m(this.c);
                break;
        }
    }

    public /* synthetic */ sj(bo boVar, int i10, int i11, boolean z10, gk0 gk0Var) {
        this.e = boVar;
        this.b = i10;
        this.c = i11;
        this.d = z10;
        this.f = gk0Var;
    }

    public /* synthetic */ sj(org.telegram.ui.Components.yb ybVar, zg.p0 p0Var, boolean z10, int i10, int i11) {
        this.e = ybVar;
        this.f = p0Var;
        this.d = z10;
        this.b = i10;
        this.c = i11;
    }

    public /* synthetic */ sj(NotificationsSettingsActivity notificationsSettingsActivity, int i10, boolean z10, org.telegram.ui.Cells.i5 i5Var, int i11) {
        this.e = notificationsSettingsActivity;
        this.b = i10;
        this.d = z10;
        this.f = i5Var;
        this.c = i11;
    }
}
