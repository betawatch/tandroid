package org.telegram.ui.Wallet;

import org.telegram.messenger.z10;
import org.telegram.ui.PasscodeActivity;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class y extends PasscodeActivity {
    public final /* synthetic */ boolean[] X;
    public final /* synthetic */ z10 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(boolean[] zArr, z10 z10Var) {
        super(3);
        this.X = zArr;
        this.Y = z10Var;
    }

    @Override // org.telegram.ui.PasscodeActivity, org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        z10 z10Var;
        super.onFragmentDestroy();
        if (this.X[0] || (z10Var = this.Y) == null) {
            return;
        }
        z10Var.a("PASSCODE_FAILED");
    }
}
