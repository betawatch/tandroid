package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class fa0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ma0 b;

    public /* synthetic */ fa0(ma0 ma0Var, int i10) {
        this.a = i10;
        this.b = ma0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        ma0 ma0Var = this.b;
        switch (i10) {
            case 0:
                gf.f.r(ma0Var.getParentActivity(), org.telegram.messenger.cd.L0(2131746173, null));
                break;
            case 1:
                ma0Var.r.d.requestFocus();
                org.telegram.messenger.i0.J3(ma0Var.r.d);
                break;
            default:
                ma0Var.r.d.clearFocus();
                org.telegram.messenger.i0.v1(ma0Var.r.d);
                break;
        }
    }
}
