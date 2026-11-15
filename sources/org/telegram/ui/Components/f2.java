package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class f2 implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditTextBoldCursor b;

    public /* synthetic */ f2(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.a = i7;
        this.b = editTextBoldCursor;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                z3 z3Var = (z3) this.b;
                z3Var.requestFocus();
                org.telegram.messenger.g0.J3(z3Var);
                break;
            case 1:
                kg.x0 x0Var = (kg.x0) this.b;
                x0Var.requestFocus();
                org.telegram.messenger.g0.J3(x0Var);
                break;
            default:
                org.telegram.messenger.g0.h3(new ht(this.b, 7));
                break;
        }
    }
}
