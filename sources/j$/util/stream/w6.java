package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterators;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public abstract class w6 implements j$.util.d1 {
    public int a;
    public final int b;
    public int c;
    public final int d;
    public Object e;
    public final /* synthetic */ x6 f;

    public w6(x6 x6Var, int i, int i2, int i3, int i4) {
        this.f = x6Var;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        Object[] objArr = x6Var.f;
        this.e = objArr == null ? x6Var.e : objArr[i];
    }

    public abstract void a(int i, Object obj, Object obj2);

    public j$.util.d1 b(Object obj, int i, int i2) {
        double[] dArr = (double[]) obj;
        int i3 = i2 + i;
        Spliterators.a(((double[]) Objects.requireNonNull(dArr)).length, i, i3);
        return new j$.util.k1(dArr, i, i3, 1040);
    }

    public abstract j$.util.d1 c(int i, int i2, int i3, int i4);

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        int i = this.a;
        int i2 = this.d;
        int i3 = this.b;
        if (i == i3) {
            return i2 - this.c;
        }
        long[] jArr = this.f.d;
        return ((jArr[i3] + i2) - jArr[i]) - this.c;
    }

    @Override // j$.util.d1
    public final void forEachRemaining(Object obj) {
        x6 x6Var;
        Objects.requireNonNull(obj);
        int i = this.a;
        int i2 = this.d;
        int i3 = this.b;
        if (i < i3 || (i == i3 && this.c < i2)) {
            int i4 = this.c;
            while (true) {
                x6Var = this.f;
                if (i >= i3) {
                    break;
                }
                Object obj2 = x6Var.f[i];
                x6Var.i(obj2, i4, x6Var.j(obj2), obj);
                i++;
                i4 = 0;
            }
            x6Var.i(this.a == i3 ? this.e : x6Var.f[i3], i4, i2, obj);
            this.a = i3;
            this.c = i2;
        }
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

    @Override // j$.util.d1
    public final boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        int i = this.a;
        int i2 = this.b;
        if (i >= i2 && (i != i2 || this.c >= this.d)) {
            return false;
        }
        Object obj2 = this.e;
        int i3 = this.c;
        this.c = i3 + 1;
        a(i3, obj2, obj);
        int i4 = this.c;
        Object obj3 = this.e;
        x6 x6Var = this.f;
        if (i4 == x6Var.j(obj3)) {
            this.c = 0;
            int i5 = this.a + 1;
            this.a = i5;
            Object[] objArr = x6Var.f;
            if (objArr != null && i5 <= i2) {
                this.e = objArr[i5];
            }
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final j$.util.d1 trySplit() {
        int i = this.a;
        int i2 = this.b;
        if (i < i2) {
            int i3 = i2 - 1;
            int i4 = this.c;
            x6 x6Var = this.f;
            j$.util.d1 c = c(i, i3, i4, x6Var.j(x6Var.f[i3]));
            this.a = i2;
            this.c = 0;
            this.e = x6Var.f[i2];
            return c;
        }
        if (i != i2) {
            return null;
        }
        int i5 = this.c;
        int i6 = (this.d - i5) / 2;
        if (i6 == 0) {
            return null;
        }
        j$.util.d1 b = b(this.e, i5, i6);
        this.c += i6;
        return b;
    }

    public final /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public final /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public final /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public final /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public final /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    @Override // j$.util.d1, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.x0 trySplit() {
        return (j$.util.x0) trySplit();
    }

    public final /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }

    @Override // j$.util.d1, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.a1 trySplit() {
        return (j$.util.a1) trySplit();
    }

    @Override // j$.util.d1, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.u0 trySplit() {
        return (j$.util.u0) trySplit();
    }
}
