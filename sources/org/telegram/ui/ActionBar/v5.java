package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.kp;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class v5 extends TextView {
    public boolean a;
    public final org.telegram.ui.Components.t5 b;
    public final kp c;

    public v5(Context context) {
        super(context);
        this.a = false;
        this.b = new org.telegram.ui.Components.t5(this, 320L, gr.h);
        this.c = new kp(-1);
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
            canvas2.translate(0.0f, org.telegram.messenger.i0.L(6.0f) * d);
            super.onDraw(canvas2);
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        if (d > 0.0f) {
            int width = getWidth() / 2;
            int height = getHeight() / 2;
            int L = width - ((int) ((1.0f - d) * org.telegram.messenger.i0.L(6.0f)));
            kp kpVar = this.c;
            kpVar.setAlpha((int) (d * 255.0f));
            kpVar.setBounds(L - (kpVar.getIntrinsicWidth() / 2), height - (kpVar.getIntrinsicWidth() / 2), (kpVar.getIntrinsicWidth() / 2) + L, (kpVar.getIntrinsicHeight() / 2) + height);
            kpVar.draw(canvas2);
            invalidate();
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        this.c.b(i10);
    }
}
