package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class iq0 extends v4.s0 {
    public final /* synthetic */ zp0 a;
    public final /* synthetic */ aq0 b;
    public final /* synthetic */ xs0 c;

    public iq0(xs0 xs0Var, zp0 zp0Var, aq0 aq0Var) {
        this.c = xs0Var;
        this.a = zp0Var;
        this.b = aq0Var;
    }

    @Override // v4.s0
    public final void a(RecyclerView recyclerView, int i7) {
        this.c.d1 = i7 != 0;
    }

    @Override // v4.s0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        int i11;
        int i12;
        xs0 xs0Var = this.c;
        ms0[] ms0VarArr = xs0Var.v1;
        aq0 aq0Var = this.b;
        zp0 zp0Var = this.a;
        xs0Var.O(zp0Var, (pj0) recyclerView, aq0Var);
        if (i10 != 0 && ((i12 = xs0Var.m0[0].E) == 0 || i12 == 5)) {
            ms0VarArr[0].a.isEmpty();
        }
        if (i10 != 0 && ((i11 = zp0Var.E) == 0 || xs0.z0(i11))) {
            xs0.s(zp0Var, ms0VarArr, true);
        }
        zp0Var.h.L0(true);
        if (zp0Var.F != null) {
            zp0Var.invalidate();
        }
    }
}
