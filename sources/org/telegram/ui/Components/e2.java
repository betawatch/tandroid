package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e2 implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditTextBoldCursor b;

    public /* synthetic */ e2(EditTextBoldCursor editTextBoldCursor, int i3) {
        this.a = i3;
        this.b = editTextBoldCursor;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                z3 z3Var = (z3) this.b;
                z3Var.requestFocus();
                org.telegram.messenger.g0.K3(z3Var);
                break;
            case 1:
                lg.y0 y0Var = (lg.y0) this.b;
                y0Var.requestFocus();
                org.telegram.messenger.g0.K3(y0Var);
                break;
            default:
                org.telegram.messenger.g0.h3(new zs(this.b, 7));
                break;
        }
    }
}
