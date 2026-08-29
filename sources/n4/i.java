package n4;

import com.google.android.exoplayer2.upstream.q;
import com.google.android.exoplayer2.upstream.x0;
import h7.m5;
import j3.t0;
import l4.b1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class i extends a {
    public final int A;
    public final long B;
    public final d C;
    public long D;
    public volatile boolean E;
    public boolean F;

    public i(com.google.android.exoplayer2.upstream.m mVar, q qVar, t0 t0Var, int i10, Object obj, long j10, long j11, long j12, long j13, long j14, int i11, long j15, d dVar) {
        super(mVar, qVar, t0Var, i10, obj, j10, j11, j12, j13, j14);
        this.A = i11;
        this.B = j15;
        this.C = dVar;
    }

    @Override // com.google.android.exoplayer2.upstream.n0
    public final void a() {
        if (this.D == 0) {
            g9.l lVar = this.x;
            f5.a.j(lVar);
            long j10 = this.B;
            for (b1 b1Var : (b1[]) lVar.c) {
                if (b1Var.F != j10) {
                    b1Var.F = j10;
                    b1Var.z = true;
                }
            }
            d dVar = this.C;
            long j11 = this.v;
            long j12 = j11 == -9223372036854775807L ? -9223372036854775807L : j11 - this.B;
            long j13 = this.w;
            dVar.a(lVar, j12, j13 != -9223372036854775807L ? j13 - this.B : -9223372036854775807L);
        }
        try {
            q a2 = this.b.a(this.D);
            x0 x0Var = this.r;
            o3.h hVar = new o3.h(x0Var, a2.e, x0Var.open(a2));
            while (!this.E) {
                try {
                    int d = this.C.a.d(hVar, d.s);
                    f5.a.i(d != 1);
                    if (!(d == 0)) {
                        break;
                    }
                } finally {
                    this.D = hVar.d - this.b.e;
                }
            }
            m5.a(this.r);
            this.F = !this.E;
        } catch (Throwable th2) {
            m5.a(this.r);
            throw th2;
        }
    }

    @Override // n4.k
    public final long b() {
        return this.s + this.A;
    }

    @Override // n4.k
    public final boolean c() {
        return this.F;
    }

    @Override // com.google.android.exoplayer2.upstream.n0
    public final void q() {
        this.E = true;
    }
}
