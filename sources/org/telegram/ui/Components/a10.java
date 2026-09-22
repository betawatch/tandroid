package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class a10 extends View {
    public TextPaint a;
    public Paint b;
    public Path c;
    public float[] d;
    public g01 e;
    public g01 f;
    public g01 h;
    public LinearGradient n;
    public LinearGradient r;
    public Paint s;
    public Paint v;
    public Matrix w;
    public Matrix x;
    public m6 y;

    public static CharSequence a(CharSequence charSequence) {
        return "ALL_CHATS".equals(charSequence.toString()) ? LocaleController.getString(R.string.FilterAllChats) : charSequence;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        float f12;
        g01 g01Var;
        float f13;
        float f14;
        Paint paint = this.b;
        Matrix matrix = this.x;
        Matrix matrix2 = this.w;
        Path path = this.c;
        g01 g01Var2 = this.e;
        m6 m6Var = this.y;
        g01 g01Var3 = this.h;
        super.onDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        g01 g01Var4 = this.f;
        if (g01Var4 != null) {
            canvas.save();
            float f15 = g01Var4.c;
            f7 = 15.32f;
            CharSequence charSequence = m6Var.g;
            if (charSequence == null || charSequence.length() == 0) {
                f14 = 0.0f;
            } else {
                f14 = m6Var.d() + AndroidUtilities.dp(15.32f);
            }
            float f16 = f15 + f14;
            f10 = measuredWidth - (f16 / 2.0f);
            canvas.translate(f10, measuredHeight - (g01Var4.j() / 2.0f));
            g01Var4.d(canvas);
            canvas.restore();
            f11 = f16;
        } else {
            f7 = 15.32f;
            f10 = measuredWidth;
            f11 = 0.0f;
        }
        CharSequence charSequence2 = m6Var.g;
        if (charSequence2 == null || charSequence2.length() == 0) {
            f12 = measuredHeight;
            g01Var = g01Var4;
            f13 = 2.0f;
        } else {
            Rect rect = AndroidUtilities.rectTmp2;
            f13 = 2.0f;
            int dp = (int) (g01Var4.c + f10 + AndroidUtilities.dp(4.66f));
            int dp2 = (int) (measuredHeight - AndroidUtilities.dp(9.0f));
            f12 = measuredHeight;
            int d = (int) (m6Var.d() + g01Var4.c + f10 + AndroidUtilities.dp(f7));
            g01Var = g01Var4;
            rect.set(dp, dp2, d, (int) (f12 + AndroidUtilities.dp(9.0f)));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), paint);
            rect.offset(-AndroidUtilities.dp(0.33f), -AndroidUtilities.dp(0.66f));
            m6Var.setBounds(rect);
            m6Var.draw(canvas);
        }
        float dp3 = AndroidUtilities.dp(30.0f);
        float f17 = (f10 - dp3) - g01Var2.c;
        canvas.save();
        canvas.translate(f17, (f12 - (g01Var2.j() / f13)) + AndroidUtilities.dp(1.0f));
        g01Var2.d(canvas);
        canvas.restore();
        float f18 = f10 + f11;
        if (g01Var3 != null) {
            canvas.save();
            canvas.translate(f18 + dp3, (f12 - (g01Var3.j() / f13)) + AndroidUtilities.dp(1.0f));
            g01Var3.d(canvas);
            canvas.restore();
            f18 += dp3 + g01Var3.c;
        }
        float f19 = f18;
        float dp4 = AndroidUtilities.dp(12.0f) + (g01Var.j() / f13) + f12;
        canvas.drawRect(0.0f, dp4, getMeasuredWidth(), 1.0f + dp4, this.a);
        path.rewind();
        RectF rectF2 = AndroidUtilities.rectTmp;
        float f20 = f11 / f13;
        float f21 = measuredWidth + f20;
        rectF2.set((measuredWidth - f20) - AndroidUtilities.dp(4.0f), dp4 - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + f21, dp4);
        path.addRoundRect(rectF2, this.d, Path.Direction.CW);
        canvas.drawPath(path, paint);
        canvas.save();
        float max = Math.max(AndroidUtilities.dp(8.0f), f17);
        matrix2.reset();
        matrix2.postTranslate(Math.min(f10, max + AndroidUtilities.dp(8.0f)), 0.0f);
        this.n.setLocalMatrix(matrix2);
        float min = Math.min(getMeasuredWidth() - AndroidUtilities.dp(8.0f), f19);
        matrix.reset();
        matrix.postTranslate(Math.max(f21, min - AndroidUtilities.dp(88.0f)), 0.0f);
        this.r.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, measuredWidth, getMeasuredHeight(), this.s);
        canvas.drawRect(measuredWidth, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.v);
        canvas.restore();
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.y || super.verifyDrawable(drawable);
    }
}
