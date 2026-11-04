package d2;

import android.net.Uri;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a0 {
    public static final String b;
    public final Uri a;

    static {
        String str = g2.n0.a;
        b = Integer.toString(0, 36);
    }

    public a0(z0 z0Var) {
        this.a = (Uri) z0Var.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && this.a.equals(((a0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
