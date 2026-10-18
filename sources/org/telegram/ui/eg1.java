package org.telegram.ui;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eg1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fg1 b;

    public /* synthetic */ eg1(fg1 fg1Var, int i10) {
        this.a = i10;
        this.b = fg1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.u61 u61Var = this.b.a;
                if (u61Var != null) {
                    u61Var.W2.N(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.u61 u61Var2 = this.b.a;
                if (u61Var2 != null) {
                    u61Var2.W2.N(true);
                    break;
                }
                break;
        }
    }
}
