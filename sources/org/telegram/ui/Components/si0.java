package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class si0 {
    public final z5 a;
    public final j6 b;
    public final int c;
    public boolean d;
    public final xi0 e;
    public final rc f;
    public final Paint g = new Paint(1);
    public boolean h;

    public si0(View view) {
        this.a = new z5(view, 350L, mr.h);
        this.e = new xi0(view);
        this.f = new rc(view);
        j6 j6Var = new j6(false, false, false, false);
        this.b = j6Var;
        j6Var.t(AndroidUtilities.dp(11.0f));
        j6Var.o(true, true, false);
        j6Var.setCallback(view);
        j6Var.G = (int) (AndroidUtilities.displaySize.x * 0.3f);
        this.d = false;
        j6Var.q(LocaleController.getString(R.string.QuoteCollapse), false, true);
        String string = LocaleController.getString(R.string.QuoteExpand);
        TextPaint textPaint = j6Var.a;
        this.c = (int) Math.ceil(Math.max(textPaint.measureText(string), textPaint.measureText(LocaleController.getString(R.string.QuoteCollapse))));
    }

    public final void a(Canvas canvas, RectF rectF, float f10, float f11, int i10, boolean z4, boolean z10) {
        boolean z11 = this.d;
        j6 j6Var = this.b;
        if (z4 != z11) {
            this.d = z4;
            j6Var.q(LocaleController.getString(z4 ? R.string.QuoteExpand : R.string.QuoteCollapse), true, true);
        }
        int d = (int) (j6Var.d() + AndroidUtilities.dp(23.66f));
        float dp = AndroidUtilities.dp(17.66f);
        rectF.set(f10 - d, f11 - dp, f10, f11);
        float a2 = this.f.a(0.02f) * this.a.e(z10);
        if (a2 > 0.0f) {
            int k10 = i0.a.k(i10, 30);
            Paint paint = this.g;
            paint.setColor(k10);
            canvas.save();
            canvas.scale(a2, a2, f10, f11);
            float f12 = dp / 2.0f;
            canvas.drawRoundRect(rectF, f12, f12, paint);
            j6Var.setBounds((int) (rectF.left + AndroidUtilities.dp(6.0f)), (int) rectF.top, (int) (rectF.right - AndroidUtilities.dp(17.66f)), (int) rectF.bottom);
            j6Var.r(i10);
            j6Var.draw(canvas);
            float dp2 = AndroidUtilities.dp(14.0f);
            int dp3 = (int) ((rectF.right - AndroidUtilities.dp(3.33f)) - dp2);
            float f13 = dp2 / 2.0f;
            int centerY = (int) ((rectF.centerY() - f13) + AndroidUtilities.dp(0.33f));
            int dp4 = (int) (rectF.right - AndroidUtilities.dp(3.33f));
            int centerY2 = (int) (rectF.centerY() + f13 + AndroidUtilities.dp(0.33f));
            xi0 xi0Var = this.e;
            xi0Var.setBounds(dp3, centerY, dp4, centerY2);
            Paint paint2 = xi0Var.b;
            paint2.setColor(i10);
            paint2.setAlpha(xi0Var.d);
            boolean z12 = !z4;
            if (xi0Var.e != z12) {
                xi0Var.e = z12;
                xi0Var.a.invalidate();
            }
            xi0Var.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(boolean z4) {
        this.h = z4;
        this.f.c(z4);
    }
}
