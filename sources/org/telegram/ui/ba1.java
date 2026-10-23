package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class ba1 extends org.telegram.ui.Components.l61 {
    public static final /* synthetic */ int b = 0;
    public org.telegram.ui.Cells.r7 a;

    static {
        org.telegram.ui.Components.l61.setup(new ba1());
    }

    @Override // org.telegram.ui.Components.l61
    public final void attachedView(org.telegram.ui.Components.mm0 mm0Var, View view, org.telegram.ui.Components.m61 m61Var) {
        ((org.telegram.ui.Cells.s7) view).l(m61Var != null && m61Var.h, false);
    }

    @Override // org.telegram.ui.Components.l61
    public final void bindView(View view, org.telegram.ui.Components.m61 m61Var, boolean z10, org.telegram.ui.Components.b71 b71Var, org.telegram.ui.Components.j71 j71Var) {
        org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
        s7Var.k((MessageObject) m61Var.G, m61Var.v, false);
        s7Var.i(m61Var.e, false);
        s7Var.l(m61Var.h, false);
    }

    @Override // org.telegram.ui.Components.l61
    public final View createView(Context context, org.telegram.ui.Components.mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        if (this.a == null) {
            this.a = new org.telegram.ui.Cells.r7(context, g6Var);
        }
        org.telegram.ui.Cells.s7 s7Var = new org.telegram.ui.Cells.s7(context, this.a, i10);
        s7Var.w0 = true;
        s7Var.d0 = true;
        return s7Var;
    }

    @Override // org.telegram.ui.Components.l61
    public final boolean equals(org.telegram.ui.Components.m61 m61Var, org.telegram.ui.Components.m61 m61Var2) {
        return m61Var.q == m61Var2.q && m61Var.e == m61Var2.e && m61Var.B == m61Var2.B;
    }
}
