package b2;

import android.net.Uri;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
