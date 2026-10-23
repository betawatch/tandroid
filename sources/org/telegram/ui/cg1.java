package org.telegram.ui;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cg1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dg1 b;

    public /* synthetic */ cg1(dg1 dg1Var, int i10) {
        this.a = i10;
        this.b = dg1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.w61 w61Var = this.b.a;
                if (w61Var != null) {
                    w61Var.W2.N(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.w61 w61Var2 = this.b.a;
                if (w61Var2 != null) {
                    w61Var2.W2.N(true);
                    break;
                }
                break;
        }
    }
}
