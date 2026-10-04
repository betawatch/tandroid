package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class pd0 implements org.telegram.ui.Components.kw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 b;

    public /* synthetic */ pd0(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.a = i10;
        this.b = n2Var;
    }

    @Override // org.telegram.ui.Components.kw0
    public final void F(int i10, boolean z10) {
        jg0 jg0Var;
        il0 il0Var;
        switch (this.a) {
            case 0:
                ug0 ug0Var = (ug0) this.b;
                if (i10 > AndroidUtilities.dp(20.0f) && ug0Var.h1()) {
                    AndroidUtilities.hideKeyboard(ug0Var.fragmentView);
                }
                if (i10 <= AndroidUtilities.dp(20.0f) && (jg0Var = ug0Var.T) != null) {
                    jg0Var.run();
                    ug0Var.T = null;
                    break;
                }
                break;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                if (i10 >= AndroidUtilities.dp(20.0f) && (il0Var = passcodeActivity.P) != null) {
                    il0Var.run();
                    passcodeActivity.P = null;
                    break;
                }
                break;
        }
    }
}
