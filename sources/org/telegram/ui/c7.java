package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class c7 implements org.telegram.ui.Components.qj0 {
    public final /* synthetic */ org.telegram.ui.Components.ek0 a;
    public final /* synthetic */ d7 b;

    public c7(d7 d7Var, org.telegram.ui.Components.ek0 ek0Var) {
        this.b = d7Var;
        this.a = ek0Var;
    }

    @Override // org.telegram.ui.Components.qj0
    public final void b(int i7, View view) {
        t7 t7Var = this.b.f;
        org.telegram.ui.Components.ek0 ek0Var = this.a;
        f7 f7Var = (f7) ek0Var.getAdapter();
        m7 m7Var = (m7) f7Var.e.get(i7);
        if (view instanceof org.telegram.ui.Cells.o7) {
            t7.a(t7Var, m7Var, (o7) f7Var, ek0Var);
            return;
        }
        i7 i7Var = t7Var.G;
        if (i7Var != null) {
            i7Var.O(m7Var.c, m7Var.d, false);
        }
    }
}
