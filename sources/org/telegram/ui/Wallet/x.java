package org.telegram.ui.Wallet;

import org.telegram.messenger.r20;
import org.telegram.ui.PasscodeActivity;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class x extends PasscodeActivity {
    public final /* synthetic */ boolean[] W;
    public final /* synthetic */ r20 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(boolean[] zArr, r20 r20Var) {
        super(3);
        this.W = zArr;
        this.X = r20Var;
    }

    @Override // org.telegram.ui.PasscodeActivity, org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        r20 r20Var;
        super.onFragmentDestroy();
        if (this.W[0] || (r20Var = this.X) == null) {
            return;
        }
        r20Var.a("PASSCODE_FAILED");
    }
}
