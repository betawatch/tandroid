package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hg1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ig1 b;

    public /* synthetic */ hg1(ig1 ig1Var, int i9) {
        this.a = i9;
        this.b = ig1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.c51 c51Var = this.b.a;
                if (c51Var != null) {
                    c51Var.U2.N(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.c51 c51Var2 = this.b.a;
                if (c51Var2 != null) {
                    c51Var2.U2.N(true);
                    break;
                }
                break;
        }
    }
}
