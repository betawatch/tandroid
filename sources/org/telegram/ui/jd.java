package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zd b;
    public final /* synthetic */ e51 c;
    public final /* synthetic */ TwoStepVerificationActivity d;

    public /* synthetic */ jd(zd zdVar, e51 e51Var, TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.a = i7;
        this.b = zdVar;
        this.c = e51Var;
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
