package org.telegram.ui;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ph1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qh1 b;

    public /* synthetic */ ph1(qh1 qh1Var, int i10) {
        this.a = i10;
        this.b = qh1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.x51 x51Var = this.b.a;
                if (x51Var != null) {
                    x51Var.Y2.N(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.x51 x51Var2 = this.b.a;
                if (x51Var2 != null) {
                    x51Var2.Y2.N(true);
                    break;
                }
                break;
        }
    }
}
