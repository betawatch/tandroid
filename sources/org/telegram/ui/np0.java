package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class np0 extends f2.a1 {
    public final /* synthetic */ zp0 a;

    public np0(zp0 zp0Var) {
        this.a = zp0Var;
    }

    @Override // f2.a1
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.a.getParentActivity().getCurrentFocus());
        }
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        zp0 zp0Var = this.a;
        if (zp0Var.F == null) {
            int L0 = zp0Var.I.L0();
            int abs = L0 == -1 ? 0 : Math.abs(zp0Var.I.N0() - L0) + 1;
            if (abs <= 0 || L0 + abs <= zp0Var.I.B() - 2 || zp0Var.r || zp0Var.s) {
                return;
            }
            zp0Var.d0(zp0Var.v, zp0Var.w, zp0Var.a == 1, true);
        }
    }
}
