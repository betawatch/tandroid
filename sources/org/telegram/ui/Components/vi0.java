package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class vi0 {
    public final e6 a;
    public final o6 b;
    public final int c;
    public boolean d;
    public final aj0 e;
    public final yc f;
    public final Paint g = new Paint(1);
    public boolean h;

    public vi0(View view) {
        this.a = new e6(view, 350L, rr.h);
        this.e = new aj0(view);
        this.f = new yc(view);
        o6 o6Var = new o6(false, false, false, false);
        this.b = o6Var;
        o6Var.t(AndroidUtilities.dp(11.0f));
        o6Var.o(true, true, false);
        o6Var.setCallback(view);
        o6Var.G = (int) (AndroidUtilities.displaySize.x * 0.3f);
        this.d = false;
        o6Var.q(LocaleController.getString(R.string.QuoteCollapse), false, true);
        String string = LocaleController.getString(R.string.QuoteExpand);
        TextPaint textPaint = o6Var.a;
        this.c = (int) Math.ceil(Math.max(textPaint.measureText(string), textPaint.measureText(LocaleController.getString(R.string.QuoteCollapse))));
    }

    public final void a(Canvas canvas, RectF rectF, float f7, float f10, int i10, boolean z10, boolean z11) {
        boolean z12 = this.d;
        o6 o6Var = this.b;
        if (z10 != z12) {
            this.d = z10;
            o6Var.q(LocaleController.getString(z10 ? R.string.QuoteExpand : R.string.QuoteCollapse), true, true);
        }
        int d = (int) (o6Var.d() + AndroidUtilities.dp(23.66f));
        float dp = AndroidUtilities.dp(17.66f);
        rectF.set(f7 - d, f10 - dp, f7, f10);
        float a2 = this.f.a(0.02f) * this.a.e(z11);
        if (a2 > 0.0f) {
            int k10 = i0.a.k(i10, 30);
            Paint paint = this.g;
            paint.setColor(k10);
            canvas.save();
            canvas.scale(a2, a2, f7, f10);
            float f11 = dp / 2.0f;
            canvas.drawRoundRect(rectF, f11, f11, paint);
            o6Var.setBounds((int) (rectF.left + AndroidUtilities.dp(6.0f)), (int) rectF.top, (int) (rectF.right - AndroidUtilities.dp(17.66f)), (int) rectF.bottom);
            o6Var.r(i10);
            o6Var.draw(canvas);
            float dp2 = AndroidUtilities.dp(14.0f);
            int dp3 = (int) ((rectF.right - AndroidUtilities.dp(3.33f)) - dp2);
            float f12 = dp2 / 2.0f;
            int centerY = (int) ((rectF.centerY() - f12) + AndroidUtilities.dp(0.33f));
            int dp4 = (int) (rectF.right - AndroidUtilities.dp(3.33f));
            int centerY2 = (int) (rectF.centerY() + f12 + AndroidUtilities.dp(0.33f));
            aj0 aj0Var = this.e;
            aj0Var.setBounds(dp3, centerY, dp4, centerY2);
            Paint paint2 = aj0Var.b;
            paint2.setColor(i10);
            paint2.setAlpha(aj0Var.d);
            boolean z13 = !z10;
            if (aj0Var.e != z13) {
                aj0Var.e = z13;
                aj0Var.a.invalidate();
            }
            aj0Var.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(boolean z10) {
        this.h = z10;
        this.f.c(z10);
    }
}
