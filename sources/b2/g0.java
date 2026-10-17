package b2;

import android.net.Uri;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;
import v7.u6;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class g0 {
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
    public final e9.q0 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final e9.n0 g;
    public final byte[] h;

    static {
        String str = e2.m0.a;
        i = Integer.toString(0, 36);
        j = Integer.toString(1, 36);
        k = Integer.toString(2, 36);
        l = Integer.toString(3, 36);
        m = Integer.toString(4, 36);
        n = Integer.toString(5, 36);
        o = Integer.toString(6, 36);
        p = Integer.toString(7, 36);
    }

    public g0(f0 f0Var) {
        u6.p((f0Var.f && f0Var.b == null) ? false : true);
        UUID uuid = f0Var.a;
        uuid.getClass();
        this.a = uuid;
        this.b = f0Var.b;
        this.c = f0Var.c;
        this.d = f0Var.d;
        this.f = f0Var.f;
        this.e = f0Var.e;
        this.g = f0Var.g;
        byte[] bArr = f0Var.h;
        this.h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.a.equals(g0Var.a) && Objects.equals(this.b, g0Var.b) && Objects.equals(this.c, g0Var.c) && this.d == g0Var.d && this.f == g0Var.f && this.e == g0Var.e && this.g.equals(g0Var.g) && Arrays.equals(this.h, g0Var.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        return Arrays.hashCode(this.h) + ((this.g.hashCode() + ((((((((this.c.hashCode() + ((hashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31)) * 31);
    }
}
