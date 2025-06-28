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

    b() {
    }

    b(Spliterator spliterator, int i, boolean z) {
        this();
        this.b = null;
        this.g = spliterator;
        this.a = this;
        int i2 = R2.g & i;
        this.c = i2;
        this.f = ((i2 << 1) ^ (-1)) & R2.l;
        this.e = 0;
        this.k = z;
    }

    b(b bVar, int i) {
        this();
        if (bVar.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        bVar.h = true;
        bVar.d = this;
        this.b = bVar;
        this.c = R2.h & i;
        this.f = R2.f(i, bVar.f);
        b bVar2 = bVar.a;
        this.a = bVar2;
        if (v0()) {
            bVar2.i = true;
        }
        this.e = bVar.e + 1;
    }

    private Spliterator x0(int i) {
        int i2;
        int i3;
        b bVar = this.a;
        Spliterator spliterator = bVar.g;
        if (spliterator == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        bVar.g = null;
        if (bVar.k && bVar.i) {
            b bVar2 = bVar.d;
            int i4 = 1;
            while (bVar != this) {
                int i5 = bVar2.c;
                if (bVar2.v0()) {
                    if (R2.SHORT_CIRCUIT.j(i5)) {
                        i5 &= R2.u ^ (-1);
                    }
                    spliterator = bVar2.u0(bVar, spliterator);
                    if (spliterator.hasCharacteristics(64)) {
                        i2 = (R2.t ^ (-1)) & i5;
                        i3 = R2.s;
                    } else {
                        i2 = (R2.s ^ (-1)) & i5;
                        i3 = R2.t;
                    }
                    i5 = i2 | i3;
                    i4 = 0;
                }
                bVar2.e = i4;
                bVar2.f = R2.f(i5, bVar.f);
                i4++;
                b bVar3 = bVar2;
                bVar2 = bVar2.d;
                bVar = bVar3;
            }
        }
        if (i != 0) {
            this.f = R2.f(i, this.f);
        }
        return spliterator;
    }

    final e2 A0(Spliterator spliterator, e2 e2Var) {
        e2Var.getClass();
        f0(spliterator, B0(e2Var));
        return e2Var;
    }

    final e2 B0(e2 e2Var) {
        e2Var.getClass();
        b bVar = this;
        while (bVar.e > 0) {
            b bVar2 = bVar.b;
            e2Var = bVar.w0(bVar2.f, e2Var);
            bVar = bVar2;
        }
        return e2Var;
    }

    final Spliterator C0(Spliterator spliterator) {
        return this.e == 0 ? spliterator : z0(this, new a(spliterator, 9), this.a.k);
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

    final void f0(Spliterator spliterator, e2 e2Var) {
        e2Var.getClass();
        if (R2.SHORT_CIRCUIT.j(this.f)) {
            g0(spliterator, e2Var);
            return;
        }
        e2Var.n(spliterator.getExactSizeIfKnown());
        spliterator.a(e2Var);
        e2Var.m();
    }

    final void g0(Spliterator spliterator, e2 e2Var) {
        b bVar = this;
        while (bVar.e > 0) {
            bVar = bVar.b;
        }
        e2Var.n(spliterator.getExactSizeIfKnown());
        bVar.m0(spliterator, e2Var);
        e2Var.m();
    }

    final G0 h0(Spliterator spliterator, boolean z, IntFunction intFunction) {
        if (this.a.k) {
            return k0(this, spliterator, z, intFunction);
        }
        y0 s0 = s0(l0(spliterator), intFunction);
        A0(spliterator, s0);
        return s0.b();
    }

    final Object i0(w3 w3Var) {
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        return this.a.k ? w3Var.c(this, x0(w3Var.d())) : w3Var.a(this, x0(w3Var.d()));
    }

    @Override // j$.util.stream.BaseStream
    public final boolean isParallel() {
        return this.a.k;
    }

    final G0 j0(IntFunction intFunction) {
        b bVar;
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        if (!this.a.k || (bVar = this.b) == null || !v0()) {
            return h0(x0(0), true, intFunction);
        }
        this.e = 0;
        return t0(bVar.x0(0), intFunction, bVar);
    }

    abstract G0 k0(b bVar, Spliterator spliterator, boolean z, IntFunction intFunction);

    final long l0(Spliterator spliterator) {
        if (R2.SIZED.j(this.f)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }

    abstract void m0(Spliterator spliterator, e2 e2Var);

    abstract S2 n0();

    final S2 o0() {
        b bVar = this;
        while (bVar.e > 0) {
            bVar = bVar.b;
        }
        return bVar.n0();
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream onClose(Runnable runnable) {
        b bVar = this.a;
        Runnable runnable2 = bVar.j;
        if (runnable2 != null) {
            runnable = new v3(runnable2, runnable);
        }
        bVar.j = runnable;
        return this;
    }

    final int p0() {
        return this.f;
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.E
    public final BaseStream parallel() {
        this.a.k = true;
        return this;
    }

    final boolean q0() {
        return R2.ORDERED.j(this.f);
    }

    final /* synthetic */ Spliterator r0() {
        return x0(0);
    }

    abstract y0 s0(long j, IntFunction intFunction);

    @Override // j$.util.stream.BaseStream, j$.util.stream.E
    public final BaseStream sequential() {
        this.a.k = false;
        return this;
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.E
    public Spliterator spliterator() {
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        b bVar = this.a;
        if (this != bVar) {
            return z0(this, new a(this, 0), bVar.k);
        }
        Spliterator spliterator = bVar.g;
        if (spliterator == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        bVar.g = null;
        return spliterator;
    }

    G0 t0(Spliterator spliterator, IntFunction intFunction, b bVar) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    Spliterator u0(b bVar, Spliterator spliterator) {
        return t0(spliterator, new l(12), bVar).spliterator();
    }

    abstract boolean v0();

    abstract e2 w0(int i, e2 e2Var);

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
        if (spliterator == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        bVar.g = null;
        return spliterator;
    }

    abstract Spliterator z0(b bVar, Supplier supplier, boolean z);
}
