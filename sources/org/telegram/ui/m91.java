package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m91 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n91 b;

    public /* synthetic */ m91(n91 n91Var, int i7) {
        this.a = i7;
        this.b = n91Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n91 n91Var = this.b;
                n91Var.F = null;
                if (n91Var.G != -1) {
                    n91Var.H.getNotificationCenter().j(n91Var.G);
                    n91Var.G = -1;
                    break;
                }
                break;
            default:
                n91 n91Var2 = this.b;
                n91Var2.F = null;
                if (n91Var2.G != -1) {
                    n91Var2.H.getNotificationCenter().j(n91Var2.G);
                    n91Var2.G = -1;
                    break;
                }
                break;
        }
    }
}
