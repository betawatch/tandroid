package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ed0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ue0 b;

    public /* synthetic */ ed0(ue0 ue0Var, int i10) {
        this.a = i10;
        this.b = ue0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.L.m();
                break;
            case 1:
                ue0 ue0Var = this.b;
                ue0Var.M = null;
                ue0Var.N = null;
                ue0Var.o(true);
                ue0Var.e.h(null, null, ue0Var.f, null);
                jd jdVar = ue0Var.n;
                org.telegram.ui.Components.yj0 yj0Var = ue0Var.I;
                jdVar.setAnimation(yj0Var);
                yj0Var.M(0);
                ue0Var.K = true;
                break;
            case 2:
                this.b.K = true;
                break;
            default:
                EditTextBoldCursor editTextBoldCursor = this.b.c;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    break;
                }
                break;
        }
    }
}
