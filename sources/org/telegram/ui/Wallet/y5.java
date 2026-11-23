package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.bs;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class y5 extends bs {
    public final ShapeDrawable H;
    public final /* synthetic */ o6 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(o6 o6Var, Context context) {
        super(context);
        this.I = o6Var;
        this.H = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(22.0f), o6Var.getThemedColor(org.telegram.ui.ActionBar.n6.d6));
    }

    @Override // org.telegram.ui.Components.bs, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int ceil = (int) Math.ceil(getMetadata().g.a);
        if (ceil > 0) {
            ShapeDrawable shapeDrawable = this.H;
            shapeDrawable.getPaint().setColor(this.I.getThemedColor(org.telegram.ui.ActionBar.n6.d6));
            shapeDrawable.setBounds(0, 0, getWidth(), ceil);
            shapeDrawable.setAlpha((int) (getMetadata().c.a * 255.0f));
            shapeDrawable.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }
}
