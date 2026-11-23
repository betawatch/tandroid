package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class d91 implements org.telegram.ui.Components.no {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ w91 b;

    public d91(w91 w91Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = w91Var;
        this.a = tL_forumTopic;
    }

    @Override // org.telegram.ui.Components.no
    public final void J() {
        int i7;
        w91 w91Var = this.b;
        i7 = ((org.telegram.ui.ActionBar.g2) w91Var).currentAccount;
        SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(i7).g7;
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = w91Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        sb2.append(org.telegram.messenger.xs.v(-j3, tL_forumTopic.id, false));
        boolean z10 = sharedPreferences.getBoolean(sb2.toString(), true);
        boolean z11 = !z10;
        sharedPreferences.edit().putBoolean("sound_enabled_" + org.telegram.messenger.xs.v(-j3, tL_forumTopic.id, false), z11).apply();
        w91Var.finishPreviewFragment();
        if (org.telegram.ui.Components.kc.a(w91Var)) {
            org.telegram.ui.Components.kc.S(z10 ? 1 : 0, w91Var, w91Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.no
    public final void Q(int i7) {
        w91 w91Var = this.b;
        long j3 = w91Var.a;
        w91Var.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        if (i7 != 0) {
            w91Var.getNotificationsController().H(-j3, i7, tL_forumTopic.id);
            if (org.telegram.ui.Components.kc.a(w91Var)) {
                org.telegram.ui.Components.kc.z(w91Var, 5, i7, w91Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (w91Var.getMessagesController().u2(-j3, tL_forumTopic.id, null)) {
            w91Var.getNotificationsController().G(-j3, tL_forumTopic.id, false);
        }
        if (org.telegram.ui.Components.kc.a(w91Var)) {
            org.telegram.ui.Components.kc.z(w91Var, 4, i7, w91Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.no
    public final void dismiss() {
        this.b.finishPreviewFragment();
    }

    @Override // org.telegram.ui.Components.no
    public final void v() {
        w91 w91Var = this.b;
        w91Var.finishPreviewFragment();
        org.telegram.messenger.mp messagesController = w91Var.getMessagesController();
        long j3 = w91Var.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        boolean u22 = messagesController.u2(-j3, tL_forumTopic.id, null);
        w91Var.getNotificationsController().G(-j3, tL_forumTopic.id, !u22);
        if (org.telegram.ui.Components.kc.a(w91Var)) {
            org.telegram.ui.Components.kc.z(w91Var, !u22 ? 3 : 4, !u22 ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, w91Var.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.no
    public final void y() {
        this.b.finishPreviewFragment();
        org.telegram.messenger.g0.h3(new iy0(17, this, this.a), 500L);
    }

    @Override // org.telegram.ui.Components.no
    public final /* synthetic */ void u() {
    }
}
