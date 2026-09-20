package org.telegram.ui.Components;

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class o71 implements g2.h {
    public final g2.h a;
    public final long b;

    public o71(ExtendedDefaultDataSource extendedDefaultDataSource, long j3) {
        this.a = extendedDefaultDataSource;
        this.b = j3;
    }

    @Override // g2.h
    public final void addTransferListener(g2.c0 c0Var) {
        this.a.addTransferListener(c0Var);
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
    public final long open(g2.m mVar) {
        g2.l a2 = mVar.a();
        a2.b = mVar.e + this.b;
        return this.a.open(a2.d());
    }

    @Override // b2.k
    public final int read(byte[] bArr, int i10, int i11) {
        return this.a.read(bArr, i10, i11);
    }
}
