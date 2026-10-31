package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.kp;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class la extends TextView {
    public boolean a;
    public final org.telegram.ui.Components.t5 b;
    public kp c;

    public la(Context context) {
        super(context);
        this.b = new org.telegram.ui.Components.t5(this, 0L, 350L, gr.h);
    }

    public final void a(boolean z10, boolean z11) {
        this.a = z10;
        boolean z12 = true;
        if (!z11) {
            this.b.f(z10, true);
        }
        if (!isPressed() && !z10) {
            z12 = false;
        }
        super.setPressed(z12);
        invalidate();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.b.d(this.a);
        if (d <= 0.0f) {
            super.onDraw(canvas);
            return;
        }
        if (d < 1.0f) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - d) * 255.0f), 31);
            float f7 = 1.0f - (0.2f * d);
            canvas2.scale(f7, f7, getWidth() / 2.0f, getHeight() / 2.0f);
            canvas2.translate(0.0f, org.telegram.messenger.i0.L(-12.0f) * d);
            super.onDraw(canvas2);
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        if (this.c == null) {
            kp kpVar = new kp(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(2.0f), getCurrentTextColor());
            this.c = kpVar;
            kpVar.setCallback(this);
        }
        this.c.b(getCurrentTextColor());
        float f10 = 1.0f - d;
        this.c.setBounds(getWidth() / 2, (getHeight() / 2) + ((int) (org.telegram.messenger.i0.L(12.0f) * f10)), getWidth() / 2, (getHeight() / 2) + ((int) (f10 * org.telegram.messenger.i0.L(12.0f))));
        this.c.setAlpha((int) (d * 255.0f));
        this.c.draw(canvas2);
        invalidate();
    }

    @Override // android.view.View
    public final void setPressed(boolean z10) {
        super.setPressed(z10 || this.a);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.c == drawable || super.verifyDrawable(drawable);
    }
}
