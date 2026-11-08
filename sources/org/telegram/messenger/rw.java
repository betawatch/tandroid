package org.telegram.messenger;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
        int i10 = this.c;
        Object obj = this.f;
        boolean z9 = this.d;
        int i11 = this.b;
        Object obj2 = this.e;
        switch (i7) {
            case 0:
                gz gzVar = (gz) obj2;
                TLRPC.Message message = (TLRPC.Message) obj;
                gzVar.getMediaDataController().w0(message.dialog_id);
                gzVar.getNotificationCenter().k(21, Integer.valueOf(i11), Integer.valueOf(message.id), message, Long.valueOf(message.dialog_id), 0L, Integer.valueOf(i10), Boolean.valueOf(z9));
                gzVar.getNotificationCenter().k(22, Integer.valueOf(i11), Integer.valueOf(message.id), message, Long.valueOf(message.dialog_id), 0L, Integer.valueOf(i10), Boolean.valueOf(z9));
                gzVar.d0(i11);
                gzVar.i0(i11, z9);
                break;
            case 1:
                org.telegram.ui.an anVar = (org.telegram.ui.an) obj2;
                ii0 ii0Var = (ii0) obj;
                org.telegram.ui.ActionBar.g1 g1Var = anVar.e9;
                if (g1Var != null && anVar.fragmentView != null && !g1Var.isShowing()) {
                    Activity parentActivity = anVar.getParentActivity();
                    Typeface typeface = g0.a;
                    if (parentActivity != null && !parentActivity.isDestroyed() && !parentActivity.isFinishing()) {
                        anVar.e9.showAtLocation(anVar.z0, 51, i11, i10);
                        if (z9 && ii0Var != null) {
                            ii0Var.r(true);
                        }
                        g0.i3(new org.telegram.ui.af(anVar, 27), 420L);
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
                    org.telegram.ui.Components.hc.a0(Q).y(mbVar.a.h, e10, z9 ? new jg.r(i11, i10, Q, 10) : null).k(true);
                    break;
                }
                break;
            default:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj2;
                org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) obj;
                if (i11 == 3) {
                    SharedPreferences.Editor edit = notificationsSettingsActivity.getNotificationsSettings().edit();
                    if (z9) {
                        edit.remove("EnableAllStories");
                    } else {
                        edit.putBoolean("EnableAllStories", true);
                    }
                    edit.apply();
                    notificationsSettingsActivity.getNotificationsController().b0(i11);
                } else if (i11 == 4 || i11 == 5) {
                    SharedPreferences.Editor edit2 = notificationsSettingsActivity.getNotificationsSettings().edit();
                    if (z9) {
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
                    notificationsSettingsActivity.getNotificationsController().U(i11, !z9 ? 0 : ConnectionsManager.DEFAULT_DATACENTER_ID);
                }
                h5Var.e.b(0, !z9, true);
                notificationsSettingsActivity.c.g(i10);
                break;
        }
    }

    public /* synthetic */ rw(org.telegram.ui.an anVar, int i7, int i10, boolean z9, ii0 ii0Var) {
        this.e = anVar;
        this.b = i7;
        this.c = i10;
        this.d = z9;
        this.f = ii0Var;
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
