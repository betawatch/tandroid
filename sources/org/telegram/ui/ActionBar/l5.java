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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.kp;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class l5 extends View implements fe.e {
    public int D;
    public int E;
    public int F;
    public final i5 a;
    public final int b;
    public final k5 c;
    public final j5 d;
    public final Drawable e;
    public final kp f;
    public final TextPaint h;
    public final Paint n;
    public final RectF r;
    public CharSequence s;
    public float w;
    public final fe.b x;
    public final fe.b y;

    public l5(Context context, i5 i5Var, CharSequence charSequence) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        this.n = new Paint(1);
        this.r = new RectF();
        gr grVar = gr.h;
        this.x = new fe.b(0, this, grVar, 380L, true);
        this.y = new fe.b(1, this, grVar, 250L, false);
        this.a = i5Var;
        this.b = 1;
        this.c = (k5) mi.e.k.a();
        this.d = (j5) mi.e.l.a();
        this.s = charSequence;
        this.e = context.getDrawable(R.drawable.ic_ab_done).mutate();
        kp kpVar = new kp(org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(2.0f), -1);
        this.f = kpVar;
        kpVar.setCallback(this);
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        textPaint.setTextSize(org.telegram.messenger.i0.L(15.0f));
        c();
        CharSequence charSequence2 = this.s;
        this.w = charSequence2 != null ? textPaint.measureText(charSequence2, 0, charSequence2.length()) : 0.0f;
        setContentDescription(charSequence);
        setOnClickListener(new ag.g(this, 19));
    }

    public final void a(boolean z10, boolean z11) {
        fe.f fVar;
        fe.b bVar = this.x;
        if (bVar.f == z10 && (z11 || (fVar = bVar.h) == null || !fVar.h)) {
            return;
        }
        i5 i5Var = this.a;
        bVar.a(z10, z11 && i5Var.t());
        v(0, bVar.e, 0.0f, null);
        i5Var.requestLayout();
    }

    public final void b(boolean z10) {
        this.y.a(z10, this.a.t());
        invalidate();
    }

    public final void c() {
        i5 i5Var = this.a;
        p6 p6Var = i5Var.a;
        this.D = t6.w0(t6.Ci, p6Var);
        this.E = i0.b.f(0.5f, t6.w0(t6.a7, p6Var), this.D);
        int w02 = t6.w0(t6.Gi, p6Var);
        this.F = w02;
        int i10 = i5Var.f0;
        k5 k5Var = this.c;
        k5 k5Var2 = k5.b;
        if (k5Var != k5Var2) {
            w02 = i10;
        }
        this.e.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        this.f.b(w02);
        this.h.setColor(w02);
        setBackground(t6.a0(k5Var == k5Var2 ? t6.r1(0.2f, this.F) : i5Var.h0, org.telegram.messenger.i0.L(23.0f), org.telegram.messenger.i0.L(23.0f)));
        invalidate();
    }

    public int getButtonId() {
        return this.b;
    }

    public int getButtonWidth() {
        if (this.d == j5.a || TextUtils.isEmpty(this.s)) {
            return org.telegram.messenger.i0.L(46.0f);
        }
        return org.telegram.messenger.m5.b(32.0f, (int) Math.ceil(this.w), org.telegram.messenger.i0.L(46.0f));
    }

    public j5 getShape() {
        return this.d;
    }

    public k5 getStyle() {
        return this.c;
    }

    public float getTargetVisibleFactor() {
        return (this.c == k5.b || this.x.f) ? 1.0f : 0.0f;
    }

    public float getVisibleFactor() {
        if (this.c == k5.b) {
            return 1.0f;
        }
        return this.x.e;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f7;
        float width = getWidth();
        float height = getHeight();
        if (this.c == k5.b) {
            int f10 = i0.b.f(this.x.e, this.E, this.D);
            Paint paint = this.n;
            paint.setColor(f10);
            RectF rectF = this.r;
            rectF.set(0.0f, 0.0f, width, height);
            float f11 = height / 2.0f;
            canvas.drawRoundRect(rectF, f11, f11, paint);
        }
        float f12 = this.y.e;
        if (f12 < 1.0f) {
            float T1 = org.telegram.messenger.i0.T1(1.0f, 0.6f, f12);
            canvas.save();
            canvas.scale(T1, T1, width / 2.0f, height / 2.0f);
            float f13 = 1.0f - f12;
            int i10 = (int) (f13 * 255.0f);
            if (this.d == j5.a || TextUtils.isEmpty(this.s)) {
                f7 = 0.0f;
                Drawable drawable = this.e;
                float intrinsicWidth = drawable.getIntrinsicWidth();
                float intrinsicHeight = drawable.getIntrinsicHeight();
                drawable.setBounds((int) ((width - intrinsicWidth) / 2.0f), (int) ((height - intrinsicHeight) / 2.0f), (int) ((intrinsicWidth + width) / 2.0f), (int) ((intrinsicHeight + height) / 2.0f));
                drawable.setAlpha(i10);
                drawable.draw(canvas);
            } else {
                TextPaint textPaint = this.h;
                int alpha = textPaint.getAlpha();
                textPaint.setAlpha((int) (alpha * f13));
                float descent = ((height - textPaint.descent()) - textPaint.ascent()) / 2.0f;
                CharSequence charSequence = this.s;
                f7 = 0.0f;
                canvas.drawText(charSequence, 0, charSequence.length(), (width - this.w) / 2.0f, descent, textPaint);
                textPaint.setAlpha(alpha);
            }
            canvas.restore();
        } else {
            f7 = 0.0f;
        }
        if (f12 > f7) {
            float T12 = org.telegram.messenger.i0.T1(0.6f, 1.0f, f12);
            canvas.save();
            canvas.scale(T12, T12, width / 2.0f, height / 2.0f);
            kp kpVar = this.f;
            kpVar.setBounds(0, 0, (int) width, (int) height);
            kpVar.setAlpha((int) (f12 * 255.0f));
            kpVar.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(getButtonWidth(), org.telegram.messenger.i0.L(46.0f));
    }

    public void setText(CharSequence charSequence) {
        float f7;
        if (TextUtils.equals(this.s, charSequence)) {
            return;
        }
        this.s = charSequence;
        setContentDescription(charSequence);
        CharSequence charSequence2 = this.s;
        if (charSequence2 != null) {
            f7 = this.h.measureText(charSequence2, 0, charSequence2.length());
        } else {
            f7 = 0.0f;
        }
        this.w = f7;
        requestLayout();
        this.a.requestLayout();
    }

    @Override // android.view.View
    public void setTranslationX(float f7) {
        super.setTranslationX(f7);
        this.a.invalidate();
    }

    @Override // fe.e
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        if (i10 == 0) {
            this.a.g();
        }
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.f || super.verifyDrawable(drawable);
    }

    @Override // fe.e
    public final /* synthetic */ void E(float f7, int i10) {
    }
}
