package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class an implements org.telegram.messenger.jp {
    public final /* synthetic */ bj a;
    public final /* synthetic */ un b;
    public final /* synthetic */ fn c;

    public an(fn fnVar, bj bjVar, un unVar) {
        this.c = fnVar;
        this.a = bjVar;
        this.b = unVar;
    }

    @Override // org.telegram.messenger.jp
    public final void a() {
        this.a.c(false);
        this.c.a.presentFragment(this.b);
    }

    @Override // org.telegram.messenger.jp
    public final void g(boolean z10) {
        this.a.c(false);
        this.c.a.presentFragment(this.b);
    }
}
