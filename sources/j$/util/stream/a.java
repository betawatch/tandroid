package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public abstract class a implements BaseStream, AutoCloseable {
    public final a a;
    public final a b;
    public final int c;
    public final a d;
    public int e;
    public int f;
    public Spliterator g;
    public boolean h;
    public final boolean i;
    public Runnable j;
    public boolean k;

    public abstract C0 E(a aVar, Spliterator spliterator, boolean z, IntFunction intFunction);

    public abstract boolean G(Spliterator spliterator, g2 g2Var);

    public abstract T2 H();

    public abstract u0 I(long j, IntFunction intFunction);

    public abstract boolean L();

    public abstract g2 M(int i, g2 g2Var);

    public abstract Spliterator P(a aVar, Supplier supplier, boolean z);

    public a(Spliterator spliterator, int i, boolean z) {
        this.b = null;
        this.g = spliterator;
        this.a = this;
        int i2 = S2.g & i;
        this.c = i2;
        this.f = (~(i2 << 1)) & S2.l;
        this.e = 0;
        this.k = z;
    }

    public a(a aVar, int i) {
        if (aVar.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        aVar.h = true;
        aVar.d = this;
        this.b = aVar;
        this.c = S2.h & i;
        this.f = S2.l(i, aVar.f);
        a aVar2 = aVar.a;
        this.a = aVar2;
        if (L()) {
            aVar2.i = true;
        }
        this.e = aVar.e + 1;
    }

    public final Object C(y3 y3Var) {
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        if (this.a.k) {
            return y3Var.c(this, N(y3Var.d()));
        }
        return y3Var.b(this, N(y3Var.d()));
    }

    public final C0 D(IntFunction intFunction) {
        a aVar;
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        if (this.a.k && (aVar = this.b) != null && L()) {
            this.e = 0;
            return J(aVar, aVar.N(0), intFunction);
        }
        return B(N(0), true, intFunction);
    }

    public final Spliterator O() {
        a aVar = this.a;
        if (this != aVar) {
            throw new IllegalStateException();
        }
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        Spliterator spliterator = aVar.g;
        if (spliterator != null) {
            aVar.g = null;
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
        a aVar = this.a;
        Runnable runnable = aVar.j;
        if (runnable != null) {
            aVar.j = null;
            runnable.run();
        }
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream onClose(Runnable runnable) {
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        Objects.requireNonNull(runnable);
        a aVar = this.a;
        Runnable runnable2 = aVar.j;
        if (runnable2 != null) {
            runnable = new x3(runnable2, runnable);
        }
        aVar.j = runnable;
        return this;
    }

    @Override // j$.util.stream.BaseStream
    public Spliterator spliterator() {
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        a aVar = this.a;
        if (this == aVar) {
            Spliterator spliterator = aVar.g;
            if (spliterator != null) {
                aVar.g = null;
                return spliterator;
            }
            throw new IllegalStateException("source already consumed or closed");
        }
        return P(this, new j$.time.t(3, this), aVar.k);
    }

    public final C0 B(Spliterator spliterator, boolean z, IntFunction intFunction) {
        if (this.a.k) {
            return E(this, spliterator, z, intFunction);
        }
        u0 I = I(F(spliterator), intFunction);
        Q(spliterator, I);
        return I.a();
    }

    @Override // j$.util.stream.BaseStream
    public final boolean isParallel() {
        return this.a.k;
    }

    public final Spliterator N(int i) {
        int i2;
        int i3;
        a aVar = this.a;
        Spliterator spliterator = aVar.g;
        if (spliterator != null) {
            aVar.g = null;
            if (aVar.k && aVar.i) {
                a aVar2 = aVar.d;
                int i4 = 1;
                while (aVar != this) {
                    int i5 = aVar2.c;
                    if (aVar2.L()) {
                        if (S2.SHORT_CIRCUIT.q(i5)) {
                            i5 &= ~S2.u;
                        }
                        spliterator = aVar2.K(aVar, spliterator);
                        if (spliterator.hasCharacteristics(64)) {
                            i2 = (~S2.t) & i5;
                            i3 = S2.s;
                        } else {
                            i2 = (~S2.s) & i5;
                            i3 = S2.t;
                        }
                        i5 = i2 | i3;
                        i4 = 0;
                    }
                    int i6 = i4 + 1;
                    aVar2.e = i4;
                    aVar2.f = S2.l(i5, aVar.f);
                    a aVar3 = aVar2;
                    aVar2 = aVar2.d;
                    aVar = aVar3;
                    i4 = i6;
                }
            }
            if (i != 0) {
                this.f = S2.l(i, this.f);
            }
            return spliterator;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    public final long F(Spliterator spliterator) {
        if (S2.SIZED.q(this.f)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }

    public final g2 Q(Spliterator spliterator, g2 g2Var) {
        z(spliterator, R((g2) Objects.requireNonNull(g2Var)));
        return g2Var;
    }

    public final void z(Spliterator spliterator, g2 g2Var) {
        Objects.requireNonNull(g2Var);
        if (!S2.SHORT_CIRCUIT.q(this.f)) {
            g2Var.y(spliterator.getExactSizeIfKnown());
            spliterator.forEachRemaining(g2Var);
            g2Var.x();
            return;
        }
        A(spliterator, g2Var);
    }

    public final boolean A(Spliterator spliterator, g2 g2Var) {
        a aVar = this;
        while (aVar.e > 0) {
            aVar = aVar.b;
        }
        g2Var.y(spliterator.getExactSizeIfKnown());
        boolean G = aVar.G(spliterator, g2Var);
        g2Var.x();
        return G;
    }

    public final g2 R(g2 g2Var) {
        Objects.requireNonNull(g2Var);
        a aVar = this;
        while (aVar.e > 0) {
            a aVar2 = aVar.b;
            g2Var = aVar.M(aVar2.f, g2Var);
            aVar = aVar2;
        }
        return g2Var;
    }

    public final Spliterator S(Spliterator spliterator) {
        return this.e == 0 ? spliterator : P(this, new j$.time.t(4, spliterator), this.a.k);
    }

    public C0 J(a aVar, Spliterator spliterator, IntFunction intFunction) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    public Spliterator K(a aVar, Spliterator spliterator) {
        return J(aVar, spliterator, new j$.time.format.a(8)).spliterator();
    }
}
