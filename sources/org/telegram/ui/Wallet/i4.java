package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.xs;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class i4 extends xs {
    public final ji.c2 G;

    public i4(z4 z4Var, Context context) {
        super(context);
        this.G = new ji.c2(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(22.0f), z4Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6)), AndroidUtilities.dpf2(2.67f), AndroidUtilities.dpf2(0.67f));
    }

    @Override // org.telegram.ui.Components.xs, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int ceil = (int) Math.ceil(getMetadata().g.a);
        if (ceil > 0) {
            int width = getWidth();
            ji.c2 c2Var = this.G;
            c2Var.setBounds(0, 0, width, ceil);
            c2Var.setAlpha((int) (getMetadata().c.a * 255.0f));
            c2Var.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }
}
