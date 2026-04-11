package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
final class w2 extends c {
    private final b j;
    private final IntFunction k;
    private final long l;
    private final long m;
    private long n;
    private volatile boolean o;

    @Override // j$.util.stream.c
    protected final void h() {
        this.i = true;
        if (this.o) {
            f(w0.L(this.j.H()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e9, code lost:
    
        if (r2 >= r0) goto L51;
     */
    @Override // j$.util.stream.e, java.util.concurrent.CountedCompleter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCompletion(CountedCompleter countedCompleter) {
        w2 w2Var;
        I0 L;
        e eVar = this.d;
        if (!(eVar == null)) {
            this.n = ((w2) eVar).n + ((w2) this.e).n;
            if (this.i) {
                this.n = 0L;
                L = w0.L(this.j.H());
            } else {
                L = this.n == 0 ? w0.L(this.j.H()) : ((w2) this.d).n == 0 ? (I0) ((w2) this.e).c() : w0.I(this.j.H(), (I0) ((w2) this.d).c(), (I0) ((w2) this.e).c());
            }
            I0 i0 = L;
            if (d()) {
                i0 = i0.h(this.l, this.m >= 0 ? Math.min(i0.count(), this.l + this.m) : this.n, this.k);
            }
            f(i0);
            this.o = true;
        }
        if (this.m >= 0 && !d()) {
            long j = this.l + this.m;
            long k = this.o ? this.n : k(j);
            if (k < j) {
                w2 w2Var2 = (w2) ((e) getCompleter());
                w2 w2Var3 = this;
                while (true) {
                    if (w2Var2 != null) {
                        if (w2Var3 == w2Var2.e && (w2Var = (w2) w2Var2.d) != null) {
                            k += w2Var.k(j);
                            if (k >= j) {
                                break;
                            }
                        }
                        w2Var3 = w2Var2;
                        w2Var2 = (w2) ((e) w2Var2.getCompleter());
                    }
                }
            }
            i();
        }
        super.onCompletion(countedCompleter);
    }

    w2(b bVar, b bVar2, Spliterator spliterator, IntFunction intFunction, long j, long j2) {
        super(bVar2, spliterator);
        this.j = bVar;
        this.k = intFunction;
        this.l = j;
        this.m = j2;
    }

    w2(w2 w2Var, Spliterator spliterator) {
        super(w2Var, spliterator);
        this.j = w2Var.j;
        this.k = w2Var.k;
        this.l = w2Var.l;
        this.m = w2Var.m;
    }

    @Override // j$.util.stream.e
    protected final e e(Spliterator spliterator) {
        return new w2(this, spliterator);
    }

    @Override // j$.util.stream.c
    protected final Object j() {
        return w0.L(this.j.H());
    }

    @Override // j$.util.stream.e
    protected final Object a() {
        if (d()) {
            A0 M = this.j.M(a3.SIZED.s(this.j.c) ? this.j.F(this.b) : -1L, this.k);
            m2 Q = this.j.Q(this.a.J(), M);
            b bVar = this.a;
            bVar.A(this.b, bVar.V(Q));
            return M.a();
        }
        A0 M2 = this.j.M(-1L, this.k);
        if (this.l == 0) {
            m2 Q2 = this.j.Q(this.a.J(), M2);
            b bVar2 = this.a;
            bVar2.A(this.b, bVar2.V(Q2));
        } else {
            this.a.U(this.b, M2);
        }
        I0 a = M2.a();
        this.n = a.count();
        this.o = true;
        this.b = null;
        return a;
    }

    private long k(long j) {
        if (this.o) {
            return this.n;
        }
        w2 w2Var = (w2) this.d;
        w2 w2Var2 = (w2) this.e;
        if (w2Var == null || w2Var2 == null) {
            return this.n;
        }
        long k = w2Var.k(j);
        return k >= j ? k : k + w2Var2.k(j);
    }
}
