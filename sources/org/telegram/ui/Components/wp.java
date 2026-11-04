package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class wp extends ReplacementSpan {
    public int E;
    public int F;
    public final int G;
    public float H;
    public float I;
    public float J;
    public boolean K;
    public Paint.FontMetricsInt L;
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

    public wp(int i3) {
        this(i3, 0);
    }

    public final void a(int i3) {
        this.h = i3;
        this.e = i3 < 0;
    }

    public final void b(Paint.FontMetricsInt fontMetricsInt) {
        this.K = true;
        this.L = fontMetricsInt;
        if (fontMetricsInt != null) {
            c(Math.abs(this.L.ascent) + Math.abs(fontMetricsInt.descent));
            if (this.E == 0) {
                c(org.telegram.messenger.g0.L(20.0f));
            }
        }
    }

    public final void c(int i3) {
        this.E = i3;
        this.c.setBounds(0, 0, i3, i3);
    }

    public final void d(float f10) {
        this.r = f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    @Override // android.text.style.ReplacementSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(Canvas canvas, CharSequence charSequence, int i3, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        boolean z10;
        if (this.a) {
            if (this.d) {
                int i14 = this.y;
                if (i14 == 0) {
                    if (this.f && (paint instanceof TextPaint)) {
                        i14 = ((TextPaint) paint).linkColor;
                    } else if (this.e) {
                        i14 = paint.getColor();
                        z10 = true;
                        if (this.b != i14) {
                            this.b = i14;
                            this.c.setColorFilter(new PorterDuffColorFilter(this.b, PorterDuff.Mode.SRC_IN));
                        }
                    } else {
                        i14 = org.telegram.ui.ActionBar.k6.x0(null, this.h, false);
                    }
                }
                z10 = false;
                if (this.b != i14) {
                }
            } else {
                z10 = false;
            }
            canvas.save();
            Drawable drawable = this.c;
            int i15 = i13 - (drawable != null ? drawable.getBounds().bottom : i13);
            int i16 = this.G;
            if (i16 != 1) {
                if (i16 == 2) {
                    int e10 = k2.p1.e(i13, i11, 2, i11);
                    Drawable drawable2 = this.c;
                    i15 = e10 - (drawable2 != null ? drawable2.getBounds().height() / 2 : 0);
                } else if (i16 == 0) {
                    int i17 = i13 - i11;
                    int i18 = this.E;
                    if (i18 == 0) {
                        i18 = this.c.getIntrinsicHeight();
                    }
                    i15 = k2.p1.e(i17, i18, 2, i11) + org.telegram.messenger.g0.L(this.n);
                }
            }
            canvas.translate(f10 + this.r, i15 + this.s);
            if (this.c != null) {
                float f11 = this.I;
                if (f11 != 1.0f || this.J != 1.0f) {
                    canvas.scale(f11, this.J, 0.0f, r5.getBounds().centerY());
                }
                float f12 = this.w;
                if (f12 != 1.0f) {
                    canvas.rotate(f12, this.c.getBounds().centerX(), this.c.getBounds().centerY());
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

    public final void e(float f10) {
        this.r = 0.0f;
        this.s = f10;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i3, int i10, Paint.FontMetricsInt fontMetricsInt) {
        if (!this.K || this.L == null) {
            if (this.F != 0) {
                return (int) (Math.abs(this.I) * this.F);
            }
            float abs = Math.abs(this.H) * Math.abs(this.I);
            int i11 = this.E;
            if (i11 == 0) {
                i11 = this.c.getIntrinsicWidth();
            }
            return (int) (abs * i11);
        }
        if (fontMetricsInt == null) {
            fontMetricsInt = new Paint.FontMetricsInt();
        }
        Paint.FontMetricsInt fontMetricsInt2 = this.L;
        fontMetricsInt.ascent = fontMetricsInt2.ascent;
        fontMetricsInt.descent = fontMetricsInt2.descent;
        fontMetricsInt.top = fontMetricsInt2.top;
        fontMetricsInt.bottom = fontMetricsInt2.bottom;
        return (int) (Math.abs(this.H) * Math.abs(this.I) * this.E);
    }

    public wp(Drawable drawable) {
        this(0, drawable);
    }

    public wp(int i3, int i10) {
        this(i10, org.telegram.messenger.t0.b.getDrawable(i3).mutate());
    }

    public wp(int i3, Drawable drawable) {
        this.a = true;
        this.d = true;
        this.e = true;
        this.f = false;
        this.n = 0;
        this.x = 1.0f;
        this.H = 1.0f;
        this.I = 1.0f;
        this.J = 1.0f;
        this.c = drawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        this.G = i3;
    }
}
