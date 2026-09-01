package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class fv extends org.telegram.ui.Components.sl0 {
    public final /* synthetic */ hv c;

    public fv(hv hvVar) {
        this.c = hvVar;
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean D(f2.m1 m1Var) {
        return false;
    }

    @Override // f2.p0
    public final int h() {
        return this.c.d0.h() ? 1 : 3;
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View view;
        int i11;
        int i12;
        hv hvVar = this.c;
        if (i10 == 0) {
            view = hvVar.a0;
        } else if (i10 == 2) {
            view = hvVar.b0;
            f2.x0 x0Var = new f2.x0(-1, -2);
            i11 = ((org.telegram.ui.ActionBar.h3) hvVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) x0Var).leftMargin = i11;
            i12 = ((org.telegram.ui.ActionBar.h3) hvVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) x0Var).rightMargin = i12;
            view.setLayoutParams(x0Var);
        } else {
            org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(viewGroup.getContext());
            a9Var.setFixedSize(12);
            org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(new ColorDrawable(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.a7, false)), org.telegram.ui.ActionBar.k6.V0(viewGroup.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7));
            pqVar.w = true;
            a9Var.setBackgroundDrawable(pqVar);
            view = a9Var;
        }
        return new org.telegram.ui.Components.fl0(view);
    }

    @Override // f2.p0
    public final int j(int i10) {
        return i10;
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
    }
}
