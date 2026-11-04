package org.telegram.ui.Wallet;

import org.telegram.messenger.u10;
import org.telegram.ui.PasscodeActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class x extends PasscodeActivity {
    public final /* synthetic */ boolean[] X;
    public final /* synthetic */ u10 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(boolean[] zArr, u10 u10Var) {
        super(3);
        this.X = zArr;
        this.Y = u10Var;
    }

    @Override // org.telegram.ui.PasscodeActivity, org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        u10 u10Var;
        super.onFragmentDestroy();
        if (this.X[0] || (u10Var = this.Y) == null) {
            return;
        }
        u10Var.a("PASSCODE_FAILED");
    }
}
