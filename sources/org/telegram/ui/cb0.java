package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class cb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pc0 b;

    public /* synthetic */ cb0(pc0 pc0Var, int i7) {
        this.a = i7;
        this.b = pc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.N.m();
                break;
            case 1:
                pc0 pc0Var = this.b;
                pc0Var.O = null;
                pc0Var.P = null;
                pc0Var.o(true);
                pc0Var.e.j(null, null, pc0Var.f, null);
                xc xcVar = pc0Var.n;
                org.telegram.ui.Components.oh0 oh0Var = pc0Var.K;
                xcVar.setAnimation(oh0Var);
                oh0Var.M(0);
                pc0Var.M = true;
                break;
            case 2:
                this.b.M = true;
                break;
            default:
                EditTextBoldCursor editTextBoldCursor = this.b.c;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    org.telegram.messenger.g0.I3(editTextBoldCursor);
                    break;
                }
                break;
        }
    }
}
