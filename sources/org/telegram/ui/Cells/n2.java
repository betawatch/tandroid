package org.telegram.ui.Cells;

import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.bx;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class n2 extends fi.e7 {
    public final /* synthetic */ u2 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(u2 u2Var) {
        super(null, false);
        this.S = u2Var;
    }

    @Override // fi.e7
    public final boolean c(TLRPC.Chat chat, TLRPC.User user) {
        return (((chat == null || chat.linked_community_id == 0) && (user == null || user.linked_community_id == 0)) || this.S.P0) ? false : true;
    }

    @Override // fi.e7
    public final boolean d(long j3) {
        u2 u2Var = this.S;
        int i7 = u2Var.G0;
        bx bxVar = u2Var.E4;
        if (bxVar == null || u2Var.P0) {
            return false;
        }
        if (j3 > 0) {
            TLRPC.User c22 = mp.u1(i7).c2(Long.valueOf(j3));
            if (c22 == null || c22.linked_community_id == 0) {
                return false;
            }
            bxVar.showDialog(new li.c0(bxVar, c22.linked_community_id));
            return true;
        }
        TLRPC.Chat O0 = mp.u1(i7).O0(Long.valueOf(-j3));
        if (O0 == null || O0.linked_community_id == 0) {
            return false;
        }
        bxVar.showDialog(new li.c0(bxVar, O0.linked_community_id));
        return true;
    }

    @Override // fi.e7
    public final void e() {
        u2 u2Var = this.S;
        q2 q2Var = u2Var.e0;
        if (q2Var == null) {
            return;
        }
        q2Var.w(u2Var);
    }

    @Override // fi.e7
    public final void f(long j3) {
        u2 u2Var = this.S;
        q2 q2Var = u2Var.e0;
        if (q2Var == null) {
            return;
        }
        if (u2Var.K0 != 0) {
            q2Var.q();
        } else {
            q2Var.u(u2Var);
        }
    }
}
