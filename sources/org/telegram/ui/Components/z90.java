package org.telegram.ui.Components;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class z90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ aa0 b;
    public final /* synthetic */ ea0 c;

    public /* synthetic */ z90(aa0 aa0Var, ea0 ea0Var, int i10) {
        this.a = i10;
        this.b = aa0Var;
        this.c = ea0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.k(this.c, false);
                break;
            default:
                this.b.k(this.c, false);
                break;
        }
    }
}
