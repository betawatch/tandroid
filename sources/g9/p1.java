package g9;

import b8.yb;
import b8.zb;
import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class p1 {
    public transient Object[] a;
    public transient int[] b;
    public transient int c;
    public transient int[] d;
    public transient long[] e;
    public transient float f;
    public transient int g;

    public final void a(int i3) {
        if (i3 > this.e.length) {
            f(i3);
        }
        if (i3 >= this.g) {
            g(Math.max(2, Integer.highestOneBit(i3 - 1) << 1));
        }
    }

    public final int b(Object obj) {
        int c2 = c(obj);
        if (c2 == -1) {
            return 0;
        }
        return this.b[c2];
    }

    public final int c(Object obj) {
        int v = o.v(obj);
        int i3 = this.d[(r1.length - 1) & v];
        while (i3 != -1) {
            long j10 = this.e[i3];
            if (((int) (j10 >>> 32)) == v && yb.a(obj, this.a[i3])) {
                return i3;
            }
            i3 = (int) j10;
        }
        return -1;
    }

    public final void d(int i3) {
        zb.e("Initial capacity must be non-negative", i3 >= 0);
        int max = Math.max(i3, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max > ((int) (1.0f * highestOneBit)) && (highestOneBit = highestOneBit << 1) <= 0) {
            highestOneBit = TLObject.FLAG_30;
        }
        int[] iArr = new int[highestOneBit];
        Arrays.fill(iArr, -1);
        this.d = iArr;
        this.f = 1.0f;
        this.a = new Object[i3];
        this.b = new int[i3];
        long[] jArr = new long[i3];
        Arrays.fill(jArr, -1L);
        this.e = jArr;
        this.g = Math.max(1, (int) (highestOneBit * 1.0f));
    }

    public final void e(int i3, Object obj) {
        long j10;
        if (i3 <= 0) {
            throw new IllegalArgumentException(k2.p1.i(i3, "count must be positive but was: "));
        }
        long[] jArr = this.e;
        Object[] objArr = this.a;
        int[] iArr = this.b;
        int v = o.v(obj);
        int[] iArr2 = this.d;
        int length = (iArr2.length - 1) & v;
        int i10 = this.c;
        int i11 = iArr2[length];
        if (i11 == -1) {
            iArr2[length] = i10;
            j10 = 4294967295L;
        } else {
            while (true) {
                long j11 = jArr[i11];
                j10 = 4294967295L;
                if (((int) (j11 >>> 32)) == v && yb.a(obj, objArr[i11])) {
                    int i12 = iArr[i11];
                    iArr[i11] = i3;
                    return;
                } else {
                    int i13 = (int) j11;
                    if (i13 == -1) {
                        jArr[i11] = ((-4294967296L) & j11) | (i10 & 4294967295L);
                        break;
                    }
                    i11 = i13;
                }
            }
        }
        int i14 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        if (i10 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i15 = i10 + 1;
        int length2 = this.e.length;
        if (i15 > length2) {
            int max = Math.max(1, length2 >>> 1) + length2;
            if (max >= 0) {
                i14 = max;
            }
            if (i14 != length2) {
                f(i14);
            }
        }
        this.e[i10] = (v << 32) | j10;
        this.a[i10] = obj;
        this.b[i10] = i3;
        this.c = i15;
        if (i10 >= this.g) {
            g(this.d.length * 2);
        }
    }

    public final void f(int i3) {
        this.a = Arrays.copyOf(this.a, i3);
        this.b = Arrays.copyOf(this.b, i3);
        long[] jArr = this.e;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i3);
        if (i3 > length) {
            Arrays.fill(copyOf, length, i3, -1L);
        }
        this.e = copyOf;
    }

    public final void g(int i3) {
        if (this.d.length >= 1073741824) {
            this.g = ConnectionsManager.DEFAULT_DATACENTER_ID;
            return;
        }
        int i10 = ((int) (i3 * this.f)) + 1;
        int[] iArr = new int[i3];
        Arrays.fill(iArr, -1);
        long[] jArr = this.e;
        int i11 = i3 - 1;
        for (int i12 = 0; i12 < this.c; i12++) {
            int i13 = (int) (jArr[i12] >>> 32);
            int i14 = i13 & i11;
            int i15 = iArr[i14];
            iArr[i14] = i12;
            jArr[i12] = (i13 << 32) | (i15 & 4294967295L);
        }
        this.g = i10;
        this.d = iArr;
    }
}
