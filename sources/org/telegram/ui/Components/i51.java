package org.telegram.ui.Components;

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class i51 implements i2.h {
    public final i2.h a;
    public final long b;

    public i51(ExtendedDefaultDataSource extendedDefaultDataSource, long j10) {
        this.a = extendedDefaultDataSource;
        this.b = j10;
    }

    @Override // i2.h
    public final void addTransferListener(i2.d0 d0Var) {
        this.a.addTransferListener(d0Var);
    }

    @Override // i2.h
    public final void close() {
        this.a.close();
    }

    @Override // i2.h
    public final Map getResponseHeaders() {
        return this.a.getResponseHeaders();
    }

    @Override // i2.h
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // i2.h
    public final long open(i2.n nVar) {
        i2.m a10 = nVar.a();
        a10.b = nVar.e + this.b;
        return this.a.open(a10.d());
    }

    @Override // d2.o
    public final int read(byte[] bArr, int i3, int i10) {
        return this.a.read(bArr, i3, i10);
    }
}
