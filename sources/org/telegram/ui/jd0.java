package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jd0 implements org.telegram.ui.Components.pv0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 b;

    public /* synthetic */ jd0(int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        this.a = i10;
        this.b = p2Var;
    }

    @Override // org.telegram.ui.Components.pv0
    public final void G(int i10, boolean z4) {
        cg0 cg0Var;
        zk0 zk0Var;
        switch (this.a) {
            case 0:
                ng0 ng0Var = (ng0) this.b;
                if (i10 > AndroidUtilities.dp(20.0f) && ng0Var.h1()) {
                    AndroidUtilities.hideKeyboard(ng0Var.fragmentView);
                }
                if (i10 <= AndroidUtilities.dp(20.0f) && (cg0Var = ng0Var.Q) != null) {
                    cg0Var.run();
                    ng0Var.Q = null;
                    break;
                }
                break;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                if (i10 >= AndroidUtilities.dp(20.0f) && (zk0Var = passcodeActivity.M) != null) {
                    zk0Var.run();
                    passcodeActivity.M = null;
                    break;
                }
                break;
        }
    }
}
