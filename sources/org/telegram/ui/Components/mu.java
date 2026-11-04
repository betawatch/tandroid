package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mu implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nu b;

    public /* synthetic */ mu(nu nuVar, int i3) {
        this.a = i3;
        this.b = nuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        nu nuVar = this.b;
        switch (i3) {
            case 0:
                nuVar.f.dismiss();
                break;
            default:
                pu puVar = nuVar.f;
                puVar.dismiss();
                org.telegram.ui.ActionBar.d2 d2Var = puVar.k1;
                if (d2Var != null && d2Var.getParentActivity() != null) {
                    org.telegram.messenger.k5.p(null, 2131754435, fc.a0(d2Var), null);
                    break;
                }
                break;
        }
    }
}
