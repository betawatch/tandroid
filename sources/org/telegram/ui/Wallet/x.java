package org.telegram.ui.Wallet;

import org.telegram.messenger.q20;
import org.telegram.ui.PasscodeActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x extends PasscodeActivity {
    public final /* synthetic */ boolean[] W;
    public final /* synthetic */ q20 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(boolean[] zArr, q20 q20Var) {
        super(3);
        this.W = zArr;
        this.X = q20Var;
    }

    @Override // org.telegram.ui.PasscodeActivity, org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        q20 q20Var;
        super.onFragmentDestroy();
        if (this.W[0] || (q20Var = this.X) == null) {
            return;
        }
        q20Var.a("PASSCODE_FAILED");
    }
}
