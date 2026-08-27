package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class nj implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ nj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11, boolean z10) {
        this.e = sendMessagesHelper;
        this.f = message;
        this.b = i10;
        this.c = i11;
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
                rn rnVar = (rn) this.e;
                wj0 wj0Var = (wj0) this.f;
                org.telegram.ui.ActionBar.n1 n1Var = rnVar.M8;
                if (n1Var != null && rnVar.fragmentView != null && !n1Var.isShowing() && AndroidUtilities.isActivityRunning(rnVar.getParentActivity())) {
                    rnVar.M8.showAtLocation(rnVar.t0, 51, this.b, this.c);
                    if (this.d && wj0Var != null) {
                        wj0Var.r(true);
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.gf(rnVar, 25), 420L);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.ob obVar = (org.telegram.ui.Components.ob) this.e;
                ig.q0 q0Var = (ig.q0) this.f;
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                long j10 = q0Var.g;
                if (j10 == 0) {
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(q0Var.f);
                    if (tL_availableReaction != null) {
                        f10 = tL_availableReaction.activate_animation;
                    }
                } else {
                    f10 = org.telegram.ui.Components.k5.f(UserConfig.selectedAccount, j10);
                }
                if (f10 != null && R != null) {
                    org.telegram.ui.Components.mc.a0(R).y(obVar.a.h, f10, this.d ? new h3.z(this.b, this.c, R, 6) : null).k(true);
                    break;
                }
                break;
            default:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.e;
                org.telegram.ui.Cells.g5 g5Var = (org.telegram.ui.Cells.g5) this.f;
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
                g5Var.e.b(0, !z10, true);
                notificationsSettingsActivity.c.m(this.c);
                break;
        }
    }

    public /* synthetic */ nj(rn rnVar, int i10, int i11, boolean z10, wj0 wj0Var) {
        this.e = rnVar;
        this.b = i10;
        this.c = i11;
        this.d = z10;
        this.f = wj0Var;
    }

    public /* synthetic */ nj(org.telegram.ui.Components.ob obVar, ig.q0 q0Var, boolean z10, int i10, int i11) {
        this.e = obVar;
        this.f = q0Var;
        this.d = z10;
        this.b = i10;
        this.c = i11;
    }

    public /* synthetic */ nj(NotificationsSettingsActivity notificationsSettingsActivity, int i10, boolean z10, org.telegram.ui.Cells.g5 g5Var, int i11) {
        this.e = notificationsSettingsActivity;
        this.b = i10;
        this.d = z10;
        this.f = g5Var;
        this.c = i11;
    }
}
