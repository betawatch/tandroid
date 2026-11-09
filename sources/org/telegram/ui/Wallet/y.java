package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.ui.PasscodeActivity;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class y extends PasscodeActivity {
    public final /* synthetic */ boolean[] W;
    public final /* synthetic */ c20 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(boolean[] zArr, c20 c20Var) {
        super(3);
        this.W = zArr;
        this.X = c20Var;
    }

    @Override // org.telegram.ui.PasscodeActivity, org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        c20 c20Var;
        super.onFragmentDestroy();
        if (this.W[0] || (c20Var = this.X) == null) {
            return;
        }
        c20Var.a("PASSCODE_FAILED");
    }
}
