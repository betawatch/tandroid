package org.telegram.ui;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                oz0 oz0Var = profileActivity.B5;
                if (oz0Var != null) {
                    oz0Var.dismiss();
                    profileActivity.B5 = null;
                    break;
                }
                break;
            default:
                try {
                    org.telegram.ui.Components.ml0 currentListView = this.b.x0.O.getCurrentListView();
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
