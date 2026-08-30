package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class pe1 implements org.telegram.ui.Components.ko {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ kf1 b;

    public pe1(kf1 kf1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = kf1Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.Components.ko
    public final void dismiss() {
        this.b.finishPreviewFragment();
    }

    @Override // org.telegram.ui.Components.ko
    public final void r() {
        kf1 kf1Var = this.b;
        kf1Var.finishPreviewFragment();
        MessagesController messagesController = kf1Var.getMessagesController();
        long j10 = kf1Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        boolean isDialogMuted = messagesController.isDialogMuted(-j10, tL_forumTopic.id);
        kf1Var.getNotificationsController().muteDialog(-j10, tL_forumTopic.id, !isDialogMuted);
        if (org.telegram.ui.Components.qc.a(kf1Var)) {
            org.telegram.ui.Components.qc.z(kf1Var, !isDialogMuted ? 3 : 4, !isDialogMuted ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, kf1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.ko
    public final void s() {
        this.b.finishPreviewFragment();
        AndroidUtilities.runOnUIThread(new l01(24, this, this.a), 500L);
    }

    @Override // org.telegram.ui.Components.ko
    public final void v() {
        int i10;
        kf1 kf1Var = this.b;
        i10 = ((org.telegram.ui.ActionBar.p2) kf1Var).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb = new StringBuilder("sound_enabled_");
        long j10 = kf1Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        boolean z4 = notificationsSettings.getBoolean(org.telegram.messenger.y3.i(-j10, tL_forumTopic.id, sb), true);
        notificationsSettings.edit().putBoolean(org.telegram.messenger.y3.i(-j10, tL_forumTopic.id, new StringBuilder("sound_enabled_")), !z4).apply();
        kf1Var.finishPreviewFragment();
        if (org.telegram.ui.Components.qc.a(kf1Var)) {
            org.telegram.ui.Components.qc.S(z4 ? 1 : 0, kf1Var, kf1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.ko
    public final void x(int i10) {
        kf1 kf1Var = this.b;
        long j10 = kf1Var.a;
        kf1Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        if (i10 != 0) {
            kf1Var.getNotificationsController().muteUntil(-j10, tL_forumTopic.id, i10);
            if (org.telegram.ui.Components.qc.a(kf1Var)) {
                org.telegram.ui.Components.qc.z(kf1Var, 5, i10, kf1Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (kf1Var.getMessagesController().isDialogMuted(-j10, tL_forumTopic.id)) {
            kf1Var.getNotificationsController().muteDialog(-j10, tL_forumTopic.id, false);
        }
        if (org.telegram.ui.Components.qc.a(kf1Var)) {
            org.telegram.ui.Components.qc.z(kf1Var, 4, i10, kf1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.ko
    public final /* synthetic */ void o() {
    }
}
