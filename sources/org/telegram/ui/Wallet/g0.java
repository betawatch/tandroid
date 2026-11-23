package org.telegram.ui.Wallet;

import org.telegram.messenger.w10;
import org.telegram.ui.PasscodeActivity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class g0 extends PasscodeActivity {
    public final /* synthetic */ boolean[] X;
    public final /* synthetic */ w10 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(boolean[] zArr, w10 w10Var) {
        super(3);
        this.X = zArr;
        this.Y = w10Var;
    }

    @Override // org.telegram.ui.PasscodeActivity, org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        w10 w10Var;
        super.onFragmentDestroy();
        if (this.X[0] || (w10Var = this.Y) == null) {
            return;
        }
        w10Var.a("PASSCODE_FAILED");
    }
}
