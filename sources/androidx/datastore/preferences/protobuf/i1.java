package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class i1 {
    public static final i1 f = new i1(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public i1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.a = i10;
        this.b = iArr;
        this.c = objArr;
        this.e = z10;
    }

    public static i1 b() {
        return new i1(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int y10;
        int A;
        int u10;
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
                    u10 = k.u(i14);
                } else if (i15 == 2) {
                    u10 = k.r(i14, (g) this.c[i12]);
                } else if (i15 == 3) {
                    y10 = k.y(i14) * 2;
                    A = ((i1) this.c[i12]).a();
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(b0.b());
                    }
                    ((Integer) this.c[i12]).getClass();
                    u10 = k.t(i14);
                }
                i11 = u10 + i11;
            } else {
                long longValue = ((Long) this.c[i12]).longValue();
                y10 = k.y(i14);
                A = k.A(longValue);
            }
            i11 = A + y10 + i11;
        }
        this.d = i11;
        return i11;
    }

    public final void c(int i10, Object obj) {
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

    public final void d(k0 k0Var) {
        if (this.a == 0) {
            return;
        }
        k0Var.getClass();
        k kVar = (k) k0Var.a;
        for (int i10 = 0; i10 < this.a; i10++) {
            int i11 = this.b[i10];
            Object obj = this.c[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 == 0) {
                kVar.U(i12, ((Long) obj).longValue());
            } else if (i13 == 1) {
                kVar.K(i12, ((Long) obj).longValue());
            } else if (i13 == 2) {
                k0Var.a(i12, (g) obj);
            } else if (i13 == 3) {
                kVar.R(i12, 3);
                ((i1) obj).d(k0Var);
                kVar.R(i12, 4);
            } else {
                if (i13 != 5) {
                    throw new RuntimeException(b0.b());
                }
                kVar.I(i12, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        int i10 = this.a;
        if (i10 == i1Var.a) {
            int[] iArr = this.b;
            int[] iArr2 = i1Var.b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = i1Var.c;
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
        int i11 = (527 + i10) * 31;
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
