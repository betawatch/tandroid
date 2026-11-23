package org.telegram.ui;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class id implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xd b;
    public final /* synthetic */ b51 c;
    public final /* synthetic */ TwoStepVerificationActivity d;

    public /* synthetic */ id(xd xdVar, b51 b51Var, TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.a = i7;
        this.b = xdVar;
        this.c = b51Var;
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
