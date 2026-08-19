package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class Q3 extends d {
    public final a h;
    public final IntFunction i;
    public final boolean j;
    public long k;
    public long l;

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        d dVar = this.d;
        if (dVar != null) {
            if (this.j) {
                Q3 q3 = (Q3) dVar;
                long j = q3.l;
                this.l = j;
                if (j == q3.k) {
                    this.l = j + ((Q3) this.e).l;
                }
            }
            Q3 q32 = (Q3) dVar;
            long j2 = q32.k;
            Q3 q33 = (Q3) this.e;
            this.k = j2 + q33.k;
            B0 F = q32.k == 0 ? (B0) q33.f : q33.k == 0 ? (B0) q32.f : q1.F(this.h.H(), (B0) ((Q3) this.d).f, (B0) ((Q3) this.e).f);
            if (b() && this.j) {
                F = F.f(this.l, F.count(), this.i);
            }
            this.f = F;
        }
        super.onCompletion(countedCompleter);
    }

    public Q3(a aVar, a aVar2, Spliterator spliterator, IntFunction intFunction) {
        super(aVar2, spliterator);
        this.h = aVar;
        this.i = intFunction;
        this.j = S2.ORDERED.q(aVar2.f);
    }

    public Q3(Q3 q3, Spliterator spliterator) {
        super(q3, spliterator);
        this.h = q3.h;
        this.i = q3.i;
        this.j = q3.j;
    }

    @Override // j$.util.stream.d
    public final d c(Spliterator spliterator) {
        return new Q3(this, spliterator);
    }

    @Override // j$.util.stream.d
    public final Object a() {
        long j;
        boolean b = b();
        if (!b && this.j) {
            S2 s2 = S2.SIZED;
            a aVar = this.h;
            int i = aVar.c;
            int i2 = s2.e;
            if ((i & i2) == i2) {
                j = aVar.F(this.b);
                t0 I = this.a.I(j, this.i);
                P3 j2 = ((O3) this.h).j(I, (this.j || b) ? false : true);
                this.a.Q(this.b, j2);
                B0 a = I.a();
                this.k = a.count();
                this.l = j2.m();
                return a;
            }
        }
        j = -1;
        t0 I2 = this.a.I(j, this.i);
        P3 j22 = ((O3) this.h).j(I2, (this.j || b) ? false : true);
        this.a.Q(this.b, j22);
        B0 a2 = I2.a();
        this.k = a2.count();
        this.l = j22.m();
        return a2;
    }
}
