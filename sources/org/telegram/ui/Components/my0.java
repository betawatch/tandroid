package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class my0 {
    public final TextPaint a;
    public StaticLayout b;
    public float c;
    public float d;
    public float e;
    public int f;
    public Layout.Alignment g;
    public float h;
    public boolean i;
    public View j;
    public n5 k;
    public int l;
    public PorterDuffColorFilter m;
    public int n;
    public boolean o;
    public float p;
    public LinearGradient q;
    public Matrix r;
    public Paint s;
    public int t;

    public my0(CharSequence charSequence, TextPaint textPaint) {
        this.e = 9999.0f;
        this.f = 1;
        this.g = Layout.Alignment.ALIGN_NORMAL;
        this.l = 0;
        this.p = -1.0f;
        this.a = textPaint;
        q(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.g != alignment) {
            this.g = alignment;
            q(this.b.getText());
        }
    }

    public final float b() {
        float f10 = 0.0f;
        for (int i7 = 0; i7 < this.b.getLineCount(); i7++) {
            f10 = Math.max(f10, this.b.getLineWidth(i7));
        }
        return f10;
    }

    public final void c(float f10, float f11, float f12, int i7, Canvas canvas) {
        if (this.b == null) {
            return;
        }
        TextPaint textPaint = this.a;
        textPaint.setColor(i7);
        textPaint.linkColor = i7;
        int alpha = textPaint.getAlpha();
        if (f12 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f12));
        }
        canvas.save();
        canvas.translate(f10, f11 - (this.f > 1 ? 0.0f : this.b.getHeight() / 2.0f));
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        if (this.b == null) {
            return;
        }
        float f10 = this.p;
        if (f10 >= 0.0f && this.c > f10) {
            canvas.saveLayerAlpha(0.0f, -this.t, f10 - 1.0f, r0.getHeight() + this.t, org.telegram.messenger.qs.e4, 31);
        }
        canvas.save();
        canvas.translate(-this.d, 0.0f);
        boolean z9 = this.o;
        TextPaint textPaint = this.a;
        if (z9) {
            canvas.drawText(this.b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
        } else {
            this.b.draw(canvas);
        }
        if (this.i) {
            if (this.m == null || textPaint.getColor() != this.n) {
                int color = textPaint.getColor();
                this.n = color;
                this.m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
            }
            r5.drawAnimatedEmojis(canvas, this.b, this.k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.m);
        }
        canvas.restore();
        float f11 = this.p;
        if (f11 < 0.0f || this.c <= f11) {
            return;
        }
        if (this.q == null) {
            this.q = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.r = new Matrix();
            Paint paint = new Paint(1);
            this.s = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            this.s.setShader(this.q);
        }
        canvas.save();
        this.r.reset();
        this.r.postTranslate(this.p - org.telegram.messenger.g0.L(8.0f), 0.0f);
        this.q.setLocalMatrix(this.r);
        canvas.drawRect(this.p - org.telegram.messenger.g0.L(8.0f), 0.0f, this.p, this.b.getHeight(), this.s);
        canvas.restore();
        canvas.restore();
    }

    public final void e(Canvas canvas, float f10, float f11) {
        f(canvas, f10, f11, 1.0f);
    }

    public final void f(Canvas canvas, float f10, float f11, float f12) {
        if (this.b == null) {
            return;
        }
        canvas.save();
        canvas.translate(f10, f11 - (this.f > 1 ? 0.0f : this.b.getHeight() / 2.0f));
        TextPaint textPaint = this.a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f12));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final float g() {
        return this.c;
    }

    public final Paint.FontMetricsInt h() {
        return this.a.getFontMetricsInt();
    }

    public final float i() {
        return this.b.getHeight();
    }

    public final CharSequence j() {
        StaticLayout staticLayout = this.b;
        return (staticLayout == null || staticLayout.getText() == null) ? "" : this.b.getText();
    }

    public final float k() {
        float f10 = this.p;
        return f10 >= 0.0f ? Math.min(f10, this.c) : this.c;
    }

    public final void l(float f10) {
        if (this.h != f10) {
            this.h = f10;
            q(this.b.getText());
        }
    }

    public final void m(int i7) {
        this.f = i7;
        q(this.b.getText());
    }

    public final void n(int i7) {
        this.a.setColor(i7);
    }

    public final void o(int i7) {
        if (this.l != i7) {
            this.l = i7;
            if (this.i) {
                r5.release(this.j, this.k);
                this.k = r5.update(this.l, this.j, this.k, this.b);
            }
        }
    }

    public final void p(float f10) {
        this.e = f10;
        q(this.b.getText());
    }

    public final void q(CharSequence charSequence) {
        if (this.f > 1) {
            this.b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.a, (int) Math.max(this.e, 1.0f)).setAlignment(this.g).setMaxLines(this.f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.b = new StaticLayout(org.telegram.messenger.g0.N2(charSequence), this.a, (int) Math.max(this.e, 1.0f), this.g, 1.0f, this.h, false);
        }
        if (this.g == Layout.Alignment.ALIGN_CENTER) {
            this.c = this.b.getWidth();
            this.d = 0.0f;
        } else {
            this.c = 0.0f;
            this.d = this.b.getWidth();
            for (int i7 = 0; i7 < this.b.getLineCount(); i7++) {
                this.c = Math.max(this.c, this.b.getLineWidth(i7));
                this.d = Math.min(this.d, this.b.getLineLeft(i7));
            }
        }
        View view = this.j;
        if (view == null || !view.isAttachedToWindow()) {
            return;
        }
        this.k = r5.update(this.l, this.j, this.k, this.b);
    }

    public final void r(View view) {
        int i7 = 1;
        this.i = true;
        this.j = view;
        if (view.isAttachedToWindow()) {
            this.k = r5.update(this.l, view, this.k, this.b);
        }
        view.addOnAttachStateChangeListener(new aa(i7, this, view));
    }

    public my0(String str, float f10) {
        this(str, f10, null);
    }

    public my0(CharSequence charSequence, float f10, Typeface typeface) {
        this.e = 9999.0f;
        this.f = 1;
        this.g = Layout.Alignment.ALIGN_NORMAL;
        this.l = 0;
        this.p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(f10));
        textPaint.setTypeface(typeface);
        q(charSequence);
    }
}
