package b2;

import android.net.Uri;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class x {
    public static final String b;
    public final Uri a;

    static {
        String str = e2.d0.a;
        b = Integer.toString(0, 36);
    }

    public x(w0 w0Var) {
        this.a = (Uri) w0Var.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && this.a.equals(((x) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
