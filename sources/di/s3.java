package di;

import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class s3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.t1 b;

    public /* synthetic */ s3(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        this.a = i7;
        this.b = t1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        org.telegram.ui.ActionBar.t1 t1Var = this.b;
        switch (i7) {
            case 0:
                t1Var.dismiss();
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T != null) {
                    org.telegram.ui.Components.xb Q = org.telegram.ui.Components.cc.a0(T).Q(R.raw.error, 36, hd.M0(2131748552, null));
                    Q.t = true;
                    Q.j();
                    break;
                }
                break;
            case 1:
                t1Var.dismiss();
                break;
            case 2:
                t1Var.dismiss();
                break;
            default:
                if (!t1Var.isShowing()) {
                    try {
                        t1Var.show();
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
        }
    }
}
