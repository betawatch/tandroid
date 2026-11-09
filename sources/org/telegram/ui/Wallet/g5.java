package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class g5 extends pr {
    public final ShapeDrawable G;
    public final /* synthetic */ w5 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(w5 w5Var, Context context) {
        super(context);
        this.H = w5Var;
        this.G = org.telegram.ui.ActionBar.l6.d0(org.telegram.messenger.g0.L(22.0f), w5Var.getThemedColor(org.telegram.ui.ActionBar.l6.d6));
    }

    @Override // org.telegram.ui.Components.pr, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int ceil = (int) Math.ceil(getMetadata().g.a);
        if (ceil > 0) {
            ShapeDrawable shapeDrawable = this.G;
            shapeDrawable.getPaint().setColor(this.H.getThemedColor(org.telegram.ui.ActionBar.l6.d6));
            shapeDrawable.setBounds(0, 0, getWidth(), ceil);
            shapeDrawable.setAlpha((int) (getMetadata().c.a * 255.0f));
            shapeDrawable.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }
}
