package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class hc0 implements org.telegram.ui.Components.tu0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 b;

    public /* synthetic */ hc0(int i10, org.telegram.ui.ActionBar.k2 k2Var) {
        this.a = i10;
        this.b = k2Var;
    }

    @Override // org.telegram.ui.Components.tu0
    public final void K(int i10, boolean z10) {
        xe0 xe0Var;
        mj0 mj0Var;
        switch (this.a) {
            case 0:
                hf0 hf0Var = (hf0) this.b;
                if (i10 > org.telegram.messenger.i0.L(20.0f) && hf0Var.p1()) {
                    org.telegram.messenger.i0.v1(hf0Var.fragmentView);
                }
                if (i10 <= org.telegram.messenger.i0.L(20.0f) && (xe0Var = hf0Var.T) != null) {
                    xe0Var.run();
                    hf0Var.T = null;
                    break;
                }
                break;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                if (i10 >= org.telegram.messenger.i0.L(20.0f) && (mj0Var = passcodeActivity.T) != null) {
                    mj0Var.run();
                    passcodeActivity.T = null;
                    break;
                }
                break;
        }
    }
}
