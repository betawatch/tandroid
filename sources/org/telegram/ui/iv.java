package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class iv extends org.telegram.ui.Components.ul0 {
    public final /* synthetic */ kv c;

    public iv(kv kvVar) {
        this.c = kvVar;
    }

    @Override // org.telegram.ui.Components.ul0
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
        kv kvVar = this.c;
        if (i10 == 0) {
            view = kvVar.d0;
        } else if (i10 == 2) {
            view = kvVar.e0;
            s4.p0 p0Var = new s4.p0(-1, -2);
            i11 = ((org.telegram.ui.ActionBar.f3) kvVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) p0Var).leftMargin = i11;
            i12 = ((org.telegram.ui.ActionBar.f3) kvVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) p0Var).rightMargin = i12;
            view.setLayoutParams(p0Var);
        } else {
            org.telegram.ui.Cells.f9 f9Var = new org.telegram.ui.Cells.f9(viewGroup.getContext());
            f9Var.setFixedSize(12);
            org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(new ColorDrawable(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false)), org.telegram.ui.ActionBar.j6.V0(viewGroup.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
            pqVar.w = true;
            f9Var.setBackgroundDrawable(pqVar);
            view = f9Var;
        }
        return new org.telegram.ui.Components.fl0(view);
    }

    @Override // s4.h0
    public final int j(int i10) {
        return i10;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
    }
}
