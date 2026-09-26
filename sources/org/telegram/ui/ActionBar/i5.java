package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.up;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public abstract class i5 extends TextView {
    public boolean a;
    public final org.telegram.ui.Components.e6 b;
    public final up c;

    public i5(Context context) {
        super(context);
        this.a = false;
        this.b = new org.telegram.ui.Components.e6(this, 320L, rr.h);
        this.c = new up(-1);
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
            up upVar = this.c;
            upVar.setAlpha((int) (e * 255.0f));
            upVar.setBounds(dp - (upVar.getIntrinsicWidth() / 2), height - (upVar.getIntrinsicWidth() / 2), (upVar.getIntrinsicWidth() / 2) + dp, (upVar.getIntrinsicHeight() / 2) + height);
            upVar.draw(canvas2);
            invalidate();
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        this.c.b(i10);
    }
}
