package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class fo0 implements org.telegram.ui.ActionBar.q0, org.telegram.ui.Components.wk0 {
    public final /* synthetic */ lo0 a;

    public /* synthetic */ fo0(lo0 lo0Var) {
        this.a = lo0Var;
    }

    @Override // org.telegram.ui.Components.wk0
    public void b(boolean z10) {
        org.telegram.ui.ActionBar.z4 z4Var;
        lo0 lo0Var = this.a;
        lo0Var.W = z10 ? 1 : 0;
        if (z10) {
            z4Var = ((org.telegram.ui.ActionBar.k2) lo0Var).parentLayout;
            z4Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        lo0Var.K.d1(true);
    }

    @Override // org.telegram.ui.Components.wk0
    public boolean d(int i10) {
        return this.a.L.d(i10) == 0;
    }

    @Override // org.telegram.ui.ActionBar.q0
    public void e() {
        lo0 lo0Var = this.a;
        lo0Var.Q.setText(org.telegram.messenger.cd.L0(lo0Var.Y ? 2131745364 : 2131745363, null));
        lo0Var.Q.setIcon(lo0Var.Y ? R.drawable.msg_media : R.drawable.msg_list);
    }

    @Override // org.telegram.ui.Components.wk0
    public void h(View view, boolean z10) {
        if (z10 == this.a.X && (view instanceof org.telegram.ui.Cells.v5)) {
            org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) view;
            v5Var.x.d(v5Var);
        }
    }

    @Override // org.telegram.ui.Components.wk0
    public boolean j(int i10) {
        lo0 lo0Var = this.a;
        org.telegram.messenger.we weVar = lo0Var.J;
        return lo0Var.b.containsKey(weVar != null ? Integer.valueOf(((org.telegram.messenger.ef) weVar.e.get(i10)).C) : ((org.telegram.messenger.hf) lo0Var.f.get(i10)).B);
    }

    @Override // org.telegram.ui.ActionBar.q0
    public void a() {
    }
}
