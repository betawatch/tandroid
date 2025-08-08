package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Supplier;
import java.util.Comparator;

/* loaded from: classes2.dex */
abstract class S2 implements Spliterator {
    final boolean a;
    final b b;
    private Supplier c;
    Spliterator d;
    d2 e;
    a f;
    long g;
    d h;
    boolean i;

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.util.A.k(this, i);
    }

    abstract void j();

    abstract S2 k(Spliterator spliterator);

    S2(b bVar, Supplier supplier, boolean z) {
        this.b = bVar;
        this.c = supplier;
        this.d = null;
        this.a = z;
    }

    S2(b bVar, Spliterator spliterator, boolean z) {
        this.b = bVar;
        this.c = null;
        this.d = spliterator;
        this.a = z;
    }

    final void h() {
        if (this.d == null) {
            this.d = (Spliterator) this.c.get();
            this.c = null;
        }
    }

    final boolean b() {
        d dVar = this.h;
        if (dVar == null) {
            if (this.i) {
                return false;
            }
            h();
            j();
            this.g = 0L;
            this.e.n(this.d.getExactSizeIfKnown());
            return f();
        }
        long j = this.g + 1;
        this.g = j;
        boolean z = j < dVar.count();
        if (z) {
            return z;
        }
        this.g = 0L;
        this.h.clear();
        return f();
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        if (!this.a || this.i) {
            return null;
        }
        h();
        Spliterator trySplit = this.d.trySplit();
        if (trySplit == null) {
            return null;
        }
        return k(trySplit);
    }

    private boolean f() {
        boolean s;
        while (this.h.count() == 0) {
            if (!this.e.q()) {
                a aVar = this.f;
                switch (aVar.a) {
                    case 3:
                        b3 b3Var = (b3) aVar.b;
                        s = b3Var.d.s(b3Var.e);
                        break;
                    case 4:
                        d3 d3Var = (d3) aVar.b;
                        s = d3Var.d.s(d3Var.e);
                        break;
                    case 5:
                        f3 f3Var = (f3) aVar.b;
                        s = f3Var.d.s(f3Var.e);
                        break;
                    default:
                        t3 t3Var = (t3) aVar.b;
                        s = t3Var.d.s(t3Var.e);
                        break;
                }
                if (s) {
                    continue;
                }
            }
            if (this.i) {
                return false;
            }
            this.e.m();
            this.i = true;
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        h();
        return this.d.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        h();
        if (Q2.SIZED.i(this.b.p0())) {
            return this.d.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        h();
        int m = Q2.m(this.b.p0()) & Q2.f;
        return (m & 64) != 0 ? (m & (-16449)) | (this.d.characteristics() & 16448) : m;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (j$.util.A.k(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    public final String toString() {
        return String.format("%s[%s]", getClass().getName(), this.d);
    }
}
