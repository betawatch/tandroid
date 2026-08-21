package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class q2 extends b {
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
            d(r1.H(this.j.H()));
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
        q2 q2Var;
        C0 H;
        d dVar = this.d;
        if (!(dVar == null)) {
            this.n = ((q2) dVar).n + ((q2) this.e).n;
            if (this.i) {
                this.n = 0L;
                H = r1.H(this.j.H());
            } else {
                H = this.n == 0 ? r1.H(this.j.H()) : ((q2) this.d).n == 0 ? (C0) ((q2) this.e).i() : r1.F(this.j.H(), (C0) ((q2) this.d).i(), (C0) ((q2) this.e).i());
            }
            C0 c0 = H;
            if (b()) {
                c0 = c0.f(this.l, this.m >= 0 ? Math.min(c0.count(), this.l + this.m) : this.n, this.k);
            }
            d(c0);
            this.o = true;
        }
        if (this.m >= 0 && !b()) {
            long j = this.l + this.m;
            long j2 = this.o ? this.n : j(j);
            if (j2 < j) {
                q2 q2Var2 = (q2) ((d) getCompleter());
                q2 q2Var3 = this;
                while (true) {
                    if (q2Var2 != null) {
                        if (q2Var3 == q2Var2.e && (q2Var = (q2) q2Var2.d) != null) {
                            long j3 = q2Var.j(j) + j2;
                            if (j3 >= j) {
                                break;
                            } else {
                                j2 = j3;
                            }
                        }
                        q2Var3 = q2Var2;
                        q2Var2 = (q2) ((d) q2Var2.getCompleter());
                    }
                }
            }
            g();
        }
        super.onCompletion(countedCompleter);
    }

    public q2(a aVar, a aVar2, Spliterator spliterator, IntFunction intFunction, long j, long j2) {
        super(aVar2, spliterator);
        this.j = aVar;
        this.k = intFunction;
        this.l = j;
        this.m = j2;
    }

    public q2(q2 q2Var, Spliterator spliterator) {
        super(q2Var, spliterator);
        this.j = q2Var.j;
        this.k = q2Var.k;
        this.l = q2Var.l;
        this.m = q2Var.m;
    }

    @Override // j$.util.stream.d
    public final d c(Spliterator spliterator) {
        return new q2(this, spliterator);
    }

    @Override // j$.util.stream.b
    public final Object h() {
        return r1.H(this.j.H());
    }

    @Override // j$.util.stream.d
    public final Object a() {
        if (b()) {
            S2 s2 = S2.SIZED;
            a aVar = this.j;
            int i = aVar.c;
            int i2 = s2.e;
            u0 I = this.j.I((i & i2) == i2 ? aVar.F(this.b) : -1L, this.k);
            g2 M = this.j.M(this.a.f, I);
            a aVar2 = this.a;
            aVar2.A(this.b, aVar2.R(M));
            return I.a();
        }
        u0 I2 = this.j.I(-1L, this.k);
        if (this.l == 0) {
            g2 M2 = this.j.M(this.a.f, I2);
            a aVar3 = this.a;
            aVar3.A(this.b, aVar3.R(M2));
        } else {
            this.a.Q(this.b, I2);
        }
        C0 a = I2.a();
        this.n = a.count();
        this.o = true;
        this.b = null;
        return a;
    }

    public final long j(long j) {
        if (this.o) {
            return this.n;
        }
        q2 q2Var = (q2) this.d;
        q2 q2Var2 = (q2) this.e;
        if (q2Var == null || q2Var2 == null) {
            return this.n;
        }
        long j2 = q2Var.j(j);
        return j2 >= j ? j2 : q2Var2.j(j) + j2;
    }
}
