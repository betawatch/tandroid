package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e80 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ e80(int i10, Object obj, boolean z4) {
        this.a = i10;
        this.b = obj;
        this.c = z4;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                i80 i80Var = (i80) this.b;
                i80.w(i80Var.getContext(), i80Var.c, i80Var.n, this.c);
                break;
            case 1:
                i80 i80Var2 = (i80) this.b;
                i80.w(i80Var2.getContext(), i80Var2.c, i80Var2.n, this.c);
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
