package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
