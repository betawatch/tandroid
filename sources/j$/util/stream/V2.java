package j$.util.stream;

import j$.util.Spliterator;
import java.util.Arrays;

/* loaded from: classes2.dex */
abstract class V2 extends d implements Iterable, j$.lang.a {
    Object e;
    Object[] f;

    public abstract Object c(int i);

    protected abstract void s(Object obj, int i, int i2, Object obj2);

    public abstract Spliterator spliterator();

    @Override // java.lang.Iterable
    public final /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    protected abstract int t(Object obj);

    protected abstract Object[] w();

    V2(int i) {
        super(i);
        this.e = c(1 << this.a);
    }

    V2() {
        this.e = c(16);
    }

    protected final void v(long j) {
        long t;
        int i = this.c;
        if (i == 0) {
            t = t(this.e);
        } else {
            t = t(this.f[i]) + this.d[i];
        }
        if (j > t) {
            if (this.f == null) {
                Object[] w = w();
                this.f = w;
                this.d = new long[8];
                w[0] = this.e;
            }
            int i2 = this.c + 1;
            while (j > t) {
                Object[] objArr = this.f;
                if (i2 >= objArr.length) {
                    int length = objArr.length * 2;
                    this.f = Arrays.copyOf(objArr, length);
                    this.d = Arrays.copyOf(this.d, length);
                }
                int i3 = this.a;
                if (i2 != 0 && i2 != 1) {
                    i3 = Math.min((i3 + i2) - 1, 30);
                }
                int i4 = 1 << i3;
                this.f[i2] = c(i4);
                long[] jArr = this.d;
                jArr[i2] = jArr[i2 - 1] + t(this.f[r6]);
                t += i4;
                i2++;
            }
        }
    }

    protected final int u(long j) {
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
            if (j < this.d[i] + t(this.f[i])) {
                return i;
            }
        }
        throw new IndexOutOfBoundsException(Long.toString(j));
    }

    public void r(int i, Object obj) {
        long j = i;
        long count = count() + j;
        if (count > t(obj) || count < j) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.c == 0) {
            System.arraycopy(this.e, 0, obj, i, this.b);
            return;
        }
        for (int i2 = 0; i2 < this.c; i2++) {
            Object obj2 = this.f[i2];
            System.arraycopy(obj2, 0, obj, i, t(obj2));
            i += t(this.f[i2]);
        }
        int i3 = this.b;
        if (i3 > 0) {
            System.arraycopy(this.e, 0, obj, i, i3);
        }
    }

    public Object d() {
        long count = count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object c = c((int) count);
        r(0, c);
        return c;
    }

    protected final void x() {
        long t;
        if (this.b == t(this.e)) {
            if (this.f == null) {
                Object[] w = w();
                this.f = w;
                this.d = new long[8];
                w[0] = this.e;
            }
            int i = this.c;
            int i2 = i + 1;
            Object[] objArr = this.f;
            if (i2 >= objArr.length || objArr[i2] == null) {
                if (i == 0) {
                    t = t(this.e);
                } else {
                    t = t(objArr[i]) + this.d[i];
                }
                v(t + 1);
            }
            this.b = 0;
            int i3 = this.c + 1;
            this.c = i3;
            this.e = this.f[i3];
        }
    }

    @Override // j$.util.stream.d
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

    public void e(Object obj) {
        for (int i = 0; i < this.c; i++) {
            Object obj2 = this.f[i];
            s(obj2, 0, t(obj2), obj);
        }
        s(this.e, 0, this.b, obj);
    }
}
