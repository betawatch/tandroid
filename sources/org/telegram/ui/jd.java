package org.telegram.ui;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zd b;
    public final /* synthetic */ c51 c;
    public final /* synthetic */ TwoStepVerificationActivity d;

    public /* synthetic */ jd(zd zdVar, c51 c51Var, TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.a = i7;
        this.b = zdVar;
        this.c = c51Var;
        this.d = twoStepVerificationActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.A0.setLoading(false);
                this.c.presentFragment(this.d);
                break;
            case 1:
                this.b.G0.setLoading(false);
                this.c.presentFragment(this.d);
                break;
            default:
                this.b.G0.setLoading(false);
                this.c.presentFragment(this.d);
                break;
        }
    }
}
