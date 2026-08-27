package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class zh0 {
    public final y5 a;
    public final i6 b;
    public final int c;
    public boolean d;
    public final ei0 e;
    public final nc f;
    public final Paint g = new Paint(1);
    public boolean h;

    public zh0(View view) {
        this.a = new y5(view, 350L, er.h);
        this.e = new ei0(view);
        this.f = new nc(view);
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

    public final void a(Canvas canvas, RectF rectF, float f10, float f11, int i10, boolean z10, boolean z11) {
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
            int k10 = i0.b.k(i10, 30);
            Paint paint = this.g;
            paint.setColor(k10);
            canvas.save();
            canvas.scale(a2, a2, f10, f11);
            float f12 = dp / 2.0f;
            canvas.drawRoundRect(rectF, f12, f12, paint);
            i6Var.setBounds((int) (rectF.left + AndroidUtilities.dp(6.0f)), (int) rectF.top, (int) (rectF.right - AndroidUtilities.dp(17.66f)), (int) rectF.bottom);
            i6Var.r(i10);
            i6Var.draw(canvas);
            float dp2 = AndroidUtilities.dp(14.0f);
            int dp3 = (int) ((rectF.right - AndroidUtilities.dp(3.33f)) - dp2);
            float f13 = dp2 / 2.0f;
            int centerY = (int) ((rectF.centerY() - f13) + AndroidUtilities.dp(0.33f));
            int dp4 = (int) (rectF.right - AndroidUtilities.dp(3.33f));
            int centerY2 = (int) (rectF.centerY() + f13 + AndroidUtilities.dp(0.33f));
            ei0 ei0Var = this.e;
            ei0Var.setBounds(dp3, centerY, dp4, centerY2);
            Paint paint2 = ei0Var.b;
            paint2.setColor(i10);
            paint2.setAlpha(ei0Var.d);
            boolean z13 = !z10;
            if (ei0Var.e != z13) {
                ei0Var.e = z13;
                ei0Var.a.invalidate();
            }
            ei0Var.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(boolean z10) {
        this.h = z10;
        this.f.c(z10);
    }
}
