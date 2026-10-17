package b2;

import android.net.Uri;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class b0 {
    public static final String b;
    public final Uri a;

    static {
        String str = e2.m0.a;
        b = Integer.toString(0, 36);
    }

    public b0(a1 a1Var) {
        this.a = (Uri) a1Var.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && this.a.equals(((b0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
