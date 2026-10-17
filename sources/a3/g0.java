package a3;

import android.os.SystemClock;
import android.os.Trace;
import b2.a2;
import b2.v0;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class g0 {
    public final qf.b a;
    public final a0 b;
    public final z c = new z();
    public final e2.j0 d = new e2.j0();
    public final e2.j0 e = new e2.j0();
    public final e2.s f;
    public final b0 g;
    public long h;
    public long i;
    public long j;
    public a2 k;
    public long l;

    public g0(qf.b bVar, a0 a0Var, b0 b0Var) {
        this.a = bVar;
        this.b = a0Var;
        this.g = b0Var;
        e2.s sVar = new e2.s();
        int highestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        sVar.a = 0;
        sVar.b = -1;
        sVar.c = 0;
        sVar.e = new long[highestOneBit];
        sVar.d = highestOneBit - 1;
        this.f = sVar;
        this.h = -9223372036854775807L;
        this.k = a2.d;
        this.i = -9223372036854775807L;
        this.j = -9223372036854775807L;
    }

    public final void a(long j10, long j11) {
        final qf.b bVar = this.a;
        f fVar = (f) bVar.c;
        while (true) {
            e2.s sVar = this.f;
            int i10 = sVar.c;
            if (i10 == 0) {
                return;
            }
            if (i10 == 0) {
                throw new NoSuchElementException();
            }
            long j12 = ((long[]) sVar.e)[sVar.a];
            Long l4 = (Long) this.e.g(j12);
            a0 a0Var = this.b;
            if (l4 != null && l4.longValue() != this.l) {
                this.l = l4.longValue();
                a0Var.e(2);
            }
            long j13 = this.l;
            a0 a0Var2 = this.b;
            z zVar = this.c;
            int a2 = a0Var2.a(j12, j10, j11, j13, false, false, zVar);
            if (a2 != 5 && a2 != 4) {
                this.g.a(j12, zVar.a);
            }
            if (a2 == 0 || a2 == 1) {
                this.i = j12;
                boolean z10 = a2 == 0;
                long d = sVar.d();
                a2 a2Var = (a2) this.d.g(d);
                if (a2Var != null && !a2Var.equals(a2.d) && !a2Var.equals(this.k)) {
                    this.k = a2Var;
                    b2.v vVar = new b2.v();
                    vVar.y = a2Var.a;
                    vVar.z = a2Var.b;
                    vVar.r = v0.n("video/raw");
                    bVar.b = new b2.w(vVar);
                    fVar.i.execute(new a1.f(2, bVar, a2Var));
                }
                long nanoTime = z10 ? System.nanoTime() : zVar.b;
                boolean z11 = a0Var.e != 3;
                a0Var.e = 3;
                a0Var.l.getClass();
                a0Var.g = e2.m0.S(SystemClock.elapsedRealtime());
                if (z11 && fVar.e != null) {
                    final int i11 = 0;
                    fVar.i.execute(new Runnable() { // from class: a3.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    ((f) bVar.c).h.onFirstFrameRendered();
                                    break;
                                default:
                                    ((f) bVar.c).h.h();
                                    break;
                            }
                        }
                    });
                }
                b2.w wVar = (b2.w) bVar.b;
                fVar.j.a(d, nanoTime, wVar == null ? new b2.w(new b2.v()) : wVar, null);
                j jVar = (j) fVar.d.remove();
                jVar.c.M0(jVar.a, jVar.b, nanoTime);
            } else if (a2 == 2 || a2 == 3) {
                this.i = j12;
                sVar.d();
                final int i12 = 1;
                fVar.i.execute(new Runnable() { // from class: a3.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                ((f) bVar.c).h.onFirstFrameRendered();
                                break;
                            default:
                                ((f) bVar.c).h.h();
                                break;
                        }
                    }
                });
                j jVar2 = (j) fVar.d.remove();
                n nVar = jVar2.c;
                r2.l lVar = jVar2.a;
                int i13 = jVar2.b;
                Trace.beginSection("dropVideoBuffer");
                lVar.d(i13);
                Trace.endSection();
                nVar.R0(0, 1);
            } else {
                if (a2 != 4) {
                    if (a2 != 5) {
                        throw new IllegalStateException(String.valueOf(a2));
                    }
                    return;
                }
                this.i = j12;
            }
        }
    }
}
