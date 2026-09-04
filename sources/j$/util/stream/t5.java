package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class t5 extends b {
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
            d(t3.i0(this.j.M0()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e7, code lost:
    
        if (r2 >= r0) goto L49;
     */
    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCompletion(CountedCompleter countedCompleter) {
        t5 t5Var;
        e2 i02;
        d dVar = this.d;
        if (dVar != null) {
            this.n = ((t5) dVar).n + ((t5) this.e).n;
            if (this.i) {
                this.n = 0L;
                i02 = t3.i0(this.j.M0());
            } else {
                i02 = this.n == 0 ? t3.i0(this.j.M0()) : ((t5) this.d).n == 0 ? (e2) ((t5) this.e).i() : t3.e0(this.j.M0(), (e2) ((t5) this.d).i(), (e2) ((t5) this.e).i());
            }
            e2 e2Var = i02;
            if (b()) {
                e2Var = e2Var.e(this.l, this.m >= 0 ? Math.min(e2Var.count(), this.l + this.m) : this.n, this.k);
            }
            d(e2Var);
            this.o = true;
        }
        if (this.m >= 0 && !b()) {
            long j3 = this.l + this.m;
            long j10 = this.o ? this.n : j(j3);
            if (j10 < j3) {
                t5 t5Var2 = (t5) ((d) getCompleter());
                t5 t5Var3 = this;
                while (true) {
                    if (t5Var2 != null) {
                        if (t5Var3 == t5Var2.e && (t5Var = (t5) t5Var2.d) != null) {
                            long j11 = t5Var.j(j3) + j10;
                            if (j11 >= j3) {
                                break;
                            } else {
                                j10 = j11;
                            }
                        }
                        t5Var3 = t5Var2;
                        t5Var2 = (t5) ((d) t5Var2.getCompleter());
                    }
                }
            }
            g();
        }
        super.onCompletion(countedCompleter);
    }

    public t5(a aVar, t3 t3Var, Spliterator spliterator, IntFunction intFunction, long j3, long j10) {
        super(t3Var, spliterator);
        this.j = aVar;
        this.k = intFunction;
        this.l = j3;
        this.m = j10;
    }

    public t5(t5 t5Var, Spliterator spliterator) {
        super(t5Var, spliterator);
        this.j = t5Var.j;
        this.k = t5Var.k;
        this.l = t5Var.l;
        this.m = t5Var.m;
    }

    @Override // j$.util.stream.d
    public final d c(Spliterator spliterator) {
        return new t5(this, spliterator);
    }

    @Override // j$.util.stream.b
    public final Object h() {
        return t3.i0(this.j.M0());
    }

    @Override // j$.util.stream.d
    public final Object a() {
        if (b()) {
            v6 v6Var = v6.SIZED;
            a aVar = this.j;
            int i10 = aVar.j;
            int i11 = v6Var.e;
            w1 A0 = this.j.A0((i10 & i11) == i11 ? aVar.k0(this.b) : -1L, this.k);
            j5 Q0 = this.j.Q0(((a) this.a).m, A0);
            t3 t3Var = this.a;
            t3Var.g0(this.b, t3Var.G0(Q0));
            return A0.build();
        }
        w1 A02 = this.j.A0(-1L, this.k);
        if (this.l == 0) {
            j5 Q02 = this.j.Q0(((a) this.a).m, A02);
            t3 t3Var2 = this.a;
            t3Var2.g0(this.b, t3Var2.G0(Q02));
        } else {
            this.a.F0(this.b, A02);
        }
        e2 build = A02.build();
        this.n = build.count();
        this.o = true;
        this.b = null;
        return build;
    }

    public final long j(long j3) {
        if (this.o) {
            return this.n;
        }
        t5 t5Var = (t5) this.d;
        t5 t5Var2 = (t5) this.e;
        if (t5Var == null || t5Var2 == null) {
            return this.n;
        }
        long j10 = t5Var.j(j3);
        return j10 >= j3 ? j10 : t5Var2.j(j3) + j10;
    }
}
