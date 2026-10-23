package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class g7 implements org.telegram.ui.Components.am0 {
    public final /* synthetic */ org.telegram.ui.Components.mm0 a;
    public final /* synthetic */ h7 b;

    public g7(h7 h7Var, org.telegram.ui.Components.mm0 mm0Var) {
        this.b = h7Var;
        this.a = mm0Var;
    }

    @Override // org.telegram.ui.Components.am0
    public final void d(int i10, View view) {
        v7 v7Var = this.b.d;
        org.telegram.ui.Components.mm0 mm0Var = this.a;
        i7 i7Var = (i7) mm0Var.getAdapter();
        p7 p7Var = (p7) i7Var.e.get(i10);
        if (view instanceof org.telegram.ui.Cells.s7) {
            v7.a(v7Var, p7Var, (r7) i7Var, mm0Var);
            return;
        }
        l7 l7Var = v7Var.w;
        if (l7Var != null) {
            l7Var.s0(p7Var.c, p7Var.d, false);
        }
    }
}
