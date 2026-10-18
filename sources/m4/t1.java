package m4;

import android.media.session.MediaSession;
import android.os.Bundle;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class t1 {
    public static final String b;
    public static final String c;
    public final u1 a;

    static {
        b2.p0.a("media3.session");
        String str = e2.m0.a;
        b = Integer.toString(0, 36);
        c = Integer.toString(1, 36);
    }

    public t1(int i10, String str, i1 i1Var, Bundle bundle, MediaSession.Token token) {
        this.a = new u1(i10, str, i1Var, bundle, token);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t1) {
            return this.a.equals(((t1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
