package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class k80 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ k80(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.b = obj;
        this.c = z10;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                q80 q80Var = (q80) this.b;
                q80.w(q80Var.getContext(), q80Var.c, q80Var.n, this.c);
                break;
            case 1:
                q80 q80Var2 = (q80) this.b;
                q80.w(q80Var2.getContext(), q80Var2.c, q80Var2.n, this.c);
                break;
            default:
                bi.ce ceVar = (bi.ce) this.b;
                ceVar.z2 = false;
                ceVar.X0.x(7, true);
                if (this.c) {
                    ceVar.q(true);
                    break;
                }
                break;
        }
    }
}
