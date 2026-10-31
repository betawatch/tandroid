package a0;

import w7.w5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class k {
    public int[] a;
    public int b;

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            int i10 = kVar.b;
            int i11 = this.b;
            if (i10 == i11) {
                int[] iArr = this.a;
                int[] iArr2 = kVar.a;
                od.e a2 = w5.a(0, i11);
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
