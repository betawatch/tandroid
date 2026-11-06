package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class d91 implements org.telegram.ui.Components.xn {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ v91 b;

    public d91(v91 v91Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = v91Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.Components.xn
    public final void L() {
        int i7;
        v91 v91Var = this.b;
        i7 = ((org.telegram.ui.ActionBar.f2) v91Var).currentAccount;
        SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(i7).d7;
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = v91Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        sb2.append(org.telegram.messenger.dt.v(-j3, tL_forumTopic.id, false));
        boolean z9 = sharedPreferences.getBoolean(sb2.toString(), true);
        boolean z10 = !z9;
        sharedPreferences.edit().putBoolean("sound_enabled_" + org.telegram.messenger.dt.v(-j3, tL_forumTopic.id, false), z10).apply();
        v91Var.finishPreviewFragment();
        if (org.telegram.ui.Components.hc.a(v91Var)) {
            org.telegram.ui.Components.hc.S(z9 ? 1 : 0, v91Var, v91Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.xn
    public final void R(int i7) {
        v91 v91Var = this.b;
        long j3 = v91Var.a;
        v91Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        if (i7 != 0) {
            v91Var.getNotificationsController().H(-j3, i7, tL_forumTopic.id);
            if (org.telegram.ui.Components.hc.a(v91Var)) {
                org.telegram.ui.Components.hc.z(v91Var, 5, i7, v91Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (v91Var.getMessagesController().r2(-j3, tL_forumTopic.id, null)) {
            v91Var.getNotificationsController().G(-j3, tL_forumTopic.id, false);
        }
        if (org.telegram.ui.Components.hc.a(v91Var)) {
            org.telegram.ui.Components.hc.z(v91Var, 4, i7, v91Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.xn
    public final void dismiss() {
        this.b.finishPreviewFragment();
    }

    @Override // org.telegram.ui.Components.xn
    public final void p() {
        v91 v91Var = this.b;
        v91Var.finishPreviewFragment();
        org.telegram.messenger.qp messagesController = v91Var.getMessagesController();
        long j3 = v91Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        boolean r22 = messagesController.r2(-j3, tL_forumTopic.id, null);
        v91Var.getNotificationsController().G(-j3, tL_forumTopic.id, !r22);
        if (org.telegram.ui.Components.hc.a(v91Var)) {
            org.telegram.ui.Components.hc.z(v91Var, !r22 ? 3 : 4, !r22 ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, v91Var.getResourceProvider()).j();
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
