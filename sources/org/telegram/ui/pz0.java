package org.telegram.ui;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pz0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qz0 b;

    public /* synthetic */ pz0(qz0 qz0Var, int i10) {
        this.a = i10;
        this.b = qz0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = this.b.A0;
                dz0 dz0Var = profileActivity.y5;
                if (dz0Var != null) {
                    dz0Var.dismiss();
                    profileActivity.y5 = null;
                    break;
                }
                break;
            default:
                try {
                    org.telegram.ui.Components.sl0 currentListView = this.b.u0.L.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        break;
                    }
                } catch (Throwable unused) {
                    return;
                }
                break;
        }
    }
}
