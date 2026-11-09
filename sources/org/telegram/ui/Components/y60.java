package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class y60 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ y60(int i7, Object obj, boolean z9) {
        this.a = i7;
        this.b = obj;
        this.c = z9;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                c70 c70Var = (c70) this.b;
                c70.J0(c70Var.getContext(), c70Var.k1, c70Var.p1, this.c);
                break;
            case 1:
                c70 c70Var2 = (c70) this.b;
                c70.J0(c70Var2.getContext(), c70Var2.k1, c70Var2.p1, this.c);
                break;
            default:
                fi.va vaVar = (fi.va) this.b;
                vaVar.z2 = false;
                vaVar.X0.x(7, true);
                if (this.c) {
                    vaVar.p(true);
                    break;
                }
                break;
        }
    }
}
