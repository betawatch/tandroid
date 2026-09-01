package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ af0 b;

    public /* synthetic */ nd0(af0 af0Var, int i10) {
        this.a = i10;
        this.b = af0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.I.n();
                break;
            case 1:
                af0 af0Var = this.b;
                af0Var.J = null;
                af0Var.K = null;
                af0Var.p(true);
                af0Var.e.h(null, null, af0Var.f, null);
                kd kdVar = af0Var.n;
                org.telegram.ui.Components.ij0 ij0Var = af0Var.F;
                kdVar.setAnimation(ij0Var);
                ij0Var.K(0);
                af0Var.H = true;
                break;
            case 2:
                this.b.H = true;
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
