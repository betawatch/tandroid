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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class l10 extends View implements org.telegram.ui.ActionBar.p6 {
    public r6 E;
    public TextPaint a;
    public TextPaint b;
    public Paint c;
    public Path d;
    public float[] e;
    public r11 f;
    public r11 h;
    public r11 n;
    public LinearGradient r;
    public LinearGradient s;
    public Paint v;
    public Paint w;
    public Matrix x;
    public Matrix y;

    public static CharSequence a(CharSequence charSequence) {
        return "ALL_CHATS".equals(charSequence.toString()) ? LocaleController.getString(R.string.FilterAllChats) : charSequence;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        float f12;
        r11 r11Var;
        float f13;
        float f14;
        Paint paint = this.c;
        Matrix matrix = this.y;
        Matrix matrix2 = this.x;
        Path path = this.d;
        r11 r11Var2 = this.f;
        r6 r6Var = this.E;
        r11 r11Var3 = this.n;
        super.onDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        r11 r11Var4 = this.h;
        if (r11Var4 != null) {
            canvas.save();
            float f15 = r11Var4.c;
            f7 = 15.32f;
            CharSequence charSequence = r6Var.i;
            if (charSequence == null || charSequence.length() == 0) {
                f14 = 0.0f;
            } else {
                f14 = r6Var.c() + AndroidUtilities.dp(15.32f);
            }
            float f16 = f15 + f14;
            f10 = measuredWidth - (f16 / 2.0f);
            canvas.translate(f10, measuredHeight - (r11Var4.j() / 2.0f));
            r11Var4.d(canvas);
            canvas.restore();
            f11 = f16;
        } else {
            f7 = 15.32f;
            f10 = measuredWidth;
            f11 = 0.0f;
        }
        CharSequence charSequence2 = r6Var.i;
        if (charSequence2 == null || charSequence2.length() == 0) {
            f12 = measuredHeight;
            r11Var = r11Var4;
            f13 = 2.0f;
        } else {
            Rect rect = AndroidUtilities.rectTmp2;
            f13 = 2.0f;
            int dp = (int) (r11Var4.c + f10 + AndroidUtilities.dp(4.66f));
            int dp2 = (int) (measuredHeight - AndroidUtilities.dp(9.0f));
            f12 = measuredHeight;
            int c10 = (int) (r6Var.c() + r11Var4.c + f10 + AndroidUtilities.dp(f7));
            r11Var = r11Var4;
            rect.set(dp, dp2, c10, (int) (f12 + AndroidUtilities.dp(9.0f)));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), paint);
            rect.offset(-AndroidUtilities.dp(0.33f), -AndroidUtilities.dp(0.66f));
            r6Var.setBounds(rect);
            r6Var.draw(canvas);
        }
        float dp3 = AndroidUtilities.dp(30.0f);
        float f17 = (f10 - dp3) - r11Var2.c;
        canvas.save();
        canvas.translate(f17, (f12 - (r11Var2.j() / f13)) + AndroidUtilities.dp(1.0f));
        r11Var2.d(canvas);
        canvas.restore();
        float f18 = f10 + f11;
        if (r11Var3 != null) {
            canvas.save();
            canvas.translate(f18 + dp3, (f12 - (r11Var3.j() / f13)) + AndroidUtilities.dp(1.0f));
            r11Var3.d(canvas);
            canvas.restore();
            f18 += dp3 + r11Var3.c;
        }
        float f19 = f18;
        float dp4 = AndroidUtilities.dp(12.0f) + (r11Var.j() / f13) + f12;
        canvas.drawRect(0.0f, dp4, getMeasuredWidth(), 1.0f + dp4, this.a);
        path.rewind();
        RectF rectF2 = AndroidUtilities.rectTmp;
        float f20 = f11 / f13;
        float f21 = measuredWidth + f20;
        rectF2.set((measuredWidth - f20) - AndroidUtilities.dp(4.0f), dp4 - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + f21, dp4);
        path.addRoundRect(rectF2, this.e, Path.Direction.CW);
        canvas.drawPath(path, paint);
        canvas.save();
        float max = Math.max(AndroidUtilities.dp(8.0f), f17);
        matrix2.reset();
        matrix2.postTranslate(Math.min(f10, max + AndroidUtilities.dp(8.0f)), 0.0f);
        this.r.setLocalMatrix(matrix2);
        float min = Math.min(getMeasuredWidth() - AndroidUtilities.dp(8.0f), f19);
        matrix.reset();
        matrix.postTranslate(Math.max(f21, min - AndroidUtilities.dp(88.0f)), 0.0f);
        this.s.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, measuredWidth, getMeasuredHeight(), this.v);
        canvas.drawRect(measuredWidth, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.w);
        canvas.restore();
        canvas.restore();
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        Paint paint = this.c;
        TextPaint textPaint = this.b;
        TextPaint textPaint2 = this.a;
        if (textPaint2 == null || textPaint == null || paint == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.y6.Eh;
        textPaint2.setColor(org.telegram.ui.ActionBar.y6.o1(0.8f, org.telegram.ui.ActionBar.y6.x0(null, i10, false)));
        int i11 = org.telegram.ui.ActionBar.y6.o6;
        textPaint.setColor(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
        paint.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Th, false));
        try {
            r6 r6Var = this.E;
            if (r6Var != null) {
                r6Var.u(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.d6, false));
            }
            int o12 = org.telegram.ui.ActionBar.y6.o1(0.8f, org.telegram.ui.ActionBar.y6.x0(null, i10, false));
            r11 r11Var = this.f;
            if (r11Var != null) {
                r11Var.o(o12);
            }
            r11 r11Var2 = this.h;
            if (r11Var2 != null) {
                r11Var2.o(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
            }
            r11 r11Var3 = this.n;
            if (r11Var3 != null) {
                r11Var3.o(o12);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.E || super.verifyDrawable(drawable);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
