package j2;

import a8.ia;
import a8.p0;
import android.net.Uri;
import e2.m0;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
        m0.a("media3.datasource");
    }

    public m(Uri uri, int i7, byte[] bArr, Map map, long j3, long j10, String str, int i10) {
        ia.f(j3 >= 0);
        ia.f(j3 >= 0);
        ia.f(j10 > 0 || j10 == -1);
        uri.getClass();
        this.a = uri;
        this.b = i7;
        this.c = (bArr == null || bArr.length == 0) ? null : bArr;
        this.d = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.e = j3;
        this.f = j10;
        this.g = str;
        this.h = i10;
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
        int i7 = this.b;
        if (i7 == 1) {
            str = "GET";
        } else if (i7 == 2) {
            str = "POST";
        } else {
            if (i7 != 3) {
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
        return p0.n(this.h, "]", sb2);
    }
}
