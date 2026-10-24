package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.ui.PasscodeActivity;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class y extends PasscodeActivity {
    public final /* synthetic */ boolean[] W;
    public final /* synthetic */ Utilities.Callback X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(boolean[] zArr, Utilities.Callback callback) {
        super(3);
        this.W = zArr;
        this.X = callback;
    }

    @Override // org.telegram.ui.PasscodeActivity, org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        Utilities.Callback callback;
        super.onFragmentDestroy();
        if (this.W[0] || (callback = this.X) == null) {
            return;
        }
        callback.run("PASSCODE_FAILED");
    }
}
