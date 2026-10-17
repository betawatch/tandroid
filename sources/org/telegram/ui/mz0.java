package org.telegram.ui;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mz0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nz0 b;

    public /* synthetic */ mz0(nz0 nz0Var, int i10) {
        this.a = i10;
        this.b = nz0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = this.b.D0;
                az0 az0Var = profileActivity.D5;
                if (az0Var != null) {
                    az0Var.dismiss();
                    profileActivity.D5 = null;
                    break;
                }
                break;
            default:
                try {
                    org.telegram.ui.Components.im0 currentListView = this.b.x0.O.getCurrentListView();
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
