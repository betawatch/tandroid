package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class u0 implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r4 b;

    public /* synthetic */ u0(int i10, r4 r4Var) {
        this.a = i10;
        this.b = r4Var;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                r4 r4Var = this.b;
                r4Var.requestFocus();
                org.telegram.messenger.i0.J3(r4Var);
                break;
            case 1:
                r4 r4Var2 = this.b;
                r4Var2.requestFocus();
                org.telegram.messenger.i0.J3(r4Var2);
                break;
            default:
                org.telegram.messenger.i0.g3(new tf(this.b, 2));
                break;
        }
    }
}
