package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cd0 implements org.telegram.ui.Components.yu0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 b;

    public /* synthetic */ cd0(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.a = i10;
        this.b = n2Var;
    }

    @Override // org.telegram.ui.Components.yu0
    public final void H(int i10, boolean z10) {
        xf0 xf0Var;
        vk0 vk0Var;
        switch (this.a) {
            case 0:
                ig0 ig0Var = (ig0) this.b;
                if (i10 > AndroidUtilities.dp(20.0f) && ig0Var.h1()) {
                    AndroidUtilities.hideKeyboard(ig0Var.fragmentView);
                }
                if (i10 <= AndroidUtilities.dp(20.0f) && (xf0Var = ig0Var.P) != null) {
                    xf0Var.run();
                    ig0Var.P = null;
                    break;
                }
                break;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                if (i10 >= AndroidUtilities.dp(20.0f) && (vk0Var = passcodeActivity.L) != null) {
                    vk0Var.run();
                    passcodeActivity.L = null;
                    break;
                }
                break;
        }
    }
}
