package org.telegram.ui.Components;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class gw0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ iw0 b;

    public /* synthetic */ gw0(iw0 iw0Var, int i10) {
        this.a = i10;
        this.b = iw0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                iw0 iw0Var = this.b;
                iw0Var.V0 = false;
                if (!iw0Var.Y0 && iw0Var.W0) {
                    iw0Var.C(true);
                    break;
                }
                break;
            case 1:
                this.b.V0 = false;
                break;
            case 2:
                iw0 iw0Var2 = this.b;
                iw0Var2.Y0 = false;
                if (!iw0Var2.V0 && iw0Var2.W0) {
                    iw0Var2.C(true);
                    break;
                }
                break;
            default:
                this.b.Y0 = false;
                break;
        }
    }
}
