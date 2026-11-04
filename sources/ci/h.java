package ci;

import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v b;
    public final /* synthetic */ TwoStepVerificationActivity c;

    public /* synthetic */ h(v vVar, TwoStepVerificationActivity twoStepVerificationActivity, int i3) {
        this.a = i3;
        this.b = vVar;
        this.c = twoStepVerificationActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v vVar = this.b;
                vVar.i0.setLoading(false);
                vVar.presentFragment(this.c);
                break;
            default:
                v vVar2 = this.b;
                vVar2.b0.setLoading(false);
                vVar2.presentFragment(this.c);
                break;
        }
    }
}
