// default package

import android.media.session.MediaSession;
import android.os.Bundle;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class kaa {
    public static final String b;
    public static final String c;
    public final laa a;

    static {
        gt6.a("media3.session");
        String str = gcc.a;
        b = "0";
        c = "1";
    }

    public kaa(int i, String str, sz6 sz6Var, Bundle bundle, MediaSession.Token token) {
        this.a = new laa(i, str, sz6Var, bundle, token);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kaa) {
            return this.a.equals(((kaa) obj).a);
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
