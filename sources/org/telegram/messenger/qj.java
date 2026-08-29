package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class qj implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ qj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11, boolean z10) {
        this.e = sendMessagesHelper;
        this.f = message;
        this.b = i10;
        this.c = i11;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Document f9;
        switch (this.a) {
            case 0:
                ((SendMessagesHelper) this.e).lambda$performSendMessageRequest$98((TLRPC.Message) this.f, this.b, this.c, this.d);
                break;
            case 1:
                tn tnVar = (tn) this.e;
                fk0 fk0Var = (fk0) this.f;
                org.telegram.ui.ActionBar.o1 o1Var = tnVar.M8;
                if (o1Var != null && tnVar.fragmentView != null && !o1Var.isShowing() && AndroidUtilities.isActivityRunning(tnVar.getParentActivity())) {
                    tnVar.M8.showAtLocation(tnVar.t0, 51, this.b, this.c);
                    if (this.d && fk0Var != null) {
                        fk0Var.r(true);
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.df(tnVar, 25), 420L);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.wb wbVar = (org.telegram.ui.Components.wb) this.e;
                kg.q0 q0Var = (kg.q0) this.f;
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                long j10 = q0Var.g;
                if (j10 == 0) {
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(q0Var.f);
                    if (tL_availableReaction != null) {
                        f9 = tL_availableReaction.activate_animation;
                    }
                } else {
                    f9 = org.telegram.ui.Components.p5.f(UserConfig.selectedAccount, j10);
                }
                if (f9 != null && R != null) {
                    org.telegram.ui.Components.tc.a0(R).y(wbVar.a.h, f9, this.d ? new j3.y(this.b, this.c, R, 6) : null).k(true);
                    break;
                }
                break;
            default:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.e;
                org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) this.f;
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
                h5Var.e.b(0, !z10, true);
                notificationsSettingsActivity.c.m(this.c);
                break;
        }
    }

    public /* synthetic */ qj(tn tnVar, int i10, int i11, boolean z10, fk0 fk0Var) {
        this.e = tnVar;
        this.b = i10;
        this.c = i11;
        this.d = z10;
        this.f = fk0Var;
    }

    public /* synthetic */ qj(org.telegram.ui.Components.wb wbVar, kg.q0 q0Var, boolean z10, int i10, int i11) {
        this.e = wbVar;
        this.f = q0Var;
        this.d = z10;
        this.b = i10;
        this.c = i11;
    }

    public /* synthetic */ qj(NotificationsSettingsActivity notificationsSettingsActivity, int i10, boolean z10, org.telegram.ui.Cells.h5 h5Var, int i11) {
        this.e = notificationsSettingsActivity;
        this.b = i10;
        this.d = z10;
        this.f = h5Var;
        this.c = i11;
    }
}
