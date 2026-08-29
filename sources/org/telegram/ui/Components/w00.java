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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class w00 extends View {
    public TextPaint a;
    public Paint b;
    public Path c;
    public float[] d;
    public zz0 e;
    public zz0 f;
    public zz0 h;
    public LinearGradient n;
    public LinearGradient r;
    public Paint s;
    public Paint v;
    public Matrix w;
    public Matrix x;
    public n6 y;

    public static CharSequence a(CharSequence charSequence) {
        return "ALL_CHATS".equals(charSequence.toString()) ? LocaleController.getString(R.string.FilterAllChats) : charSequence;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f9;
        float f10;
        float f11;
        float f12;
        zz0 zz0Var;
        float f13;
        float f14;
        Paint paint = this.b;
        Matrix matrix = this.x;
        Matrix matrix2 = this.w;
        Path path = this.c;
        zz0 zz0Var2 = this.e;
        n6 n6Var = this.y;
        zz0 zz0Var3 = this.h;
        super.onDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        zz0 zz0Var4 = this.f;
        if (zz0Var4 != null) {
            canvas.save();
            float f15 = zz0Var4.c;
            f9 = 15.32f;
            CharSequence charSequence = n6Var.g;
            if (charSequence == null || charSequence.length() == 0) {
                f14 = 0.0f;
            } else {
                f14 = n6Var.d() + AndroidUtilities.dp(15.32f);
            }
            float f16 = f15 + f14;
            f10 = measuredWidth - (f16 / 2.0f);
            canvas.translate(f10, measuredHeight - (zz0Var4.j() / 2.0f));
            zz0Var4.d(canvas);
            canvas.restore();
            f11 = f16;
        } else {
            f9 = 15.32f;
            f10 = measuredWidth;
            f11 = 0.0f;
        }
        CharSequence charSequence2 = n6Var.g;
        if (charSequence2 == null || charSequence2.length() == 0) {
            f12 = measuredHeight;
            zz0Var = zz0Var4;
            f13 = 2.0f;
        } else {
            Rect rect = AndroidUtilities.rectTmp2;
            f13 = 2.0f;
            int dp = (int) (zz0Var4.c + f10 + AndroidUtilities.dp(4.66f));
            int dp2 = (int) (measuredHeight - AndroidUtilities.dp(9.0f));
            f12 = measuredHeight;
            int d = (int) (n6Var.d() + zz0Var4.c + f10 + AndroidUtilities.dp(f9));
            zz0Var = zz0Var4;
            rect.set(dp, dp2, d, (int) (f12 + AndroidUtilities.dp(9.0f)));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), paint);
            rect.offset(-AndroidUtilities.dp(0.33f), -AndroidUtilities.dp(0.66f));
            n6Var.setBounds(rect);
            n6Var.draw(canvas);
        }
        float dp3 = AndroidUtilities.dp(30.0f);
        float f17 = (f10 - dp3) - zz0Var2.c;
        canvas.save();
        canvas.translate(f17, (f12 - (zz0Var2.j() / f13)) + AndroidUtilities.dp(1.0f));
        zz0Var2.d(canvas);
        canvas.restore();
        float f18 = f10 + f11;
        if (zz0Var3 != null) {
            canvas.save();
            canvas.translate(f18 + dp3, (f12 - (zz0Var3.j() / f13)) + AndroidUtilities.dp(1.0f));
            zz0Var3.d(canvas);
            canvas.restore();
            f18 += dp3 + zz0Var3.c;
        }
        float f19 = f18;
        float dp4 = AndroidUtilities.dp(12.0f) + (zz0Var.j() / f13) + f12;
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
