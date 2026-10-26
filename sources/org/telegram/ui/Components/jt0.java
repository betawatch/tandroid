package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class jt0 extends s4.u0 {
    public final /* synthetic */ at0 a;
    public final /* synthetic */ bt0 b;
    public final /* synthetic */ aw0 c;

    public jt0(aw0 aw0Var, at0 at0Var, bt0 bt0Var) {
        this.c = aw0Var;
        this.a = at0Var;
        this.b = bt0Var;
    }

    @Override // s4.u0
    public final void a(RecyclerView recyclerView, int i10) {
        this.c.d1 = i10 != 0;
    }

    @Override // s4.u0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        aw0 aw0Var = this.c;
        pv0[] pv0VarArr = aw0Var.v1;
        bt0 bt0Var = this.b;
        at0 at0Var = this.a;
        aw0Var.M(at0Var, (mm0) recyclerView, bt0Var);
        if (i11 != 0 && ((i13 = aw0Var.m0[0].E) == 0 || i13 == 5)) {
            pv0VarArr[0].a.isEmpty();
        }
        if (i11 != 0 && ((i12 = at0Var.E) == 0 || aw0.w0(i12))) {
            aw0.t(at0Var, pv0VarArr, true);
        }
        at0Var.h.L0(true);
        if (at0Var.F != null) {
            at0Var.invalidate();
        }
    }
}
