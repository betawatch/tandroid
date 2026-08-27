package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.hp;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class i5 extends TextView {
    public boolean a;
    public final org.telegram.ui.Components.y5 b;
    public final hp c;

    public i5(Context context) {
        super(context);
        this.a = false;
        this.b = new org.telegram.ui.Components.y5(this, 320L, er.h);
        this.c = new hp(-1);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float e9 = this.b.e(this.a);
        if (e9 < 1.0f) {
            if (e9 <= 0.0f) {
                canvas.save();
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - e9) * 255.0f), 31);
            }
            canvas2.translate(0.0f, AndroidUtilities.dp(6.0f) * e9);
            super.onDraw(canvas2);
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        if (e9 > 0.0f) {
            int width = getWidth() / 2;
            int height = getHeight() / 2;
            int dp = width - ((int) ((1.0f - e9) * AndroidUtilities.dp(6.0f)));
            hp hpVar = this.c;
            hpVar.setAlpha((int) (e9 * 255.0f));
            hpVar.setBounds(dp - (hpVar.getIntrinsicWidth() / 2), height - (hpVar.getIntrinsicWidth() / 2), (hpVar.getIntrinsicWidth() / 2) + dp, (hpVar.getIntrinsicHeight() / 2) + height);
            hpVar.draw(canvas2);
            invalidate();
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        this.c.b(i10);
    }
}
