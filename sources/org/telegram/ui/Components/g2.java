package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
                org.telegram.messenger.g0.h3(new at(this.b, 7));
                break;
        }
    }
}
