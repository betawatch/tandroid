package e2;

import android.net.Uri;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
