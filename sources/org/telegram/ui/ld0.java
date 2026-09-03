package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ld0 implements org.telegram.ui.Components.pv0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 b;

    public /* synthetic */ ld0(int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        this.a = i10;
        this.b = p2Var;
    }

    @Override // org.telegram.ui.Components.pv0
    public final void G(int i10, boolean z4) {
        eg0 eg0Var;
        bl0 bl0Var;
        switch (this.a) {
            case 0:
                pg0 pg0Var = (pg0) this.b;
                if (i10 > AndroidUtilities.dp(20.0f) && pg0Var.h1()) {
                    AndroidUtilities.hideKeyboard(pg0Var.fragmentView);
                }
                if (i10 <= AndroidUtilities.dp(20.0f) && (eg0Var = pg0Var.Q) != null) {
                    eg0Var.run();
                    pg0Var.Q = null;
                    break;
                }
                break;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                if (i10 >= AndroidUtilities.dp(20.0f) && (bl0Var = passcodeActivity.M) != null) {
                    bl0Var.run();
                    passcodeActivity.M = null;
                    break;
                }
                break;
        }
    }
}
