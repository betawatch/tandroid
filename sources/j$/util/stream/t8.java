package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes4.dex */
public final class t8 extends b {
    public final a j;
    public final IntFunction k;
    public final boolean l;
    public long m;
    public boolean n;
    public volatile boolean o;

    public t8(a aVar, a aVar2, Spliterator spliterator, IntFunction intFunction) {
        super(aVar2, spliterator);
        this.j = aVar;
        this.k = intFunction;
        this.l = b7.ORDERED.n(aVar2.f);
    }

    @Override // j$.util.stream.d
    public final Object a() {
        z1 I = this.a.I(-1L, this.k);
        n5 M = this.j.M(this.a.f, I);
        a aVar = this.a;
        boolean A = aVar.A(this.b, aVar.R(M));
        this.n = A;
        if (A) {
            g();
        }
        h2 build = I.build();
        this.m = build.count();
        return build;
    }

    @Override // j$.util.stream.d
    public final d c(Spliterator spliterator) {
        return new t8(this, spliterator);
    }

    @Override // j$.util.stream.b
    public final void f() {
        this.i = true;
        if (this.l && this.o) {
            d(w3.G(this.j.H()));
        }
    }

    @Override // j$.util.stream.b
    public final Object h() {
        return w3.G(this.j.H());
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        Object E;
        d dVar = this.d;
        if (dVar != null) {
            this.n = ((t8) dVar).n | ((t8) this.e).n;
            if (this.l && this.i) {
                this.m = 0L;
                E = w3.G(this.j.H());
            } else {
                if (this.l) {
                    t8 t8Var = (t8) this.d;
                    if (t8Var.n) {
                        this.m = t8Var.m;
                        E = (h2) t8Var.i();
                    }
                }
                t8 t8Var2 = (t8) this.d;
                long j = t8Var2.m;
                t8 t8Var3 = (t8) this.e;
                this.m = j + t8Var3.m;
                E = t8Var2.m == 0 ? (h2) t8Var3.i() : t8Var3.m == 0 ? (h2) t8Var2.i() : w3.E(this.j.H(), (h2) ((t8) this.d).i(), (h2) ((t8) this.e).i());
            }
            d(E);
        }
        this.o = true;
        super.onCompletion(countedCompleter);
    }

    public t8(t8 t8Var, Spliterator spliterator) {
        super(t8Var, spliterator);
        this.j = t8Var.j;
        this.k = t8Var.k;
        this.l = t8Var.l;
    }
}
