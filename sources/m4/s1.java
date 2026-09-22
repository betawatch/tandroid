package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class s1 {
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public final int a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final IBinder f;
    public final Bundle g;
    public final MediaSession.Token h;

    static {
        String str = e2.d0.a;
        i = Integer.toString(0, 36);
        j = Integer.toString(1, 36);
        k = Integer.toString(2, 36);
        l = Integer.toString(3, 36);
        m = Integer.toString(4, 36);
        n = Integer.toString(5, 36);
        o = Integer.toString(6, 36);
        p = Integer.toString(7, 36);
        q = Integer.toString(8, 36);
        r = Integer.toString(9, 36);
    }

    public s1(int i10, String str, g1 g1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        this.a = i10;
        this.b = 1008001300;
        this.c = 5;
        this.d = str;
        this.e = "";
        this.f = g1Var;
        this.g = bundle;
        this.h = token;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj;
        return this.a == s1Var.a && this.b == s1Var.b && this.c == s1Var.c && TextUtils.equals(this.d, s1Var.d) && TextUtils.equals(this.e, s1Var.e) && Objects.equals(this.f, s1Var.f) && Objects.equals(this.h, s1Var.h);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), 0, Integer.valueOf(this.b), Integer.valueOf(this.c), this.d, this.e, null, this.f, this.h);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.b + " interfaceVersion=" + this.c + " service=" + this.e + " IMediaSession=" + this.f + " extras=" + this.g + "}";
    }
}
