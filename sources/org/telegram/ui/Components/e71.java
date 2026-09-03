package org.telegram.ui.Components;

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class e71 implements g5.m {
    public final g5.m a;
    public final long b;

    public e71(ExtendedDefaultDataSource extendedDefaultDataSource, long j10) {
        this.a = extendedDefaultDataSource;
        this.b = j10;
    }

    @Override // g5.m
    public final void addTransferListener(g5.v0 v0Var) {
        this.a.addTransferListener(v0Var);
    }

    @Override // g5.m
    public final void close() {
        this.a.close();
    }

    @Override // g5.m
    public final Map getResponseHeaders() {
        return this.a.getResponseHeaders();
    }

    @Override // g5.m
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // g5.m
    public final long open(g5.p pVar) {
        c4.c a2 = pVar.a();
        a2.b = pVar.e + this.b;
        return this.a.open(a2.d());
    }

    @Override // g5.j
    public final int read(byte[] bArr, int i10, int i11) {
        return this.a.read(bArr, i10, i11);
    }
}
