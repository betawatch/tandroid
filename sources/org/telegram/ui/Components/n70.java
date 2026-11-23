package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class n70 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ n70(int i7, Object obj, boolean z10) {
        this.a = i7;
        this.b = obj;
        this.c = z10;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                r70 r70Var = (r70) this.b;
                r70.K0(r70Var.getContext(), r70Var.o1, r70Var.t1, this.c);
                break;
            case 1:
                r70 r70Var2 = (r70) this.b;
                r70.K0(r70Var2.getContext(), r70Var2.o1, r70Var2.t1, this.c);
                break;
            default:
                hi.sa saVar = (hi.sa) this.b;
                saVar.A2 = false;
                saVar.Y0.x(7, true);
                if (this.c) {
                    saVar.p(true);
                    break;
                }
                break;
        }
    }
}
