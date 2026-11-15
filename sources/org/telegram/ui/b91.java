package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class b91 implements org.telegram.ui.Components.ho {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ u91 b;

    public b91(u91 u91Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = u91Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.Components.ho
    public final void F() {
        this.b.finishPreviewFragment();
        org.telegram.messenger.g0.i3(new fy0(16, this, this.a), 500L);
    }

    @Override // org.telegram.ui.Components.ho
    public final void J() {
        int i7;
        u91 u91Var = this.b;
        i7 = ((org.telegram.ui.ActionBar.e2) u91Var).currentAccount;
        SharedPreferences sharedPreferences = org.telegram.messenger.np.s1(i7).e7;
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = u91Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        sb2.append(org.telegram.messenger.at.v(-j3, tL_forumTopic.id, false));
        boolean z10 = sharedPreferences.getBoolean(sb2.toString(), true);
        boolean z11 = !z10;
        sharedPreferences.edit().putBoolean("sound_enabled_" + org.telegram.messenger.at.v(-j3, tL_forumTopic.id, false), z11).apply();
        u91Var.finishPreviewFragment();
        if (org.telegram.ui.Components.cc.a(u91Var)) {
            org.telegram.ui.Components.cc.S(z10 ? 1 : 0, u91Var, u91Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.ho
    public final void R(int i7) {
        u91 u91Var = this.b;
        long j3 = u91Var.a;
        u91Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        if (i7 != 0) {
            u91Var.getNotificationsController().H(-j3, i7, tL_forumTopic.id);
            if (org.telegram.ui.Components.cc.a(u91Var)) {
                org.telegram.ui.Components.cc.z(u91Var, 5, i7, u91Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (u91Var.getMessagesController().r2(-j3, tL_forumTopic.id, null)) {
            u91Var.getNotificationsController().G(-j3, tL_forumTopic.id, false);
        }
        if (org.telegram.ui.Components.cc.a(u91Var)) {
            org.telegram.ui.Components.cc.z(u91Var, 4, i7, u91Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.ho
    public final void dismiss() {
        this.b.finishPreviewFragment();
    }

    @Override // org.telegram.ui.Components.ho
    public final void u() {
        u91 u91Var = this.b;
        u91Var.finishPreviewFragment();
        org.telegram.messenger.np messagesController = u91Var.getMessagesController();
        long j3 = u91Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        boolean r22 = messagesController.r2(-j3, tL_forumTopic.id, null);
        u91Var.getNotificationsController().G(-j3, tL_forumTopic.id, !r22);
        if (org.telegram.ui.Components.cc.a(u91Var)) {
            org.telegram.ui.Components.cc.z(u91Var, !r22 ? 3 : 4, !r22 ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, u91Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.ho
    public final /* synthetic */ void t() {
    }
}
