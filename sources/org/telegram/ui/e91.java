package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class e91 implements org.telegram.ui.Components.xn {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ w91 b;

    public e91(w91 w91Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = w91Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.Components.xn
    public final void L() {
        int i7;
        w91 w91Var = this.b;
        i7 = ((org.telegram.ui.ActionBar.f2) w91Var).currentAccount;
        SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(i7).d7;
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = w91Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        sb2.append(org.telegram.messenger.dt.v(-j3, tL_forumTopic.id, false));
        boolean z9 = sharedPreferences.getBoolean(sb2.toString(), true);
        boolean z10 = !z9;
        sharedPreferences.edit().putBoolean("sound_enabled_" + org.telegram.messenger.dt.v(-j3, tL_forumTopic.id, false), z10).apply();
        w91Var.finishPreviewFragment();
        if (org.telegram.ui.Components.hc.a(w91Var)) {
            org.telegram.ui.Components.hc.S(z9 ? 1 : 0, w91Var, w91Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.xn
    public final void R(int i7) {
        w91 w91Var = this.b;
        long j3 = w91Var.a;
        w91Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        if (i7 != 0) {
            w91Var.getNotificationsController().H(-j3, i7, tL_forumTopic.id);
            if (org.telegram.ui.Components.hc.a(w91Var)) {
                org.telegram.ui.Components.hc.z(w91Var, 5, i7, w91Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (w91Var.getMessagesController().r2(-j3, tL_forumTopic.id, null)) {
            w91Var.getNotificationsController().G(-j3, tL_forumTopic.id, false);
        }
        if (org.telegram.ui.Components.hc.a(w91Var)) {
            org.telegram.ui.Components.hc.z(w91Var, 4, i7, w91Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.xn
    public final void dismiss() {
        this.b.finishPreviewFragment();
    }

    @Override // org.telegram.ui.Components.xn
    public final void p() {
        w91 w91Var = this.b;
        w91Var.finishPreviewFragment();
        org.telegram.messenger.qp messagesController = w91Var.getMessagesController();
        long j3 = w91Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        boolean r22 = messagesController.r2(-j3, tL_forumTopic.id, null);
        w91Var.getNotificationsController().G(-j3, tL_forumTopic.id, !r22);
        if (org.telegram.ui.Components.hc.a(w91Var)) {
            org.telegram.ui.Components.hc.z(w91Var, !r22 ? 3 : 4, !r22 ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, w91Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.xn
    public final void y() {
        this.b.finishPreviewFragment();
        org.telegram.messenger.g0.i3(new by0(19, this, this.a), 500L);
    }

    @Override // org.telegram.ui.Components.xn
    public final /* synthetic */ void n() {
    }
}
