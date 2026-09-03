package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class el0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ org.telegram.ui.ActionBar.g1 a;
    public final /* synthetic */ PasscodeActivity b;

    public el0(PasscodeActivity passcodeActivity, org.telegram.ui.ActionBar.g1 g1Var) {
        this.b = passcodeActivity;
        this.a = g1Var;
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
            AndroidUtilities.runOnUIThread(new ie0(17, this, this.a), 150L);
            passcodeActivity.h.setText("");
            for (ds dsVar : passcodeActivity.n.f) {
                dsVar.setText("");
            }
            passcodeActivity.l0();
        }
    }
}
