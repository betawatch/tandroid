package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class c80 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ c80(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.b = obj;
        this.c = z10;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                h80 h80Var = (h80) this.b;
                h80.w(h80Var.getContext(), h80Var.c, h80Var.n, this.c);
                break;
            case 1:
                h80 h80Var2 = (h80) this.b;
                h80.w(h80Var2.getContext(), h80Var2.c, h80Var2.n, this.c);
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
