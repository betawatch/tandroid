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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ly0 {
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
    public l5 k;
    public int l;
    public PorterDuffColorFilter m;
    public int n;
    public boolean o;
    public float p;
    public LinearGradient q;
    public Matrix r;
    public Paint s;
    public int t;

    public ly0(CharSequence charSequence, TextPaint textPaint) {
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
        for (int i3 = 0; i3 < this.b.getLineCount(); i3++) {
            f10 = Math.max(f10, this.b.getLineWidth(i3));
        }
        return f10;
    }

    public final void c(float f10, float f11, float f12, int i3, Canvas canvas) {
        if (this.b == null) {
            return;
        }
        TextPaint textPaint = this.a;
        textPaint.setColor(i3);
        textPaint.linkColor = i3;
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
            canvas.saveLayerAlpha(0.0f, -this.t, f10 - 1.0f, r0.getHeight() + this.t, org.telegram.messenger.hs.e4, 31);
        }
        canvas.save();
        canvas.translate(-this.d, 0.0f);
        boolean z10 = this.o;
        TextPaint textPaint = this.a;
        if (z10) {
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
            p5.drawAnimatedEmojis(canvas, this.b, this.k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.m);
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

    public final void m(int i3) {
        this.f = i3;
        q(this.b.getText());
    }

    public final void n(int i3) {
        this.a.setColor(i3);
    }

    public final void o(int i3) {
        if (this.l != i3) {
            this.l = i3;
            if (this.i) {
                p5.release(this.j, this.k);
                this.k = p5.update(this.l, this.j, this.k, this.b);
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
            for (int i3 = 0; i3 < this.b.getLineCount(); i3++) {
                this.c = Math.max(this.c, this.b.getLineWidth(i3));
                this.d = Math.min(this.d, this.b.getLineLeft(i3));
            }
        }
        View view = this.j;
        if (view == null || !view.isAttachedToWindow()) {
            return;
        }
        this.k = p5.update(this.l, this.j, this.k, this.b);
    }

    public final void r(View view) {
        int i3 = 1;
        this.i = true;
        this.j = view;
        if (view.isAttachedToWindow()) {
            this.k = p5.update(this.l, view, this.k, this.b);
        }
        view.addOnAttachStateChangeListener(new z9(i3, this, view));
    }

    public ly0(String str, float f10) {
        this(str, f10, null);
    }

    public ly0(CharSequence charSequence, float f10, Typeface typeface) {
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
