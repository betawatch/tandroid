package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ce1 implements org.telegram.ui.Components.bo {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ we1 b;

    public ce1(we1 we1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = we1Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.Components.bo
    public final void dismiss() {
        this.b.finishPreviewFragment();
    }

    @Override // org.telegram.ui.Components.bo
    public final void m() {
        we1 we1Var = this.b;
        we1Var.finishPreviewFragment();
        MessagesController messagesController = we1Var.getMessagesController();
        long j10 = we1Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        boolean isDialogMuted = messagesController.isDialogMuted(-j10, tL_forumTopic.id);
        we1Var.getNotificationsController().muteDialog(-j10, tL_forumTopic.id, !isDialogMuted);
        if (org.telegram.ui.Components.mc.a(we1Var)) {
            org.telegram.ui.Components.mc.z(we1Var, !isDialogMuted ? 3 : 4, !isDialogMuted ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, we1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.bo
    public final void o() {
        this.b.finishPreviewFragment();
        AndroidUtilities.runOnUIThread(new m21(18, this, this.a), 500L);
    }

    @Override // org.telegram.ui.Components.bo
    public final void u() {
        int i10;
        we1 we1Var = this.b;
        i10 = ((org.telegram.ui.ActionBar.n2) we1Var).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j10 = we1Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        boolean z10 = notificationsSettings.getBoolean(org.telegram.messenger.y1.j(-j10, tL_forumTopic.id, sb2), true);
        notificationsSettings.edit().putBoolean(org.telegram.messenger.y1.j(-j10, tL_forumTopic.id, new StringBuilder("sound_enabled_")), !z10).apply();
        we1Var.finishPreviewFragment();
        if (org.telegram.ui.Components.mc.a(we1Var)) {
            org.telegram.ui.Components.mc.S(z10 ? 1 : 0, we1Var, we1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.bo
    public final void v(int i10) {
        we1 we1Var = this.b;
        long j10 = we1Var.a;
        we1Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        if (i10 != 0) {
            we1Var.getNotificationsController().muteUntil(-j10, tL_forumTopic.id, i10);
            if (org.telegram.ui.Components.mc.a(we1Var)) {
                org.telegram.ui.Components.mc.z(we1Var, 5, i10, we1Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (we1Var.getMessagesController().isDialogMuted(-j10, tL_forumTopic.id)) {
            we1Var.getNotificationsController().muteDialog(-j10, tL_forumTopic.id, false);
        }
        if (org.telegram.ui.Components.mc.a(we1Var)) {
            org.telegram.ui.Components.mc.z(we1Var, 4, i10, we1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.bo
    public final /* synthetic */ void k() {
    }
}
