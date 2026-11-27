package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Supplier;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes4.dex */
public abstract class a implements BaseStream {
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

    public a(a aVar, int i) {
        if (aVar.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        aVar.h = true;
        aVar.d = this;
        this.b = aVar;
        this.c = b7.h & i;
        this.f = b7.j(i, aVar.f);
        a aVar2 = aVar.a;
        this.a = aVar2;
        if (L()) {
            aVar2.i = true;
        }
        this.e = aVar.e + 1;
    }

    public final boolean A(Spliterator spliterator, n5 n5Var) {
        while (this.e > 0) {
            this = this.b;
        }
        n5Var.n(spliterator.getExactSizeIfKnown());
        boolean G = this.G(spliterator, n5Var);
        n5Var.end();
        return G;
    }

    public final h2 B(Spliterator spliterator, boolean z, IntFunction intFunction) {
        if (this.a.k) {
            return E(this, spliterator, z, intFunction);
        }
        z1 I = I(F(spliterator), intFunction);
        Q(spliterator, I);
        return I.build();
    }

    public final Object C(h8 h8Var) {
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        return this.a.k ? h8Var.b(this, N(h8Var.c())) : h8Var.a(this, N(h8Var.c()));
    }

    public final h2 D(IntFunction intFunction) {
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        if (!this.a.k || this.b == null || !L()) {
            return B(N(0), true, intFunction);
        }
        this.e = 0;
        a aVar = this.b;
        return J(aVar, aVar.N(0), intFunction);
    }

    public h2 E(a aVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return w3.B(aVar, spliterator, z);
    }

    public final long F(Spliterator spliterator) {
        if (b7.SIZED.n(this.f)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }

    public boolean G(Spliterator spliterator, n5 n5Var) {
        boolean q;
        do {
            q = n5Var.q();
            if (q) {
                break;
            }
        } while (spliterator.tryAdvance(n5Var));
        return q;
    }

    public c7 H() {
        return c7.DOUBLE_VALUE;
    }

    public z1 I(long j, IntFunction intFunction) {
        return w3.F(j);
    }

    public h2 J(a aVar, Spliterator spliterator, IntFunction intFunction) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    public Spliterator K(a aVar, Spliterator spliterator) {
        return J(aVar, spliterator, new j$.time.format.a((byte) 8)).spliterator();
    }

    public boolean L() {
        throw new UnsupportedOperationException();
    }

    public n5 M(int i, n5 n5Var) {
        throw new UnsupportedOperationException();
    }

    public final Spliterator N(int i) {
        int i2;
        int i3;
        a aVar = this.a;
        Spliterator spliterator = aVar.g;
        if (spliterator == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        aVar.g = null;
        if (aVar.k && aVar.i) {
            int i4 = 1;
            Spliterator spliterator2 = spliterator;
            a aVar2 = aVar;
            while (true) {
                aVar2 = aVar2.d;
                if (aVar == this) {
                    break;
                }
                int i5 = aVar2.c;
                if (aVar2.L()) {
                    if (b7.SHORT_CIRCUIT.n(i5)) {
                        i5 &= ~b7.u;
                    }
                    spliterator2 = aVar2.K(aVar, spliterator2);
                    if (spliterator2.hasCharacteristics(64)) {
                        i2 = i5 & (~b7.t);
                        i3 = b7.s;
                    } else {
                        i2 = i5 & (~b7.s);
                        i3 = b7.t;
                    }
                    i5 = i2 | i3;
                    i4 = 0;
                }
                aVar2.e = i4;
                aVar2.f = b7.j(i5, aVar.f);
                aVar = aVar2;
                i4++;
            }
            spliterator = spliterator2;
        }
        if (i != 0) {
            this.f = b7.j(i, this.f);
        }
        return spliterator;
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
        if (spliterator == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        aVar.g = null;
        return spliterator;
    }

    public Spliterator P(a aVar, Supplier supplier, boolean z) {
        return new m7(aVar, supplier, z);
    }

    public final n5 Q(Spliterator spliterator, n5 n5Var) {
        z(spliterator, R((n5) Objects.requireNonNull(n5Var)));
        return n5Var;
    }

    public final n5 R(n5 n5Var) {
        Objects.requireNonNull(n5Var);
        while (this.e > 0) {
            n5Var = this.M(this.b.f, n5Var);
            this = this.b;
        }
        return n5Var;
    }

    public final Spliterator S(Spliterator spliterator) {
        return this.e == 0 ? spliterator : P(this, new j$.time.v((byte) 4, spliterator), this.a.k);
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
    public final boolean isParallel() {
        return this.a.k;
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
            runnable = new g8(runnable2, runnable);
        }
        aVar.j = runnable;
        return this;
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream parallel() {
        this.a.k = true;
        return this;
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream sequential() {
        this.a.k = false;
        return this;
    }

    @Override // j$.util.stream.BaseStream
    public Spliterator spliterator() {
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        a aVar = this.a;
        if (this != aVar) {
            return P(this, new j$.time.v((byte) 3, this), aVar.k);
        }
        Spliterator spliterator = aVar.g;
        if (spliterator == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        aVar.g = null;
        return spliterator;
    }

    public final void z(Spliterator spliterator, n5 n5Var) {
        Objects.requireNonNull(n5Var);
        if (b7.SHORT_CIRCUIT.n(this.f)) {
            A(spliterator, n5Var);
            return;
        }
        n5Var.n(spliterator.getExactSizeIfKnown());
        spliterator.forEachRemaining(n5Var);
        n5Var.end();
    }

    public a(Spliterator spliterator, int i, boolean z) {
        this.b = null;
        this.g = spliterator;
        this.a = this;
        int i2 = i & b7.g;
        this.c = i2;
        this.f = (~(i2 << 1)) & b7.l;
        this.e = 0;
        this.k = z;
    }
}
