package b2;

import java.util.Arrays;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class c {
    public static final c c = new c(new a[0]);
    public static final a d;
    public static final String e;
    public final int a;
    public final a[] b;

    static {
        a aVar = new a(-1, -1, new int[0], new o0[0], new long[0], new String[0], new b[0]);
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
        o0[] o0VarArr = (o0[]) Arrays.copyOf(aVar.d, 0);
        String[] strArr = (String[]) Arrays.copyOf(aVar.g, 0);
        b[] bVarArr = aVar.h;
        d = new a(0, aVar.b, copyOf, o0VarArr, copyOf2, strArr, (b[]) Arrays.copyOf(bVarArr, Math.max(0, bVarArr.length)));
        String str = e2.m0.a;
        e = Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public c(a[] aVarArr) {
        this.a = aVarArr.length;
        this.b = aVarArr;
    }

    public final a a(int i10) {
        return i10 < 0 ? d : this.b[i10];
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
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.b;
            if (i10 >= aVarArr.length) {
                sb2.append("])");
                return sb2.toString();
            }
            sb2.append("adGroup(timeUs=0, ads=[");
            aVarArr[i10].getClass();
            for (int i11 = 0; i11 < aVarArr[i10].e.length; i11++) {
                sb2.append("ad(state=");
                int i12 = aVarArr[i10].e[i11];
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
                sb2.append(aVarArr[i10].f[i11]);
                sb2.append(')');
                if (i11 < aVarArr[i10].e.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i10 < aVarArr.length - 1) {
                sb2.append(", ");
            }
            i10++;
        }
    }
}
