package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.sp;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public abstract class k5 extends TextView {
    public boolean a;
    public final org.telegram.ui.Components.e6 b;
    public final sp c;

    public k5(Context context) {
        super(context);
        this.a = false;
        this.b = new org.telegram.ui.Components.e6(this, 320L, pr.h);
        this.c = new sp(-1);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float e7 = this.b.e(this.a);
        if (e7 < 1.0f) {
            if (e7 <= 0.0f) {
                canvas.save();
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - e7) * 255.0f), 31);
            }
            canvas2.translate(0.0f, AndroidUtilities.dp(6.0f) * e7);
            super.onDraw(canvas2);
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        if (e7 > 0.0f) {
            int width = getWidth() / 2;
            int height = getHeight() / 2;
            int dp = width - ((int) ((1.0f - e7) * AndroidUtilities.dp(6.0f)));
            sp spVar = this.c;
            spVar.setAlpha((int) (e7 * 255.0f));
            spVar.setBounds(dp - (spVar.getIntrinsicWidth() / 2), height - (spVar.getIntrinsicWidth() / 2), (spVar.getIntrinsicWidth() / 2) + dp, (spVar.getIntrinsicHeight() / 2) + height);
            spVar.draw(canvas2);
            invalidate();
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        this.c.b(i10);
    }
}
