package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class md0 implements org.telegram.ui.Components.ov0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 b;

    public /* synthetic */ md0(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.a = i10;
        this.b = n2Var;
    }

    @Override // org.telegram.ui.Components.ov0
    public final void H(int i10, boolean z10) {
        gg0 gg0Var;
        el0 el0Var;
        switch (this.a) {
            case 0:
                rg0 rg0Var = (rg0) this.b;
                if (i10 > AndroidUtilities.dp(20.0f) && rg0Var.h1()) {
                    AndroidUtilities.hideKeyboard(rg0Var.fragmentView);
                }
                if (i10 <= AndroidUtilities.dp(20.0f) && (gg0Var = rg0Var.T) != null) {
                    gg0Var.run();
                    rg0Var.T = null;
                    break;
                }
                break;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                if (i10 >= AndroidUtilities.dp(20.0f) && (el0Var = passcodeActivity.P) != null) {
                    el0Var.run();
                    passcodeActivity.P = null;
                    break;
                }
                break;
        }
    }
}
