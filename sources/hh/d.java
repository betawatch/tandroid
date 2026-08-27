package hh;

import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;
    public final /* synthetic */ TwoStepVerificationActivity c;

    public /* synthetic */ d(r rVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.a = i10;
        this.b = rVar;
        this.c = twoStepVerificationActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r rVar = this.b;
                rVar.U.setLoading(false);
                rVar.presentFragment(this.c);
                break;
            default:
                r rVar2 = this.b;
                rVar2.N.setLoading(false);
                rVar2.presentFragment(this.c);
                break;
        }
    }
}
