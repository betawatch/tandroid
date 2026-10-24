package b2;

import android.net.Uri;
import java.util.Arrays;
import v7.u6;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class a {
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
    public static final String t;
    public final int a;
    public final int b;
    public final Uri[] c;
    public final o0[] d;
    public final int[] e;
    public final long[] f;
    public final String[] g;
    public final b[] h;

    static {
        String str = e2.m0.a;
        i = Integer.toString(0, 36);
        j = Integer.toString(1, 36);
        k = Integer.toString(2, 36);
        l = Integer.toString(3, 36);
        m = Integer.toString(4, 36);
        n = Integer.toString(5, 36);
        o = Integer.toString(6, 36);
        p = Integer.toString(7, 36);
        q = Integer.toString(8, 36);
        r = Integer.toString(9, 36);
        s = Integer.toString(10, 36);
        t = Integer.toString(11, 36);
    }

    public a(int i10, int i11, int[] iArr, o0[] o0VarArr, long[] jArr, String[] strArr, b[] bVarArr) {
        Uri uri;
        int i12 = 0;
        u6.g(iArr.length == o0VarArr.length);
        u6.g(iArr.length == bVarArr.length);
        this.a = i10;
        this.b = i11;
        this.e = iArr;
        this.d = o0VarArr;
        this.f = jArr;
        this.c = new Uri[o0VarArr.length];
        while (true) {
            Uri[] uriArr = this.c;
            if (i12 >= uriArr.length) {
                this.g = strArr;
                this.h = bVarArr;
                return;
            }
            o0 o0Var = o0VarArr[i12];
            if (o0Var == null) {
                uri = null;
            } else {
                j0 j0Var = o0Var.b;
                j0Var.getClass();
                uri = j0Var.a;
            }
            uriArr[i12] = uri;
            i12++;
        }
    }

    public final int a(int i10) {
        int i11;
        int i12 = i10 + 1;
        while (true) {
            int[] iArr = this.e;
            if (i12 >= iArr.length || (i11 = iArr[i12]) == 0 || i11 == 1) {
                break;
            }
            i12++;
        }
        return i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.e, aVar.e) && Arrays.equals(this.f, aVar.f) && Arrays.equals(this.g, aVar.g) && Arrays.equals(this.h, aVar.h);
    }

    public final int hashCode() {
        int i10 = ((this.a * 31) + this.b) * 31;
        int i11 = (int) 0;
        return (Arrays.hashCode(this.h) + ((((((Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + ((i10 + i11) * 31)) * 31)) * 31)) * 31) + i11) * 961) + Arrays.hashCode(this.g)) * 31)) * 31;
    }
}
