package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.eq;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public abstract class o5 extends TextView {
    public boolean a;
    public final org.telegram.ui.Components.f6 b;
    public final eq c;

    public o5(Context context) {
        super(context);
        this.a = false;
        this.b = new org.telegram.ui.Components.f6(this, 320L, bs.h);
        this.c = new eq(-1);
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
            eq eqVar = this.c;
            eqVar.setAlpha((int) (e * 255.0f));
            eqVar.setBounds(dp - (eqVar.getIntrinsicWidth() / 2), height - (eqVar.getIntrinsicWidth() / 2), (eqVar.getIntrinsicWidth() / 2) + dp, (eqVar.getIntrinsicHeight() / 2) + height);
            eqVar.draw(canvas2);
            invalidate();
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        this.c.b(i10);
    }
}
