package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class b90 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ b90(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.b = obj;
        this.c = z10;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                g90 g90Var = (g90) this.b;
                g90.y(g90Var.getContext(), g90Var.c, g90Var.n, this.c);
                break;
            case 1:
                g90 g90Var2 = (g90) this.b;
                g90.y(g90Var2.getContext(), g90Var2.c, g90Var2.n, this.c);
                break;
            default:
                di.kc kcVar = (di.kc) this.b;
                kcVar.z2 = false;
                kcVar.X0.x(7, true);
                if (this.c) {
                    kcVar.p(true);
                    break;
                }
                break;
        }
    }
}
