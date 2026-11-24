// default package

import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class g83 {
    public static final /* synthetic */ int i = 0;
    public final Uri a;
    public final byte b;
    public final byte[] c;
    public final Map d;
    public final long e;
    public final long f;
    public final String g;
    public final byte h;

    static {
        ct6.a("media3.datasource");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g83(Uri uri, int i2, byte[] bArr, Map map, long j, long j2, String str, int i3) {
        jte.f(j >= 0);
        jte.f(j >= 0);
        jte.f(j2 > 0 || j2 == -1);
        uri.getClass();
        this.a = uri;
        this.b = i2;
        this.c = (bArr == null || bArr.length == 0) ? null : bArr;
        this.d = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.e = j;
        this.f = j2;
        this.g = str;
        this.h = i3;
    }

    public final f83 a() {
        f83 f83Var = new f83();
        f83Var.a = this.a;
        f83Var.b = this.b;
        f83Var.c = this.c;
        f83Var.d = this.d;
        f83Var.e = this.e;
        f83Var.f = this.f;
        f83Var.g = this.g;
        f83Var.h = this.h;
        return f83Var;
    }

    public final g83 b(long j) {
        long j2 = this.f;
        long j3 = j2 != -1 ? j2 - j : -1L;
        if (j == 0 && j2 == j3) {
            return this;
        }
        return new g83(this.a, this.b, this.c, this.d, this.e + j, j3, this.g, this.h);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DataSpec[");
        byte b = this.b;
        if (b == 1) {
            str = "GET";
        } else if (b == 2) {
            str = "POST";
        } else {
            if (b != 3) {
                rjb.h();
                return null;
            }
            str = "HEAD";
        }
        sb.append(str);
        sb.append(" ");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.e);
        sb.append(", ");
        sb.append(this.f);
        sb.append(", ");
        sb.append(this.g);
        sb.append(", ");
        return hg9.k(sb, this.h, "]");
    }

    public g83(long j, Uri uri) {
        this(uri, 1, null, Collections.EMPTY_MAP, j, -1L, null, 0);
    }
}
