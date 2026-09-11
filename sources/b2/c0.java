package b2;

import android.net.Uri;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class c0 {
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
    public final e9.k0 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final e9.i0 g;
    public final byte[] h;

    static {
        String str = e2.d0.a;
        i = Integer.toString(0, 36);
        j = Integer.toString(1, 36);
        k = Integer.toString(2, 36);
        l = Integer.toString(3, 36);
        m = Integer.toString(4, 36);
        n = Integer.toString(5, 36);
        o = Integer.toString(6, 36);
        p = Integer.toString(7, 36);
    }

    public c0(b0 b0Var) {
        e2.d.g((b0Var.f && b0Var.b == null) ? false : true);
        UUID uuid = b0Var.a;
        uuid.getClass();
        this.a = uuid;
        this.b = b0Var.b;
        this.c = b0Var.c;
        this.d = b0Var.d;
        this.f = b0Var.f;
        this.e = b0Var.e;
        this.g = b0Var.g;
        byte[] bArr = b0Var.h;
        this.h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.a.equals(c0Var.a) && Objects.equals(this.b, c0Var.b) && Objects.equals(this.c, c0Var.c) && this.d == c0Var.d && this.f == c0Var.f && this.e == c0Var.e && this.g.equals(c0Var.g) && Arrays.equals(this.h, c0Var.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        return Arrays.hashCode(this.h) + ((this.g.hashCode() + ((((((((this.c.hashCode() + ((hashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31)) * 31);
    }
}
