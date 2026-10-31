package org.telegram.messenger;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class dx implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ dx(qz qzVar, TLRPC.Message message, int i10, int i11, boolean z10) {
        this.e = qzVar;
        this.f = message;
        this.b = i10;
        this.c = i11;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Document e;
        int i10 = this.a;
        int i11 = this.c;
        Object obj = this.f;
        boolean z10 = this.d;
        int i12 = this.b;
        Object obj2 = this.e;
        switch (i10) {
            case 0:
                qz qzVar = (qz) obj2;
                TLRPC.Message message = (TLRPC.Message) obj;
                qzVar.getMediaDataController().w0(message.dialog_id);
                qzVar.getNotificationCenter().k(21, Integer.valueOf(i12), Integer.valueOf(message.id), message, Long.valueOf(message.dialog_id), 0L, Integer.valueOf(i11), Boolean.valueOf(z10));
                qzVar.getNotificationCenter().k(22, Integer.valueOf(i12), Integer.valueOf(message.id), message, Long.valueOf(message.dialog_id), 0L, Integer.valueOf(i11), Boolean.valueOf(z10));
                qzVar.d0(i12);
                qzVar.i0(i12, z10);
                break;
            case 1:
                org.telegram.ui.un unVar = (org.telegram.ui.un) obj2;
                mj0 mj0Var = (mj0) obj;
                org.telegram.ui.ActionBar.k1 k1Var = unVar.e9;
                if (k1Var != null && unVar.fragmentView != null && !k1Var.isShowing()) {
                    Activity parentActivity = unVar.getParentActivity();
                    Typeface typeface = i0.a;
                    if (parentActivity != null && !parentActivity.isDestroyed() && !parentActivity.isFinishing()) {
                        unVar.e9.showAtLocation(unVar.z0, 51, i12, i11);
                        if (z10 && mj0Var != null) {
                            mj0Var.r(true);
                        }
                        i0.h3(new org.telegram.ui.mf(unVar, 25), 420L);
                        break;
                    }
                }
                break;
            case 2:
                org.telegram.ui.Components.gb gbVar = (org.telegram.ui.Components.gb) obj2;
                sg.o0 o0Var = (sg.o0) obj;
                org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                long j10 = o0Var.g;
                if (j10 == 0) {
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ui.b0(d20.s0).r.get(o0Var.f);
                    if (tL_availableReaction != null) {
                        e = tL_availableReaction.activate_animation;
                    }
                } else {
                    e = org.telegram.ui.Components.f5.e(d20.s0, j10);
                }
                if (e != null && Q != null) {
                    org.telegram.ui.Components.cc.a0(Q).y(gbVar.a.h, e, z10 ? new i2.u(i12, i11, Q, 9) : null).k(true);
                    break;
                }
                break;
            default:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj2;
                org.telegram.ui.Cells.l5 l5Var = (org.telegram.ui.Cells.l5) obj;
                if (i12 == 3) {
                    SharedPreferences.Editor edit = notificationsSettingsActivity.getNotificationsSettings().edit();
                    if (z10) {
                        edit.remove("EnableAllStories");
                    } else {
                        edit.putBoolean("EnableAllStories", true);
                    }
                    edit.apply();
                    notificationsSettingsActivity.getNotificationsController().b0(i12);
                } else if (i12 == 4 || i12 == 5) {
                    SharedPreferences.Editor edit2 = notificationsSettingsActivity.getNotificationsSettings().edit();
                    if (z10) {
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
                    notificationsSettingsActivity.getNotificationsController().U(i12, !z10 ? 0 : ConnectionsManager.DEFAULT_DATACENTER_ID);
                }
                l5Var.e.b(0, !z10, true);
                notificationsSettingsActivity.c.g(i11);
                break;
        }
    }

    public /* synthetic */ dx(org.telegram.ui.un unVar, int i10, int i11, boolean z10, mj0 mj0Var) {
        this.e = unVar;
        this.b = i10;
        this.c = i11;
        this.d = z10;
        this.f = mj0Var;
    }

    public /* synthetic */ dx(org.telegram.ui.Components.gb gbVar, sg.o0 o0Var, boolean z10, int i10, int i11) {
        this.e = gbVar;
        this.f = o0Var;
        this.d = z10;
        this.b = i10;
        this.c = i11;
    }

    public /* synthetic */ dx(NotificationsSettingsActivity notificationsSettingsActivity, int i10, boolean z10, org.telegram.ui.Cells.l5 l5Var, int i11) {
        this.e = notificationsSettingsActivity;
        this.b = i10;
        this.d = z10;
        this.f = l5Var;
        this.c = i11;
    }
}
