package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class er0 extends FrameLayout {
    public org.telegram.ui.ActionBar.n2 a;
    public FrameLayout b;
    public org.telegram.ui.ActionBar.k c;
    public org.telegram.ui.Components.ll0 d;
    public int e;
    public final /* synthetic */ gr0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public er0(gr0 gr0Var, Context context) {
        super(context);
        this.f = gr0Var;
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        er0 er0Var;
        super.setTranslationX(f7);
        gr0 gr0Var = this.f;
        er0[] er0VarArr = gr0Var.n;
        if (gr0Var.s && (er0Var = er0VarArr[0]) == this) {
            gr0Var.h.j(Math.abs(er0Var.getTranslationX()) / er0VarArr[0].getMeasuredWidth(), er0VarArr[1].e);
        }
    }
}
