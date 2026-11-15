package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.lp;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public abstract class k5 extends TextView {
    public boolean a;
    public final org.telegram.ui.Components.u5 b;
    public final lp c;

    public k5(Context context) {
        super(context);
        this.a = false;
        this.b = new org.telegram.ui.Components.u5(this, 320L, er.h);
        this.c = new lp(-1);
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
            lp lpVar = this.c;
            lpVar.setAlpha((int) (d * 255.0f));
            lpVar.setBounds(L - (lpVar.getIntrinsicWidth() / 2), height - (lpVar.getIntrinsicWidth() / 2), (lpVar.getIntrinsicWidth() / 2) + L, (lpVar.getIntrinsicHeight() / 2) + height);
            lpVar.draw(canvas2);
            invalidate();
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(int i7) {
        super.setTextColor(i7);
        this.c.b(i7);
    }
}
