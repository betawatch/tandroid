package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p70 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ p70(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.b = obj;
        this.c = z10;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                t70 t70Var = (t70) this.b;
                t70.x(t70Var.getContext(), t70Var.c, t70Var.n, this.c);
                break;
            case 1:
                t70 t70Var2 = (t70) this.b;
                t70.x(t70Var2.getContext(), t70Var2.c, t70Var2.n, this.c);
                break;
            default:
                lh.sb sbVar = (lh.sb) this.b;
                sbVar.v2 = false;
                sbVar.T0.x(7, true);
                if (this.c) {
                    sbVar.q(true);
                    break;
                }
                break;
        }
    }
}
