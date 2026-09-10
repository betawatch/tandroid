package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class of1 implements org.telegram.ui.Components.to {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ ig1 b;

    public of1(ig1 ig1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = ig1Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.Components.to
    public final void dismiss() {
        this.b.finishPreviewFragment();
    }

    @Override // org.telegram.ui.Components.to
    public final void n() {
        ig1 ig1Var = this.b;
        ig1Var.finishPreviewFragment();
        MessagesController messagesController = ig1Var.getMessagesController();
        long j3 = ig1Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        boolean isDialogMuted = messagesController.isDialogMuted(-j3, tL_forumTopic.id);
        ig1Var.getNotificationsController().muteDialog(-j3, tL_forumTopic.id, !isDialogMuted);
        if (org.telegram.ui.Components.wc.a(ig1Var)) {
            org.telegram.ui.Components.wc.z(ig1Var, !isDialogMuted ? 3 : 4, !isDialogMuted ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, ig1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.to
    public final void o() {
        this.b.finishPreviewFragment();
        AndroidUtilities.runOnUIThread(new r91(9, this, this.a), 500L);
    }

    @Override // org.telegram.ui.Components.to
    public final void r() {
        int i10;
        ig1 ig1Var = this.b;
        i10 = ((org.telegram.ui.ActionBar.p2) ig1Var).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = ig1Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        boolean z10 = notificationsSettings.getBoolean(org.telegram.messenger.a2.i(-j3, tL_forumTopic.id, sb2), true);
        notificationsSettings.edit().putBoolean(org.telegram.messenger.a2.i(-j3, tL_forumTopic.id, new StringBuilder("sound_enabled_")), !z10).apply();
        ig1Var.finishPreviewFragment();
        if (org.telegram.ui.Components.wc.a(ig1Var)) {
            org.telegram.ui.Components.wc.S(z10 ? 1 : 0, ig1Var, ig1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.to
    public final void t(int i10) {
        ig1 ig1Var = this.b;
        long j3 = ig1Var.a;
        ig1Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        if (i10 != 0) {
            ig1Var.getNotificationsController().muteUntil(-j3, tL_forumTopic.id, i10);
            if (org.telegram.ui.Components.wc.a(ig1Var)) {
                org.telegram.ui.Components.wc.z(ig1Var, 5, i10, ig1Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (ig1Var.getMessagesController().isDialogMuted(-j3, tL_forumTopic.id)) {
            ig1Var.getNotificationsController().muteDialog(-j3, tL_forumTopic.id, false);
        }
        if (org.telegram.ui.Components.wc.a(ig1Var)) {
            org.telegram.ui.Components.wc.z(ig1Var, 4, i10, ig1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.to
    public final /* synthetic */ void l() {
    }
}
