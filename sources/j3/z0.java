package j3;

import android.net.Uri;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class z0 implements g {
    public static final z0 c = new z0(new af.d(19, false));
    public static final String d;
    public static final String e;
    public static final String f;
    public static final q0 h;
    public final Uri a;
    public final String b;

    static {
        int i10 = h5.d0.a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f = Integer.toString(2, 36);
        h = new q0(6);
    }

    public z0(af.d dVar) {
        this.a = (Uri) dVar.b;
        this.b = (String) dVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return h5.d0.a(this.a, z0Var.a) && h5.d0.a(this.b, z0Var.b);
    }

    public final int hashCode() {
        Uri uri = this.a;
        int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
