package m4;

import android.media.session.MediaSession;
import android.os.Bundle;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
