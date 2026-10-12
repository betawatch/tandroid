package b2;

import android.net.Uri;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class c0 {
    public static final String b;
    public final Uri a;

    static {
        String str = e2.m0.a;
        b = Integer.toString(0, 36);
    }

    public c0(b1 b1Var) {
        this.a = (Uri) b1Var.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && this.a.equals(((c0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
