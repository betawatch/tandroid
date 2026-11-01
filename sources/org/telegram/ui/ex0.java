package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ex0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fx0 b;

    public /* synthetic */ ex0(fx0 fx0Var, int i10) {
        this.a = i10;
        this.b = fx0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = this.b.m0;
                qw0 qw0Var = profileActivity.N5;
                if (qw0Var != null) {
                    qw0Var.dismiss();
                    profileActivity.N5 = null;
                    break;
                }
                break;
            default:
                try {
                    org.telegram.ui.Components.uk0 currentListView = this.b.g0.N.getCurrentListView();
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
