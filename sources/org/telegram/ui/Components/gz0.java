package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class gz0 {
    public iz0 a;
    public fz0 b;
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
    public final /* synthetic */ nz0 s;

    public gz0(nz0 nz0Var, int i10) {
        this.s = nz0Var;
        this.d = i10;
    }

    public final void a(Canvas canvas, View view, boolean z4) {
        boolean z10;
        boolean z11;
        Paint paint;
        Paint paint2;
        RectF rectF;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.Cells.m9 m9Var;
        Canvas canvas2 = canvas;
        if (this.c == null) {
            return;
        }
        int i13 = this.p + this.k;
        nz0 nz0Var = this.s;
        int i14 = nz0Var.y;
        Path path = nz0Var.I;
        mz0 mz0Var = nz0Var.L;
        float[] fArr = nz0Var.K;
        RectF rectF2 = nz0Var.J;
        boolean z12 = i13 == i14;
        boolean z13 = this.q + this.l == nz0Var.B;
        int dp = AndroidUtilities.dp(8.0f);
        boolean z14 = this.c.header;
        if (z14 || (nz0Var.E && this.a.a.b.a % 2 == 0)) {
            int i15 = this.p;
            if (i15 == 0 && this.q == 0) {
                float f10 = dp;
                fArr[1] = f10;
                fArr[0] = f10;
                z10 = true;
            } else {
                fArr[1] = 0.0f;
                fArr[0] = 0.0f;
                z10 = false;
            }
            if (z12 && this.q == 0) {
                float f11 = dp;
                fArr[3] = f11;
                fArr[2] = f11;
                z10 = true;
            } else {
                fArr[3] = 0.0f;
                fArr[2] = 0.0f;
            }
            if (z12 && z13) {
                float f12 = dp;
                fArr[5] = f12;
                fArr[4] = f12;
                z10 = true;
            } else {
                fArr[5] = 0.0f;
                fArr[4] = 0.0f;
            }
            if (i15 == 0 && z13) {
                float f13 = dp;
                fArr[7] = f13;
                fArr[6] = f13;
                z11 = true;
            } else {
                fArr[7] = 0.0f;
                fArr[6] = 0.0f;
                z11 = z10;
            }
            if (z11) {
                rectF2.set(i15, this.q, i15 + this.k, r6 + this.l);
                path.reset();
                path.addRoundRect(rectF2, fArr, Path.Direction.CW);
                if (this.c.header) {
                    canvas2.drawPath(path, mz0Var.getHeaderPaint());
                } else {
                    canvas2.drawPath(path, mz0Var.getStripPaint());
                }
            } else if (z14) {
                canvas2.drawRect(i15, this.q, i15 + this.k, r4 + this.l, mz0Var.getHeaderPaint());
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawRect(i15, this.q, this.k + i15, r1 + this.l, mz0Var.getStripPaint());
            }
        }
        if (z4 && this.b != null) {
            canvas2.save();
            canvas2.translate(b(), c());
            if (this.r >= 0 && (m9Var = nz0Var.a) != null) {
                m9Var.a0(canvas2, (org.telegram.ui.Cells.l9) nz0Var.getParent().getParent(), this.r);
            }
            this.b.draw(canvas2, view);
            canvas2.restore();
        }
        if (nz0Var.D) {
            Paint linePaint = mz0Var.getLinePaint();
            Paint linePaint2 = mz0Var.getLinePaint();
            float strokeWidth = linePaint.getStrokeWidth() / 2.0f;
            float strokeWidth2 = linePaint2.getStrokeWidth() / 2.0f;
            int i16 = this.p;
            if (i16 == 0) {
                int i17 = this.q;
                float f14 = i17;
                float f15 = this.l + i17;
                if (i17 == 0) {
                    f14 += dp;
                }
                float f16 = f14;
                if (f15 == nz0Var.B) {
                    f15 -= dp;
                }
                float f17 = i16 + strokeWidth;
                canvas2.drawLine(f17, f16, f17, f15, linePaint);
                paint = linePaint;
                paint2 = linePaint2;
            } else {
                paint = linePaint;
                float f18 = i16 - strokeWidth2;
                paint2 = linePaint2;
                canvas.drawLine(f18, this.q, f18, r1 + this.l, paint2);
            }
            int i18 = this.q;
            if (i18 == 0) {
                int i19 = this.p;
                float f19 = i19;
                float f20 = this.k + i19;
                if (i19 == 0) {
                    f19 += dp;
                }
                float f21 = f19;
                if (f20 == nz0Var.y) {
                    f20 -= dp;
                }
                float f22 = i18 + strokeWidth;
                canvas.drawLine(f21, f22, f20, f22, paint);
            } else {
                float f23 = i18 - strokeWidth2;
                canvas.drawLine(this.p, f23, r2 + this.k, f23, paint2);
            }
            float f24 = (this.p + this.k) - strokeWidth;
            Paint paint3 = paint;
            canvas.drawLine(f24, (z12 && (i12 = this.q) == 0) ? i12 + dp : this.q - strokeWidth, f24, (z12 && z13) ? (this.q + this.l) - dp : (this.q + this.l) - strokeWidth, paint3);
            int i20 = this.p;
            float f25 = (this.q + this.l) - strokeWidth;
            canvas.drawLine((i20 == 0 && z13) ? i20 + dp : i20 - strokeWidth, f25, (z12 && z13) ? (i20 + this.k) - dp : (i20 + this.k) - strokeWidth, f25, paint3);
            int i21 = this.p;
            if (i21 == 0 && (i11 = this.q) == 0) {
                float f26 = i21 + strokeWidth;
                float f27 = i11 + strokeWidth;
                float f28 = dp * 2;
                rectF2.set(f26, f27, f26 + f28, f28 + f27);
                rectF = rectF2;
                canvas.drawArc(rectF, -180.0f, 90.0f, false, paint3);
            } else {
                rectF = rectF2;
            }
            if (z12 && (i10 = this.q) == 0) {
                float f29 = (this.p + this.k) - strokeWidth;
                float f30 = dp * 2;
                float f31 = i10 + strokeWidth;
                rectF.set(f29 - f30, f31, f29, f30 + f31);
                canvas.drawArc(rectF, 0.0f, -90.0f, false, paint3);
            }
            int i22 = this.p;
            if (i22 == 0 && z13) {
                float f32 = i22 + strokeWidth;
                float f33 = (this.q + this.l) - strokeWidth;
                float f34 = dp * 2;
                rectF.set(f32, f33 - f34, f34 + f32, f33);
                canvas.drawArc(rectF, 180.0f, -90.0f, false, paint3);
            }
            if (z12 && z13) {
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
    public final void d(int i10, int i11, boolean z4) {
        this.k = i10;
        this.l = i11;
        if (z4) {
            this.m = i11;
        }
        if (this.c != null) {
            fz0 fz0Var = this.b;
            if (fz0Var != null) {
                Layout layout = fz0Var.getLayout();
                int lineCount = layout != null ? layout.getLineCount() : 0;
                if (!z4) {
                    if (lineCount <= 1) {
                        if (lineCount > 0) {
                            TL_iv.pageTableCell pagetablecell = this.c;
                            if (!pagetablecell.align_center) {
                            }
                        }
                    }
                    nz0 nz0Var = this.s;
                    e(nz0Var.L.createTextLayout(this.c, this.k - (nz0Var.v * 2)));
                    this.m = this.f + nz0Var.r + nz0Var.s;
                }
                f();
            }
            g();
        }
    }

    public final void e(fz0 fz0Var) {
        this.b = fz0Var;
        Layout layout = fz0Var != null ? fz0Var.getLayout() : null;
        int i10 = 0;
        if (layout == null) {
            this.i = 0;
            this.e = 0;
            this.f = 0;
            return;
        }
        this.e = 0;
        this.i = 0;
        int lineCount = layout.getLineCount();
        while (i10 < lineCount) {
            float lineLeft = layout.getLineLeft(i10);
            this.i = i10 == 0 ? (int) Math.ceil(lineLeft) : Math.min(this.i, (int) Math.ceil(lineLeft));
            this.e = (int) Math.ceil(Math.max(layout.getLineWidth(i10), this.e));
            i10++;
        }
        this.f = layout.getHeight();
    }

    public final void f() {
        int i10 = -this.i;
        this.g = i10;
        TL_iv.pageTableCell pagetablecell = this.c;
        boolean z4 = pagetablecell.align_right;
        nz0 nz0Var = this.s;
        if (z4) {
            this.g = ((this.k - this.e) - nz0Var.v) + i10;
        } else if (pagetablecell.align_center) {
            this.g = Math.round((this.k - this.e) / 2.0f) + i10;
        } else {
            this.g = i10 + nz0Var.v;
        }
    }

    public final void g() {
        TL_iv.pageTableCell pagetablecell = this.c;
        if (pagetablecell.valign_middle) {
            this.h = (this.l - this.f) / 2;
            return;
        }
        boolean z4 = pagetablecell.valign_bottom;
        nz0 nz0Var = this.s;
        if (z4) {
            this.h = (this.l - this.f) - nz0Var.s;
        } else {
            this.h = nz0Var.r;
        }
    }
}
