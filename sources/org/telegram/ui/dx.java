package org.telegram.ui;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class dx implements org.telegram.messenger.y5 {
    public long a;
    public long b;
    public final String c;
    public final /* synthetic */ ex d;

    public dx(ex exVar, String str) {
        this.d = exVar;
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
