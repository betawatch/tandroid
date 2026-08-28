package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fe b;
    public final /* synthetic */ s91 c;
    public final /* synthetic */ TwoStepVerificationActivity d;

    public /* synthetic */ pd(fe feVar, s91 s91Var, TwoStepVerificationActivity twoStepVerificationActivity, int i9) {
        this.a = i9;
        this.b = feVar;
        this.c = s91Var;
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
