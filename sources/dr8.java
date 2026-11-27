// default package

import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class dr8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ er8 b;

    public /* synthetic */ dr8(er8 er8Var, byte b) {
        this.a = b;
        this.b = er8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        er8 er8Var = this.b;
        switch (b) {
            case 0:
                ProfileActivity profileActivity = er8Var.n0;
                rq8 rq8Var = profileActivity.T5;
                if (rq8Var != null) {
                    rq8Var.dismiss();
                    profileActivity.T5 = null;
                    break;
                }
                break;
            default:
                try {
                    d79 currentListView = er8Var.h0.O.getCurrentListView();
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
