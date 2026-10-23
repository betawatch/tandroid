package b2;

import android.net.Uri;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
