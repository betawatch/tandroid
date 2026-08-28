package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ez0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fz0 b;

    public /* synthetic */ ez0(fz0 fz0Var, int i9) {
        this.a = i9;
        this.b = fz0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = this.b.z0;
                sy0 sy0Var = profileActivity.x5;
                if (sy0Var != null) {
                    sy0Var.dismiss();
                    profileActivity.x5 = null;
                    break;
                }
                break;
            default:
                try {
                    org.telegram.ui.Components.wk0 currentListView = this.b.t0.K.getCurrentListView();
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
