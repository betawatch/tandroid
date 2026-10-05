package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p80 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ p80(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.b = obj;
        this.c = z10;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                u80 u80Var = (u80) this.b;
                u80.w(u80Var.getContext(), u80Var.c, u80Var.n, this.c);
                break;
            case 1:
                u80 u80Var2 = (u80) this.b;
                u80.w(u80Var2.getContext(), u80Var2.c, u80Var2.n, this.c);
                break;
            default:
                ci.kc kcVar = (ci.kc) this.b;
                kcVar.z2 = false;
                kcVar.X0.x(7, true);
                if (this.c) {
                    kcVar.q(true);
                    break;
                }
                break;
        }
    }
}
