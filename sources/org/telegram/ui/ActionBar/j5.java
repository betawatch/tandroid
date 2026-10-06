package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.wp;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public abstract class j5 extends TextView {
    public boolean a;
    public final org.telegram.ui.Components.e6 b;
    public final wp c;

    public j5(Context context) {
        super(context);
        this.a = false;
        this.b = new org.telegram.ui.Components.e6(this, 320L, tr.h);
        this.c = new wp(-1);
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
            wp wpVar = this.c;
            wpVar.setAlpha((int) (e7 * 255.0f));
            wpVar.setBounds(dp - (wpVar.getIntrinsicWidth() / 2), height - (wpVar.getIntrinsicWidth() / 2), (wpVar.getIntrinsicWidth() / 2) + dp, (wpVar.getIntrinsicHeight() / 2) + height);
            wpVar.draw(canvas2);
            invalidate();
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        this.c.b(i10);
    }
}
