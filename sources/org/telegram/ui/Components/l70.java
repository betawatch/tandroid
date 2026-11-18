package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class l70 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ l70(int i7, Object obj, boolean z10) {
        this.a = i7;
        this.b = obj;
        this.c = z10;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                p70 p70Var = (p70) this.b;
                p70.K0(p70Var.getContext(), p70Var.o1, p70Var.t1, this.c);
                break;
            case 1:
                p70 p70Var2 = (p70) this.b;
                p70.K0(p70Var2.getContext(), p70Var2.o1, p70Var2.t1, this.c);
                break;
            default:
                hi.ta taVar = (hi.ta) this.b;
                taVar.A2 = false;
                taVar.Y0.x(7, true);
                if (this.c) {
                    taVar.p(true);
                    break;
                }
                break;
        }
    }
}
