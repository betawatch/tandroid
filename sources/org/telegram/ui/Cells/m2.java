package org.telegram.ui.Cells;

import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.zw;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class m2 extends di.o7 {
    public final /* synthetic */ t2 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(t2 t2Var) {
        super(null, false);
        this.S = t2Var;
    }

    @Override // di.o7
    public final boolean c(TLRPC.Chat chat, TLRPC.User user) {
        return (((chat == null || chat.linked_community_id == 0) && (user == null || user.linked_community_id == 0)) || this.S.O0) ? false : true;
    }

    @Override // di.o7
    public final boolean d(long j3) {
        t2 t2Var = this.S;
        int i7 = t2Var.F0;
        zw zwVar = t2Var.D4;
        if (zwVar == null || t2Var.O0) {
            return false;
        }
        if (j3 > 0) {
            TLRPC.User a22 = qp.s1(i7).a2(Long.valueOf(j3));
            if (a22 == null || a22.linked_community_id == 0) {
                return false;
            }
            zwVar.showDialog(new ii.d0(zwVar, a22.linked_community_id));
            return true;
        }
        TLRPC.Chat M0 = qp.s1(i7).M0(Long.valueOf(-j3));
        if (M0 == null || M0.linked_community_id == 0) {
            return false;
        }
        zwVar.showDialog(new ii.d0(zwVar, M0.linked_community_id));
        return true;
    }

    @Override // di.o7
    public final void e() {
        t2 t2Var = this.S;
        p2 p2Var = t2Var.d0;
        if (p2Var == null) {
            return;
        }
        p2Var.w(t2Var);
    }

    @Override // di.o7
    public final void f(long j3) {
        t2 t2Var = this.S;
        p2 p2Var = t2Var.d0;
        if (p2Var == null) {
            return;
        }
        if (t2Var.J0 != 0) {
            p2Var.q();
        } else {
            p2Var.u(t2Var);
        }
    }
}
