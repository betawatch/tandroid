package mh;

import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
