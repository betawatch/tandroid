package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class k70 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ k70(int i7, Object obj, boolean z10) {
        this.a = i7;
        this.b = obj;
        this.c = z10;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                o70 o70Var = (o70) this.b;
                o70.K0(o70Var.getContext(), o70Var.o1, o70Var.t1, this.c);
                break;
            case 1:
                o70 o70Var2 = (o70) this.b;
                o70.K0(o70Var2.getContext(), o70Var2.o1, o70Var2.t1, this.c);
                break;
            default:
                hi.nb nbVar = (hi.nb) this.b;
                nbVar.A2 = false;
                nbVar.Y0.x(7, true);
                if (this.c) {
                    nbVar.p(true);
                    break;
                }
                break;
        }
    }
}
