package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ad0 implements org.telegram.ui.Components.vw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.r2 b;

    public /* synthetic */ ad0(int i10, org.telegram.ui.ActionBar.r2 r2Var) {
        this.a = i10;
        this.b = r2Var;
    }

    @Override // org.telegram.ui.Components.vw0
    public final void I(int i10, boolean z10) {
        wf0 wf0Var;
        il0 il0Var;
        switch (this.a) {
            case 0:
                ig0 ig0Var = (ig0) this.b;
                if (i10 > AndroidUtilities.dp(20.0f) && ig0Var.m1()) {
                    AndroidUtilities.hideKeyboard(ig0Var.fragmentView);
                }
                if (i10 <= AndroidUtilities.dp(20.0f) && (wf0Var = ig0Var.T) != null) {
                    wf0Var.run();
                    ig0Var.T = null;
                    break;
                }
                break;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                if (i10 >= AndroidUtilities.dp(20.0f) && (il0Var = passcodeActivity.T) != null) {
                    il0Var.run();
                    passcodeActivity.T = null;
                    break;
                }
                break;
        }
    }
}
