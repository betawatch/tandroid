package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class b80 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ b80(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.b = obj;
        this.c = z10;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                g80 g80Var = (g80) this.b;
                g80.w(g80Var.getContext(), g80Var.c, g80Var.n, this.c);
                break;
            case 1:
                g80 g80Var2 = (g80) this.b;
                g80.w(g80Var2.getContext(), g80Var2.c, g80Var2.n, this.c);
                break;
            default:
                di.pc pcVar = (di.pc) this.b;
                pcVar.z2 = false;
                pcVar.X0.x(7, true);
                if (this.c) {
                    pcVar.q(true);
                    break;
                }
                break;
        }
    }
}
