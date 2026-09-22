package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class kf1 implements org.telegram.ui.Components.oo {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ eg1 b;

    public kf1(eg1 eg1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = eg1Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.Components.oo
    public final void dismiss() {
        this.b.finishPreviewFragment();
    }

    @Override // org.telegram.ui.Components.oo
    public final void n() {
        eg1 eg1Var = this.b;
        eg1Var.finishPreviewFragment();
        MessagesController messagesController = eg1Var.getMessagesController();
        long j3 = eg1Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        boolean isDialogMuted = messagesController.isDialogMuted(-j3, tL_forumTopic.id);
        eg1Var.getNotificationsController().muteDialog(-j3, tL_forumTopic.id, !isDialogMuted);
        if (org.telegram.ui.Components.vc.a(eg1Var)) {
            org.telegram.ui.Components.vc.z(eg1Var, !isDialogMuted ? 3 : 4, !isDialogMuted ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, eg1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.oo
    public final void o() {
        this.b.finishPreviewFragment();
        AndroidUtilities.runOnUIThread(new pb1(6, this, this.a), 500L);
    }

    @Override // org.telegram.ui.Components.oo
    public final void r() {
        int i10;
        eg1 eg1Var = this.b;
        i10 = ((org.telegram.ui.ActionBar.n2) eg1Var).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = eg1Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        boolean z10 = notificationsSettings.getBoolean(org.telegram.messenger.y0.i(-j3, tL_forumTopic.id, sb2), true);
        notificationsSettings.edit().putBoolean(org.telegram.messenger.y0.i(-j3, tL_forumTopic.id, new StringBuilder("sound_enabled_")), !z10).apply();
        eg1Var.finishPreviewFragment();
        if (org.telegram.ui.Components.vc.a(eg1Var)) {
            org.telegram.ui.Components.vc.S(z10 ? 1 : 0, eg1Var, eg1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.oo
    public final void t(int i10) {
        eg1 eg1Var = this.b;
        long j3 = eg1Var.a;
        eg1Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        if (i10 != 0) {
            eg1Var.getNotificationsController().muteUntil(-j3, tL_forumTopic.id, i10);
            if (org.telegram.ui.Components.vc.a(eg1Var)) {
                org.telegram.ui.Components.vc.z(eg1Var, 5, i10, eg1Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (eg1Var.getMessagesController().isDialogMuted(-j3, tL_forumTopic.id)) {
            eg1Var.getNotificationsController().muteDialog(-j3, tL_forumTopic.id, false);
        }
        if (org.telegram.ui.Components.vc.a(eg1Var)) {
            org.telegram.ui.Components.vc.z(eg1Var, 4, i10, eg1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.oo
    public final /* synthetic */ void l() {
    }
}
