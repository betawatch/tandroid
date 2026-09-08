package org.telegram.ui;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class j01 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k01 b;

    public /* synthetic */ j01(k01 k01Var, int i10) {
        this.a = i10;
        this.b = k01Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = this.b.D0;
                wz0 wz0Var = profileActivity.B5;
                if (wz0Var != null) {
                    wz0Var.dismiss();
                    profileActivity.B5 = null;
                    break;
                }
                break;
            default:
                try {
                    org.telegram.ui.Components.ll0 currentListView = this.b.x0.O.getCurrentListView();
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
