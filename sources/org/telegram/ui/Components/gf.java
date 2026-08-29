package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class gf extends ph.v {
    public boolean s;
    public final /* synthetic */ ChatActivityEnterView v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.v = chatActivityEnterView;
        this.a = null;
        Paint paint = new Paint(1);
        this.d = paint;
        this.f = true;
        this.b = new a5.e();
        org.telegram.ui.i71 i71Var = new org.telegram.ui.i71(this, context, 1);
        this.c = i71Var;
        i71Var.setOverScrollMode(2);
        i71Var.setClipToPadding(false);
        i71Var.setClipToOutline(true);
        i71Var.j(new h00(this, 14));
        addView(i71Var);
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ii, false));
        ng.d dVar = this.r;
        if (dVar != null) {
            dVar.u();
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
        this.v.C1();
    }
}
