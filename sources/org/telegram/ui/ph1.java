package org.telegram.ui;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                org.telegram.ui.Components.y51 y51Var = this.b.a;
                if (y51Var != null) {
                    y51Var.Y2.N(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.y51 y51Var2 = this.b.a;
                if (y51Var2 != null) {
                    y51Var2.Y2.N(true);
                    break;
                }
                break;
        }
    }
}
