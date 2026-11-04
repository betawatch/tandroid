package org.telegram.ui;

import android.content.DialogInterface;
import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class fb implements org.telegram.ui.Cells.q0 {
    public final /* synthetic */ hb a;

    public fb(hb hbVar) {
        this.a = hbVar;
    }

    @Override // org.telegram.ui.Cells.q0
    public final org.telegram.ui.ActionBar.d2 E() {
        return this.a.n;
    }

    @Override // org.telegram.ui.Cells.q0
    public final void F(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        int i3;
        kb kbVar = this.a.n;
        if (kbVar.B0) {
            return;
        }
        Object obj = kbVar.z0.containsKey(tL_chatInviteExported.link) ? kbVar.z0.get(tL_chatInviteExported.link) : null;
        if (obj != null) {
            if (obj instanceof TLRPC.TL_messages_exportedChatInvite) {
                kb.F0(kbVar, (TLRPC.TL_messages_exportedChatInvite) obj, kbVar.A0);
                return;
            } else {
                org.telegram.messenger.k5.o(null, 2131748921, org.telegram.ui.Components.fc.a0(kbVar), R.raw.linkbroken, 36);
                return;
            }
        }
        TLRPC.TL_messages_getExportedChatInvite tL_messages_getExportedChatInvite = new TLRPC.TL_messages_getExportedChatInvite();
        tL_messages_getExportedChatInvite.peer = kbVar.getMessagesController().j1(-kbVar.f.id);
        tL_messages_getExportedChatInvite.link = tL_chatInviteExported.link;
        kbVar.B0 = true;
        final boolean[] zArr = new boolean[1];
        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, kbVar.getParentActivity(), null);
        s1Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.eb
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                fb.this.a.n.B0 = false;
                zArr[0] = true;
            }
        });
        s1Var.r(300L);
        int sendRequest = kbVar.getConnectionsManager().sendRequest(tL_messages_getExportedChatInvite, new ai.q1(this, tL_chatInviteExported, zArr, s1Var));
        ConnectionsManager connectionsManager = kbVar.getConnectionsManager();
        i3 = ((org.telegram.ui.ActionBar.d2) kbVar).classGuid;
        connectionsManager.bindRequestToGuid(sendRequest, i3);
    }

    @Override // org.telegram.ui.Cells.q0
    public final void W(long j10) {
        int i3;
        int i10;
        kb kbVar = this.a.n;
        if (j10 < 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j10);
            i10 = ((org.telegram.ui.ActionBar.d2) kbVar).currentAccount;
            if (org.telegram.messenger.hp.s1(i10).E(bundle, kbVar, null, null)) {
                kbVar.presentFragment(new wm(bundle), true);
                return;
            }
            return;
        }
        i3 = ((org.telegram.ui.ActionBar.d2) kbVar).currentAccount;
        if (j10 != org.telegram.messenger.h10.i(i3).e()) {
            Bundle j11 = a1.g.j(j10, "user_id");
            kb.u0(kbVar, j11, j10);
            ProfileActivity profileActivity = new ProfileActivity(j11, null);
            profileActivity.g5(0);
            kbVar.presentFragment(profileActivity);
        }
    }

    @Override // org.telegram.ui.Cells.q0
    public final long a() {
        return -this.a.n.f.id;
    }

    @Override // org.telegram.ui.Cells.q0
    public final /* synthetic */ long b() {
        return 0L;
    }

    @Override // org.telegram.ui.Cells.q0
    public final /* synthetic */ boolean d() {
        return true;
    }

    @Override // org.telegram.ui.Cells.q0
    public final boolean r0(org.telegram.ui.Cells.t0 t0Var, float f10, float f11) {
        kb kbVar = this.a.n;
        int i3 = kb.R0;
        return kbVar.U0(t0Var, 0.0f, 0.0f);
    }

    @Override // org.telegram.ui.Cells.q0
    public final void u(org.telegram.ui.Cells.t0 t0Var) {
        kb kbVar = this.a.n;
        org.telegram.messenger.zi messageObject = t0Var.getMessageObject();
        if (messageObject.D == 22) {
            pc pcVar = new pc(a());
            pcVar.m0 = kbVar;
            kbVar.presentFragment(pcVar);
            return;
        }
        PhotoViewer.v1().N2(null, kbVar, null);
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(messageObject.n0, 640, false, null, false);
        if (w10 == null) {
            PhotoViewer.v1().i2(messageObject, null, 0L, 0L, 0L, kbVar.C0);
        } else {
            PhotoViewer.v1().g2(w10.location, org.telegram.messenger.ac.i(w10, messageObject.k.action.photo), kbVar.C0);
        }
    }

    @Override // org.telegram.ui.Cells.q0
    public final /* synthetic */ void c0(org.telegram.ui.Cells.t0 t0Var) {
    }

    @Override // org.telegram.ui.Cells.q0
    public final /* synthetic */ void r(org.telegram.ui.Cells.t0 t0Var) {
    }

    @Override // org.telegram.ui.Cells.q0
    public final /* synthetic */ void x(org.telegram.ui.Cells.t0 t0Var) {
    }

    @Override // org.telegram.ui.Cells.q0
    public final void h(org.telegram.ui.Cells.t0 t0Var, int i3) {
    }

    @Override // org.telegram.ui.Cells.q0
    public final /* synthetic */ void q0(org.telegram.ui.Cells.t0 t0Var, String str) {
    }

    @Override // org.telegram.ui.Cells.q0
    public final /* synthetic */ void M(org.telegram.ui.Cells.t0 t0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override // org.telegram.ui.Cells.q0
    public final /* synthetic */ void g0(org.telegram.ui.Cells.t0 t0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override // org.telegram.ui.Cells.q0
    public final /* synthetic */ void t(org.telegram.ui.Cells.t0 t0Var, int i3, int i10) {
    }

    @Override // org.telegram.ui.Cells.q0
    public final /* synthetic */ void v0(org.telegram.ui.Cells.t0 t0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }
}
