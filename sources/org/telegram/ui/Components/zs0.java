package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class zs0 extends s4.r0 {
    public final /* synthetic */ qs0 a;
    public final /* synthetic */ rs0 b;
    public final /* synthetic */ uv0 c;

    public zs0(uv0 uv0Var, qs0 qs0Var, rs0 rs0Var) {
        this.c = uv0Var;
        this.a = qs0Var;
        this.b = rs0Var;
    }

    @Override // s4.r0
    public final void a(RecyclerView recyclerView, int i10) {
        this.c.b1 = i10 != 0;
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        uv0 uv0Var = this.c;
        jv0[] jv0VarArr = uv0Var.t1;
        rs0 rs0Var = this.b;
        qs0 qs0Var = this.a;
        uv0Var.G(qs0Var, (jm0) recyclerView, rs0Var);
        if (i11 != 0 && ((i13 = uv0Var.k0[0].F) == 0 || i13 == 5)) {
            jv0VarArr[0].a.isEmpty();
        }
        if (i11 != 0 && ((i12 = qs0Var.F) == 0 || uv0.q0(i12))) {
            uv0.r(qs0Var, jv0VarArr, true);
        }
        qs0Var.h.L0(true);
        if (qs0Var.G != null) {
            qs0Var.invalidate();
        }
        uv0Var.p0();
    }
}
