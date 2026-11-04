package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class l5 extends TextView {
    public boolean a;
    public final org.telegram.ui.Components.u5 b;
    public final cp c;

    public l5(Context context) {
        super(context);
        this.a = false;
        this.b = new org.telegram.ui.Components.u5(this, 320L, xq.h);
        this.c = new cp(-1);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.b.d(this.a);
        if (d < 1.0f) {
            if (d <= 0.0f) {
                canvas.save();
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - d) * 255.0f), 31);
            }
            canvas2.translate(0.0f, org.telegram.messenger.g0.L(6.0f) * d);
            super.onDraw(canvas2);
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        if (d > 0.0f) {
            int width = getWidth() / 2;
            int height = getHeight() / 2;
            int L = width - ((int) ((1.0f - d) * org.telegram.messenger.g0.L(6.0f)));
            cp cpVar = this.c;
            cpVar.setAlpha((int) (d * 255.0f));
            cpVar.setBounds(L - (cpVar.getIntrinsicWidth() / 2), height - (cpVar.getIntrinsicWidth() / 2), (cpVar.getIntrinsicWidth() / 2) + L, (cpVar.getIntrinsicHeight() / 2) + height);
            cpVar.draw(canvas2);
            invalidate();
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(int i3) {
        super.setTextColor(i3);
        this.c.b(i3);
    }
}
