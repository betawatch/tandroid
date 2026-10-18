package b2;

import android.net.Uri;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
