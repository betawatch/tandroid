package jh;

import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;
    public final /* synthetic */ TwoStepVerificationActivity c;

    public /* synthetic */ d(q qVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.a = i10;
        this.b = qVar;
        this.c = twoStepVerificationActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                q qVar = this.b;
                qVar.U.setLoading(false);
                qVar.presentFragment(this.c);
                break;
            default:
                q qVar2 = this.b;
                qVar2.N.setLoading(false);
                qVar2.presentFragment(this.c);
                break;
        }
    }
}
