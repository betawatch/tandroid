package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bd0 implements org.telegram.ui.Components.nw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 b;

    public /* synthetic */ bd0(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.a = i10;
        this.b = o2Var;
    }

    @Override // org.telegram.ui.Components.nw0
    public final void G(int i10, boolean z10) {
        xf0 xf0Var;
        al0 al0Var;
        switch (this.a) {
            case 0:
                ig0 ig0Var = (ig0) this.b;
                if (i10 > AndroidUtilities.dp(20.0f) && ig0Var.l1()) {
                    AndroidUtilities.hideKeyboard(ig0Var.fragmentView);
                }
                if (i10 <= AndroidUtilities.dp(20.0f) && (xf0Var = ig0Var.T) != null) {
                    xf0Var.run();
                    ig0Var.T = null;
                    break;
                }
                break;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                if (i10 >= AndroidUtilities.dp(20.0f) && (al0Var = passcodeActivity.T) != null) {
                    al0Var.run();
                    passcodeActivity.T = null;
                    break;
                }
                break;
        }
    }
}
