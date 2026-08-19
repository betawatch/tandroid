package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.Comparator;

/* loaded from: classes2.dex */
public abstract class e1 implements Spliterator {
    public B0 a;
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

    public e1(B0 b0) {
        this.a = b0;
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

    public static B0 a(ArrayDeque arrayDeque) {
        while (true) {
            B0 b0 = (B0) arrayDeque.pollFirst();
            if (b0 == null) {
                return null;
            }
            if (b0.i() != 0) {
                for (int i = b0.i() - 1; i >= 0; i--) {
                    arrayDeque.addFirst(b0.b(i));
                }
            } else if (b0.count() > 0) {
                return b0;
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
            B0 a = a(b);
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
        B0 b0 = this.a;
        if (b0 == null || this.d != null) {
            return null;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            return spliterator.trySplit();
        }
        if (this.b < b0.i() - 1) {
            B0 b02 = this.a;
            int i = this.b;
            this.b = i + 1;
            return b02.b(i).spliterator();
        }
        B0 b = this.a.b(this.b);
        this.a = b;
        if (b.i() == 0) {
            Spliterator spliterator2 = this.a.spliterator();
            this.c = spliterator2;
            return spliterator2.trySplit();
        }
        B0 b03 = this.a;
        this.b = 1;
        return b03.b(0).spliterator();
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
