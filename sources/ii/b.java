package ii;

import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g2 b;
    public final /* synthetic */ TwoStepVerificationActivity c;

    public /* synthetic */ b(g2 g2Var, TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.a = i7;
        this.b = g2Var;
        this.c = twoStepVerificationActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.presentFragment(this.c);
                break;
            default:
                e2 e2Var = new e2();
                e2Var.a = true;
                this.b.showAsSheet(this.c, e2Var);
                break;
        }
    }
}
