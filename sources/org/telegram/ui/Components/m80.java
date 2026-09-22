package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class m80 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ m80(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.b = obj;
        this.c = z10;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                r80 r80Var = (r80) this.b;
                r80.w(r80Var.getContext(), r80Var.c, r80Var.n, this.c);
                break;
            case 1:
                r80 r80Var2 = (r80) this.b;
                r80.w(r80Var2.getContext(), r80Var2.c, r80Var2.n, this.c);
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
