package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ te0 b;

    public /* synthetic */ dd0(te0 te0Var, int i10) {
        this.a = i10;
        this.b = te0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.L.m();
                break;
            case 1:
                te0 te0Var = this.b;
                te0Var.M = null;
                te0Var.N = null;
                te0Var.o(true);
                te0Var.e.h(null, null, te0Var.f, null);
                kd kdVar = te0Var.n;
                org.telegram.ui.Components.yj0 yj0Var = te0Var.I;
                kdVar.setAnimation(yj0Var);
                yj0Var.M(0);
                te0Var.K = true;
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
