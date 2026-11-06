package e2;

import a8.ia;
import android.net.Uri;
import java.util.Arrays;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
    public final l0[] d;
    public final int[] e;
    public final long[] f;
    public final String[] g;
    public final b[] h;

    static {
        String str = h2.m0.a;
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

    public a(int i7, int i10, int[] iArr, l0[] l0VarArr, long[] jArr, String[] strArr, b[] bVarArr) {
        Uri uri;
        int i11 = 0;
        ia.f(iArr.length == l0VarArr.length);
        ia.f(iArr.length == bVarArr.length);
        this.a = i7;
        this.b = i10;
        this.e = iArr;
        this.d = l0VarArr;
        this.f = jArr;
        this.c = new Uri[l0VarArr.length];
        while (true) {
            Uri[] uriArr = this.c;
            if (i11 >= uriArr.length) {
                this.g = strArr;
                this.h = bVarArr;
                return;
            }
            l0 l0Var = l0VarArr[i11];
            if (l0Var == null) {
                uri = null;
            } else {
                g0 g0Var = l0Var.b;
                g0Var.getClass();
                uri = g0Var.a;
            }
            uriArr[i11] = uri;
            i11++;
        }
    }

    public final int a(int i7) {
        int i10;
        int i11 = i7 + 1;
        while (true) {
            int[] iArr = this.e;
            if (i11 >= iArr.length || (i10 = iArr[i11]) == 0 || i10 == 1) {
                break;
            }
            i11++;
        }
        return i11;
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
        int i7 = ((this.a * 31) + this.b) * 31;
        int i10 = (int) 0;
        return (Arrays.hashCode(this.h) + ((((((Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + ((i7 + i10) * 31)) * 31)) * 31)) * 31) + i10) * 961) + Arrays.hashCode(this.g)) * 31)) * 31;
    }
}
