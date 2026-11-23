package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                kg.z0 z0Var = (kg.z0) this.b;
                z0Var.requestFocus();
                org.telegram.messenger.g0.I3(z0Var);
                break;
            default:
                org.telegram.messenger.g0.g3(new i(this.b, 8));
                break;
        }
    }
}
