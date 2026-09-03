package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class df extends sh.v {
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
        org.telegram.ui.c81 c81Var = new org.telegram.ui.c81(this, context, 2);
        this.c = c81Var;
        c81Var.setOverScrollMode(2);
        c81Var.setClipToPadding(false);
        c81Var.setClipToOutline(true);
        c81Var.j(new nb0(this, 14));
        addView(c81Var);
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Ii, false));
        qg.b bVar = this.r;
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
