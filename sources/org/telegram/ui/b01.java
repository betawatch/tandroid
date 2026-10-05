package org.telegram.ui;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b01 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c01 b;

    public /* synthetic */ b01(c01 c01Var, int i10) {
        this.a = i10;
        this.b = c01Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = this.b.D0;
                pz0 pz0Var = profileActivity.B5;
                if (pz0Var != null) {
                    pz0Var.dismiss();
                    profileActivity.B5 = null;
                    break;
                }
                break;
            default:
                try {
                    org.telegram.ui.Components.zl0 currentListView = this.b.x0.O.getCurrentListView();
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
