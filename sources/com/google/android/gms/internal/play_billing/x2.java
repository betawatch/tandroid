package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class x2 {
    public static final x2 f = new x2(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public x2(int i7, int[] iArr, Object[] objArr, boolean z9) {
        this.a = i7;
        this.b = iArr;
        this.c = objArr;
        this.e = z9;
    }

    public static x2 b() {
        return new x2(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int b10;
        int c10;
        int b11;
        int i7 = this.d;
        if (i7 != -1) {
            return i7;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.a; i11++) {
            int i12 = this.b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 == 1) {
                    ((Long) this.c[i11]).getClass();
                    b11 = m1.b(i13 << 3) + 8;
                } else if (i14 == 2) {
                    int i15 = i13 << 3;
                    l1 l1Var = (l1) this.c[i11];
                    int b12 = m1.b(i15);
                    int j3 = l1Var.j();
                    i10 = m1.b(j3) + j3 + b12 + i10;
                } else if (i14 == 3) {
                    int b13 = m1.b(i13 << 3);
                    b10 = b13 + b13;
                    c10 = ((x2) this.c[i11]).a();
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException(new b2());
                    }
                    ((Integer) this.c[i11]).getClass();
                    b11 = m1.b(i13 << 3) + 4;
                }
                i10 = b11 + i10;
            } else {
                int i16 = i13 << 3;
                long longValue = ((Long) this.c[i11]).longValue();
                b10 = m1.b(i16);
                c10 = m1.c(longValue);
            }
            i10 = c10 + b10 + i10;
        }
        this.d = i10;
        return i10;
    }

    public final void c(int i7, Object obj) {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
        e(this.a + 1);
        int[] iArr = this.b;
        int i10 = this.a;
        iArr[i10] = i7;
        this.c[i10] = obj;
        this.a = i10 + 1;
    }

    public final void d(i2 i2Var) {
        if (this.a != 0) {
            for (int i7 = 0; i7 < this.a; i7++) {
                int i10 = this.b[i7];
                Object obj = this.c[i7];
                int i11 = i10 & 7;
                int i12 = i10 >>> 3;
                if (i11 == 0) {
                    ((m1) i2Var.a).p(i12, ((Long) obj).longValue());
                } else if (i11 == 1) {
                    ((m1) i2Var.a).h(i12, ((Long) obj).longValue());
                } else if (i11 == 2) {
                    ((m1) i2Var.a).e(i12, (l1) obj);
                } else if (i11 == 3) {
                    ((m1) i2Var.a).m(i12, 3);
                    ((x2) obj).d(i2Var);
                    ((m1) i2Var.a).m(i12, 4);
                } else {
                    if (i11 != 5) {
                        throw new RuntimeException(new b2());
                    }
                    ((m1) i2Var.a).f(i12, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final void e(int i7) {
        int[] iArr = this.b;
        if (i7 > iArr.length) {
            int i10 = this.a;
            int i11 = (i10 / 2) + i10;
            if (i11 >= i7) {
                i7 = i11;
            }
            if (i7 < 8) {
                i7 = 8;
            }
            this.b = Arrays.copyOf(iArr, i7);
            this.c = Arrays.copyOf(this.c, i7);
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
        int i7 = this.a;
        if (i7 == x2Var.a) {
            int[] iArr = this.b;
            int[] iArr2 = x2Var.b;
            int i10 = 0;
            while (true) {
                if (i10 >= i7) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = x2Var.c;
                    int i11 = this.a;
                    for (int i12 = 0; i12 < i11; i12++) {
                        if (objArr[i12].equals(objArr2[i12])) {
                        }
                    }
                    return true;
                }
                if (iArr[i10] != iArr2[i10]) {
                    break;
                }
                i10++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.a;
        int i10 = i7 + 527;
        int[] iArr = this.b;
        int i11 = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i7; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i10 * 31) + i12) * 31;
        Object[] objArr = this.c;
        int i15 = this.a;
        for (int i16 = 0; i16 < i15; i16++) {
            i11 = (i11 * 31) + objArr[i16].hashCode();
        }
        return i14 + i11;
    }
}
