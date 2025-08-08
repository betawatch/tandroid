package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntFunction;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
final class n2 extends c {
    private final b j;
    private final IntFunction k;
    private final long l;
    private final long m;
    private long n;
    private volatile boolean o;

    @Override // j$.util.stream.c
    protected final void g() {
        this.i = true;
        if (this.o) {
            e(t0.L(this.j.n0()));
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
        n2 n2Var;
        F0 L;
        e eVar = this.d;
        if (!(eVar == null)) {
            this.n = ((n2) eVar).n + ((n2) this.e).n;
            if (this.i) {
                this.n = 0L;
                L = t0.L(this.j.n0());
            } else {
                L = this.n == 0 ? t0.L(this.j.n0()) : ((n2) this.d).n == 0 ? (F0) ((n2) this.e).b() : t0.I(this.j.n0(), (F0) ((n2) this.d).b(), (F0) ((n2) this.e).b());
            }
            F0 f0 = L;
            if (c()) {
                f0 = f0.t(this.l, this.m >= 0 ? Math.min(f0.count(), this.l + this.m) : this.n, this.k);
            }
            e(f0);
            this.o = true;
        }
        if (this.m >= 0 && !c()) {
            long j = this.l + this.m;
            long j2 = this.o ? this.n : j(j);
            if (j2 < j) {
                n2 n2Var2 = (n2) ((e) getCompleter());
                n2 n2Var3 = this;
                while (true) {
                    if (n2Var2 != null) {
                        if (n2Var3 == n2Var2.e && (n2Var = (n2) n2Var2.d) != null) {
                            j2 += n2Var.j(j);
                            if (j2 >= j) {
                                break;
                            }
                        }
                        n2Var3 = n2Var2;
                        n2Var2 = (n2) ((e) n2Var2.getCompleter());
                    }
                }
            }
            h();
        }
        super.onCompletion(countedCompleter);
    }

    n2(b bVar, b bVar2, Spliterator spliterator, IntFunction intFunction, long j, long j2) {
        super(bVar2, spliterator);
        this.j = bVar;
        this.k = intFunction;
        this.l = j;
        this.m = j2;
    }

    n2(n2 n2Var, Spliterator spliterator) {
        super(n2Var, spliterator);
        this.j = n2Var.j;
        this.k = n2Var.k;
        this.l = n2Var.l;
        this.m = n2Var.m;
    }

    @Override // j$.util.stream.e
    protected final e d(Spliterator spliterator) {
        return new n2(this, spliterator);
    }

    @Override // j$.util.stream.c
    protected final Object i() {
        return t0.L(this.j.n0());
    }

    @Override // j$.util.stream.e
    protected final Object a() {
        if (c()) {
            x0 s0 = this.j.s0(Q2.SIZED.j(this.j.c) ? this.j.l0(this.b) : -1L, this.k);
            d2 w0 = this.j.w0(this.a.p0(), s0);
            b bVar = this.a;
            bVar.g0(this.b, bVar.B0(w0));
            return s0.b();
        }
        b bVar2 = this.a;
        x0 s02 = bVar2.s0(-1L, this.k);
        bVar2.A0(this.b, s02);
        F0 b = s02.b();
        this.n = b.count();
        this.o = true;
        this.b = null;
        return b;
    }

    private long j(long j) {
        if (this.o) {
            return this.n;
        }
        n2 n2Var = (n2) this.d;
        n2 n2Var2 = (n2) this.e;
        if (n2Var == null || n2Var2 == null) {
            return this.n;
        }
        long j2 = n2Var.j(j);
        return j2 >= j ? j2 : j2 + n2Var2.j(j);
    }
}
