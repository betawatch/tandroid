package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class gv extends org.telegram.ui.Components.ql0 {
    public final /* synthetic */ iv c;

    public gv(iv ivVar) {
        this.c = ivVar;
    }

    @Override // org.telegram.ui.Components.ql0
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
        iv ivVar = this.c;
        if (i10 == 0) {
            view = ivVar.a0;
        } else if (i10 == 2) {
            view = ivVar.b0;
            f2.w0 w0Var = new f2.w0(-1, -2);
            i11 = ((org.telegram.ui.ActionBar.g3) ivVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) w0Var).leftMargin = i11;
            i12 = ((org.telegram.ui.ActionBar.g3) ivVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) w0Var).rightMargin = i12;
            view.setLayoutParams(w0Var);
        } else {
            org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(viewGroup.getContext());
            z8Var.setFixedSize(12);
            org.telegram.ui.Components.mq mqVar = new org.telegram.ui.Components.mq(new ColorDrawable(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false)), org.telegram.ui.ActionBar.j6.V0(viewGroup.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
            mqVar.w = true;
            z8Var.setBackgroundDrawable(mqVar);
            view = z8Var;
        }
        return new org.telegram.ui.Components.dl0(view);
    }

    @Override // f2.o0
    public final int j(int i10) {
        return i10;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
    }
}
