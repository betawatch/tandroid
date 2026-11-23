package org.telegram.ui;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class id implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xd b;
    public final /* synthetic */ c51 c;
    public final /* synthetic */ TwoStepVerificationActivity d;

    public /* synthetic */ id(xd xdVar, c51 c51Var, TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.a = i7;
        this.b = xdVar;
        this.c = c51Var;
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
