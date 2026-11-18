package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.sp;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public abstract class o5 extends TextView {
    public boolean a;
    public final org.telegram.ui.Components.c6 b;
    public final sp c;

    public o5(Context context) {
        super(context);
        this.a = false;
        this.b = new org.telegram.ui.Components.c6(this, 320L, lr.h);
        this.c = new sp(-1);
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
            sp spVar = this.c;
            spVar.setAlpha((int) (d * 255.0f));
            spVar.setBounds(L - (spVar.getIntrinsicWidth() / 2), height - (spVar.getIntrinsicWidth() / 2), (spVar.getIntrinsicWidth() / 2) + L, (spVar.getIntrinsicHeight() / 2) + height);
            spVar.draw(canvas2);
            invalidate();
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(int i7) {
        super.setTextColor(i7);
        this.c.b(i7);
    }
}
