package org.telegram.ui;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class i01 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j01 b;

    public /* synthetic */ i01(j01 j01Var, int i10) {
        this.a = i10;
        this.b = j01Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = this.b.D0;
                vz0 vz0Var = profileActivity.B5;
                if (vz0Var != null) {
                    vz0Var.dismiss();
                    profileActivity.B5 = null;
                    break;
                }
                break;
            default:
                try {
                    org.telegram.ui.Components.yl0 currentListView = this.b.x0.O.getCurrentListView();
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
