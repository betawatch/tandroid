package org.telegram.ui;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class oz0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pz0 b;

    public /* synthetic */ oz0(pz0 pz0Var, int i10) {
        this.a = i10;
        this.b = pz0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = this.b.D0;
                cz0 cz0Var = profileActivity.D5;
                if (cz0Var != null) {
                    cz0Var.dismiss();
                    profileActivity.D5 = null;
                    break;
                }
                break;
            default:
                try {
                    org.telegram.ui.Components.mm0 currentListView = this.b.x0.O.getCurrentListView();
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
