package org.telegram.ui;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k91 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l91 b;

    public /* synthetic */ k91(l91 l91Var, int i7) {
        this.a = i7;
        this.b = l91Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l91 l91Var = this.b;
                l91Var.F = null;
                if (l91Var.G != -1) {
                    l91Var.H.getNotificationCenter().j(l91Var.G);
                    l91Var.G = -1;
                    break;
                }
                break;
            default:
                l91 l91Var2 = this.b;
                l91Var2.F = null;
                if (l91Var2.G != -1) {
                    l91Var2.H.getNotificationCenter().j(l91Var2.G);
                    l91Var2.G = -1;
                    break;
                }
                break;
        }
    }
}
