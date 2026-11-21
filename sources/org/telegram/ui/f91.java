package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class f91 implements org.telegram.ui.Components.qo {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ y91 b;

    public f91(y91 y91Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = y91Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.Components.qo
    public final void B(int i7) {
        y91 y91Var = this.b;
        long j3 = y91Var.a;
        y91Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        if (i7 != 0) {
            y91Var.getNotificationsController().H(-j3, i7, tL_forumTopic.id);
            if (org.telegram.ui.Components.lc.a(y91Var)) {
                org.telegram.ui.Components.lc.z(y91Var, 5, i7, y91Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (y91Var.getMessagesController().u2(-j3, tL_forumTopic.id, null)) {
            y91Var.getNotificationsController().G(-j3, tL_forumTopic.id, false);
        }
        if (org.telegram.ui.Components.lc.a(y91Var)) {
            org.telegram.ui.Components.lc.z(y91Var, 4, i7, y91Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.qo
    public final void dismiss() {
        this.b.finishPreviewFragment();
    }

    @Override // org.telegram.ui.Components.qo
    public final void s() {
        y91 y91Var = this.b;
        y91Var.finishPreviewFragment();
        org.telegram.messenger.mp messagesController = y91Var.getMessagesController();
        long j3 = y91Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        boolean u22 = messagesController.u2(-j3, tL_forumTopic.id, null);
        y91Var.getNotificationsController().G(-j3, tL_forumTopic.id, !u22);
        if (org.telegram.ui.Components.lc.a(y91Var)) {
            org.telegram.ui.Components.lc.z(y91Var, !u22 ? 3 : 4, !u22 ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, y91Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.qo
    public final void u() {
        this.b.finishPreviewFragment();
        org.telegram.messenger.g0.h3(new mz0(13, this, this.a), 500L);
    }

    @Override // org.telegram.ui.Components.qo
    public final void w() {
        int i7;
        y91 y91Var = this.b;
        i7 = ((org.telegram.ui.ActionBar.g2) y91Var).currentAccount;
        SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(i7).g7;
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = y91Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        sb2.append(org.telegram.messenger.xs.v(-j3, tL_forumTopic.id, false));
        boolean z10 = sharedPreferences.getBoolean(sb2.toString(), true);
        boolean z11 = !z10;
        sharedPreferences.edit().putBoolean("sound_enabled_" + org.telegram.messenger.xs.v(-j3, tL_forumTopic.id, false), z11).apply();
        y91Var.finishPreviewFragment();
        if (org.telegram.ui.Components.lc.a(y91Var)) {
            org.telegram.ui.Components.lc.S(z10 ? 1 : 0, y91Var, y91Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.qo
    public final /* synthetic */ void p() {
    }
}
