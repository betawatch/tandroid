package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h30 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i30 b;

    public /* synthetic */ h30(i30 i30Var, int i3) {
        this.a = i3;
        this.b = i30Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i30 i30Var = this.b;
                org.telegram.ui.Components.voip.r0 r0Var = i30Var.b;
                if (r0Var != null) {
                    r0Var.setVisibility(0);
                }
                org.telegram.messenger.g0.i3(new h30(i30Var, 2), 16L);
                break;
            case 1:
                org.telegram.ui.Components.voip.r0 r0Var2 = this.b.b;
                if (r0Var2 != null) {
                    r0Var2.setVisibility(4);
                    break;
                }
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
