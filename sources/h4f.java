// default package

import java.util.Arrays;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class h4f {
    public static final h4f f = new h4f(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public h4f(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static h4f b() {
        return new h4f(0, new int[8], new Object[8], true);
    }

    public final void a(int i, Object obj) {
        if (!this.e) {
            p3d.a();
            return;
        }
        int i2 = this.a;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
            this.b = Arrays.copyOf(iArr, i3);
            this.c = Arrays.copyOf(this.c, i3);
        }
        int[] iArr2 = this.b;
        int i4 = this.a;
        iArr2[i4] = i;
        this.c[i4] = obj;
        this.a = i4 + 1;
    }

    public final void c(g9d g9dVar) {
        if (this.a != 0) {
            g9dVar.getClass();
            coe coeVar = (coe) g9dVar.b;
            for (int i = 0; i < this.a; i++) {
                int i2 = this.b[i];
                Object obj = this.c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    long longValue = ((Long) obj).longValue();
                    coeVar.c(i3, 0);
                    coeVar.d(longValue);
                } else if (i4 == 1) {
                    long longValue2 = ((Long) obj).longValue();
                    coeVar.c(i3, 1);
                    coeVar.j(longValue2);
                } else if (i4 == 2) {
                    g9dVar.b(i3, (jne) obj);
                } else if (i4 == 3) {
                    coeVar.c(i3, 3);
                    ((h4f) obj).c(g9dVar);
                    coeVar.c(i3, 4);
                } else if (i4 != 5) {
                    grb.m(new mue("Protocol message tag had invalid wire type."));
                    return;
                } else {
                    int intValue = ((Integer) obj).intValue();
                    coeVar.c(i3, 5);
                    coeVar.l(intValue);
                }
            }
        }
    }

    public final int d() {
        int n;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 == 0) {
                n = coe.n(i5, ((Long) this.c[i3]).longValue());
            } else if (i6 == 1) {
                ((Long) this.c[i3]).getClass();
                n = coe.r(i5);
            } else if (i6 == 2) {
                n = coe.i(i5, (jne) this.c[i3]);
            } else if (i6 == 3) {
                i2 = ((h4f) this.c[i3]).d() + (coe.m(i5) << 1) + i2;
            } else {
                if (i6 != 5) {
                    vr9.l(new mue("Protocol message tag had invalid wire type."));
                    return 0;
                }
                ((Integer) this.c[i3]).getClass();
                n = coe.v(i5);
            }
            i2 = n + i2;
        }
        this.d = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof h4f)) {
            return false;
        }
        h4f h4fVar = (h4f) obj;
        int i = this.a;
        if (i == h4fVar.a) {
            int[] iArr = this.b;
            int[] iArr2 = h4fVar.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = h4fVar.c;
                    int i3 = this.a;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.c;
        int i7 = this.a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }
}
