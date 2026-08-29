package l4;

import j3.p2;
import j3.q2;
import j3.r2;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class q extends n {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(r2 r2Var, int i10) {
        super(r2Var);
        this.c = i10;
    }

    @Override // l4.n, j3.r2
    public int e(int i10, int i11, boolean z10) {
        switch (this.c) {
            case 0:
                r2 r2Var = this.b;
                int e10 = r2Var.e(i10, i11, z10);
                return e10 == -1 ? r2Var.a(z10) : e10;
            default:
                return super.e(i10, i11, z10);
        }
    }

    @Override // l4.n, j3.r2
    public p2 f(int i10, p2 p2Var, boolean z10) {
        switch (this.c) {
            case 1:
                super.f(i10, p2Var, z10);
                p2Var.f = true;
                return p2Var;
            default:
                return super.f(i10, p2Var, z10);
        }
    }

    @Override // l4.n, j3.r2
    public int k(int i10, int i11, boolean z10) {
        switch (this.c) {
            case 0:
                r2 r2Var = this.b;
                int k9 = r2Var.k(i10, i11, z10);
                return k9 == -1 ? r2Var.c(z10) : k9;
            default:
                return super.k(i10, i11, z10);
        }
    }

    @Override // l4.n, j3.r2
    public q2 m(int i10, q2 q2Var, long j10) {
        switch (this.c) {
            case 1:
                super.m(i10, q2Var, j10);
                q2Var.w = true;
                return q2Var;
            default:
                return super.m(i10, q2Var, j10);
        }
    }
}
