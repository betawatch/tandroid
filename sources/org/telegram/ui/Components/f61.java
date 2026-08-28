package org.telegram.ui.Components;

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class f61 implements com.google.android.exoplayer2.upstream.m {
    public final com.google.android.exoplayer2.upstream.m a;
    public final long b;

    public f61(ExtendedDefaultDataSource extendedDefaultDataSource, long j10) {
        this.a = extendedDefaultDataSource;
        this.b = j10;
    }

    @Override // com.google.android.exoplayer2.upstream.m
    public final void addTransferListener(com.google.android.exoplayer2.upstream.y0 y0Var) {
        this.a.addTransferListener(y0Var);
    }

    @Override // com.google.android.exoplayer2.upstream.m
    public final void close() {
        this.a.close();
    }

    @Override // com.google.android.exoplayer2.upstream.m
    public final Map getResponseHeaders() {
        return this.a.getResponseHeaders();
    }

    @Override // com.google.android.exoplayer2.upstream.m
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.m
    public final long open(com.google.android.exoplayer2.upstream.q qVar) {
        com.google.android.exoplayer2.upstream.p pVar = new com.google.android.exoplayer2.upstream.p();
        pVar.e = qVar.a;
        pVar.a = qVar.b;
        pVar.f = qVar.c;
        pVar.g = qVar.d;
        pVar.b = qVar.e;
        pVar.d = qVar.f;
        pVar.h = qVar.g;
        pVar.c = qVar.h;
        pVar.b = qVar.e + this.b;
        d5.a.k((Uri) pVar.e, "The uri must be set.");
        return this.a.open(new com.google.android.exoplayer2.upstream.q((Uri) pVar.e, pVar.a, (byte[]) pVar.f, (Map) pVar.g, pVar.b, pVar.d, (String) pVar.h, pVar.c));
    }

    @Override // com.google.android.exoplayer2.upstream.j
    public final int read(byte[] bArr, int i9, int i10) {
        return this.a.read(bArr, i9, i10);
    }
}
