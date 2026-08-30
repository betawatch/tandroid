package g5;

import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class p {
    public static final /* synthetic */ int i = 0;
    public final Uri a;
    public final int b;
    public final byte[] c;
    public final Map d;
    public final long e;
    public final long f;
    public final String g;
    public final int h;

    static {
        j3.l0.a("goog.exo.datasource");
    }

    public p(Uri uri, int i10, byte[] bArr, Map map, long j10, long j11, String str, int i11) {
        h5.a.f(j10 >= 0);
        h5.a.f(j10 >= 0);
        h5.a.f(j11 > 0 || j11 == -1);
        this.a = uri;
        this.b = i10;
        this.c = (bArr == null || bArr.length == 0) ? null : bArr;
        this.d = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.e = j10;
        this.f = j11;
        this.g = str;
        this.h = i11;
    }

    public final c4.c a() {
        c4.c cVar = new c4.c();
        cVar.e = this.a;
        cVar.a = this.b;
        cVar.f = this.c;
        cVar.g = this.d;
        cVar.b = this.e;
        cVar.c = this.f;
        cVar.h = this.g;
        cVar.d = this.h;
        return cVar;
    }

    public final p b(long j10) {
        long j11 = this.f;
        long j12 = j11 != -1 ? j11 - j10 : -1L;
        if (j10 == 0 && j11 == j12) {
            return this;
        }
        return new p(this.a, this.b, this.c, this.d, this.e + j10, j12, this.g, this.h);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DataSpec[");
        int i10 = this.b;
        if (i10 == 1) {
            str = "GET";
        } else if (i10 == 2) {
            str = "POST";
        } else {
            if (i10 != 3) {
                throw new IllegalStateException();
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
        return android.support.v4.media.a.m(this.h, "]", sb);
    }
}
