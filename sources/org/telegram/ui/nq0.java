package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class nq0 extends FrameLayout {
    public org.telegram.ui.ActionBar.n2 a;
    public FrameLayout b;
    public org.telegram.ui.ActionBar.k c;
    public org.telegram.ui.Components.im0 d;
    public int e;
    public final /* synthetic */ pq0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nq0(pq0 pq0Var, Context context) {
        super(context);
        this.f = pq0Var;
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        nq0 nq0Var;
        super.setTranslationX(f7);
        pq0 pq0Var = this.f;
        nq0[] nq0VarArr = pq0Var.n;
        if (pq0Var.s && (nq0Var = nq0VarArr[0]) == this) {
            pq0Var.h.j(Math.abs(nq0Var.getTranslationX()) / nq0VarArr[0].getMeasuredWidth(), nq0VarArr[1].e);
        }
    }
}
