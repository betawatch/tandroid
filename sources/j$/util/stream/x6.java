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
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return j$.com.android.tools.r8.a.p(this, i10);
    }

    public x6(a aVar, Supplier supplier, boolean z10) {
        this.b = aVar;
        this.c = supplier;
        this.d = null;
        this.a = z10;
    }

    public x6(a aVar, Spliterator spliterator, boolean z10) {
        this.b = aVar;
        this.c = null;
        this.d = spliterator;
        this.a = z10;
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
        long j10 = this.g + 1;
        this.g = j10;
        boolean z10 = j10 < cVar.count();
        if (z10) {
            return z10;
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
        int i10 = this.b.m;
        int i11 = i10 & ((~i10) >> 1) & v6.j & v6.f;
        return (i11 & 64) != 0 ? (i11 & (-16449)) | (this.d.characteristics() & 16448) : i11;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (j$.com.android.tools.r8.a.p(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    public final String toString() {
        return String.format("%s[%s]", getClass().getName(), this.d);
    }
}
