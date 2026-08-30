package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class md0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ze0 b;

    public /* synthetic */ md0(ze0 ze0Var, int i10) {
        this.a = i10;
        this.b = ze0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.I.n();
                break;
            case 1:
                ze0 ze0Var = this.b;
                ze0Var.J = null;
                ze0Var.K = null;
                ze0Var.p(true);
                ze0Var.e.h(null, null, ze0Var.f, null);
                kd kdVar = ze0Var.n;
                org.telegram.ui.Components.gj0 gj0Var = ze0Var.F;
                kdVar.setAnimation(gj0Var);
                gj0Var.K(0);
                ze0Var.H = true;
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
