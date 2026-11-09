package e2;

import android.net.Uri;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class y {
    public static final String b;
    public final Uri a;

    static {
        String str = h2.m0.a;
        b = Integer.toString(0, 36);
    }

    public y(x0 x0Var) {
        this.a = (Uri) x0Var.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && this.a.equals(((y) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
