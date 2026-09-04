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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class a10 extends View {
    public TextPaint a;
    public Paint b;
    public Path c;
    public float[] d;
    public f01 e;
    public f01 f;
    public f01 h;
    public LinearGradient n;
    public LinearGradient r;
    public Paint s;
    public Paint v;
    public Matrix w;
    public Matrix x;
    public p6 y;

    public static CharSequence a(CharSequence charSequence) {
        return "ALL_CHATS".equals(charSequence.toString()) ? LocaleController.getString(R.string.FilterAllChats) : charSequence;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        float f12;
        f01 f01Var;
        float f13;
        float f14;
        Paint paint = this.b;
        Matrix matrix = this.x;
        Matrix matrix2 = this.w;
        Path path = this.c;
        f01 f01Var2 = this.e;
        p6 p6Var = this.y;
        f01 f01Var3 = this.h;
        super.onDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        f01 f01Var4 = this.f;
        if (f01Var4 != null) {
            canvas.save();
            float f15 = f01Var4.c;
            f7 = 15.32f;
            CharSequence charSequence = p6Var.g;
            if (charSequence == null || charSequence.length() == 0) {
                f14 = 0.0f;
            } else {
                f14 = p6Var.d() + AndroidUtilities.dp(15.32f);
            }
            float f16 = f15 + f14;
            f10 = measuredWidth - (f16 / 2.0f);
            canvas.translate(f10, measuredHeight - (f01Var4.j() / 2.0f));
            f01Var4.d(canvas);
            canvas.restore();
            f11 = f16;
        } else {
            f7 = 15.32f;
            f10 = measuredWidth;
            f11 = 0.0f;
        }
        CharSequence charSequence2 = p6Var.g;
        if (charSequence2 == null || charSequence2.length() == 0) {
            f12 = measuredHeight;
            f01Var = f01Var4;
            f13 = 2.0f;
        } else {
            Rect rect = AndroidUtilities.rectTmp2;
            f13 = 2.0f;
            int dp = (int) (f01Var4.c + f10 + AndroidUtilities.dp(4.66f));
            int dp2 = (int) (measuredHeight - AndroidUtilities.dp(9.0f));
            f12 = measuredHeight;
            int d = (int) (p6Var.d() + f01Var4.c + f10 + AndroidUtilities.dp(f7));
            f01Var = f01Var4;
            rect.set(dp, dp2, d, (int) (f12 + AndroidUtilities.dp(9.0f)));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), paint);
            rect.offset(-AndroidUtilities.dp(0.33f), -AndroidUtilities.dp(0.66f));
            p6Var.setBounds(rect);
            p6Var.draw(canvas);
        }
        float dp3 = AndroidUtilities.dp(30.0f);
        float f17 = (f10 - dp3) - f01Var2.c;
        canvas.save();
        canvas.translate(f17, (f12 - (f01Var2.j() / f13)) + AndroidUtilities.dp(1.0f));
        f01Var2.d(canvas);
        canvas.restore();
        float f18 = f10 + f11;
        if (f01Var3 != null) {
            canvas.save();
            canvas.translate(f18 + dp3, (f12 - (f01Var3.j() / f13)) + AndroidUtilities.dp(1.0f));
            f01Var3.d(canvas);
            canvas.restore();
            f18 += dp3 + f01Var3.c;
        }
        float f19 = f18;
        float dp4 = AndroidUtilities.dp(12.0f) + (f01Var.j() / f13) + f12;
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
