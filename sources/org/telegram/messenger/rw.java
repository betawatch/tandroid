package org.telegram.messenger;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ji0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final /* synthetic */ class rw implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ rw(gz gzVar, TLRPC.Message message, int i7, int i10, boolean z9) {
        this.e = gzVar;
        this.f = message;
        this.b = i7;
        this.c = i10;
        this.d = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Document e10;
        int i7 = this.a;
        int i10 = 2;
        int i11 = this.c;
        Object obj = this.f;
        boolean z9 = this.d;
        int i12 = this.b;
        Object obj2 = this.e;
        switch (i7) {
            case 0:
                gz gzVar = (gz) obj2;
                TLRPC.Message message = (TLRPC.Message) obj;
                gzVar.getMediaDataController().w0(message.dialog_id);
                gzVar.getNotificationCenter().k(21, Integer.valueOf(i12), Integer.valueOf(message.id), message, Long.valueOf(message.dialog_id), 0L, Integer.valueOf(i11), Boolean.valueOf(z9));
                gzVar.getNotificationCenter().k(22, Integer.valueOf(i12), Integer.valueOf(message.id), message, Long.valueOf(message.dialog_id), 0L, Integer.valueOf(i11), Boolean.valueOf(z9));
                gzVar.d0(i12);
                gzVar.i0(i12, z9);
                break;
            case 1:
                org.telegram.ui.cn cnVar = (org.telegram.ui.cn) obj2;
                ji0 ji0Var = (ji0) obj;
                org.telegram.ui.ActionBar.g1 g1Var = cnVar.e9;
                if (g1Var != null && cnVar.fragmentView != null && !g1Var.isShowing()) {
                    Activity parentActivity = cnVar.getParentActivity();
                    Typeface typeface = g0.a;
                    if (parentActivity != null && !parentActivity.isDestroyed() && !parentActivity.isFinishing()) {
                        cnVar.e9.showAtLocation(cnVar.z0, 51, i12, i11);
                        cnVar.ha(cnVar.e9);
                        if (z9 && ji0Var != null) {
                            ji0Var.r(true);
                        }
                        g0.i3(new org.telegram.ui.xf(cnVar, i10), 420L);
                        break;
                    }
                }
                break;
            case 2:
                org.telegram.ui.Components.mb mbVar = (org.telegram.ui.Components.mb) obj2;
                ch.o0 o0Var = (ch.o0) obj;
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                long j3 = o0Var.g;
                if (j3 == 0) {
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ui.b0(p10.s0).r.get(o0Var.f);
                    if (tL_availableReaction != null) {
                        e10 = tL_availableReaction.activate_animation;
                    }
                } else {
                    e10 = org.telegram.ui.Components.i5.e(p10.s0, j3);
                }
                if (e10 != null && Q != null) {
                    org.telegram.ui.Components.hc.a0(Q).y(mbVar.a.h, e10, z9 ? new jg.r(i12, i11, Q, 10) : null).k(true);
                    break;
                }
                break;
            default:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj2;
                org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) obj;
                if (i12 == 3) {
                    SharedPreferences.Editor edit = notificationsSettingsActivity.getNotificationsSettings().edit();
                    if (z9) {
                        edit.remove("EnableAllStories");
                    } else {
                        edit.putBoolean("EnableAllStories", true);
                    }
                    edit.apply();
                    notificationsSettingsActivity.getNotificationsController().b0(i12);
                } else if (i12 == 4 || i12 == 5) {
                    SharedPreferences.Editor edit2 = notificationsSettingsActivity.getNotificationsSettings().edit();
                    if (z9) {
                        edit2.putBoolean("EnableReactionsMessages", false);
                        edit2.putBoolean("EnableReactionsStories", false);
                    } else {
                        edit2.putBoolean("EnableReactionsMessages", true);
                        edit2.putBoolean("EnableReactionsStories", true);
                    }
                    edit2.apply();
                    notificationsSettingsActivity.getNotificationsController().b0(i12);
                    notificationsSettingsActivity.getNotificationsController().m(i12);
                } else {
                    notificationsSettingsActivity.getNotificationsController().U(i12, !z9 ? 0 : ConnectionsManager.DEFAULT_DATACENTER_ID);
                }
                h5Var.e.b(0, !z9, true);
                notificationsSettingsActivity.c.g(i11);
                break;
        }
    }

    public /* synthetic */ rw(org.telegram.ui.cn cnVar, int i7, int i10, boolean z9, ji0 ji0Var) {
        this.e = cnVar;
        this.b = i7;
        this.c = i10;
        this.d = z9;
        this.f = ji0Var;
    }

    public /* synthetic */ rw(org.telegram.ui.Components.mb mbVar, ch.o0 o0Var, boolean z9, int i7, int i10) {
        this.e = mbVar;
        this.f = o0Var;
        this.d = z9;
        this.b = i7;
        this.c = i10;
    }

    public /* synthetic */ rw(NotificationsSettingsActivity notificationsSettingsActivity, int i7, boolean z9, org.telegram.ui.Cells.h5 h5Var, int i10) {
        this.e = notificationsSettingsActivity;
        this.b = i7;
        this.d = z9;
        this.f = h5Var;
        this.c = i10;
    }
}
