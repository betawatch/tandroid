package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class jf1 implements org.telegram.ui.Components.oo {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ dg1 b;

    public jf1(dg1 dg1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = dg1Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.Components.oo
    public final void dismiss() {
        this.b.finishPreviewFragment();
    }

    @Override // org.telegram.ui.Components.oo
    public final void n() {
        dg1 dg1Var = this.b;
        dg1Var.finishPreviewFragment();
        MessagesController messagesController = dg1Var.getMessagesController();
        long j3 = dg1Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        boolean isDialogMuted = messagesController.isDialogMuted(-j3, tL_forumTopic.id);
        dg1Var.getNotificationsController().muteDialog(-j3, tL_forumTopic.id, !isDialogMuted);
        if (org.telegram.ui.Components.xc.a(dg1Var)) {
            org.telegram.ui.Components.xc.z(dg1Var, !isDialogMuted ? 3 : 4, !isDialogMuted ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, dg1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.oo
    public final void o() {
        this.b.finishPreviewFragment();
        AndroidUtilities.runOnUIThread(new x81(10, this, this.a), 500L);
    }

    @Override // org.telegram.ui.Components.oo
    public final void r() {
        int i10;
        dg1 dg1Var = this.b;
        i10 = ((org.telegram.ui.ActionBar.n2) dg1Var).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = dg1Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        boolean z10 = notificationsSettings.getBoolean(org.telegram.messenger.q.j(-j3, tL_forumTopic.id, sb2), true);
        notificationsSettings.edit().putBoolean(org.telegram.messenger.q.j(-j3, tL_forumTopic.id, new StringBuilder("sound_enabled_")), !z10).apply();
        dg1Var.finishPreviewFragment();
        if (org.telegram.ui.Components.xc.a(dg1Var)) {
            org.telegram.ui.Components.xc.S(z10 ? 1 : 0, dg1Var, dg1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.oo
    public final void u(int i10) {
        dg1 dg1Var = this.b;
        long j3 = dg1Var.a;
        dg1Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        if (i10 != 0) {
            dg1Var.getNotificationsController().muteUntil(-j3, tL_forumTopic.id, i10);
            if (org.telegram.ui.Components.xc.a(dg1Var)) {
                org.telegram.ui.Components.xc.z(dg1Var, 5, i10, dg1Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (dg1Var.getMessagesController().isDialogMuted(-j3, tL_forumTopic.id)) {
            dg1Var.getNotificationsController().muteDialog(-j3, tL_forumTopic.id, false);
        }
        if (org.telegram.ui.Components.xc.a(dg1Var)) {
            org.telegram.ui.Components.xc.z(dg1Var, 4, i10, dg1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.oo
    public final /* synthetic */ void m() {
    }
}
