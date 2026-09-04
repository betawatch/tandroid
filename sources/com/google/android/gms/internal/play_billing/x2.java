package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class x2 {
    public static final x2 f = new x2(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public x2(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.a = i10;
        this.b = iArr;
        this.c = objArr;
        this.e = z10;
    }

    public static x2 b() {
        return new x2(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int b10;
        int c10;
        int b11;
        int i10 = this.d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.a; i12++) {
            int i13 = this.b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 == 1) {
                    ((Long) this.c[i12]).getClass();
                    b11 = m1.b(i14 << 3) + 8;
                } else if (i15 == 2) {
                    int i16 = i14 << 3;
                    l1 l1Var = (l1) this.c[i12];
                    int b12 = m1.b(i16);
                    int o9 = l1Var.o();
                    i11 = m1.b(o9) + o9 + b12 + i11;
                } else if (i15 == 3) {
                    int b13 = m1.b(i14 << 3);
                    b10 = b13 + b13;
                    c10 = ((x2) this.c[i12]).a();
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(new b2());
                    }
                    ((Integer) this.c[i12]).getClass();
                    b11 = m1.b(i14 << 3) + 4;
                }
                i11 = b11 + i11;
            } else {
                int i17 = i14 << 3;
                long longValue = ((Long) this.c[i12]).longValue();
                b10 = m1.b(i17);
                c10 = m1.c(longValue);
            }
            i11 = c10 + b10 + i11;
        }
        this.d = i11;
        return i11;
    }

    public final void c(int i10, Object obj) {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
        e(this.a + 1);
        int[] iArr = this.b;
        int i11 = this.a;
        iArr[i11] = i10;
        this.c[i11] = obj;
        this.a = i11 + 1;
    }

    public final void d(i2 i2Var) {
        if (this.a != 0) {
            for (int i10 = 0; i10 < this.a; i10++) {
                int i11 = this.b[i10];
                Object obj = this.c[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    ((m1) i2Var.a).p(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    ((m1) i2Var.a).h(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    ((m1) i2Var.a).e(i13, (l1) obj);
                } else if (i12 == 3) {
                    ((m1) i2Var.a).m(i13, 3);
                    ((x2) obj).d(i2Var);
                    ((m1) i2Var.a).m(i13, 4);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(new b2());
                    }
                    ((m1) i2Var.a).f(i13, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final void e(int i10) {
        int[] iArr = this.b;
        if (i10 > iArr.length) {
            int i11 = this.a;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.b = Arrays.copyOf(iArr, i10);
            this.c = Arrays.copyOf(this.c, i10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof x2)) {
            return false;
        }
        x2 x2Var = (x2) obj;
        int i10 = this.a;
        if (i10 == x2Var.a) {
            int[] iArr = this.b;
            int[] iArr2 = x2Var.b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = x2Var.c;
                    int i12 = this.a;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (objArr[i13].equals(objArr2[i13])) {
                        }
                    }
                    return true;
                }
                if (iArr[i11] != iArr2[i11]) {
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.a;
        int i11 = i10 + 527;
        int[] iArr = this.b;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = ((i11 * 31) + i13) * 31;
        Object[] objArr = this.c;
        int i16 = this.a;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return i15 + i12;
    }
}
