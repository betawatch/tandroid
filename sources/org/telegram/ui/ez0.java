package org.telegram.ui;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ez0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fz0 b;

    public /* synthetic */ ez0(fz0 fz0Var, int i10) {
        this.a = i10;
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
                    org.telegram.ui.Components.jl0 currentListView = this.b.t0.K.getCurrentListView();
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
