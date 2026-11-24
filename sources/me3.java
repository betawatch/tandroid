// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class me3 extends u2b {
    public final /* synthetic */ ue3 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me3(ue3 ue3Var) {
        super(null, false);
        this.S = ue3Var;
    }

    @Override // u2b
    public final boolean c(TLRPC.Chat chat, TLRPC.User user) {
        return (((chat == null || chat.linked_community_id == 0) && (user == null || user.linked_community_id == 0)) || this.S.P0) ? false : true;
    }

    @Override // u2b
    public final boolean d(long j) {
        ue3 ue3Var = this.S;
        cj3 cj3Var = ue3Var.E4;
        if (cj3Var == null || ue3Var.P0) {
            return false;
        }
        int i = ue3Var.G0;
        if (j > 0) {
            TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(j));
            if (V1 == null || V1.linked_community_id == 0) {
                return false;
            }
            cj3Var.showDialog(new eo2(cj3Var, V1.linked_community_id));
            return true;
        }
        TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(-j));
        if (K0 == null || K0.linked_community_id == 0) {
            return false;
        }
        cj3Var.showDialog(new eo2(cj3Var, K0.linked_community_id));
        return true;
    }

    @Override // u2b
    public final void e() {
        ue3 ue3Var = this.S;
        qe3 qe3Var = ue3Var.e0;
        if (qe3Var == null) {
            return;
        }
        qe3Var.v(ue3Var);
    }

    @Override // u2b
    public final void f(long j) {
        ue3 ue3Var = this.S;
        qe3 qe3Var = ue3Var.e0;
        if (qe3Var == null) {
            return;
        }
        if (ue3Var.K0 != 0) {
            qe3Var.s();
        } else {
            qe3Var.k(ue3Var);
        }
    }
}
