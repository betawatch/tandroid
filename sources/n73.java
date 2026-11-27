// default package

import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class n73 {
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
        gt6.a("media3.datasource");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n73(Uri uri, int i2, byte[] bArr, Map map, long j, long j2, String str, int i3) {
        yve.f(j >= 0);
        yve.f(j >= 0);
        yve.f(j2 > 0 || j2 == -1);
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

    public final m73 a() {
        m73 m73Var = new m73();
        m73Var.a = this.a;
        m73Var.b = this.b;
        m73Var.c = this.c;
        m73Var.d = this.d;
        m73Var.e = this.e;
        m73Var.f = this.f;
        m73Var.g = this.g;
        m73Var.h = this.h;
        return m73Var;
    }

    public final n73 b(long j) {
        long j2 = this.f;
        long j3 = j2 != -1 ? j2 - j : -1L;
        if (j == 0 && j2 == j3) {
            return this;
        }
        return new n73(this.a, this.b, this.c, this.d, this.e + j, j3, this.g, this.h);
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
                grb.g();
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
        return uh9.l(sb, this.h, "]");
    }

    public n73(long j, Uri uri) {
        this(uri, 1, null, Collections.EMPTY_MAP, j, -1L, null, 0);
    }
}
