package com.google.android.gms.internal.vision;

import java.util.Arrays;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class q2 {
    public static final q2 f = new q2(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public q2(int i7, int[] iArr, Object[] objArr, boolean z9) {
        this.a = i7;
        this.b = iArr;
        this.c = objArr;
        this.e = z9;
    }

    public static q2 b() {
        return new q2(0, new int[8], new Object[8], true);
    }

    public final void a(int i7, Object obj) {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
        int i10 = this.a;
        int[] iArr = this.b;
        if (i10 == iArr.length) {
            int i11 = i10 + (i10 < 4 ? 8 : i10 >> 1);
            this.b = Arrays.copyOf(iArr, i11);
            this.c = Arrays.copyOf(this.c, i11);
        }
        int[] iArr2 = this.b;
        int i12 = this.a;
        iArr2[i12] = i7;
        this.c[i12] = obj;
        this.a = i12 + 1;
    }

    public final void c(y1 y1Var) {
        if (this.a == 0) {
            return;
        }
        y1Var.getClass();
        r0 r0Var = (r0) y1Var.a;
        for (int i7 = 0; i7 < this.a; i7++) {
            int i10 = this.b[i7];
            Object obj = this.c[i7];
            int i11 = i10 >>> 3;
            int i12 = i10 & 7;
            if (i12 == 0) {
                long longValue = ((Long) obj).longValue();
                r0Var.D(i11, 0);
                r0Var.E(longValue);
            } else if (i12 == 1) {
                long longValue2 = ((Long) obj).longValue();
                r0Var.D(i11, 1);
                r0Var.K(longValue2);
            } else if (i12 == 2) {
                y1Var.a(i11, (q0) obj);
            } else if (i12 == 3) {
                r0Var.D(i11, 3);
                ((q2) obj).c(y1Var);
                r0Var.D(i11, 4);
            } else {
                if (i12 != 5) {
                    int i13 = n1.a;
                    throw new RuntimeException(new q1("Protocol message tag had invalid wire type."));
                }
                int intValue = ((Integer) obj).intValue();
                r0Var.D(i11, 5);
                r0Var.M(intValue);
            }
        }
    }

    public final int d() {
        int N;
        int i7 = this.d;
        if (i7 != -1) {
            return i7;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.a; i11++) {
            int i12 = this.b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 == 0) {
                N = r0.N(i13, ((Long) this.c[i11]).longValue());
            } else if (i14 == 1) {
                ((Long) this.c[i11]).getClass();
                N = r0.R(i13);
            } else if (i14 == 2) {
                N = r0.J(i13, (q0) this.c[i11]);
            } else if (i14 == 3) {
                i10 = ((q2) this.c[i11]).d() + (r0.y(i13) << 1) + i10;
            } else {
                if (i14 != 5) {
                    int i15 = n1.a;
                    throw new IllegalStateException(new q1("Protocol message tag had invalid wire type."));
                }
                ((Integer) this.c[i11]).getClass();
                N = r0.V(i13);
            }
            i10 = N + i10;
        }
        this.d = i10;
        return i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof q2)) {
            return false;
        }
        q2 q2Var = (q2) obj;
        int i7 = this.a;
        if (i7 == q2Var.a) {
            int[] iArr = this.b;
            int[] iArr2 = q2Var.b;
            int i10 = 0;
            while (true) {
                if (i10 >= i7) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = q2Var.c;
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
        int i10 = (i7 + 527) * 31;
        int[] iArr = this.b;
        int i11 = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i7; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i10 + i12) * 31;
        Object[] objArr = this.c;
        int i15 = this.a;
        for (int i16 = 0; i16 < i15; i16++) {
            i11 = (i11 * 31) + objArr[i16].hashCode();
        }
        return i14 + i11;
    }
}
