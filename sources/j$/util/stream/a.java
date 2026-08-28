package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public abstract class a extends t3 implements BaseStream {
    public final a h;
    public final a i;
    public final int j;
    public final a k;
    public int l;
    public int m;
    public Spliterator n;
    public boolean o;
    public final boolean p;
    public Runnable q;
    public boolean r;

    public abstract e2 K0(a aVar, Spliterator spliterator, boolean z10, IntFunction intFunction);

    public abstract boolean L0(Spliterator spliterator, j5 j5Var);

    public abstract w6 M0();

    public abstract boolean P0();

    public abstract j5 Q0(int i9, j5 j5Var);

    public abstract Spliterator T0(a aVar, Supplier supplier, boolean z10);

    public a(Spliterator spliterator, int i9, boolean z10) {
        this.i = null;
        this.n = spliterator;
        this.h = this;
        int i10 = v6.g & i9;
        this.j = i10;
        this.m = (~(i10 << 1)) & v6.l;
        this.l = 0;
        this.r = z10;
    }

    public a(a aVar, int i9) {
        if (aVar.o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        aVar.o = true;
        aVar.k = this;
        this.i = aVar;
        this.j = v6.h & i9;
        this.m = v6.j(i9, aVar.m);
        a aVar2 = aVar.h;
        this.h = aVar2;
        if (P0()) {
            aVar2.p = true;
        }
        this.l = aVar.l + 1;
    }

    public final Object I0(b8 b8Var) {
        if (this.o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.o = true;
        if (this.h.r) {
            return b8Var.i(this, R0(b8Var.v()));
        }
        return b8Var.f(this, R0(b8Var.v()));
    }

    public final e2 J0(IntFunction intFunction) {
        if (this.o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.o = true;
        if (this.h.r && this.i != null && P0()) {
            this.l = 0;
            a aVar = this.i;
            return N0(aVar, aVar.R0(0), intFunction);
        }
        return j0(R0(0), true, intFunction);
    }

    public final Spliterator S0() {
        a aVar = this.h;
        if (this != aVar) {
            throw new IllegalStateException();
        }
        if (this.o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.o = true;
        Spliterator spliterator = aVar.n;
        if (spliterator != null) {
            aVar.n = null;
            return spliterator;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream sequential() {
        this.h.r = false;
        return this;
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream parallel() {
        this.h.r = true;
        return this;
    }

    @Override // j$.util.stream.BaseStream, java.lang.AutoCloseable
    public final void close() {
        this.o = true;
        this.n = null;
        a aVar = this.h;
        Runnable runnable = aVar.q;
        if (runnable != null) {
            aVar.q = null;
            runnable.run();
        }
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream onClose(Runnable runnable) {
        if (this.o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        Objects.requireNonNull(runnable);
        a aVar = this.h;
        Runnable runnable2 = aVar.q;
        if (runnable2 != null) {
            runnable = new a8(runnable2, runnable);
        }
        aVar.q = runnable;
        return this;
    }

    @Override // j$.util.stream.BaseStream
    public Spliterator spliterator() {
        if (this.o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.o = true;
        a aVar = this.h;
        if (this == aVar) {
            Spliterator spliterator = aVar.n;
            if (spliterator != null) {
                aVar.n = null;
                return spliterator;
            }
            throw new IllegalStateException("source already consumed or closed");
        }
        return T0(this, new j$.time.t(3, this), aVar.r);
    }

    @Override // j$.util.stream.BaseStream
    public final boolean isParallel() {
        return this.h.r;
    }

    @Override // j$.util.stream.t3
    public final e2 j0(Spliterator spliterator, boolean z10, IntFunction intFunction) {
        if (this.h.r) {
            return K0(this, spliterator, z10, intFunction);
        }
        w1 A0 = A0(k0(spliterator), intFunction);
        F0(spliterator, A0);
        return A0.build();
    }

    public final Spliterator R0(int i9) {
        int i10;
        int i11;
        a aVar = this.h;
        Spliterator spliterator = aVar.n;
        if (spliterator != null) {
            aVar.n = null;
            if (aVar.r && aVar.p) {
                a aVar2 = aVar.k;
                int i12 = 1;
                while (aVar != this) {
                    int i13 = aVar2.j;
                    if (aVar2.P0()) {
                        if (v6.SHORT_CIRCUIT.m(i13)) {
                            i13 &= ~v6.u;
                        }
                        spliterator = aVar2.O0(aVar, spliterator);
                        if (spliterator.hasCharacteristics(64)) {
                            i10 = (~v6.t) & i13;
                            i11 = v6.s;
                        } else {
                            i10 = (~v6.s) & i13;
                            i11 = v6.t;
                        }
                        i13 = i10 | i11;
                        i12 = 0;
                    }
                    int i14 = i12 + 1;
                    aVar2.l = i12;
                    aVar2.m = v6.j(i13, aVar.m);
                    a aVar3 = aVar2;
                    aVar2 = aVar2.k;
                    aVar = aVar3;
                    i12 = i14;
                }
            }
            if (i9 != 0) {
                this.m = v6.j(i9, this.m);
            }
            return spliterator;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    @Override // j$.util.stream.t3
    public final long k0(Spliterator spliterator) {
        if (v6.SIZED.m(this.m)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // j$.util.stream.t3
    public final j5 F0(Spliterator spliterator, j5 j5Var) {
        f0(spliterator, G0((j5) Objects.requireNonNull(j5Var)));
        return j5Var;
    }

    @Override // j$.util.stream.t3
    public final void f0(Spliterator spliterator, j5 j5Var) {
        Objects.requireNonNull(j5Var);
        if (!v6.SHORT_CIRCUIT.m(this.m)) {
            j5Var.o(spliterator.getExactSizeIfKnown());
            spliterator.forEachRemaining(j5Var);
            j5Var.end();
            return;
        }
        g0(spliterator, j5Var);
    }

    @Override // j$.util.stream.t3
    public final boolean g0(Spliterator spliterator, j5 j5Var) {
        a aVar = this;
        while (aVar.l > 0) {
            aVar = aVar.i;
        }
        j5Var.o(spliterator.getExactSizeIfKnown());
        boolean L0 = aVar.L0(spliterator, j5Var);
        j5Var.end();
        return L0;
    }

    @Override // j$.util.stream.t3
    public final j5 G0(j5 j5Var) {
        Objects.requireNonNull(j5Var);
        for (a aVar = this; aVar.l > 0; aVar = aVar.i) {
            j5Var = aVar.Q0(aVar.i.m, j5Var);
        }
        return j5Var;
    }

    @Override // j$.util.stream.t3
    public final Spliterator H0(Spliterator spliterator) {
        return this.l == 0 ? spliterator : T0(this, new j$.time.t(4, spliterator), this.h.r);
    }

    public e2 N0(t3 t3Var, Spliterator spliterator, IntFunction intFunction) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    public Spliterator O0(a aVar, Spliterator spliterator) {
        return N0(aVar, spliterator, new j$.time.format.a(8)).spliterator();
    }
}
