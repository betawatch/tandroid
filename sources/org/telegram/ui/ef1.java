package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class ef1 implements org.telegram.ui.Components.ro {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ yf1 b;

    public ef1(yf1 yf1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = yf1Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.Components.ro
    public final void dismiss() {
        this.b.finishPreviewFragment();
    }

    @Override // org.telegram.ui.Components.ro
    public final void k() {
        yf1 yf1Var = this.b;
        yf1Var.finishPreviewFragment();
        MessagesController messagesController = yf1Var.getMessagesController();
        long j3 = yf1Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        boolean isDialogMuted = messagesController.isDialogMuted(-j3, tL_forumTopic.id);
        yf1Var.getNotificationsController().muteDialog(-j3, tL_forumTopic.id, !isDialogMuted);
        if (org.telegram.ui.Components.yc.a(yf1Var)) {
            org.telegram.ui.Components.yc.z(yf1Var, !isDialogMuted ? 3 : 4, !isDialogMuted ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, yf1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.ro
    public final void l() {
        this.b.finishPreviewFragment();
        AndroidUtilities.runOnUIThread(new g91(9, this, this.a), 500L);
    }

    @Override // org.telegram.ui.Components.ro
    public final void r() {
        int i10;
        yf1 yf1Var = this.b;
        i10 = ((org.telegram.ui.ActionBar.n2) yf1Var).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = yf1Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        boolean z10 = notificationsSettings.getBoolean(org.telegram.messenger.f0.i(-j3, tL_forumTopic.id, sb2), true);
        notificationsSettings.edit().putBoolean(org.telegram.messenger.f0.i(-j3, tL_forumTopic.id, new StringBuilder("sound_enabled_")), !z10).apply();
        yf1Var.finishPreviewFragment();
        if (org.telegram.ui.Components.yc.a(yf1Var)) {
            org.telegram.ui.Components.yc.S(z10 ? 1 : 0, yf1Var, yf1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.ro
    public final void t(int i10) {
        yf1 yf1Var = this.b;
        long j3 = yf1Var.a;
        yf1Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        if (i10 != 0) {
            yf1Var.getNotificationsController().muteUntil(-j3, tL_forumTopic.id, i10);
            if (org.telegram.ui.Components.yc.a(yf1Var)) {
                org.telegram.ui.Components.yc.z(yf1Var, 5, i10, yf1Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (yf1Var.getMessagesController().isDialogMuted(-j3, tL_forumTopic.id)) {
            yf1Var.getNotificationsController().muteDialog(-j3, tL_forumTopic.id, false);
        }
        if (org.telegram.ui.Components.yc.a(yf1Var)) {
            org.telegram.ui.Components.yc.z(yf1Var, 4, i10, yf1Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.ro
    public final /* synthetic */ void j() {
    }
}
