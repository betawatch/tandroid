package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class pf extends fi.x {
    public boolean s;
    public final /* synthetic */ ChatActivityEnterView v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pf(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.v = chatActivityEnterView;
        this.a = null;
        Paint paint = new Paint(1);
        this.d = paint;
        this.f = true;
        this.b = new b2.v0();
        bi.o0 o0Var = new bi.o0(this, context, 2);
        this.c = o0Var;
        o0Var.setOverScrollMode(2);
        o0Var.setClipToPadding(false);
        o0Var.setClipToOutline(true);
        o0Var.j(new ah.d0(this, 4));
        addView(o0Var);
        paint.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Ii, false));
        dh.d dVar = this.r;
        if (dVar != null) {
            dVar.v();
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
        this.v.z1();
    }
}
