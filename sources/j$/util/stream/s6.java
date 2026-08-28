package j$.util.stream;

import j$.util.Spliterator;
import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class s6 extends c implements Iterable {
    public Object e;
    public Object[] f;

    public abstract void i(Object obj, int i9, int i10, Object obj2);

    public abstract int j(Object obj);

    public abstract Object[] m();

    public abstract Object newArray(int i9);

    public abstract Spliterator spliterator();

    @Override // java.lang.Iterable
    public final /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    public s6(int i9) {
        super(i9);
        this.e = newArray(1 << this.a);
    }

    public s6() {
        this.e = newArray(16);
    }

    public final void l(long j10) {
        long j11;
        int i9 = this.c;
        if (i9 == 0) {
            j11 = j(this.e);
        } else {
            j11 = j(this.f[i9]) + this.d[i9];
        }
        if (j10 > j11) {
            if (this.f == null) {
                Object[] m10 = m();
                this.f = m10;
                this.d = new long[8];
                m10[0] = this.e;
            }
            int i10 = this.c + 1;
            while (j10 > j11) {
                Object[] objArr = this.f;
                if (i10 >= objArr.length) {
                    int length = objArr.length * 2;
                    this.f = Arrays.copyOf(objArr, length);
                    this.d = Arrays.copyOf(this.d, length);
                }
                int i11 = this.a;
                if (i10 != 0 && i10 != 1) {
                    i11 = Math.min((i11 + i10) - 1, 30);
                }
                int i12 = 1 << i11;
                this.f[i10] = newArray(i12);
                long[] jArr = this.d;
                jArr[i10] = jArr[i10 - 1] + j(this.f[r6]);
                j11 += i12;
                i10++;
            }
        }
    }

    public final int k(long j10) {
        if (this.c == 0) {
            if (j10 < this.b) {
                return 0;
            }
            throw new IndexOutOfBoundsException(Long.toString(j10));
        }
        if (j10 >= count()) {
            throw new IndexOutOfBoundsException(Long.toString(j10));
        }
        for (int i9 = 0; i9 <= this.c; i9++) {
            if (j10 < this.d[i9] + j(this.f[i9])) {
                return i9;
            }
        }
        throw new IndexOutOfBoundsException(Long.toString(j10));
    }

    public void c(int i9, Object obj) {
        long j10 = i9;
        long count = count() + j10;
        if (count > j(obj) || count < j10) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.c == 0) {
            System.arraycopy(this.e, 0, obj, i9, this.b);
            return;
        }
        for (int i10 = 0; i10 < this.c; i10++) {
            Object obj2 = this.f[i10];
            System.arraycopy(obj2, 0, obj, i9, j(obj2));
            i9 += j(this.f[i10]);
        }
        int i11 = this.b;
        if (i11 > 0) {
            System.arraycopy(this.e, 0, obj, i9, i11);
        }
    }

    public Object b() {
        long count = count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object newArray = newArray((int) count);
        c(0, newArray);
        return newArray;
    }

    public final void n() {
        long j10;
        if (this.b == j(this.e)) {
            if (this.f == null) {
                Object[] m10 = m();
                this.f = m10;
                this.d = new long[8];
                m10[0] = this.e;
            }
            int i9 = this.c;
            int i10 = i9 + 1;
            Object[] objArr = this.f;
            if (i10 >= objArr.length || objArr[i10] == null) {
                if (i9 == 0) {
                    j10 = j(this.e);
                } else {
                    j10 = j(objArr[i9]) + this.d[i9];
                }
                l(j10 + 1);
            }
            this.b = 0;
            int i11 = this.c + 1;
            this.c = i11;
            this.e = this.f[i11];
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
        for (int i9 = 0; i9 < this.c; i9++) {
            Object obj2 = this.f[i9];
            i(obj2, 0, j(obj2), obj);
        }
        i(this.e, 0, this.b, obj);
    }
}
