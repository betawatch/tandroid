package k4;

import android.net.Uri;
import d5.f0;
import h3.g;
import i3.i;
import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b implements g {
    public static final b f = new b(new a[0], 0, -9223372036854775807L, 0);
    public static final a h;
    public static final String n;
    public static final String r;
    public static final String s;
    public static final String v;
    public static final i w;
    public final int a;
    public final long b;
    public final long c;
    public final int d;
    public final a[] e;

    static {
        a aVar = new a(0L, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
        int[] iArr = aVar.e;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = aVar.f;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        h = new a(aVar.a, 0, aVar.c, copyOf, (Uri[]) Arrays.copyOf(aVar.d, 0), copyOf2, aVar.h, aVar.n);
        int i9 = f0.a;
        n = Integer.toString(1, 36);
        r = Integer.toString(2, 36);
        s = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        w = new i(11);
    }

    public b(a[] aVarArr, long j10, long j11, int i9) {
        this.b = j10;
        this.c = j11;
        this.a = aVarArr.length + i9;
        this.e = aVarArr;
        this.d = i9;
    }

    public final a a(int i9) {
        int i10 = this.d;
        return i9 < i10 ? h : this.e[i9 - i10];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        int i9 = f0.a;
        return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d && Arrays.equals(this.e, bVar.e);
    }

    public final int hashCode() {
        return (((((((this.a * 961) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + this.d) * 31) + Arrays.hashCode(this.e);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=");
        sb2.append(this.b);
        sb2.append(", adGroups=[");
        int i9 = 0;
        while (true) {
            a[] aVarArr = this.e;
            if (i9 >= aVarArr.length) {
                sb2.append("])");
                return sb2.toString();
            }
            sb2.append("adGroup(timeUs=");
            sb2.append(aVarArr[i9].a);
            sb2.append(", ads=[");
            for (int i10 = 0; i10 < aVarArr[i9].e.length; i10++) {
                sb2.append("ad(state=");
                int i11 = aVarArr[i9].e[i10];
                if (i11 == 0) {
                    sb2.append('_');
                } else if (i11 == 1) {
                    sb2.append('R');
                } else if (i11 == 2) {
                    sb2.append('S');
                } else if (i11 == 3) {
                    sb2.append('P');
                } else if (i11 != 4) {
                    sb2.append('?');
                } else {
                    sb2.append('!');
                }
                sb2.append(", durationUs=");
                sb2.append(aVarArr[i9].f[i10]);
                sb2.append(')');
                if (i10 < aVarArr[i9].e.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i9 < aVarArr.length - 1) {
                sb2.append(", ");
            }
            i9++;
        }
    }
}
