package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.tp;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public abstract class k5 extends TextView {
    public boolean a;
    public final org.telegram.ui.Components.d6 b;
    public final tp c;

    public k5(Context context) {
        super(context);
        this.a = false;
        this.b = new org.telegram.ui.Components.d6(this, 320L, qr.h);
        this.c = new tp(-1);
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
            tp tpVar = this.c;
            tpVar.setAlpha((int) (e * 255.0f));
            tpVar.setBounds(dp - (tpVar.getIntrinsicWidth() / 2), height - (tpVar.getIntrinsicWidth() / 2), (tpVar.getIntrinsicWidth() / 2) + dp, (tpVar.getIntrinsicHeight() / 2) + height);
            tpVar.draw(canvas2);
            invalidate();
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        this.c.b(i10);
    }
}
