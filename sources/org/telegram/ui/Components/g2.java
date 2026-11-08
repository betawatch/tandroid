package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g2 implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditTextBoldCursor b;

    public /* synthetic */ g2(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.a = i7;
        this.b = editTextBoldCursor;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                b4 b4Var = (b4) this.b;
                b4Var.requestFocus();
                org.telegram.messenger.g0.K3(b4Var);
                break;
            case 1:
                kg.x0 x0Var = (kg.x0) this.b;
                x0Var.requestFocus();
                org.telegram.messenger.g0.K3(x0Var);
                break;
            default:
                org.telegram.messenger.g0.h3(new bt(this.b, 7));
                break;
        }
    }
}
