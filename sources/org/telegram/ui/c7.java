package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class c7 implements org.telegram.ui.Components.mk0 {
    public final /* synthetic */ org.telegram.ui.Components.wk0 a;
    public final /* synthetic */ d7 b;

    public c7(d7 d7Var, org.telegram.ui.Components.wk0 wk0Var) {
        this.b = d7Var;
        this.a = wk0Var;
    }

    @Override // org.telegram.ui.Components.mk0
    public final void a(int i9, View view) {
        r7 r7Var = this.b.d;
        org.telegram.ui.Components.wk0 wk0Var = this.a;
        e7 e7Var = (e7) wk0Var.getAdapter();
        l7 l7Var = (l7) e7Var.e.get(i9);
        if (view instanceof org.telegram.ui.Cells.r7) {
            r7.a(r7Var, l7Var, (n7) e7Var, wk0Var);
            return;
        }
        h7 h7Var = r7Var.v;
        if (h7Var != null) {
            h7Var.o1(l7Var.c, l7Var.d, false);
        }
    }
}
