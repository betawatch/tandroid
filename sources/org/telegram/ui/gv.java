package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class gv extends org.telegram.ui.Components.pm0 {
    public final /* synthetic */ iv c;

    public gv(iv ivVar) {
        this.c = ivVar;
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        return false;
    }

    @Override // s4.i0
    public final int h() {
        return this.c.g0.h() ? 1 : 3;
    }

    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View view;
        int i11;
        int i12;
        iv ivVar = this.c;
        if (i10 == 0) {
            view = ivVar.d0;
        } else if (i10 == 2) {
            view = ivVar.e0;
            s4.q0 q0Var = new s4.q0(-1, -2);
            i11 = ((org.telegram.ui.ActionBar.f3) ivVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) q0Var).leftMargin = i11;
            i12 = ((org.telegram.ui.ActionBar.f3) ivVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) q0Var).rightMargin = i12;
            view.setLayoutParams(q0Var);
        } else {
            org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(viewGroup.getContext());
            e9Var.setFixedSize(12);
            org.telegram.ui.Components.fr frVar = new org.telegram.ui.Components.fr(new ColorDrawable(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.a7, false)), org.telegram.ui.ActionBar.i6.W0(viewGroup.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.i6.b7));
            frVar.w = true;
            e9Var.setBackgroundDrawable(frVar);
            view = e9Var;
        }
        return new org.telegram.ui.Components.am0(view);
    }

    @Override // s4.i0
    public final int j(int i10) {
        return i10;
    }

    @Override // s4.i0
    public final void v(s4.d1 d1Var, int i10) {
    }
}
