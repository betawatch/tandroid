// default package

import org.telegram.ui.ActionBar.d;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lz4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d b;
    public final /* synthetic */ TwoStepVerificationActivity c;

    public /* synthetic */ lz4(d dVar, TwoStepVerificationActivity twoStepVerificationActivity, byte b) {
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
                ag0 ag0Var = new ag0();
                ag0Var.a = true;
                dVar.showAsSheet(twoStepVerificationActivity, ag0Var);
                break;
        }
    }
}
