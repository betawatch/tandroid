package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class a70 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ a70(int i7, Object obj, boolean z10) {
        this.a = i7;
        this.b = obj;
        this.c = z10;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                e70 e70Var = (e70) this.b;
                e70.J0(e70Var.getContext(), e70Var.o1, e70Var.t1, this.c);
                break;
            case 1:
                e70 e70Var2 = (e70) this.b;
                e70.J0(e70Var2.getContext(), e70Var2.o1, e70Var2.t1, this.c);
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
