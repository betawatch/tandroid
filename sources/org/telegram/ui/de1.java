package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class de1 implements org.telegram.ui.Components.yo {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ ye1 b;

    public de1(ye1 ye1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = ye1Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.Components.yo
    public final void dismiss() {
        this.b.finishPreviewFragment();
    }

    @Override // org.telegram.ui.Components.yo
    public final void o() {
        ye1 ye1Var = this.b;
        ye1Var.finishPreviewFragment();
        MessagesController messagesController = ye1Var.getMessagesController();
        long j10 = ye1Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        boolean isDialogMuted = messagesController.isDialogMuted(-j10, tL_forumTopic.id);
        ye1Var.getNotificationsController().muteDialog(-j10, tL_forumTopic.id, !isDialogMuted);
        if (org.telegram.ui.Components.xc.a(ye1Var)) {
            org.telegram.ui.Components.xc.z(ye1Var, !isDialogMuted ? 3 : 4, !isDialogMuted ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, ye1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.yo
    public final void p() {
        this.b.finishPreviewFragment();
        AndroidUtilities.runOnUIThread(new o71(12, this, this.a), 500L);
    }

    @Override // org.telegram.ui.Components.yo
    public final void t() {
        int i10;
        ye1 ye1Var = this.b;
        i10 = ((org.telegram.ui.ActionBar.o2) ye1Var).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j10 = ye1Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        boolean z10 = notificationsSettings.getBoolean(org.telegram.messenger.v0.i(-j10, tL_forumTopic.id, sb2), true);
        notificationsSettings.edit().putBoolean(org.telegram.messenger.v0.i(-j10, tL_forumTopic.id, new StringBuilder("sound_enabled_")), !z10).apply();
        ye1Var.finishPreviewFragment();
        if (org.telegram.ui.Components.xc.a(ye1Var)) {
            org.telegram.ui.Components.xc.S(z10 ? 1 : 0, ye1Var, ye1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.yo
    public final void v(int i10) {
        ye1 ye1Var = this.b;
        long j10 = ye1Var.a;
        ye1Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        if (i10 != 0) {
            ye1Var.getNotificationsController().muteUntil(-j10, tL_forumTopic.id, i10);
            if (org.telegram.ui.Components.xc.a(ye1Var)) {
                org.telegram.ui.Components.xc.z(ye1Var, 5, i10, ye1Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (ye1Var.getMessagesController().isDialogMuted(-j10, tL_forumTopic.id)) {
            ye1Var.getNotificationsController().muteDialog(-j10, tL_forumTopic.id, false);
        }
        if (org.telegram.ui.Components.xc.a(ye1Var)) {
            org.telegram.ui.Components.xc.z(ye1Var, 4, i10, ye1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.yo
    public final /* synthetic */ void m() {
    }
}
