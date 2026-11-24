// default package

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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class jl4 extends View implements tjb {
    public Matrix E;
    public gn F;
    public TextPaint a;
    public TextPaint b;
    public Paint c;
    public Path d;
    public float[] e;
    public tgb f;
    public tgb h;
    public tgb n;
    public LinearGradient r;
    public LinearGradient s;
    public Paint w;
    public Paint x;
    public Matrix y;

    public static CharSequence a(CharSequence charSequence) {
        return "ALL_CHATS".equals(charSequence.toString()) ? k96.M0(2131750795, null) : charSequence;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        tgb tgbVar;
        float f5;
        float f6;
        Paint paint = this.c;
        Matrix matrix = this.E;
        Matrix matrix2 = this.y;
        Path path = this.d;
        tgb tgbVar2 = this.n;
        tgb tgbVar3 = this.f;
        gn gnVar = this.F;
        super.onDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), kk7.d4, 31);
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        tgb tgbVar4 = this.h;
        if (tgbVar4 != null) {
            canvas.save();
            float f7 = tgbVar4.c;
            f = 15.32f;
            CharSequence charSequence = gnVar.i;
            if (charSequence == null || charSequence.length() == 0) {
                f6 = 0.0f;
            } else {
                f6 = gnVar.c() + gl.L(15.32f);
            }
            float f8 = f7 + f6;
            f2 = measuredWidth - (f8 / 2.0f);
            canvas.translate(f2, measuredHeight - (tgbVar4.h() / 2.0f));
            tgbVar4.d(canvas);
            canvas.restore();
            f3 = f8;
        } else {
            f = 15.32f;
            f2 = measuredWidth;
            f3 = 0.0f;
        }
        CharSequence charSequence2 = gnVar.i;
        if (charSequence2 == null || charSequence2.length() == 0) {
            f4 = measuredHeight;
            tgbVar = tgbVar4;
            f5 = 2.0f;
        } else {
            Rect rect = gl.Q;
            f5 = 2.0f;
            int L = (int) (tgbVar4.c + f2 + gl.L(4.66f));
            int L2 = (int) (measuredHeight - gl.L(9.0f));
            f4 = measuredHeight;
            int c = (int) (gnVar.c() + tgbVar4.c + f2 + gl.L(f));
            tgbVar = tgbVar4;
            rect.set(L, L2, c, (int) (f4 + gl.L(9.0f)));
            RectF rectF = gl.P;
            rectF.set(rect);
            canvas.drawRoundRect(rectF, gl.L(9.0f), gl.L(9.0f), paint);
            rect.offset(-gl.L(0.33f), -gl.L(0.66f));
            gnVar.setBounds(rect);
            gnVar.draw(canvas);
        }
        float L3 = gl.L(30.0f);
        float f9 = (f2 - L3) - tgbVar3.c;
        canvas.save();
        canvas.translate(f9, (f4 - (tgbVar3.h() / f5)) + gl.L(1.0f));
        tgbVar3.d(canvas);
        canvas.restore();
        float f10 = f2 + f3;
        if (tgbVar2 != null) {
            canvas.save();
            canvas.translate(f10 + L3, (f4 - (tgbVar2.h() / f5)) + gl.L(1.0f));
            tgbVar2.d(canvas);
            canvas.restore();
            f10 += L3 + tgbVar2.c;
        }
        float f11 = f10;
        float L4 = gl.L(12.0f) + (tgbVar.h() / f5) + f4;
        canvas.drawRect(0.0f, L4, getMeasuredWidth(), 1.0f + L4, this.a);
        path.rewind();
        RectF rectF2 = gl.P;
        float f12 = f3 / f5;
        float f13 = measuredWidth + f12;
        rectF2.set((measuredWidth - f12) - gl.L(4.0f), L4 - gl.L(4.0f), gl.L(4.0f) + f13, L4);
        path.addRoundRect(rectF2, this.e, Path.Direction.CW);
        canvas.drawPath(path, paint);
        canvas.save();
        float max = Math.max(gl.L(8.0f), f9);
        matrix2.reset();
        matrix2.postTranslate(Math.min(f2, max + gl.L(8.0f)), 0.0f);
        this.r.setLocalMatrix(matrix2);
        float min = Math.min(getMeasuredWidth() - gl.L(8.0f), f11);
        matrix.reset();
        matrix.postTranslate(Math.max(f13, min - gl.L(88.0f)), 0.0f);
        this.s.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, measuredWidth, getMeasuredHeight(), this.w);
        canvas.drawRect(measuredWidth, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.x);
        canvas.restore();
        canvas.restore();
    }

    @Override // tjb
    public final void updateColors() {
        Paint paint = this.c;
        TextPaint textPaint = this.b;
        TextPaint textPaint2 = this.a;
        if (textPaint2 == null || textPaint == null || paint == null) {
            return;
        }
        int i = bkb.ui;
        textPaint2.setColor(bkb.p1(0.8f, bkb.w0(null, i, false)));
        int i2 = bkb.n6;
        textPaint.setColor(bkb.w0(null, i2, false));
        paint.setColor(bkb.w0(null, bkb.Ji, false));
        try {
            gn gnVar = this.F;
            if (gnVar != null) {
                gnVar.u(bkb.w0(null, bkb.c6, false));
            }
            int p1 = bkb.p1(0.8f, bkb.w0(null, i, false));
            tgb tgbVar = this.f;
            if (tgbVar != null) {
                tgbVar.m(p1);
            }
            tgb tgbVar2 = this.h;
            if (tgbVar2 != null) {
                tgbVar2.m(bkb.w0(null, i2, false));
            }
            tgb tgbVar3 = this.n;
            if (tgbVar3 != null) {
                tgbVar3.m(p1);
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.F || super.verifyDrawable(drawable);
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
