package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vd0 b;

    public /* synthetic */ jc0(vd0 vd0Var, int i10) {
        this.a = i10;
        this.b = vd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.L.m();
                break;
            case 1:
                vd0 vd0Var = this.b;
                vd0Var.M = null;
                vd0Var.N = null;
                vd0Var.o(true);
                vd0Var.e.j(null, null, vd0Var.f, null);
                hd hdVar = vd0Var.n;
                org.telegram.ui.Components.ci0 ci0Var = vd0Var.I;
                hdVar.setAnimation(ci0Var);
                ci0Var.M(0);
                vd0Var.K = true;
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
