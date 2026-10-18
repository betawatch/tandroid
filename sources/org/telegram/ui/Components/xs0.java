package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class xs0 extends s4.r0 {
    public final /* synthetic */ os0 a;
    public final /* synthetic */ ps0 b;
    public final /* synthetic */ sv0 c;

    public xs0(sv0 sv0Var, os0 os0Var, ps0 ps0Var) {
        this.c = sv0Var;
        this.a = os0Var;
        this.b = ps0Var;
    }

    @Override // s4.r0
    public final void a(RecyclerView recyclerView, int i10) {
        this.c.b1 = i10 != 0;
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        sv0 sv0Var = this.c;
        hv0[] hv0VarArr = sv0Var.t1;
        ps0 ps0Var = this.b;
        os0 os0Var = this.a;
        sv0Var.G(os0Var, (im0) recyclerView, ps0Var);
        if (i11 != 0 && ((i13 = sv0Var.k0[0].F) == 0 || i13 == 5)) {
            hv0VarArr[0].a.isEmpty();
        }
        if (i11 != 0 && ((i12 = os0Var.F) == 0 || sv0.q0(i12))) {
            sv0.r(os0Var, hv0VarArr, true);
        }
        os0Var.h.L0(true);
        if (os0Var.G != null) {
            os0Var.invalidate();
        }
        sv0Var.p0();
    }
}
