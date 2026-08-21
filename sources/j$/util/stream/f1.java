package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.Comparator;

/* loaded from: classes2.dex */
public abstract class f1 implements Spliterator {
    public C0 a;
    public int b;
    public Spliterator c;
    public Spliterator d;
    public ArrayDeque e;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 64;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.com.android.tools.r8.a.n(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.com.android.tools.r8.a.p(this, i);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public f1(C0 c0) {
        this.a = c0;
    }

    public final ArrayDeque b() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int i = this.a.i();
        while (true) {
            i--;
            if (i < this.b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.a.b(i));
        }
    }

    public static C0 a(ArrayDeque arrayDeque) {
        while (true) {
            C0 c0 = (C0) arrayDeque.pollFirst();
            if (c0 == null) {
                return null;
            }
            if (c0.i() != 0) {
                for (int i = c0.i() - 1; i >= 0; i--) {
                    arrayDeque.addFirst(c0.b(i));
                }
            } else if (c0.count() > 0) {
                return c0;
            }
        }
    }

    public final boolean c() {
        if (this.a == null) {
            return false;
        }
        if (this.d != null) {
            return true;
        }
        Spliterator spliterator = this.c;
        if (spliterator == null) {
            ArrayDeque b = b();
            this.e = b;
            C0 a = a(b);
            if (a != null) {
                this.d = a.spliterator();
                return true;
            }
            this.a = null;
            return false;
        }
        this.d = spliterator;
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        C0 c0 = this.a;
        if (c0 == null || this.d != null) {
            return null;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            return spliterator.trySplit();
        }
        if (this.b < c0.i() - 1) {
            C0 c02 = this.a;
            int i = this.b;
            this.b = i + 1;
            return c02.b(i).spliterator();
        }
        C0 b = this.a.b(this.b);
        this.a = b;
        if (b.i() == 0) {
            Spliterator spliterator2 = this.a.spliterator();
            this.c = spliterator2;
            return spliterator2.trySplit();
        }
        C0 c03 = this.a;
        this.b = 1;
        return c03.b(0).spliterator();
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        long j = 0;
        if (this.a == null) {
            return 0L;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            return spliterator.estimateSize();
        }
        for (int i = this.b; i < this.a.i(); i++) {
            j += this.a.b(i).count();
        }
        return j;
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.c0 trySplit() {
        return (j$.util.c0) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.W trySplit() {
        return (j$.util.W) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.Z trySplit() {
        return (j$.util.Z) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.T trySplit() {
        return (j$.util.T) trySplit();
    }
}
