package c3;

import java.util.Arrays;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class i0 {
    public final int a;
    public final byte[] b;
    public final int c;
    public final int d;

    public i0(int i10, int i11, int i12, byte[] bArr) {
        this.a = i10;
        this.b = bArr;
        this.c = i11;
        this.d = i12;
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
