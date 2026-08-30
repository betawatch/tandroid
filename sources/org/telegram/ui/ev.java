package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ev extends org.telegram.ui.Components.rl0 {
    public final /* synthetic */ gv c;

    public ev(gv gvVar) {
        this.c = gvVar;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        return false;
    }

    @Override // f2.o0
    public final int h() {
        return this.c.d0.h() ? 1 : 3;
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View view;
        int i11;
        int i12;
        gv gvVar = this.c;
        if (i10 == 0) {
            view = gvVar.a0;
        } else if (i10 == 2) {
            view = gvVar.b0;
            f2.w0 w0Var = new f2.w0(-1, -2);
            i11 = ((org.telegram.ui.ActionBar.g3) gvVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) w0Var).leftMargin = i11;
            i12 = ((org.telegram.ui.ActionBar.g3) gvVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) w0Var).rightMargin = i12;
            view.setLayoutParams(w0Var);
        } else {
            org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(viewGroup.getContext());
            a9Var.setFixedSize(12);
            org.telegram.ui.Components.nq nqVar = new org.telegram.ui.Components.nq(new ColorDrawable(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false)), org.telegram.ui.ActionBar.j6.V0(viewGroup.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
            nqVar.w = true;
            a9Var.setBackgroundDrawable(nqVar);
            view = a9Var;
        }
        return new org.telegram.ui.Components.el0(view);
    }

    @Override // f2.o0
    public final int j(int i10) {
        return i10;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
    }
}
