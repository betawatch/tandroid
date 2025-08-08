package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntFunction;
import j$.util.function.Supplier;

/* loaded from: classes2.dex */
abstract class b implements BaseStream {
    private final b a;
    private final b b;
    protected final int c;
    private b d;
    private int e;
    private int f;
    private Spliterator g;
    private boolean h;
    private boolean i;
    private Runnable j;
    private boolean k;

    abstract F0 k0(b bVar, Spliterator spliterator, boolean z, IntFunction intFunction);

    abstract void m0(Spliterator spliterator, d2 d2Var);

    abstract R2 n0();

    abstract x0 s0(long j, IntFunction intFunction);

    abstract boolean v0();

    abstract d2 w0(int i, d2 d2Var);

    abstract Spliterator z0(b bVar, Supplier supplier, boolean z);

    b(Spliterator spliterator, int i, boolean z) {
        this.b = null;
        this.g = spliterator;
        this.a = this;
        int i2 = Q2.g & i;
        this.c = i2;
        this.f = (~(i2 << 1)) & Q2.l;
        this.e = 0;
        this.k = z;
    }

    b(b bVar, int i) {
        if (bVar.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        bVar.h = true;
        bVar.d = this;
        this.b = bVar;
        this.c = Q2.h & i;
        this.f = Q2.f(i, bVar.f);
        b bVar2 = bVar.a;
        this.a = bVar2;
        if (v0()) {
            bVar2.i = true;
        }
        this.e = bVar.e + 1;
    }

    final d2 A0(Spliterator spliterator, d2 d2Var) {
        d2Var.getClass();
        f0(spliterator, B0(d2Var));
        return d2Var;
    }

    final d2 B0(d2 d2Var) {
        d2Var.getClass();
        b bVar = this;
        while (bVar.e > 0) {
            b bVar2 = bVar.b;
            d2Var = bVar.w0(bVar2.f, d2Var);
            bVar = bVar2;
        }
        return d2Var;
    }

    final void f0(Spliterator spliterator, d2 d2Var) {
        d2Var.getClass();
        if (!Q2.SHORT_CIRCUIT.i(this.f)) {
            d2Var.n(spliterator.getExactSizeIfKnown());
            spliterator.a(d2Var);
            d2Var.m();
            return;
        }
        g0(spliterator, d2Var);
    }

    final Object i0(v3 v3Var) {
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        if (this.a.k) {
            return v3Var.c(this, x0(v3Var.d()));
        }
        return v3Var.a(this, x0(v3Var.d()));
    }

    final F0 j0(IntFunction intFunction) {
        b bVar;
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        if (this.a.k && (bVar = this.b) != null && v0()) {
            this.e = 0;
            return t0(bVar, bVar.x0(0), intFunction);
        }
        return h0(x0(0), true, intFunction);
    }

    final Spliterator y0() {
        b bVar = this.a;
        if (this != bVar) {
            throw new IllegalStateException();
        }
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        Spliterator spliterator = bVar.g;
        if (spliterator != null) {
            bVar.g = null;
            return spliterator;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream sequential() {
        this.a.k = false;
        return this;
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream parallel() {
        this.a.k = true;
        return this;
    }

    @Override // j$.util.stream.BaseStream, java.lang.AutoCloseable
    public final void close() {
        this.h = true;
        this.g = null;
        b bVar = this.a;
        Runnable runnable = bVar.j;
        if (runnable != null) {
            bVar.j = null;
            runnable.run();
        }
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream onClose(Runnable runnable) {
        b bVar = this.a;
        Runnable runnable2 = bVar.j;
        if (runnable2 != null) {
            runnable = new u3(runnable2, runnable);
        }
        bVar.j = runnable;
        return this;
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.D
    public Spliterator spliterator() {
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        b bVar = this.a;
        if (this == bVar) {
            Spliterator spliterator = bVar.g;
            if (spliterator != null) {
                bVar.g = null;
                return spliterator;
            }
            throw new IllegalStateException("source already consumed or closed");
        }
        return z0(this, new a(this, 0), bVar.k);
    }

    final /* synthetic */ Spliterator r0() {
        return x0(0);
    }

    final F0 h0(Spliterator spliterator, boolean z, IntFunction intFunction) {
        if (this.a.k) {
            return k0(this, spliterator, z, intFunction);
        }
        x0 s0 = s0(l0(spliterator), intFunction);
        A0(spliterator, s0);
        return s0.b();
    }

    @Override // j$.util.stream.BaseStream
    public final boolean isParallel() {
        return this.a.k;
    }

    private Spliterator x0(int i) {
        int i2;
        int i3;
        b bVar = this.a;
        Spliterator spliterator = bVar.g;
        if (spliterator != null) {
            bVar.g = null;
            if (bVar.k && bVar.i) {
                b bVar2 = bVar.d;
                int i4 = 1;
                while (bVar != this) {
                    int i5 = bVar2.c;
                    if (bVar2.v0()) {
                        if (Q2.SHORT_CIRCUIT.i(i5)) {
                            i5 &= ~Q2.u;
                        }
                        spliterator = bVar2.u0(bVar, spliterator);
                        if (spliterator.hasCharacteristics(64)) {
                            i2 = (~Q2.t) & i5;
                            i3 = Q2.s;
                        } else {
                            i2 = (~Q2.s) & i5;
                            i3 = Q2.t;
                        }
                        i5 = i2 | i3;
                        i4 = 0;
                    }
                    bVar2.e = i4;
                    bVar2.f = Q2.f(i5, bVar.f);
                    i4++;
                    b bVar3 = bVar2;
                    bVar2 = bVar2.d;
                    bVar = bVar3;
                }
            }
            if (i != 0) {
                this.f = Q2.f(i, this.f);
            }
            return spliterator;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    final R2 o0() {
        b bVar = this;
        while (bVar.e > 0) {
            bVar = bVar.b;
        }
        return bVar.n0();
    }

    final long l0(Spliterator spliterator) {
        if (Q2.SIZED.i(this.f)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }

    final void g0(Spliterator spliterator, d2 d2Var) {
        b bVar = this;
        while (bVar.e > 0) {
            bVar = bVar.b;
        }
        d2Var.n(spliterator.getExactSizeIfKnown());
        bVar.m0(spliterator, d2Var);
        d2Var.m();
    }

    final int p0() {
        return this.f;
    }

    final boolean q0() {
        return Q2.ORDERED.i(this.f);
    }

    final Spliterator C0(Spliterator spliterator) {
        return this.e == 0 ? spliterator : z0(this, new a(spliterator, 9), this.a.k);
    }

    F0 t0(b bVar, Spliterator spliterator, IntFunction intFunction) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    Spliterator u0(b bVar, Spliterator spliterator) {
        return t0(bVar, spliterator, new k(12)).spliterator();
    }
}
