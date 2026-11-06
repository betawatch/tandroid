package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.ui.PasscodeActivity;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class a0 extends PasscodeActivity {
    public final /* synthetic */ boolean[] W;
    public final /* synthetic */ c20 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(boolean[] zArr, c20 c20Var) {
        super(3);
        this.W = zArr;
        this.X = c20Var;
    }

    @Override // org.telegram.ui.PasscodeActivity, org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        c20 c20Var;
        super.onFragmentDestroy();
        if (this.W[0] || (c20Var = this.X) == null) {
            return;
        }
        c20Var.a("PASSCODE_FAILED");
    }
}
