package org.telegram.ui.Components;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yt0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ au0 b;

    public /* synthetic */ yt0(au0 au0Var, int i7) {
        this.a = i7;
        this.b = au0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                au0 au0Var = this.b;
                au0Var.V0 = false;
                if (!au0Var.Y0 && au0Var.W0) {
                    au0Var.C(true);
                    break;
                }
                break;
            case 1:
                this.b.V0 = false;
                break;
            case 2:
                au0 au0Var2 = this.b;
                au0Var2.Y0 = false;
                if (!au0Var2.V0 && au0Var2.W0) {
                    au0Var2.C(true);
                    break;
                }
                break;
            default:
                this.b.Y0 = false;
                break;
        }
    }
}
