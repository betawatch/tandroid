package org.telegram.ui;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class cx implements org.telegram.messenger.y5 {
    public long a;
    public long b;
    public final String c;
    public final /* synthetic */ dx d;

    public cx(dx dxVar, String str) {
        this.d = dxVar;
        this.c = str;
    }

    @Override // org.telegram.messenger.y5
    public final int getObserverTag() {
        return 0;
    }

    @Override // org.telegram.messenger.y5
    public final void i(long j3, long j10) {
        this.b = j3;
        this.a = j10;
        this.d.b();
    }

    @Override // org.telegram.messenger.y5
    public final void C(boolean z10) {
    }

    @Override // org.telegram.messenger.y5
    public final void N(String str) {
    }

    @Override // org.telegram.messenger.y5
    public final void o(long j3, long j10) {
    }
}
