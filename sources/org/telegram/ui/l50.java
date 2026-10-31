package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class l50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v50 b;

    public /* synthetic */ l50(v50 v50Var, int i10) {
        this.a = i10;
        this.b = v50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                v50 v50Var = this.b;
                v50Var.m0();
                v50Var.i0();
                break;
            case 2:
                v50 v50Var2 = this.b;
                v50Var2.getClass();
                v50Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                break;
            default:
                v50 v50Var3 = this.b;
                v50Var3.n.postOnAnimation(new l50(v50Var3, 1));
                break;
        }
    }
}
