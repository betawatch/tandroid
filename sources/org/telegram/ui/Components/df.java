package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class df extends rh.v {
    public boolean s;
    public final /* synthetic */ ChatActivityEnterView v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.v = chatActivityEnterView;
        this.a = null;
        Paint paint = new Paint(1);
        this.d = paint;
        this.f = true;
        this.b = new c5.e();
        org.telegram.ui.d81 d81Var = new org.telegram.ui.d81(this, context, 2);
        this.c = d81Var;
        d81Var.setOverScrollMode(2);
        d81Var.setClipToPadding(false);
        d81Var.setClipToOutline(true);
        d81Var.j(new mb0(this, 14));
        addView(d81Var);
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ii, false));
        pg.b bVar = this.r;
        if (bVar != null) {
            bVar.u();
        }
        invalidate();
        setClipChildren(false);
        this.s = false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        if (this.s) {
            return;
        }
        this.s = true;
        this.v.C1();
    }
}
