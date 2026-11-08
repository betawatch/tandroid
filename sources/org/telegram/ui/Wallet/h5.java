package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final class h5 extends pr {
    public final ShapeDrawable G;
    public final /* synthetic */ x5 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(x5 x5Var, Context context) {
        super(context);
        this.H = x5Var;
        this.G = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(22.0f), x5Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
    }

    @Override // org.telegram.ui.Components.pr, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int ceil = (int) Math.ceil(getMetadata().g.a);
        if (ceil > 0) {
            ShapeDrawable shapeDrawable = this.G;
            shapeDrawable.getPaint().setColor(this.H.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
            shapeDrawable.setBounds(0, 0, getWidth(), ceil);
            shapeDrawable.setAlpha((int) (getMetadata().c.a * 255.0f));
            shapeDrawable.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }
}
