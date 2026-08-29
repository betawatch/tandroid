package l4;

import java.io.IOException;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class p0 implements c1 {
    public final int a;
    public final /* synthetic */ r0 b;

    public p0(r0 r0Var, int i10) {
        this.b = r0Var;
        this.a = i10;
    }

    @Override // l4.c1
    public final void a() {
        int i10 = this.a;
        r0 r0Var = this.b;
        r0Var.E[i10].w();
        com.google.android.exoplayer2.upstream.q0 q0Var = r0Var.v;
        int B = r0Var.d.B(r0Var.N);
        IOException iOException = q0Var.c;
        if (iOException != null) {
            throw iOException;
        }
        com.google.android.exoplayer2.upstream.m0 m0Var = q0Var.b;
        if (m0Var != null) {
            if (B == Integer.MIN_VALUE) {
                B = m0Var.a;
            }
            IOException iOException2 = m0Var.e;
            if (iOException2 != null && m0Var.f > B) {
                throw iOException2;
            }
        }
    }

    @Override // l4.c1
    public final int d(j3.u0 u0Var, m3.i iVar, int i10) {
        r0 r0Var = this.b;
        if (r0Var.w()) {
            return -3;
        }
        int i11 = this.a;
        r0Var.q(i11);
        int z10 = r0Var.E[i11].z(u0Var, iVar, i10, r0Var.W);
        if (z10 == -3) {
            r0Var.t(i11);
        }
        return z10;
    }

    @Override // l4.c1
    public final boolean e() {
        r0 r0Var = this.b;
        return !r0Var.w() && r0Var.E[this.a].u(r0Var.W);
    }

    @Override // l4.c1
    public final int i(long j10) {
        r0 r0Var = this.b;
        if (r0Var.w()) {
            return 0;
        }
        int i10 = this.a;
        r0Var.q(i10);
        b1 b1Var = r0Var.E[i10];
        int s10 = b1Var.s(j10, r0Var.W);
        b1Var.E(s10);
        if (s10 == 0) {
            r0Var.t(i10);
        }
        return s10;
    }
}
