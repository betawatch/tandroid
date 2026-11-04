package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class id implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xd b;
    public final /* synthetic */ r41 c;
    public final /* synthetic */ TwoStepVerificationActivity d;

    public /* synthetic */ id(xd xdVar, r41 r41Var, TwoStepVerificationActivity twoStepVerificationActivity, int i3) {
        this.a = i3;
        this.b = xdVar;
        this.c = r41Var;
        this.d = twoStepVerificationActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.B0.setLoading(false);
                this.c.presentFragment(this.d);
                break;
            case 1:
                this.b.H0.setLoading(false);
                this.c.presentFragment(this.d);
                break;
            default:
                this.b.H0.setLoading(false);
                this.c.presentFragment(this.d);
                break;
        }
    }
}
