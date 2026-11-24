// default package

import java.util.Arrays;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class iee {
    public static final iee f = new iee(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public iee(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static iee b() {
        return new iee(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int b;
        int c;
        int b2;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.c[i3]).getClass();
                    b2 = cwd.b(i5 << 3) + 8;
                } else if (i6 == 2) {
                    zud zudVar = (zud) this.c[i3];
                    int b3 = cwd.b(i5 << 3);
                    int j = zudVar.j();
                    i2 = yjb.h(j, j, b3, i2);
                } else if (i6 == 3) {
                    b = cwd.b(i5 << 3) << 1;
                    c = ((iee) this.c[i3]).a();
                } else {
                    if (i6 != 5) {
                        ho9.n(new n3e());
                        return 0;
                    }
                    ((Integer) this.c[i3]).getClass();
                    b2 = cwd.b(i5 << 3) + 4;
                }
                i2 = b2 + i2;
            } else {
                long longValue = ((Long) this.c[i3]).longValue();
                b = cwd.b(i5 << 3);
                c = cwd.c(longValue);
            }
            i2 = c + b + i2;
        }
        this.d = i2;
        return i2;
    }

    public final void c(int i, Object obj) {
        if (!this.e) {
            fvc.b();
            return;
        }
        e(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public final void d(xdd xddVar) {
        if (this.a != 0) {
            for (int i = 0; i < this.a; i++) {
                int i2 = this.b[i];
                Object obj = this.c[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    ((cwd) xddVar.a).p(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    ((cwd) xddVar.a).h(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    ((cwd) xddVar.a).e(i4, (zud) obj);
                } else if (i3 == 3) {
                    ((cwd) xddVar.a).m(i4, 3);
                    ((iee) obj).d(xddVar);
                    ((cwd) xddVar.a).m(i4, 4);
                } else {
                    if (i3 != 5) {
                        sdb.b(new n3e());
                        return;
                    }
                    ((cwd) xddVar.a).f(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final void e(int i) {
        int[] iArr = this.b;
        if (i > iArr.length) {
            int i2 = this.a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.b = Arrays.copyOf(iArr, i);
            this.c = Arrays.copyOf(this.c, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof iee)) {
            iee ieeVar = (iee) obj;
            int i = this.a;
            if (i == ieeVar.a) {
                int[] iArr = this.b;
                int[] iArr2 = ieeVar.b;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        Object[] objArr = this.c;
                        Object[] objArr2 = ieeVar.c;
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
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = i + 527;
        int[] iArr = this.b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = ((i2 * 31) + i4) * 31;
        Object[] objArr = this.c;
        int i7 = this.a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }
}
