package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.ui.PasscodeActivity;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
