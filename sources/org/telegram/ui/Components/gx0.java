package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class gx0 {
    public ix0 a;
    public fx0 b;
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
    public final /* synthetic */ nx0 s;

    public gx0(nx0 nx0Var, int i7) {
        this.s = nx0Var;
        this.d = i7;
    }

    public final void a(Canvas canvas, View view, boolean z9) {
        boolean z10;
        boolean z11;
        Paint paint;
        Paint paint2;
        RectF rectF;
        int i7;
        int i10;
        int i11;
        org.telegram.ui.Cells.i9 i9Var;
        Canvas canvas2 = canvas;
        if (this.c == null) {
            return;
        }
        int i12 = this.p + this.k;
        nx0 nx0Var = this.s;
        int i13 = nx0Var.D;
        Path path = nx0Var.L;
        mx0 mx0Var = nx0Var.O;
        float[] fArr = nx0Var.N;
        RectF rectF2 = nx0Var.M;
        boolean z12 = i12 == i13;
        boolean z13 = this.q + this.l == nx0Var.E;
        int L = org.telegram.messenger.g0.L(8.0f);
        boolean z14 = this.c.header;
        if (z14 || (nx0Var.H && this.a.a.b.a % 2 == 0)) {
            int i14 = this.p;
            if (i14 == 0 && this.q == 0) {
                float f10 = L;
                fArr[1] = f10;
                fArr[0] = f10;
                z10 = true;
            } else {
                fArr[1] = 0.0f;
                fArr[0] = 0.0f;
                z10 = false;
            }
            if (z12 && this.q == 0) {
                float f11 = L;
                fArr[3] = f11;
                fArr[2] = f11;
                z10 = true;
            } else {
                fArr[3] = 0.0f;
                fArr[2] = 0.0f;
            }
            if (z12 && z13) {
                float f12 = L;
                fArr[5] = f12;
                fArr[4] = f12;
                z10 = true;
            } else {
                fArr[5] = 0.0f;
                fArr[4] = 0.0f;
            }
            if (i14 == 0 && z13) {
                float f13 = L;
                fArr[7] = f13;
                fArr[6] = f13;
                z11 = true;
            } else {
                fArr[7] = 0.0f;
                fArr[6] = 0.0f;
                z11 = z10;
            }
            if (z11) {
                rectF2.set(i14, this.q, i14 + this.k, r6 + this.l);
                path.reset();
                path.addRoundRect(rectF2, fArr, Path.Direction.CW);
                if (this.c.header) {
                    canvas2.drawPath(path, mx0Var.getHeaderPaint());
                } else {
                    canvas2.drawPath(path, mx0Var.getStripPaint());
                }
            } else if (z14) {
                canvas2.drawRect(i14, this.q, i14 + this.k, r4 + this.l, mx0Var.getHeaderPaint());
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawRect(i14, this.q, this.k + i14, r1 + this.l, mx0Var.getStripPaint());
            }
        }
        if (z9 && this.b != null) {
            canvas2.save();
            canvas2.translate(b(), c());
            if (this.r >= 0 && (i9Var = nx0Var.a) != null) {
                i9Var.Z(canvas2, (org.telegram.ui.Cells.h9) nx0Var.getParent().getParent(), this.r);
            }
            this.b.d(canvas2, view);
            canvas2.restore();
        }
        if (nx0Var.G) {
            Paint linePaint = mx0Var.getLinePaint();
            Paint linePaint2 = mx0Var.getLinePaint();
            float strokeWidth = linePaint.getStrokeWidth() / 2.0f;
            float strokeWidth2 = linePaint2.getStrokeWidth() / 2.0f;
            int i15 = this.p;
            if (i15 == 0) {
                int i16 = this.q;
                float f14 = i16;
                float f15 = this.l + i16;
                if (i16 == 0) {
                    f14 += L;
                }
                float f16 = f14;
                if (f15 == nx0Var.E) {
                    f15 -= L;
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
                    f19 += L;
                }
                float f21 = f19;
                if (f20 == nx0Var.D) {
                    f20 -= L;
                }
                float f22 = i17 + strokeWidth;
                canvas.drawLine(f21, f22, f20, f22, paint);
            } else {
                float f23 = i17 - strokeWidth2;
                canvas.drawLine(this.p, f23, r2 + this.k, f23, paint2);
            }
            float f24 = (this.p + this.k) - strokeWidth;
            Paint paint3 = paint;
            canvas.drawLine(f24, (z12 && (i11 = this.q) == 0) ? i11 + L : this.q - strokeWidth, f24, (z12 && z13) ? (this.q + this.l) - L : (this.q + this.l) - strokeWidth, paint3);
            int i19 = this.p;
            float f25 = (this.q + this.l) - strokeWidth;
            canvas.drawLine((i19 == 0 && z13) ? i19 + L : i19 - strokeWidth, f25, (z12 && z13) ? (i19 + this.k) - L : (i19 + this.k) - strokeWidth, f25, paint3);
            int i20 = this.p;
            if (i20 == 0 && (i10 = this.q) == 0) {
                float f26 = i20 + strokeWidth;
                float f27 = i10 + strokeWidth;
                float f28 = L * 2;
                rectF2.set(f26, f27, f26 + f28, f28 + f27);
                rectF = rectF2;
                canvas.drawArc(rectF, -180.0f, 90.0f, false, paint3);
            } else {
                rectF = rectF2;
            }
            if (z12 && (i7 = this.q) == 0) {
                float f29 = (this.p + this.k) - strokeWidth;
                float f30 = L * 2;
                float f31 = i7 + strokeWidth;
                rectF.set(f29 - f30, f31, f29, f30 + f31);
                canvas.drawArc(rectF, 0.0f, -90.0f, false, paint3);
            }
            int i21 = this.p;
            if (i21 == 0 && z13) {
                float f32 = i21 + strokeWidth;
                float f33 = (this.q + this.l) - strokeWidth;
                float f34 = L * 2;
                rectF.set(f32, f33 - f34, f34 + f32, f33);
                canvas.drawArc(rectF, 180.0f, -90.0f, false, paint3);
            }
            if (z12 && z13) {
                float f35 = (this.p + this.k) - strokeWidth;
                float f36 = L * 2;
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
    public final void d(int i7, int i10, boolean z9) {
        this.k = i7;
        this.l = i10;
        if (z9) {
            this.m = i10;
        }
        if (this.c != null) {
            fx0 fx0Var = this.b;
            if (fx0Var != null) {
                Layout a10 = fx0Var.a();
                int lineCount = a10 != null ? a10.getLineCount() : 0;
                if (!z9) {
                    if (lineCount <= 1) {
                        if (lineCount > 0) {
                            TL_iv.pageTableCell pagetablecell = this.c;
                            if (!pagetablecell.align_center) {
                            }
                        }
                    }
                    nx0 nx0Var = this.s;
                    e(nx0Var.O.c(this.c, this.k - (nx0Var.w * 2)));
                    this.m = this.f + nx0Var.r + nx0Var.s;
                }
                f();
            }
            g();
        }
    }

    public final void e(fx0 fx0Var) {
        this.b = fx0Var;
        Layout a10 = fx0Var != null ? fx0Var.a() : null;
        int i7 = 0;
        if (a10 == null) {
            this.i = 0;
            this.e = 0;
            this.f = 0;
            return;
        }
        this.e = 0;
        this.i = 0;
        int lineCount = a10.getLineCount();
        while (i7 < lineCount) {
            float lineLeft = a10.getLineLeft(i7);
            this.i = i7 == 0 ? (int) Math.ceil(lineLeft) : Math.min(this.i, (int) Math.ceil(lineLeft));
            this.e = (int) Math.ceil(Math.max(a10.getLineWidth(i7), this.e));
            i7++;
        }
        this.f = a10.getHeight();
    }

    public final void f() {
        int i7 = -this.i;
        this.g = i7;
        TL_iv.pageTableCell pagetablecell = this.c;
        boolean z9 = pagetablecell.align_right;
        nx0 nx0Var = this.s;
        if (z9) {
            this.g = ((this.k - this.e) - nx0Var.w) + i7;
        } else if (pagetablecell.align_center) {
            this.g = Math.round((this.k - this.e) / 2.0f) + i7;
        } else {
            this.g = i7 + nx0Var.w;
        }
    }

    public final void g() {
        TL_iv.pageTableCell pagetablecell = this.c;
        if (pagetablecell.valign_middle) {
            this.h = (this.l - this.f) / 2;
            return;
        }
        boolean z9 = pagetablecell.valign_bottom;
        nx0 nx0Var = this.s;
        if (z9) {
            this.h = (this.l - this.f) - nx0Var.s;
        } else {
            this.h = nx0Var.r;
        }
    }
}
