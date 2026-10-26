package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.un;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class bj implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ bj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11, boolean z10) {
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
                ((SendMessagesHelper) this.e).lambda$performSendMessageRequest$101((TLRPC.Message) this.f, this.b, this.c, this.d);
                break;
            case 1:
                un unVar = (un) this.e;
                fl0 fl0Var = (fl0) this.f;
                org.telegram.ui.ActionBar.o1 o1Var = unVar.c9;
                if (o1Var != null && unVar.fragmentView != null && !o1Var.isShowing() && AndroidUtilities.isActivityRunning(unVar.getParentActivity())) {
                    unVar.c9.showAtLocation(unVar.x0, 51, this.b, this.c);
                    if (this.d && fl0Var != null) {
                        fl0Var.r(true);
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.kf(unVar, 27), 420L);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.ac acVar = (org.telegram.ui.Components.ac) this.e;
                bh.x0 x0Var = (bh.x0) this.f;
                org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
                long j10 = x0Var.g;
                if (j10 == 0) {
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(x0Var.f);
                    if (tL_availableReaction != null) {
                        f7 = tL_availableReaction.activate_animation;
                    }
                } else {
                    f7 = org.telegram.ui.Components.t5.f(UserConfig.selectedAccount, j10);
                }
                if (f7 != null && R != null) {
                    org.telegram.ui.Components.wc.b0(R).y(acVar.a.h, f7, this.d ? new i2.v(this.b, this.c, R, 7) : null).k(true);
                    break;
                }
                break;
            default:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.e;
                org.telegram.ui.Cells.n5 n5Var = (org.telegram.ui.Cells.n5) this.f;
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
                n5Var.e.b(0, !z10, true);
                notificationsSettingsActivity.c.m(this.c);
                break;
        }
    }

    public /* synthetic */ bj(un unVar, int i10, int i11, boolean z10, fl0 fl0Var) {
        this.e = unVar;
        this.b = i10;
        this.c = i11;
        this.d = z10;
        this.f = fl0Var;
    }

    public /* synthetic */ bj(org.telegram.ui.Components.ac acVar, bh.x0 x0Var, boolean z10, int i10, int i11) {
        this.e = acVar;
        this.f = x0Var;
        this.d = z10;
        this.b = i10;
        this.c = i11;
    }

    public /* synthetic */ bj(NotificationsSettingsActivity notificationsSettingsActivity, int i10, boolean z10, org.telegram.ui.Cells.n5 n5Var, int i11) {
        this.e = notificationsSettingsActivity;
        this.b = i10;
        this.d = z10;
        this.f = n5Var;
        this.c = i11;
    }
}
