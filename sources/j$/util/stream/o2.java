package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntFunction;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
final class o2 extends c {
    private final b j;
    private final IntFunction k;
    private final long l;
    private final long m;
    private long n;
    private volatile boolean o;

    o2(b bVar, b bVar2, Spliterator spliterator, IntFunction intFunction, long j, long j2) {
        super(bVar2, spliterator);
        this.j = bVar;
        this.k = intFunction;
        this.l = j;
        this.m = j2;
    }

    o2(o2 o2Var, Spliterator spliterator) {
        super(o2Var, spliterator);
        this.j = o2Var.j;
        this.k = o2Var.k;
        this.l = o2Var.l;
        this.m = o2Var.m;
    }

    private long j(long j) {
        if (this.o) {
            return this.n;
        }
        o2 o2Var = (o2) this.d;
        o2 o2Var2 = (o2) this.e;
        if (o2Var == null || o2Var2 == null) {
            return this.n;
        }
        long j2 = o2Var.j(j);
        return j2 >= j ? j2 : j2 + o2Var2.j(j);
    }

    @Override // j$.util.stream.e
    protected final Object a() {
        if (c()) {
            y0 s0 = this.j.s0(R2.SIZED.e(this.j.c) ? this.j.l0(this.b) : -1L, this.k);
            e2 w0 = this.j.w0(this.a.p0(), s0);
            b bVar = this.a;
            bVar.g0(this.b, bVar.B0(w0));
            return s0.b();
        }
        b bVar2 = this.a;
        y0 s02 = bVar2.s0(-1L, this.k);
        bVar2.A0(this.b, s02);
        G0 b = s02.b();
        this.n = b.count();
        this.o = true;
        this.b = null;
        return b;
    }

    @Override // j$.util.stream.e
    protected final e d(Spliterator spliterator) {
        return new o2(this, spliterator);
    }

    @Override // j$.util.stream.c
    protected final void g() {
        this.i = true;
        if (this.o) {
            e(u0.L(this.j.n0()));
        }
    }

    @Override // j$.util.stream.c
    protected final Object i() {
        return u0.L(this.j.n0());
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00df, code lost:
    
        if (r2 >= r0) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    @Override // j$.util.stream.e, java.util.concurrent.CountedCompleter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCompletion(CountedCompleter countedCompleter) {
        o2 o2Var;
        G0 I;
        e eVar = this.d;
        if (!(eVar == null)) {
            this.n = ((o2) eVar).n + ((o2) this.e).n;
            if (this.i) {
                this.n = 0L;
            } else if (this.n != 0) {
                I = ((o2) this.d).n == 0 ? (G0) ((o2) this.e).b() : u0.I(this.j.n0(), (G0) ((o2) this.d).b(), (G0) ((o2) this.e).b());
                G0 g0 = I;
                if (c()) {
                    g0 = g0.t(this.l, this.m >= 0 ? Math.min(g0.count(), this.l + this.m) : this.n, this.k);
                }
                e(g0);
                this.o = true;
            }
            I = u0.L(this.j.n0());
            G0 g02 = I;
            if (c()) {
            }
            e(g02);
            this.o = true;
        }
        if (this.m >= 0 && !c()) {
            long j = this.l + this.m;
            long j2 = this.o ? this.n : j(j);
            if (j2 < j) {
                o2 o2Var2 = (o2) ((e) getCompleter());
                o2 o2Var3 = this;
                while (true) {
                    if (o2Var2 != null) {
                        if (o2Var3 == o2Var2.e && (o2Var = (o2) o2Var2.d) != null) {
                            j2 += o2Var.j(j);
                            if (j2 >= j) {
                                break;
                            }
                        }
                        o2Var3 = o2Var2;
                        o2Var2 = (o2) ((e) o2Var2.getCompleter());
                    }
                }
            }
            h();
        }
        super.onCompletion(countedCompleter);
    }
}
