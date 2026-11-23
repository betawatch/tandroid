package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.up;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public abstract class n5 extends TextView {
    public boolean a;
    public final org.telegram.ui.Components.d6 b;
    public final up c;

    public n5(Context context) {
        super(context);
        this.a = false;
        this.b = new org.telegram.ui.Components.d6(this, 320L, nr.h);
        this.c = new up(-1);
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
            up upVar = this.c;
            upVar.setAlpha((int) (d * 255.0f));
            upVar.setBounds(L - (upVar.getIntrinsicWidth() / 2), height - (upVar.getIntrinsicWidth() / 2), (upVar.getIntrinsicWidth() / 2) + L, (upVar.getIntrinsicHeight() / 2) + height);
            upVar.draw(canvas2);
            invalidate();
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(int i7) {
        super.setTextColor(i7);
        this.c.b(i7);
    }
}
