package org.telegram.ui.Components;

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class r61 implements g2.h {
    public final g2.h a;
    public final long b;

    public r61(ExtendedDefaultDataSource extendedDefaultDataSource, long j10) {
        this.a = extendedDefaultDataSource;
        this.b = j10;
    }

    @Override // g2.h
    public final void addTransferListener(g2.d0 d0Var) {
        this.a.addTransferListener(d0Var);
    }

    @Override // g2.h
    public final void close() {
        this.a.close();
    }

    @Override // g2.h
    public final Map getResponseHeaders() {
        return this.a.getResponseHeaders();
    }

    @Override // g2.h
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // g2.h
    public final long open(g2.n nVar) {
        g2.m a2 = nVar.a();
        a2.b = nVar.e + this.b;
        return this.a.open(a2.d());
    }

    @Override // b2.p
    public final int read(byte[] bArr, int i10, int i11) {
        return this.a.read(bArr, i10, i11);
    }
}
