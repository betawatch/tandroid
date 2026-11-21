package org.telegram.ui.Wallet;

import org.telegram.messenger.x10;
import org.telegram.ui.PasscodeActivity;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class f0 extends PasscodeActivity {
    public final /* synthetic */ boolean[] X;
    public final /* synthetic */ x10 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(boolean[] zArr, x10 x10Var) {
        super(3);
        this.X = zArr;
        this.Y = x10Var;
    }

    @Override // org.telegram.ui.PasscodeActivity, org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        x10 x10Var;
        super.onFragmentDestroy();
        if (this.X[0] || (x10Var = this.Y) == null) {
            return;
        }
        x10Var.a("PASSCODE_FAILED");
    }
}
