package b2;

import java.util.Arrays;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class j {
    public static final j h = new j(1, 2, 3, null, -1, -1);
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public final int a;
    public final int b;
    public final int c;
    public final byte[] d;
    public final int e;
    public final int f;
    public int g;

    static {
        String str = e2.d0.a;
        i = Integer.toString(0, 36);
        j = Integer.toString(1, 36);
        k = Integer.toString(2, 36);
        l = Integer.toString(3, 36);
        m = Integer.toString(4, 36);
        n = Integer.toString(5, 36);
    }

    public j(int i10, int i11, int i12, byte[] bArr, int i13, int i14) {
        this.a = i10;
        this.b = i11;
        this.c = i12;
        this.d = bArr;
        this.e = i13;
        this.f = i14;
    }

    public static String a(int i10) {
        return i10 != -1 ? i10 != 1 ? i10 != 2 ? i2.g.i(i10, "Undefined color range ") : "Limited range" : "Full range" : "Unset color range";
    }

    public static String b(int i10) {
        return i10 != -1 ? i10 != 6 ? i10 != 1 ? i10 != 2 ? i2.g.i(i10, "Undefined color space ") : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    public static String c(int i10) {
        return i10 != -1 ? i10 != 10 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 6 ? i10 != 7 ? i2.g.i(i10, "Undefined color transfer ") : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public static boolean e(j jVar) {
        if (jVar == null) {
            return true;
        }
        int i10 = jVar.a;
        if (i10 != -1 && i10 != 1 && i10 != 2) {
            return false;
        }
        int i11 = jVar.b;
        if (i11 != -1 && i11 != 2) {
            return false;
        }
        int i12 = jVar.c;
        if ((i12 != -1 && i12 != 3) || jVar.d != null) {
            return false;
        }
        int i13 = jVar.f;
        if (i13 != -1 && i13 != 8) {
            return false;
        }
        int i14 = jVar.e;
        return i14 == -1 || i14 == 8;
    }

    public static int f(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int g(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 4) {
            return 10;
        }
        if (i10 == 13) {
            return 2;
        }
        if (i10 == 16) {
            return 6;
        }
        if (i10 != 18) {
            return (i10 == 6 || i10 == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean d() {
        return (this.a == -1 || this.b == -1 || this.c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.a == jVar.a && this.b == jVar.b && this.c == jVar.c && Arrays.equals(this.d, jVar.d) && this.e == jVar.e && this.f == jVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.g == 0) {
            this.g = ((((Arrays.hashCode(this.d) + ((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31)) * 31) + this.e) * 31) + this.f;
        }
        return this.g;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        sb2.append(b(this.a));
        sb2.append(", ");
        sb2.append(a(this.b));
        sb2.append(", ");
        sb2.append(c(this.c));
        sb2.append(", ");
        sb2.append(this.d != null);
        sb2.append(", ");
        int i10 = this.e;
        sb2.append(i10 != -1 ? a4.a.m(i10, "bit Luma") : "NA");
        sb2.append(", ");
        int i11 = this.f;
        return a4.a.s(sb2, i11 != -1 ? a4.a.m(i11, "bit Chroma") : "NA", ")");
    }
}
