package m4;

import android.media.session.MediaSession;
import android.os.Bundle;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class l1 {
    public static final String b;
    public static final String c;
    public final m1 a;

    static {
        b2.l0.a("media3.session");
        String str = e2.d0.a;
        b = Integer.toString(0, 36);
        c = Integer.toString(1, 36);
    }

    public l1(int i10, String str, a1 a1Var, Bundle bundle, MediaSession.Token token) {
        this.a = new m1(i10, str, a1Var, bundle, token);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l1) {
            return this.a.equals(((l1) obj).a);
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
