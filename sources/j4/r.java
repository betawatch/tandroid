package j4;

import h3.p2;
import h3.q2;
import h3.r2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class r extends o {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(r2 r2Var, int i9) {
        super(r2Var);
        this.c = i9;
    }

    @Override // j4.o, h3.r2
    public int e(int i9, int i10, boolean z10) {
        switch (this.c) {
            case 0:
                r2 r2Var = this.b;
                int e10 = r2Var.e(i9, i10, z10);
                return e10 == -1 ? r2Var.a(z10) : e10;
            default:
                return super.e(i9, i10, z10);
        }
    }

    @Override // j4.o, h3.r2
    public p2 f(int i9, p2 p2Var, boolean z10) {
        switch (this.c) {
            case 1:
                super.f(i9, p2Var, z10);
                p2Var.f = true;
                return p2Var;
            default:
                return super.f(i9, p2Var, z10);
        }
    }

    @Override // j4.o, h3.r2
    public int k(int i9, int i10, boolean z10) {
        switch (this.c) {
            case 0:
                r2 r2Var = this.b;
                int k10 = r2Var.k(i9, i10, z10);
                return k10 == -1 ? r2Var.c(z10) : k10;
            default:
                return super.k(i9, i10, z10);
        }
    }

    @Override // j4.o, h3.r2
    public q2 m(int i9, q2 q2Var, long j10) {
        switch (this.c) {
            case 1:
                super.m(i9, q2Var, j10);
                q2Var.w = true;
                return q2Var;
            default:
                return super.m(i9, q2Var, j10);
        }
    }
}
