package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w80 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ w80(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.b = obj;
        this.c = z10;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                a90 a90Var = (a90) this.b;
                a90.y(a90Var.getContext(), a90Var.c, a90Var.n, this.c);
                break;
            case 1:
                a90 a90Var2 = (a90) this.b;
                a90.y(a90Var2.getContext(), a90Var2.c, a90Var2.n, this.c);
                break;
            default:
                ei.vb vbVar = (ei.vb) this.b;
                vbVar.z2 = false;
                vbVar.X0.x(7, true);
                if (this.c) {
                    vbVar.p(true);
                    break;
                }
                break;
        }
    }
}
