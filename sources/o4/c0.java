package o4;

import java.io.IOException;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class c0 implements l0 {
    public final int a;
    public final /* synthetic */ e0 b;

    public c0(e0 e0Var, int i10) {
        this.b = e0Var;
        this.a = i10;
    }

    @Override // o4.l0
    public final void a() {
        int i10 = this.a;
        e0 e0Var = this.b;
        e0Var.F[i10].w();
        g5.m0 m0Var = e0Var.v;
        int n32 = e0Var.d.n3(e0Var.O);
        IOException iOException = m0Var.c;
        if (iOException != null) {
            throw iOException;
        }
        g5.i0 i0Var = m0Var.b;
        if (i0Var != null) {
            if (n32 == Integer.MIN_VALUE) {
                n32 = i0Var.a;
            }
            IOException iOException2 = i0Var.e;
            if (iOException2 != null && i0Var.f > n32) {
                throw iOException2;
            }
        }
    }

    @Override // o4.l0
    public final boolean h() {
        e0 e0Var = this.b;
        return !e0Var.B() && e0Var.F[this.a].u(e0Var.X);
    }

    @Override // o4.l0
    public final int l(long j10) {
        e0 e0Var = this.b;
        if (e0Var.B()) {
            return 0;
        }
        int i10 = this.a;
        e0Var.w(i10);
        k0 k0Var = e0Var.F[i10];
        int s6 = k0Var.s(j10, e0Var.X);
        k0Var.E(s6);
        if (s6 == 0) {
            e0Var.y(i10);
        }
        return s6;
    }

    @Override // o4.l0
    public final int p(f7.b bVar, n3.i iVar, int i10) {
        e0 e0Var = this.b;
        if (e0Var.B()) {
            return -3;
        }
        int i11 = this.a;
        e0Var.w(i11);
        int z4 = e0Var.F[i11].z(bVar, iVar, i10, e0Var.X);
        if (z4 == -3) {
            e0Var.y(i11);
        }
        return z4;
    }
}
