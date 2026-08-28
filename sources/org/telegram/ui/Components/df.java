package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class df extends mh.y {
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
        this.b = new d5.p();
        gh.f1 f1Var = new gh.f1(this, context, 3);
        this.c = f1Var;
        f1Var.setOverScrollMode(2);
        f1Var.setClipToPadding(false);
        f1Var.setClipToOutline(true);
        f1Var.j(new bg.o2(this, 14));
        addView(f1Var);
        paint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Ii, false));
        kg.d dVar = this.r;
        if (dVar != null) {
            dVar.u();
        }
        invalidate();
        setClipChildren(false);
        this.s = false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        if (this.s) {
            return;
        }
        this.s = true;
        this.v.C1();
    }
}
