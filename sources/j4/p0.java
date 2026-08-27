package j4;

import java.io.IOException;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class p0 implements b1 {
    public final int a;
    public final /* synthetic */ r0 b;

    public p0(r0 r0Var, int i10) {
        this.b = r0Var;
        this.a = i10;
    }

    @Override // j4.b1
    public final void a() {
        int i10 = this.a;
        r0 r0Var = this.b;
        r0Var.D[i10].w();
        com.google.android.exoplayer2.upstream.q0 q0Var = r0Var.s;
        int z32 = r0Var.d.z3(r0Var.M);
        IOException iOException = q0Var.c;
        if (iOException != null) {
            throw iOException;
        }
        com.google.android.exoplayer2.upstream.m0 m0Var = q0Var.b;
        if (m0Var != null) {
            if (z32 == Integer.MIN_VALUE) {
                z32 = m0Var.a;
            }
            IOException iOException2 = m0Var.e;
            if (iOException2 != null && m0Var.f > z32) {
                throw iOException2;
            }
        }
    }

    @Override // j4.b1
    public final boolean e() {
        r0 r0Var = this.b;
        return !r0Var.v() && r0Var.D[this.a].u(r0Var.V);
    }

    @Override // j4.b1
    public final int f(long j10) {
        r0 r0Var = this.b;
        if (r0Var.v()) {
            return 0;
        }
        int i10 = this.a;
        r0Var.r(i10);
        a1 a1Var = r0Var.D[i10];
        int s10 = a1Var.s(j10, r0Var.V);
        a1Var.E(s10);
        if (s10 == 0) {
            r0Var.s(i10);
        }
        return s10;
    }

    @Override // j4.b1
    public final int i(h3.u0 u0Var, k3.i iVar, int i10) {
        r0 r0Var = this.b;
        if (r0Var.v()) {
            return -3;
        }
        int i11 = this.a;
        r0Var.r(i11);
        int z10 = r0Var.D[i11].z(u0Var, iVar, i10, r0Var.V);
        if (z10 == -3) {
            r0Var.s(i11);
        }
        return z10;
    }
}
