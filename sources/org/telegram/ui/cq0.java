package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class cq0 extends FrameLayout {
    public org.telegram.ui.ActionBar.o2 a;
    public FrameLayout b;
    public org.telegram.ui.ActionBar.l c;
    public org.telegram.ui.Components.jl0 d;
    public int e;
    public final /* synthetic */ eq0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq0(eq0 eq0Var, Context context) {
        super(context);
        this.f = eq0Var;
    }

    @Override // android.view.View
    public final void setTranslationX(float f9) {
        cq0 cq0Var;
        super.setTranslationX(f9);
        eq0 eq0Var = this.f;
        cq0[] cq0VarArr = eq0Var.n;
        if (eq0Var.s && (cq0Var = cq0VarArr[0]) == this) {
            eq0Var.h.j(Math.abs(cq0Var.getTranslationX()) / cq0VarArr[0].getMeasuredWidth(), cq0VarArr[1].e);
        }
    }
}
