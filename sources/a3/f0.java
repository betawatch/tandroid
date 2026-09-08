package a3;

import android.os.SystemClock;
import b2.r0;
import b2.x1;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class f0 {
    public final n4.y a;
    public final a0 b;
    public final z c = new z();
    public final e2.a0 d = new e2.a0();
    public final e2.a0 e = new e2.a0();
    public final e2.q f;
    public long g;
    public long h;
    public long i;
    public x1 j;
    public long k;

    public f0(n4.y yVar, a0 a0Var) {
        this.a = yVar;
        this.b = a0Var;
        e2.q qVar = new e2.q();
        int highestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        qVar.a = 0;
        qVar.b = -1;
        qVar.c = 0;
        qVar.e = new long[highestOneBit];
        qVar.d = highestOneBit - 1;
        this.f = qVar;
        this.g = -9223372036854775807L;
        this.j = x1.d;
        this.h = -9223372036854775807L;
        this.i = -9223372036854775807L;
    }

    public final void a(long j3, long j10) {
        n4.y yVar = this.a;
        f fVar = (f) yVar.c;
        while (true) {
            e2.q qVar = this.f;
            int i10 = qVar.c;
            if (i10 == 0) {
                return;
            }
            if (i10 == 0) {
                throw new NoSuchElementException();
            }
            long j11 = ((long[]) qVar.e)[qVar.a];
            Long l4 = (Long) this.e.g(j11);
            a0 a0Var = this.b;
            if (l4 != null && l4.longValue() != this.k) {
                this.k = l4.longValue();
                a0Var.f(2);
            }
            long j12 = this.k;
            a0 a0Var2 = this.b;
            z zVar = this.c;
            int a2 = a0Var2.a(j11, j3, j10, j12, false, false, zVar);
            if (a2 == 0 || a2 == 1) {
                this.h = j11;
                boolean z10 = a2 == 0;
                long d = qVar.d();
                x1 x1Var = (x1) this.d.g(d);
                if (x1Var != null && !x1Var.equals(x1.d) && !x1Var.equals(this.j)) {
                    this.j = x1Var;
                    b2.r rVar = new b2.r();
                    rVar.x = x1Var.a;
                    rVar.y = x1Var.b;
                    rVar.q = r0.n("video/raw");
                    yVar.b = new b2.s(rVar);
                    fVar.h.execute(new e(yVar, x1Var));
                }
                long nanoTime = z10 ? System.nanoTime() : zVar.b;
                boolean z11 = a0Var.e != 3;
                a0Var.e = 3;
                a0Var.l.getClass();
                a0Var.g = e2.d0.Q(SystemClock.elapsedRealtime());
                if (z11 && fVar.d != null) {
                    fVar.h.execute(new e(0, yVar));
                }
                b2.s sVar = (b2.s) yVar.b;
                fVar.i.c(d, nanoTime, sVar == null ? new b2.s(new b2.r()) : sVar, null);
                j jVar = (j) fVar.c.remove();
                jVar.c.I0(jVar.a, jVar.b, nanoTime);
            } else if (a2 == 2 || a2 == 3) {
                this.h = j11;
                qVar.d();
                fVar.h.execute(new e(1, yVar));
                j jVar2 = (j) fVar.c.remove();
                jVar2.c.M0(jVar2.a, jVar2.b);
            } else {
                if (a2 != 4) {
                    if (a2 != 5) {
                        throw new IllegalStateException(String.valueOf(a2));
                    }
                    return;
                }
                this.h = j11;
            }
        }
    }
}
