package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class gr0 extends FrameLayout {
    public org.telegram.ui.ActionBar.o2 a;
    public FrameLayout b;
    public org.telegram.ui.ActionBar.k c;
    public org.telegram.ui.Components.ml0 d;
    public int e;
    public final /* synthetic */ ir0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gr0(ir0 ir0Var, Context context) {
        super(context);
        this.f = ir0Var;
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        gr0 gr0Var;
        super.setTranslationX(f7);
        ir0 ir0Var = this.f;
        gr0[] gr0VarArr = ir0Var.n;
        if (ir0Var.s && (gr0Var = gr0VarArr[0]) == this) {
            ir0Var.h.j(Math.abs(gr0Var.getTranslationX()) / gr0VarArr[0].getMeasuredWidth(), gr0VarArr[1].e);
        }
    }
}
