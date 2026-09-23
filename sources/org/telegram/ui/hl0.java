package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class hl0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ org.telegram.ui.ActionBar.f1 a;
    public final /* synthetic */ PasscodeActivity b;

    public hl0(PasscodeActivity passcodeActivity, org.telegram.ui.ActionBar.f1 f1Var) {
        this.b = passcodeActivity;
        this.a = f1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        PasscodeActivity passcodeActivity = this.b;
        if (i10 == -1) {
            passcodeActivity.finishFragment();
            return;
        }
        if (i10 == 1) {
            passcodeActivity.y = passcodeActivity.y != 0 ? 0 : 1;
            AndroidUtilities.runOnUIThread(new gl0(0, this, this.a), 150L);
            passcodeActivity.h.setText("");
            for (bs bsVar : passcodeActivity.n.f) {
                bsVar.setText("");
            }
            passcodeActivity.l0();
        }
    }
}
