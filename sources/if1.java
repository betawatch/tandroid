// default package

import android.content.DialogInterface;
import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class if1 implements rk1 {
    public final /* synthetic */ kf1 a;

    public if1(kf1 kf1Var) {
        this.a = kf1Var;
    }

    @Override // rk1
    public final void C(long j) {
        int i;
        int i2;
        nf1 nf1Var = this.a.n;
        if (j < 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j);
            i2 = ((d) nf1Var).currentAccount;
            if (na7.q1(i2).A(bundle, nf1Var, null, null)) {
                nf1Var.presentFragment(new mu1(bundle), true);
                return;
            }
            return;
        }
        i = ((d) nf1Var).currentAccount;
        if (j != y6c.h(i).e()) {
            Bundle k = ls6.k(j, "user_id");
            nf1Var.I0(k, j);
            ProfileActivity profileActivity = new ProfileActivity(k, null);
            profileActivity.x3(0);
            nf1Var.presentFragment(profileActivity);
        }
    }

    @Override // rk1
    public final long a() {
        return -this.a.n.f.id;
    }

    @Override // rk1
    public final boolean a0(uk1 uk1Var, float f, float f2) {
        nf1 nf1Var = this.a.n;
        int i = nf1.Q0;
        return nf1Var.L0(uk1Var, 0.0f, 0.0f);
    }

    @Override // rk1
    public final long d() {
        return 0L;
    }

    @Override // rk1
    public final boolean l() {
        return true;
    }

    @Override // rk1
    public final void r(uk1 uk1Var) {
        nf1 nf1Var = this.a.n;
        k27 messageObject = uk1Var.getMessageObject();
        if (messageObject.D == 22) {
            nh1 nh1Var = new nh1(a());
            nh1Var.m0 = nf1Var;
            nf1Var.presentFragment(nh1Var);
            return;
        }
        PhotoViewer.r0().T1(null, nf1Var, null);
        TLRPC.PhotoSize w = ba4.w(messageObject.p0, 640, false, null, false);
        if (w == null) {
            PhotoViewer.r0().m1(messageObject, null, 0L, 0L, 0L, nf1Var.C0);
        } else {
            PhotoViewer.r0().l1(w.location, gl5.i(w, messageObject.k.action.photo), nf1Var.C0);
        }
    }

    @Override // rk1
    public final d v() {
        return this.a.n;
    }

    @Override // rk1
    public final void w(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        int i;
        nf1 nf1Var = this.a.n;
        if (nf1Var.B0) {
            return;
        }
        Object obj = nf1Var.z0.containsKey(tL_chatInviteExported.link) ? nf1Var.z0.get(tL_chatInviteExported.link) : null;
        if (obj != null) {
            if (obj instanceof TLRPC.TL_messages_exportedChatInvite) {
                nf1Var.d1((TLRPC.TL_messages_exportedChatInvite) obj, nf1Var.A0);
                return;
            } else {
                ir2.v(null, 2131748721, u21.b0(nf1Var), R.raw.linkbroken, 36);
                return;
            }
        }
        TLRPC.TL_messages_getExportedChatInvite tL_messages_getExportedChatInvite = new TLRPC.TL_messages_getExportedChatInvite();
        tL_messages_getExportedChatInvite.peer = nf1Var.getMessagesController().h1(-nf1Var.f.id);
        tL_messages_getExportedChatInvite.link = tL_chatInviteExported.link;
        nf1Var.B0 = true;
        final boolean[] zArr = new boolean[1];
        hd hdVar = new hd(3, null, nf1Var.getParentActivity());
        hdVar.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: hf1
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                if1.this.a.n.B0 = false;
                zArr[0] = true;
            }
        });
        hdVar.q(300L);
        int sendRequest = nf1Var.getConnectionsManager().sendRequest(tL_messages_getExportedChatInvite, new rt0((Object) this, (Object) tL_chatInviteExported, (Object) zArr, (Object) hdVar, (byte) 2));
        ConnectionsManager connectionsManager = nf1Var.getConnectionsManager();
        i = ((d) nf1Var).classGuid;
        connectionsManager.bindRequestToGuid(sendRequest, i);
    }

    @Override // rk1
    public final void D(uk1 uk1Var) {
    }

    @Override // rk1
    public final void M(uk1 uk1Var) {
    }

    @Override // rk1
    public final void m(uk1 uk1Var) {
    }

    @Override // rk1
    public final void B(uk1 uk1Var, int i) {
    }

    @Override // rk1
    public final void n(uk1 uk1Var, String str) {
    }

    @Override // rk1
    public final void U(uk1 uk1Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override // rk1
    public final void o(uk1 uk1Var, int i, int i2) {
    }

    @Override // rk1
    public final void u(uk1 uk1Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override // rk1
    public final void y(uk1 uk1Var, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
    }
}
