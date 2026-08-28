package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class q {
    public static final /* synthetic */ int i = 0;
    public Uri a;
    public final int b;
    public final byte[] c;
    public final Map d;
    public final long e;
    public final long f;
    public final String g;
    public final int h;

    static {
        h3.r0.a("goog.exo.datasource");
    }

    public q(Uri uri, int i9, byte[] bArr, Map map, long j10, long j11, String str, int i10) {
        d5.a.f(j10 >= 0);
        d5.a.f(j10 >= 0);
        d5.a.f(j11 > 0 || j11 == -1);
        this.a = uri;
        this.b = i9;
        this.c = (bArr == null || bArr.length == 0) ? null : bArr;
        this.d = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.e = j10;
        this.f = j11;
        this.g = str;
        this.h = i10;
    }

    public final q a(long j10) {
        long j11 = this.f;
        long j12 = j11 != -1 ? j11 - j10 : -1L;
        if (j10 == 0 && j11 == j12) {
            return this;
        }
        return new q(this.a, this.b, this.c, this.d, this.e + j10, j12, this.g, this.h);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        int i9 = this.b;
        if (i9 == 1) {
            str = "GET";
        } else if (i9 == 2) {
            str = "POST";
        } else {
            if (i9 != 3) {
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
        return aa.d.l(this.h, "]", sb2);
    }
}
