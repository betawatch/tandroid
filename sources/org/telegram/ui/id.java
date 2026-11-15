package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class id implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xd b;
    public final /* synthetic */ z41 c;
    public final /* synthetic */ TwoStepVerificationActivity d;

    public /* synthetic */ id(xd xdVar, z41 z41Var, TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.a = i7;
        this.b = xdVar;
        this.c = z41Var;
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
