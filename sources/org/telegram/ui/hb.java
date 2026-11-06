package org.telegram.ui;

import android.content.DialogInterface;
import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class hb implements org.telegram.ui.Cells.q0 {
    public final /* synthetic */ jb a;

    public hb(jb jbVar) {
        this.a = jbVar;
    }

    @Override // org.telegram.ui.Cells.q0
    public final void E(long j3) {
        int i7;
        int i10;
        mb mbVar = this.a.n;
        if (j3 < 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j3);
            i10 = ((org.telegram.ui.ActionBar.f2) mbVar).currentAccount;
            if (org.telegram.messenger.qp.s1(i10).E(bundle, mbVar, null, null)) {
                mbVar.presentFragment(new an(bundle), true);
                return;
            }
            return;
        }
        i7 = ((org.telegram.ui.ActionBar.f2) mbVar).currentAccount;
        if (j3 != org.telegram.messenger.p10.i(i7).e()) {
            Bundle j10 = a8.p0.j(j3, "user_id");
            mb.u0(mbVar, j10, j3);
            ProfileActivity profileActivity = new ProfileActivity(j10, null);
            profileActivity.g5(0);
            mbVar.presentFragment(profileActivity);
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
    public final /* synthetic */ boolean g() {
        return true;
    }

    @Override // org.telegram.ui.Cells.q0
    public final void q(org.telegram.ui.Cells.t0 t0Var) {
        mb mbVar = this.a.n;
        org.telegram.messenger.ij messageObject = t0Var.getMessageObject();
        if (messageObject.D == 22) {
            rc rcVar = new rc(a());
            rcVar.l0 = mbVar;
            mbVar.presentFragment(rcVar);
            return;
        }
        PhotoViewer.p1().H2(null, mbVar, null);
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(messageObject.n0, 640, false, null, false);
        if (w10 == null) {
            PhotoViewer.p1().d2(messageObject, null, 0L, 0L, 0L, mbVar.B0);
        } else {
            PhotoViewer.p1().b2(w10.location, org.telegram.messenger.hc.i(w10, messageObject.k.action.photo), mbVar.B0);
        }
    }

    @Override // org.telegram.ui.Cells.q0
    public final boolean r0(org.telegram.ui.Cells.t0 t0Var, float f10, float f11) {
        mb mbVar = this.a.n;
        int i7 = mb.Q0;
        return mbVar.U0(t0Var, 0.0f, 0.0f);
    }

    @Override // org.telegram.ui.Cells.q0
    public final org.telegram.ui.ActionBar.f2 t() {
        return this.a.n;
    }

    @Override // org.telegram.ui.Cells.q0
    public final void w(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        int i7;
        mb mbVar = this.a.n;
        if (mbVar.A0) {
            return;
        }
        Object obj = mbVar.y0.containsKey(tL_chatInviteExported.link) ? mbVar.y0.get(tL_chatInviteExported.link) : null;
        if (obj != null) {
            if (obj instanceof TLRPC.TL_messages_exportedChatInvite) {
                mb.F0(mbVar, (TLRPC.TL_messages_exportedChatInvite) obj, mbVar.z0);
                return;
            } else {
                org.telegram.messenger.k5.o(null, 2131748912, org.telegram.ui.Components.hc.a0(mbVar), R.raw.linkbroken, 36);
                return;
            }
        }
        TLRPC.TL_messages_getExportedChatInvite tL_messages_getExportedChatInvite = new TLRPC.TL_messages_getExportedChatInvite();
        tL_messages_getExportedChatInvite.peer = mbVar.getMessagesController().j1(-mbVar.f.id);
        tL_messages_getExportedChatInvite.link = tL_chatInviteExported.link;
        mbVar.A0 = true;
        final boolean[] zArr = new boolean[1];
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, mbVar.getParentActivity(), null);
        u1Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.gb
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                hb.this.a.n.A0 = false;
                zArr[0] = true;
            }
        });
        u1Var.r(300L);
        int sendRequest = mbVar.getConnectionsManager().sendRequest(tL_messages_getExportedChatInvite, new bi.g2(this, tL_chatInviteExported, zArr, u1Var, 9));
        ConnectionsManager connectionsManager = mbVar.getConnectionsManager();
        i7 = ((org.telegram.ui.ActionBar.f2) mbVar).classGuid;
        connectionsManager.bindRequestToGuid(sendRequest, i7);
    }

    @Override // org.telegram.ui.Cells.q0
    public final /* synthetic */ void F(org.telegram.ui.Cells.t0 t0Var) {
    }

    @Override // org.telegram.ui.Cells.q0
    public final /* synthetic */ void l(org.telegram.ui.Cells.t0 t0Var) {
    }

    @Override // org.telegram.ui.Cells.q0
    public final /* synthetic */ void s(org.telegram.ui.Cells.t0 t0Var) {
    }

    @Override // org.telegram.ui.Cells.q0
    public final /* synthetic */ void c0(org.telegram.ui.Cells.t0 t0Var, String str) {
    }

    @Override // org.telegram.ui.Cells.q0
    public final void i(org.telegram.ui.Cells.t0 t0Var, int i7) {
    }

    @Override // org.telegram.ui.Cells.q0
    public final /* synthetic */ void D(org.telegram.ui.Cells.t0 t0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override // org.telegram.ui.Cells.q0
    public final /* synthetic */ void W(org.telegram.ui.Cells.t0 t0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override // org.telegram.ui.Cells.q0
    public final /* synthetic */ void m(org.telegram.ui.Cells.t0 t0Var, int i7, int i10) {
    }

    @Override // org.telegram.ui.Cells.q0
    public final /* synthetic */ void t0(org.telegram.ui.Cells.t0 t0Var, TLRPC.ReactionCount reactionCount, boolean z9, float f10, float f11) {
    }
}
