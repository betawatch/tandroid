// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class gf3 extends q6b {
    public final /* synthetic */ of3 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf3(of3 of3Var) {
        super(null, false);
        this.S = of3Var;
    }

    @Override // q6b
    public final boolean c(TLRPC.Chat chat, TLRPC.User user) {
        return (((chat == null || chat.linked_community_id == 0) && (user == null || user.linked_community_id == 0)) || this.S.P0) ? false : true;
    }

    @Override // q6b
    public final boolean d(long j) {
        of3 of3Var = this.S;
        uj3 uj3Var = of3Var.E4;
        if (uj3Var == null || of3Var.P0) {
            return false;
        }
        int i = of3Var.G0;
        if (j > 0) {
            TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(j));
            if (X1 == null || X1.linked_community_id == 0) {
                return false;
            }
            uj3Var.showDialog(new xo2(uj3Var, X1.linked_community_id));
            return true;
        }
        TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(-j));
        if (M0 == null || M0.linked_community_id == 0) {
            return false;
        }
        uj3Var.showDialog(new xo2(uj3Var, M0.linked_community_id));
        return true;
    }

    @Override // q6b
    public final void e() {
        of3 of3Var = this.S;
        kf3 kf3Var = of3Var.e0;
        if (kf3Var == null) {
            return;
        }
        kf3Var.v(of3Var);
    }

    @Override // q6b
    public final void f(long j) {
        of3 of3Var = this.S;
        kf3 kf3Var = of3Var.e0;
        if (kf3Var == null) {
            return;
        }
        if (of3Var.K0 != 0) {
            kf3Var.r();
        } else {
            kf3Var.k(of3Var);
        }
    }
}
