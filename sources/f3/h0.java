package f3;

import java.util.Arrays;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class h0 {
    public final int a;
    public final byte[] b;
    public final int c;
    public final int d;

    public h0(int i7, int i10, int i11, byte[] bArr) {
        this.a = i7;
        this.b = bArr;
        this.c = i10;
        this.d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h0.class == obj.getClass()) {
            h0 h0Var = (h0) obj;
            if (this.a == h0Var.a && this.c == h0Var.c && this.d == h0Var.d && Arrays.equals(this.b, h0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + (this.a * 31)) * 31) + this.c) * 31) + this.d;
    }
}
