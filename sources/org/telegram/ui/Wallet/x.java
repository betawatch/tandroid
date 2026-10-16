package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.ui.PasscodeActivity;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class x extends PasscodeActivity {
    public final /* synthetic */ boolean[] W;
    public final /* synthetic */ Utilities.Callback X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(boolean[] zArr, Utilities.Callback callback) {
        super(3);
        this.W = zArr;
        this.X = callback;
    }

    @Override // org.telegram.ui.PasscodeActivity, org.telegram.ui.ActionBar.m2
    public final void onFragmentDestroy() {
        Utilities.Callback callback;
        super.onFragmentDestroy();
        if (this.W[0] || (callback = this.X) == null) {
            return;
        }
        callback.run("PASSCODE_FAILED");
    }
}
