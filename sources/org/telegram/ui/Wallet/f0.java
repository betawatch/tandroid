package org.telegram.ui.Wallet;

import org.telegram.messenger.y10;
import org.telegram.ui.PasscodeActivity;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class f0 extends PasscodeActivity {
    public final /* synthetic */ boolean[] X;
    public final /* synthetic */ y10 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(boolean[] zArr, y10 y10Var) {
        super(3);
        this.X = zArr;
        this.Y = y10Var;
    }

    @Override // org.telegram.ui.PasscodeActivity, org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        y10 y10Var;
        super.onFragmentDestroy();
        if (this.X[0] || (y10Var = this.Y) == null) {
            return;
        }
        y10Var.a("PASSCODE_FAILED");
    }
}
