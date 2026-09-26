package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m80 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ m80(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.b = obj;
        this.c = z10;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                r80 r80Var = (r80) this.b;
                r80.w(r80Var.getContext(), r80Var.c, r80Var.n, this.c);
                break;
            case 1:
                r80 r80Var2 = (r80) this.b;
                r80.w(r80Var2.getContext(), r80Var2.c, r80Var2.n, this.c);
                break;
            default:
                ci.lc lcVar = (ci.lc) this.b;
                lcVar.z2 = false;
                lcVar.X0.x(7, true);
                if (this.c) {
                    lcVar.q(true);
                    break;
                }
                break;
        }
    }
}
