package org.telegram.ui.Cells;

import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class m2 extends fi.h7 {
    public final /* synthetic */ t2 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(t2 t2Var) {
        super(null, false);
        this.S = t2Var;
    }

    @Override // fi.h7
    public final boolean c(TLRPC.Chat chat, TLRPC.User user) {
        return (((chat == null || chat.linked_community_id == 0) && (user == null || user.linked_community_id == 0)) || this.S.P0) ? false : true;
    }

    @Override // fi.h7
    public final boolean d(long j3) {
        t2 t2Var = this.S;
        int i7 = t2Var.G0;
        yw ywVar = t2Var.E4;
        if (ywVar == null || t2Var.P0) {
            return false;
        }
        if (j3 > 0) {
            TLRPC.User a22 = np.s1(i7).a2(Long.valueOf(j3));
            if (a22 == null || a22.linked_community_id == 0) {
                return false;
            }
            ywVar.showDialog(new li.d0(ywVar, a22.linked_community_id));
            return true;
        }
        TLRPC.Chat M0 = np.s1(i7).M0(Long.valueOf(-j3));
        if (M0 == null || M0.linked_community_id == 0) {
            return false;
        }
        ywVar.showDialog(new li.d0(ywVar, M0.linked_community_id));
        return true;
    }

    @Override // fi.h7
    public final void e() {
        t2 t2Var = this.S;
        p2 p2Var = t2Var.e0;
        if (p2Var == null) {
            return;
        }
        p2Var.w(t2Var);
    }

    @Override // fi.h7
    public final void f(long j3) {
        t2 t2Var = this.S;
        p2 p2Var = t2Var.e0;
        if (p2Var == null) {
            return;
        }
        if (t2Var.K0 != 0) {
            p2Var.q();
        } else {
            p2Var.u(t2Var);
        }
    }
}
