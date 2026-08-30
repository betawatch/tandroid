package j3;

import android.net.Uri;
import java.util.Arrays;
import java.util.UUID;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class w0 implements g {
    public static final String B;
    public static final String C;
    public static final q0 D;
    public static final String r;
    public static final String s;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public final UUID a;
    public final Uri b;
    public final s8.x c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final s8.v h;
    public final byte[] n;

    static {
        int i10 = h5.d0.a;
        r = Integer.toString(0, 36);
        s = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        w = Integer.toString(3, 36);
        x = Integer.toString(4, 36);
        y = Integer.toString(5, 36);
        B = Integer.toString(6, 36);
        C = Integer.toString(7, 36);
        D = new q0(2);
    }

    public w0(v0 v0Var) {
        h5.a.i((v0Var.f && v0Var.b == null) ? false : true);
        UUID uuid = v0Var.a;
        uuid.getClass();
        this.a = uuid;
        this.b = v0Var.b;
        this.c = v0Var.c;
        this.d = v0Var.d;
        this.f = v0Var.f;
        this.e = v0Var.e;
        this.h = v0Var.g;
        byte[] bArr = v0Var.h;
        this.n = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return this.a.equals(w0Var.a) && h5.d0.a(this.b, w0Var.b) && h5.d0.a(this.c, w0Var.c) && this.d == w0Var.d && this.f == w0Var.f && this.e == w0Var.e && this.h.equals(w0Var.h) && Arrays.equals(this.n, w0Var.n);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        return Arrays.hashCode(this.n) + ((this.h.hashCode() + ((((((((this.c.hashCode() + ((hashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31)) * 31);
    }
}
