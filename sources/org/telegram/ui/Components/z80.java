package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z80 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ z80(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.b = obj;
        this.c = z10;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                d90 d90Var = (d90) this.b;
                d90.w(d90Var.getContext(), d90Var.d, d90Var.r, this.c);
                break;
            case 1:
                d90 d90Var2 = (d90) this.b;
                d90.w(d90Var2.getContext(), d90Var2.d, d90Var2.r, this.c);
                break;
            default:
                fi.sb sbVar = (fi.sb) this.b;
                sbVar.z2 = false;
                sbVar.X0.x(7, true);
                if (this.c) {
                    sbVar.p(true);
                    break;
                }
                break;
        }
    }
}
