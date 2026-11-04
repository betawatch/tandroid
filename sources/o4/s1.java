package o4;

import android.media.session.MediaSession;
import android.os.Bundle;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class s1 {
    public static final String b;
    public static final String c;
    public final t1 a;

    static {
        d2.o0.a("media3.session");
        String str = g2.n0.a;
        b = Integer.toString(0, 36);
        c = Integer.toString(1, 36);
    }

    public s1(int i3, String str, h1 h1Var, Bundle bundle, MediaSession.Token token) {
        this.a = new t1(i3, str, h1Var, bundle, token);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s1) {
            return this.a.equals(((s1) obj).a);
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
