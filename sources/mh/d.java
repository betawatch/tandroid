package mh;

import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;
    public final /* synthetic */ TwoStepVerificationActivity c;

    public /* synthetic */ d(p pVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.a = i10;
        this.b = pVar;
        this.c = twoStepVerificationActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p pVar = this.b;
                pVar.V.setLoading(false);
                pVar.presentFragment(this.c);
                break;
            default:
                p pVar2 = this.b;
                pVar2.O.setLoading(false);
                pVar2.presentFragment(this.c);
                break;
        }
    }
}
