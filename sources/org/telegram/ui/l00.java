package org.telegram.ui;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class l00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l10 b;

    public /* synthetic */ l00(l10 l10Var, int i10) {
        this.a = i10;
        this.b = l10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l10.V(this.b);
                break;
            default:
                l10.W(this.b);
                break;
        }
    }
}
