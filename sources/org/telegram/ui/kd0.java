package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kd0 implements org.telegram.ui.Components.ov0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 b;

    public /* synthetic */ kd0(int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        this.a = i10;
        this.b = p2Var;
    }

    @Override // org.telegram.ui.Components.ov0
    public final void G(int i10, boolean z4) {
        dg0 dg0Var;
        bl0 bl0Var;
        switch (this.a) {
            case 0:
                og0 og0Var = (og0) this.b;
                if (i10 > AndroidUtilities.dp(20.0f) && og0Var.h1()) {
                    AndroidUtilities.hideKeyboard(og0Var.fragmentView);
                }
                if (i10 <= AndroidUtilities.dp(20.0f) && (dg0Var = og0Var.Q) != null) {
                    dg0Var.run();
                    og0Var.Q = null;
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
