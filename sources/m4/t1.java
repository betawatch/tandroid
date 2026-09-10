package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class t1 {
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

    public t1(int i10, String str, h1 h1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        this.a = i10;
        this.b = 1008001300;
        this.c = 5;
        this.d = str;
        this.e = "";
        this.f = h1Var;
        this.g = bundle;
        this.h = token;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        return this.a == t1Var.a && this.b == t1Var.b && this.c == t1Var.c && TextUtils.equals(this.d, t1Var.d) && TextUtils.equals(this.e, t1Var.e) && Objects.equals(this.f, t1Var.f) && Objects.equals(this.h, t1Var.h);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), 0, Integer.valueOf(this.b), Integer.valueOf(this.c), this.d, this.e, null, this.f, this.h);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.b + " interfaceVersion=" + this.c + " service=" + this.e + " IMediaSession=" + this.f + " extras=" + this.g + "}";
    }
}
