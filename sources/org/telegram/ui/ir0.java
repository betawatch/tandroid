package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ir0 extends FrameLayout {
    public org.telegram.ui.ActionBar.m2 a;
    public FrameLayout b;
    public org.telegram.ui.ActionBar.k c;
    public org.telegram.ui.Components.mm0 d;
    public int e;
    public final /* synthetic */ kr0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ir0(kr0 kr0Var, Context context) {
        super(context);
        this.f = kr0Var;
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        ir0 ir0Var;
        super.setTranslationX(f7);
        kr0 kr0Var = this.f;
        ir0[] ir0VarArr = kr0Var.n;
        if (kr0Var.s && (ir0Var = ir0VarArr[0]) == this) {
            kr0Var.h.j(Math.abs(ir0Var.getTranslationX()) / ir0VarArr[0].getMeasuredWidth(), ir0VarArr[1].e);
        }
    }
}
