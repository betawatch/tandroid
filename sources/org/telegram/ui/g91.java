package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class g91 implements org.telegram.ui.Components.wn {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ z91 b;

    public g91(z91 z91Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = z91Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.Components.wn
    public final void L() {
        int i7;
        z91 z91Var = this.b;
        i7 = ((org.telegram.ui.ActionBar.f2) z91Var).currentAccount;
        SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(i7).d7;
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = z91Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        sb2.append(org.telegram.messenger.dt.v(-j3, tL_forumTopic.id, false));
        boolean z9 = sharedPreferences.getBoolean(sb2.toString(), true);
        boolean z10 = !z9;
        sharedPreferences.edit().putBoolean("sound_enabled_" + org.telegram.messenger.dt.v(-j3, tL_forumTopic.id, false), z10).apply();
        z91Var.finishPreviewFragment();
        if (org.telegram.ui.Components.gc.a(z91Var)) {
            org.telegram.ui.Components.gc.S(z9 ? 1 : 0, z91Var, z91Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.wn
    public final void R(int i7) {
        z91 z91Var = this.b;
        long j3 = z91Var.a;
        z91Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        if (i7 != 0) {
            z91Var.getNotificationsController().H(-j3, i7, tL_forumTopic.id);
            if (org.telegram.ui.Components.gc.a(z91Var)) {
                org.telegram.ui.Components.gc.z(z91Var, 5, i7, z91Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (z91Var.getMessagesController().r2(-j3, tL_forumTopic.id, null)) {
            z91Var.getNotificationsController().G(-j3, tL_forumTopic.id, false);
        }
        if (org.telegram.ui.Components.gc.a(z91Var)) {
            org.telegram.ui.Components.gc.z(z91Var, 4, i7, z91Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.wn
    public final void dismiss() {
        this.b.finishPreviewFragment();
    }

    @Override // org.telegram.ui.Components.wn
    public final void p() {
        z91 z91Var = this.b;
        z91Var.finishPreviewFragment();
        org.telegram.messenger.qp messagesController = z91Var.getMessagesController();
        long j3 = z91Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        boolean r22 = messagesController.r2(-j3, tL_forumTopic.id, null);
        z91Var.getNotificationsController().G(-j3, tL_forumTopic.id, !r22);
        if (org.telegram.ui.Components.gc.a(z91Var)) {
            org.telegram.ui.Components.gc.z(z91Var, !r22 ? 3 : 4, !r22 ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, z91Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.wn
    public final void y() {
        this.b.finishPreviewFragment();
        org.telegram.messenger.g0.i3(new rw0(21, this, this.a), 500L);
    }

    @Override // org.telegram.ui.Components.wn
    public final /* synthetic */ void n() {
    }
}
