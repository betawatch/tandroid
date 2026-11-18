package e2;

import android.net.Uri;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class y {
    public static final String b;
    public final Uri a;

    static {
        String str = h2.l0.a;
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
