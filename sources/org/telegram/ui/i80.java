package org.telegram.ui;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class i80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p80 b;

    public /* synthetic */ i80(p80 p80Var, int i10) {
        this.a = i10;
        this.b = p80Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p80 p80Var = this.b;
                p80Var.h.postOnAnimation(new i80(p80Var, 1));
                break;
            default:
                this.b.Y();
                break;
        }
    }
}
