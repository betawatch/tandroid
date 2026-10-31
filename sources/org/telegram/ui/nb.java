package org.telegram.ui;

import android.content.DialogInterface;
import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class nb implements org.telegram.ui.Cells.q0 {
    public final /* synthetic */ pb a;

    public nb(pb pbVar) {
        this.a = pbVar;
    }

    @Override // org.telegram.ui.Cells.q0
    public final void E0(long j10) {
        int i10;
        int i11;
        sb sbVar = this.a.n;
        if (j10 < 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j10);
            i11 = ((org.telegram.ui.ActionBar.k2) sbVar).currentAccount;
            if (org.telegram.messenger.vp.r1(i11).E(bundle, sbVar, null, null)) {
                sbVar.presentFragment(new un(bundle), true);
                return;
            }
            return;
        }
        i10 = ((org.telegram.ui.ActionBar.k2) sbVar).currentAccount;
        if (j10 != org.telegram.messenger.d20.i(i10).e()) {
            Bundle k10 = org.telegram.ui.Cells.f1.k(j10, "user_id");
            sb.t0(sbVar, k10, j10);
            ProfileActivity profileActivity = new ProfileActivity(k10, null);
            profileActivity.f5(0);
            sbVar.presentFragment(profileActivity);
        }
    }

    @Override // org.telegram.ui.Cells.q0
    public final void F(org.telegram.ui.Cells.s0 s0Var) {
        sb sbVar = this.a.n;
        org.telegram.messenger.jj messageObject = s0Var.getMessageObject();
        if (messageObject.D == 22) {
            zc zcVar = new zc(a());
            zcVar.l0 = sbVar;
            sbVar.presentFragment(zcVar);
            return;
        }
        PhotoViewer.v1().N2(null, sbVar, null);
        TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(messageObject.n0, 640, false, null, false);
        if (w9 == null) {
            PhotoViewer.v1().i2(messageObject, null, 0L, 0L, 0L, sbVar.B0);
        } else {
            PhotoViewer.v1().g2(w9.location, org.telegram.messenger.ic.i(w9, messageObject.k.action.photo), sbVar.B0);
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
    public final /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Cells.q0
    public final org.telegram.ui.ActionBar.k2 h0() {
        return this.a.n;
    }

    @Override // org.telegram.ui.Cells.q0
    public final boolean i1(org.telegram.ui.Cells.s0 s0Var, float f7, float f10) {
        sb sbVar = this.a.n;
        int i10 = sb.Q0;
        return sbVar.T0(s0Var, 0.0f, 0.0f);
    }

    @Override // org.telegram.ui.Cells.q0
    public final void k0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        int i10;
        sb sbVar = this.a.n;
        if (sbVar.A0) {
            return;
        }
        Object obj = sbVar.y0.containsKey(tL_chatInviteExported.link) ? sbVar.y0.get(tL_chatInviteExported.link) : null;
        if (obj != null) {
            if (obj instanceof TLRPC.TL_messages_exportedChatInvite) {
                sb.E0(sbVar, (TLRPC.TL_messages_exportedChatInvite) obj, sbVar.z0);
                return;
            } else {
                org.telegram.messenger.m5.n(null, 2131748923, org.telegram.ui.Components.cc.a0(sbVar), R.raw.linkbroken, 36);
                return;
            }
        }
        TLRPC.TL_messages_getExportedChatInvite tL_messages_getExportedChatInvite = new TLRPC.TL_messages_getExportedChatInvite();
        tL_messages_getExportedChatInvite.peer = sbVar.getMessagesController().i1(-sbVar.f.id);
        tL_messages_getExportedChatInvite.link = tL_chatInviteExported.link;
        sbVar.A0 = true;
        final boolean[] zArr = new boolean[1];
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, sbVar.getParentActivity(), null);
        x1Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.lb
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                nb.this.a.n.A0 = false;
                zArr[0] = true;
            }
        });
        x1Var.r(300L);
        int sendRequest = sbVar.getConnectionsManager().sendRequest(tL_messages_getExportedChatInvite, new mb(this, tL_chatInviteExported, zArr, x1Var, 0));
        ConnectionsManager connectionsManager = sbVar.getConnectionsManager();
        i10 = ((org.telegram.ui.ActionBar.k2) sbVar).classGuid;
        connectionsManager.bindRequestToGuid(sendRequest, i10);
    }

    @Override // org.telegram.ui.Cells.q0
    public final /* synthetic */ void G0(org.telegram.ui.Cells.s0 s0Var) {
    }

    @Override // org.telegram.ui.Cells.q0
    public final /* synthetic */ void I(org.telegram.ui.Cells.s0 s0Var) {
    }

    @Override // org.telegram.ui.Cells.q0
    public final /* synthetic */ void w(org.telegram.ui.Cells.s0 s0Var) {
    }

    @Override // org.telegram.ui.Cells.q0
    public final /* synthetic */ void e1(org.telegram.ui.Cells.s0 s0Var, String str) {
    }

    @Override // org.telegram.ui.Cells.q0
    public final void r(org.telegram.ui.Cells.s0 s0Var, int i10) {
    }

    @Override // org.telegram.ui.Cells.q0
    public final /* synthetic */ void E(org.telegram.ui.Cells.s0 s0Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.q0
    public final /* synthetic */ void R0(org.telegram.ui.Cells.s0 s0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override // org.telegram.ui.Cells.q0
    public final /* synthetic */ void t0(org.telegram.ui.Cells.s0 s0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override // org.telegram.ui.Cells.q0
    public final /* synthetic */ void M1(org.telegram.ui.Cells.s0 s0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }
}
