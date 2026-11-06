package j$.util.stream;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public abstract class x6 implements Spliterator {
    public final boolean a;
    public final a b;
    public Supplier c;
    public Spliterator d;
    public j5 e;
    public BooleanSupplier f;
    public long g;
    public c h;
    public boolean i;

    public abstract void d();

    public abstract x6 e(Spliterator spliterator);

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i7) {
        return j$.com.android.tools.r8.a.o(this, i7);
    }

    public x6(a aVar, Supplier supplier, boolean z9) {
        this.b = aVar;
        this.c = supplier;
        this.d = null;
        this.a = z9;
    }

    public x6(a aVar, Spliterator spliterator, boolean z9) {
        this.b = aVar;
        this.c = null;
        this.d = spliterator;
        this.a = z9;
    }

    public final void c() {
        if (this.d == null) {
            this.d = (Spliterator) this.c.get();
            this.c = null;
        }
    }

    public final boolean a() {
        c cVar = this.h;
        if (cVar == null) {
            if (this.i) {
                return false;
            }
            c();
            d();
            this.g = 0L;
            this.e.o(this.d.getExactSizeIfKnown());
            return b();
        }
        long j3 = this.g + 1;
        this.g = j3;
        boolean z9 = j3 < cVar.count();
        if (z9) {
            return z9;
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

    public final boolean b() {
        while (this.h.count() == 0) {
            if (this.e.q() || !this.f.getAsBoolean()) {
                if (this.i) {
                    return false;
                }
                this.e.end();
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
        if (v6.SIZED.m(this.b.m)) {
            return this.d.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        c();
        int i7 = this.b.m;
        int i10 = i7 & ((~i7) >> 1) & v6.j & v6.f;
        return (i10 & 64) != 0 ? (i10 & (-16449)) | (this.d.characteristics() & 16448) : i10;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (j$.com.android.tools.r8.a.o(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    public final String toString() {
        return String.format("%s[%s]", getClass().getName(), this.d);
    }
}
