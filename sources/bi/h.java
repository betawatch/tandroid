package bi;

import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y b;
    public final /* synthetic */ TwoStepVerificationActivity c;

    public /* synthetic */ h(y yVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.a = i10;
        this.b = yVar;
        this.c = twoStepVerificationActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                y yVar = this.b;
                yVar.h0.setLoading(false);
                yVar.presentFragment(this.c);
                break;
            default:
                y yVar2 = this.b;
                yVar2.a0.setLoading(false);
                yVar2.presentFragment(this.c);
                break;
        }
    }
}
