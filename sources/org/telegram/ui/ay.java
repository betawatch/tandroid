package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ay implements org.telegram.messenger.z5 {
    public long a;
    public long b;
    public final String c;
    public final /* synthetic */ cy d;

    public ay(cy cyVar, String str) {
        this.d = cyVar;
        this.c = str;
    }

    @Override // org.telegram.messenger.z5
    public final int getObserverTag() {
        return 0;
    }

    @Override // org.telegram.messenger.z5
    public final void i(long j10, long j11) {
        this.b = j10;
        this.a = j11;
        this.d.b();
    }

    @Override // org.telegram.messenger.z5
    public final void D(boolean z10) {
    }

    @Override // org.telegram.messenger.z5
    public final void N(String str) {
    }

    @Override // org.telegram.messenger.z5
    public final void o(long j10, long j11) {
    }
}
