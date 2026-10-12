package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class kr0 extends FrameLayout {
    public org.telegram.ui.ActionBar.m2 a;
    public FrameLayout b;
    public org.telegram.ui.ActionBar.k c;
    public org.telegram.ui.Components.mm0 d;
    public int e;
    public final /* synthetic */ mr0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kr0(mr0 mr0Var, Context context) {
        super(context);
        this.f = mr0Var;
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        kr0 kr0Var;
        super.setTranslationX(f7);
        mr0 mr0Var = this.f;
        kr0[] kr0VarArr = mr0Var.n;
        if (mr0Var.s && (kr0Var = kr0VarArr[0]) == this) {
            mr0Var.h.j(Math.abs(kr0Var.getTranslationX()) / kr0VarArr[0].getMeasuredWidth(), kr0VarArr[1].e);
        }
    }
}
