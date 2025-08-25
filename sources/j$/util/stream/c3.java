package j$.util.stream;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
abstract class c3 implements Spliterator {
    final boolean a;
    final b b;
    private Supplier c;
    Spliterator d;
    m2 e;
    BooleanSupplier f;
    long g;
    d h;
    boolean i;

    abstract void d();

    abstract c3 e(Spliterator spliterator);

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.util.S.e(this, i);
    }

    c3(b bVar, Supplier supplier, boolean z) {
        this.b = bVar;
        this.c = supplier;
        this.d = null;
        this.a = z;
    }

    c3(b bVar, Spliterator spliterator, boolean z) {
        this.b = bVar;
        this.c = null;
        this.d = spliterator;
        this.a = z;
    }

    final void c() {
        if (this.d == null) {
            this.d = (Spliterator) this.c.get();
            this.c = null;
        }
    }

    final boolean a() {
        d dVar = this.h;
        if (dVar == null) {
            if (this.i) {
                return false;
            }
            c();
            d();
            this.g = 0L;
            this.e.l(this.d.getExactSizeIfKnown());
            return b();
        }
        long j = this.g + 1;
        this.g = j;
        boolean z = j < dVar.count();
        if (z) {
            return z;
        }
        this.g = 0L;
        this.h.clear();
        return b();
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        if (!this.a || this.h != null || this.i) {
            return null;
        }
        c();
        Spliterator trySplit = this.d.trySplit();
        if (trySplit == null) {
            return null;
        }
        return e(trySplit);
    }

    private boolean b() {
        while (this.h.count() == 0) {
            if (this.e.n() || !this.f.getAsBoolean()) {
                if (this.i) {
                    return false;
                }
                this.e.k();
                this.i = true;
            }
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        c();
        return this.d.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        c();
        if (a3.SIZED.m(this.b.J())) {
            return this.d.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        c();
        int v = a3.v(this.b.J()) & a3.f;
        return (v & 64) != 0 ? (v & (-16449)) | (this.d.characteristics() & 16448) : v;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (j$.util.S.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    public final String toString() {
        return String.format("%s[%s]", getClass().getName(), this.d);
    }
}
