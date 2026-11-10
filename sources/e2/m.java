package e2;

import java.util.Arrays;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class m {
    public static final m h = new m(1, 2, 3, null, -1, -1);
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
        String str = h2.m0.a;
        i = Integer.toString(0, 36);
        j = Integer.toString(1, 36);
        k = Integer.toString(2, 36);
        l = Integer.toString(3, 36);
        m = Integer.toString(4, 36);
        n = Integer.toString(5, 36);
    }

    public m(int i7, int i10, int i11, byte[] bArr, int i12, int i13) {
        this.a = i7;
        this.b = i10;
        this.c = i11;
        this.d = bArr;
        this.e = i12;
        this.f = i13;
    }

    public static String a(int i7) {
        return i7 != -1 ? i7 != 1 ? i7 != 2 ? jg.g.j(i7, "Undefined color range ") : "Limited range" : "Full range" : "Unset color range";
    }

    public static String b(int i7) {
        return i7 != -1 ? i7 != 6 ? i7 != 1 ? i7 != 2 ? jg.g.j(i7, "Undefined color space ") : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    public static String c(int i7) {
        return i7 != -1 ? i7 != 10 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 6 ? i7 != 7 ? jg.g.j(i7, "Undefined color transfer ") : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public static boolean e(m mVar) {
        if (mVar == null) {
            return true;
        }
        int i7 = mVar.a;
        if (i7 != -1 && i7 != 1 && i7 != 2) {
            return false;
        }
        int i10 = mVar.b;
        if (i10 != -1 && i10 != 2) {
            return false;
        }
        int i11 = mVar.c;
        if ((i11 != -1 && i11 != 3) || mVar.d != null) {
            return false;
        }
        int i12 = mVar.f;
        if (i12 != -1 && i12 != 8) {
            return false;
        }
        int i13 = mVar.e;
        return i13 == -1 || i13 == 8;
    }

    public static int f(int i7) {
        if (i7 == 1) {
            return 1;
        }
        if (i7 != 9) {
            return (i7 == 4 || i7 == 5 || i7 == 6 || i7 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int g(int i7) {
        if (i7 == 1) {
            return 3;
        }
        if (i7 == 4) {
            return 10;
        }
        if (i7 == 13) {
            return 2;
        }
        if (i7 == 16) {
            return 6;
        }
        if (i7 != 18) {
            return (i7 == 6 || i7 == 7) ? 3 : -1;
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
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (this.a == mVar.a && this.b == mVar.b && this.c == mVar.c && Arrays.equals(this.d, mVar.d) && this.e == mVar.e && this.f == mVar.f) {
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
        int i7 = this.e;
        sb2.append(i7 != -1 ? com.google.android.recaptcha.internal.a.i(i7, "bit Luma") : "NA");
        sb2.append(", ");
        int i10 = this.f;
        return a8.p0.s(sb2, i10 != -1 ? com.google.android.recaptcha.internal.a.i(i10, "bit Chroma") : "NA", ")");
    }
}
