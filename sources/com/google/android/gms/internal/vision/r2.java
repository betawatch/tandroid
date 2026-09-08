package com.google.android.gms.internal.vision;

import java.util.Arrays;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class r2 {
    public static final r2 f = new r2(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public r2(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.a = i10;
        this.b = iArr;
        this.c = objArr;
        this.e = z10;
    }

    public static r2 b() {
        return new r2(0, new int[8], new Object[8], true);
    }

    public final void a(int i10, Object obj) {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
        int i11 = this.a;
        int[] iArr = this.b;
        if (i11 == iArr.length) {
            int i12 = i11 + (i11 < 4 ? 8 : i11 >> 1);
            this.b = Arrays.copyOf(iArr, i12);
            this.c = Arrays.copyOf(this.c, i12);
        }
        int[] iArr2 = this.b;
        int i13 = this.a;
        iArr2[i13] = i10;
        this.c[i13] = obj;
        this.a = i13 + 1;
    }

    public final void c(y1 y1Var) {
        if (this.a == 0) {
            return;
        }
        y1Var.getClass();
        r0 r0Var = (r0) y1Var.a;
        for (int i10 = 0; i10 < this.a; i10++) {
            int i11 = this.b[i10];
            Object obj = this.c[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 == 0) {
                long longValue = ((Long) obj).longValue();
                r0Var.D(i12, 0);
                r0Var.E(longValue);
            } else if (i13 == 1) {
                long longValue2 = ((Long) obj).longValue();
                r0Var.D(i12, 1);
                r0Var.K(longValue2);
            } else if (i13 == 2) {
                y1Var.a(i12, (q0) obj);
            } else if (i13 == 3) {
                r0Var.D(i12, 3);
                ((r2) obj).c(y1Var);
                r0Var.D(i12, 4);
            } else {
                if (i13 != 5) {
                    int i14 = n1.a;
                    throw new RuntimeException(new q1("Protocol message tag had invalid wire type."));
                }
                int intValue = ((Integer) obj).intValue();
                r0Var.D(i12, 5);
                r0Var.M(intValue);
            }
        }
    }

    public final int d() {
        int N;
        int i10 = this.d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.a; i12++) {
            int i13 = this.b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 == 0) {
                N = r0.N(i14, ((Long) this.c[i12]).longValue());
            } else if (i15 == 1) {
                ((Long) this.c[i12]).getClass();
                N = r0.R(i14);
            } else if (i15 == 2) {
                N = r0.J(i14, (q0) this.c[i12]);
            } else if (i15 == 3) {
                i11 = ((r2) this.c[i12]).d() + (r0.y(i14) << 1) + i11;
            } else {
                if (i15 != 5) {
                    int i16 = n1.a;
                    throw new IllegalStateException(new q1("Protocol message tag had invalid wire type."));
                }
                ((Integer) this.c[i12]).getClass();
                N = r0.V(i14);
            }
            i11 = N + i11;
        }
        this.d = i11;
        return i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj;
        int i10 = this.a;
        if (i10 == r2Var.a) {
            int[] iArr = this.b;
            int[] iArr2 = r2Var.b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = r2Var.c;
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
        int i11 = (i10 + 527) * 31;
        int[] iArr = this.b;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i11 + i13) * 31;
        Object[] objArr = this.c;
        int i16 = this.a;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return i15 + i12;
    }
}
