package j$.util.stream;

import j$.util.Objects;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public abstract class r6 implements j$.util.d1 {
    public int a;
    public final int b;
    public int c;
    public final int d;
    public Object e;
    public final /* synthetic */ s6 f;

    public abstract void a(int i10, Object obj, Object obj2);

    public abstract j$.util.d1 b(Object obj, int i10, int i11);

    public abstract j$.util.d1 c(int i10, int i11, int i12, int i13);

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
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

    public r6(s6 s6Var, int i10, int i11, int i12, int i13) {
        this.f = s6Var;
        this.a = i10;
        this.b = i11;
        this.c = i12;
        this.d = i13;
        Object[] objArr = s6Var.f;
        this.e = objArr == null ? s6Var.e : objArr[i10];
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        int i10 = this.a;
        int i11 = this.d;
        int i12 = this.b;
        if (i10 == i12) {
            return i11 - this.c;
        }
        long[] jArr = this.f.d;
        return ((jArr[i12] + i11) - jArr[i10]) - this.c;
    }

    @Override // j$.util.d1
    public final boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        int i10 = this.a;
        int i11 = this.b;
        if (i10 >= i11 && (i10 != i11 || this.c >= this.d)) {
            return false;
        }
        Object obj2 = this.e;
        int i12 = this.c;
        this.c = i12 + 1;
        a(i12, obj2, obj);
        int i13 = this.c;
        Object obj3 = this.e;
        s6 s6Var = this.f;
        if (i13 == s6Var.j(obj3)) {
            this.c = 0;
            int i14 = this.a + 1;
            this.a = i14;
            Object[] objArr = s6Var.f;
            if (objArr != null && i14 <= i11) {
                this.e = objArr[i14];
            }
        }
        return true;
    }

    @Override // j$.util.d1
    public final void forEachRemaining(Object obj) {
        s6 s6Var;
        Objects.requireNonNull(obj);
        int i10 = this.a;
        int i11 = this.d;
        int i12 = this.b;
        if (i10 < i12 || (i10 == i12 && this.c < i11)) {
            int i13 = this.c;
            while (true) {
                s6Var = this.f;
                if (i10 >= i12) {
                    break;
                }
                Object obj2 = s6Var.f[i10];
                s6Var.i(obj2, i13, s6Var.j(obj2), obj);
                i10++;
                i13 = 0;
            }
            s6Var.i(this.a == i12 ? this.e : s6Var.f[i12], i13, i11, obj);
            this.a = i12;
            this.c = i11;
        }
    }

    @Override // j$.util.Spliterator
    public final j$.util.d1 trySplit() {
        int i10 = this.a;
        int i11 = this.b;
        if (i10 < i11) {
            int i12 = i11 - 1;
            int i13 = this.c;
            s6 s6Var = this.f;
            j$.util.d1 c3 = c(i10, i12, i13, s6Var.j(s6Var.f[i12]));
            this.a = i11;
            this.c = 0;
            this.e = s6Var.f[i11];
            return c3;
        }
        if (i10 != i11) {
            return null;
        }
        int i14 = this.c;
        int i15 = (this.d - i14) / 2;
        if (i15 == 0) {
            return null;
        }
        j$.util.d1 b10 = b(this.e, i14, i15);
        this.c += i15;
        return b10;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    @Override // j$.util.d1, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.x0 trySplit() {
        return (j$.util.x0) trySplit();
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    @Override // j$.util.d1, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.a1 trySplit() {
        return (j$.util.a1) trySplit();
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }

    @Override // j$.util.d1, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.u0 trySplit() {
        return (j$.util.u0) trySplit();
    }
}
