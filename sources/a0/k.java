package a0;

import c8.uc;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class k {
    public int[] a;
    public int b;

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            int i7 = kVar.b;
            int i10 = this.b;
            if (i7 == i10) {
                int[] iArr = this.a;
                int[] iArr2 = kVar.a;
                ud.e a10 = uc.a(0, i10);
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
        int i7 = this.b;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            i10 += iArr[i11] * 31;
        }
        return i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        int[] iArr = this.a;
        int i7 = this.b;
        int i10 = 0;
        while (true) {
            if (i10 >= i7) {
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
