package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class nm0 implements org.telegram.ui.ActionBar.n0, org.telegram.ui.Components.wj0 {
    public final /* synthetic */ sm0 a;

    public /* synthetic */ nm0(sm0 sm0Var) {
        this.a = sm0Var;
    }

    @Override // org.telegram.ui.Components.wj0
    public void b(boolean z10) {
        org.telegram.ui.ActionBar.q4 q4Var;
        sm0 sm0Var = this.a;
        sm0Var.X = z10 ? 1 : 0;
        if (z10) {
            q4Var = ((org.telegram.ui.ActionBar.d2) sm0Var).parentLayout;
            q4Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        sm0Var.L.d1(true);
    }

    @Override // org.telegram.ui.Components.wj0
    public boolean c(int i3) {
        return this.a.M.d(i3) == 0;
    }

    @Override // org.telegram.ui.Components.wj0
    public void f(View view, boolean z10) {
        if (z10 == this.a.Y && (view instanceof org.telegram.ui.Cells.q5)) {
            org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
            q5Var.y.c(q5Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.n0
    public void g() {
        sm0 sm0Var = this.a;
        sm0Var.R.setText(org.telegram.messenger.bd.M0(sm0Var.Z ? 2131745356 : 2131745355, null));
        sm0Var.R.setIcon(sm0Var.Z ? R.drawable.msg_media : R.drawable.msg_list);
    }

    @Override // org.telegram.ui.Components.wj0
    public boolean m(int i3) {
        sm0 sm0Var = this.a;
        org.telegram.messenger.pe peVar = sm0Var.K;
        return sm0Var.b.containsKey(peVar != null ? Integer.valueOf(((org.telegram.messenger.ye) peVar.e.get(i3)).C) : ((org.telegram.messenger.bf) sm0Var.f.get(i3)).B);
    }

    @Override // org.telegram.ui.ActionBar.n0
    public void e() {
    }
}
