package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kv0 b;

    public /* synthetic */ jv0(kv0 kv0Var, int i3) {
        this.a = i3;
        this.b = kv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = this.b.n0;
                yu0 yu0Var = profileActivity.O5;
                if (yu0Var != null) {
                    yu0Var.dismiss();
                    profileActivity.O5 = null;
                    break;
                }
                break;
            default:
                try {
                    org.telegram.ui.Components.tj0 currentListView = this.b.h0.O.getCurrentListView();
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
