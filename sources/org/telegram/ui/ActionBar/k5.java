package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.jq;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public abstract class k5 extends TextView {
    public boolean a;
    public final org.telegram.ui.Components.g6 b;
    public final jq c;

    public k5(Context context) {
        super(context);
        this.a = false;
        this.b = new org.telegram.ui.Components.g6(this, 320L, hs.h);
        this.c = new jq(-1);
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
            jq jqVar = this.c;
            jqVar.setAlpha((int) (e7 * 255.0f));
            jqVar.setBounds(dp - (jqVar.getIntrinsicWidth() / 2), height - (jqVar.getIntrinsicWidth() / 2), (jqVar.getIntrinsicWidth() / 2) + dp, (jqVar.getIntrinsicHeight() / 2) + height);
            jqVar.draw(canvas2);
            invalidate();
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        this.c.b(i10);
    }
}
