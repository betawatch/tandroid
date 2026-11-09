package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ab0 implements org.telegram.ui.Components.st0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 b;

    public /* synthetic */ ab0(int i7, org.telegram.ui.ActionBar.f2 f2Var) {
        this.a = i7;
        this.b = f2Var;
    }

    @Override // org.telegram.ui.Components.st0
    public final void K(int i7, boolean z9) {
        sd0 sd0Var;
        gi0 gi0Var;
        switch (this.a) {
            case 0:
                ee0 ee0Var = (ee0) this.b;
                if (i7 > org.telegram.messenger.g0.L(20.0f) && ee0Var.z1()) {
                    org.telegram.messenger.g0.v1(ee0Var.fragmentView);
                }
                if (i7 <= org.telegram.messenger.g0.L(20.0f) && (sd0Var = ee0Var.T) != null) {
                    sd0Var.run();
                    ee0Var.T = null;
                    break;
                }
                break;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                if (i7 >= org.telegram.messenger.g0.L(20.0f) && (gi0Var = passcodeActivity.T) != null) {
                    gi0Var.run();
                    passcodeActivity.T = null;
                    break;
                }
                break;
        }
    }
}
