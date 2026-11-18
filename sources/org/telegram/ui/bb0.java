package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                org.telegram.ui.Components.mh0 mh0Var = oc0Var.K;
                xcVar.setAnimation(mh0Var);
                mh0Var.M(0);
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
                    org.telegram.messenger.g0.I3(editTextBoldCursor);
                    break;
                }
                break;
        }
    }
}
