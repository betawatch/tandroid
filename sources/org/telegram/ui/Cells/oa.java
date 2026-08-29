package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.np;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class oa extends TextView {
    public boolean a;
    public final org.telegram.ui.Components.d6 b;
    public np c;

    public oa(Context context) {
        super(context);
        this.b = new org.telegram.ui.Components.d6(this, 0L, 350L, jr.h);
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
        float e10 = this.b.e(this.a);
        if (e10 <= 0.0f) {
            super.onDraw(canvas);
            return;
        }
        if (e10 < 1.0f) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - e10) * 255.0f), 31);
            float f9 = 1.0f - (0.2f * e10);
            canvas2.scale(f9, f9, getWidth() / 2.0f, getHeight() / 2.0f);
            canvas2.translate(0.0f, AndroidUtilities.dp(-12.0f) * e10);
            super.onDraw(canvas2);
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        if (this.c == null) {
            np npVar = new np(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(2.0f), getCurrentTextColor());
            this.c = npVar;
            npVar.setCallback(this);
        }
        this.c.b(getCurrentTextColor());
        float f10 = 1.0f - e10;
        this.c.setBounds(getWidth() / 2, (getHeight() / 2) + ((int) (AndroidUtilities.dp(12.0f) * f10)), getWidth() / 2, (getHeight() / 2) + ((int) (f10 * AndroidUtilities.dp(12.0f))));
        this.c.setAlpha((int) (e10 * 255.0f));
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
