package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
        if (view instanceof org.telegram.ui.Cells.q1) {
            ((org.telegram.ui.Cells.q1) view).n3(z11, z11, true);
        }
        oa0Var.l(true);
    }
}
