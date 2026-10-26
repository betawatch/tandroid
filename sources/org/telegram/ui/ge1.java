package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ge1 implements org.telegram.ui.Components.ap {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ af1 b;

    public ge1(af1 af1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = af1Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.Components.ap
    public final void dismiss() {
        this.b.finishPreviewFragment();
    }

    @Override // org.telegram.ui.Components.ap
    public final void n() {
        af1 af1Var = this.b;
        af1Var.finishPreviewFragment();
        MessagesController messagesController = af1Var.getMessagesController();
        long j10 = af1Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        boolean isDialogMuted = messagesController.isDialogMuted(-j10, tL_forumTopic.id);
        af1Var.getNotificationsController().muteDialog(-j10, tL_forumTopic.id, !isDialogMuted);
        if (org.telegram.ui.Components.wc.a(af1Var)) {
            org.telegram.ui.Components.wc.z(af1Var, !isDialogMuted ? 3 : 4, !isDialogMuted ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, af1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.ap
    public final void o() {
        this.b.finishPreviewFragment();
        AndroidUtilities.runOnUIThread(new zc1(2, this, this.a), 500L);
    }

    @Override // org.telegram.ui.Components.ap
    public final void r() {
        int i10;
        af1 af1Var = this.b;
        i10 = ((org.telegram.ui.ActionBar.r2) af1Var).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j10 = af1Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        boolean z10 = notificationsSettings.getBoolean(org.telegram.messenger.t.j(-j10, tL_forumTopic.id, sb2), true);
        notificationsSettings.edit().putBoolean(org.telegram.messenger.t.j(-j10, tL_forumTopic.id, new StringBuilder("sound_enabled_")), !z10).apply();
        af1Var.finishPreviewFragment();
        if (org.telegram.ui.Components.wc.a(af1Var)) {
            org.telegram.ui.Components.wc.T(z10 ? 1 : 0, af1Var, af1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.ap
    public final void u(int i10) {
        af1 af1Var = this.b;
        long j10 = af1Var.a;
        af1Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        if (i10 != 0) {
            af1Var.getNotificationsController().muteUntil(-j10, tL_forumTopic.id, i10);
            if (org.telegram.ui.Components.wc.a(af1Var)) {
                org.telegram.ui.Components.wc.z(af1Var, 5, i10, af1Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (af1Var.getMessagesController().isDialogMuted(-j10, tL_forumTopic.id)) {
            af1Var.getNotificationsController().muteDialog(-j10, tL_forumTopic.id, false);
        }
        if (org.telegram.ui.Components.wc.a(af1Var)) {
            org.telegram.ui.Components.wc.z(af1Var, 4, i10, af1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.ap
    public final /* synthetic */ void m() {
    }
}
