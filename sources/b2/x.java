package b2;

import android.net.Uri;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
