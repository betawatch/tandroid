package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d80 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ d80(int i10, Object obj, boolean z4) {
        this.a = i10;
        this.b = obj;
        this.c = z4;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                h80 h80Var = (h80) this.b;
                h80.w(h80Var.getContext(), h80Var.c, h80Var.n, this.c);
                break;
            case 1:
                h80 h80Var2 = (h80) this.b;
                h80.w(h80Var2.getContext(), h80Var2.c, h80Var2.n, this.c);
                break;
            default:
                ph.da daVar = (ph.da) this.b;
                daVar.w2 = false;
                daVar.U0.x(7, true);
                if (this.c) {
                    daVar.q(true);
                    break;
                }
                break;
        }
    }
}
