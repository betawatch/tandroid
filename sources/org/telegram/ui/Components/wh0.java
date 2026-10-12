package org.telegram.ui.Components;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class wh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zh0 b;

    public /* synthetic */ wh0(zh0 zh0Var, int i10) {
        this.a = i10;
        this.b = zh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(true);
                break;
            default:
                this.b.d();
                break;
        }
    }
}
