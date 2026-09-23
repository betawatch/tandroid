package m4;

import android.media.session.MediaSession;
import android.os.Bundle;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class m1 {
    public static final String b;
    public static final String c;
    public final n1 a;

    static {
        b2.l0.a("media3.session");
        String str = e2.d0.a;
        b = Integer.toString(0, 36);
        c = Integer.toString(1, 36);
    }

    public m1(int i10, String str, b1 b1Var, Bundle bundle, MediaSession.Token token) {
        this.a = new n1(i10, str, b1Var, bundle, token);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m1) {
            return this.a.equals(((m1) obj).a);
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
