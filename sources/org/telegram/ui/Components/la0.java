package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class la0 implements oj0 {
    public final /* synthetic */ oa0 a;

    public la0(oa0 oa0Var) {
        this.a = oa0Var;
    }

    @Override // org.telegram.ui.Components.oj0
    public final void c(int i7, View view) {
        oa0 oa0Var = this.a;
        if (oa0Var.a != 1 || oa0Var.r.f.size() <= 1) {
            return;
        }
        int e12 = ((org.telegram.messenger.fj) oa0Var.r.f.get(i7)).e1();
        boolean z10 = oa0Var.r.g.get(e12, false);
        boolean z11 = !z10;
        if (oa0Var.r.g.size() == 1 && z10) {
            return;
        }
        if (z10) {
            oa0Var.r.g.delete(e12);
        } else {
            oa0Var.r.g.put(e12, z11);
        }
        if (view instanceof org.telegram.ui.Cells.r1) {
            ((org.telegram.ui.Cells.r1) view).n3(z11, z11, true);
        }
        oa0Var.l(true);
    }
}
