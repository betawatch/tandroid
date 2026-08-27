package l4;

import com.google.android.exoplayer2.upstream.q;
import com.google.android.exoplayer2.upstream.x0;
import g7.l0;
import h3.t0;
import j4.a1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
            g5.b bVar = this.x;
            d5.a.j(bVar);
            long j10 = this.B;
            for (a1 a1Var : (a1[]) bVar.c) {
                if (a1Var.F != j10) {
                    a1Var.F = j10;
                    a1Var.z = true;
                }
            }
            d dVar = this.C;
            long j11 = this.v;
            long j12 = j11 == -9223372036854775807L ? -9223372036854775807L : j11 - this.B;
            long j13 = this.w;
            dVar.a(bVar, j12, j13 != -9223372036854775807L ? j13 - this.B : -9223372036854775807L);
        }
        try {
            q a2 = this.b.a(this.D);
            x0 x0Var = this.r;
            m3.h hVar = new m3.h(x0Var, a2.e, x0Var.open(a2));
            while (!this.E) {
                try {
                    int b10 = this.C.a.b(hVar, d.s);
                    d5.a.i(b10 != 1);
                    if (!(b10 == 0)) {
                        break;
                    }
                } finally {
                    this.D = hVar.d - this.b.e;
                }
            }
            l0.a(this.r);
            this.F = !this.E;
        } catch (Throwable th) {
            l0.a(this.r);
            throw th;
        }
    }

    @Override // l4.k
    public final long b() {
        return this.s + this.A;
    }

    @Override // l4.k
    public final boolean c() {
        return this.F;
    }

    @Override // com.google.android.exoplayer2.upstream.n0
    public final void l() {
        this.E = true;
    }
}
