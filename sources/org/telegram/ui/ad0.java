package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ad0 implements org.telegram.ui.Components.gv0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 b;

    public /* synthetic */ ad0(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.a = i10;
        this.b = o2Var;
    }

    @Override // org.telegram.ui.Components.gv0
    public final void G(int i10, boolean z10) {
        uf0 uf0Var;
        rk0 rk0Var;
        switch (this.a) {
            case 0:
                fg0 fg0Var = (fg0) this.b;
                if (i10 > AndroidUtilities.dp(20.0f) && fg0Var.h1()) {
                    AndroidUtilities.hideKeyboard(fg0Var.fragmentView);
                }
                if (i10 <= AndroidUtilities.dp(20.0f) && (uf0Var = fg0Var.P) != null) {
                    uf0Var.run();
                    fg0Var.P = null;
                    break;
                }
                break;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                if (i10 >= AndroidUtilities.dp(20.0f) && (rk0Var = passcodeActivity.L) != null) {
                    rk0Var.run();
                    passcodeActivity.L = null;
                    break;
                }
                break;
        }
    }
}
