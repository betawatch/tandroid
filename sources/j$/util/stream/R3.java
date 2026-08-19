package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class R3 extends b {
    public final a j;
    public final IntFunction k;
    public final boolean l;
    public long m;
    public boolean n;
    public volatile boolean o;

    @Override // j$.util.stream.b
    public final void f() {
        this.i = true;
        if (this.l && this.o) {
            d(q1.H(this.j.H()));
        }
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        Object F;
        d dVar = this.d;
        if (dVar != null) {
            this.n = ((R3) dVar).n | ((R3) this.e).n;
            if (this.l && this.i) {
                this.m = 0L;
                F = q1.H(this.j.H());
            } else {
                if (this.l) {
                    R3 r3 = (R3) this.d;
                    if (r3.n) {
                        this.m = r3.m;
                        F = (B0) r3.i();
                    }
                }
                R3 r32 = (R3) this.d;
                long j = r32.m;
                R3 r33 = (R3) this.e;
                this.m = j + r33.m;
                if (r32.m == 0) {
                    F = (B0) r33.i();
                } else if (r33.m == 0) {
                    F = (B0) r32.i();
                } else {
                    F = q1.F(this.j.H(), (B0) ((R3) this.d).i(), (B0) ((R3) this.e).i());
                }
            }
            d(F);
        }
        this.o = true;
        super.onCompletion(countedCompleter);
    }

    public R3(a aVar, a aVar2, Spliterator spliterator, IntFunction intFunction) {
        super(aVar2, spliterator);
        this.j = aVar;
        this.k = intFunction;
        this.l = S2.ORDERED.q(aVar2.f);
    }

    public R3(R3 r3, Spliterator spliterator) {
        super(r3, spliterator);
        this.j = r3.j;
        this.k = r3.k;
        this.l = r3.l;
    }

    @Override // j$.util.stream.d
    public final d c(Spliterator spliterator) {
        return new R3(this, spliterator);
    }

    @Override // j$.util.stream.b
    public final Object h() {
        return q1.H(this.j.H());
    }

    @Override // j$.util.stream.d
    public final Object a() {
        t0 I = this.a.I(-1L, this.k);
        f2 M = this.j.M(this.a.f, I);
        a aVar = this.a;
        boolean A = aVar.A(this.b, aVar.R(M));
        this.n = A;
        if (A) {
            g();
        }
        B0 a = I.a();
        this.m = a.count();
        return a;
    }
}
