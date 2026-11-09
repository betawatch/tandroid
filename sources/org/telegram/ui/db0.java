package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class db0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rc0 b;

    public /* synthetic */ db0(rc0 rc0Var, int i7) {
        this.a = i7;
        this.b = rc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.M.m();
                break;
            case 1:
                rc0 rc0Var = this.b;
                rc0Var.N = null;
                rc0Var.O = null;
                rc0Var.o(true);
                rc0Var.e.j(null, null, rc0Var.f, null);
                yc ycVar = rc0Var.n;
                org.telegram.ui.Components.ah0 ah0Var = rc0Var.J;
                ycVar.setAnimation(ah0Var);
                ah0Var.M(0);
                rc0Var.L = true;
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
