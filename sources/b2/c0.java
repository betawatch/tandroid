package b2;

import android.net.Uri;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
