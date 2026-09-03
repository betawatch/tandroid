package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f80 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ f80(int i10, Object obj, boolean z4) {
        this.a = i10;
        this.b = obj;
        this.c = z4;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                j80 j80Var = (j80) this.b;
                j80.w(j80Var.getContext(), j80Var.c, j80Var.n, this.c);
                break;
            case 1:
                j80 j80Var2 = (j80) this.b;
                j80.w(j80Var2.getContext(), j80Var2.c, j80Var2.n, this.c);
                break;
            default:
                qh.ba baVar = (qh.ba) this.b;
                baVar.w2 = false;
                baVar.U0.x(7, true);
                if (this.c) {
                    baVar.q(true);
                    break;
                }
                break;
        }
    }
}
