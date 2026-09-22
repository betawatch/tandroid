package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.tp;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class wa extends TextView {
    public boolean a;
    public final org.telegram.ui.Components.d6 b;
    public tp c;

    public wa(Context context) {
        super(context);
        this.b = new org.telegram.ui.Components.d6(this, 0L, 350L, qr.h);
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
        float e = this.b.e(this.a);
        if (e <= 0.0f) {
            super.onDraw(canvas);
            return;
        }
        if (e < 1.0f) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - e) * 255.0f), 31);
            float f7 = 1.0f - (0.2f * e);
            canvas2.scale(f7, f7, getWidth() / 2.0f, getHeight() / 2.0f);
            canvas2.translate(0.0f, AndroidUtilities.dp(-12.0f) * e);
            super.onDraw(canvas2);
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        if (this.c == null) {
            tp tpVar = new tp(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(2.0f), getCurrentTextColor());
            this.c = tpVar;
            tpVar.setCallback(this);
        }
        this.c.b(getCurrentTextColor());
        float f10 = 1.0f - e;
        this.c.setBounds(getWidth() / 2, (getHeight() / 2) + ((int) (AndroidUtilities.dp(12.0f) * f10)), getWidth() / 2, (getHeight() / 2) + ((int) (f10 * AndroidUtilities.dp(12.0f))));
        this.c.setAlpha((int) (e * 255.0f));
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
