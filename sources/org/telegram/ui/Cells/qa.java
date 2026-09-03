package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.qp;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class qa extends TextView {
    public boolean a;
    public final org.telegram.ui.Components.z5 b;
    public qp c;

    public qa(Context context) {
        super(context);
        this.b = new org.telegram.ui.Components.z5(this, 0L, 350L, mr.h);
    }

    public final void a(boolean z4, boolean z10) {
        this.a = z4;
        boolean z11 = true;
        if (!z10) {
            this.b.f(z4, true);
        }
        if (!isPressed() && !z4) {
            z11 = false;
        }
        super.setPressed(z11);
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
            float f10 = 1.0f - (0.2f * e);
            canvas2.scale(f10, f10, getWidth() / 2.0f, getHeight() / 2.0f);
            canvas2.translate(0.0f, AndroidUtilities.dp(-12.0f) * e);
            super.onDraw(canvas2);
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        if (this.c == null) {
            qp qpVar = new qp(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(2.0f), getCurrentTextColor());
            this.c = qpVar;
            qpVar.setCallback(this);
        }
        this.c.b(getCurrentTextColor());
        float f11 = 1.0f - e;
        this.c.setBounds(getWidth() / 2, (getHeight() / 2) + ((int) (AndroidUtilities.dp(12.0f) * f11)), getWidth() / 2, (getHeight() / 2) + ((int) (f11 * AndroidUtilities.dp(12.0f))));
        this.c.setAlpha((int) (e * 255.0f));
        this.c.draw(canvas2);
        invalidate();
    }

    @Override // android.view.View
    public final void setPressed(boolean z4) {
        super.setPressed(z4 || this.a);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.c == drawable || super.verifyDrawable(drawable);
    }
}
