package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class g2 implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditTextBoldCursor b;

    public /* synthetic */ g2(EditTextBoldCursor editTextBoldCursor, int i10) {
        this.a = i10;
        this.b = editTextBoldCursor;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                y3 y3Var = (y3) this.b;
                y3Var.requestFocus();
                org.telegram.messenger.i0.J3(y3Var);
                break;
            case 1:
                ag.a2 a2Var = (ag.a2) this.b;
                a2Var.requestFocus();
                org.telegram.messenger.i0.J3(a2Var);
                break;
            default:
                org.telegram.messenger.i0.g3(new ot(this.b, 7));
                break;
        }
    }
}
