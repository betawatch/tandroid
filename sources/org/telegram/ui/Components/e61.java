package org.telegram.ui.Components;

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class e61 implements j2.h {
    public final j2.h a;
    public final long b;

    public e61(ExtendedDefaultDataSource extendedDefaultDataSource, long j3) {
        this.a = extendedDefaultDataSource;
        this.b = j3;
    }

    @Override // j2.h
    public final void addTransferListener(j2.c0 c0Var) {
        this.a.addTransferListener(c0Var);
    }

    @Override // j2.h
    public final void close() {
        this.a.close();
    }

    @Override // j2.h
    public final Map getResponseHeaders() {
        return this.a.getResponseHeaders();
    }

    @Override // j2.h
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // j2.h
    public final long open(j2.m mVar) {
        j2.l a10 = mVar.a();
        a10.b = mVar.e + this.b;
        return this.a.open(a10.d());
    }

    @Override // e2.n
    public final int read(byte[] bArr, int i7, int i10) {
        return this.a.read(bArr, i7, i10);
    }
}
