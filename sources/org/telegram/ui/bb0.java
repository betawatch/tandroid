package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pc0 b;

    public /* synthetic */ bb0(pc0 pc0Var, int i7) {
        this.a = i7;
        this.b = pc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.M.m();
                break;
            case 1:
                pc0 pc0Var = this.b;
                pc0Var.N = null;
                pc0Var.O = null;
                pc0Var.o(true);
                pc0Var.e.j(null, null, pc0Var.f, null);
                yc ycVar = pc0Var.n;
                org.telegram.ui.Components.zg0 zg0Var = pc0Var.J;
                ycVar.setAnimation(zg0Var);
                zg0Var.M(0);
                pc0Var.L = true;
                break;
            case 2:
                this.b.L = true;
                break;
            default:
                EditTextBoldCursor editTextBoldCursor = this.b.c;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    org.telegram.messenger.g0.K3(editTextBoldCursor);
                    break;
                }
                break;
        }
    }
}
