package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.zr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class k5 extends zr {
    public final ShapeDrawable G;
    public final /* synthetic */ b6 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(b6 b6Var, Context context) {
        super(context);
        this.H = b6Var;
        this.G = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), b6Var.getThemedColor(org.telegram.ui.ActionBar.t6.d6));
    }

    @Override // org.telegram.ui.Components.zr, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int ceil = (int) Math.ceil(getMetadata().g.a);
        if (ceil > 0) {
            ShapeDrawable shapeDrawable = this.G;
            shapeDrawable.getPaint().setColor(this.H.getThemedColor(org.telegram.ui.ActionBar.t6.d6));
            shapeDrawable.setBounds(0, 0, getWidth(), ceil);
            shapeDrawable.setAlpha((int) (getMetadata().c.a * 255.0f));
            shapeDrawable.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }
}
