package org.telegram.ui.Components;

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class q61 implements g2.h {
    public final g2.h a;
    public final long b;

    public q61(ExtendedDefaultDataSource extendedDefaultDataSource, long j10) {
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
