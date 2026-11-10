package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t0 implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ t4 b;

    public /* synthetic */ t0(int i7, t4 t4Var) {
        this.a = i7;
        this.b = t4Var;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                t4 t4Var = this.b;
                t4Var.requestFocus();
                org.telegram.messenger.g0.K3(t4Var);
                break;
            case 1:
                t4 t4Var2 = this.b;
                t4Var2.requestFocus();
                org.telegram.messenger.g0.K3(t4Var2);
                break;
            default:
                org.telegram.messenger.g0.h3(new wf(this.b, 2));
                break;
        }
    }
}
