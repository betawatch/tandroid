package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class q8 extends b {
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
            d(t3.i0(this.j.M0()));
        }
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        Object e02;
        d dVar = this.d;
        if (dVar != null) {
            this.n = ((q8) dVar).n | ((q8) this.e).n;
            if (this.l && this.i) {
                this.m = 0L;
                e02 = t3.i0(this.j.M0());
            } else {
                if (this.l) {
                    q8 q8Var = (q8) this.d;
                    if (q8Var.n) {
                        this.m = q8Var.m;
                        e02 = (e2) q8Var.i();
                    }
                }
                q8 q8Var2 = (q8) this.d;
                long j10 = q8Var2.m;
                q8 q8Var3 = (q8) this.e;
                this.m = j10 + q8Var3.m;
                if (q8Var2.m == 0) {
                    e02 = (e2) q8Var3.i();
                } else if (q8Var3.m == 0) {
                    e02 = (e2) q8Var2.i();
                } else {
                    e02 = t3.e0(this.j.M0(), (e2) ((q8) this.d).i(), (e2) ((q8) this.e).i());
                }
            }
            d(e02);
        }
        this.o = true;
        super.onCompletion(countedCompleter);
    }

    public q8(a aVar, t3 t3Var, Spliterator spliterator, IntFunction intFunction) {
        super(t3Var, spliterator);
        this.j = aVar;
        this.k = intFunction;
        this.l = v6.ORDERED.m(((a) t3Var).m);
    }

    public q8(q8 q8Var, Spliterator spliterator) {
        super(q8Var, spliterator);
        this.j = q8Var.j;
        this.k = q8Var.k;
        this.l = q8Var.l;
    }

    @Override // j$.util.stream.d
    public final d c(Spliterator spliterator) {
        return new q8(this, spliterator);
    }

    @Override // j$.util.stream.b
    public final Object h() {
        return t3.i0(this.j.M0());
    }

    @Override // j$.util.stream.d
    public final Object a() {
        w1 A0 = this.a.A0(-1L, this.k);
        j5 Q0 = this.j.Q0(((a) this.a).m, A0);
        t3 t3Var = this.a;
        boolean g02 = t3Var.g0(this.b, t3Var.G0(Q0));
        this.n = g02;
        if (g02) {
            g();
        }
        e2 build = A0.build();
        this.m = build.count();
        return build;
    }
}
