package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;

/* loaded from: classes2.dex */
public abstract class h3 implements Spliterator {
    public e2 a;
    public int b;
    public Spliterator c;
    public Spliterator d;
    public Deque e;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 64;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.com.android.tools.r8.a.n(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return j$.com.android.tools.r8.a.p(this, i10);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public h3(e2 e2Var) {
        this.a = e2Var;
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

    public static e2 a(Deque deque) {
        while (true) {
            ArrayDeque arrayDeque = (ArrayDeque) deque;
            e2 e2Var = (e2) arrayDeque.pollFirst();
            if (e2Var == null) {
                return null;
            }
            if (e2Var.h() != 0) {
                for (int h = e2Var.h() - 1; h >= 0; h--) {
                    arrayDeque.addFirst(e2Var.a(h));
                }
            } else if (e2Var.count() > 0) {
                return e2Var;
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
            Deque b10 = b();
            this.e = b10;
            e2 a2 = a(b10);
            if (a2 != null) {
                this.d = a2.spliterator();
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
        e2 e2Var = this.a;
        if (e2Var == null || this.d != null) {
            return null;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            return spliterator.trySplit();
        }
        if (this.b < e2Var.h() - 1) {
            e2 e2Var2 = this.a;
            int i10 = this.b;
            this.b = i10 + 1;
            return e2Var2.a(i10).spliterator();
        }
        e2 a2 = this.a.a(this.b);
        this.a = a2;
        if (a2.h() == 0) {
            Spliterator spliterator2 = this.a.spliterator();
            this.c = spliterator2;
            return spliterator2.trySplit();
        }
        e2 e2Var3 = this.a;
        this.b = 1;
        return e2Var3.a(0).spliterator();
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        long j3 = 0;
        if (this.a == null) {
            return 0L;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            return spliterator.estimateSize();
        }
        for (int i10 = this.b; i10 < this.a.h(); i10++) {
            j3 += this.a.a(i10).count();
        }
        return j3;
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.d1 trySplit() {
        return (j$.util.d1) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.x0 trySplit() {
        return (j$.util.x0) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.a1 trySplit() {
        return (j$.util.a1) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.u0 trySplit() {
        return (j$.util.u0) trySplit();
    }
}
