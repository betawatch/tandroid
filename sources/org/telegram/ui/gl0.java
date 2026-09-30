package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class gl0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ org.telegram.ui.ActionBar.e1 a;
    public final /* synthetic */ PasscodeActivity b;

    public gl0(PasscodeActivity passcodeActivity, org.telegram.ui.ActionBar.e1 e1Var) {
        this.b = passcodeActivity;
        this.a = e1Var;
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
            AndroidUtilities.runOnUIThread(new xi0(6, this, this.a), 150L);
            passcodeActivity.h.setText("");
            for (as asVar : passcodeActivity.n.f) {
                asVar.setText("");
            }
            passcodeActivity.l0();
        }
    }
}
