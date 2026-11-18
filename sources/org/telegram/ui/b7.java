package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class b7 implements org.telegram.ui.Components.oj0 {
    public final /* synthetic */ org.telegram.ui.Components.ck0 a;
    public final /* synthetic */ c7 b;

    public b7(c7 c7Var, org.telegram.ui.Components.ck0 ck0Var) {
        this.b = c7Var;
        this.a = ck0Var;
    }

    @Override // org.telegram.ui.Components.oj0
    public final void c(int i7, View view) {
        s7 s7Var = this.b.f;
        org.telegram.ui.Components.ck0 ck0Var = this.a;
        e7 e7Var = (e7) ck0Var.getAdapter();
        l7 l7Var = (l7) e7Var.e.get(i7);
        if (view instanceof org.telegram.ui.Cells.p7) {
            s7.a(s7Var, l7Var, (n7) e7Var, ck0Var);
            return;
        }
        h7 h7Var = s7Var.G;
        if (h7Var != null) {
            h7Var.m(l7Var.c, l7Var.d, false);
        }
    }
}
