package h3;

import android.net.Uri;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class d1 implements g {
    public static final d1 c = new d1(new a5.n(18, false));
    public static final String d;
    public static final String e;
    public static final String f;
    public static final f9.z h;
    public final Uri a;
    public final String b;

    static {
        int i10 = d5.g0.a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f = Integer.toString(2, 36);
        h = new f9.z(23);
    }

    public d1(a5.n nVar) {
        this.a = (Uri) nVar.b;
        this.b = (String) nVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return d5.g0.a(this.a, d1Var.a) && d5.g0.a(this.b, d1Var.b);
    }

    public final int hashCode() {
        Uri uri = this.a;
        int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
