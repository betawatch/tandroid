package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
                p80 p80Var = (p80) this.b;
                p80.w(p80Var.getContext(), p80Var.c, p80Var.n, this.c);
                break;
            case 1:
                p80 p80Var2 = (p80) this.b;
                p80.w(p80Var2.getContext(), p80Var2.c, p80Var2.n, this.c);
                break;
            default:
                ci.oc ocVar = (ci.oc) this.b;
                ocVar.z2 = false;
                ocVar.X0.x(7, true);
                if (this.c) {
                    ocVar.q(true);
                    break;
                }
                break;
        }
    }
}
