package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class b5 extends View implements qe.b {
    public int E;
    public int F;
    public int G;
    public final y4 a;
    public final int b;
    public final a5 c;
    public final z4 d;
    public final Drawable e;
    public final cp f;
    public final TextPaint h;
    public final Paint n;
    public final RectF r;
    public CharSequence s;
    public float w;
    public final qe.a x;
    public final qe.a y;

    public b5(Context context, y4 y4Var, CharSequence charSequence) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        this.n = new Paint(1);
        this.r = new RectF();
        xq xqVar = xq.h;
        this.x = new qe.a(0, this, xqVar, 380L, true);
        this.y = new qe.a(1, this, xqVar, 250L, false);
        this.a = y4Var;
        this.b = 1;
        this.c = (a5) xi.e.k.a();
        this.d = (z4) xi.e.l.a();
        this.s = charSequence;
        this.e = context.getDrawable(R.drawable.ic_ab_done).mutate();
        cp cpVar = new cp(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(2.0f), -1);
        this.f = cpVar;
        cpVar.setCallback(this);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
        c();
        CharSequence charSequence2 = this.s;
        this.w = charSequence2 != null ? textPaint.measureText(charSequence2, 0, charSequence2.length()) : 0.0f;
        setContentDescription(charSequence);
        setOnClickListener(new ii.m(this, 19));
    }

    @Override // qe.b
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        if (i3 == 0) {
            this.a.g();
        }
        invalidate();
    }

    public final void a(boolean z10, boolean z11) {
        qe.c cVar;
        qe.a aVar = this.x;
        if (aVar.f == z10 && (z11 || (cVar = aVar.h) == null || !cVar.h)) {
            return;
        }
        y4 y4Var = this.a;
        aVar.a(z10, z11 && y4Var.t());
        Y(0, aVar.e, 0.0f, null);
        y4Var.requestLayout();
    }

    public final void b(boolean z10) {
        this.y.a(z10, this.a.t());
        invalidate();
    }

    public final void c() {
        y4 y4Var = this.a;
        e6 e6Var = y4Var.a;
        this.E = k6.w0(k6.Ci, e6Var);
        this.F = i0.a.f(0.5f, k6.w0(k6.a7, e6Var), this.E);
        int w02 = k6.w0(k6.Gi, e6Var);
        this.G = w02;
        int i3 = y4Var.g0;
        a5 a5Var = this.c;
        a5 a5Var2 = a5.b;
        if (a5Var != a5Var2) {
            w02 = i3;
        }
        this.e.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        this.f.b(w02);
        this.h.setColor(w02);
        setBackground(k6.a0(a5Var == a5Var2 ? k6.r1(0.2f, this.G) : y4Var.i0, org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(23.0f)));
        invalidate();
    }

    public int getButtonId() {
        return this.b;
    }

    public int getButtonWidth() {
        if (this.d == z4.a || TextUtils.isEmpty(this.s)) {
            return org.telegram.messenger.g0.L(46.0f);
        }
        return org.telegram.messenger.k5.b(32.0f, (int) Math.ceil(this.w), org.telegram.messenger.g0.L(46.0f));
    }

    public z4 getShape() {
        return this.d;
    }

    public a5 getStyle() {
        return this.c;
    }

    public float getTargetVisibleFactor() {
        return (this.c == a5.b || this.x.f) ? 1.0f : 0.0f;
    }

    public float getVisibleFactor() {
        if (this.c == a5.b) {
            return 1.0f;
        }
        return this.x.e;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        float width = getWidth();
        float height = getHeight();
        if (this.c == a5.b) {
            int f11 = i0.a.f(this.x.e, this.F, this.E);
            Paint paint = this.n;
            paint.setColor(f11);
            RectF rectF = this.r;
            rectF.set(0.0f, 0.0f, width, height);
            float f12 = height / 2.0f;
            canvas.drawRoundRect(rectF, f12, f12, paint);
        }
        float f13 = this.y.e;
        if (f13 < 1.0f) {
            float T1 = org.telegram.messenger.g0.T1(1.0f, 0.6f, f13);
            canvas.save();
            canvas.scale(T1, T1, width / 2.0f, height / 2.0f);
            float f14 = 1.0f - f13;
            int i3 = (int) (f14 * 255.0f);
            if (this.d == z4.a || TextUtils.isEmpty(this.s)) {
                f10 = 0.0f;
                Drawable drawable = this.e;
                float intrinsicWidth = drawable.getIntrinsicWidth();
                float intrinsicHeight = drawable.getIntrinsicHeight();
                drawable.setBounds((int) ((width - intrinsicWidth) / 2.0f), (int) ((height - intrinsicHeight) / 2.0f), (int) ((intrinsicWidth + width) / 2.0f), (int) ((intrinsicHeight + height) / 2.0f));
                drawable.setAlpha(i3);
                drawable.draw(canvas);
            } else {
                TextPaint textPaint = this.h;
                int alpha = textPaint.getAlpha();
                textPaint.setAlpha((int) (alpha * f14));
                float descent = ((height - textPaint.descent()) - textPaint.ascent()) / 2.0f;
                CharSequence charSequence = this.s;
                f10 = 0.0f;
                canvas.drawText(charSequence, 0, charSequence.length(), (width - this.w) / 2.0f, descent, textPaint);
                textPaint.setAlpha(alpha);
            }
            canvas.restore();
        } else {
            f10 = 0.0f;
        }
        if (f13 > f10) {
            float T12 = org.telegram.messenger.g0.T1(0.6f, 1.0f, f13);
            canvas.save();
            canvas.scale(T12, T12, width / 2.0f, height / 2.0f);
            cp cpVar = this.f;
            cpVar.setBounds(0, 0, (int) width, (int) height);
            cpVar.setAlpha((int) (f13 * 255.0f));
            cpVar.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(getButtonWidth(), org.telegram.messenger.g0.L(46.0f));
    }

    public void setText(CharSequence charSequence) {
        float f10;
        if (TextUtils.equals(this.s, charSequence)) {
            return;
        }
        this.s = charSequence;
        setContentDescription(charSequence);
        CharSequence charSequence2 = this.s;
        if (charSequence2 != null) {
            f10 = this.h.measureText(charSequence2, 0, charSequence2.length());
        } else {
            f10 = 0.0f;
        }
        this.w = f10;
        requestLayout();
        this.a.requestLayout();
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        this.a.invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.f || super.verifyDrawable(drawable);
    }

    @Override // qe.b
    public final /* synthetic */ void F(float f10, int i3) {
    }
}
