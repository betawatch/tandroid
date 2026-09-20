package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class os0 extends s4.s0 {
    public final /* synthetic */ fs0 a;
    public final /* synthetic */ gs0 b;
    public final /* synthetic */ jv0 c;

    public os0(jv0 jv0Var, fs0 fs0Var, gs0 gs0Var) {
        this.c = jv0Var;
        this.a = fs0Var;
        this.b = gs0Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        this.c.b1 = i10 != 0;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        jv0 jv0Var = this.c;
        yu0[] yu0VarArr = jv0Var.t1;
        gs0 gs0Var = this.b;
        fs0 fs0Var = this.a;
        jv0Var.G(fs0Var, (vl0) recyclerView, gs0Var);
        if (i11 != 0 && ((i13 = jv0Var.k0[0].F) == 0 || i13 == 5)) {
            yu0VarArr[0].a.isEmpty();
        }
        if (i11 != 0 && ((i12 = fs0Var.F) == 0 || jv0.p0(i12))) {
            jv0.q(fs0Var, yu0VarArr, true);
        }
        fs0Var.h.M0(true);
        if (fs0Var.G != null) {
            fs0Var.invalidate();
        }
        jv0Var.o0();
    }
}
