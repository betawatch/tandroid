package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.tp;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public abstract class m5 extends TextView {
    public boolean a;
    public final org.telegram.ui.Components.z5 b;
    public final tp c;

    public m5(Context context) {
        super(context);
        this.a = false;
        this.b = new org.telegram.ui.Components.z5(this, 320L, pr.h);
        this.c = new tp(-1);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float e6 = this.b.e(this.a);
        if (e6 < 1.0f) {
            if (e6 <= 0.0f) {
                canvas.save();
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - e6) * 255.0f), 31);
            }
            canvas2.translate(0.0f, AndroidUtilities.dp(6.0f) * e6);
            super.onDraw(canvas2);
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        if (e6 > 0.0f) {
            int width = getWidth() / 2;
            int height = getHeight() / 2;
            int dp = width - ((int) ((1.0f - e6) * AndroidUtilities.dp(6.0f)));
            tp tpVar = this.c;
            tpVar.setAlpha((int) (e6 * 255.0f));
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
