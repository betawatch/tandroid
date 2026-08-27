package j4;

import h3.p2;
import h3.r2;
import h3.s2;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class q extends n {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(s2 s2Var, int i10) {
        super(s2Var);
        this.c = i10;
    }

    @Override // j4.n, h3.s2
    public int e(int i10, int i11, boolean z10) {
        switch (this.c) {
            case 0:
                s2 s2Var = this.b;
                int e9 = s2Var.e(i10, i11, z10);
                return e9 == -1 ? s2Var.a(z10) : e9;
            default:
                return super.e(i10, i11, z10);
        }
    }

    @Override // j4.n, h3.s2
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

    @Override // j4.n, h3.s2
    public int k(int i10, int i11, boolean z10) {
        switch (this.c) {
            case 0:
                s2 s2Var = this.b;
                int k10 = s2Var.k(i10, i11, z10);
                return k10 == -1 ? s2Var.c(z10) : k10;
            default:
                return super.k(i10, i11, z10);
        }
    }

    @Override // j4.n, h3.s2
    public r2 m(int i10, r2 r2Var, long j10) {
        switch (this.c) {
            case 1:
                super.m(i10, r2Var, j10);
                r2Var.w = true;
                return r2Var;
            default:
                return super.m(i10, r2Var, j10);
        }
    }
}
