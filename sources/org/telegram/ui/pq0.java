package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class pq0 extends FrameLayout {
    public org.telegram.ui.ActionBar.p2 a;
    public FrameLayout b;
    public org.telegram.ui.ActionBar.k c;
    public org.telegram.ui.Components.rl0 d;
    public int e;
    public final /* synthetic */ rq0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pq0(rq0 rq0Var, Context context) {
        super(context);
        this.f = rq0Var;
    }

    @Override // android.view.View
    public final void setTranslationX(float f10) {
        pq0 pq0Var;
        super.setTranslationX(f10);
        rq0 rq0Var = this.f;
        pq0[] pq0VarArr = rq0Var.n;
        if (rq0Var.s && (pq0Var = pq0VarArr[0]) == this) {
            rq0Var.h.j(Math.abs(pq0Var.getTranslationX()) / pq0VarArr[0].getMeasuredWidth(), pq0VarArr[1].e);
        }
    }
}
