package lh;

import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;
    public final /* synthetic */ TwoStepVerificationActivity c;

    public /* synthetic */ e(q qVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.a = i10;
        this.b = qVar;
        this.c = twoStepVerificationActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                q qVar = this.b;
                qVar.V.setLoading(false);
                qVar.presentFragment(this.c);
                break;
            default:
                q qVar2 = this.b;
                qVar2.O.setLoading(false);
                qVar2.presentFragment(this.c);
                break;
        }
    }
}
