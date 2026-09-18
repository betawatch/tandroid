package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class fr0 extends FrameLayout {
    public org.telegram.ui.ActionBar.n2 a;
    public FrameLayout b;
    public org.telegram.ui.ActionBar.k c;
    public org.telegram.ui.Components.wl0 d;
    public int e;
    public final /* synthetic */ hr0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fr0(hr0 hr0Var, Context context) {
        super(context);
        this.f = hr0Var;
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        fr0 fr0Var;
        super.setTranslationX(f7);
        hr0 hr0Var = this.f;
        fr0[] fr0VarArr = hr0Var.n;
        if (hr0Var.s && (fr0Var = fr0VarArr[0]) == this) {
            hr0Var.h.j(Math.abs(fr0Var.getTranslationX()) / fr0VarArr[0].getMeasuredWidth(), fr0VarArr[1].e);
        }
    }
}
