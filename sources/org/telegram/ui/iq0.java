package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class iq0 extends FrameLayout {
    public org.telegram.ui.ActionBar.p2 a;
    public FrameLayout b;
    public org.telegram.ui.ActionBar.k c;
    public org.telegram.ui.Components.sl0 d;
    public int e;
    public final /* synthetic */ kq0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iq0(kq0 kq0Var, Context context) {
        super(context);
        this.f = kq0Var;
    }

    @Override // android.view.View
    public final void setTranslationX(float f10) {
        iq0 iq0Var;
        super.setTranslationX(f10);
        kq0 kq0Var = this.f;
        iq0[] iq0VarArr = kq0Var.n;
        if (kq0Var.s && (iq0Var = iq0VarArr[0]) == this) {
            kq0Var.h.j(Math.abs(iq0Var.getTranslationX()) / iq0VarArr[0].getMeasuredWidth(), iq0VarArr[1].e);
        }
    }
}
