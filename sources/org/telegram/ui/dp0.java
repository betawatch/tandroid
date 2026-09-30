package org.telegram.ui;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ np0 b;

    public /* synthetic */ dp0(np0 np0Var, int i10) {
        this.a = i10;
        this.b = np0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        np0 np0Var = this.b;
        switch (i10) {
            case 0:
                if (np0Var.G) {
                    np0Var.b.invalidate();
                    break;
                }
                break;
            case 1:
                np0Var.h();
                break;
            case 2:
                int i11 = np0.q0;
                np0Var.h();
                break;
            default:
                int i12 = np0.q0;
                np0Var.h();
                break;
        }
    }
}
