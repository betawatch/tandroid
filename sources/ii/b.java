package ii;

import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h2 b;
    public final /* synthetic */ TwoStepVerificationActivity c;

    public /* synthetic */ b(h2 h2Var, TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.a = i7;
        this.b = h2Var;
        this.c = twoStepVerificationActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.presentFragment(this.c);
                break;
            default:
                f2 f2Var = new f2();
                f2Var.a = true;
                this.b.showAsSheet(this.c, f2Var);
                break;
        }
    }
}
