package bi;

import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z b;
    public final /* synthetic */ TwoStepVerificationActivity c;

    public /* synthetic */ h(z zVar, TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.a = i7;
        this.b = zVar;
        this.c = twoStepVerificationActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z zVar = this.b;
                zVar.h0.setLoading(false);
                zVar.presentFragment(this.c);
                break;
            default:
                z zVar2 = this.b;
                zVar2.a0.setLoading(false);
                zVar2.presentFragment(this.c);
                break;
        }
    }
}
