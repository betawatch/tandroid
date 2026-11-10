package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class wp extends ReplacementSpan {
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

    public wp(int i7) {
        this(i7, 0);
    }

    public final void a(int i7) {
        this.h = i7;
        this.e = i7 < 0;
    }

    public final void b(Paint.FontMetricsInt fontMetricsInt) {
        this.J = true;
        this.K = fontMetricsInt;
        if (fontMetricsInt != null) {
            c(Math.abs(this.K.ascent) + Math.abs(fontMetricsInt.descent));
            if (this.D == 0) {
                c(org.telegram.messenger.g0.L(20.0f));
            }
        }
    }

    public final void c(int i7) {
        this.D = i7;
        this.c.setBounds(0, 0, i7, i7);
    }

    public final void d(float f10) {
        this.r = f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    @Override // android.text.style.ReplacementSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        boolean z9;
        if (this.a) {
            if (this.d) {
                int i14 = this.y;
                if (i14 == 0) {
                    if (this.f && (paint instanceof TextPaint)) {
                        i14 = ((TextPaint) paint).linkColor;
                    } else if (this.e) {
                        i14 = paint.getColor();
                        z9 = true;
                        if (this.b != i14) {
                            this.b = i14;
                            this.c.setColorFilter(new PorterDuffColorFilter(this.b, PorterDuff.Mode.SRC_IN));
                        }
                    } else {
                        i14 = org.telegram.ui.ActionBar.m6.x0(null, this.h, false);
                    }
                }
                z9 = false;
                if (this.b != i14) {
                }
            } else {
                z9 = false;
            }
            canvas.save();
            Drawable drawable = this.c;
            int i15 = i13 - (drawable != null ? drawable.getBounds().bottom : i13);
            int i16 = this.F;
            if (i16 != 1) {
                if (i16 == 2) {
                    int D = jg.g.D(i13, i11, 2, i11);
                    Drawable drawable2 = this.c;
                    i15 = D - (drawable2 != null ? drawable2.getBounds().height() / 2 : 0);
                } else if (i16 == 0) {
                    int i17 = i13 - i11;
                    int i18 = this.D;
                    if (i18 == 0) {
                        i18 = this.c.getIntrinsicHeight();
                    }
                    i15 = jg.g.D(i17, i18, 2, i11) + org.telegram.messenger.g0.L(this.n);
                }
            }
            canvas.translate(f10 + this.r, i15 + this.s);
            if (this.c != null) {
                float f11 = this.H;
                if (f11 != 1.0f || this.I != 1.0f) {
                    canvas.scale(f11, this.I, 0.0f, r5.getBounds().centerY());
                }
                float f12 = this.w;
                if (f12 != 1.0f) {
                    canvas.rotate(f12, this.c.getBounds().centerX(), this.c.getBounds().centerY());
                }
                if (z9) {
                    this.c.setAlpha((int) ((paint.getAlpha() / Color.alpha(this.b)) * this.x * 255.0f));
                } else {
                    this.c.setAlpha((int) (paint.getAlpha() * this.x));
                }
                this.c.draw(canvas);
            }
            canvas.restore();
        }
    }

    public final void e(float f10) {
        this.r = 0.0f;
        this.s = f10;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        if (!this.J || this.K == null) {
            if (this.E != 0) {
                return (int) (Math.abs(this.H) * this.E);
            }
            float abs = Math.abs(this.G) * Math.abs(this.H);
            int i11 = this.D;
            if (i11 == 0) {
                i11 = this.c.getIntrinsicWidth();
            }
            return (int) (abs * i11);
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

    public wp(Drawable drawable) {
        this(0, drawable);
    }

    public wp(int i7, int i10) {
        this(i10, org.telegram.messenger.t0.b.getDrawable(i7).mutate());
    }

    public wp(int i7, Drawable drawable) {
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
        this.F = i7;
    }
}
