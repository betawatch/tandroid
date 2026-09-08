package m4;

import android.media.session.MediaSession;
import android.os.Bundle;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class q1 {
    public static final String b;
    public static final String c;
    public final r1 a;

    static {
        b2.l0.a("media3.session");
        String str = e2.d0.a;
        b = Integer.toString(0, 36);
        c = Integer.toString(1, 36);
    }

    public q1(int i10, String str, f1 f1Var, Bundle bundle, MediaSession.Token token) {
        this.a = new r1(i10, str, f1Var, bundle, token);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q1) {
            return this.a.equals(((q1) obj).a);
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
