package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class bb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oc0 b;

    public /* synthetic */ bb0(oc0 oc0Var, int i7) {
        this.a = i7;
        this.b = oc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.N.m();
                break;
            case 1:
                oc0 oc0Var = this.b;
                oc0Var.O = null;
                oc0Var.P = null;
                oc0Var.o(true);
                oc0Var.e.j(null, null, oc0Var.f, null);
                xc xcVar = oc0Var.n;
                org.telegram.ui.Components.ch0 ch0Var = oc0Var.K;
                xcVar.setAnimation(ch0Var);
                ch0Var.M(0);
                oc0Var.M = true;
                break;
            case 2:
                this.b.M = true;
                break;
            default:
                EditTextBoldCursor editTextBoldCursor = this.b.c;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    org.telegram.messenger.g0.J3(editTextBoldCursor);
                    break;
                }
                break;
        }
    }
}
