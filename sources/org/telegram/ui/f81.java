package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l81 b;

    public /* synthetic */ f81(l81 l81Var, int i3) {
        this.a = i3;
        this.b = l81Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l81 l81Var = this.b;
                l81Var.getClass();
                new vg.v0((org.telegram.ui.ActionBar.d2) l81Var, 11, false).show();
                break;
            default:
                l81 l81Var2 = this.b;
                l81Var2.e.requestFocus();
                org.telegram.messenger.g0.K3(l81Var2.e);
                break;
        }
    }
}
