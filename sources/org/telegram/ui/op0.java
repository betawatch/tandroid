package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class op0 extends f2.d1 {
    public final /* synthetic */ zp0 a;

    public op0(zp0 zp0Var) {
        this.a = zp0Var;
    }

    @Override // f2.d1
    public final void a(RecyclerView recyclerView, int i9) {
        if (i9 == 1) {
            AndroidUtilities.hideKeyboard(this.a.getParentActivity().getCurrentFocus());
        }
    }

    @Override // f2.d1
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        zp0 zp0Var = this.a;
        if (zp0Var.F == null) {
            int L0 = zp0Var.I.L0();
            int abs = L0 == -1 ? 0 : Math.abs(zp0Var.I.N0() - L0) + 1;
            if (abs <= 0 || L0 + abs <= zp0Var.I.B() - 2 || zp0Var.r || zp0Var.s) {
                return;
            }
            zp0Var.c0(zp0Var.v, zp0Var.w, zp0Var.a == 1, true);
        }
    }
}
