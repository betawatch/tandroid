package org.telegram.messenger;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.li0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class kw implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ kw(yy yyVar, TLRPC.Message message, int i3, int i10, boolean z10) {
        this.e = yyVar;
        this.f = message;
        this.b = i3;
        this.c = i10;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Document e10;
        int i3 = this.a;
        int i10 = this.c;
        Object obj = this.f;
        boolean z10 = this.d;
        int i11 = this.b;
        Object obj2 = this.e;
        switch (i3) {
            case 0:
                yy yyVar = (yy) obj2;
                TLRPC.Message message = (TLRPC.Message) obj;
                yyVar.getMediaDataController().w0(message.dialog_id);
                yyVar.getNotificationCenter().k(21, Integer.valueOf(i11), Integer.valueOf(message.id), message, Long.valueOf(message.dialog_id), 0L, Integer.valueOf(i10), Boolean.valueOf(z10));
                yyVar.getNotificationCenter().k(22, Integer.valueOf(i11), Integer.valueOf(message.id), message, Long.valueOf(message.dialog_id), 0L, Integer.valueOf(i10), Boolean.valueOf(z10));
                yyVar.d0(i11);
                yyVar.i0(i11, z10);
                break;
            case 1:
                org.telegram.ui.wm wmVar = (org.telegram.ui.wm) obj2;
                li0 li0Var = (li0) obj;
                org.telegram.ui.ActionBar.f1 f1Var = wmVar.f9;
                if (f1Var != null && wmVar.fragmentView != null && !f1Var.isShowing()) {
                    Activity parentActivity = wmVar.getParentActivity();
                    Typeface typeface = g0.a;
                    if (parentActivity != null && !parentActivity.isDestroyed() && !parentActivity.isFinishing()) {
                        wmVar.f9.showAtLocation(wmVar.A0, 51, i11, i10);
                        if (z10 && li0Var != null) {
                            li0Var.r(true);
                        }
                        g0.i3(new org.telegram.ui.xe(wmVar, 27), 420L);
                        break;
                    }
                }
                break;
            case 2:
                org.telegram.ui.Components.kb kbVar = (org.telegram.ui.Components.kb) obj2;
                dh.n0 n0Var = (dh.n0) obj;
                org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                long j10 = n0Var.g;
                if (j10 == 0) {
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) li.b0(h10.t0).r.get(n0Var.f);
                    if (tL_availableReaction != null) {
                        e10 = tL_availableReaction.activate_animation;
                    }
                } else {
                    e10 = org.telegram.ui.Components.g5.e(h10.t0, j10);
                }
                if (e10 != null && Q != null) {
                    org.telegram.ui.Components.fc.a0(Q).y(kbVar.a.h, e10, z10 ? new k2.u(i11, i10, Q, 10) : null).k(true);
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

    public /* synthetic */ kw(org.telegram.ui.wm wmVar, int i3, int i10, boolean z10, li0 li0Var) {
        this.e = wmVar;
        this.b = i3;
        this.c = i10;
        this.d = z10;
        this.f = li0Var;
    }

    public /* synthetic */ kw(org.telegram.ui.Components.kb kbVar, dh.n0 n0Var, boolean z10, int i3, int i10) {
        this.e = kbVar;
        this.f = n0Var;
        this.d = z10;
        this.b = i3;
        this.c = i10;
    }

    public /* synthetic */ kw(NotificationsSettingsActivity notificationsSettingsActivity, int i3, boolean z10, org.telegram.ui.Cells.h5 h5Var, int i10) {
        this.e = notificationsSettingsActivity;
        this.b = i3;
        this.d = z10;
        this.f = h5Var;
        this.c = i10;
    }
}
