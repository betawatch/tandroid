package b2;

import android.net.Uri;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class b0 {
    public static final String b;
    public final Uri a;

    static {
        String str = e2.m0.a;
        b = Integer.toString(0, 36);
    }

    public b0(a1 a1Var) {
        this.a = (Uri) a1Var.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && this.a.equals(((b0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
