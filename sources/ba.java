// default package

import android.net.Uri;
import java.util.Arrays;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ba {
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public static final String s;
    public final int a;
    public final Uri[] b;
    public final br6[] c;
    public final int[] d;
    public final long[] e;
    public final String[] f;
    public final ca[] g;

    static {
        String str = g8c.a;
        h = "0";
        i = "1";
        j = "2";
        k = "3";
        l = "4";
        m = "5";
        n = "6";
        o = "7";
        p = "8";
        q = "9";
        r = "a";
        s = "b";
    }

    public ba(int i2, int[] iArr, br6[] br6VarArr, long[] jArr, String[] strArr, ca[] caVarArr) {
        Uri uri;
        int i3 = 0;
        gre.f(iArr.length == br6VarArr.length);
        gre.f(iArr.length == caVarArr.length);
        this.a = i2;
        this.d = iArr;
        this.c = br6VarArr;
        this.e = jArr;
        this.b = new Uri[br6VarArr.length];
        while (true) {
            Uri[] uriArr = this.b;
            if (i3 >= uriArr.length) {
                this.f = strArr;
                this.g = caVarArr;
                return;
            }
            br6 br6Var = br6VarArr[i3];
            if (br6Var == null) {
                uri = null;
            } else {
                xq6 xq6Var = br6Var.b;
                xq6Var.getClass();
                uri = xq6Var.a;
            }
            uriArr[i3] = uri;
            i3++;
        }
    }

    public final int a(int i2) {
        int i3;
        int i4 = i2 + 1;
        while (true) {
            int[] iArr = this.d;
            if (i4 >= iArr.length || (i3 = iArr[i4]) == 0 || i3 == 1) {
                break;
            }
            i4++;
        }
        return i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ba.class != obj.getClass()) {
            return false;
        }
        ba baVar = (ba) obj;
        return this.a == baVar.a && Arrays.equals(this.c, baVar.c) && Arrays.equals(this.d, baVar.d) && Arrays.equals(this.e, baVar.e) && Arrays.equals(this.f, baVar.f) && Arrays.equals(this.g, baVar.g);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.g) + ((((Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + ((Arrays.hashCode(this.c) + (((this.a * 31) - 1) * 961)) * 31)) * 31)) * 29791) + Arrays.hashCode(this.f)) * 31)) * 31;
    }
}
