package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.ui.PasscodeActivity;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final class a0 extends PasscodeActivity {
    public final /* synthetic */ boolean[] W;
    public final /* synthetic */ c20 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(boolean[] zArr, c20 c20Var) {
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
