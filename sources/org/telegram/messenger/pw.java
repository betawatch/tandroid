package org.telegram.messenger;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class pw implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ pw(ez ezVar, TLRPC.Message message, int i7, int i10, boolean z10) {
        this.e = ezVar;
        this.f = message;
        this.b = i7;
        this.c = i10;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Document e10;
        int i7 = this.a;
        int i10 = this.c;
        Object obj = this.f;
        boolean z10 = this.d;
        int i11 = this.b;
        Object obj2 = this.e;
        int i12 = 1;
        switch (i7) {
            case 0:
                ez ezVar = (ez) obj2;
                TLRPC.Message message = (TLRPC.Message) obj;
                ezVar.getMediaDataController().w0(message.dialog_id);
                ezVar.getNotificationCenter().k(21, Integer.valueOf(i11), Integer.valueOf(message.id), message, Long.valueOf(message.dialog_id), 0L, Integer.valueOf(i10), Boolean.valueOf(z10));
                ezVar.getNotificationCenter().k(22, Integer.valueOf(i11), Integer.valueOf(message.id), message, Long.valueOf(message.dialog_id), 0L, Integer.valueOf(i10), Boolean.valueOf(z10));
                ezVar.d0(i11);
                ezVar.i0(i11, z10);
                break;
            case 1:
                org.telegram.ui.an anVar = (org.telegram.ui.an) obj2;
                mi0 mi0Var = (mi0) obj;
                org.telegram.ui.ActionBar.g1 g1Var = anVar.f9;
                if (g1Var != null && anVar.fragmentView != null && !g1Var.isShowing()) {
                    Activity parentActivity = anVar.getParentActivity();
                    Typeface typeface = g0.a;
                    if (parentActivity != null && !parentActivity.isDestroyed() && !parentActivity.isFinishing()) {
                        anVar.f9.showAtLocation(anVar.A0, 51, i11, i10);
                        anVar.ia(anVar.f9);
                        if (z10 && mi0Var != null) {
                            mi0Var.r(true);
                        }
                        g0.i3(new org.telegram.ui.uf(anVar, i12), 420L);
                        break;
                    }
                }
                break;
            case 2:
                org.telegram.ui.Components.hb hbVar = (org.telegram.ui.Components.hb) obj2;
                ch.p0 p0Var = (ch.p0) obj;
                org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                long j3 = p0Var.g;
                if (j3 == 0) {
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) si.b0(m10.t0).r.get(p0Var.f);
                    if (tL_availableReaction != null) {
                        e10 = tL_availableReaction.activate_animation;
                    }
                } else {
                    e10 = org.telegram.ui.Components.g5.e(m10.t0, j3);
                }
                if (e10 != null && Q != null) {
                    org.telegram.ui.Components.cc.a0(Q).y(hbVar.a.h, e10, z10 ? new jg.q(i11, i10, Q, 10) : null).k(true);
                    break;
                }
                break;
            default:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj2;
                org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) obj;
                if (i11 == 3) {
                    SharedPreferences.Editor edit = notificationsSettingsActivity.getNotificationsSettings().edit();
                    if (z10) {
                        edit.remove("EnableAllStories");
                    } else {
                        edit.putBoolean("EnableAllStories", true);
                    }
                    edit.apply();
                    notificationsSettingsActivity.getNotificationsController().b0(i11);
                } else if (i11 == 4 || i11 == 5) {
                    SharedPreferences.Editor edit2 = notificationsSettingsActivity.getNotificationsSettings().edit();
                    if (z10) {
                        edit2.putBoolean("EnableReactionsMessages", false);
                        edit2.putBoolean("EnableReactionsStories", false);
                    } else {
                        edit2.putBoolean("EnableReactionsMessages", true);
                        edit2.putBoolean("EnableReactionsStories", true);
                    }
                    edit2.apply();
                    notificationsSettingsActivity.getNotificationsController().b0(i11);
                    notificationsSettingsActivity.getNotificationsController().m(i11);
                } else {
                    notificationsSettingsActivity.getNotificationsController().U(i11, !z10 ? 0 : ConnectionsManager.DEFAULT_DATACENTER_ID);
                }
                h5Var.e.b(0, !z10, true);
                notificationsSettingsActivity.c.g(i10);
                break;
        }
    }

    public /* synthetic */ pw(org.telegram.ui.an anVar, int i7, int i10, boolean z10, mi0 mi0Var) {
        this.e = anVar;
        this.b = i7;
        this.c = i10;
        this.d = z10;
        this.f = mi0Var;
    }

    public /* synthetic */ pw(org.telegram.ui.Components.hb hbVar, ch.p0 p0Var, boolean z10, int i7, int i10) {
        this.e = hbVar;
        this.f = p0Var;
        this.d = z10;
        this.b = i7;
        this.c = i10;
    }

    public /* synthetic */ pw(NotificationsSettingsActivity notificationsSettingsActivity, int i7, boolean z10, org.telegram.ui.Cells.h5 h5Var, int i10) {
        this.e = notificationsSettingsActivity;
        this.b = i7;
        this.d = z10;
        this.f = h5Var;
        this.c = i10;
    }
}
