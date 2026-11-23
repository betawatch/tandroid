package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p2 implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditTextBoldCursor b;

    public /* synthetic */ p2(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.a = i7;
        this.b = editTextBoldCursor;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                i4 i4Var = (i4) this.b;
                i4Var.requestFocus();
                org.telegram.messenger.g0.I3(i4Var);
                break;
            case 1:
                kg.z0 z0Var = (kg.z0) this.b;
                z0Var.requestFocus();
                org.telegram.messenger.g0.I3(z0Var);
                break;
            default:
                org.telegram.messenger.g0.g3(new j(this.b, 8));
                break;
        }
    }
}
