package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final class i5 extends pr {
    public final ShapeDrawable G;
    public final /* synthetic */ y5 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(y5 y5Var, Context context) {
        super(context);
        this.H = y5Var;
        this.G = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(22.0f), y5Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
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
