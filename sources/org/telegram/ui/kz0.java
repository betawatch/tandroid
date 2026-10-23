package org.telegram.ui;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kz0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lz0 b;

    public /* synthetic */ kz0(lz0 lz0Var, int i10) {
        this.a = i10;
        this.b = lz0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = this.b.D0;
                yy0 yy0Var = profileActivity.D5;
                if (yy0Var != null) {
                    yy0Var.dismiss();
                    profileActivity.D5 = null;
                    break;
                }
                break;
            default:
                try {
                    org.telegram.ui.Components.jm0 currentListView = this.b.x0.O.getCurrentListView();
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
