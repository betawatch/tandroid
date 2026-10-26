package bi;

import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
