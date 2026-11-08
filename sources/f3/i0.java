package f3;

import java.util.Arrays;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class i0 {
    public final int a;
    public final byte[] b;
    public final int c;
    public final int d;

    public i0(int i7, int i10, int i11, byte[] bArr) {
        this.a = i7;
        this.b = bArr;
        this.c = i10;
        this.d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i0.class == obj.getClass()) {
            i0 i0Var = (i0) obj;
            if (this.a == i0Var.a && this.c == i0Var.c && this.d == i0Var.d && Arrays.equals(this.b, i0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + (this.a * 31)) * 31) + this.c) * 31) + this.d;
    }
}
