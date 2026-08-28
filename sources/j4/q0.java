package j4;

import java.io.IOException;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class q0 implements b1 {
    public final int a;
    public final /* synthetic */ s0 b;

    public q0(s0 s0Var, int i9) {
        this.b = s0Var;
        this.a = i9;
    }

    @Override // j4.b1
    public final void a() {
        int i9 = this.a;
        s0 s0Var = this.b;
        s0Var.E[i9].w();
        com.google.android.exoplayer2.upstream.q0 q0Var = s0Var.v;
        int l32 = s0Var.d.l3(s0Var.N);
        IOException iOException = q0Var.c;
        if (iOException != null) {
            throw iOException;
        }
        com.google.android.exoplayer2.upstream.m0 m0Var = q0Var.b;
        if (m0Var != null) {
            if (l32 == Integer.MIN_VALUE) {
                l32 = m0Var.a;
            }
            IOException iOException2 = m0Var.e;
            if (iOException2 != null && m0Var.f > l32) {
                throw iOException2;
            }
        }
    }

    @Override // j4.b1
    public final boolean f() {
        s0 s0Var = this.b;
        return !s0Var.D() && s0Var.E[this.a].u(s0Var.W);
    }

    @Override // j4.b1
    public final int j(long j10) {
        s0 s0Var = this.b;
        if (s0Var.D()) {
            return 0;
        }
        int i9 = this.a;
        s0Var.s(i9);
        a1 a1Var = s0Var.E[i9];
        int s10 = a1Var.s(j10, s0Var.W);
        a1Var.E(s10);
        if (s10 == 0) {
            s0Var.t(i9);
        }
        return s10;
    }

    @Override // j4.b1
    public final int l(h3.u0 u0Var, k3.i iVar, int i9) {
        s0 s0Var = this.b;
        if (s0Var.D()) {
            return -3;
        }
        int i10 = this.a;
        s0Var.s(i10);
        int z10 = s0Var.E[i10].z(u0Var, iVar, i9, s0Var.W);
        if (z10 == -3) {
            s0Var.t(i10);
        }
        return z10;
    }
}
