package d2;

import java.util.Arrays;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class n {
    public static final n h = new n(1, 2, 3, null, -1, -1);
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
        String str = g2.n0.a;
        i = Integer.toString(0, 36);
        j = Integer.toString(1, 36);
        k = Integer.toString(2, 36);
        l = Integer.toString(3, 36);
        m = Integer.toString(4, 36);
        n = Integer.toString(5, 36);
    }

    public n(int i3, int i10, int i11, byte[] bArr, int i12, int i13) {
        this.a = i3;
        this.b = i10;
        this.c = i11;
        this.d = bArr;
        this.e = i12;
        this.f = i13;
    }

    public static String a(int i3) {
        return i3 != -1 ? i3 != 1 ? i3 != 2 ? k2.p1.i(i3, "Undefined color range ") : "Limited range" : "Full range" : "Unset color range";
    }

    public static String b(int i3) {
        return i3 != -1 ? i3 != 6 ? i3 != 1 ? i3 != 2 ? k2.p1.i(i3, "Undefined color space ") : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    public static String c(int i3) {
        return i3 != -1 ? i3 != 10 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 6 ? i3 != 7 ? k2.p1.i(i3, "Undefined color transfer ") : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public static boolean e(n nVar) {
        if (nVar == null) {
            return true;
        }
        int i3 = nVar.a;
        if (i3 != -1 && i3 != 1 && i3 != 2) {
            return false;
        }
        int i10 = nVar.b;
        if (i10 != -1 && i10 != 2) {
            return false;
        }
        int i11 = nVar.c;
        if ((i11 != -1 && i11 != 3) || nVar.d != null) {
            return false;
        }
        int i12 = nVar.f;
        if (i12 != -1 && i12 != 8) {
            return false;
        }
        int i13 = nVar.e;
        return i13 == -1 || i13 == 8;
    }

    public static int f(int i3) {
        if (i3 == 1) {
            return 1;
        }
        if (i3 != 9) {
            return (i3 == 4 || i3 == 5 || i3 == 6 || i3 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int g(int i3) {
        if (i3 == 1) {
            return 3;
        }
        if (i3 == 4) {
            return 10;
        }
        if (i3 == 13) {
            return 2;
        }
        if (i3 == 16) {
            return 6;
        }
        if (i3 != 18) {
            return (i3 == 6 || i3 == 7) ? 3 : -1;
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
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (this.a == nVar.a && this.b == nVar.b && this.c == nVar.c && Arrays.equals(this.d, nVar.d) && this.e == nVar.e && this.f == nVar.f) {
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
        int i3 = this.e;
        sb2.append(i3 != -1 ? com.google.android.recaptcha.internal.a.h(i3, "bit Luma") : "NA");
        sb2.append(", ");
        int i10 = this.f;
        return a1.g.s(sb2, i10 != -1 ? com.google.android.recaptcha.internal.a.h(i10, "bit Chroma") : "NA", ")");
    }
}
