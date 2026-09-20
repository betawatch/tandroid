package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final /* synthetic */ class rj implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ rj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11, boolean z10) {
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
                zn znVar = (zn) this.e;
                pk0 pk0Var = (pk0) this.f;
                org.telegram.ui.ActionBar.n1 n1Var = znVar.Q8;
                if (n1Var != null && znVar.fragmentView != null && !n1Var.isShowing() && AndroidUtilities.isActivityRunning(znVar.getParentActivity())) {
                    znVar.Q8.showAtLocation(znVar.x0, 51, this.b, this.c);
                    if (this.d && pk0Var != null) {
                        pk0Var.r(true);
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.rf(znVar, 26), 420L);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.zb zbVar = (org.telegram.ui.Components.zb) this.e;
                zg.o0 o0Var = (zg.o0) this.f;
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                long j3 = o0Var.g;
                if (j3 == 0) {
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(o0Var.f);
                    if (tL_availableReaction != null) {
                        f7 = tL_availableReaction.activate_animation;
                    }
                } else {
                    f7 = org.telegram.ui.Components.p5.f(UserConfig.selectedAccount, j3);
                }
                if (f7 != null && R != null) {
                    org.telegram.ui.Components.xc.a0(R).y(zbVar.a.h, f7, this.d ? new gg.n(this.b, this.c, R, 7) : null).k(true);
                    break;
                }
                break;
            default:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.e;
                org.telegram.ui.Cells.k5 k5Var = (org.telegram.ui.Cells.k5) this.f;
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
                k5Var.e.b(0, !z10, true);
                notificationsSettingsActivity.c.m(this.c);
                break;
        }
    }

    public /* synthetic */ rj(zn znVar, int i10, int i11, boolean z10, pk0 pk0Var) {
        this.e = znVar;
        this.b = i10;
        this.c = i11;
        this.d = z10;
        this.f = pk0Var;
    }

    public /* synthetic */ rj(org.telegram.ui.Components.zb zbVar, zg.o0 o0Var, boolean z10, int i10, int i11) {
        this.e = zbVar;
        this.f = o0Var;
        this.d = z10;
        this.b = i10;
        this.c = i11;
    }

    public /* synthetic */ rj(NotificationsSettingsActivity notificationsSettingsActivity, int i10, boolean z10, org.telegram.ui.Cells.k5 k5Var, int i11) {
        this.e = notificationsSettingsActivity;
        this.b = i10;
        this.d = z10;
        this.f = k5Var;
        this.c = i11;
    }
}
