package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class kc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wd0 b;

    public /* synthetic */ kc0(wd0 wd0Var, int i10) {
        this.a = i10;
        this.b = wd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.L.m();
                break;
            case 1:
                wd0 wd0Var = this.b;
                wd0Var.M = null;
                wd0Var.N = null;
                wd0Var.o(true);
                wd0Var.e.j(null, null, wd0Var.f, null);
                hd hdVar = wd0Var.n;
                org.telegram.ui.Components.bi0 bi0Var = wd0Var.I;
                hdVar.setAnimation(bi0Var);
                bi0Var.M(0);
                wd0Var.K = true;
                break;
            case 2:
                this.b.K = true;
                break;
            default:
                EditTextBoldCursor editTextBoldCursor = this.b.c;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    org.telegram.messenger.i0.J3(editTextBoldCursor);
                    break;
                }
                break;
        }
    }
}
