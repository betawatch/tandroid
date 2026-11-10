package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bb0 implements org.telegram.ui.Components.rt0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 b;

    public /* synthetic */ bb0(int i7, org.telegram.ui.ActionBar.f2 f2Var) {
        this.a = i7;
        this.b = f2Var;
    }

    @Override // org.telegram.ui.Components.rt0
    public final void K(int i7, boolean z9) {
        td0 td0Var;
        hi0 hi0Var;
        switch (this.a) {
            case 0:
                fe0 fe0Var = (fe0) this.b;
                if (i7 > org.telegram.messenger.g0.L(20.0f) && fe0Var.z1()) {
                    org.telegram.messenger.g0.v1(fe0Var.fragmentView);
                }
                if (i7 <= org.telegram.messenger.g0.L(20.0f) && (td0Var = fe0Var.T) != null) {
                    td0Var.run();
                    fe0Var.T = null;
                    break;
                }
                break;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                if (i7 >= org.telegram.messenger.g0.L(20.0f) && (hi0Var = passcodeActivity.T) != null) {
                    hi0Var.run();
                    passcodeActivity.T = null;
                    break;
                }
                break;
        }
    }
}
