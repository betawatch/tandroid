package org.telegram.ui;

import android.content.DialogInterface;
import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class gb implements org.telegram.ui.Cells.s0 {
    public final /* synthetic */ ib a;

    public gb(ib ibVar) {
        this.a = ibVar;
    }

    @Override // org.telegram.ui.Cells.s0
    public final org.telegram.ui.ActionBar.g2 B() {
        return this.a.n;
    }

    @Override // org.telegram.ui.Cells.s0
    public final void H(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        int i7;
        lb lbVar = this.a.n;
        if (lbVar.B0) {
            return;
        }
        Object obj = lbVar.z0.containsKey(tL_chatInviteExported.link) ? lbVar.z0.get(tL_chatInviteExported.link) : null;
        if (obj != null) {
            if (obj instanceof TLRPC.TL_messages_exportedChatInvite) {
                lb.F0(lbVar, (TLRPC.TL_messages_exportedChatInvite) obj, lbVar.A0);
                return;
            } else {
                org.telegram.messenger.f3.n(null, 2131748720, org.telegram.ui.Components.kc.b0(lbVar), R.raw.linkbroken, 36);
                return;
            }
        }
        TLRPC.TL_messages_getExportedChatInvite tL_messages_getExportedChatInvite = new TLRPC.TL_messages_getExportedChatInvite();
        tL_messages_getExportedChatInvite.peer = lbVar.getMessagesController().l1(-lbVar.f.id);
        tL_messages_getExportedChatInvite.link = tL_chatInviteExported.link;
        lbVar.B0 = true;
        final boolean[] zArr = new boolean[1];
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, lbVar.getParentActivity(), null);
        t1Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.fb
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                gb.this.a.n.B0 = false;
                zArr[0] = true;
            }
        });
        t1Var.r(300L);
        int sendRequest = lbVar.getConnectionsManager().sendRequest(tL_messages_getExportedChatInvite, new bi.m2(this, tL_chatInviteExported, zArr, t1Var));
        ConnectionsManager connectionsManager = lbVar.getConnectionsManager();
        i7 = ((org.telegram.ui.ActionBar.g2) lbVar).classGuid;
        connectionsManager.bindRequestToGuid(sendRequest, i7);
    }

    @Override // org.telegram.ui.Cells.s0
    public final void Q(long j3) {
        int i7;
        int i10;
        lb lbVar = this.a.n;
        if (j3 < 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j3);
            i10 = ((org.telegram.ui.ActionBar.g2) lbVar).currentAccount;
            if (org.telegram.messenger.mp.u1(i10).E(bundle, lbVar, null, null)) {
                lbVar.presentFragment(new bn(bundle), true);
                return;
            }
            return;
        }
        i7 = ((org.telegram.ui.ActionBar.g2) lbVar).currentAccount;
        if (j3 != org.telegram.messenger.i10.i(i7).e()) {
            Bundle j10 = a8.p0.j(j3, "user_id");
            lb.u0(lbVar, j10, j3);
            ProfileActivity profileActivity = new ProfileActivity(j10, null);
            profileActivity.j5(0);
            lbVar.presentFragment(profileActivity);
        }
    }

    @Override // org.telegram.ui.Cells.s0
    public final long a() {
        return -this.a.n.f.id;
    }

    @Override // org.telegram.ui.Cells.s0
    public final /* synthetic */ long b() {
        return 0L;
    }

    @Override // org.telegram.ui.Cells.s0
    public final boolean g0(org.telegram.ui.Cells.v0 v0Var, float f10, float f11) {
        lb lbVar = this.a.n;
        int i7 = lb.R0;
        return lbVar.U0(v0Var, 0.0f, 0.0f);
    }

    @Override // org.telegram.ui.Cells.s0
    public final /* synthetic */ boolean i() {
        return true;
    }

    @Override // org.telegram.ui.Cells.s0
    public final void r(org.telegram.ui.Cells.v0 v0Var) {
        lb lbVar = this.a.n;
        org.telegram.messenger.fj messageObject = v0Var.getMessageObject();
        if (messageObject.D == 22) {
            qc qcVar = new qc(a());
            qcVar.m0 = lbVar;
            lbVar.presentFragment(qcVar);
            return;
        }
        PhotoViewer.p1().J2(null, lbVar, null);
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(messageObject.p0, 640, false, null, false);
        if (w10 == null) {
            PhotoViewer.p1().f2(messageObject, null, 0L, 0L, 0L, lbVar.C0);
        } else {
            PhotoViewer.p1().d2(w10.location, org.telegram.messenger.fc.i(w10, messageObject.k.action.photo), lbVar.C0);
        }
    }

    @Override // org.telegram.ui.Cells.s0
    public final /* synthetic */ void S(org.telegram.ui.Cells.v0 v0Var) {
    }

    @Override // org.telegram.ui.Cells.s0
    public final /* synthetic */ void l(org.telegram.ui.Cells.v0 v0Var) {
    }

    @Override // org.telegram.ui.Cells.s0
    public final /* synthetic */ void w(org.telegram.ui.Cells.v0 v0Var) {
    }

    @Override // org.telegram.ui.Cells.s0
    public final /* synthetic */ void V(org.telegram.ui.Cells.v0 v0Var, String str) {
    }

    @Override // org.telegram.ui.Cells.s0
    public final void j(org.telegram.ui.Cells.v0 v0Var, int i7) {
    }

    @Override // org.telegram.ui.Cells.s0
    public final /* synthetic */ void K(org.telegram.ui.Cells.v0 v0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override // org.telegram.ui.Cells.s0
    public final /* synthetic */ void T(org.telegram.ui.Cells.v0 v0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override // org.telegram.ui.Cells.s0
    public final /* synthetic */ void n(org.telegram.ui.Cells.v0 v0Var, int i7, int i10) {
    }

    @Override // org.telegram.ui.Cells.s0
    public final /* synthetic */ void s0(org.telegram.ui.Cells.v0 v0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }
}
