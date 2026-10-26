package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class v1 {
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
        String str = e2.n0.a;
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

    public v1(int i10, String str, j1 j1Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        bundle.getClass();
        this.a = i10;
        this.b = 1010001300;
        this.c = 9;
        this.d = str;
        this.e = "";
        this.f = j1Var;
        this.g = bundle;
        this.h = token;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj;
        return this.a == v1Var.a && this.b == v1Var.b && this.c == v1Var.c && TextUtils.equals(this.d, v1Var.d) && TextUtils.equals(this.e, v1Var.e) && Objects.equals(this.f, v1Var.f) && Objects.equals(this.h, v1Var.h);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), 0, Integer.valueOf(this.b), Integer.valueOf(this.c), this.d, this.e, null, this.f, this.h);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.d + " type=0 libraryVersion=" + this.b + " interfaceVersion=" + this.c + " service=" + this.e + " IMediaSession=" + this.f + " extras=" + this.g + "}";
    }
}
