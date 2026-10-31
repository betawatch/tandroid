package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class fx0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gx0 b;

    public /* synthetic */ fx0(gx0 gx0Var, int i10) {
        this.a = i10;
        this.b = gx0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = this.b.m0;
                rw0 rw0Var = profileActivity.M5;
                if (rw0Var != null) {
                    rw0Var.dismiss();
                    profileActivity.M5 = null;
                    break;
                }
                break;
            default:
                try {
                    org.telegram.ui.Components.tk0 currentListView = this.b.g0.N.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().f();
                        break;
                    }
                } catch (Throwable unused) {
                    return;
                }
                break;
        }
    }
}
