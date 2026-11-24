package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public abstract class k3 implements Spliterator {
    public h2 a;
    public int b;
    public Spliterator c;
    public Spliterator d;
    public Deque e;

    public k3(j2 j2Var) {
        this.a = j2Var;
    }

    public static h2 a(Deque deque) {
        while (true) {
            ArrayDeque arrayDeque = (ArrayDeque) deque;
            h2 h2Var = (h2) arrayDeque.pollFirst();
            if (h2Var == null) {
                return null;
            }
            if (h2Var.h() != 0) {
                for (int h = h2Var.h() - 1; h >= 0; h--) {
                    arrayDeque.addFirst(h2Var.a(h));
                }
            } else if (h2Var.count() > 0) {
                return h2Var;
            }
        }
    }

    public final Deque b() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int h = this.a.h();
        while (true) {
            h--;
            if (h < this.b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.a.a(h));
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
        if (spliterator != null) {
            this.d = spliterator;
            return true;
        }
        Deque b = b();
        this.e = b;
        h2 a = a(b);
        if (a != null) {
            this.d = a.spliterator();
            return true;
        }
        this.a = null;
        return false;
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
        for (int i = this.b; i < this.a.h(); i++) {
            j += this.a.a(i).count();
        }
        return j;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.time.a.m(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.time.a.o(this, i);
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        h2 h2Var = this.a;
        if (h2Var == null || this.d != null) {
            return null;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            return spliterator.trySplit();
        }
        int i = this.b;
        int h = h2Var.h() - 1;
        h2 h2Var2 = this.a;
        int i2 = this.b;
        if (i < h) {
            this.b = i2 + 1;
            return h2Var2.a(i2).spliterator();
        }
        h2 a = h2Var2.a(i2);
        this.a = a;
        int h2 = a.h();
        h2 h2Var3 = this.a;
        if (h2 != 0) {
            this.b = 1;
            return h2Var3.a(0).spliterator();
        }
        Spliterator spliterator2 = h2Var3.spliterator();
        this.c = spliterator2;
        return spliterator2.trySplit();
    }

    @Override // j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.d1 trySplit() {
        return (j$.util.d1) trySplit();
    }

    @Override // j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.x0 trySplit() {
        return (j$.util.x0) trySplit();
    }

    @Override // j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.a1 trySplit() {
        return (j$.util.a1) trySplit();
    }

    @Override // j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.u0 trySplit() {
        return (j$.util.u0) trySplit();
    }
}
