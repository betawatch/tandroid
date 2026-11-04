package a0;

import x7.n;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class k {
    public int[] a;
    public int b;

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            int i3 = kVar.b;
            int i10 = this.b;
            if (i3 == i10) {
                int[] iArr = this.a;
                int[] iArr2 = kVar.a;
                rd.e a10 = n.a(0, i10);
                int i11 = a10.a;
                int i12 = a10.b;
                if (i11 > i12) {
                    return true;
                }
                while (iArr[i11] == iArr2[i11]) {
                    if (i11 == i12) {
                        return true;
                    }
                    i11++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.a;
        int i3 = this.b;
        int i10 = 0;
        for (int i11 = 0; i11 < i3; i11++) {
            i10 += iArr[i11] * 31;
        }
        return i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        int[] iArr = this.a;
        int i3 = this.b;
        int i10 = 0;
        while (true) {
            if (i10 >= i3) {
                sb2.append((CharSequence) "]");
                break;
            }
            int i11 = iArr[i10];
            if (i10 == -1) {
                sb2.append((CharSequence) "...");
                break;
            }
            if (i10 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append(i11);
            i10++;
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.j.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
