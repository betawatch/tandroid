package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class cq0 extends FrameLayout {
    public org.telegram.ui.ActionBar.o2 a;
    public FrameLayout b;
    public org.telegram.ui.ActionBar.k c;
    public org.telegram.ui.Components.wk0 d;
    public int e;
    public final /* synthetic */ eq0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq0(eq0 eq0Var, Context context) {
        super(context);
        this.f = eq0Var;
    }

    @Override // android.view.View
    public final void setTranslationX(float f10) {
        cq0 cq0Var;
        super.setTranslationX(f10);
        eq0 eq0Var = this.f;
        cq0[] cq0VarArr = eq0Var.n;
        if (eq0Var.s && (cq0Var = cq0VarArr[0]) == this) {
            eq0Var.h.j(Math.abs(cq0Var.getTranslationX()) / cq0VarArr[0].getMeasuredWidth(), cq0VarArr[1].e);
        }
    }
}
