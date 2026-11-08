package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class la extends TextView {
    public boolean a;
    public final org.telegram.ui.Components.w5 b;
    public cp c;

    public la(Context context) {
        super(context);
        this.b = new org.telegram.ui.Components.w5(this, 0L, 350L, xq.h);
    }

    public final void a(boolean z9, boolean z10) {
        this.a = z9;
        boolean z11 = true;
        if (!z10) {
            this.b.f(z9, true);
        }
        if (!isPressed() && !z9) {
            z11 = false;
        }
        super.setPressed(z11);
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
            float f10 = 1.0f - (0.2f * d);
            canvas2.scale(f10, f10, getWidth() / 2.0f, getHeight() / 2.0f);
            canvas2.translate(0.0f, org.telegram.messenger.g0.L(-12.0f) * d);
            super.onDraw(canvas2);
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        if (this.c == null) {
            cp cpVar = new cp(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(2.0f), getCurrentTextColor());
            this.c = cpVar;
            cpVar.setCallback(this);
        }
        this.c.b(getCurrentTextColor());
        float f11 = 1.0f - d;
        this.c.setBounds(getWidth() / 2, (getHeight() / 2) + ((int) (org.telegram.messenger.g0.L(12.0f) * f11)), getWidth() / 2, (getHeight() / 2) + ((int) (f11 * org.telegram.messenger.g0.L(12.0f))));
        this.c.setAlpha((int) (d * 255.0f));
        this.c.draw(canvas2);
        invalidate();
    }

    @Override // android.view.View
    public final void setPressed(boolean z9) {
        super.setPressed(z9 || this.a);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.c == drawable || super.verifyDrawable(drawable);
    }
}
