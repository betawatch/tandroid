package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
