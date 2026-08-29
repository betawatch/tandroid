package j3;

import android.net.Uri;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class d1 implements g {
    public static final d1 c = new d1(new androidx.biometric.e(20, false));
    public static final String d;
    public static final String e;
    public static final String f;
    public static final d0 h;
    public final Uri a;
    public final String b;

    static {
        int i10 = f5.d0.a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f = Integer.toString(2, 36);
        h = new d0(6);
    }

    public d1(androidx.biometric.e eVar) {
        this.a = (Uri) eVar.b;
        this.b = (String) eVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return f5.d0.a(this.a, d1Var.a) && f5.d0.a(this.b, d1Var.b);
    }

    public final int hashCode() {
        Uri uri = this.a;
        int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
