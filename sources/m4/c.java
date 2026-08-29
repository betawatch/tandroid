package m4;

import android.net.Uri;
import f5.d0;
import j3.g;
import java.util.Arrays;
import k3.d;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c implements g {
    public static final c f = new c(new b[0], 0, -9223372036854775807L, 0);
    public static final b h;
    public static final String n;
    public static final String r;
    public static final String s;
    public static final String v;
    public static final d w;
    public final int a;
    public final long b;
    public final long c;
    public final int d;
    public final b[] e;

    static {
        b bVar = new b(0L, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
        int[] iArr = bVar.e;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = bVar.f;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        h = new b(bVar.a, 0, bVar.c, copyOf, (Uri[]) Arrays.copyOf(bVar.d, 0), copyOf2, bVar.h, bVar.n);
        int i10 = d0.a;
        n = Integer.toString(1, 36);
        r = Integer.toString(2, 36);
        s = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        w = new d(29);
    }

    public c(b[] bVarArr, long j10, long j11, int i10) {
        this.b = j10;
        this.c = j11;
        this.a = bVarArr.length + i10;
        this.e = bVarArr;
        this.d = i10;
    }

    public final b a(int i10) {
        int i11 = this.d;
        return i10 < i11 ? h : this.e[i10 - i11];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        int i10 = d0.a;
        return this.a == cVar.a && this.b == cVar.b && this.c == cVar.c && this.d == cVar.d && Arrays.equals(this.e, cVar.e);
    }

    public final int hashCode() {
        return (((((((this.a * 961) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + this.d) * 31) + Arrays.hashCode(this.e);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=");
        sb2.append(this.b);
        sb2.append(", adGroups=[");
        int i10 = 0;
        while (true) {
            b[] bVarArr = this.e;
            if (i10 >= bVarArr.length) {
                sb2.append("])");
                return sb2.toString();
            }
            sb2.append("adGroup(timeUs=");
            sb2.append(bVarArr[i10].a);
            sb2.append(", ads=[");
            for (int i11 = 0; i11 < bVarArr[i10].e.length; i11++) {
                sb2.append("ad(state=");
                int i12 = bVarArr[i10].e[i11];
                if (i12 == 0) {
                    sb2.append('_');
                } else if (i12 == 1) {
                    sb2.append('R');
                } else if (i12 == 2) {
                    sb2.append('S');
                } else if (i12 == 3) {
                    sb2.append('P');
                } else if (i12 != 4) {
                    sb2.append('?');
                } else {
                    sb2.append('!');
                }
                sb2.append(", durationUs=");
                sb2.append(bVarArr[i10].f[i11]);
                sb2.append(')');
                if (i11 < bVarArr[i10].e.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i10 < bVarArr.length - 1) {
                sb2.append(", ");
            }
            i10++;
        }
    }
}
