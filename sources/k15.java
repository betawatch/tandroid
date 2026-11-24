// default package

import org.telegram.ui.ActionBar.d;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class k15 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d b;
    public final /* synthetic */ TwoStepVerificationActivity c;

    public /* synthetic */ k15(d dVar, TwoStepVerificationActivity twoStepVerificationActivity, byte b) {
        this.a = b;
        this.b = dVar;
        this.c = twoStepVerificationActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.c;
        d dVar = this.b;
        switch (b) {
            case 0:
                dVar.presentFragment(twoStepVerificationActivity);
                break;
            default:
                bh0 bh0Var = new bh0();
                bh0Var.a = true;
                dVar.showAsSheet(twoStepVerificationActivity, bh0Var);
                break;
        }
    }
}
