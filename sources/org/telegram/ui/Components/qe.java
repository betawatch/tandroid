package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
        org.telegram.ui.mb0 mb0Var = new org.telegram.ui.mb0(this, context, 7);
        this.c = mb0Var;
        mb0Var.setOverScrollMode(2);
        mb0Var.setClipToPadding(false);
        mb0Var.setClipToOutline(true);
        mb0Var.j(new cu0(this, 28));
        addView(mb0Var);
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
