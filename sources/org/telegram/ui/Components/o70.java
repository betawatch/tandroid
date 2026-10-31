package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class o70 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ o70(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.b = obj;
        this.c = z10;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                u70 u70Var = (u70) this.b;
                u70.J0(u70Var.getContext(), u70Var.k1, u70Var.p1, this.c);
                break;
            case 1:
                u70 u70Var2 = (u70) this.b;
                u70.J0(u70Var2.getContext(), u70Var2.k1, u70Var2.p1, this.c);
                break;
            default:
                vh.o8 o8Var = (vh.o8) this.b;
                o8Var.z2 = false;
                o8Var.X0.x(7, true);
                if (this.c) {
                    o8Var.p(true);
                    break;
                }
                break;
        }
    }
}
