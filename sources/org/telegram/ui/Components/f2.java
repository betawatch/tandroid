package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                a4 a4Var = (a4) this.b;
                a4Var.requestFocus();
                org.telegram.messenger.g0.K3(a4Var);
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
