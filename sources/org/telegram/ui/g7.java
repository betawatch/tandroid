package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class g7 implements org.telegram.ui.Components.wl0 {
    public final /* synthetic */ org.telegram.ui.Components.im0 a;
    public final /* synthetic */ h7 b;

    public g7(h7 h7Var, org.telegram.ui.Components.im0 im0Var) {
        this.b = h7Var;
        this.a = im0Var;
    }

    @Override // org.telegram.ui.Components.wl0
    public final void a(int i10, View view) {
        v7 v7Var = this.b.d;
        org.telegram.ui.Components.im0 im0Var = this.a;
        i7 i7Var = (i7) im0Var.getAdapter();
        p7 p7Var = (p7) i7Var.e.get(i10);
        if (view instanceof org.telegram.ui.Cells.s7) {
            v7.a(v7Var, p7Var, (r7) i7Var, im0Var);
            return;
        }
        l7 l7Var = v7Var.v;
        if (l7Var != null) {
            l7Var.s0(p7Var.c, p7Var.d, false);
        }
    }
}
