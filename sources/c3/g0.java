package c3;

import java.util.Arrays;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
