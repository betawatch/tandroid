package g2;

import android.net.Uri;
import b2.l0;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class m {
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
        l0.a("media3.datasource");
    }

    public m(Uri uri, int i10, byte[] bArr, Map map, long j3, long j10, String str, int i11) {
        e2.d.b(j3 >= 0);
        e2.d.b(j3 >= 0);
        e2.d.b(j10 > 0 || j10 == -1);
        uri.getClass();
        this.a = uri;
        this.b = i10;
        this.c = (bArr == null || bArr.length == 0) ? null : bArr;
        this.d = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.e = j3;
        this.f = j10;
        this.g = str;
        this.h = i11;
    }

    public final l a() {
        l lVar = new l();
        lVar.e = this.a;
        lVar.a = this.b;
        lVar.f = this.c;
        lVar.g = this.d;
        lVar.b = this.e;
        lVar.d = this.f;
        lVar.h = this.g;
        lVar.c = this.h;
        return lVar;
    }

    public final m b(long j3) {
        long j10 = this.f;
        long j11 = j10 != -1 ? j10 - j3 : -1L;
        if (j3 == 0 && j10 == j11) {
            return this;
        }
        return new m(this.a, this.b, this.c, this.d, this.e + j3, j11, this.g, this.h);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DataSpec[");
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
        sb2.append(str);
        sb2.append(" ");
        sb2.append(this.a);
        sb2.append(", ");
        sb2.append(this.e);
        sb2.append(", ");
        sb2.append(this.f);
        sb2.append(", ");
        sb2.append(this.g);
        sb2.append(", ");
        return a4.a.n(this.h, "]", sb2);
    }
}
