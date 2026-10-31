package b2;

import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class l0 {
    public static final l0 d = new l0(new android.support.v4.media.session.a0(4));
    public static final String e;
    public static final String f;
    public static final String g;
    public final Uri a;
    public final String b;
    public final Bundle c;

    static {
        String str = e2.l0.a;
        e = Integer.toString(0, 36);
        f = Integer.toString(1, 36);
        g = Integer.toString(2, 36);
    }

    public l0(android.support.v4.media.session.a0 a0Var) {
        this.a = (Uri) a0Var.b;
        this.b = (String) a0Var.c;
        this.c = (Bundle) a0Var.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (Objects.equals(this.a, l0Var.a) && Objects.equals(this.b, l0Var.b)) {
            if ((this.c == null) == (l0Var.c == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Uri uri = this.a;
        int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.c != null ? 1 : 0);
    }
}
