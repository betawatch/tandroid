package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class c7 implements org.telegram.ui.Components.em0 {
    public final /* synthetic */ org.telegram.ui.Components.qm0 a;
    public final /* synthetic */ d7 b;

    public c7(d7 d7Var, org.telegram.ui.Components.qm0 qm0Var) {
        this.b = d7Var;
        this.a = qm0Var;
    }

    @Override // org.telegram.ui.Components.em0
    public final void d(int i10, View view) {
        r7 r7Var = this.b.d;
        org.telegram.ui.Components.qm0 qm0Var = this.a;
        e7 e7Var = (e7) qm0Var.getAdapter();
        l7 l7Var = (l7) e7Var.e.get(i10);
        if (view instanceof org.telegram.ui.Cells.t7) {
            r7.a(r7Var, l7Var, (n7) e7Var, qm0Var);
            return;
        }
        h7 h7Var = r7Var.v;
        if (h7Var != null) {
            h7Var.y0(l7Var.c, l7Var.d, false);
        }
    }
}
