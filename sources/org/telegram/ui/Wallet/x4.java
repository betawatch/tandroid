package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.us;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final class x4 extends us {
    public final ShapeDrawable G;

    public x4(o5 o5Var, Context context) {
        super(context);
        this.G = org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(22.0f), o5Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
    }

    @Override // org.telegram.ui.Components.us, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int ceil = (int) Math.ceil(getMetadata().g.a);
        if (ceil > 0) {
            int width = getWidth();
            ShapeDrawable shapeDrawable = this.G;
            shapeDrawable.setBounds(0, 0, width, ceil);
            shapeDrawable.setAlpha((int) (getMetadata().c.a * 255.0f));
            shapeDrawable.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }
}
