package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ev extends org.telegram.ui.Components.ll0 {
    public final /* synthetic */ gv c;

    public ev(gv gvVar) {
        this.c = gvVar;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // s4.h0
    public final int h() {
        return this.c.g0.h() ? 1 : 3;
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        int i11;
        int i12;
        gv gvVar = this.c;
        if (i10 == 0) {
            view = gvVar.d0;
        } else if (i10 == 2) {
            view = gvVar.e0;
            s4.p0 p0Var = new s4.p0(-1, -2);
            i11 = ((org.telegram.ui.ActionBar.f3) gvVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) p0Var).leftMargin = i11;
            i12 = ((org.telegram.ui.ActionBar.f3) gvVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) p0Var).rightMargin = i12;
            view.setLayoutParams(p0Var);
        } else {
            org.telegram.ui.Cells.f9 f9Var = new org.telegram.ui.Cells.f9(viewGroup.getContext());
            f9Var.setFixedSize(12);
            org.telegram.ui.Components.qq qqVar = new org.telegram.ui.Components.qq(new ColorDrawable(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.a7, false)), org.telegram.ui.ActionBar.h6.V0(viewGroup.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.b7));
            qqVar.w = true;
            f9Var.setBackgroundDrawable(qqVar);
            view = f9Var;
        }
        return new org.telegram.ui.Components.wk0(view);
    }

    @Override // s4.h0
    public final int j(int i10) {
        return i10;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
    }
}
