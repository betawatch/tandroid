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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gq;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class u5 extends View implements oe.d {
    public int E;
    public int F;
    public final r5 a;
    public final int b;
    public final t5 c;
    public final s5 d;
    public final Drawable e;
    public final gq f;
    public final TextPaint h;
    public final Paint n;
    public final RectF r;
    public CharSequence s;
    public float v;
    public final oe.b w;
    public final oe.b x;
    public int y;

    public u5(Context context, r5 r5Var, CharSequence charSequence) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        this.n = new Paint(1);
        this.r = new RectF();
        ds dsVar = ds.h;
        this.w = new oe.b(0, this, dsVar, 380L, true);
        this.x = new oe.b(1, this, dsVar, 250L, false);
        this.a = r5Var;
        this.b = 1;
        this.c = (t5) wi.e.k.a();
        this.d = (s5) wi.e.l.a();
        this.s = charSequence;
        this.e = context.getDrawable(R.drawable.ic_ab_done).mutate();
        gq gqVar = new gq(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(2.0f), -1);
        this.f = gqVar;
        gqVar.setCallback(this);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        c();
        CharSequence charSequence2 = this.s;
        this.v = charSequence2 != null ? textPaint.measureText(charSequence2, 0, charSequence2.length()) : 0.0f;
        setContentDescription(charSequence);
        setOnClickListener(new x(this, 3));
    }

    @Override // oe.d
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        if (i10 == 0) {
            this.a.c();
        }
        invalidate();
    }

    public final void a(boolean z10, boolean z11) {
        oe.e eVar;
        oe.b bVar = this.w;
        if (bVar.f == z10 && (z11 || (eVar = bVar.h) == null || !eVar.h)) {
            return;
        }
        r5 r5Var = this.a;
        bVar.a(z10, z11 && r5Var.p());
        E(0, bVar.e, 0.0f, null);
        r5Var.requestLayout();
    }

    public final void b(boolean z10) {
        this.x.a(z10, this.a.p());
        invalidate();
    }

    public final void c() {
        r5 r5Var = this.a;
        u6 u6Var = r5Var.a;
        this.y = y6.w0(y6.Oh, u6Var);
        this.E = i0.a.f(0.5f, y6.w0(y6.a7, u6Var), this.y);
        int w02 = y6.w0(y6.Sh, u6Var);
        this.F = w02;
        int i10 = r5Var.d0;
        t5 t5Var = this.c;
        t5 t5Var2 = t5.b;
        if (t5Var != t5Var2) {
            w02 = i10;
        }
        this.e.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        this.f.b(w02);
        this.h.setColor(w02);
        setBackground(y6.Z(t5Var == t5Var2 ? y6.o1(0.2f, this.F) : r5Var.f0, AndroidUtilities.dp(23.0f), AndroidUtilities.dp(23.0f)));
        invalidate();
    }

    public int getButtonId() {
        return this.b;
    }

    public int getButtonWidth() {
        if (this.d == s5.a || TextUtils.isEmpty(this.s)) {
            return AndroidUtilities.dp(46.0f);
        }
        return org.telegram.messenger.t.z(32.0f, (int) Math.ceil(this.v), AndroidUtilities.dp(46.0f));
    }

    public s5 getShape() {
        return this.d;
    }

    public t5 getStyle() {
        return this.c;
    }

    public float getTargetVisibleFactor() {
        return (this.c == t5.b || this.w.f) ? 1.0f : 0.0f;
    }

    public float getVisibleFactor() {
        if (this.c == t5.b) {
            return 1.0f;
        }
        return this.w.e;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f7;
        float width = getWidth();
        float height = getHeight();
        if (this.c == t5.b) {
            int f10 = i0.a.f(this.w.e, this.E, this.y);
            Paint paint = this.n;
            paint.setColor(f10);
            RectF rectF = this.r;
            rectF.set(0.0f, 0.0f, width, height);
            float f11 = height / 2.0f;
            canvas.drawRoundRect(rectF, f11, f11, paint);
        }
        float f12 = this.x.e;
        if (f12 < 1.0f) {
            float lerp = AndroidUtilities.lerp(1.0f, 0.6f, f12);
            canvas.save();
            canvas.scale(lerp, lerp, width / 2.0f, height / 2.0f);
            float f13 = 1.0f - f12;
            int i10 = (int) (f13 * 255.0f);
            if (this.d == s5.a || TextUtils.isEmpty(this.s)) {
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
                canvas.drawText(charSequence, 0, charSequence.length(), (width - this.v) / 2.0f, descent, textPaint);
                textPaint.setAlpha(alpha);
            }
            canvas.restore();
        } else {
            f7 = 0.0f;
        }
        if (f12 > f7) {
            float lerp2 = AndroidUtilities.lerp(0.6f, 1.0f, f12);
            canvas.save();
            canvas.scale(lerp2, lerp2, width / 2.0f, height / 2.0f);
            gq gqVar = this.f;
            gqVar.setBounds(0, 0, (int) width, (int) height);
            gqVar.setAlpha((int) (f12 * 255.0f));
            gqVar.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(getButtonWidth(), AndroidUtilities.dp(46.0f));
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
        this.v = f7;
        requestLayout();
        this.a.requestLayout();
    }

    @Override // android.view.View
    public void setTranslationX(float f7) {
        super.setTranslationX(f7);
        this.a.invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.f || super.verifyDrawable(drawable);
    }

    @Override // oe.d
    public final /* synthetic */ void z(float f7, int i10) {
    }
}
