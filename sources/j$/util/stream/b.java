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
        this.f = R2.a(i, bVar.f);
        b bVar2 = bVar.a;
        this.a = bVar2;
        if (w0()) {
            bVar2.i = true;
        }
        this.e = bVar.e + 1;
    }

    private Spliterator y0(int i) {
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
                if (bVar2.w0()) {
                    if (R2.SHORT_CIRCUIT.d(i5)) {
                        i5 &= R2.u ^ (-1);
                    }
                    spliterator = bVar2.v0(bVar, spliterator);
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
                bVar2.f = R2.a(i5, bVar.f);
                i4++;
                b bVar3 = bVar2;
                bVar2 = bVar2.d;
                bVar = bVar3;
            }
        }
        if (i != 0) {
            this.f = R2.a(i, this.f);
        }
        return spliterator;
    }

    abstract Spliterator A0(b bVar, Supplier supplier, boolean z);

    final e2 B0(Spliterator spliterator, e2 e2Var) {
        e2Var.getClass();
        g0(spliterator, C0(e2Var));
        return e2Var;
    }

    final e2 C0(e2 e2Var) {
        e2Var.getClass();
        b bVar = this;
        while (bVar.e > 0) {
            b bVar2 = bVar.b;
            e2Var = bVar.x0(bVar2.f, e2Var);
            bVar = bVar2;
        }
        return e2Var;
    }

    final Spliterator D0(Spliterator spliterator) {
        return this.e == 0 ? spliterator : A0(this, new a(spliterator, 9), this.a.k);
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

    final void g0(Spliterator spliterator, e2 e2Var) {
        e2Var.getClass();
        if (R2.SHORT_CIRCUIT.d(this.f)) {
            h0(spliterator, e2Var);
            return;
        }
        e2Var.n(spliterator.getExactSizeIfKnown());
        spliterator.a(e2Var);
        e2Var.m();
    }

    final void h0(Spliterator spliterator, e2 e2Var) {
        b bVar = this;
        while (bVar.e > 0) {
            bVar = bVar.b;
        }
        e2Var.n(spliterator.getExactSizeIfKnown());
        bVar.n0(spliterator, e2Var);
        e2Var.m();
    }

    final F0 i0(Spliterator spliterator, boolean z, IntFunction intFunction) {
        if (this.a.k) {
            return l0(this, spliterator, z, intFunction);
        }
        x0 t0 = t0(m0(spliterator), intFunction);
        B0(spliterator, t0);
        return t0.b();
    }

    @Override // j$.util.stream.BaseStream
    public final boolean isParallel() {
        return this.a.k;
    }

    final Object j0(w3 w3Var) {
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        return this.a.k ? w3Var.c(this, y0(w3Var.d())) : w3Var.a(this, y0(w3Var.d()));
    }

    final F0 k0(IntFunction intFunction) {
        b bVar;
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        if (!this.a.k || (bVar = this.b) == null || !w0()) {
            return i0(y0(0), true, intFunction);
        }
        this.e = 0;
        return u0(bVar.y0(0), intFunction, bVar);
    }

    abstract F0 l0(b bVar, Spliterator spliterator, boolean z, IntFunction intFunction);

    final long m0(Spliterator spliterator) {
        if (R2.SIZED.d(this.f)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }

    abstract void n0(Spliterator spliterator, e2 e2Var);

    abstract S2 o0();

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

    final S2 p0() {
        b bVar = this;
        while (bVar.e > 0) {
            bVar = bVar.b;
        }
        return bVar.o0();
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream parallel() {
        this.a.k = true;
        return this;
    }

    final int q0() {
        return this.f;
    }

    final boolean r0() {
        return R2.ORDERED.d(this.f);
    }

    final /* synthetic */ Spliterator s0() {
        return y0(0);
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream sequential() {
        this.a.k = false;
        return this;
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.D
    public Spliterator spliterator() {
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        b bVar = this.a;
        if (this != bVar) {
            return A0(this, new a(this, 0), bVar.k);
        }
        Spliterator spliterator = bVar.g;
        if (spliterator == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        bVar.g = null;
        return spliterator;
    }

    abstract x0 t0(long j, IntFunction intFunction);

    F0 u0(Spliterator spliterator, IntFunction intFunction, b bVar) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    Spliterator v0(b bVar, Spliterator spliterator) {
        return u0(spliterator, new l(12), bVar).spliterator();
    }

    abstract boolean w0();

    abstract e2 x0(int i, e2 e2Var);

    final Spliterator z0() {
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
}
