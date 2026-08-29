package org.telegram.ui;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class od implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ de b;
    public final /* synthetic */ t91 c;
    public final /* synthetic */ TwoStepVerificationActivity d;

    public /* synthetic */ od(de deVar, t91 t91Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.a = i10;
        this.b = deVar;
        this.c = t91Var;
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
