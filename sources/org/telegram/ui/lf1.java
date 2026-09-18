package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class lf1 implements org.telegram.ui.Components.oo {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ fg1 b;

    public lf1(fg1 fg1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = fg1Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.Components.oo
    public final void dismiss() {
        this.b.finishPreviewFragment();
    }

    @Override // org.telegram.ui.Components.oo
    public final void n() {
        fg1 fg1Var = this.b;
        fg1Var.finishPreviewFragment();
        MessagesController messagesController = fg1Var.getMessagesController();
        long j3 = fg1Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        boolean isDialogMuted = messagesController.isDialogMuted(-j3, tL_forumTopic.id);
        fg1Var.getNotificationsController().muteDialog(-j3, tL_forumTopic.id, !isDialogMuted);
        if (org.telegram.ui.Components.vc.a(fg1Var)) {
            org.telegram.ui.Components.vc.z(fg1Var, !isDialogMuted ? 3 : 4, !isDialogMuted ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, fg1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.oo
    public final void o() {
        this.b.finishPreviewFragment();
        AndroidUtilities.runOnUIThread(new qb1(6, this, this.a), 500L);
    }

    @Override // org.telegram.ui.Components.oo
    public final void r() {
        int i10;
        fg1 fg1Var = this.b;
        i10 = ((org.telegram.ui.ActionBar.o2) fg1Var).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = fg1Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        boolean z10 = notificationsSettings.getBoolean(org.telegram.messenger.w1.i(-j3, tL_forumTopic.id, sb2), true);
        notificationsSettings.edit().putBoolean(org.telegram.messenger.w1.i(-j3, tL_forumTopic.id, new StringBuilder("sound_enabled_")), !z10).apply();
        fg1Var.finishPreviewFragment();
        if (org.telegram.ui.Components.vc.a(fg1Var)) {
            org.telegram.ui.Components.vc.S(z10 ? 1 : 0, fg1Var, fg1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.oo
    public final void t(int i10) {
        fg1 fg1Var = this.b;
        long j3 = fg1Var.a;
        fg1Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        if (i10 != 0) {
            fg1Var.getNotificationsController().muteUntil(-j3, tL_forumTopic.id, i10);
            if (org.telegram.ui.Components.vc.a(fg1Var)) {
                org.telegram.ui.Components.vc.z(fg1Var, 5, i10, fg1Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (fg1Var.getMessagesController().isDialogMuted(-j3, tL_forumTopic.id)) {
            fg1Var.getNotificationsController().muteDialog(-j3, tL_forumTopic.id, false);
        }
        if (org.telegram.ui.Components.vc.a(fg1Var)) {
            org.telegram.ui.Components.vc.z(fg1Var, 4, i10, fg1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.oo
    public final /* synthetic */ void l() {
    }
}
