package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ie1 implements org.telegram.ui.Components.ap {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ cf1 b;

    public ie1(cf1 cf1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = cf1Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.Components.ap
    public final void dismiss() {
        this.b.finishPreviewFragment();
    }

    @Override // org.telegram.ui.Components.ap
    public final void n() {
        cf1 cf1Var = this.b;
        cf1Var.finishPreviewFragment();
        MessagesController messagesController = cf1Var.getMessagesController();
        long j10 = cf1Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        boolean isDialogMuted = messagesController.isDialogMuted(-j10, tL_forumTopic.id);
        cf1Var.getNotificationsController().muteDialog(-j10, tL_forumTopic.id, !isDialogMuted);
        if (org.telegram.ui.Components.wc.a(cf1Var)) {
            org.telegram.ui.Components.wc.z(cf1Var, !isDialogMuted ? 3 : 4, !isDialogMuted ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, cf1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.ap
    public final void o() {
        this.b.finishPreviewFragment();
        AndroidUtilities.runOnUIThread(new yc1(3, this, this.a), 500L);
    }

    @Override // org.telegram.ui.Components.ap
    public final void s() {
        int i10;
        cf1 cf1Var = this.b;
        i10 = ((org.telegram.ui.ActionBar.r2) cf1Var).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j10 = cf1Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        boolean z10 = notificationsSettings.getBoolean(org.telegram.messenger.t.j(-j10, tL_forumTopic.id, sb2), true);
        notificationsSettings.edit().putBoolean(org.telegram.messenger.t.j(-j10, tL_forumTopic.id, new StringBuilder("sound_enabled_")), !z10).apply();
        cf1Var.finishPreviewFragment();
        if (org.telegram.ui.Components.wc.a(cf1Var)) {
            org.telegram.ui.Components.wc.T(z10 ? 1 : 0, cf1Var, cf1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.ap
    public final void w(int i10) {
        cf1 cf1Var = this.b;
        long j10 = cf1Var.a;
        cf1Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        if (i10 != 0) {
            cf1Var.getNotificationsController().muteUntil(-j10, tL_forumTopic.id, i10);
            if (org.telegram.ui.Components.wc.a(cf1Var)) {
                org.telegram.ui.Components.wc.z(cf1Var, 5, i10, cf1Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (cf1Var.getMessagesController().isDialogMuted(-j10, tL_forumTopic.id)) {
            cf1Var.getNotificationsController().muteDialog(-j10, tL_forumTopic.id, false);
        }
        if (org.telegram.ui.Components.wc.a(cf1Var)) {
            org.telegram.ui.Components.wc.z(cf1Var, 4, i10, cf1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.ap
    public final /* synthetic */ void m() {
    }
}
