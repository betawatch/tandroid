package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ky0 {
    public my0 a;
    public jy0 b;
    public TL_iv.pageTableCell c;
    public final int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r = -1;
    public final /* synthetic */ ry0 s;

    public ky0(ry0 ry0Var, int i9) {
        this.s = ry0Var;
        this.d = i9;
    }

    public final void a(Canvas canvas, View view, boolean z10) {
        boolean z11;
        boolean z12;
        Paint paint;
        Paint paint2;
        RectF rectF;
        int i9;
        int i10;
        int i11;
        org.telegram.ui.Cells.n9 n9Var;
        Canvas canvas2 = canvas;
        if (this.c == null) {
            return;
        }
        int i12 = this.p + this.k;
        ry0 ry0Var = this.s;
        int i13 = ry0Var.y;
        Path path = ry0Var.H;
        qy0 qy0Var = ry0Var.K;
        float[] fArr = ry0Var.J;
        RectF rectF2 = ry0Var.I;
        boolean z13 = i12 == i13;
        boolean z14 = this.q + this.l == ry0Var.A;
        int dp = AndroidUtilities.dp(8.0f);
        boolean z15 = this.c.header;
        if (z15 || (ry0Var.D && this.a.a.b.a % 2 == 0)) {
            int i14 = this.p;
            if (i14 == 0 && this.q == 0) {
                float f10 = dp;
                fArr[1] = f10;
                fArr[0] = f10;
                z11 = true;
            } else {
                fArr[1] = 0.0f;
                fArr[0] = 0.0f;
                z11 = false;
            }
            if (z13 && this.q == 0) {
                float f11 = dp;
                fArr[3] = f11;
                fArr[2] = f11;
                z11 = true;
            } else {
                fArr[3] = 0.0f;
                fArr[2] = 0.0f;
            }
            if (z13 && z14) {
                float f12 = dp;
                fArr[5] = f12;
                fArr[4] = f12;
                z11 = true;
            } else {
                fArr[5] = 0.0f;
                fArr[4] = 0.0f;
            }
            if (i14 == 0 && z14) {
                float f13 = dp;
                fArr[7] = f13;
                fArr[6] = f13;
                z12 = true;
            } else {
                fArr[7] = 0.0f;
                fArr[6] = 0.0f;
                z12 = z11;
            }
            if (z12) {
                rectF2.set(i14, this.q, i14 + this.k, r6 + this.l);
                path.reset();
                path.addRoundRect(rectF2, fArr, Path.Direction.CW);
                if (this.c.header) {
                    canvas2.drawPath(path, qy0Var.getHeaderPaint());
                } else {
                    canvas2.drawPath(path, qy0Var.getStripPaint());
                }
            } else if (z15) {
                canvas2.drawRect(i14, this.q, i14 + this.k, r4 + this.l, qy0Var.getHeaderPaint());
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawRect(i14, this.q, this.k + i14, r1 + this.l, qy0Var.getStripPaint());
            }
        }
        if (z10 && this.b != null) {
            canvas2.save();
            canvas2.translate(b(), c());
            if (this.r >= 0 && (n9Var = ry0Var.a) != null) {
                n9Var.a0(canvas2, (org.telegram.ui.Cells.m9) ry0Var.getParent().getParent(), this.r);
            }
            this.b.draw(canvas2, view);
            canvas2.restore();
        }
        if (ry0Var.C) {
            Paint linePaint = qy0Var.getLinePaint();
            Paint linePaint2 = qy0Var.getLinePaint();
            float strokeWidth = linePaint.getStrokeWidth() / 2.0f;
            float strokeWidth2 = linePaint2.getStrokeWidth() / 2.0f;
            int i15 = this.p;
            if (i15 == 0) {
                int i16 = this.q;
                float f14 = i16;
                float f15 = this.l + i16;
                if (i16 == 0) {
                    f14 += dp;
                }
                float f16 = f14;
                if (f15 == ry0Var.A) {
                    f15 -= dp;
                }
                float f17 = i15 + strokeWidth;
                canvas2.drawLine(f17, f16, f17, f15, linePaint);
                paint = linePaint;
                paint2 = linePaint2;
            } else {
                paint = linePaint;
                float f18 = i15 - strokeWidth2;
                paint2 = linePaint2;
                canvas.drawLine(f18, this.q, f18, r1 + this.l, paint2);
            }
            int i17 = this.q;
            if (i17 == 0) {
                int i18 = this.p;
                float f19 = i18;
                float f20 = this.k + i18;
                if (i18 == 0) {
                    f19 += dp;
                }
                float f21 = f19;
                if (f20 == ry0Var.y) {
                    f20 -= dp;
                }
                float f22 = i17 + strokeWidth;
                canvas.drawLine(f21, f22, f20, f22, paint);
            } else {
                float f23 = i17 - strokeWidth2;
                canvas.drawLine(this.p, f23, r2 + this.k, f23, paint2);
            }
            float f24 = (this.p + this.k) - strokeWidth;
            Paint paint3 = paint;
            canvas.drawLine(f24, (z13 && (i11 = this.q) == 0) ? i11 + dp : this.q - strokeWidth, f24, (z13 && z14) ? (this.q + this.l) - dp : (this.q + this.l) - strokeWidth, paint3);
            int i19 = this.p;
            float f25 = (this.q + this.l) - strokeWidth;
            canvas.drawLine((i19 == 0 && z14) ? i19 + dp : i19 - strokeWidth, f25, (z13 && z14) ? (i19 + this.k) - dp : (i19 + this.k) - strokeWidth, f25, paint3);
            int i20 = this.p;
            if (i20 == 0 && (i10 = this.q) == 0) {
                float f26 = i20 + strokeWidth;
                float f27 = i10 + strokeWidth;
                float f28 = dp * 2;
                rectF2.set(f26, f27, f26 + f28, f28 + f27);
                rectF = rectF2;
                canvas.drawArc(rectF, -180.0f, 90.0f, false, paint3);
            } else {
                rectF = rectF2;
            }
            if (z13 && (i9 = this.q) == 0) {
                float f29 = (this.p + this.k) - strokeWidth;
                float f30 = dp * 2;
                float f31 = i9 + strokeWidth;
                rectF.set(f29 - f30, f31, f29, f30 + f31);
                canvas.drawArc(rectF, 0.0f, -90.0f, false, paint3);
            }
            int i21 = this.p;
            if (i21 == 0 && z14) {
                float f32 = i21 + strokeWidth;
                float f33 = (this.q + this.l) - strokeWidth;
                float f34 = dp * 2;
                rectF.set(f32, f33 - f34, f34 + f32, f33);
                canvas.drawArc(rectF, 180.0f, -90.0f, false, paint3);
            }
            if (z13 && z14) {
                float f35 = (this.p + this.k) - strokeWidth;
                float f36 = dp * 2;
                float f37 = (this.q + this.l) - strokeWidth;
                rectF.set(f35 - f36, f37 - f36, f35, f37);
                canvas.drawArc(rectF, 0.0f, 90.0f, false, paint3);
            }
        }
    }

    public final int b() {
        return this.p + this.g;
    }

    public final int c() {
        return this.q + this.h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
    
        if (r3.align_right == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i9, int i10, boolean z10) {
        this.k = i9;
        this.l = i10;
        if (z10) {
            this.m = i10;
        }
        if (this.c != null) {
            jy0 jy0Var = this.b;
            if (jy0Var != null) {
                Layout layout = jy0Var.getLayout();
                int lineCount = layout != null ? layout.getLineCount() : 0;
                if (!z10) {
                    if (lineCount <= 1) {
                        if (lineCount > 0) {
                            TL_iv.pageTableCell pagetablecell = this.c;
                            if (!pagetablecell.align_center) {
                            }
                        }
                    }
                    ry0 ry0Var = this.s;
                    e(ry0Var.K.createTextLayout(this.c, this.k - (ry0Var.v * 2)));
                    this.m = this.f + ry0Var.r + ry0Var.s;
                }
                f();
            }
            g();
        }
    }

    public final void e(jy0 jy0Var) {
        this.b = jy0Var;
        Layout layout = jy0Var != null ? jy0Var.getLayout() : null;
        int i9 = 0;
        if (layout == null) {
            this.i = 0;
            this.e = 0;
            this.f = 0;
            return;
        }
        this.e = 0;
        this.i = 0;
        int lineCount = layout.getLineCount();
        while (i9 < lineCount) {
            float lineLeft = layout.getLineLeft(i9);
            this.i = i9 == 0 ? (int) Math.ceil(lineLeft) : Math.min(this.i, (int) Math.ceil(lineLeft));
            this.e = (int) Math.ceil(Math.max(layout.getLineWidth(i9), this.e));
            i9++;
        }
        this.f = layout.getHeight();
    }

    public final void f() {
        int i9 = -this.i;
        this.g = i9;
        TL_iv.pageTableCell pagetablecell = this.c;
        boolean z10 = pagetablecell.align_right;
        ry0 ry0Var = this.s;
        if (z10) {
            this.g = ((this.k - this.e) - ry0Var.v) + i9;
        } else if (pagetablecell.align_center) {
            this.g = Math.round((this.k - this.e) / 2.0f) + i9;
        } else {
            this.g = i9 + ry0Var.v;
        }
    }

    public final void g() {
        TL_iv.pageTableCell pagetablecell = this.c;
        if (pagetablecell.valign_middle) {
            this.h = (this.l - this.f) / 2;
            return;
        }
        boolean z10 = pagetablecell.valign_bottom;
        ry0 ry0Var = this.s;
        if (z10) {
            this.h = (this.l - this.f) - ry0Var.s;
        } else {
            this.h = ry0Var.r;
        }
    }
}
