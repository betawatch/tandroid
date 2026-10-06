package b2;

import android.net.Uri;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
