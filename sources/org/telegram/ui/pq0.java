package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class pq0 extends FrameLayout {
    public org.telegram.ui.ActionBar.o2 a;
    public FrameLayout b;
    public org.telegram.ui.ActionBar.k c;
    public org.telegram.ui.Components.mm0 d;
    public int e;
    public final /* synthetic */ rq0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pq0(rq0 rq0Var, Context context) {
        super(context);
        this.f = rq0Var;
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        pq0 pq0Var;
        super.setTranslationX(f7);
        rq0 rq0Var = this.f;
        pq0[] pq0VarArr = rq0Var.n;
        if (rq0Var.s && (pq0Var = pq0VarArr[0]) == this) {
            rq0Var.h.i(Math.abs(pq0Var.getTranslationX()) / pq0VarArr[0].getMeasuredWidth(), pq0VarArr[1].e);
        }
    }
}
