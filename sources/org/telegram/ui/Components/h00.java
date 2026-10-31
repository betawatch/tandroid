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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h00 extends View implements org.telegram.ui.ActionBar.k6 {
    public Matrix D;
    public e6 E;
    public TextPaint a;
    public TextPaint b;
    public Paint c;
    public Path d;
    public float[] e;
    public qz0 f;
    public qz0 h;
    public qz0 n;
    public LinearGradient r;
    public LinearGradient s;
    public Paint w;
    public Paint x;
    public Matrix y;

    public static CharSequence a(CharSequence charSequence) {
        return "ALL_CHATS".equals(charSequence.toString()) ? org.telegram.messenger.cd.L0(2131750808, null) : charSequence;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        float f12;
        qz0 qz0Var;
        float f13;
        float f14;
        Paint paint = this.c;
        Matrix matrix = this.D;
        Matrix matrix2 = this.y;
        Path path = this.d;
        qz0 qz0Var2 = this.f;
        e6 e6Var = this.E;
        qz0 qz0Var3 = this.n;
        super.onDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.messenger.zs.e4, 31);
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        qz0 qz0Var4 = this.h;
        if (qz0Var4 != null) {
            canvas.save();
            float f15 = qz0Var4.c;
            f7 = 15.32f;
            CharSequence charSequence = e6Var.i;
            if (charSequence == null || charSequence.length() == 0) {
                f14 = 0.0f;
            } else {
                f14 = e6Var.c() + org.telegram.messenger.i0.L(15.32f);
            }
            float f16 = f15 + f14;
            f10 = measuredWidth - (f16 / 2.0f);
            canvas.translate(f10, measuredHeight - (qz0Var4.i() / 2.0f));
            qz0Var4.d(canvas);
            canvas.restore();
            f11 = f16;
        } else {
            f7 = 15.32f;
            f10 = measuredWidth;
            f11 = 0.0f;
        }
        CharSequence charSequence2 = e6Var.i;
        if (charSequence2 == null || charSequence2.length() == 0) {
            f12 = measuredHeight;
            qz0Var = qz0Var4;
            f13 = 2.0f;
        } else {
            Rect rect = org.telegram.messenger.i0.Q;
            f13 = 2.0f;
            int L = (int) (qz0Var4.c + f10 + org.telegram.messenger.i0.L(4.66f));
            int L2 = (int) (measuredHeight - org.telegram.messenger.i0.L(9.0f));
            f12 = measuredHeight;
            int c10 = (int) (e6Var.c() + qz0Var4.c + f10 + org.telegram.messenger.i0.L(f7));
            qz0Var = qz0Var4;
            rect.set(L, L2, c10, (int) (f12 + org.telegram.messenger.i0.L(9.0f)));
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(rect);
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(9.0f), paint);
            rect.offset(-org.telegram.messenger.i0.L(0.33f), -org.telegram.messenger.i0.L(0.66f));
            e6Var.setBounds(rect);
            e6Var.draw(canvas);
        }
        float L3 = org.telegram.messenger.i0.L(30.0f);
        float f17 = (f10 - L3) - qz0Var2.c;
        canvas.save();
        canvas.translate(f17, (f12 - (qz0Var2.i() / f13)) + org.telegram.messenger.i0.L(1.0f));
        qz0Var2.d(canvas);
        canvas.restore();
        float f18 = f10 + f11;
        if (qz0Var3 != null) {
            canvas.save();
            canvas.translate(f18 + L3, (f12 - (qz0Var3.i() / f13)) + org.telegram.messenger.i0.L(1.0f));
            qz0Var3.d(canvas);
            canvas.restore();
            f18 += L3 + qz0Var3.c;
        }
        float f19 = f18;
        float L4 = org.telegram.messenger.i0.L(12.0f) + (qz0Var.i() / f13) + f12;
        canvas.drawRect(0.0f, L4, getMeasuredWidth(), 1.0f + L4, this.a);
        path.rewind();
        RectF rectF2 = org.telegram.messenger.i0.P;
        float f20 = f11 / f13;
        float f21 = measuredWidth + f20;
        rectF2.set((measuredWidth - f20) - org.telegram.messenger.i0.L(4.0f), L4 - org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f) + f21, L4);
        path.addRoundRect(rectF2, this.e, Path.Direction.CW);
        canvas.drawPath(path, paint);
        canvas.save();
        float max = Math.max(org.telegram.messenger.i0.L(8.0f), f17);
        matrix2.reset();
        matrix2.postTranslate(Math.min(f10, max + org.telegram.messenger.i0.L(8.0f)), 0.0f);
        this.r.setLocalMatrix(matrix2);
        float min = Math.min(getMeasuredWidth() - org.telegram.messenger.i0.L(8.0f), f19);
        matrix.reset();
        matrix.postTranslate(Math.max(f21, min - org.telegram.messenger.i0.L(88.0f)), 0.0f);
        this.s.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, measuredWidth, getMeasuredHeight(), this.w);
        canvas.drawRect(measuredWidth, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.x);
        canvas.restore();
        canvas.restore();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        Paint paint = this.c;
        TextPaint textPaint = this.b;
        TextPaint textPaint2 = this.a;
        if (textPaint2 == null || textPaint == null || paint == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.t6.si;
        textPaint2.setColor(org.telegram.ui.ActionBar.t6.r1(0.8f, org.telegram.ui.ActionBar.t6.x0(null, i10, false)));
        int i11 = org.telegram.ui.ActionBar.t6.o6;
        textPaint.setColor(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
        paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Hi, false));
        try {
            e6 e6Var = this.E;
            if (e6Var != null) {
                e6Var.u(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false));
            }
            int r12 = org.telegram.ui.ActionBar.t6.r1(0.8f, org.telegram.ui.ActionBar.t6.x0(null, i10, false));
            qz0 qz0Var = this.f;
            if (qz0Var != null) {
                qz0Var.n(r12);
            }
            qz0 qz0Var2 = this.h;
            if (qz0Var2 != null) {
                qz0Var2.n(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
            }
            qz0 qz0Var3 = this.n;
            if (qz0Var3 != null) {
                qz0Var3.n(r12);
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.E || super.verifyDrawable(drawable);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
