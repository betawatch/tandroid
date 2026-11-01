package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class do0 implements org.telegram.ui.ActionBar.q0, org.telegram.ui.Components.xk0 {
    public final /* synthetic */ jo0 a;

    public /* synthetic */ do0(jo0 jo0Var) {
        this.a = jo0Var;
    }

    @Override // org.telegram.ui.Components.xk0
    public void b(boolean z10) {
        org.telegram.ui.ActionBar.z4 z4Var;
        jo0 jo0Var = this.a;
        jo0Var.W = z10 ? 1 : 0;
        if (z10) {
            z4Var = ((org.telegram.ui.ActionBar.k2) jo0Var).parentLayout;
            z4Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        jo0Var.K.d1(true);
    }

    @Override // org.telegram.ui.Components.xk0
    public boolean d(int i10) {
        return this.a.L.d(i10) == 0;
    }

    @Override // org.telegram.ui.ActionBar.q0
    public void e() {
        jo0 jo0Var = this.a;
        jo0Var.Q.setText(org.telegram.messenger.dd.L0(jo0Var.Y ? 2131745364 : 2131745363, null));
        jo0Var.Q.setIcon(jo0Var.Y ? R.drawable.msg_media : R.drawable.msg_list);
    }

    @Override // org.telegram.ui.Components.xk0
    public void h(View view, boolean z10) {
        if (z10 == this.a.X && (view instanceof org.telegram.ui.Cells.v5)) {
            org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) view;
            v5Var.x.d(v5Var);
        }
    }

    @Override // org.telegram.ui.Components.xk0
    public boolean j(int i10) {
        jo0 jo0Var = this.a;
        org.telegram.messenger.xe xeVar = jo0Var.J;
        return jo0Var.b.containsKey(xeVar != null ? Integer.valueOf(((org.telegram.messenger.ff) xeVar.e.get(i10)).C) : ((org.telegram.messenger.jf) jo0Var.f.get(i10)).B);
    }

    @Override // org.telegram.ui.ActionBar.q0
    public void a() {
    }
}
