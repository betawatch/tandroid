package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u0 implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ u4 b;

    public /* synthetic */ u0(int i7, u4 u4Var) {
        this.a = i7;
        this.b = u4Var;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                u4 u4Var = this.b;
                u4Var.requestFocus();
                org.telegram.messenger.g0.K3(u4Var);
                break;
            case 1:
                u4 u4Var2 = this.b;
                u4Var2.requestFocus();
                org.telegram.messenger.g0.K3(u4Var2);
                break;
            default:
                org.telegram.messenger.g0.h3(new xf(this.b, 2));
                break;
        }
    }
}
