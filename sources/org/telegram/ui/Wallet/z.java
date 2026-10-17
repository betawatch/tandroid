package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.ui.PasscodeActivity;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class z extends PasscodeActivity {
    public final /* synthetic */ boolean[] W;
    public final /* synthetic */ Utilities.Callback X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(boolean[] zArr, Utilities.Callback callback) {
        super(3);
        this.W = zArr;
        this.X = callback;
    }

    @Override // org.telegram.ui.PasscodeActivity, org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        Utilities.Callback callback;
        super.onFragmentDestroy();
        if (this.W[0] || (callback = this.X) == null) {
            return;
        }
        callback.run("PASSCODE_FAILED");
    }
}
