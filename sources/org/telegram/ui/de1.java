package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class de1 implements org.telegram.ui.Components.io {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ ze1 b;

    public de1(ze1 ze1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = ze1Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.Components.io
    public final void dismiss() {
        this.b.finishPreviewFragment();
    }

    @Override // org.telegram.ui.Components.io
    public final void k() {
        ze1 ze1Var = this.b;
        ze1Var.finishPreviewFragment();
        MessagesController messagesController = ze1Var.getMessagesController();
        long j10 = ze1Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        boolean isDialogMuted = messagesController.isDialogMuted(-j10, tL_forumTopic.id);
        ze1Var.getNotificationsController().muteDialog(-j10, tL_forumTopic.id, !isDialogMuted);
        if (org.telegram.ui.Components.tc.a(ze1Var)) {
            org.telegram.ui.Components.tc.z(ze1Var, !isDialogMuted ? 3 : 4, !isDialogMuted ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, ze1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.io
    public final void l() {
        this.b.finishPreviewFragment();
        AndroidUtilities.runOnUIThread(new t31(15, this, this.a), 500L);
    }

    @Override // org.telegram.ui.Components.io
    public final void u() {
        int i10;
        ze1 ze1Var = this.b;
        i10 = ((org.telegram.ui.ActionBar.o2) ze1Var).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j10 = ze1Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        boolean z10 = notificationsSettings.getBoolean(org.telegram.messenger.x3.j(-j10, tL_forumTopic.id, sb2), true);
        notificationsSettings.edit().putBoolean(org.telegram.messenger.x3.j(-j10, tL_forumTopic.id, new StringBuilder("sound_enabled_")), !z10).apply();
        ze1Var.finishPreviewFragment();
        if (org.telegram.ui.Components.tc.a(ze1Var)) {
            org.telegram.ui.Components.tc.S(z10 ? 1 : 0, ze1Var, ze1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.io
    public final void w(int i10) {
        ze1 ze1Var = this.b;
        long j10 = ze1Var.a;
        ze1Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        if (i10 != 0) {
            ze1Var.getNotificationsController().muteUntil(-j10, tL_forumTopic.id, i10);
            if (org.telegram.ui.Components.tc.a(ze1Var)) {
                org.telegram.ui.Components.tc.z(ze1Var, 5, i10, ze1Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (ze1Var.getMessagesController().isDialogMuted(-j10, tL_forumTopic.id)) {
            ze1Var.getNotificationsController().muteDialog(-j10, tL_forumTopic.id, false);
        }
        if (org.telegram.ui.Components.tc.a(ze1Var)) {
            org.telegram.ui.Components.tc.z(ze1Var, 4, i10, ze1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.io
    public final /* synthetic */ void j() {
    }
}
