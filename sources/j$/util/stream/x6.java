package j$.util.stream;

import j$.util.Spliterator;
import java.util.Arrays;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes4.dex */
public abstract class x6 extends c implements Iterable {
    public Object e;
    public Object[] f;

    public x6(int i) {
        super(i);
        this.e = newArray(1 << this.a);
    }

    public Object b() {
        long count = count();
        if (count >= 2147483639) {
            j$.time.g.c("Stream size exceeds max array size");
            return null;
        }
        Object newArray = newArray((int) count);
        c(0, newArray);
        return newArray;
    }

    public void c(int i, Object obj) {
        long j = i;
        long count = count() + j;
        if (count > j(obj) || count < j) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.c == 0) {
            System.arraycopy(this.e, 0, obj, i, this.b);
            return;
        }
        for (int i2 = 0; i2 < this.c; i2++) {
            Object obj2 = this.f[i2];
            System.arraycopy(obj2, 0, obj, i, j(obj2));
            i += j(this.f[i2]);
        }
        int i3 = this.b;
        if (i3 > 0) {
            System.arraycopy(this.e, 0, obj, i, i3);
        }
    }

    @Override // j$.util.stream.c
    public final void clear() {
        Object[] objArr = this.f;
        if (objArr != null) {
            this.e = objArr[0];
            this.f = null;
            this.d = null;
        }
        this.b = 0;
        this.c = 0;
    }

    public void d(Object obj) {
        for (int i = 0; i < this.c; i++) {
            Object obj2 = this.f[i];
            i(obj2, 0, j(obj2), obj);
        }
        i(this.e, 0, this.b, obj);
    }

    public abstract void i(Object obj, int i, int i2, Object obj2);

    public int j(Object obj) {
        return ((long[]) obj).length;
    }

    public final int k(long j) {
        if (this.c == 0) {
            if (j < this.b) {
                return 0;
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        if (j >= count()) {
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        for (int i = 0; i <= this.c; i++) {
            if (j < this.d[i] + j(this.f[i])) {
                return i;
            }
        }
        throw new IndexOutOfBoundsException(Long.toString(j));
    }

    public final void l(long j) {
        long j2;
        int i = this.c;
        if (i == 0) {
            j2 = j(this.e);
        } else {
            j2 = j(this.f[i]) + this.d[i];
        }
        if (j > j2) {
            if (this.f == null) {
                Object[] m = m();
                this.f = m;
                this.d = new long[8];
                m[0] = this.e;
            }
            int i2 = this.c + 1;
            while (j > j2) {
                Object[] objArr = this.f;
                if (i2 >= objArr.length) {
                    int length = objArr.length << 1;
                    this.f = Arrays.copyOf(objArr, length);
                    this.d = Arrays.copyOf(this.d, length);
                }
                int i3 = this.a;
                if (i2 != 0 && i2 != 1) {
                    i3 = Math.min((i3 + i2) - 1, 30);
                }
                int i4 = 1 << i3;
                this.f[i2] = newArray(i4);
                long[] jArr = this.d;
                jArr[i2] = jArr[i2 - 1] + j(this.f[r6]);
                j2 += i4;
                i2++;
            }
        }
    }

    public Object[] m() {
        return new long[8][];
    }

    public Object newArray(int i) {
        return new long[i];
    }

    public final void p() {
        long j;
        if (this.b == j(this.e)) {
            Object[] objArr = this.f;
            if (objArr == null) {
                objArr = m();
                this.f = objArr;
                this.d = new long[8];
                objArr[0] = this.e;
            }
            int i = this.c;
            int i2 = i + 1;
            if (i2 >= objArr.length || objArr[i2] == null) {
                if (i == 0) {
                    j = j(this.e);
                } else {
                    j = j(objArr[i]) + this.d[i];
                }
                l(j + 1);
            }
            this.b = 0;
            int i3 = this.c + 1;
            this.c = i3;
            this.e = this.f[i3];
        }
    }

    public abstract Spliterator spliterator();

    @Override // java.lang.Iterable
    public final /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    public x6() {
        this.e = newArray(16);
    }
}
