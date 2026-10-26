package b2;

import android.net.Uri;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class c0 {
    public static final String b;
    public final Uri a;

    static {
        String str = e2.n0.a;
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
