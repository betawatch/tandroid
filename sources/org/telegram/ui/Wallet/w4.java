package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.us;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class w4 extends us {
    public final ki.c2 G;

    public w4(n5 n5Var, Context context) {
        super(context);
        this.G = new ki.c2(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(22.0f), n5Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6)), AndroidUtilities.dpf2(2.67f), AndroidUtilities.dpf2(0.67f));
    }

    @Override // org.telegram.ui.Components.us, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int ceil = (int) Math.ceil(getMetadata().g.a);
        if (ceil > 0) {
            int width = getWidth();
            ki.c2 c2Var = this.G;
            c2Var.setBounds(0, 0, width, ceil);
            c2Var.setAlpha((int) (getMetadata().c.a * 255.0f));
            c2Var.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }
}
