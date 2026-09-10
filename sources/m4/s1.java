package m4;

import android.media.session.MediaSession;
import android.os.Bundle;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class s1 {
    public static final String b;
    public static final String c;
    public final t1 a;

    static {
        b2.l0.a("media3.session");
        String str = e2.d0.a;
        b = Integer.toString(0, 36);
        c = Integer.toString(1, 36);
    }

    public s1(int i10, String str, h1 h1Var, Bundle bundle, MediaSession.Token token) {
        this.a = new t1(i10, str, h1Var, bundle, token);
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
