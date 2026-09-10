package c3;

import java.util.Arrays;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class g0 {
    public final int a;
    public final byte[] b;
    public final int c;
    public final int d;

    public g0(int i10, int i11, int i12, byte[] bArr) {
        this.a = i10;
        this.b = bArr;
        this.c = i11;
        this.d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g0.class == obj.getClass()) {
            g0 g0Var = (g0) obj;
            if (this.a == g0Var.a && this.c == g0Var.c && this.d == g0Var.d && Arrays.equals(this.b, g0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + (this.a * 31)) * 31) + this.c) * 31) + this.d;
    }
}
