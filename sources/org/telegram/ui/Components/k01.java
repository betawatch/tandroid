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
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class k01 {
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
    public q5 k;
    public int l;
    public PorterDuffColorFilter m;
    public int n;
    public boolean o;
    public float p;
    public LinearGradient q;
    public Matrix r;
    public Paint s;
    public int t;

    public k01(CharSequence charSequence, TextPaint textPaint) {
        this.e = 9999.0f;
        this.f = 1;
        this.g = Layout.Alignment.ALIGN_NORMAL;
        this.l = 0;
        this.p = -1.0f;
        this.a = textPaint;
        r(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.g != alignment) {
            this.g = alignment;
            r(this.b.getText());
        }
    }

    public final float b() {
        float f10 = 0.0f;
        for (int i10 = 0; i10 < this.b.getLineCount(); i10++) {
            f10 = Math.max(f10, this.b.getLineWidth(i10));
        }
        return f10;
    }

    public final void c(float f10, float f11, float f12, int i10, Canvas canvas) {
        if (this.b == null) {
            return;
        }
        TextPaint textPaint = this.a;
        textPaint.setColor(i10);
        textPaint.linkColor = i10;
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
            canvas.saveLayerAlpha(0.0f, -this.t, f10 - 1.0f, r0.getHeight() + this.t, 255, 31);
        }
        canvas.save();
        canvas.translate(-this.d, 0.0f);
        boolean z4 = this.o;
        TextPaint textPaint = this.a;
        if (z4) {
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
            u5.drawAnimatedEmojis(canvas, this.b, this.k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.m);
        }
        canvas.restore();
        float f11 = this.p;
        if (f11 < 0.0f || this.c <= f11) {
            return;
        }
        if (this.q == null) {
            this.q = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.r = new Matrix();
            Paint paint = new Paint(1);
            this.s = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            this.s.setShader(this.q);
        }
        canvas.save();
        this.r.reset();
        this.r.postTranslate(this.p - AndroidUtilities.dp(8.0f), 0.0f);
        this.q.setLocalMatrix(this.r);
        canvas.drawRect(this.p - AndroidUtilities.dp(8.0f), 0.0f, this.p, this.b.getHeight(), this.s);
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

    public final void g(float f10) {
        this.p = f10;
    }

    public final float h() {
        return this.c;
    }

    public final Paint.FontMetricsInt i() {
        return this.a.getFontMetricsInt();
    }

    public final float j() {
        return this.b.getHeight();
    }

    public final CharSequence k() {
        StaticLayout staticLayout = this.b;
        return (staticLayout == null || staticLayout.getText() == null) ? "" : this.b.getText();
    }

    public final float l() {
        float f10 = this.p;
        return f10 >= 0.0f ? Math.min(f10, this.c) : this.c;
    }

    public final void m(float f10) {
        if (this.h != f10) {
            this.h = f10;
            r(this.b.getText());
        }
    }

    public final void n(int i10) {
        this.f = i10;
        r(this.b.getText());
    }

    public final void o(int i10) {
        this.a.setColor(i10);
    }

    public final void p(int i10) {
        if (this.l != i10) {
            this.l = i10;
            if (this.i) {
                u5.release(this.j, this.k);
                this.k = u5.update(this.l, this.j, this.k, this.b);
            }
        }
    }

    public final void q(float f10) {
        this.e = f10;
        r(this.b.getText());
    }

    public final void r(CharSequence charSequence) {
        if (this.f <= 1 || Build.VERSION.SDK_INT < 23) {
            this.b = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.a, (int) Math.max(this.e, 1.0f), this.g, 1.0f, this.h, false);
        } else {
            this.b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.a, (int) Math.max(this.e, 1.0f)).setAlignment(this.g).setMaxLines(this.f).setLineSpacing(this.h, 1.0f).build();
        }
        if (this.g == Layout.Alignment.ALIGN_CENTER) {
            this.c = this.b.getWidth();
            this.d = 0.0f;
        } else {
            this.c = 0.0f;
            this.d = this.b.getWidth();
            for (int i10 = 0; i10 < this.b.getLineCount(); i10++) {
                this.c = Math.max(this.c, this.b.getLineWidth(i10));
                this.d = Math.min(this.d, this.b.getLineLeft(i10));
            }
        }
        View view = this.j;
        if (view == null || !view.isAttachedToWindow()) {
            return;
        }
        this.k = u5.update(this.l, this.j, this.k, this.b);
    }

    public final void s(View view) {
        int i10 = 1;
        this.i = true;
        this.j = view;
        if (view.isAttachedToWindow()) {
            this.k = u5.update(this.l, view, this.k, this.b);
        }
        view.addOnAttachStateChangeListener(new da(i10, this, view));
    }

    public k01(String str, float f10) {
        this(str, f10, null);
    }

    public k01(CharSequence charSequence, float f10, Typeface typeface) {
        this.e = 9999.0f;
        this.f = 1;
        this.g = Layout.Alignment.ALIGN_NORMAL;
        this.l = 0;
        this.p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(f10));
        textPaint.setTypeface(typeface);
        r(charSequence);
    }
}
