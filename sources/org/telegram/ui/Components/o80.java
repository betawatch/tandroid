package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o80 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ o80(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.b = obj;
        this.c = z10;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                t80 t80Var = (t80) this.b;
                t80.w(t80Var.getContext(), t80Var.c, t80Var.n, this.c);
                break;
            case 1:
                t80 t80Var2 = (t80) this.b;
                t80.w(t80Var2.getContext(), t80Var2.c, t80Var2.n, this.c);
                break;
            default:
                ci.lc lcVar = (ci.lc) this.b;
                lcVar.z2 = false;
                lcVar.X0.x(7, true);
                if (this.c) {
                    lcVar.q(true);
                    break;
                }
                break;
        }
    }
}
