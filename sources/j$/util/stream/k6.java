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
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return j$.com.android.tools.r8.a.p(this, i10);
    }

    public k6(t6 t6Var, int i10, int i11, int i12, int i13) {
        this.f = t6Var;
        this.a = i10;
        this.b = i11;
        this.c = i12;
        this.d = i13;
        Object[][] objArr = t6Var.f;
        this.e = objArr == null ? t6Var.e : objArr[i10];
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

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        int i10 = this.a;
        int i11 = this.b;
        if (i10 >= i11 && (i10 != i11 || this.c >= this.d)) {
            return false;
        }
        Object[] objArr = this.e;
        int i12 = this.c;
        this.c = i12 + 1;
        consumer.x(objArr[i12]);
        if (this.c == this.e.length) {
            this.c = 0;
            int i13 = this.a + 1;
            this.a = i13;
            Object[][] objArr2 = this.f.f;
            if (objArr2 != null && i13 <= i11) {
                this.e = objArr2[i13];
            }
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        t6 t6Var;
        Objects.requireNonNull(consumer);
        int i10 = this.a;
        int i11 = this.d;
        int i12 = this.b;
        if (i10 < i12 || (i10 == i12 && this.c < i11)) {
            int i13 = this.c;
            while (true) {
                t6Var = this.f;
                if (i10 >= i12) {
                    break;
                }
                Object[] objArr = t6Var.f[i10];
                while (i13 < objArr.length) {
                    consumer.x(objArr[i13]);
                    i13++;
                }
                i10++;
                i13 = 0;
            }
            Object[] objArr2 = this.a == i12 ? this.e : t6Var.f[i12];
            while (i13 < i11) {
                consumer.x(objArr2[i13]);
                i13++;
            }
            this.a = i12;
            this.c = i11;
        }
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i10 = this.a;
        int i11 = this.b;
        if (i10 < i11) {
            int i12 = i11 - 1;
            int i13 = this.c;
            t6 t6Var = this.f;
            k6 k6Var = new k6(t6Var, i10, i12, i13, t6Var.f[i12].length);
            this.a = i11;
            this.c = 0;
            this.e = t6Var.f[i11];
            return k6Var;
        }
        if (i10 != i11) {
            return null;
        }
        int i14 = this.c;
        int i15 = (this.d - i14) / 2;
        if (i15 == 0) {
            return null;
        }
        j$.util.j1 a2 = DesugarArrays.a(this.e, i14, i14 + i15);
        this.c += i15;
        return a2;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }
}
