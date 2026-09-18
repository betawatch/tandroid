package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class e7 implements org.telegram.ui.Components.al0 {
    public final /* synthetic */ org.telegram.ui.Components.ml0 a;
    public final /* synthetic */ f7 b;

    public e7(f7 f7Var, org.telegram.ui.Components.ml0 ml0Var) {
        this.b = f7Var;
        this.a = ml0Var;
    }

    @Override // org.telegram.ui.Components.al0
    public final void d(int i10, View view) {
        u7 u7Var = this.b.e;
        org.telegram.ui.Components.ml0 ml0Var = this.a;
        h7 h7Var = (h7) ml0Var.getAdapter();
        o7 o7Var = (o7) h7Var.e.get(i10);
        if (view instanceof org.telegram.ui.Cells.t7) {
            u7.a(u7Var, o7Var, (q7) h7Var, ml0Var);
            return;
        }
        k7 k7Var = u7Var.E;
        if (k7Var != null) {
            k7Var.H0(o7Var.c, o7Var.d, false);
        }
    }
}
