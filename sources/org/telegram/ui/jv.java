package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class jv extends org.telegram.ui.Components.ll0 {
    public final /* synthetic */ lv c;

    public jv(lv lvVar) {
        this.c = lvVar;
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
        lv lvVar = this.c;
        if (i10 == 0) {
            view = lvVar.d0;
        } else if (i10 == 2) {
            view = lvVar.e0;
            s4.p0 p0Var = new s4.p0(-1, -2);
            i11 = ((org.telegram.ui.ActionBar.g3) lvVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) p0Var).leftMargin = i11;
            i12 = ((org.telegram.ui.ActionBar.g3) lvVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) p0Var).rightMargin = i12;
            view.setLayoutParams(p0Var);
        } else {
            org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(viewGroup.getContext());
            e9Var.setFixedSize(12);
            org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(new ColorDrawable(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false)), org.telegram.ui.ActionBar.j6.V0(viewGroup.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
            pqVar.w = true;
            e9Var.setBackgroundDrawable(pqVar);
            view = e9Var;
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
