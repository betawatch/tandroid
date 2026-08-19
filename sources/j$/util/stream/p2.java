package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class p2 extends b {
    public final a j;
    public final IntFunction k;
    public final long l;
    public final long m;
    public long n;
    public volatile boolean o;

    @Override // j$.util.stream.b
    public final void f() {
        this.i = true;
        if (this.o) {
            d(q1.H(this.j.H()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ea, code lost:
    
        if (r2 >= r0) goto L52;
     */
    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCompletion(CountedCompleter countedCompleter) {
        p2 p2Var;
        B0 H;
        d dVar = this.d;
        if (!(dVar == null)) {
            this.n = ((p2) dVar).n + ((p2) this.e).n;
            if (this.i) {
                this.n = 0L;
                H = q1.H(this.j.H());
            } else {
                H = this.n == 0 ? q1.H(this.j.H()) : ((p2) this.d).n == 0 ? (B0) ((p2) this.e).i() : q1.F(this.j.H(), (B0) ((p2) this.d).i(), (B0) ((p2) this.e).i());
            }
            B0 b0 = H;
            if (b()) {
                b0 = b0.f(this.l, this.m >= 0 ? Math.min(b0.count(), this.l + this.m) : this.n, this.k);
            }
            d(b0);
            this.o = true;
        }
        if (this.m >= 0 && !b()) {
            long j = this.l + this.m;
            long j2 = this.o ? this.n : j(j);
            if (j2 < j) {
                p2 p2Var2 = (p2) ((d) getCompleter());
                p2 p2Var3 = this;
                while (true) {
                    if (p2Var2 != null) {
                        if (p2Var3 == p2Var2.e && (p2Var = (p2) p2Var2.d) != null) {
                            long j3 = p2Var.j(j) + j2;
                            if (j3 >= j) {
                                break;
                            } else {
                                j2 = j3;
                            }
                        }
                        p2Var3 = p2Var2;
                        p2Var2 = (p2) ((d) p2Var2.getCompleter());
                    }
                }
            }
            g();
        }
        super.onCompletion(countedCompleter);
    }

    public p2(a aVar, a aVar2, Spliterator spliterator, IntFunction intFunction, long j, long j2) {
        super(aVar2, spliterator);
        this.j = aVar;
        this.k = intFunction;
        this.l = j;
        this.m = j2;
    }

    public p2(p2 p2Var, Spliterator spliterator) {
        super(p2Var, spliterator);
        this.j = p2Var.j;
        this.k = p2Var.k;
        this.l = p2Var.l;
        this.m = p2Var.m;
    }

    @Override // j$.util.stream.d
    public final d c(Spliterator spliterator) {
        return new p2(this, spliterator);
    }

    @Override // j$.util.stream.b
    public final Object h() {
        return q1.H(this.j.H());
    }

    @Override // j$.util.stream.d
    public final Object a() {
        if (b()) {
            S2 s2 = S2.SIZED;
            a aVar = this.j;
            int i = aVar.c;
            int i2 = s2.e;
            t0 I = this.j.I((i & i2) == i2 ? aVar.F(this.b) : -1L, this.k);
            f2 M = this.j.M(this.a.f, I);
            a aVar2 = this.a;
            aVar2.A(this.b, aVar2.R(M));
            return I.a();
        }
        t0 I2 = this.j.I(-1L, this.k);
        if (this.l == 0) {
            f2 M2 = this.j.M(this.a.f, I2);
            a aVar3 = this.a;
            aVar3.A(this.b, aVar3.R(M2));
        } else {
            this.a.Q(this.b, I2);
        }
        B0 a = I2.a();
        this.n = a.count();
        this.o = true;
        this.b = null;
        return a;
    }

    public final long j(long j) {
        if (this.o) {
            return this.n;
        }
        p2 p2Var = (p2) this.d;
        p2 p2Var2 = (p2) this.e;
        if (p2Var == null || p2Var2 == null) {
            return this.n;
        }
        long j2 = p2Var.j(j);
        return j2 >= j ? j2 : p2Var2.j(j) + j2;
    }
}
