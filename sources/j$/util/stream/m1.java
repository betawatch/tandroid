package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.Comparator;

/* loaded from: classes2.dex */
abstract class m1 implements Spliterator {
    I0 a;
    int b;
    Spliterator c;
    Spliterator d;
    ArrayDeque e;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 64;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.util.T.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.util.T.e(this, i);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    m1(I0 i0) {
        this.a = i0;
    }

    protected final ArrayDeque b() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int q = this.a.q();
        while (true) {
            q--;
            if (q < this.b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.a.b(q));
        }
    }

    protected static I0 a(ArrayDeque arrayDeque) {
        while (true) {
            I0 i0 = (I0) arrayDeque.pollFirst();
            if (i0 == null) {
                return null;
            }
            if (i0.q() != 0) {
                for (int q = i0.q() - 1; q >= 0; q--) {
                    arrayDeque.addFirst(i0.b(q));
                }
            } else if (i0.count() > 0) {
                return i0;
            }
        }
    }

    protected final boolean c() {
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
            I0 a = a(b);
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
        I0 i0 = this.a;
        if (i0 == null || this.d != null) {
            return null;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            return spliterator.trySplit();
        }
        if (this.b < i0.q() - 1) {
            I0 i02 = this.a;
            int i = this.b;
            this.b = i + 1;
            return i02.b(i).spliterator();
        }
        I0 b = this.a.b(this.b);
        this.a = b;
        if (b.q() == 0) {
            Spliterator spliterator2 = this.a.spliterator();
            this.c = spliterator2;
            return spliterator2.trySplit();
        }
        I0 i03 = this.a;
        this.b = 1;
        return i03.b(0).spliterator();
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
        for (int i = this.b; i < this.a.q(); i++) {
            j += this.a.b(i).count();
        }
        return j;
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.f0 trySplit() {
        return (j$.util.f0) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.Z trySplit() {
        return (j$.util.Z) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.c0 trySplit() {
        return (j$.util.c0) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.W trySplit() {
        return (j$.util.W) trySplit();
    }
}
