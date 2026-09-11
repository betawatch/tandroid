package b2;

import android.net.Uri;
import java.util.Arrays;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class a {
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
    public final int a;
    public final int b;
    public final Uri[] c;
    public final k0[] d;
    public final int[] e;
    public final long[] f;
    public final String[] g;

    static {
        String str = e2.d0.a;
        h = Integer.toString(0, 36);
        i = Integer.toString(1, 36);
        j = Integer.toString(2, 36);
        k = Integer.toString(3, 36);
        l = Integer.toString(4, 36);
        m = Integer.toString(5, 36);
        n = Integer.toString(6, 36);
        o = Integer.toString(7, 36);
        p = Integer.toString(8, 36);
        q = Integer.toString(9, 36);
        r = Integer.toString(10, 36);
    }

    public a(int i10, int i11, int[] iArr, k0[] k0VarArr, long[] jArr, String[] strArr) {
        Uri uri;
        int i12 = 0;
        e2.d.b(iArr.length == k0VarArr.length);
        this.a = i10;
        this.b = i11;
        this.e = iArr;
        this.d = k0VarArr;
        this.f = jArr;
        this.c = new Uri[k0VarArr.length];
        while (true) {
            Uri[] uriArr = this.c;
            if (i12 >= uriArr.length) {
                this.g = strArr;
                return;
            }
            k0 k0Var = k0VarArr[i12];
            if (k0Var == null) {
                uri = null;
            } else {
                f0 f0Var = k0Var.b;
                f0Var.getClass();
                uri = f0Var.a;
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
        return this.a == aVar.a && this.b == aVar.b && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.e, aVar.e) && Arrays.equals(this.f, aVar.f) && Arrays.equals(this.g, aVar.g);
    }

    public final int hashCode() {
        int i10 = (int) 0;
        return (((((Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + (((((this.a * 31) + this.b) * 31) + i10) * 31)) * 31)) * 31)) * 31) + i10) * 961) + Arrays.hashCode(this.g)) * 31;
    }
}
