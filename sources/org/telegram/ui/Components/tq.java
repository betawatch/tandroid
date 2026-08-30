package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class tq {
    public float A;
    public float B;
    public boolean D;
    public float E;
    public final boolean F;
    public boolean G;
    public View H;
    public final org.telegram.ui.ActionBar.f6 J;
    public boolean a;
    public Paint d;
    public boolean g;
    public int h;
    public String i;
    public boolean j;
    public ValueAnimator k;
    public float m;
    public StaticLayout n;
    public StaticLayout o;
    public StaticLayout p;
    public StaticLayout q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int x;
    public int y;
    public float b = 1.0f;
    public int c = -1;
    public TextPaint e = new TextPaint(1);
    public final RectF f = new RectF();
    public float l = 1.0f;
    public int v = org.telegram.ui.ActionBar.j6.sf;
    public int w = org.telegram.ui.ActionBar.j6.tf;
    public int z = 17;
    public final float C = 11.5f;
    public int I = 0;

    public tq(View view, boolean z4, org.telegram.ui.ActionBar.f6 f6Var) {
        this.H = view;
        this.J = f6Var;
        this.F = z4;
        if (z4) {
            Paint paint = new Paint(1);
            this.d = paint;
            paint.setColor(-16777216);
        }
        this.e.setTypeface(AndroidUtilities.bold());
        this.e.setTextSize(AndroidUtilities.dp(13.0f));
    }

    public final void a(Canvas canvas) {
        float f10;
        boolean z4;
        Paint paint;
        int i10 = this.I;
        if (i10 != 1 && i10 != 2) {
            int i11 = this.v;
            org.telegram.ui.ActionBar.f6 f6Var = this.J;
            int v02 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
            int v03 = org.telegram.ui.ActionBar.j6.v0(this.w, f6Var);
            if (this.u != v02) {
                this.u = v02;
                this.e.setColor(v02);
            }
            Paint paint2 = this.d;
            if (paint2 != null && this.t != v03) {
                this.t = v03;
                paint2.setColor(v03);
            }
        }
        float f11 = this.l;
        if (f11 == 1.0f) {
            b(canvas);
            return;
        }
        int i12 = this.c;
        if (i12 == 0 || i12 == 1) {
            e(this.s);
            float f12 = (this.s / 2.0f) + this.A;
            float f13 = this.x / 2.0f;
            canvas.save();
            float f14 = this.c == 0 ? this.l : 1.0f - this.l;
            canvas.scale(f14, f14, f12, f13);
            b(canvas);
            canvas.restore();
            return;
        }
        float f15 = f11 * 2.0f;
        if (f15 > 1.0f) {
            f15 = 1.0f;
        }
        int i13 = this.x;
        float f16 = this.C;
        float f17 = f16 * 2.0f;
        float dp = (i13 - AndroidUtilities.dp(f17)) / 2.0f;
        int i14 = this.s;
        int i15 = this.r;
        float w10 = i14 == i15 ? i14 : e2.c.w(1.0f, f15, i15, i14 * f15);
        e(w10);
        if (this.j) {
            float f18 = this.l;
            f10 = ((f18 <= 0.5f ? nr.g.getInterpolation(f18 * 2.0f) : nr.i.getInterpolation(1.0f - ((f18 - 0.5f) * 2.0f))) * 0.1f) + 1.0f;
        } else {
            f10 = 1.0f;
        }
        float f19 = this.B;
        RectF rectF = this.f;
        rectF.set(f19, dp, w10 + f19 + AndroidUtilities.dp(f16 - 0.5f), AndroidUtilities.dp(f17) + dp);
        canvas.save();
        canvas.scale(f10, f10, rectF.centerX(), rectF.centerY());
        if (this.b != 1.0f) {
            canvas.save();
            float f20 = this.b;
            canvas.scale(f20, f20, rectF.centerX(), rectF.centerY());
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.F && (paint = this.d) != null) {
            float f21 = AndroidUtilities.density * f16;
            canvas.drawRoundRect(rectF, f21, f21, paint);
            if (this.g && org.telegram.ui.ActionBar.j6.a1()) {
                float f22 = f16 * AndroidUtilities.density;
                canvas.drawRoundRect(rectF, f22, f22, org.telegram.ui.ActionBar.j6.h2);
            }
        }
        if (z4) {
            canvas.restore();
        }
        canvas.clipRect(rectF);
        boolean z10 = this.D != this.j;
        if (this.q != null) {
            canvas.save();
            float f23 = this.A;
            float dp2 = AndroidUtilities.dp(4.0f) + dp;
            int dp3 = AndroidUtilities.dp(13.0f);
            if (!z10) {
                dp3 = -dp3;
            }
            canvas.translate(f23, e2.c.w(1.0f, f15, dp3, dp2));
            this.e.setAlpha((int) (f15 * 255.0f));
            this.q.draw(canvas);
            canvas.restore();
        } else if (this.n != null) {
            canvas.save();
            float f24 = this.A;
            float dp4 = AndroidUtilities.dp(4.0f) + dp;
            int dp5 = AndroidUtilities.dp(13.0f);
            if (!z10) {
                dp5 = -dp5;
            }
            canvas.translate(f24, e2.c.w(1.0f, f15, dp5, dp4));
            this.e.setAlpha((int) (f15 * 255.0f));
            this.n.draw(canvas);
            canvas.restore();
        }
        if (this.o != null) {
            canvas.save();
            canvas.translate(this.A, ((z10 ? -AndroidUtilities.dp(13.0f) : AndroidUtilities.dp(13.0f)) * f15) + AndroidUtilities.dp(4.0f) + dp);
            this.e.setAlpha((int) ((1.0f - f15) * 255.0f));
            this.o.draw(canvas);
            canvas.restore();
        }
        if (this.p != null) {
            canvas.save();
            canvas.translate(this.A, dp + AndroidUtilities.dp(4.0f));
            this.e.setAlpha(255);
            this.p.draw(canvas);
            canvas.restore();
        }
        this.e.setAlpha(255);
        canvas.restore();
    }

    public final void b(Canvas canvas) {
        boolean z4;
        float f10 = this.C;
        float f11 = f10 * 2.0f;
        float dp = (this.x - AndroidUtilities.dp(f11)) / 2.0f;
        e(this.s);
        float f12 = this.B;
        RectF rectF = this.f;
        rectF.set(f12, dp, this.s + f12 + AndroidUtilities.dp(f10 - 0.5f), AndroidUtilities.dp(f11) + dp);
        if (this.d != null && this.F) {
            if (this.b != 1.0f) {
                canvas.save();
                float f13 = this.b;
                canvas.scale(f13, f13, rectF.centerX(), rectF.centerY());
                z4 = true;
            } else {
                z4 = false;
            }
            float f14 = AndroidUtilities.density * f10;
            canvas.drawRoundRect(rectF, f14, f14, this.d);
            if (this.g && org.telegram.ui.ActionBar.j6.a1()) {
                float f15 = f10 * AndroidUtilities.density;
                canvas.drawRoundRect(rectF, f15, f15, org.telegram.ui.ActionBar.j6.h2);
            }
            if (z4) {
                canvas.restore();
            }
        }
        if (this.n != null) {
            canvas.save();
            canvas.translate(this.A, dp + AndroidUtilities.dp(4.0f));
            this.n.draw(canvas);
            canvas.restore();
        }
    }

    public final void c(int i10, boolean z4) {
        View view;
        View view2;
        boolean z10 = false;
        String formatWholeNumber = this.a ? AndroidUtilities.formatWholeNumber(i10, 0) : String.valueOf(i10);
        if (TextUtils.equals(formatWholeNumber, this.i)) {
            return;
        }
        ValueAnimator valueAnimator = this.k;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (i10 > 0 && this.G && (view2 = this.H) != null) {
            view2.setVisibility(0);
        }
        boolean z11 = Math.abs(i10 - this.h) > 99 ? false : z4;
        if (!z11) {
            this.h = i10;
            this.i = formatWholeNumber;
            if (i10 == 0) {
                if (!this.G || (view = this.H) == null) {
                    return;
                }
                view.setVisibility(8);
                return;
            }
            this.s = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(this.e.measureText(formatWholeNumber.toString())));
            StaticLayout staticLayout = new StaticLayout(formatWholeNumber, this.e, this.s, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.n = staticLayout;
            this.m = staticLayout.getLineCount() >= 1 ? this.n.getLineWidth(0) : 0.0f;
            View view3 = this.H;
            if (view3 != null) {
                view3.invalidate();
                return;
            }
            return;
        }
        if (z11) {
            ValueAnimator valueAnimator2 = this.k;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            this.l = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.k = ofFloat;
            int i11 = 14;
            ofFloat.addUpdateListener(new f6(this, i11));
            this.k.addListener(new a9(this, i11));
            if (this.h <= 0) {
                this.c = 0;
                this.k.setDuration(220L);
                this.k.setInterpolator(new OvershootInterpolator());
            } else if (i10 == 0) {
                this.c = 1;
                this.k.setDuration(150L);
                this.k.setInterpolator(nr.f);
            } else {
                this.c = 2;
                this.k.setDuration(430L);
                this.k.setInterpolator(nr.f);
            }
            if (this.n != null) {
                String str = this.i;
                if (str.length() == formatWholeNumber.length()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(formatWholeNumber);
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(formatWholeNumber);
                    for (int i12 = 0; i12 < str.length(); i12++) {
                        if (str.charAt(i12) == formatWholeNumber.charAt(i12)) {
                            int i13 = i12 + 1;
                            spannableStringBuilder.setSpan(new lz(z10), i12, i13, 0);
                            spannableStringBuilder2.setSpan(new lz(z10), i12, i13, 0);
                        } else {
                            spannableStringBuilder3.setSpan(new lz(z10), i12, i12 + 1, 0);
                        }
                    }
                    int max = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(this.e.measureText(str.toString())));
                    TextPaint textPaint = this.e;
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                    this.o = new StaticLayout(spannableStringBuilder, textPaint, max, alignment, 1.0f, 0.0f, false);
                    this.p = new StaticLayout(spannableStringBuilder3, this.e, max, alignment, 1.0f, 0.0f, false);
                    this.q = new StaticLayout(spannableStringBuilder2, this.e, max, alignment, 1.0f, 0.0f, false);
                } else {
                    this.o = this.n;
                }
            }
            this.r = this.s;
            this.j = i10 > this.h;
            this.k.start();
        }
        if (i10 > 0) {
            this.s = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(this.e.measureText(formatWholeNumber.toString())));
            StaticLayout staticLayout2 = new StaticLayout(formatWholeNumber, this.e, this.s, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.n = staticLayout2;
            this.m = staticLayout2.getLineCount() >= 1 ? this.n.getLineWidth(0) : 0.0f;
        }
        this.h = i10;
        this.i = formatWholeNumber;
        View view4 = this.H;
        if (view4 != null) {
            view4.invalidate();
        }
    }

    public final void d(int i10, int i11) {
        if (i10 != this.x) {
            int i12 = this.h;
            this.h = -1;
            c(i12, this.c == 0);
            this.x = i10;
        }
        this.y = i11;
    }

    public final void e(float f10) {
        float dp = this.F ? AndroidUtilities.dp(5.5f) : 0.0f;
        int i10 = this.z;
        if (i10 == 5) {
            float f11 = this.y - dp;
            this.A = f11;
            float f12 = this.E;
            if (f12 != 0.0f) {
                this.A = f11 - Math.max((f10 / 2.0f) + f12, f10);
            } else {
                this.A = f11 - f10;
            }
        } else if (i10 == 3) {
            this.A = dp;
        } else {
            this.A = (int) ((this.y - f10) / 2.0f);
        }
        this.B = this.A - dp;
    }
}
