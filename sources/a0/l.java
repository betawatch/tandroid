package a0;

import w7.u7;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final class l {
    public int[] a;
    public int b;

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            l lVar = (l) obj;
            int i10 = lVar.b;
            int i11 = this.b;
            if (i10 == i11) {
                int[] iArr = this.a;
                int[] iArr2 = lVar.a;
                ud.e a2 = u7.a(0, i11);
                int i12 = a2.a;
                int i13 = a2.b;
                if (i12 > i13) {
                    return true;
                }
                while (iArr[i12] == iArr2[i12]) {
                    if (i12 == i13) {
                        return true;
                    }
                    i12++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.a;
        int i10 = this.b;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12] * 31;
        }
        return i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        int[] iArr = this.a;
        int i10 = this.b;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                sb2.append((CharSequence) "]");
                break;
            }
            int i12 = iArr[i11];
            if (i11 == -1) {
                sb2.append((CharSequence) "...");
                break;
            }
            if (i11 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append(i12);
            i11++;
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.i.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
