package e9;

import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import v7.t6;
import v7.u6;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class u1 {
    public transient Object[] a;
    public transient int[] b;
    public transient int c;
    public transient int[] d;
    public transient long[] e;
    public transient float f;
    public transient int g;

    public final void a(int i10) {
        if (i10 > this.e.length) {
            f(i10);
        }
        if (i10 >= this.g) {
            g(Math.max(2, Integer.highestOneBit(i10 - 1) << 1));
        }
    }

    public final int b(Object obj) {
        int c10 = c(obj);
        if (c10 == -1) {
            return 0;
        }
        return this.b[c10];
    }

    public final int c(Object obj) {
        int u10 = s.u(obj);
        int i10 = this.d[(r1.length - 1) & u10];
        while (i10 != -1) {
            long j10 = this.e[i10];
            if (((int) (j10 >>> 32)) == u10 && t6.a(obj, this.a[i10])) {
                return i10;
            }
            i10 = (int) j10;
        }
        return -1;
    }

    public final void d(int i10) {
        u6.f("Initial capacity must be non-negative", i10 >= 0);
        int max = Math.max(i10, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max > ((int) (1.0f * highestOneBit)) && (highestOneBit = highestOneBit << 1) <= 0) {
            highestOneBit = TLObject.FLAG_30;
        }
        int[] iArr = new int[highestOneBit];
        Arrays.fill(iArr, -1);
        this.d = iArr;
        this.f = 1.0f;
        this.a = new Object[i10];
        this.b = new int[i10];
        long[] jArr = new long[i10];
        Arrays.fill(jArr, -1L);
        this.e = jArr;
        this.g = Math.max(1, (int) (highestOneBit * 1.0f));
    }

    public final void e(int i10, Object obj) {
        long j10;
        if (i10 <= 0) {
            throw new IllegalArgumentException(i2.o1.k(i10, "count must be positive but was: "));
        }
        long[] jArr = this.e;
        Object[] objArr = this.a;
        int[] iArr = this.b;
        int u10 = s.u(obj);
        int[] iArr2 = this.d;
        int length = (iArr2.length - 1) & u10;
        int i11 = this.c;
        int i12 = iArr2[length];
        if (i12 == -1) {
            iArr2[length] = i11;
            j10 = 4294967295L;
        } else {
            while (true) {
                long j11 = jArr[i12];
                j10 = 4294967295L;
                if (((int) (j11 >>> 32)) == u10 && t6.a(obj, objArr[i12])) {
                    int i13 = iArr[i12];
                    iArr[i12] = i10;
                    return;
                } else {
                    int i14 = (int) j11;
                    if (i14 == -1) {
                        jArr[i12] = ((-4294967296L) & j11) | (i11 & 4294967295L);
                        break;
                    }
                    i12 = i14;
                }
            }
        }
        int i15 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        if (i11 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i16 = i11 + 1;
        int length2 = this.e.length;
        if (i16 > length2) {
            int max = Math.max(1, length2 >>> 1) + length2;
            if (max >= 0) {
                i15 = max;
            }
            if (i15 != length2) {
                f(i15);
            }
        }
        this.e[i11] = (u10 << 32) | j10;
        this.a[i11] = obj;
        this.b[i11] = i10;
        this.c = i16;
        if (i11 >= this.g) {
            g(this.d.length * 2);
        }
    }

    public final void f(int i10) {
        this.a = Arrays.copyOf(this.a, i10);
        this.b = Arrays.copyOf(this.b, i10);
        long[] jArr = this.e;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i10);
        if (i10 > length) {
            Arrays.fill(copyOf, length, i10, -1L);
        }
        this.e = copyOf;
    }

    public final void g(int i10) {
        if (this.d.length >= 1073741824) {
            this.g = ConnectionsManager.DEFAULT_DATACENTER_ID;
            return;
        }
        int i11 = ((int) (i10 * this.f)) + 1;
        int[] iArr = new int[i10];
        Arrays.fill(iArr, -1);
        long[] jArr = this.e;
        int i12 = i10 - 1;
        for (int i13 = 0; i13 < this.c; i13++) {
            int i14 = (int) (jArr[i13] >>> 32);
            int i15 = i14 & i12;
            int i16 = iArr[i15];
            iArr[i15] = i13;
            jArr[i13] = (i14 << 32) | (i16 & 4294967295L);
        }
        this.g = i11;
        this.d = iArr;
    }
}
