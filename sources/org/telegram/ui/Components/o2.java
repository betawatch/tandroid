package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class o2 implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditTextBoldCursor b;

    public /* synthetic */ o2(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.a = i7;
        this.b = editTextBoldCursor;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                h4 h4Var = (h4) this.b;
                h4Var.requestFocus();
                org.telegram.messenger.g0.I3(h4Var);
                break;
            case 1:
                kg.a1 a1Var = (kg.a1) this.b;
                a1Var.requestFocus();
                org.telegram.messenger.g0.I3(a1Var);
                break;
            default:
                org.telegram.messenger.g0.g3(new i(this.b, 8));
                break;
        }
    }
}
