package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.Comparator;

/* loaded from: classes2.dex */
abstract class j1 implements Spliterator {
    G0 a;
    int b;
    Spliterator c;
    Spliterator d;
    ArrayDeque e;

    j1(G0 g0) {
        this.a = g0;
    }

    protected static G0 b(ArrayDeque arrayDeque) {
        while (true) {
            G0 g0 = (G0) arrayDeque.pollFirst();
            if (g0 == null) {
                return null;
            }
            if (g0.p() != 0) {
                for (int p = g0.p() - 1; p >= 0; p--) {
                    arrayDeque.addFirst(g0.a(p));
                }
            } else if (g0.count() > 0) {
                return g0;
            }
        }
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 64;
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
        for (int i = this.b; i < this.a.p(); i++) {
            j += this.a.a(i).count();
        }
        return j;
    }

    protected final ArrayDeque f() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int p = this.a.p();
        while (true) {
            p--;
            if (p < this.b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.a.a(p));
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.util.A.j(this);
    }

    protected final boolean h() {
        if (this.a == null) {
            return false;
        }
        if (this.d != null) {
            return true;
        }
        Spliterator spliterator = this.c;
        if (spliterator == null) {
            ArrayDeque f = f();
            this.e = f;
            G0 b = b(f);
            if (b == null) {
                this.a = null;
                return false;
            }
            spliterator = b.spliterator();
        }
        this.d = spliterator;
        return true;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.util.A.k(this, i);
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.D trySplit() {
        return (j$.util.D) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.G trySplit() {
        return (j$.util.G) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.J trySplit() {
        return (j$.util.J) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.M trySplit() {
        return (j$.util.M) trySplit();
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        G0 g0 = this.a;
        if (g0 == null || this.d != null) {
            return null;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            return spliterator.trySplit();
        }
        if (this.b < g0.p() - 1) {
            G0 g02 = this.a;
            int i = this.b;
            this.b = i + 1;
            return g02.a(i).spliterator();
        }
        G0 a = this.a.a(this.b);
        this.a = a;
        if (a.p() == 0) {
            Spliterator spliterator2 = this.a.spliterator();
            this.c = spliterator2;
            return spliterator2.trySplit();
        }
        G0 g03 = this.a;
        this.b = 1;
        return g03.a(0).spliterator();
    }
}
