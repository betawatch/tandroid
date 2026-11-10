package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.or;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class j5 extends or {
    public final ShapeDrawable G;
    public final /* synthetic */ z5 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(z5 z5Var, Context context) {
        super(context);
        this.H = z5Var;
        this.G = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(22.0f), z5Var.getThemedColor(org.telegram.ui.ActionBar.m6.d6));
    }

    @Override // org.telegram.ui.Components.or, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int ceil = (int) Math.ceil(getMetadata().g.a);
        if (ceil > 0) {
            ShapeDrawable shapeDrawable = this.G;
            shapeDrawable.getPaint().setColor(this.H.getThemedColor(org.telegram.ui.ActionBar.m6.d6));
            shapeDrawable.setBounds(0, 0, getWidth(), ceil);
            shapeDrawable.setAlpha((int) (getMetadata().c.a * 255.0f));
            shapeDrawable.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }
}
