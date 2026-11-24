package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public final class x5 extends b {
    public final a j;
    public final IntFunction k;
    public final long l;
    public final long m;
    public long n;
    public volatile boolean o;

    public x5(x5 x5Var, Spliterator spliterator) {
        super(x5Var, spliterator);
        this.j = x5Var.j;
        this.k = x5Var.k;
        this.l = x5Var.l;
        this.m = x5Var.m;
    }

    @Override // j$.util.stream.d
    public final Object a() {
        if (b()) {
            b7 b7Var = b7.SIZED;
            a aVar = this.j;
            int i = aVar.c;
            int i2 = b7Var.e;
            z1 I = this.j.I((i & i2) == i2 ? aVar.F(this.b) : -1L, this.k);
            n5 M = this.j.M(this.a.f, I);
            a aVar2 = this.a;
            aVar2.A(this.b, aVar2.R(M));
            return I.build();
        }
        z1 I2 = this.j.I(-1L, this.k);
        if (this.l == 0) {
            n5 M2 = this.j.M(this.a.f, I2);
            a aVar3 = this.a;
            aVar3.A(this.b, aVar3.R(M2));
        } else {
            this.a.Q(this.b, I2);
        }
        h2 build = I2.build();
        this.n = build.count();
        this.o = true;
        this.b = null;
        return build;
    }

    @Override // j$.util.stream.d
    public final d c(Spliterator spliterator) {
        return new x5(this, spliterator);
    }

    @Override // j$.util.stream.b
    public final void f() {
        this.i = true;
        if (this.o) {
            d(w3.G(this.j.H()));
        }
    }

    @Override // j$.util.stream.b
    public final Object h() {
        return w3.G(this.j.H());
    }

    public final long j(long j) {
        if (this.o) {
            return this.n;
        }
        x5 x5Var = (x5) this.d;
        x5 x5Var2 = (x5) this.e;
        if (x5Var == null || x5Var2 == null) {
            return this.n;
        }
        long j2 = x5Var.j(j);
        return j2 >= j ? j2 : x5Var2.j(j) + j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e3, code lost:
    
        if (r2 >= r0) goto L46;
     */
    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCompletion(CountedCompleter countedCompleter) {
        x5 x5Var;
        h2 G;
        d dVar = this.d;
        if (dVar != null) {
            this.n = ((x5) dVar).n + ((x5) this.e).n;
            if (this.i) {
                this.n = 0L;
                G = w3.G(this.j.H());
            } else {
                G = this.n == 0 ? w3.G(this.j.H()) : ((x5) this.d).n == 0 ? (h2) ((x5) this.e).i() : w3.E(this.j.H(), (h2) ((x5) this.d).i(), (h2) ((x5) this.e).i());
            }
            h2 h2Var = G;
            if (b()) {
                h2Var = h2Var.e(this.l, this.m >= 0 ? Math.min(h2Var.count(), this.l + this.m) : this.n, this.k);
            }
            d(h2Var);
            this.o = true;
        }
        if (this.m >= 0 && !b()) {
            long j = this.l + this.m;
            long j2 = this.o ? this.n : j(j);
            if (j2 < j) {
                x5 x5Var2 = (x5) ((d) getCompleter());
                x5 x5Var3 = this;
                while (true) {
                    if (x5Var2 != null) {
                        if (x5Var3 == x5Var2.e && (x5Var = (x5) x5Var2.d) != null) {
                            long j3 = x5Var.j(j) + j2;
                            if (j3 >= j) {
                                break;
                            } else {
                                j2 = j3;
                            }
                        }
                        x5Var3 = x5Var2;
                        x5Var2 = (x5) ((d) x5Var2.getCompleter());
                    }
                }
            }
            g();
        }
        super.onCompletion(countedCompleter);
    }

    public x5(a aVar, a aVar2, Spliterator spliterator, IntFunction intFunction, long j, long j2) {
        super(aVar2, spliterator);
        this.j = aVar;
        this.k = intFunction;
        this.l = j;
        this.m = j2;
    }
}
