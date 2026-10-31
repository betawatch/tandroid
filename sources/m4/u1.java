package m4;

import android.media.session.MediaSession;
import android.os.Bundle;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class u1 {
    public static final String b;
    public static final String c;
    public final v1 a;

    static {
        b2.q0.a("media3.session");
        String str = e2.l0.a;
        b = Integer.toString(0, 36);
        c = Integer.toString(1, 36);
    }

    public u1(int i10, String str, j1 j1Var, Bundle bundle, MediaSession.Token token) {
        this.a = new v1(i10, str, j1Var, bundle, token);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u1) {
            return this.a.equals(((u1) obj).a);
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
