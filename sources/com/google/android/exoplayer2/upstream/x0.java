package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class x0 implements m {
    public final m a;
    public long b;
    public Uri c;

    public x0(m mVar) {
        mVar.getClass();
        this.a = mVar;
        this.c = Uri.EMPTY;
        Map map = Collections.EMPTY_MAP;
    }

    @Override // com.google.android.exoplayer2.upstream.m
    public final void addTransferListener(y0 y0Var) {
        y0Var.getClass();
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
    public final long open(q qVar) {
        this.c = qVar.a;
        Map map = Collections.EMPTY_MAP;
        m mVar = this.a;
        long open = mVar.open(qVar);
        Uri uri = mVar.getUri();
        uri.getClass();
        this.c = uri;
        mVar.getResponseHeaders();
        return open;
    }

    @Override // com.google.android.exoplayer2.upstream.j
    public final int read(byte[] bArr, int i10, int i11) {
        int read = this.a.read(bArr, i10, i11);
        if (read != -1) {
            this.b += read;
        }
        return read;
    }
}
