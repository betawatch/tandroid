package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class cz0 {
    public ez0 a;
    public bz0 b;
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
    public final /* synthetic */ jz0 s;

    public cz0(jz0 jz0Var, int i10) {
        this.s = jz0Var;
        this.d = i10;
    }

    public final void a(Canvas canvas, View view, boolean z10) {
        boolean z11;
        boolean z12;
        Paint paint;
        Paint paint2;
        RectF rectF;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.Cells.q9 q9Var;
        Canvas canvas2 = canvas;
        if (this.c == null) {
            return;
        }
        int i13 = this.p + this.k;
        jz0 jz0Var = this.s;
        int i14 = jz0Var.y;
        Path path = jz0Var.L;
        iz0 iz0Var = jz0Var.O;
        float[] fArr = jz0Var.N;
        RectF rectF2 = jz0Var.M;
        boolean z13 = i13 == i14;
        boolean z14 = this.q + this.l == jz0Var.E;
        int dp = AndroidUtilities.dp(8.0f);
        boolean z15 = this.c.header;
        if (z15 || (jz0Var.H && this.a.a.b.a % 2 == 0)) {
            int i15 = this.p;
            if (i15 == 0 && this.q == 0) {
                float f7 = dp;
                fArr[1] = f7;
                fArr[0] = f7;
                z11 = true;
            } else {
                fArr[1] = 0.0f;
                fArr[0] = 0.0f;
                z11 = false;
            }
            if (z13 && this.q == 0) {
                float f10 = dp;
                fArr[3] = f10;
                fArr[2] = f10;
                z11 = true;
            } else {
                fArr[3] = 0.0f;
                fArr[2] = 0.0f;
            }
            if (z13 && z14) {
                float f11 = dp;
                fArr[5] = f11;
                fArr[4] = f11;
                z11 = true;
            } else {
                fArr[5] = 0.0f;
                fArr[4] = 0.0f;
            }
            if (i15 == 0 && z14) {
                float f12 = dp;
                fArr[7] = f12;
                fArr[6] = f12;
                z12 = true;
            } else {
                fArr[7] = 0.0f;
                fArr[6] = 0.0f;
                z12 = z11;
            }
            if (z12) {
                rectF2.set(i15, this.q, i15 + this.k, r6 + this.l);
                path.reset();
                path.addRoundRect(rectF2, fArr, Path.Direction.CW);
                if (this.c.header) {
                    canvas2.drawPath(path, iz0Var.getHeaderPaint());
                } else {
                    canvas2.drawPath(path, iz0Var.getStripPaint());
                }
            } else if (z15) {
                canvas2.drawRect(i15, this.q, i15 + this.k, r4 + this.l, iz0Var.getHeaderPaint());
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawRect(i15, this.q, this.k + i15, r1 + this.l, iz0Var.getStripPaint());
            }
        }
        if (z10 && this.b != null) {
            canvas2.save();
            canvas2.translate(b(), c());
            if (this.r >= 0 && (q9Var = jz0Var.a) != null) {
                q9Var.a0(canvas2, (org.telegram.ui.Cells.p9) jz0Var.getParent().getParent(), this.r);
            }
            this.b.draw(canvas2, view);
            canvas2.restore();
        }
        if (jz0Var.G) {
            Paint linePaint = iz0Var.getLinePaint();
            Paint linePaint2 = iz0Var.getLinePaint();
            float strokeWidth = linePaint.getStrokeWidth() / 2.0f;
            float strokeWidth2 = linePaint2.getStrokeWidth() / 2.0f;
            int i16 = this.p;
            if (i16 == 0) {
                int i17 = this.q;
                float f13 = i17;
                float f14 = this.l + i17;
                if (i17 == 0) {
                    f13 += dp;
                }
                float f15 = f13;
                if (f14 == jz0Var.E) {
                    f14 -= dp;
                }
                float f16 = i16 + strokeWidth;
                canvas2.drawLine(f16, f15, f16, f14, linePaint);
                paint = linePaint;
                paint2 = linePaint2;
            } else {
                paint = linePaint;
                float f17 = i16 - strokeWidth2;
                paint2 = linePaint2;
                canvas.drawLine(f17, this.q, f17, r1 + this.l, paint2);
            }
            int i18 = this.q;
            if (i18 == 0) {
                int i19 = this.p;
                float f18 = i19;
                float f19 = this.k + i19;
                if (i19 == 0) {
                    f18 += dp;
                }
                float f20 = f18;
                if (f19 == jz0Var.y) {
                    f19 -= dp;
                }
                float f21 = i18 + strokeWidth;
                canvas.drawLine(f20, f21, f19, f21, paint);
            } else {
                float f22 = i18 - strokeWidth2;
                canvas.drawLine(this.p, f22, r2 + this.k, f22, paint2);
            }
            float f23 = (this.p + this.k) - strokeWidth;
            Paint paint3 = paint;
            canvas.drawLine(f23, (z13 && (i12 = this.q) == 0) ? i12 + dp : this.q - strokeWidth, f23, (z13 && z14) ? (this.q + this.l) - dp : (this.q + this.l) - strokeWidth, paint3);
            int i20 = this.p;
            float f24 = (this.q + this.l) - strokeWidth;
            canvas.drawLine((i20 == 0 && z14) ? i20 + dp : i20 - strokeWidth, f24, (z13 && z14) ? (i20 + this.k) - dp : (i20 + this.k) - strokeWidth, f24, paint3);
            int i21 = this.p;
            if (i21 == 0 && (i11 = this.q) == 0) {
                float f25 = i21 + strokeWidth;
                float f26 = i11 + strokeWidth;
                float f27 = dp * 2;
                rectF2.set(f25, f26, f25 + f27, f27 + f26);
                rectF = rectF2;
                canvas.drawArc(rectF, -180.0f, 90.0f, false, paint3);
            } else {
                rectF = rectF2;
            }
            if (z13 && (i10 = this.q) == 0) {
                float f28 = (this.p + this.k) - strokeWidth;
                float f29 = dp * 2;
                float f30 = i10 + strokeWidth;
                rectF.set(f28 - f29, f30, f28, f29 + f30);
                canvas.drawArc(rectF, 0.0f, -90.0f, false, paint3);
            }
            int i22 = this.p;
            if (i22 == 0 && z14) {
                float f31 = i22 + strokeWidth;
                float f32 = (this.q + this.l) - strokeWidth;
                float f33 = dp * 2;
                rectF.set(f31, f32 - f33, f33 + f31, f32);
                canvas.drawArc(rectF, 180.0f, -90.0f, false, paint3);
            }
            if (z13 && z14) {
                float f34 = (this.p + this.k) - strokeWidth;
                float f35 = dp * 2;
                float f36 = (this.q + this.l) - strokeWidth;
                rectF.set(f34 - f35, f36 - f35, f34, f36);
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
    public final void d(int i10, int i11, boolean z10) {
        this.k = i10;
        this.l = i11;
        if (z10) {
            this.m = i11;
        }
        if (this.c != null) {
            bz0 bz0Var = this.b;
            if (bz0Var != null) {
                Layout layout = bz0Var.getLayout();
                int lineCount = layout != null ? layout.getLineCount() : 0;
                if (!z10) {
                    if (lineCount <= 1) {
                        if (lineCount > 0) {
                            TL_iv.pageTableCell pagetablecell = this.c;
                            if (!pagetablecell.align_center) {
                            }
                        }
                    }
                    jz0 jz0Var = this.s;
                    e(jz0Var.O.createTextLayout(this.c, this.k - (jz0Var.v * 2)));
                    this.m = this.f + jz0Var.r + jz0Var.s;
                }
                f();
            }
            g();
        }
    }

    public final void e(bz0 bz0Var) {
        this.b = bz0Var;
        Layout layout = bz0Var != null ? bz0Var.getLayout() : null;
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
        boolean z10 = pagetablecell.align_right;
        jz0 jz0Var = this.s;
        if (z10) {
            this.g = ((this.k - this.e) - jz0Var.v) + i10;
        } else if (pagetablecell.align_center) {
            this.g = Math.round((this.k - this.e) / 2.0f) + i10;
        } else {
            this.g = i10 + jz0Var.v;
        }
    }

    public final void g() {
        TL_iv.pageTableCell pagetablecell = this.c;
        if (pagetablecell.valign_middle) {
            this.h = (this.l - this.f) / 2;
            return;
        }
        boolean z10 = pagetablecell.valign_bottom;
        jz0 jz0Var = this.s;
        if (z10) {
            this.h = (this.l - this.f) - jz0Var.s;
        } else {
            this.h = jz0Var.r;
        }
    }
}
