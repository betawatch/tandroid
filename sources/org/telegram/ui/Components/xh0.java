package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class xh0 {
    public final y5 a;
    public final i6 b;
    public final int c;
    public boolean d;
    public final ci0 e;
    public final pc f;
    public final Paint g = new Paint(1);
    public boolean h;

    public xh0(View view) {
        this.a = new y5(view, 350L, gr.h);
        this.e = new ci0(view);
        this.f = new pc(view);
        i6 i6Var = new i6(false, false, false, false);
        this.b = i6Var;
        i6Var.t(AndroidUtilities.dp(11.0f));
        i6Var.o(true, true, false);
        i6Var.setCallback(view);
        i6Var.G = (int) (AndroidUtilities.displaySize.x * 0.3f);
        this.d = false;
        i6Var.q(LocaleController.getString(R.string.QuoteCollapse), false, true);
        String string = LocaleController.getString(R.string.QuoteExpand);
        TextPaint textPaint = i6Var.a;
        this.c = (int) Math.ceil(Math.max(textPaint.measureText(string), textPaint.measureText(LocaleController.getString(R.string.QuoteCollapse))));
    }

    public final void a(Canvas canvas, RectF rectF, float f10, float f11, int i9, boolean z10, boolean z11) {
        boolean z12 = this.d;
        i6 i6Var = this.b;
        if (z10 != z12) {
            this.d = z10;
            i6Var.q(LocaleController.getString(z10 ? R.string.QuoteExpand : R.string.QuoteCollapse), true, true);
        }
        int d = (int) (i6Var.d() + AndroidUtilities.dp(23.66f));
        float dp = AndroidUtilities.dp(17.66f);
        rectF.set(f10 - d, f11 - dp, f10, f11);
        float a2 = this.f.a(0.02f) * this.a.e(z11);
        if (a2 > 0.0f) {
            int k10 = i0.a.k(i9, 30);
            Paint paint = this.g;
            paint.setColor(k10);
            canvas.save();
            canvas.scale(a2, a2, f10, f11);
            float f12 = dp / 2.0f;
            canvas.drawRoundRect(rectF, f12, f12, paint);
            i6Var.setBounds((int) (rectF.left + AndroidUtilities.dp(6.0f)), (int) rectF.top, (int) (rectF.right - AndroidUtilities.dp(17.66f)), (int) rectF.bottom);
            i6Var.r(i9);
            i6Var.draw(canvas);
            float dp2 = AndroidUtilities.dp(14.0f);
            int dp3 = (int) ((rectF.right - AndroidUtilities.dp(3.33f)) - dp2);
            float f13 = dp2 / 2.0f;
            int centerY = (int) ((rectF.centerY() - f13) + AndroidUtilities.dp(0.33f));
            int dp4 = (int) (rectF.right - AndroidUtilities.dp(3.33f));
            int centerY2 = (int) (rectF.centerY() + f13 + AndroidUtilities.dp(0.33f));
            ci0 ci0Var = this.e;
            ci0Var.setBounds(dp3, centerY, dp4, centerY2);
            Paint paint2 = ci0Var.b;
            paint2.setColor(i9);
            paint2.setAlpha(ci0Var.d);
            boolean z13 = !z10;
            if (ci0Var.e != z13) {
                ci0Var.e = z13;
                ci0Var.a.invalidate();
            }
            ci0Var.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(boolean z10) {
        this.h = z10;
        this.f.c(z10);
    }
}
