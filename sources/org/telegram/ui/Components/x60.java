package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x60 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ x60(int i7, Object obj, boolean z9) {
        this.a = i7;
        this.b = obj;
        this.c = z9;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                b70 b70Var = (b70) this.b;
                b70.J0(b70Var.getContext(), b70Var.n1, b70Var.s1, this.c);
                break;
            case 1:
                b70 b70Var2 = (b70) this.b;
                b70.J0(b70Var2.getContext(), b70Var2.n1, b70Var2.s1, this.c);
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
