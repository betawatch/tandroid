package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ws;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class u4 extends ws {
    public final ShapeDrawable G;
    public final /* synthetic */ m5 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(m5 m5Var, Context context) {
        super(context);
        this.H = m5Var;
        this.G = org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(22.0f), m5Var.getThemedColor(org.telegram.ui.ActionBar.y6.d6));
    }

    @Override // org.telegram.ui.Components.ws, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int ceil = (int) Math.ceil(getMetadata().g.a);
        if (ceil > 0) {
            ShapeDrawable shapeDrawable = this.G;
            shapeDrawable.getPaint().setColor(this.H.getThemedColor(org.telegram.ui.ActionBar.y6.d6));
            shapeDrawable.setBounds(0, 0, getWidth(), ceil);
            shapeDrawable.setAlpha((int) (getMetadata().c.a * 255.0f));
            shapeDrawable.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }
}
