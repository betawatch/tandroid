package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gq;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public abstract class c6 extends TextView {
    public boolean a;
    public final org.telegram.ui.Components.h6 b;
    public final gq c;

    public c6(Context context) {
        super(context);
        this.a = false;
        this.b = new org.telegram.ui.Components.h6(this, 320L, ds.h);
        this.c = new gq(-1);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float e = this.b.e(this.a);
        if (e < 1.0f) {
            if (e <= 0.0f) {
                canvas.save();
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - e) * 255.0f), 31);
            }
            canvas2.translate(0.0f, AndroidUtilities.dp(6.0f) * e);
            super.onDraw(canvas2);
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        if (e > 0.0f) {
            int width = getWidth() / 2;
            int height = getHeight() / 2;
            int dp = width - ((int) ((1.0f - e) * AndroidUtilities.dp(6.0f)));
            gq gqVar = this.c;
            gqVar.setAlpha((int) (e * 255.0f));
            gqVar.setBounds(dp - (gqVar.getIntrinsicWidth() / 2), height - (gqVar.getIntrinsicWidth() / 2), (gqVar.getIntrinsicWidth() / 2) + dp, (gqVar.getIntrinsicHeight() / 2) + height);
            gqVar.draw(canvas2);
            invalidate();
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        this.c.b(i10);
    }
}
