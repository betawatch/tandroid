package m4;

import android.net.Uri;
import f5.d0;
import j3.g;
import java.util.Arrays;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class b implements g {
    public static final String A;
    public static final String B;
    public static final a C;
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
        int i10 = d0.a;
        r = Integer.toString(0, 36);
        s = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        w = Integer.toString(3, 36);
        x = Integer.toString(4, 36);
        y = Integer.toString(5, 36);
        A = Integer.toString(6, 36);
        B = Integer.toString(7, 36);
        C = new a(0);
    }

    public b(long j10, int i10, int i11, int[] iArr, Uri[] uriArr, long[] jArr, long j11, boolean z10) {
        f5.a.f(iArr.length == uriArr.length);
        this.a = j10;
        this.b = i10;
        this.c = i11;
        this.e = iArr;
        this.d = uriArr;
        this.f = jArr;
        this.h = j11;
        this.n = z10;
    }

    public final int a(int i10) {
        int i11;
        int i12 = i10 + 1;
        while (true) {
            int[] iArr = this.e;
            if (i12 >= iArr.length || this.n || (i11 = iArr[i12]) == 0 || i11 == 1) {
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
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && Arrays.equals(this.d, bVar.d) && Arrays.equals(this.e, bVar.e) && Arrays.equals(this.f, bVar.f) && this.h == bVar.h && this.n == bVar.n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = ((this.b * 31) + this.c) * 31;
        long j10 = this.a;
        int hashCode = (Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + ((((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.d)) * 31)) * 31)) * 31;
        long j11 = this.h;
        return ((hashCode + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.n ? 1 : 0);
    }
}
