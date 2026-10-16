package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a90 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ a90(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.b = obj;
        this.c = z10;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                f90 f90Var = (f90) this.b;
                f90.y(f90Var.getContext(), f90Var.c, f90Var.n, this.c);
                break;
            case 1:
                f90 f90Var2 = (f90) this.b;
                f90.y(f90Var2.getContext(), f90Var2.c, f90Var2.n, this.c);
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
