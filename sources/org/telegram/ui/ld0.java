package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ld0 implements org.telegram.ui.Components.zv0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.m2 b;

    public /* synthetic */ ld0(int i10, org.telegram.ui.ActionBar.m2 m2Var) {
        this.a = i10;
        this.b = m2Var;
    }

    @Override // org.telegram.ui.Components.zv0
    public final void H(int i10, boolean z10) {
        fg0 fg0Var;
        el0 el0Var;
        switch (this.a) {
            case 0:
                qg0 qg0Var = (qg0) this.b;
                if (i10 > AndroidUtilities.dp(20.0f) && qg0Var.h1()) {
                    AndroidUtilities.hideKeyboard(qg0Var.fragmentView);
                }
                if (i10 <= AndroidUtilities.dp(20.0f) && (fg0Var = qg0Var.T) != null) {
                    fg0Var.run();
                    qg0Var.T = null;
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
