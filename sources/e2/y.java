package e2;

import android.net.Uri;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
