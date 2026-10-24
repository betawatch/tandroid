package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.us;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class w4 extends us {
    public final ShapeDrawable G;
    public final /* synthetic */ o5 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(o5 o5Var, Context context) {
        super(context);
        this.H = o5Var;
        this.G = org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(22.0f), o5Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
    }

    @Override // org.telegram.ui.Components.us, android.view.ViewGroup, android.view.View
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
