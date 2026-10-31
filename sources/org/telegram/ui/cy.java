package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class cy implements org.telegram.messenger.z5 {
    public long a;
    public long b;
    public final String c;
    public final /* synthetic */ dy d;

    public cy(dy dyVar, String str) {
        this.d = dyVar;
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
    public final void C(boolean z10) {
    }

    @Override // org.telegram.messenger.z5
    public final void M(String str) {
    }

    @Override // org.telegram.messenger.z5
    public final void n(long j10, long j11) {
    }
}
