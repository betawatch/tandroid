package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y80 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ y80(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.b = obj;
        this.c = z10;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                c90 c90Var = (c90) this.b;
                c90.w(c90Var.getContext(), c90Var.d, c90Var.r, this.c);
                break;
            case 1:
                c90 c90Var2 = (c90) this.b;
                c90.w(c90Var2.getContext(), c90Var2.d, c90Var2.r, this.c);
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
