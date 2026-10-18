package org.telegram.ui;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
