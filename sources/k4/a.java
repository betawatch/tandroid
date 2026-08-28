package k4;

import android.net.Uri;
import d5.f0;
import h3.g;
import i3.i;
import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a implements g {
    public static final String A;
    public static final String B;
    public static final i C;
    public static final String r;
    public static final String s;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public final long a;
    public final int b;
    public final int c;
    public final Uri[] d;
    public final int[] e;
    public final long[] f;
    public final long h;
    public final boolean n;

    static {
        int i9 = f0.a;
        r = Integer.toString(0, 36);
        s = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        w = Integer.toString(3, 36);
        x = Integer.toString(4, 36);
        y = Integer.toString(5, 36);
        A = Integer.toString(6, 36);
        B = Integer.toString(7, 36);
        C = new i(12);
    }

    public a(long j10, int i9, int i10, int[] iArr, Uri[] uriArr, long[] jArr, long j11, boolean z10) {
        d5.a.f(iArr.length == uriArr.length);
        this.a = j10;
        this.b = i9;
        this.c = i10;
        this.e = iArr;
        this.d = uriArr;
        this.f = jArr;
        this.h = j11;
        this.n = z10;
    }

    public final int a(int i9) {
        int i10;
        int i11 = i9 + 1;
        while (true) {
            int[] iArr = this.e;
            if (i11 >= iArr.length || this.n || (i10 = iArr[i11]) == 0 || i10 == 1) {
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
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.e, aVar.e) && Arrays.equals(this.f, aVar.f) && this.h == aVar.h && this.n == aVar.n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9 = ((this.b * 31) + this.c) * 31;
        long j10 = this.a;
        int hashCode = (Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + ((((i9 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.d)) * 31)) * 31)) * 31;
        long j11 = this.h;
        return ((hashCode + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.n ? 1 : 0);
    }
}
