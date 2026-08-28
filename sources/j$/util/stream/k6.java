package j$.util.stream;

import j$.util.DesugarArrays;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class k6 implements Spliterator {
    public int a;
    public final int b;
    public int c;
    public final int d;
    public Object[] e;
    public final /* synthetic */ t6 f;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.com.android.tools.r8.a.n(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i9) {
        return j$.com.android.tools.r8.a.p(this, i9);
    }

    public k6(t6 t6Var, int i9, int i10, int i11, int i12) {
        this.f = t6Var;
        this.a = i9;
        this.b = i10;
        this.c = i11;
        this.d = i12;
        Object[][] objArr = t6Var.f;
        this.e = objArr == null ? t6Var.e : objArr[i9];
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        int i9 = this.a;
        int i10 = this.d;
        int i11 = this.b;
        if (i9 == i11) {
            return i10 - this.c;
        }
        long[] jArr = this.f.d;
        return ((jArr[i11] + i10) - jArr[i9]) - this.c;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        int i9 = this.a;
        int i10 = this.b;
        if (i9 >= i10 && (i9 != i10 || this.c >= this.d)) {
            return false;
        }
        Object[] objArr = this.e;
        int i11 = this.c;
        this.c = i11 + 1;
        consumer.x(objArr[i11]);
        if (this.c == this.e.length) {
            this.c = 0;
            int i12 = this.a + 1;
            this.a = i12;
            Object[][] objArr2 = this.f.f;
            if (objArr2 != null && i12 <= i10) {
                this.e = objArr2[i12];
            }
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        t6 t6Var;
        Objects.requireNonNull(consumer);
        int i9 = this.a;
        int i10 = this.d;
        int i11 = this.b;
        if (i9 < i11 || (i9 == i11 && this.c < i10)) {
            int i12 = this.c;
            while (true) {
                t6Var = this.f;
                if (i9 >= i11) {
                    break;
                }
                Object[] objArr = t6Var.f[i9];
                while (i12 < objArr.length) {
                    consumer.x(objArr[i12]);
                    i12++;
                }
                i9++;
                i12 = 0;
            }
            Object[] objArr2 = this.a == i11 ? this.e : t6Var.f[i11];
            while (i12 < i10) {
                consumer.x(objArr2[i12]);
                i12++;
            }
            this.a = i11;
            this.c = i10;
        }
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i9 = this.a;
        int i10 = this.b;
        if (i9 < i10) {
            int i11 = i10 - 1;
            int i12 = this.c;
            t6 t6Var = this.f;
            k6 k6Var = new k6(t6Var, i9, i11, i12, t6Var.f[i11].length);
            this.a = i10;
            this.c = 0;
            this.e = t6Var.f[i10];
            return k6Var;
        }
        if (i9 != i10) {
            return null;
        }
        int i13 = this.c;
        int i14 = (this.d - i13) / 2;
        if (i14 == 0) {
            return null;
        }
        j$.util.j1 a2 = DesugarArrays.a(this.e, i13, i13 + i14);
        this.c += i14;
        return a2;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }
}
