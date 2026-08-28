package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l70 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ l70(int i9, Object obj, boolean z10) {
        this.a = i9;
        this.b = obj;
        this.c = z10;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                p70 p70Var = (p70) this.b;
                p70.w(p70Var.getContext(), p70Var.c, p70Var.n, this.c);
                break;
            case 1:
                p70 p70Var2 = (p70) this.b;
                p70.w(p70Var2.getContext(), p70Var2.c, p70Var2.n, this.c);
                break;
            default:
                kh.wb wbVar = (kh.wb) this.b;
                wbVar.v2 = false;
                wbVar.T0.x(7, true);
                if (this.c) {
                    wbVar.q(true);
                    break;
                }
                break;
        }
    }
}
