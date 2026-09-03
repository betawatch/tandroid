package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ti0 {
    public final z5 a;
    public final j6 b;
    public final int c;
    public boolean d;
    public final yi0 e;
    public final rc f;
    public final Paint g = new Paint(1);
    public boolean h;

    public ti0(View view) {
        this.a = new z5(view, 350L, pr.h);
        this.e = new yi0(view);
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
            yi0 yi0Var = this.e;
            yi0Var.setBounds(dp3, centerY, dp4, centerY2);
            Paint paint2 = yi0Var.b;
            paint2.setColor(i10);
            paint2.setAlpha(yi0Var.d);
            boolean z12 = !z4;
            if (yi0Var.e != z12) {
                yi0Var.e = z12;
                yi0Var.a.invalidate();
            }
            yi0Var.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(boolean z4) {
        this.h = z4;
        this.f.c(z4);
    }
}
