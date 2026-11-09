package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class f91 implements org.telegram.ui.Components.xn {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ y91 b;

    public f91(y91 y91Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = y91Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.Components.xn
    public final void L() {
        int i7;
        y91 y91Var = this.b;
        i7 = ((org.telegram.ui.ActionBar.f2) y91Var).currentAccount;
        SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(i7).d7;
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = y91Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        sb2.append(org.telegram.messenger.dt.v(-j3, tL_forumTopic.id, false));
        boolean z9 = sharedPreferences.getBoolean(sb2.toString(), true);
        boolean z10 = !z9;
        sharedPreferences.edit().putBoolean("sound_enabled_" + org.telegram.messenger.dt.v(-j3, tL_forumTopic.id, false), z10).apply();
        y91Var.finishPreviewFragment();
        if (org.telegram.ui.Components.hc.a(y91Var)) {
            org.telegram.ui.Components.hc.S(z9 ? 1 : 0, y91Var, y91Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.xn
    public final void R(int i7) {
        y91 y91Var = this.b;
        long j3 = y91Var.a;
        y91Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        if (i7 != 0) {
            y91Var.getNotificationsController().H(-j3, i7, tL_forumTopic.id);
            if (org.telegram.ui.Components.hc.a(y91Var)) {
                org.telegram.ui.Components.hc.z(y91Var, 5, i7, y91Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (y91Var.getMessagesController().r2(-j3, tL_forumTopic.id, null)) {
            y91Var.getNotificationsController().G(-j3, tL_forumTopic.id, false);
        }
        if (org.telegram.ui.Components.hc.a(y91Var)) {
            org.telegram.ui.Components.hc.z(y91Var, 4, i7, y91Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.xn
    public final void dismiss() {
        this.b.finishPreviewFragment();
    }

    @Override // org.telegram.ui.Components.xn
    public final void p() {
        y91 y91Var = this.b;
        y91Var.finishPreviewFragment();
        org.telegram.messenger.qp messagesController = y91Var.getMessagesController();
        long j3 = y91Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        boolean r22 = messagesController.r2(-j3, tL_forumTopic.id, null);
        y91Var.getNotificationsController().G(-j3, tL_forumTopic.id, !r22);
        if (org.telegram.ui.Components.hc.a(y91Var)) {
            org.telegram.ui.Components.hc.z(y91Var, !r22 ? 3 : 4, !r22 ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, y91Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.xn
    public final void y() {
        this.b.finishPreviewFragment();
        org.telegram.messenger.g0.i3(new ax0(20, this, this.a), 500L);
    }

    @Override // org.telegram.ui.Components.xn
    public final /* synthetic */ void n() {
    }
}
