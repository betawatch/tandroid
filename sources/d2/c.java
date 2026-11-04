package d2;

import java.util.Arrays;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c {
    public static final c c = new c(new a[0]);
    public static final a d;
    public static final String e;
    public final int a;
    public final a[] b;

    static {
        a aVar = new a(-1, -1, new int[0], new n0[0], new long[0], new String[0], new b[0]);
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
        n0[] n0VarArr = (n0[]) Arrays.copyOf(aVar.d, 0);
        String[] strArr = (String[]) Arrays.copyOf(aVar.g, 0);
        b[] bVarArr = aVar.h;
        d = new a(0, aVar.b, copyOf, n0VarArr, copyOf2, strArr, (b[]) Arrays.copyOf(bVarArr, Math.max(0, bVarArr.length)));
        String str = g2.n0.a;
        e = Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public c(a[] aVarArr) {
        this.a = aVarArr.length;
        this.b = aVarArr;
    }

    public final a a(int i3) {
        return i3 < 0 ? d : this.b[i3];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && Arrays.equals(this.b, cVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (((((this.a * 961) + ((int) 0)) * 31) + ((int) (-9223372036854775807L))) * 961);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[");
        int i3 = 0;
        while (true) {
            a[] aVarArr = this.b;
            if (i3 >= aVarArr.length) {
                sb2.append("])");
                return sb2.toString();
            }
            sb2.append("adGroup(timeUs=0, ads=[");
            aVarArr[i3].getClass();
            for (int i10 = 0; i10 < aVarArr[i3].e.length; i10++) {
                sb2.append("ad(state=");
                int i11 = aVarArr[i3].e[i10];
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
                sb2.append(aVarArr[i3].f[i10]);
                sb2.append(')');
                if (i10 < aVarArr[i3].e.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i3 < aVarArr.length - 1) {
                sb2.append(", ");
            }
            i3++;
        }
    }
}
