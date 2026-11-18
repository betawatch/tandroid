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
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.sp;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class d5 extends View implements te.b {
    public int E;
    public int F;
    public int G;
    public final a5 a;
    public final int b;
    public final c5 c;
    public final b5 d;
    public final Drawable e;
    public final sp f;
    public final TextPaint h;
    public final Paint n;
    public final RectF r;
    public CharSequence s;
    public float w;
    public final te.a x;
    public final te.a y;

    public d5(Context context, a5 a5Var, CharSequence charSequence) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        this.n = new Paint(1);
        this.r = new RectF();
        lr lrVar = lr.h;
        this.x = new te.a(0, this, lrVar, 380L, true);
        this.y = new te.a(1, this, lrVar, 250L, false);
        this.a = a5Var;
        this.b = 1;
        this.c = (c5) aj.e.k.a();
        this.d = (b5) aj.e.l.a();
        this.s = charSequence;
        this.e = context.getDrawable(R.drawable.ic_ab_done).mutate();
        sp spVar = new sp(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(2.0f), -1);
        this.f = spVar;
        spVar.setCallback(this);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
        c();
        CharSequence charSequence2 = this.s;
        this.w = charSequence2 != null ? textPaint.measureText(charSequence2, 0, charSequence2.length()) : 0.0f;
        setContentDescription(charSequence);
        setOnClickListener(new hi.o0(this, 24));
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
        a5 a5Var = this.a;
        aVar.a(z10, z11 && a5Var.y());
        H(0, aVar.e, 0.0f, null);
        a5Var.requestLayout();
    }

    public final void b(boolean z10) {
        this.y.a(z10, this.a.y());
        invalidate();
    }

    public final void c() {
        a5 a5Var = this.a;
        i6 i6Var = a5Var.a;
        this.E = n6.w0(n6.Fi, i6Var);
        this.F = i0.a.f(0.5f, n6.w0(n6.a7, i6Var), this.E);
        int w02 = n6.w0(n6.Ji, i6Var);
        this.G = w02;
        int i7 = a5Var.g0;
        c5 c5Var = this.c;
        c5 c5Var2 = c5.b;
        if (c5Var != c5Var2) {
            w02 = i7;
        }
        this.e.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        this.f.b(w02);
        this.h.setColor(w02);
        setBackground(n6.a0(c5Var == c5Var2 ? n6.r1(0.2f, this.G) : a5Var.i0, org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(23.0f)));
        invalidate();
    }

    public int getButtonId() {
        return this.b;
    }

    public int getButtonWidth() {
        if (this.d == b5.a || TextUtils.isEmpty(this.s)) {
            return org.telegram.messenger.g0.L(46.0f);
        }
        return org.telegram.messenger.f3.b(32.0f, (int) Math.ceil(this.w), org.telegram.messenger.g0.L(46.0f));
    }

    public b5 getShape() {
        return this.d;
    }

    public c5 getStyle() {
        return this.c;
    }

    public float getTargetVisibleFactor() {
        return (this.c == c5.b || this.x.f) ? 1.0f : 0.0f;
    }

    public float getVisibleFactor() {
        if (this.c == c5.b) {
            return 1.0f;
        }
        return this.x.e;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        float width = getWidth();
        float height = getHeight();
        if (this.c == c5.b) {
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
            if (this.d == b5.a || TextUtils.isEmpty(this.s)) {
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
            sp spVar = this.f;
            spVar.setBounds(0, 0, (int) width, (int) height);
            spVar.setAlpha((int) (f13 * 255.0f));
            spVar.draw(canvas);
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
