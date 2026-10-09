package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class pj0 {
    public final g6 a;
    public final q6 b;
    public final int c;
    public boolean d;
    public final uj0 e;
    public final bd f;
    public final Paint g = new Paint(1);
    public boolean h;

    public pj0(View view) {
        this.a = new g6(view, 350L, hs.h);
        this.e = new uj0(view);
        this.f = new bd(view);
        q6 q6Var = new q6(false, false, false);
        this.b = q6Var;
        q6Var.w(AndroidUtilities.dp(11.0f));
        q6Var.r(true, true);
        q6Var.setCallback(view);
        q6Var.M = (int) (AndroidUtilities.displaySize.x * 0.3f);
        this.d = false;
        q6Var.t(LocaleController.getString(R.string.QuoteCollapse), false, true);
        String string = LocaleController.getString(R.string.QuoteExpand);
        TextPaint textPaint = q6Var.a;
        this.c = (int) Math.ceil(Math.max(textPaint.measureText(string), textPaint.measureText(LocaleController.getString(R.string.QuoteCollapse))));
    }

    public final void a(Canvas canvas, RectF rectF, float f7, float f10, int i10, boolean z10, boolean z11) {
        boolean z12 = this.d;
        q6 q6Var = this.b;
        if (z10 != z12) {
            this.d = z10;
            q6Var.t(LocaleController.getString(z10 ? R.string.QuoteExpand : R.string.QuoteCollapse), true, true);
        }
        int c10 = (int) (q6Var.c() + AndroidUtilities.dp(23.66f));
        float dp = AndroidUtilities.dp(17.66f);
        rectF.set(f7 - c10, f10 - dp, f7, f10);
        float a2 = this.f.a(0.02f) * this.a.e(z11);
        if (a2 > 0.0f) {
            int k10 = i0.a.k(i10, 30);
            Paint paint = this.g;
            paint.setColor(k10);
            canvas.save();
            canvas.scale(a2, a2, f7, f10);
            float f11 = dp / 2.0f;
            canvas.drawRoundRect(rectF, f11, f11, paint);
            q6Var.setBounds((int) (rectF.left + AndroidUtilities.dp(6.0f)), (int) rectF.top, (int) (rectF.right - AndroidUtilities.dp(17.66f)), (int) rectF.bottom);
            q6Var.u(i10);
            q6Var.draw(canvas);
            float dp2 = AndroidUtilities.dp(14.0f);
            int dp3 = (int) ((rectF.right - AndroidUtilities.dp(3.33f)) - dp2);
            float f12 = dp2 / 2.0f;
            int centerY = (int) ((rectF.centerY() - f12) + AndroidUtilities.dp(0.33f));
            int dp4 = (int) (rectF.right - AndroidUtilities.dp(3.33f));
            int centerY2 = (int) (rectF.centerY() + f12 + AndroidUtilities.dp(0.33f));
            uj0 uj0Var = this.e;
            uj0Var.setBounds(dp3, centerY, dp4, centerY2);
            Paint paint2 = uj0Var.b;
            paint2.setColor(i10);
            paint2.setAlpha(uj0Var.d);
            boolean z13 = !z10;
            if (uj0Var.e != z13) {
                uj0Var.e = z13;
                uj0Var.a.invalidate();
            }
            uj0Var.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(boolean z10) {
        this.h = z10;
        this.f.c(z10);
    }
}
