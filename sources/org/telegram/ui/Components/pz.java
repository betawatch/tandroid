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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class pz extends View implements org.telegram.ui.ActionBar.z5 {
    public Matrix E;
    public g6 F;
    public TextPaint a;
    public TextPaint b;
    public Paint c;
    public Path d;
    public float[] e;
    public ly0 f;
    public ly0 h;
    public ly0 n;
    public LinearGradient r;
    public LinearGradient s;
    public Paint w;
    public Paint x;
    public Matrix y;

    public static CharSequence a(CharSequence charSequence) {
        return "ALL_CHATS".equals(charSequence.toString()) ? org.telegram.messenger.bd.M0(2131750808, null) : charSequence;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float f13;
        ly0 ly0Var;
        float f14;
        float f15;
        Paint paint = this.c;
        Matrix matrix = this.E;
        Matrix matrix2 = this.y;
        Path path = this.d;
        ly0 ly0Var2 = this.f;
        g6 g6Var = this.F;
        ly0 ly0Var3 = this.n;
        super.onDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.messenger.hs.e4, 31);
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        ly0 ly0Var4 = this.h;
        if (ly0Var4 != null) {
            canvas.save();
            float f16 = ly0Var4.c;
            f10 = 15.32f;
            CharSequence charSequence = g6Var.i;
            if (charSequence == null || charSequence.length() == 0) {
                f15 = 0.0f;
            } else {
                f15 = g6Var.c() + org.telegram.messenger.g0.L(15.32f);
            }
            float f17 = f16 + f15;
            f11 = measuredWidth - (f17 / 2.0f);
            canvas.translate(f11, measuredHeight - (ly0Var4.i() / 2.0f));
            ly0Var4.d(canvas);
            canvas.restore();
            f12 = f17;
        } else {
            f10 = 15.32f;
            f11 = measuredWidth;
            f12 = 0.0f;
        }
        CharSequence charSequence2 = g6Var.i;
        if (charSequence2 == null || charSequence2.length() == 0) {
            f13 = measuredHeight;
            ly0Var = ly0Var4;
            f14 = 2.0f;
        } else {
            Rect rect = org.telegram.messenger.g0.Q;
            f14 = 2.0f;
            int L = (int) (ly0Var4.c + f11 + org.telegram.messenger.g0.L(4.66f));
            int L2 = (int) (measuredHeight - org.telegram.messenger.g0.L(9.0f));
            f13 = measuredHeight;
            int c2 = (int) (g6Var.c() + ly0Var4.c + f11 + org.telegram.messenger.g0.L(f10));
            ly0Var = ly0Var4;
            rect.set(L, L2, c2, (int) (f13 + org.telegram.messenger.g0.L(9.0f)));
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(rect);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), paint);
            rect.offset(-org.telegram.messenger.g0.L(0.33f), -org.telegram.messenger.g0.L(0.66f));
            g6Var.setBounds(rect);
            g6Var.draw(canvas);
        }
        float L3 = org.telegram.messenger.g0.L(30.0f);
        float f18 = (f11 - L3) - ly0Var2.c;
        canvas.save();
        canvas.translate(f18, (f13 - (ly0Var2.i() / f14)) + org.telegram.messenger.g0.L(1.0f));
        ly0Var2.d(canvas);
        canvas.restore();
        float f19 = f11 + f12;
        if (ly0Var3 != null) {
            canvas.save();
            canvas.translate(f19 + L3, (f13 - (ly0Var3.i() / f14)) + org.telegram.messenger.g0.L(1.0f));
            ly0Var3.d(canvas);
            canvas.restore();
            f19 += L3 + ly0Var3.c;
        }
        float f20 = f19;
        float L4 = org.telegram.messenger.g0.L(12.0f) + (ly0Var.i() / f14) + f13;
        canvas.drawRect(0.0f, L4, getMeasuredWidth(), 1.0f + L4, this.a);
        path.rewind();
        RectF rectF2 = org.telegram.messenger.g0.P;
        float f21 = f12 / f14;
        float f22 = measuredWidth + f21;
        rectF2.set((measuredWidth - f21) - org.telegram.messenger.g0.L(4.0f), L4 - org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f) + f22, L4);
        path.addRoundRect(rectF2, this.e, Path.Direction.CW);
        canvas.drawPath(path, paint);
        canvas.save();
        float max = Math.max(org.telegram.messenger.g0.L(8.0f), f18);
        matrix2.reset();
        matrix2.postTranslate(Math.min(f11, max + org.telegram.messenger.g0.L(8.0f)), 0.0f);
        this.r.setLocalMatrix(matrix2);
        float min = Math.min(getMeasuredWidth() - org.telegram.messenger.g0.L(8.0f), f20);
        matrix.reset();
        matrix.postTranslate(Math.max(f22, min - org.telegram.messenger.g0.L(88.0f)), 0.0f);
        this.s.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, measuredWidth, getMeasuredHeight(), this.w);
        canvas.drawRect(measuredWidth, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.x);
        canvas.restore();
        canvas.restore();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        Paint paint = this.c;
        TextPaint textPaint = this.b;
        TextPaint textPaint2 = this.a;
        if (textPaint2 == null || textPaint == null || paint == null) {
            return;
        }
        int i3 = org.telegram.ui.ActionBar.k6.si;
        textPaint2.setColor(org.telegram.ui.ActionBar.k6.r1(0.8f, org.telegram.ui.ActionBar.k6.x0(null, i3, false)));
        int i10 = org.telegram.ui.ActionBar.k6.o6;
        textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Hi, false));
        try {
            g6 g6Var = this.F;
            if (g6Var != null) {
                g6Var.u(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false));
            }
            int r12 = org.telegram.ui.ActionBar.k6.r1(0.8f, org.telegram.ui.ActionBar.k6.x0(null, i3, false));
            ly0 ly0Var = this.f;
            if (ly0Var != null) {
                ly0Var.n(r12);
            }
            ly0 ly0Var2 = this.h;
            if (ly0Var2 != null) {
                ly0Var2.n(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
            }
            ly0 ly0Var3 = this.n;
            if (ly0Var3 != null) {
                ly0Var3.n(r12);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.F || super.verifyDrawable(drawable);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
