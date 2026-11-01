package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gc0 implements org.telegram.ui.Components.uu0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 b;

    public /* synthetic */ gc0(int i10, org.telegram.ui.ActionBar.k2 k2Var) {
        this.a = i10;
        this.b = k2Var;
    }

    @Override // org.telegram.ui.Components.uu0
    public final void L(int i10, boolean z10) {
        we0 we0Var;
        kj0 kj0Var;
        switch (this.a) {
            case 0:
                gf0 gf0Var = (gf0) this.b;
                if (i10 > org.telegram.messenger.i0.L(20.0f) && gf0Var.q1()) {
                    org.telegram.messenger.i0.v1(gf0Var.fragmentView);
                }
                if (i10 <= org.telegram.messenger.i0.L(20.0f) && (we0Var = gf0Var.T) != null) {
                    we0Var.run();
                    gf0Var.T = null;
                    break;
                }
                break;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                if (i10 >= org.telegram.messenger.i0.L(20.0f) && (kj0Var = passcodeActivity.T) != null) {
                    kj0Var.run();
                    passcodeActivity.T = null;
                    break;
                }
                break;
        }
    }
}
