package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class j1 {
    public static final j1 f = new j1(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public j1(int i9, int[] iArr, Object[] objArr, boolean z10) {
        this.a = i9;
        this.b = iArr;
        this.c = objArr;
        this.e = z10;
    }

    public static j1 b() {
        return new j1(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int y10;
        int A;
        int u10;
        int i9 = this.d;
        if (i9 != -1) {
            return i9;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.a; i11++) {
            int i12 = this.b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 == 1) {
                    ((Long) this.c[i11]).getClass();
                    u10 = k.u(i13);
                } else if (i14 == 2) {
                    u10 = k.r(i13, (g) this.c[i11]);
                } else if (i14 == 3) {
                    y10 = k.y(i13) * 2;
                    A = ((j1) this.c[i11]).a();
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException(c0.b());
                    }
                    ((Integer) this.c[i11]).getClass();
                    u10 = k.t(i13);
                }
                i10 = u10 + i10;
            } else {
                long longValue = ((Long) this.c[i11]).longValue();
                y10 = k.y(i13);
                A = k.A(longValue);
            }
            i10 = A + y10 + i10;
        }
        this.d = i10;
        return i10;
    }

    public final void c(int i9, Object obj) {
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
        iArr2[i12] = i9;
        this.c[i12] = obj;
        this.a = i12 + 1;
    }

    public final void d(l0 l0Var) {
        if (this.a == 0) {
            return;
        }
        l0Var.getClass();
        k kVar = (k) l0Var.a;
        for (int i9 = 0; i9 < this.a; i9++) {
            int i10 = this.b[i9];
            Object obj = this.c[i9];
            int i11 = i10 >>> 3;
            int i12 = i10 & 7;
            if (i12 == 0) {
                kVar.U(i11, ((Long) obj).longValue());
            } else if (i12 == 1) {
                kVar.K(i11, ((Long) obj).longValue());
            } else if (i12 == 2) {
                l0Var.a(i11, (g) obj);
            } else if (i12 == 3) {
                kVar.R(i11, 3);
                ((j1) obj).d(l0Var);
                kVar.R(i11, 4);
            } else {
                if (i12 != 5) {
                    throw new RuntimeException(c0.b());
                }
                kVar.I(i11, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        int i9 = this.a;
        if (i9 == j1Var.a) {
            int[] iArr = this.b;
            int[] iArr2 = j1Var.b;
            int i10 = 0;
            while (true) {
                if (i10 >= i9) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = j1Var.c;
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
        int i9 = this.a;
        int i10 = (527 + i9) * 31;
        int[] iArr = this.b;
        int i11 = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i9; i13++) {
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
