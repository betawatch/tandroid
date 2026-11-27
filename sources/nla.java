// default package

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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class nla extends View implements s84 {
    public int E;
    public int F;
    public int G;
    public final jla a;
    public final boolean b;
    public final mla c;
    public final lla d;
    public final Drawable e;
    public final di2 f;
    public final TextPaint h;
    public final Paint n;
    public final RectF r;
    public CharSequence s;
    public float w;
    public final fm0 x;
    public final fm0 y;

    public nla(Context context, jla jlaVar, String str) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        this.n = new Paint(1);
        this.r = new RectF();
        k43 k43Var = k43.h;
        this.x = new fm0(0, this, k43Var, 380L, true);
        this.y = new fm0(1, this, k43Var, 250L, false);
        this.a = jlaVar;
        this.b = true;
        this.c = (mla) phd.j.a();
        this.d = (lla) phd.k.a();
        this.s = str;
        this.e = context.getDrawable(R.drawable.ic_ab_done).mutate();
        di2 di2Var = new di2(hl.L(18.0f), hl.L(2.0f), -1);
        this.f = di2Var;
        di2Var.setCallback(this);
        textPaint.setTypeface(hl.o());
        textPaint.setTextSize(hl.L(15.0f));
        c();
        CharSequence charSequence = this.s;
        byte b = 0;
        this.w = charSequence != null ? textPaint.measureText(charSequence, 0, charSequence.length()) : 0.0f;
        setContentDescription(str);
        setOnClickListener(new kla(this, b));
    }

    public final void a(boolean z, boolean z2) {
        t84 t84Var;
        fm0 fm0Var = this.x;
        if (fm0Var.f == z && (z2 || (t84Var = fm0Var.h) == null || !t84Var.h)) {
            return;
        }
        jla jlaVar = this.a;
        fm0Var.a(z, z2 && jlaVar.A());
        t(0, fm0Var.e, 0.0f, null);
        jlaVar.requestLayout();
    }

    public final void b(boolean z) {
        this.y.a(z, this.a.A());
        invalidate();
    }

    public final void c() {
        jla jlaVar = this.a;
        vnb vnbVar = jlaVar.a;
        this.E = aob.v0(aob.Fi, vnbVar);
        this.F = vm2.f(0.5f, aob.v0(aob.a7, vnbVar), this.E);
        int v0 = aob.v0(aob.Ji, vnbVar);
        this.G = v0;
        int i = jlaVar.m0;
        mla mlaVar = this.c;
        mla mlaVar2 = mla.b;
        if (mlaVar != mlaVar2) {
            v0 = i;
        }
        this.e.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
        this.f.b(v0);
        this.h.setColor(v0);
        setBackground(aob.Y(mlaVar == mlaVar2 ? aob.p1(0.2f, this.G) : jlaVar.o0, hl.L(23.0f), hl.L(23.0f)));
        invalidate();
    }

    public int getButtonId() {
        return this.b ? 1 : 0;
    }

    public int getButtonWidth() {
        if (this.d == lla.a || TextUtils.isEmpty(this.s)) {
            return hl.L(46.0f);
        }
        return qu6.e(32.0f, (int) Math.ceil(this.w), hl.L(46.0f));
    }

    public lla getShape() {
        return this.d;
    }

    public mla getStyle() {
        return this.c;
    }

    public float getTargetVisibleFactor() {
        return (this.c == mla.b || this.x.f) ? 1.0f : 0.0f;
    }

    public float getVisibleFactor() {
        if (this.c == mla.b) {
            return 1.0f;
        }
        return this.x.e;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float width = getWidth();
        float height = getHeight();
        if (this.c == mla.b) {
            int f2 = vm2.f(this.x.e, this.F, this.E);
            Paint paint = this.n;
            paint.setColor(f2);
            RectF rectF = this.r;
            rectF.set(0.0f, 0.0f, width, height);
            float f3 = height / 2.0f;
            canvas.drawRoundRect(rectF, f3, f3, paint);
        }
        float f4 = this.y.e;
        if (f4 < 1.0f) {
            float R1 = hl.R1(1.0f, 0.6f, f4);
            canvas.save();
            canvas.scale(R1, R1, width / 2.0f, height / 2.0f);
            float f5 = 1.0f - f4;
            int i = (int) (f5 * 255.0f);
            if (this.d == lla.a || TextUtils.isEmpty(this.s)) {
                f = 0.0f;
                Drawable drawable = this.e;
                float intrinsicWidth = drawable.getIntrinsicWidth();
                float intrinsicHeight = drawable.getIntrinsicHeight();
                drawable.setBounds((int) ((width - intrinsicWidth) / 2.0f), (int) ((height - intrinsicHeight) / 2.0f), (int) ((intrinsicWidth + width) / 2.0f), (int) ((intrinsicHeight + height) / 2.0f));
                drawable.setAlpha(i);
                drawable.draw(canvas);
            } else {
                TextPaint textPaint = this.h;
                int alpha = textPaint.getAlpha();
                textPaint.setAlpha((int) (alpha * f5));
                float descent = ((height - textPaint.descent()) - textPaint.ascent()) / 2.0f;
                CharSequence charSequence = this.s;
                f = 0.0f;
                canvas.drawText(charSequence, 0, charSequence.length(), (width - this.w) / 2.0f, descent, textPaint);
                textPaint.setAlpha(alpha);
            }
            canvas.restore();
        } else {
            f = 0.0f;
        }
        if (f4 > f) {
            float R12 = hl.R1(0.6f, 1.0f, f4);
            canvas.save();
            canvas.scale(R12, R12, width / 2.0f, height / 2.0f);
            di2 di2Var = this.f;
            di2Var.setBounds(0, 0, (int) width, (int) height);
            di2Var.setAlpha((int) (f4 * 255.0f));
            di2Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(getButtonWidth(), hl.L(46.0f));
    }

    public void setText(CharSequence charSequence) {
        float f;
        if (TextUtils.equals(this.s, charSequence)) {
            return;
        }
        this.s = charSequence;
        setContentDescription(charSequence);
        CharSequence charSequence2 = this.s;
        if (charSequence2 != null) {
            f = this.h.measureText(charSequence2, 0, charSequence2.length());
        } else {
            f = 0.0f;
        }
        this.w = f;
        requestLayout();
        this.a.requestLayout();
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        this.a.invalidate();
    }

    @Override // s84
    public final void t(int i, float f, float f2, t84 t84Var) {
        if (i == 0) {
            this.a.l();
        }
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.f || super.verifyDrawable(drawable);
    }

    @Override // s84
    public final void v0(float f, int i) {
    }
}
