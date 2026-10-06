package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class cf1 implements org.telegram.ui.Components.ro {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ wf1 b;

    public cf1(wf1 wf1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = wf1Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.Components.ro
    public final void dismiss() {
        this.b.finishPreviewFragment();
    }

    @Override // org.telegram.ui.Components.ro
    public final void k() {
        wf1 wf1Var = this.b;
        wf1Var.finishPreviewFragment();
        MessagesController messagesController = wf1Var.getMessagesController();
        long j3 = wf1Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        boolean isDialogMuted = messagesController.isDialogMuted(-j3, tL_forumTopic.id);
        wf1Var.getNotificationsController().muteDialog(-j3, tL_forumTopic.id, !isDialogMuted);
        if (org.telegram.ui.Components.yc.a(wf1Var)) {
            org.telegram.ui.Components.yc.z(wf1Var, !isDialogMuted ? 3 : 4, !isDialogMuted ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, wf1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.ro
    public final void l() {
        this.b.finishPreviewFragment();
        AndroidUtilities.runOnUIThread(new e91(9, this, this.a), 500L);
    }

    @Override // org.telegram.ui.Components.ro
    public final void r() {
        int i10;
        wf1 wf1Var = this.b;
        i10 = ((org.telegram.ui.ActionBar.n2) wf1Var).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = wf1Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        boolean z10 = notificationsSettings.getBoolean(org.telegram.messenger.q.i(-j3, tL_forumTopic.id, sb2), true);
        notificationsSettings.edit().putBoolean(org.telegram.messenger.q.i(-j3, tL_forumTopic.id, new StringBuilder("sound_enabled_")), !z10).apply();
        wf1Var.finishPreviewFragment();
        if (org.telegram.ui.Components.yc.a(wf1Var)) {
            org.telegram.ui.Components.yc.S(z10 ? 1 : 0, wf1Var, wf1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.ro
    public final void t(int i10) {
        wf1 wf1Var = this.b;
        long j3 = wf1Var.a;
        wf1Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        if (i10 != 0) {
            wf1Var.getNotificationsController().muteUntil(-j3, tL_forumTopic.id, i10);
            if (org.telegram.ui.Components.yc.a(wf1Var)) {
                org.telegram.ui.Components.yc.z(wf1Var, 5, i10, wf1Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (wf1Var.getMessagesController().isDialogMuted(-j3, tL_forumTopic.id)) {
            wf1Var.getNotificationsController().muteDialog(-j3, tL_forumTopic.id, false);
        }
        if (org.telegram.ui.Components.yc.a(wf1Var)) {
            org.telegram.ui.Components.yc.z(wf1Var, 4, i10, wf1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.ro
    public final /* synthetic */ void j() {
    }
}
