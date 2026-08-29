package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y70 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ y70(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.b = obj;
        this.c = z10;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                c80 c80Var = (c80) this.b;
                c80.w(c80Var.getContext(), c80Var.c, c80Var.n, this.c);
                break;
            case 1:
                c80 c80Var2 = (c80) this.b;
                c80.w(c80Var2.getContext(), c80Var2.c, c80Var2.n, this.c);
                break;
            default:
                nh.gb gbVar = (nh.gb) this.b;
                gbVar.v2 = false;
                gbVar.T0.x(7, true);
                if (this.c) {
                    gbVar.q(true);
                    break;
                }
                break;
        }
    }
}
