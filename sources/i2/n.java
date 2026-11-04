package i2;

import android.net.Uri;
import b8.zb;
import d2.o0;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class n {
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
        o0.a("media3.datasource");
    }

    public n(Uri uri, int i3, byte[] bArr, Map map, long j10, long j11, String str, int i10) {
        zb.f(j10 >= 0);
        zb.f(j10 >= 0);
        zb.f(j11 > 0 || j11 == -1);
        uri.getClass();
        this.a = uri;
        this.b = i3;
        this.c = (bArr == null || bArr.length == 0) ? null : bArr;
        this.d = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.e = j10;
        this.f = j11;
        this.g = str;
        this.h = i10;
    }

    public final m a() {
        m mVar = new m();
        mVar.e = this.a;
        mVar.a = this.b;
        mVar.f = this.c;
        mVar.g = this.d;
        mVar.b = this.e;
        mVar.d = this.f;
        mVar.h = this.g;
        mVar.c = this.h;
        return mVar;
    }

    public final n b(long j10) {
        long j11 = this.f;
        long j12 = j11 != -1 ? j11 - j10 : -1L;
        if (j10 == 0 && j11 == j12) {
            return this;
        }
        return new n(this.a, this.b, this.c, this.d, this.e + j10, j12, this.g, this.h);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        int i3 = this.b;
        if (i3 == 1) {
            str = "GET";
        } else if (i3 == 2) {
            str = "POST";
        } else {
            if (i3 != 3) {
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
        return a1.g.o(this.h, "]", sb2);
    }
}
