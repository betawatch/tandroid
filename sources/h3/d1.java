package h3;

import android.net.Uri;
import fh.y5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d1 implements g {
    public static final d1 c = new d1(new a5.m(20, false));
    public static final String d;
    public static final String e;
    public static final String f;
    public static final y5 h;
    public final Uri a;
    public final String b;

    static {
        int i9 = d5.f0.a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f = Integer.toString(2, 36);
        h = new y5(19);
    }

    public d1(a5.m mVar) {
        this.a = (Uri) mVar.b;
        this.b = (String) mVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return d5.f0.a(this.a, d1Var.a) && d5.f0.a(this.b, d1Var.b);
    }

    public final int hashCode() {
        Uri uri = this.a;
        int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
