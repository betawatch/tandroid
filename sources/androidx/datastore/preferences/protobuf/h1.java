package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class h1 {
    public static final h1 f = new h1(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public h1(int i3, int[] iArr, Object[] objArr, boolean z10) {
        this.a = i3;
        this.b = iArr;
        this.c = objArr;
        this.e = z10;
    }

    public final void a(int i3) {
        int[] iArr = this.b;
        if (i3 > iArr.length) {
            int i10 = this.a;
            int i11 = (i10 / 2) + i10;
            if (i11 >= i3) {
                i3 = i11;
            }
            if (i3 < 8) {
                i3 = 8;
            }
            this.b = Arrays.copyOf(iArr, i3);
            this.c = Arrays.copyOf(this.c, i3);
        }
    }

    public final int b() {
        int i3;
        int k10;
        int i10;
        int i11 = this.d;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.a; i13++) {
            int i14 = this.b[i13];
            int i15 = i14 >>> 3;
            int i16 = i14 & 7;
            if (i16 != 0) {
                if (i16 == 1) {
                    ((Long) this.c[i13]).getClass();
                    i10 = m.i(i15) + 8;
                } else if (i16 == 2) {
                    i10 = m.g(i15, (h) this.c[i13]);
                } else if (i16 == 3) {
                    i3 = m.i(i15) * 2;
                    k10 = ((h1) this.c[i13]).b();
                } else {
                    if (i16 != 5) {
                        throw new IllegalStateException(e0.b());
                    }
                    ((Integer) this.c[i13]).getClass();
                    i10 = m.i(i15) + 4;
                }
                i12 = i10 + i12;
            } else {
                long longValue = ((Long) this.c[i13]).longValue();
                i3 = m.i(i15);
                k10 = m.k(longValue);
            }
            i12 = k10 + i3 + i12;
        }
        this.d = i12;
        return i12;
    }

    public final void c(int i3, Object obj) {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
        a(this.a + 1);
        int[] iArr = this.b;
        int i10 = this.a;
        iArr[i10] = i3;
        this.c[i10] = obj;
        this.a = i10 + 1;
    }

    public final void d(l0 l0Var) {
        if (this.a == 0) {
            return;
        }
        l0Var.getClass();
        m mVar = (m) l0Var.a;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i10 = this.b[i3];
            Object obj = this.c[i3];
            int i11 = i10 >>> 3;
            int i12 = i10 & 7;
            if (i12 == 0) {
                mVar.E(i11, ((Long) obj).longValue());
            } else if (i12 == 1) {
                mVar.u(i11, ((Long) obj).longValue());
            } else if (i12 == 2) {
                mVar.q(i11, (h) obj);
            } else if (i12 == 3) {
                mVar.B(i11, 3);
                ((h1) obj).d(l0Var);
                mVar.B(i11, 4);
            } else {
                if (i12 != 5) {
                    throw new RuntimeException(e0.b());
                }
                mVar.s(i11, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        int i3 = this.a;
        if (i3 == h1Var.a) {
            int[] iArr = this.b;
            int[] iArr2 = h1Var.b;
            int i10 = 0;
            while (true) {
                if (i10 >= i3) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = h1Var.c;
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
        int i3 = this.a;
        int i10 = (527 + i3) * 31;
        int[] iArr = this.b;
        int i11 = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i3; i13++) {
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
