package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s60 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ s60(int i3, Object obj, boolean z10) {
        this.a = i3;
        this.b = obj;
        this.c = z10;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                x60 x60Var = (x60) this.b;
                x60.J0(x60Var.getContext(), x60Var.l1, x60Var.q1, this.c);
                break;
            case 1:
                x60 x60Var2 = (x60) this.b;
                x60.J0(x60Var2.getContext(), x60Var2.l1, x60Var2.q1, this.c);
                break;
            default:
                gi.va vaVar = (gi.va) this.b;
                vaVar.A2 = false;
                vaVar.Y0.x(7, true);
                if (this.c) {
                    vaVar.p(true);
                    break;
                }
                break;
        }
    }
}
