package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Supplier;

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

    abstract I0 E(b bVar, Spliterator spliterator, boolean z, IntFunction intFunction);

    abstract boolean G(Spliterator spliterator, m2 m2Var);

    abstract b3 H();

    abstract A0 M(long j, IntFunction intFunction);

    abstract boolean P();

    abstract m2 Q(int i, m2 m2Var);

    abstract Spliterator T(b bVar, Supplier supplier, boolean z);

    b(Spliterator spliterator, int i, boolean z) {
        this.b = null;
        this.g = spliterator;
        this.a = this;
        int i2 = a3.g & i;
        this.c = i2;
        this.f = (~(i2 << 1)) & a3.l;
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
        this.c = a3.h & i;
        this.f = a3.i(i, bVar.f);
        b bVar2 = bVar.a;
        this.a = bVar2;
        if (P()) {
            bVar2.i = true;
        }
        this.e = bVar.e + 1;
    }

    final Object C(G3 g3) {
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        if (this.a.k) {
            return g3.c(this, R(g3.d()));
        }
        return g3.b(this, R(g3.d()));
    }

    final I0 D(IntFunction intFunction) {
        b bVar;
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        if (this.a.k && (bVar = this.b) != null && P()) {
            this.e = 0;
            return N(bVar, bVar.R(0), intFunction);
        }
        return B(R(0), true, intFunction);
    }

    final Spliterator S() {
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
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        Objects.requireNonNull(runnable);
        b bVar = this.a;
        Runnable runnable2 = bVar.j;
        if (runnable2 != null) {
            runnable = new F3(runnable2, runnable);
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
        return T(this, new a(0, this), bVar.k);
    }

    final /* synthetic */ Spliterator L() {
        return R(0);
    }

    final I0 B(Spliterator spliterator, boolean z, IntFunction intFunction) {
        if (this.a.k) {
            return E(this, spliterator, z, intFunction);
        }
        A0 M = M(F(spliterator), intFunction);
        U(spliterator, M);
        return M.a();
    }

    @Override // j$.util.stream.BaseStream
    public final boolean isParallel() {
        return this.a.k;
    }

    private Spliterator R(int i) {
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
                    if (bVar2.P()) {
                        if (a3.SHORT_CIRCUIT.m(i5)) {
                            i5 &= ~a3.u;
                        }
                        spliterator = bVar2.O(bVar, spliterator);
                        if (spliterator.hasCharacteristics(64)) {
                            i2 = (~a3.t) & i5;
                            i3 = a3.s;
                        } else {
                            i2 = (~a3.s) & i5;
                            i3 = a3.t;
                        }
                        i5 = i2 | i3;
                        i4 = 0;
                    }
                    bVar2.e = i4;
                    bVar2.f = a3.i(i5, bVar.f);
                    i4++;
                    b bVar3 = bVar2;
                    bVar2 = bVar2.d;
                    bVar = bVar3;
                }
            }
            if (i != 0) {
                this.f = a3.i(i, this.f);
            }
            return spliterator;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    final b3 I() {
        b bVar = this;
        while (bVar.e > 0) {
            bVar = bVar.b;
        }
        return bVar.H();
    }

    final long F(Spliterator spliterator) {
        if (a3.SIZED.m(this.f)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }

    final m2 U(Spliterator spliterator, m2 m2Var) {
        z(spliterator, V((m2) Objects.requireNonNull(m2Var)));
        return m2Var;
    }

    final void z(Spliterator spliterator, m2 m2Var) {
        Objects.requireNonNull(m2Var);
        if (!a3.SHORT_CIRCUIT.m(this.f)) {
            m2Var.l(spliterator.getExactSizeIfKnown());
            spliterator.forEachRemaining(m2Var);
            m2Var.k();
            return;
        }
        A(spliterator, m2Var);
    }

    final boolean A(Spliterator spliterator, m2 m2Var) {
        b bVar = this;
        while (bVar.e > 0) {
            bVar = bVar.b;
        }
        m2Var.l(spliterator.getExactSizeIfKnown());
        boolean G = bVar.G(spliterator, m2Var);
        m2Var.k();
        return G;
    }

    final int J() {
        return this.f;
    }

    final boolean K() {
        return a3.ORDERED.m(this.f);
    }

    final m2 V(m2 m2Var) {
        Objects.requireNonNull(m2Var);
        b bVar = this;
        while (bVar.e > 0) {
            b bVar2 = bVar.b;
            m2Var = bVar.Q(bVar2.f, m2Var);
            bVar = bVar2;
        }
        return m2Var;
    }

    final Spliterator W(Spliterator spliterator) {
        return this.e == 0 ? spliterator : T(this, new a(6, spliterator), this.a.k);
    }

    I0 N(b bVar, Spliterator spliterator, IntFunction intFunction) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    Spliterator O(b bVar, Spliterator spliterator) {
        return N(bVar, spliterator, new j(19)).spliterator();
    }
}
