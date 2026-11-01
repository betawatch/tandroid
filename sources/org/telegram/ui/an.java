package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class an implements org.telegram.messenger.kp {
    public final /* synthetic */ bj a;
    public final /* synthetic */ un b;
    public final /* synthetic */ fn c;

    public an(fn fnVar, bj bjVar, un unVar) {
        this.c = fnVar;
        this.a = bjVar;
        this.b = unVar;
    }

    @Override // org.telegram.messenger.kp
    public final void a() {
        this.a.c(false);
        this.c.a.presentFragment(this.b);
    }

    @Override // org.telegram.messenger.kp
    public final void g(boolean z10) {
        this.a.c(false);
        this.c.a.presentFragment(this.b);
    }
}
