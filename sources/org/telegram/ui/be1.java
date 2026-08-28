package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class be1 implements org.telegram.ui.Components.eo {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ we1 b;

    public be1(we1 we1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = we1Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.Components.eo
    public final void A(int i9) {
        we1 we1Var = this.b;
        long j10 = we1Var.a;
        we1Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        if (i9 != 0) {
            we1Var.getNotificationsController().muteUntil(-j10, tL_forumTopic.id, i9);
            if (org.telegram.ui.Components.oc.a(we1Var)) {
                org.telegram.ui.Components.oc.z(we1Var, 5, i9, we1Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (we1Var.getMessagesController().isDialogMuted(-j10, tL_forumTopic.id)) {
            we1Var.getNotificationsController().muteDialog(-j10, tL_forumTopic.id, false);
        }
        if (org.telegram.ui.Components.oc.a(we1Var)) {
            org.telegram.ui.Components.oc.z(we1Var, 4, i9, we1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.eo
    public final void dismiss() {
        this.b.finishPreviewFragment();
    }

    @Override // org.telegram.ui.Components.eo
    public final void p() {
        we1 we1Var = this.b;
        we1Var.finishPreviewFragment();
        MessagesController messagesController = we1Var.getMessagesController();
        long j10 = we1Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        boolean isDialogMuted = messagesController.isDialogMuted(-j10, tL_forumTopic.id);
        we1Var.getNotificationsController().muteDialog(-j10, tL_forumTopic.id, !isDialogMuted);
        if (org.telegram.ui.Components.oc.a(we1Var)) {
            org.telegram.ui.Components.oc.z(we1Var, !isDialogMuted ? 3 : 4, !isDialogMuted ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, we1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.eo
    public final void s() {
        this.b.finishPreviewFragment();
        AndroidUtilities.runOnUIThread(new n21(18, this, this.a), 500L);
    }

    @Override // org.telegram.ui.Components.eo
    public final void w() {
        int i9;
        we1 we1Var = this.b;
        i9 = ((org.telegram.ui.ActionBar.o2) we1Var).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i9);
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j10 = we1Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        boolean z10 = notificationsSettings.getBoolean(org.telegram.messenger.l0.i(-j10, tL_forumTopic.id, sb2), true);
        notificationsSettings.edit().putBoolean(org.telegram.messenger.l0.i(-j10, tL_forumTopic.id, new StringBuilder("sound_enabled_")), !z10).apply();
        we1Var.finishPreviewFragment();
        if (org.telegram.ui.Components.oc.a(we1Var)) {
            org.telegram.ui.Components.oc.S(z10 ? 1 : 0, we1Var, we1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.eo
    public final /* synthetic */ void o() {
    }
}
