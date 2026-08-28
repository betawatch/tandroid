package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.jp;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class i5 extends TextView {
    public boolean a;
    public final org.telegram.ui.Components.y5 b;
    public final jp c;

    public i5(Context context) {
        super(context);
        this.a = false;
        this.b = new org.telegram.ui.Components.y5(this, 320L, gr.h);
        this.c = new jp(-1);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float e10 = this.b.e(this.a);
        if (e10 < 1.0f) {
            if (e10 <= 0.0f) {
                canvas.save();
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - e10) * 255.0f), 31);
            }
            canvas2.translate(0.0f, AndroidUtilities.dp(6.0f) * e10);
            super.onDraw(canvas2);
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        if (e10 > 0.0f) {
            int width = getWidth() / 2;
            int height = getHeight() / 2;
            int dp = width - ((int) ((1.0f - e10) * AndroidUtilities.dp(6.0f)));
            jp jpVar = this.c;
            jpVar.setAlpha((int) (e10 * 255.0f));
            jpVar.setBounds(dp - (jpVar.getIntrinsicWidth() / 2), height - (jpVar.getIntrinsicWidth() / 2), (jpVar.getIntrinsicWidth() / 2) + dp, (jpVar.getIntrinsicHeight() / 2) + height);
            jpVar.draw(canvas2);
            invalidate();
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(int i9) {
        super.setTextColor(i9);
        this.c.b(i9);
    }
}
