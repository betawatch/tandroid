package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class ve extends hi.u {
    public boolean s;
    public final /* synthetic */ ChatActivityEnterView w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ve(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.w = chatActivityEnterView;
        this.a = null;
        Paint paint = new Paint(1);
        this.d = paint;
        this.f = true;
        this.b = new e2.r0();
        bi.q1 q1Var = new bi.q1(4, context, this);
        this.c = q1Var;
        q1Var.setOverScrollMode(2);
        q1Var.setClipToPadding(false);
        q1Var.setClipToOutline(true);
        q1Var.j(new ai.b(this, 14));
        addView(q1Var);
        paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.wj, false));
        fh.g gVar = this.r;
        if (gVar != null) {
            gVar.updateColors();
        }
        invalidate();
        setClipChildren(false);
        this.s = false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        if (this.s) {
            return;
        }
        this.s = true;
        this.w.E1();
    }
}
