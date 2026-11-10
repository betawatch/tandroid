package e2;

import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class h0 {
    public static final h0 d = new h0(new android.support.v4.media.session.a0(20, false));
    public static final String e;
    public static final String f;
    public static final String g;
    public final Uri a;
    public final String b;
    public final Bundle c;

    static {
        String str = h2.m0.a;
        e = Integer.toString(0, 36);
        f = Integer.toString(1, 36);
        g = Integer.toString(2, 36);
    }

    public h0(android.support.v4.media.session.a0 a0Var) {
        this.a = (Uri) a0Var.b;
        this.b = (String) a0Var.c;
        this.c = (Bundle) a0Var.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (Objects.equals(this.a, h0Var.a) && Objects.equals(this.b, h0Var.b)) {
            if ((this.c == null) == (h0Var.c == null)) {
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
