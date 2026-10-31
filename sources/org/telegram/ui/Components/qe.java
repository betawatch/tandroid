package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class qe extends xh.s {
    public boolean s;
    public final /* synthetic */ ChatActivityEnterView w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qe(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.w = chatActivityEnterView;
        this.a = null;
        Paint paint = new Paint(1);
        this.d = paint;
        this.f = true;
        this.b = new ac.g();
        org.telegram.ui.nb0 nb0Var = new org.telegram.ui.nb0(this, context, 7);
        this.c = nb0Var;
        nb0Var.setOverScrollMode(2);
        nb0Var.setClipToPadding(false);
        nb0Var.setClipToOutline(true);
        nb0Var.j(new bu0(this, 28));
        addView(nb0Var);
        paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.wj, false));
        vg.f fVar = this.r;
        if (fVar != null) {
            fVar.updateColors();
        }
        invalidate();
        setClipChildren(false);
        this.s = false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.s) {
            return;
        }
        this.s = true;
        this.w.B1();
    }
}
