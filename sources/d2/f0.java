package d2;

import android.net.Uri;
import b8.zb;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f0 {
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
    public final g9.l0 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final g9.i0 g;
    public final byte[] h;

    static {
        String str = g2.n0.a;
        i = Integer.toString(0, 36);
        j = Integer.toString(1, 36);
        k = Integer.toString(2, 36);
        l = Integer.toString(3, 36);
        m = Integer.toString(4, 36);
        n = Integer.toString(5, 36);
        o = Integer.toString(6, 36);
        p = Integer.toString(7, 36);
    }

    public f0(e0 e0Var) {
        zb.p((e0Var.f && e0Var.b == null) ? false : true);
        UUID uuid = e0Var.a;
        uuid.getClass();
        this.a = uuid;
        this.b = e0Var.b;
        this.c = e0Var.c;
        this.d = e0Var.d;
        this.f = e0Var.f;
        this.e = e0Var.e;
        this.g = e0Var.g;
        byte[] bArr = e0Var.h;
        this.h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.a.equals(f0Var.a) && Objects.equals(this.b, f0Var.b) && Objects.equals(this.c, f0Var.c) && this.d == f0Var.d && this.f == f0Var.f && this.e == f0Var.e && this.g.equals(f0Var.g) && Arrays.equals(this.h, f0Var.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        return Arrays.hashCode(this.h) + ((this.g.hashCode() + ((((((((this.c.hashCode() + ((hashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31)) * 31);
    }
}
