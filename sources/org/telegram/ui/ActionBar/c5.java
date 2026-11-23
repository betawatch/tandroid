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
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.up;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class c5 extends View implements te.b {
    public int E;
    public int F;
    public int G;
    public final z4 a;
    public final int b;
    public final b5 c;
    public final a5 d;
    public final Drawable e;
    public final up f;
    public final TextPaint h;
    public final Paint n;
    public final RectF r;
    public CharSequence s;
    public float w;
    public final te.a x;
    public final te.a y;

    public c5(Context context, z4 z4Var, CharSequence charSequence) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        this.n = new Paint(1);
        this.r = new RectF();
        nr nrVar = nr.h;
        this.x = new te.a(0, this, nrVar, 380L, true);
        this.y = new te.a(1, this, nrVar, 250L, false);
        this.a = z4Var;
        this.b = 1;
        this.c = (b5) aj.e.k.a();
        this.d = (a5) aj.e.l.a();
        this.s = charSequence;
        this.e = context.getDrawable(R.drawable.ic_ab_done).mutate();
        up upVar = new up(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(2.0f), -1);
        this.f = upVar;
        upVar.setCallback(this);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
        c();
        CharSequence charSequence2 = this.s;
        this.w = charSequence2 != null ? textPaint.measureText(charSequence2, 0, charSequence2.length()) : 0.0f;
        setContentDescription(charSequence);
        setOnClickListener(new hi.o4(this, 23));
    }

    @Override // te.b
    public final void H(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            this.a.l();
        }
        invalidate();
    }

    public final void a(boolean z10, boolean z11) {
        te.c cVar;
        te.a aVar = this.x;
        if (aVar.f == z10 && (z11 || (cVar = aVar.h) == null || !cVar.h)) {
            return;
        }
        z4 z4Var = this.a;
        aVar.a(z10, z11 && z4Var.y());
        H(0, aVar.e, 0.0f, null);
        z4Var.requestLayout();
    }

    public final void b(boolean z10) {
        this.y.a(z10, this.a.y());
        invalidate();
    }

    public final void c() {
        z4 z4Var = this.a;
        h6 h6Var = z4Var.a;
        this.E = m6.w0(m6.Fi, h6Var);
        this.F = i0.a.f(0.5f, m6.w0(m6.a7, h6Var), this.E);
        int w02 = m6.w0(m6.Ji, h6Var);
        this.G = w02;
        int i7 = z4Var.g0;
        b5 b5Var = this.c;
        b5 b5Var2 = b5.b;
        if (b5Var != b5Var2) {
            w02 = i7;
        }
        this.e.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        this.f.b(w02);
        this.h.setColor(w02);
        setBackground(m6.a0(b5Var == b5Var2 ? m6.r1(0.2f, this.G) : z4Var.i0, org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(23.0f)));
        invalidate();
    }

    public int getButtonId() {
        return this.b;
    }

    public int getButtonWidth() {
        if (this.d == a5.a || TextUtils.isEmpty(this.s)) {
            return org.telegram.messenger.g0.L(46.0f);
        }
        return org.telegram.messenger.f3.b(32.0f, (int) Math.ceil(this.w), org.telegram.messenger.g0.L(46.0f));
    }

    public a5 getShape() {
        return this.d;
    }

    public b5 getStyle() {
        return this.c;
    }

    public float getTargetVisibleFactor() {
        return (this.c == b5.b || this.x.f) ? 1.0f : 0.0f;
    }

    public float getVisibleFactor() {
        if (this.c == b5.b) {
            return 1.0f;
        }
        return this.x.e;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        float width = getWidth();
        float height = getHeight();
        if (this.c == b5.b) {
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
            int i7 = (int) (f14 * 255.0f);
            if (this.d == a5.a || TextUtils.isEmpty(this.s)) {
                f10 = 0.0f;
                Drawable drawable = this.e;
                float intrinsicWidth = drawable.getIntrinsicWidth();
                float intrinsicHeight = drawable.getIntrinsicHeight();
                drawable.setBounds((int) ((width - intrinsicWidth) / 2.0f), (int) ((height - intrinsicHeight) / 2.0f), (int) ((intrinsicWidth + width) / 2.0f), (int) ((intrinsicHeight + height) / 2.0f));
                drawable.setAlpha(i7);
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
            up upVar = this.f;
            upVar.setBounds(0, 0, (int) width, (int) height);
            upVar.setAlpha((int) (f13 * 255.0f));
            upVar.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
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

    @Override // te.b
    public final /* synthetic */ void D(float f10, int i7) {
    }
}
