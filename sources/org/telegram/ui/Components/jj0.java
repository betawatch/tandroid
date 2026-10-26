package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class jj0 {
    public final h6 a;
    public final r6 b;
    public final int c;
    public boolean d;
    public final pj0 e;
    public final xc f;
    public final Paint g = new Paint(1);
    public boolean h;

    public jj0(View view) {
        this.a = new h6(view, 350L, ds.h);
        this.e = new pj0(view);
        this.f = new xc(view);
        r6 r6Var = new r6(false, false, false);
        this.b = r6Var;
        r6Var.w(AndroidUtilities.dp(11.0f));
        r6Var.r(true, true);
        r6Var.setCallback(view);
        r6Var.M = (int) (AndroidUtilities.displaySize.x * 0.3f);
        this.d = false;
        r6Var.t(LocaleController.getString(R.string.QuoteCollapse), false, true);
        String string = LocaleController.getString(R.string.QuoteExpand);
        TextPaint textPaint = r6Var.a;
        this.c = (int) Math.ceil(Math.max(textPaint.measureText(string), textPaint.measureText(LocaleController.getString(R.string.QuoteCollapse))));
    }

    public final void a(Canvas canvas, RectF rectF, float f7, float f10, int i10, boolean z10, boolean z11) {
        boolean z12 = this.d;
        r6 r6Var = this.b;
        if (z10 != z12) {
            this.d = z10;
            r6Var.t(LocaleController.getString(z10 ? R.string.QuoteExpand : R.string.QuoteCollapse), true, true);
        }
        int c10 = (int) (r6Var.c() + AndroidUtilities.dp(23.66f));
        float dp = AndroidUtilities.dp(17.66f);
        rectF.set(f7 - c10, f10 - dp, f7, f10);
        float a2 = this.f.a(0.02f) * this.a.e(z11);
        if (a2 > 0.0f) {
            int o10 = i0.a.o(i10, 30);
            Paint paint = this.g;
            paint.setColor(o10);
            canvas.save();
            canvas.scale(a2, a2, f7, f10);
            float f11 = dp / 2.0f;
            canvas.drawRoundRect(rectF, f11, f11, paint);
            r6Var.setBounds((int) (rectF.left + AndroidUtilities.dp(6.0f)), (int) rectF.top, (int) (rectF.right - AndroidUtilities.dp(17.66f)), (int) rectF.bottom);
            r6Var.u(i10);
            r6Var.draw(canvas);
            float dp2 = AndroidUtilities.dp(14.0f);
            int dp3 = (int) ((rectF.right - AndroidUtilities.dp(3.33f)) - dp2);
            float f12 = dp2 / 2.0f;
            int centerY = (int) ((rectF.centerY() - f12) + AndroidUtilities.dp(0.33f));
            int dp4 = (int) (rectF.right - AndroidUtilities.dp(3.33f));
            int centerY2 = (int) (rectF.centerY() + f12 + AndroidUtilities.dp(0.33f));
            pj0 pj0Var = this.e;
            pj0Var.setBounds(dp3, centerY, dp4, centerY2);
            Paint paint2 = pj0Var.b;
            paint2.setColor(i10);
            paint2.setAlpha(pj0Var.d);
            boolean z13 = !z10;
            if (pj0Var.e != z13) {
                pj0Var.e = z13;
                pj0Var.a.invalidate();
            }
            pj0Var.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(boolean z10) {
        this.h = z10;
        this.f.c(z10);
    }
}
