package ai;

import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x b;
    public final /* synthetic */ TwoStepVerificationActivity c;

    public /* synthetic */ e(x xVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.a = i10;
        this.b = xVar;
        this.c = twoStepVerificationActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x xVar = this.b;
                xVar.Y.setLoading(false);
                xVar.presentFragment(this.c);
                break;
            default:
                x xVar2 = this.b;
                xVar2.R.setLoading(false);
                xVar2.presentFragment(this.c);
                break;
        }
    }
}
