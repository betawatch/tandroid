package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class es0 extends s4.s0 {
    public final /* synthetic */ vr0 a;
    public final /* synthetic */ wr0 b;
    public final /* synthetic */ zu0 c;

    public es0(zu0 zu0Var, vr0 vr0Var, wr0 wr0Var) {
        this.c = zu0Var;
        this.a = vr0Var;
        this.b = wr0Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        this.c.b1 = i10 != 0;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        zu0 zu0Var = this.c;
        ou0[] ou0VarArr = zu0Var.t1;
        wr0 wr0Var = this.b;
        vr0 vr0Var = this.a;
        zu0Var.G(vr0Var, (ml0) recyclerView, wr0Var);
        if (i11 != 0 && ((i13 = zu0Var.k0[0].F) == 0 || i13 == 5)) {
            ou0VarArr[0].a.isEmpty();
        }
        if (i11 != 0 && ((i12 = vr0Var.F) == 0 || zu0.p0(i12))) {
            zu0.q(vr0Var, ou0VarArr, true);
        }
        vr0Var.h.M0(true);
        if (vr0Var.G != null) {
            vr0Var.invalidate();
        }
        zu0Var.o0();
    }
}
