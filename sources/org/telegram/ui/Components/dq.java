package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class dq extends ReplacementSpan {
    public int D;
    public int E;
    public final int F;
    public float G;
    public float H;
    public float I;
    public boolean J;
    public Paint.FontMetricsInt K;
    public boolean a;
    public int b;
    public Drawable c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int h;
    public int n;
    public float r;
    public float s;
    public float w;
    public float x;
    public int y;

    public dq(int i10) {
        this(i10, 0);
    }

    public final void a(int i10) {
        this.h = i10;
        this.e = i10 < 0;
    }

    public final void b(Paint.FontMetricsInt fontMetricsInt) {
        this.J = true;
        this.K = fontMetricsInt;
        if (fontMetricsInt != null) {
            c(Math.abs(this.K.ascent) + Math.abs(fontMetricsInt.descent));
            if (this.D == 0) {
                c(org.telegram.messenger.i0.L(20.0f));
            }
        }
    }

    public final void c(int i10) {
        this.D = i10;
        this.c.setBounds(0, 0, i10, i10);
    }

    public final void d(float f7) {
        this.r = 0.0f;
        this.s = f7;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    @Override // android.text.style.ReplacementSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        boolean z10;
        if (this.a) {
            if (this.d) {
                int i15 = this.y;
                if (i15 == 0) {
                    if (this.f && (paint instanceof TextPaint)) {
                        i15 = ((TextPaint) paint).linkColor;
                    } else if (this.e) {
                        i15 = paint.getColor();
                        z10 = true;
                        if (this.b != i15) {
                            this.b = i15;
                            this.c.setColorFilter(new PorterDuffColorFilter(this.b, PorterDuff.Mode.SRC_IN));
                        }
                    } else {
                        i15 = org.telegram.ui.ActionBar.t6.x0(null, this.h, false);
                    }
                }
                z10 = false;
                if (this.b != i15) {
                }
            } else {
                z10 = false;
            }
            canvas.save();
            Drawable drawable = this.c;
            int i16 = i14 - (drawable != null ? drawable.getBounds().bottom : i14);
            int i17 = this.F;
            if (i17 != 1) {
                if (i17 == 2) {
                    int u10 = i0.a.u(i14, i12, 2, i12);
                    Drawable drawable2 = this.c;
                    i16 = u10 - (drawable2 != null ? drawable2.getBounds().height() / 2 : 0);
                } else if (i17 == 0) {
                    int i18 = i14 - i12;
                    int i19 = this.D;
                    if (i19 == 0) {
                        i19 = this.c.getIntrinsicHeight();
                    }
                    i16 = i0.a.u(i18, i19, 2, i12) + org.telegram.messenger.i0.L(this.n);
                }
            }
            canvas.translate(f7 + this.r, i16 + this.s);
            if (this.c != null) {
                float f10 = this.H;
                if (f10 != 1.0f || this.I != 1.0f) {
                    canvas.scale(f10, this.I, 0.0f, r5.getBounds().centerY());
                }
                float f11 = this.w;
                if (f11 != 1.0f) {
                    canvas.rotate(f11, this.c.getBounds().centerX(), this.c.getBounds().centerY());
                }
                if (z10) {
                    this.c.setAlpha((int) ((paint.getAlpha() / Color.alpha(this.b)) * this.x * 255.0f));
                } else {
                    this.c.setAlpha((int) (paint.getAlpha() * this.x));
                }
                this.c.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        if (!this.J || this.K == null) {
            if (this.E != 0) {
                return (int) (Math.abs(this.H) * this.E);
            }
            float abs = Math.abs(this.G) * Math.abs(this.H);
            int i12 = this.D;
            if (i12 == 0) {
                i12 = this.c.getIntrinsicWidth();
            }
            return (int) (abs * i12);
        }
        if (fontMetricsInt == null) {
            fontMetricsInt = new Paint.FontMetricsInt();
        }
        Paint.FontMetricsInt fontMetricsInt2 = this.K;
        fontMetricsInt.ascent = fontMetricsInt2.ascent;
        fontMetricsInt.descent = fontMetricsInt2.descent;
        fontMetricsInt.top = fontMetricsInt2.top;
        fontMetricsInt.bottom = fontMetricsInt2.bottom;
        return (int) (Math.abs(this.G) * Math.abs(this.H) * this.D);
    }

    public dq(Drawable drawable) {
        this(0, drawable);
    }

    public dq(int i10, int i11) {
        this(i11, org.telegram.messenger.w0.b.getDrawable(i10).mutate());
    }

    public dq(int i10, Drawable drawable) {
        this.a = true;
        this.d = true;
        this.e = true;
        this.f = false;
        this.n = 0;
        this.x = 1.0f;
        this.G = 1.0f;
        this.H = 1.0f;
        this.I = 1.0f;
        this.c = drawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        this.F = i10;
    }
}
