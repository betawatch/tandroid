package b2;

import a8.yb;
import android.net.Uri;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class h0 {
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public final UUID a;
    public final Uri b;
    public final f9.l0 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final f9.i0 g;
    public final byte[] h;

    static {
        String str = e2.n0.a;
        i = Integer.toString(0, 36);
        j = Integer.toString(1, 36);
        k = Integer.toString(2, 36);
        l = Integer.toString(3, 36);
        m = Integer.toString(4, 36);
        n = Integer.toString(5, 36);
        o = Integer.toString(6, 36);
        p = Integer.toString(7, 36);
    }

    public h0(g0 g0Var) {
        yb.p((g0Var.f && g0Var.b == null) ? false : true);
        UUID uuid = g0Var.a;
        uuid.getClass();
        this.a = uuid;
        this.b = g0Var.b;
        this.c = g0Var.c;
        this.d = g0Var.d;
        this.f = g0Var.f;
        this.e = g0Var.e;
        this.g = g0Var.g;
        byte[] bArr = g0Var.h;
        this.h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.a.equals(h0Var.a) && Objects.equals(this.b, h0Var.b) && Objects.equals(this.c, h0Var.c) && this.d == h0Var.d && this.f == h0Var.f && this.e == h0Var.e && this.g.equals(h0Var.g) && Arrays.equals(this.h, h0Var.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        return Arrays.hashCode(this.h) + ((this.g.hashCode() + ((((((((this.c.hashCode() + ((hashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31)) * 31);
    }
}
