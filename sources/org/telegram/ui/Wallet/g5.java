package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g5 extends pr {
    public final ShapeDrawable H;
    public final /* synthetic */ w5 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(w5 w5Var, Context context) {
        super(context);
        this.I = w5Var;
        this.H = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(22.0f), w5Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
    }

    @Override // org.telegram.ui.Components.pr, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int ceil = (int) Math.ceil(getMetadata().g.a);
        if (ceil > 0) {
            ShapeDrawable shapeDrawable = this.H;
            shapeDrawable.getPaint().setColor(this.I.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
            shapeDrawable.setBounds(0, 0, getWidth(), ceil);
            shapeDrawable.setAlpha((int) (getMetadata().c.a * 255.0f));
            shapeDrawable.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }
}
