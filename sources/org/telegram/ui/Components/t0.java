package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t0 implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ s4 b;

    public /* synthetic */ t0(int i3, s4 s4Var) {
        this.a = i3;
        this.b = s4Var;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                s4 s4Var = this.b;
                s4Var.requestFocus();
                org.telegram.messenger.g0.K3(s4Var);
                break;
            case 1:
                s4 s4Var2 = this.b;
                s4Var2.requestFocus();
                org.telegram.messenger.g0.K3(s4Var2);
                break;
            default:
                org.telegram.messenger.g0.h3(new vf(this.b, 2));
                break;
        }
    }
}
