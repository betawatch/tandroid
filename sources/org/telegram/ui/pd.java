package org.telegram.ui;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fe b;
    public final /* synthetic */ q91 c;
    public final /* synthetic */ TwoStepVerificationActivity d;

    public /* synthetic */ pd(fe feVar, q91 q91Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.a = i10;
        this.b = feVar;
        this.c = q91Var;
        this.d = twoStepVerificationActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.G0.setLoading(false);
                this.c.presentFragment(this.d);
                break;
            case 1:
                this.b.M0.setLoading(false);
                this.c.presentFragment(this.d);
                break;
            default:
                this.b.M0.setLoading(false);
                this.c.presentFragment(this.d);
                break;
        }
    }
}
