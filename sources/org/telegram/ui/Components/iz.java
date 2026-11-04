package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.SystemClock;
import android.text.TextPaint;
import android.view.View;
import java.util.HashSet;
import java.util.Random;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class iz extends View implements org.telegram.ui.ActionBar.z5 {
    public boolean E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public final org.telegram.ui.ActionBar.e6 M;
    public float[] N;
    public Paint O;
    public int P;
    public int Q;
    public float R;
    public iz S;
    public boolean T;
    public float U;
    public int a;
    public LinearGradient b;
    public final Paint c;
    public final Paint d;
    public long e;
    public int f;
    public final Matrix h;
    public final RectF n;
    public int r;
    public int s;
    public int w;
    public boolean x;
    public boolean y;

    public iz(Context context) {
        this(context, null);
    }

    public final float a(float f10) {
        return org.telegram.messenger.bd.a0 ? getMeasuredWidth() - f10 : f10;
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(this.I));
        hashSet.add(Integer.valueOf(this.J));
    }

    public final void b(RectF rectF) {
        if (org.telegram.messenger.bd.a0) {
            rectF.left = getMeasuredWidth() - rectF.left;
            rectF.right = getMeasuredWidth() - rectF.right;
        }
    }

    public final int c(int i3) {
        switch (getViewType()) {
            case 1:
                return org.telegram.messenger.g0.L(78.0f) + 1;
            case 2:
                return org.telegram.messenger.g0.L(2.0f) + ((i3 - ((getColumnsCount() - 1) * org.telegram.messenger.g0.L(2.0f))) / getColumnsCount());
            case 3:
            case 4:
                return org.telegram.messenger.g0.L(56.0f);
            case 5:
                return org.telegram.messenger.g0.L(80.0f);
            case 6:
            case 18:
                return org.telegram.messenger.g0.L(64.0f);
            case 7:
                return org.telegram.messenger.g0.L((org.telegram.messenger.az.p1 ? 78 : 72) + 1);
            case 8:
                return org.telegram.messenger.g0.L(61.0f);
            case 9:
                return org.telegram.messenger.g0.L(66.0f);
            case 10:
                return org.telegram.messenger.g0.L(58.0f);
            case 11:
                return org.telegram.messenger.g0.L(36.0f);
            case 12:
                return org.telegram.messenger.g0.L(103.0f);
            case 13:
            case 14:
            case 17:
            case 20:
            case 27:
            default:
                return 0;
            case 15:
                return org.telegram.messenger.g0.L(107.0f);
            case 16:
            case 23:
                return org.telegram.messenger.g0.L(50.0f);
            case 19:
                return org.telegram.messenger.g0.L(58.0f);
            case 21:
                return org.telegram.messenger.g0.L(58.0f);
            case 22:
                return org.telegram.messenger.g0.L(60.0f);
            case 24:
                return org.telegram.messenger.g0.L((org.telegram.messenger.az.p1 ? 76 : 64) + 1);
            case 25:
                return org.telegram.messenger.g0.L(51.0f);
            case 26:
                return org.telegram.messenger.g0.L(50.0f) + 1;
            case 28:
                return org.telegram.messenger.g0.L(58.0f);
            case 29:
                return org.telegram.messenger.g0.L(60.0f) + 1;
            case org.telegram.messenger.hs.T /* 30 */:
                return org.telegram.messenger.g0.L(32.0f);
            case org.telegram.messenger.hs.U /* 31 */:
                return org.telegram.messenger.g0.L(48.0f) + 1;
            case 32:
                return org.telegram.messenger.g0.L(56.0f) + 1;
            case 33:
                return org.telegram.messenger.g0.L(58.0f);
            case 34:
                return org.telegram.messenger.g0.L(140.0f);
            case 35:
                return org.telegram.messenger.g0.L(112.0f);
            case 36:
                return org.telegram.messenger.g0.L(108.0f);
            case 37:
                return org.telegram.messenger.g0.L(73.0f);
            case 38:
                return org.telegram.messenger.g0.L(58.0f);
        }
    }

    public final int d(int i3) {
        return org.telegram.ui.ActionBar.k6.w0(i3, this.M);
    }

    public final void e(int i3, int i10, int i11) {
        this.I = i3;
        this.J = i10;
        this.K = i11;
        invalidate();
    }

    public final void f() {
        iz izVar = this.S;
        if (izVar != null) {
            izVar.f();
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long abs = Math.abs(this.e - elapsedRealtime);
        if (abs > 17) {
            abs = 16;
        }
        if (abs < 4) {
            abs = 0;
        }
        int i3 = this.P;
        if (i3 == 0) {
            i3 = getMeasuredWidth();
        }
        int i10 = this.F;
        if (i10 == 34 || i10 == 35 || i10 == 36) {
            i3 = Math.max(i3, org.telegram.messenger.g0.q.x);
        }
        int i11 = this.Q;
        if (i11 == 0) {
            i11 = getMeasuredHeight();
        }
        this.e = elapsedRealtime;
        boolean z10 = this.E;
        Matrix matrix = this.h;
        if (z10 || this.F == 13 || getViewType() == 14 || getViewType() == 17) {
            int i12 = (int) (((abs * i3) / 400.0f) + this.f);
            this.f = i12;
            if (i12 >= i3 * 2) {
                this.f = (-this.a) * 2;
            }
            matrix.setTranslate(this.f + this.R, 0.0f);
        } else {
            int i13 = (int) (((abs * i11) / 400.0f) + this.f);
            this.f = i13;
            if (i13 >= i11 * 2) {
                this.f = (-this.a) * 2;
            }
            matrix.setTranslate(this.R, this.f);
        }
        LinearGradient linearGradient = this.b;
        if (linearGradient != null) {
            linearGradient.setLocalMatrix(matrix);
        }
    }

    public int getAdditionalHeight() {
        return 0;
    }

    public int getColumnsCount() {
        return 2;
    }

    public Paint getPaint() {
        return this.c;
    }

    public int getViewType() {
        return this.F;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Paint paint;
        Canvas canvas2;
        Paint paint2;
        float f10;
        if (this.S != null) {
            if (getParent() != null) {
                View view = (View) getParent();
                iz izVar = this.S;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                float f11 = -getX();
                izVar.P = measuredWidth;
                izVar.Q = measuredHeight;
                izVar.R = f11;
            }
            paint = this.S.c;
        } else {
            paint = this.c;
        }
        Paint paint3 = paint;
        if (getViewType() == 34 || getViewType() == 35 || getViewType() == 36) {
            this.R = -getX();
        }
        updateColors();
        f();
        int i3 = this.G;
        if (this.y) {
            int L = org.telegram.messenger.g0.L(32.0f) + i3;
            int i10 = this.K;
            if (i10 >= 0) {
                this.d.setColor(d(i10));
            }
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), org.telegram.messenger.g0.L(32.0f), this.K >= 0 ? this.d : paint3);
            canvas2 = canvas;
            i3 = L;
        } else {
            canvas2 = canvas;
        }
        int viewType = getViewType();
        int i11 = 0;
        int i12 = 1;
        RectF rectF = this.n;
        if (viewType == 7) {
            while (i3 <= getMeasuredHeight()) {
                int c2 = c(getMeasuredWidth());
                canvas2.drawCircle(a(org.telegram.messenger.g0.L(10.0f) + r4), (c2 >> 1) + i3, org.telegram.messenger.g0.L(28.0f), paint3);
                rectF.set(org.telegram.messenger.g0.L(76.0f), org.telegram.messenger.g0.L(16.0f) + i3, org.telegram.messenger.g0.L(148.0f), org.telegram.messenger.g0.L(24.0f) + i3);
                b(rectF);
                canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint3);
                rectF.set(org.telegram.messenger.g0.L(76.0f), org.telegram.messenger.g0.L(38.0f) + i3, org.telegram.messenger.g0.L(268.0f), org.telegram.messenger.g0.L(46.0f) + i3);
                b(rectF);
                canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint3);
                if (org.telegram.messenger.az.p1) {
                    rectF.set(org.telegram.messenger.g0.L(76.0f), org.telegram.messenger.g0.L(54.0f) + i3, org.telegram.messenger.g0.L(220.0f), org.telegram.messenger.g0.L(62.0f) + i3);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint3);
                }
                if (this.x) {
                    rectF.set(getMeasuredWidth() - org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(16.0f) + i3, getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(24.0f) + i3);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint3);
                }
                i3 = org.telegram.ui.Cells.f1.j(this, i3);
                int i13 = i11 + 1;
                if (this.E && i13 >= this.L) {
                    break;
                } else {
                    i11 = i13;
                }
            }
        } else if (getViewType() == 24) {
            while (i3 <= getMeasuredHeight()) {
                canvas2.drawCircle(a(org.telegram.messenger.g0.L(10.0f) + r3), org.telegram.messenger.k5.C(10.0f, i3, r3), org.telegram.messenger.g0.L(14.0f), paint3);
                canvas2.save();
                canvas2.translate(0.0f, -org.telegram.messenger.g0.L(4.0f));
                rectF.set(org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(16.0f) + i3, org.telegram.messenger.g0.L(148.0f), org.telegram.messenger.g0.L(24.0f) + i3);
                b(rectF);
                canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint3);
                rectF.set(org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(38.0f) + i3, org.telegram.messenger.g0.L(268.0f), org.telegram.messenger.g0.L(46.0f) + i3);
                b(rectF);
                canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint3);
                if (org.telegram.messenger.az.p1) {
                    rectF.set(org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(54.0f) + i3, org.telegram.messenger.g0.L(220.0f), org.telegram.messenger.g0.L(62.0f) + i3);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint3);
                }
                if (this.x) {
                    rectF.set(getMeasuredWidth() - org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(16.0f) + i3, getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(24.0f) + i3);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint3);
                }
                canvas2.restore();
                i3 += c(getMeasuredWidth());
                int i14 = i11 + 1;
                if (this.E && i14 >= this.L) {
                    break;
                } else {
                    i11 = i14;
                }
            }
        } else if (getViewType() == 18) {
            int i15 = i3;
            while (i15 <= getMeasuredHeight()) {
                canvas2.drawCircle(a(org.telegram.messenger.k5.C(9.0f, this.H, r1)), org.telegram.messenger.g0.L(32.0f) + i15, org.telegram.messenger.g0.L(25.0f), paint3);
                int i16 = i11 % 2 == 0 ? 52 : 72;
                float f12 = 76;
                rectF.set(org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(20.0f) + i15, org.telegram.messenger.g0.L(i16 + 76), org.telegram.messenger.g0.L(28.0f) + i15);
                b(rectF);
                canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint3);
                rectF.set(org.telegram.messenger.g0.L(i16 + 84), org.telegram.messenger.g0.L(20.0f) + i15, org.telegram.messenger.g0.L(i16 + org.telegram.messenger.hs.y2), org.telegram.messenger.g0.L(28.0f) + i15);
                b(rectF);
                canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint3);
                rectF.set(org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(42.0f) + i15, org.telegram.messenger.g0.L(org.telegram.messenger.hs.W1), org.telegram.messenger.g0.L(50.0f) + i15);
                b(rectF);
                canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint3);
                Canvas canvas3 = canvas2;
                Paint paint4 = paint3;
                canvas3.drawLine(org.telegram.messenger.g0.L(f12), org.telegram.ui.Cells.f1.j(this, i15), getMeasuredWidth(), org.telegram.ui.Cells.f1.j(this, i15), paint4);
                canvas2 = canvas3;
                i15 = org.telegram.ui.Cells.f1.j(this, i15);
                int i17 = i11 + 1;
                if (this.E && i17 >= this.L) {
                    break;
                }
                i11 = i17;
                paint3 = paint4;
            }
        } else {
            Paint paint5 = paint3;
            float f13 = 6.0f;
            if (getViewType() == 37 || getViewType() == 38) {
                boolean z10 = getViewType() == 37;
                int c10 = c(getMeasuredWidth());
                while (i3 <= getMeasuredHeight()) {
                    if (z10) {
                        canvas2.drawCircle(org.telegram.messenger.g0.L(36.0f) + this.H, org.telegram.messenger.g0.L(35.0f) + i3, org.telegram.messenger.g0.L(23.0f), paint5);
                    } else {
                        rectF.set(org.telegram.messenger.g0.L(15.0f) + this.H, org.telegram.messenger.g0.L(6.0f) + i3, org.telegram.messenger.g0.L(61.0f) + this.H, org.telegram.messenger.g0.L(52.0f) + i3);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), paint5);
                    }
                    float L2 = org.telegram.messenger.g0.L(71.0f) + this.H;
                    float max = Math.max(L2, getMeasuredWidth() - org.telegram.messenger.g0.L(z10 ? 76.0f : 20.0f));
                    rectF.set(L2, org.telegram.messenger.g0.L(14.0f) + i3, Math.min(org.telegram.messenger.g0.L(100.0f) + L2, max), org.telegram.messenger.g0.L(22.0f) + i3);
                    canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint5);
                    rectF.set(L2, org.telegram.messenger.g0.L(z10 ? 33.0f : 36.0f) + i3, Math.min(org.telegram.messenger.g0.L(140.0f) + L2, max), org.telegram.messenger.g0.L(z10 ? 41.0f : 44.0f) + i3);
                    canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint5);
                    if (z10) {
                        rectF.set(L2, org.telegram.messenger.g0.L(51.0f) + i3, Math.min(org.telegram.messenger.g0.L(80.0f) + L2, max), org.telegram.messenger.g0.L(59.0f) + i3);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint5);
                        if (getMeasuredWidth() - org.telegram.messenger.g0.L(68.0f) >= L2) {
                            rectF.set(getMeasuredWidth() - org.telegram.messenger.g0.L(68.0f), org.telegram.messenger.g0.L(15.0f) + i3, getMeasuredWidth() - org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(23.0f) + i3);
                            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint5);
                        }
                    }
                    i3 += c10;
                    int i18 = i11 + 1;
                    if (this.E && i18 >= this.L) {
                        break;
                    } else {
                        i11 = i18;
                    }
                }
            } else if (getViewType() == 19) {
                int i19 = i3;
                while (i19 <= getMeasuredHeight()) {
                    canvas2.drawCircle(a(org.telegram.messenger.k5.C(9.0f, this.H, r1)), org.telegram.messenger.g0.L(29.0f) + i19, org.telegram.messenger.g0.L(20.0f), paint5);
                    float f14 = 76;
                    rectF.set(org.telegram.messenger.g0.L(f14), org.telegram.messenger.g0.L(16.0f) + i19, org.telegram.messenger.g0.L((i11 % 2 == 0 ? 92 : 128) + 76), org.telegram.messenger.g0.L(24.0f) + i19);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint5);
                    rectF.set(org.telegram.messenger.g0.L(f14), org.telegram.messenger.g0.L(38.0f) + i19, org.telegram.messenger.g0.L(org.telegram.messenger.hs.P3), org.telegram.messenger.g0.L(46.0f) + i19);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint5);
                    Canvas canvas4 = canvas2;
                    Paint paint6 = paint5;
                    canvas4.drawLine(org.telegram.messenger.g0.L(f14), org.telegram.ui.Cells.f1.j(this, i19), getMeasuredWidth(), org.telegram.ui.Cells.f1.j(this, i19), paint6);
                    canvas2 = canvas4;
                    paint5 = paint6;
                    i19 = org.telegram.ui.Cells.f1.j(this, i19);
                    int i20 = i11 + 1;
                    if (this.E && i20 >= this.L) {
                        break;
                    } else {
                        i11 = i20;
                    }
                }
            } else if (getViewType() == 1) {
                while (i3 <= getMeasuredHeight()) {
                    canvas2.drawCircle(a(org.telegram.messenger.g0.L(9.0f) + r4), (org.telegram.messenger.g0.L(78.0f) >> 1) + i3, org.telegram.messenger.g0.L(25.0f), paint5);
                    rectF.set(org.telegram.messenger.g0.L(68.0f), org.telegram.messenger.g0.L(20.0f) + i3, org.telegram.messenger.g0.L(140.0f), org.telegram.messenger.g0.L(28.0f) + i3);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint5);
                    rectF.set(org.telegram.messenger.g0.L(68.0f), org.telegram.messenger.g0.L(42.0f) + i3, org.telegram.messenger.g0.L(260.0f), org.telegram.messenger.g0.L(50.0f) + i3);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint5);
                    if (this.x) {
                        rectF.set(getMeasuredWidth() - org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(20.0f) + i3, getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(28.0f) + i3);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint5);
                    }
                    i3 = org.telegram.ui.Cells.f1.j(this, i3);
                    int i21 = i11 + 1;
                    if (this.E && i21 >= this.L) {
                        break;
                    } else {
                        i11 = i21;
                    }
                }
            } else if (getViewType() == 2 || getViewType() == 27) {
                int i22 = 2;
                int measuredWidth2 = (getMeasuredWidth() - ((getColumnsCount() - 1) * org.telegram.messenger.g0.L(2.0f))) / getColumnsCount();
                int i23 = getViewType() == 27 ? (int) (measuredWidth2 * 1.25f) : measuredWidth2;
                int i24 = i3;
                int i25 = 0;
                while (true) {
                    if (i24 >= getMeasuredHeight() && !this.E) {
                        break;
                    }
                    int i26 = 0;
                    while (i26 < getColumnsCount()) {
                        if (i25 != 0 || i26 >= this.w) {
                            paint2 = paint5;
                            canvas.drawRect((org.telegram.messenger.g0.L(2.0f) + measuredWidth2) * i26, i24, r1 + measuredWidth2, i24 + i23, paint2);
                        } else {
                            paint2 = paint5;
                        }
                        i26++;
                        paint5 = paint2;
                    }
                    Paint paint7 = paint5;
                    i24 = org.telegram.messenger.k5.C(2.0f, i23, i24);
                    i25++;
                    int i27 = i22;
                    if (this.E && i25 >= i27) {
                        break;
                    }
                    i22 = i27;
                    paint5 = paint7;
                }
            } else if (getViewType() == 3) {
                while (i3 <= getMeasuredHeight()) {
                    rectF.set(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f) + i3, org.telegram.messenger.g0.L(52.0f), org.telegram.messenger.g0.L(48.0f) + i3);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint5);
                    rectF.set(org.telegram.messenger.g0.L(68.0f), org.telegram.messenger.g0.L(12.0f) + i3, org.telegram.messenger.g0.L(140.0f), org.telegram.messenger.g0.L(20.0f) + i3);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint5);
                    rectF.set(org.telegram.messenger.g0.L(68.0f), org.telegram.messenger.g0.L(34.0f) + i3, org.telegram.messenger.g0.L(260.0f), org.telegram.messenger.g0.L(42.0f) + i3);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint5);
                    if (this.x) {
                        rectF.set(getMeasuredWidth() - org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(12.0f) + i3, getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(20.0f) + i3);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint5);
                    }
                    i3 = org.telegram.ui.Cells.f1.j(this, i3);
                    int i28 = i11 + 1;
                    if (this.E && i28 >= this.L) {
                        break;
                    } else {
                        i11 = i28;
                    }
                }
            } else if (getViewType() == 4) {
                while (i3 <= getMeasuredHeight()) {
                    canvas2.drawCircle(a(org.telegram.messenger.g0.L(12.0f) + r4), org.telegram.messenger.k5.C(6.0f, i3, r4), org.telegram.messenger.g0.L(44.0f) >> 1, paint5);
                    rectF.set(org.telegram.messenger.g0.L(68.0f), org.telegram.messenger.g0.L(12.0f) + i3, org.telegram.messenger.g0.L(140.0f), org.telegram.messenger.g0.L(20.0f) + i3);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint5);
                    rectF.set(org.telegram.messenger.g0.L(68.0f), org.telegram.messenger.g0.L(34.0f) + i3, org.telegram.messenger.g0.L(260.0f), org.telegram.messenger.g0.L(42.0f) + i3);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint5);
                    if (this.x) {
                        rectF.set(getMeasuredWidth() - org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(12.0f) + i3, getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(20.0f) + i3);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint5);
                    }
                    i3 = org.telegram.ui.Cells.f1.j(this, i3);
                    int i29 = i11 + 1;
                    if (this.E && i29 >= this.L) {
                        break;
                    } else {
                        i11 = i29;
                    }
                }
            } else {
                float f15 = 2.0f;
                if (getViewType() == 5) {
                    while (i3 <= getMeasuredHeight()) {
                        rectF.set(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(11.0f) + i3, org.telegram.messenger.g0.L(62.0f), org.telegram.messenger.g0.L(63.0f) + i3);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint5);
                        rectF.set(org.telegram.messenger.g0.L(68.0f), org.telegram.messenger.g0.L(12.0f) + i3, org.telegram.messenger.g0.L(140.0f), org.telegram.messenger.g0.L(20.0f) + i3);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint5);
                        rectF.set(org.telegram.messenger.g0.L(68.0f), org.telegram.messenger.g0.L(34.0f) + i3, org.telegram.messenger.g0.L(268.0f), org.telegram.messenger.g0.L(42.0f) + i3);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint5);
                        rectF.set(org.telegram.messenger.g0.L(68.0f), org.telegram.messenger.g0.L(54.0f) + i3, org.telegram.messenger.g0.L(188.0f), org.telegram.messenger.g0.L(62.0f) + i3);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint5);
                        if (this.x) {
                            rectF.set(getMeasuredWidth() - org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(12.0f) + i3, getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(20.0f) + i3);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint5);
                        }
                        i3 = org.telegram.ui.Cells.f1.j(this, i3);
                        int i30 = i11 + 1;
                        if (this.E && i30 >= this.L) {
                            break;
                        } else {
                            i11 = i30;
                        }
                    }
                } else if (getViewType() == 6 || getViewType() == 10) {
                    while (i3 <= getMeasuredHeight()) {
                        canvas2.drawCircle(a(org.telegram.messenger.k5.C(9.0f, this.H, r4)), (org.telegram.messenger.g0.L(64.0f) >> 1) + i3, org.telegram.messenger.g0.L(23.0f), paint5);
                        rectF.set(org.telegram.messenger.g0.L(68.0f) + this.H, org.telegram.messenger.g0.L(17.0f) + i3, org.telegram.messenger.g0.L(260.0f) + this.H, org.telegram.messenger.g0.L(25.0f) + i3);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint5);
                        rectF.set(org.telegram.messenger.g0.L(68.0f) + this.H, org.telegram.messenger.g0.L(39.0f) + i3, org.telegram.messenger.g0.L(140.0f) + this.H, org.telegram.messenger.g0.L(47.0f) + i3);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint5);
                        if (this.x) {
                            rectF.set(getMeasuredWidth() - org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(20.0f) + i3, getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(28.0f) + i3);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint5);
                        }
                        i3 = org.telegram.ui.Cells.f1.j(this, i3);
                        int i31 = i11 + 1;
                        if (this.E && i31 >= this.L) {
                            break;
                        } else {
                            i11 = i31;
                        }
                    }
                } else if (getViewType() == 29) {
                    while (i3 <= getMeasuredHeight()) {
                        canvas2.drawCircle(a(org.telegram.messenger.k5.C(9.0f, this.H, r4)), (org.telegram.messenger.g0.L(64.0f) >> 1) + i3, org.telegram.messenger.g0.L(23.0f), paint5);
                        rectF.set(org.telegram.messenger.g0.L(68.0f) + this.H, org.telegram.messenger.g0.L(17.0f) + i3, org.telegram.messenger.g0.L(260.0f) + this.H, org.telegram.messenger.g0.L(25.0f) + i3);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint5);
                        rectF.set(org.telegram.messenger.g0.L(68.0f) + this.H, org.telegram.messenger.g0.L(39.0f) + i3, org.telegram.messenger.g0.L(140.0f) + this.H, org.telegram.messenger.g0.L(47.0f) + i3);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint5);
                        i3 = org.telegram.ui.Cells.f1.j(this, i3);
                        int i32 = i11 + 1;
                        if (this.E && i32 >= this.L) {
                            break;
                        } else {
                            i11 = i32;
                        }
                    }
                } else if (getViewType() == 33) {
                    while (i3 <= getMeasuredHeight()) {
                        canvas2.drawCircle(a(org.telegram.messenger.k5.C(13.0f, this.H, r4)), (org.telegram.messenger.g0.L(58.0f) >> 1) + i3, org.telegram.messenger.g0.L(23.0f), paint5);
                        rectF.set(org.telegram.messenger.g0.L(72.0f) + this.H, org.telegram.messenger.g0.L(17.0f) + i3, org.telegram.messenger.g0.L(260.0f) + this.H, org.telegram.messenger.g0.L(25.0f) + i3);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint5);
                        rectF.set(org.telegram.messenger.g0.L(72.0f) + this.H, org.telegram.messenger.g0.L(39.0f) + i3, org.telegram.messenger.g0.L(140.0f) + this.H, org.telegram.messenger.g0.L(47.0f) + i3);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint5);
                        i3 = org.telegram.ui.Cells.f1.j(this, i3);
                        int i33 = i11 + 1;
                        if (this.E && i33 >= this.L) {
                            break;
                        } else {
                            i11 = i33;
                        }
                    }
                } else if (getViewType() == 30) {
                    while (i3 <= getMeasuredHeight()) {
                        i3 += c(getMeasuredWidth());
                        rectF.set(0.0f, i3, getMeasuredWidth(), i3);
                        b(rectF);
                        canvas2.drawRect(rectF, paint5);
                        int i34 = i11 + 1;
                        if (this.E && i34 >= this.L) {
                            break;
                        } else {
                            i11 = i34;
                        }
                    }
                } else if (getViewType() == 8) {
                    while (i3 <= getMeasuredHeight()) {
                        canvas2.drawCircle(a(org.telegram.messenger.k5.C(11.0f, this.H, r4)), (org.telegram.messenger.g0.L(64.0f) >> 1) + i3, org.telegram.messenger.g0.L(23.0f), paint5);
                        rectF.set(org.telegram.messenger.g0.L(68.0f) + this.H, org.telegram.messenger.g0.L(17.0f) + i3, org.telegram.messenger.g0.L(140.0f) + this.H, org.telegram.messenger.g0.L(25.0f) + i3);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint5);
                        rectF.set(org.telegram.messenger.g0.L(68.0f) + this.H, org.telegram.messenger.g0.L(39.0f) + i3, org.telegram.messenger.g0.L(260.0f) + this.H, org.telegram.messenger.g0.L(47.0f) + i3);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint5);
                        if (this.x) {
                            rectF.set(getMeasuredWidth() - org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(20.0f) + i3, getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(28.0f) + i3);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint5);
                        }
                        i3 = org.telegram.ui.Cells.f1.j(this, i3);
                        int i35 = i11 + 1;
                        if (this.E && i35 >= this.L) {
                            break;
                        } else {
                            i11 = i35;
                        }
                    }
                } else if (getViewType() == 9) {
                    while (i3 <= getMeasuredHeight()) {
                        canvas2.drawCircle(a(org.telegram.messenger.g0.L(35.0f)), (c(getMeasuredWidth()) >> 1) + i3, org.telegram.messenger.g0.L(32.0f) / 2, paint5);
                        rectF.set(org.telegram.messenger.g0.L(72.0f), org.telegram.messenger.g0.L(16.0f) + i3, org.telegram.messenger.g0.L(268.0f), org.telegram.messenger.g0.L(24.0f) + i3);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint5);
                        rectF.set(org.telegram.messenger.g0.L(72.0f), org.telegram.messenger.g0.L(38.0f) + i3, org.telegram.messenger.g0.L(140.0f), org.telegram.messenger.g0.L(46.0f) + i3);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint5);
                        if (this.x) {
                            rectF.set(getMeasuredWidth() - org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(16.0f) + i3, getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(24.0f) + i3);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint5);
                        }
                        i3 = org.telegram.ui.Cells.f1.j(this, i3);
                        int i36 = i11 + 1;
                        if (this.E && i36 >= this.L) {
                            break;
                        } else {
                            i11 = i36;
                        }
                    }
                } else if (getViewType() == 11) {
                    int i37 = 0;
                    while (i3 <= getMeasuredHeight()) {
                        rectF.set(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(14.0f), (getMeasuredWidth() * 0.5f) + org.telegram.messenger.g0.L(this.N[0] * 40.0f), org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.L(14.0f));
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint5);
                        rectF.set(getMeasuredWidth() - org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(14.0f), (getMeasuredWidth() - (getMeasuredWidth() * 0.2f)) - org.telegram.messenger.g0.L(this.N[0] * 20.0f), org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.L(14.0f));
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint5);
                        i3 = org.telegram.ui.Cells.f1.j(this, i3);
                        i37++;
                        if (this.E && i37 >= this.L) {
                            break;
                        }
                    }
                } else if (getViewType() == 12) {
                    int L3 = org.telegram.messenger.g0.L(14.0f) + i3;
                    while (L3 <= getMeasuredHeight()) {
                        int measuredWidth3 = getMeasuredWidth() / 4;
                        for (int i38 = 0; i38 < 4; i38++) {
                            float f16 = (measuredWidth3 / 2.0f) + (measuredWidth3 * i38);
                            canvas2.drawCircle(f16, (org.telegram.messenger.g0.L(56.0f) / 2.0f) + org.telegram.messenger.g0.L(7.0f) + L3, org.telegram.messenger.g0.L(28.0f), paint5);
                            float L4 = org.telegram.messenger.g0.L(16.0f) + org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.L(7.0f) + L3;
                            RectF rectF2 = org.telegram.messenger.g0.P;
                            rectF2.set(f16 - org.telegram.messenger.g0.L(24.0f), L4 - org.telegram.messenger.g0.L(4.0f), f16 + org.telegram.messenger.g0.L(24.0f), L4 + org.telegram.messenger.g0.L(4.0f));
                            canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint5);
                        }
                        L3 = org.telegram.ui.Cells.f1.j(this, L3);
                        if (this.E) {
                            break;
                        }
                    }
                } else if (getViewType() == 13) {
                    float measuredHeight2 = getMeasuredHeight() / 2.0f;
                    RectF rectF3 = org.telegram.messenger.g0.P;
                    rectF3.set(org.telegram.messenger.g0.L(40.0f), measuredHeight2 - org.telegram.messenger.g0.L(4.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(4.0f) + measuredHeight2);
                    canvas2.drawRoundRect(rectF3, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint5);
                    if (this.O == null) {
                        Paint paint8 = new Paint(1);
                        this.O = paint8;
                        paint8.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G8));
                    }
                    for (int i39 = 0; i39 < 3; i39++) {
                        canvas2.drawCircle(org.telegram.messenger.k5.D(12.0f, i39, org.telegram.messenger.g0.L(13.0f) + (getMeasuredWidth() - org.telegram.messenger.g0.L(56.0f))), measuredHeight2, org.telegram.messenger.g0.L(13.0f), this.O);
                        canvas2.drawCircle(org.telegram.messenger.k5.D(12.0f, i39, org.telegram.messenger.g0.L(13.0f) + (getMeasuredWidth() - org.telegram.messenger.g0.L(56.0f))), measuredHeight2, org.telegram.messenger.g0.L(12.0f), paint5);
                    }
                } else {
                    float f17 = 21.0f;
                    if (getViewType() == 14 || getViewType() == 17) {
                        int L5 = org.telegram.messenger.g0.L(12.0f);
                        int L6 = org.telegram.messenger.g0.L(77.0f);
                        int L7 = org.telegram.messenger.g0.L(4.0f);
                        float L8 = org.telegram.messenger.g0.L(21.0f);
                        float L9 = org.telegram.messenger.g0.L(41.0f);
                        while (L5 < getMeasuredWidth()) {
                            if (this.O == null) {
                                this.O = new Paint(i12);
                            }
                            this.O.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, this.M));
                            RectF rectF4 = org.telegram.messenger.g0.P;
                            int i40 = L5 + L6;
                            int i41 = i12;
                            float f18 = f13;
                            rectF4.set(org.telegram.messenger.g0.L(4.0f) + L5, org.telegram.messenger.g0.L(4.0f), i40 - org.telegram.messenger.g0.L(4.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(4.0f));
                            canvas2.drawRoundRect(rectF4, org.telegram.messenger.g0.L(f18), org.telegram.messenger.g0.L(f18), paint5);
                            if (getViewType() == 14) {
                                float L10 = org.telegram.messenger.g0.L(8.0f) + L7;
                                float f19 = L5;
                                float L11 = org.telegram.messenger.g0.L(22.0f) + L7 + f19;
                                rectF.set(L11, L10, L11 + L9, L10 + L8);
                                canvas2.drawRoundRect(rectF, rectF.height() * 0.5f, rectF.height() * 0.5f, this.O);
                                float L12 = org.telegram.messenger.g0.L(4.0f) + L8 + L10;
                                float L13 = f19 + org.telegram.messenger.g0.L(5.0f) + L7;
                                rectF.set(L13, L12, L13 + L9, L12 + L8);
                                canvas2.drawRoundRect(rectF, rectF.height() * 0.5f, rectF.height() * 0.5f, this.O);
                            } else if (getViewType() == 17) {
                                float L14 = org.telegram.messenger.g0.L(5.0f);
                                float L15 = org.telegram.messenger.g0.L(32.0f);
                                f10 = f17;
                                float z11 = com.google.android.recaptcha.internal.a.z(L6, L15, f15, L5);
                                rectF4.set(z11, org.telegram.messenger.g0.L(f10), L15 + z11, org.telegram.messenger.g0.L(32.0f) + r10);
                                canvas2.drawRoundRect(rectF4, L14, L14, this.O);
                                canvas2.drawCircle((L6 / 2) + L5, getMeasuredHeight() - org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(8.0f), this.O);
                                L5 = i40;
                                f17 = f10;
                                i12 = i41;
                                f13 = f18;
                                f15 = 2.0f;
                            }
                            f10 = f17;
                            canvas2.drawCircle((L6 / 2) + L5, getMeasuredHeight() - org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(8.0f), this.O);
                            L5 = i40;
                            f17 = f10;
                            i12 = i41;
                            f13 = f18;
                            f15 = 2.0f;
                        }
                    } else if (getViewType() == 15) {
                        int L16 = org.telegram.messenger.g0.L(23.0f);
                        int L17 = org.telegram.messenger.g0.L(4.0f);
                        while (i3 <= getMeasuredHeight()) {
                            canvas2.drawCircle(a(org.telegram.messenger.k5.C(12.0f, this.H, L16)), org.telegram.messenger.k5.C(8.0f, i3, L16), L16, paint5);
                            rectF.set(org.telegram.messenger.g0.L(74.0f) + this.H, org.telegram.messenger.g0.L(12.0f) + i3, org.telegram.messenger.g0.L(260.0f) + this.H, org.telegram.messenger.g0.L(20.0f) + i3);
                            b(rectF);
                            float f20 = L17;
                            canvas2.drawRoundRect(rectF, f20, f20, paint5);
                            rectF.set(org.telegram.messenger.g0.L(74.0f) + this.H, org.telegram.messenger.g0.L(36.0f) + i3, org.telegram.messenger.g0.L(140.0f) + this.H, org.telegram.messenger.g0.L(42.0f) + i3);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, f20, f20, paint5);
                            if (this.U > 0.0f) {
                                rectF.set(org.telegram.messenger.g0.L(73.0f) + this.H, org.telegram.messenger.g0.L(62.0f) + i3, org.telegram.messenger.g0.L(73.0f) + this.H + this.U, org.telegram.messenger.g0.L(94.0f) + i3);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, f20, f20, paint5);
                            }
                            i3 = org.telegram.ui.Cells.f1.j(this, i3);
                            int i42 = i11 + 1;
                            if (this.E && i42 >= this.L) {
                                break;
                            } else {
                                i11 = i42;
                            }
                        }
                    } else if (getViewType() == 16 || getViewType() == 23) {
                        int i43 = 0;
                        while (i3 <= getMeasuredHeight()) {
                            canvas2.drawCircle(a(org.telegram.messenger.k5.C(8.0f, this.H, r6)), org.telegram.messenger.g0.L(24.0f) + i3, org.telegram.messenger.g0.L(18.0f), paint5);
                            rectF.set(org.telegram.messenger.g0.L(58.0f) + this.H, org.telegram.messenger.g0.L(20.0f) + i3, getWidth() - org.telegram.messenger.g0.L(53.0f), org.telegram.messenger.g0.L(28.0f) + i3);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), paint5);
                            if (i43 < 4) {
                                canvas2.drawCircle(a(org.telegram.messenger.k5.z(12.0f, getWidth(), r6)), org.telegram.messenger.g0.L(24.0f) + i3, org.telegram.messenger.g0.L(12.0f), paint5);
                            }
                            i3 = org.telegram.ui.Cells.f1.j(this, i3);
                            i43++;
                            if (this.E && i43 >= this.L) {
                                break;
                            }
                        }
                        rectF.set(org.telegram.messenger.g0.L(8.0f) + this.H, org.telegram.messenger.g0.L(20.0f) + i3, getWidth() - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(28.0f) + i3);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), paint5);
                        rectF.set(org.telegram.messenger.g0.L(8.0f) + this.H, org.telegram.messenger.g0.L(36.0f) + i3, getWidth() - org.telegram.messenger.g0.L(53.0f), org.telegram.messenger.g0.L(44.0f) + i3);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), paint5);
                    } else {
                        int i44 = this.F;
                        if (i44 == 21) {
                            while (i3 <= getMeasuredHeight()) {
                                canvas2.drawCircle(a(org.telegram.messenger.g0.L(20.0f) + r4), (org.telegram.messenger.g0.L(58.0f) >> 1) + i3, org.telegram.messenger.g0.L(46.0f) >> 1, paint5);
                                rectF.set(org.telegram.messenger.g0.L(74.0f), org.telegram.messenger.g0.L(16.0f) + i3, org.telegram.messenger.g0.L(140.0f), org.telegram.messenger.g0.L(24.0f) + i3);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint5);
                                rectF.set(org.telegram.messenger.g0.L(74.0f), org.telegram.messenger.g0.L(38.0f) + i3, org.telegram.messenger.g0.L(260.0f), org.telegram.messenger.g0.L(46.0f) + i3);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint5);
                                i3 = org.telegram.ui.Cells.f1.j(this, i3);
                                int i45 = i11 + 1;
                                if (this.E && i45 >= this.L) {
                                    break;
                                } else {
                                    i11 = i45;
                                }
                            }
                        } else if (i44 == 22) {
                            while (i3 <= getMeasuredHeight()) {
                                canvas2.drawCircle(a(org.telegram.messenger.g0.L(20.0f) + r4), org.telegram.messenger.k5.C(6.0f, i3, r4), org.telegram.messenger.g0.L(48.0f) >> 1, paint5);
                                rectF.set(org.telegram.messenger.g0.L(76.0f), org.telegram.messenger.g0.L(16.0f) + i3, org.telegram.messenger.g0.L(140.0f), org.telegram.messenger.g0.L(24.0f) + i3);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint5);
                                rectF.set(org.telegram.messenger.g0.L(76.0f), org.telegram.messenger.g0.L(38.0f) + i3, org.telegram.messenger.g0.L(260.0f), org.telegram.messenger.g0.L(46.0f) + i3);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint5);
                                i3 = org.telegram.ui.Cells.f1.j(this, i3);
                                int i46 = i11 + 1;
                                if (this.E && i46 >= this.L) {
                                    break;
                                } else {
                                    i11 = i46;
                                }
                            }
                        } else if (i44 == 25) {
                            while (i3 <= getMeasuredHeight()) {
                                canvas2.drawCircle(org.telegram.messenger.g0.L(17.0f) + r4, org.telegram.messenger.k5.C(6.0f, i3, r4), org.telegram.messenger.g0.L(38.0f) >> 1, paint5);
                                rectF.set(org.telegram.messenger.g0.L(76.0f), org.telegram.messenger.g0.L(21.0f) + i3, org.telegram.messenger.g0.L(220.0f), org.telegram.messenger.g0.L(29.0f) + i3);
                                canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint5);
                                i3 = org.telegram.ui.Cells.f1.j(this, i3);
                                int i47 = i11 + 1;
                                if (this.E && i47 >= this.L) {
                                    break;
                                } else {
                                    i11 = i47;
                                }
                            }
                        } else if (i44 == 26) {
                            while (i3 <= getMeasuredHeight()) {
                                canvas2.drawCircle(org.telegram.messenger.bd.a0 ? org.telegram.messenger.k5.z(21.0f, getMeasuredWidth(), r4) : org.telegram.messenger.g0.L(21.0f) + r4, org.telegram.messenger.k5.C(16.0f, i3, r4), org.telegram.messenger.g0.L(21.0f) >> 1, paint5);
                                rectF.set(org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(21.0f) + i3, org.telegram.messenger.g0.L(190.0f), org.telegram.messenger.g0.L(29.0f) + i3);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint5);
                                rectF.set(getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(21.0f) + i3, getMeasuredWidth() - org.telegram.messenger.g0.L(62.0f), org.telegram.messenger.g0.L(29.0f) + i3);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint5);
                                i3 = org.telegram.ui.Cells.f1.j(this, i3);
                                int i48 = i11 + 1;
                                if (this.E && i48 >= this.L) {
                                    break;
                                } else {
                                    i11 = i48;
                                }
                            }
                        } else if (getViewType() == 28) {
                            while (i3 <= getMeasuredHeight()) {
                                canvas2.drawCircle(a(org.telegram.messenger.k5.C(10.0f, this.H, r4)), (org.telegram.messenger.g0.L(58.0f) >> 1) + i3, org.telegram.messenger.g0.L(24.0f), paint5);
                                rectF.set(org.telegram.messenger.g0.L(68.0f) + this.H, org.telegram.messenger.g0.L(17.0f) + i3, org.telegram.messenger.g0.L(260.0f) + this.H, org.telegram.messenger.g0.L(25.0f) + i3);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint5);
                                rectF.set(org.telegram.messenger.g0.L(68.0f) + this.H, org.telegram.messenger.g0.L(39.0f) + i3, org.telegram.messenger.g0.L(140.0f) + this.H, org.telegram.messenger.g0.L(47.0f) + i3);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint5);
                                if (this.x) {
                                    rectF.set(getMeasuredWidth() - org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(20.0f) + i3, getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(28.0f) + i3);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint5);
                                }
                                i3 = org.telegram.ui.Cells.f1.j(this, i3);
                                int i49 = i11 + 1;
                                if (this.E && i49 >= this.L) {
                                    break;
                                } else {
                                    i11 = i49;
                                }
                            }
                        } else if (getViewType() == 31) {
                            while (i3 <= getMeasuredHeight()) {
                                int c11 = c(getMeasuredWidth());
                                float f21 = i3;
                                rectF.set(org.telegram.messenger.g0.L(18.0f) + this.H, ((c11 - org.telegram.messenger.g0.L(22.0f)) / 2.0f) + f21, org.telegram.messenger.g0.L(40.0f) + this.H, ((org.telegram.messenger.g0.L(22.0f) + c11) / 2.0f) + f21);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), paint5);
                                rectF.set(org.telegram.messenger.g0.L(58.0f) + this.H, ((c11 - org.telegram.messenger.g0.L(8.0f)) / 2.0f) + f21, org.telegram.messenger.camera.q.C(19.0f, getMeasuredWidth(), org.telegram.messenger.g0.L(132.0f) + this.H), ((org.telegram.messenger.g0.L(8.0f) + c11) / 2.0f) + f21);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint5);
                                i3 += c11;
                                int i50 = i11 + 1;
                                if (this.E && i50 >= this.L) {
                                    break;
                                } else {
                                    i11 = i50;
                                }
                            }
                        } else if (getViewType() == 32) {
                            while (i3 <= getMeasuredHeight()) {
                                int c12 = c(getMeasuredWidth());
                                float f22 = i3;
                                rectF.set(org.telegram.messenger.g0.L(10.0f) + this.H, ((c12 - org.telegram.messenger.g0.L(32.0f)) / 2.0f) + f22, org.telegram.messenger.g0.L(42.0f) + this.H, ((org.telegram.messenger.g0.L(32.0f) + c12) / 2.0f) + f22);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint5);
                                rectF.set(org.telegram.messenger.g0.L(64.0f) + this.H, (((c12 - org.telegram.messenger.g0.L(14.0f)) - org.telegram.messenger.g0.L(10.0f)) / 2.0f) + f22, org.telegram.messenger.camera.q.C(19.0f, getMeasuredWidth(), org.telegram.messenger.g0.L(118.0f) + this.H), ((org.telegram.messenger.g0.L(10.0f) + (c12 - org.telegram.messenger.g0.L(14.0f))) / 2.0f) + f22);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint5);
                                rectF.set(org.telegram.messenger.g0.L(64.0f) + this.H, (((org.telegram.messenger.g0.L(14.0f) + c12) - org.telegram.messenger.g0.L(8.0f)) / 2.0f) + f22, org.telegram.messenger.camera.q.C(19.0f, getMeasuredWidth(), org.telegram.messenger.g0.L(144.0f) + this.H), ((org.telegram.messenger.g0.L(8.0f) + (org.telegram.messenger.g0.L(14.0f) + c12)) / 2.0f) + f22);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint5);
                                i3 += c12;
                                int i51 = i11 + 1;
                                if (this.E && i51 >= this.L) {
                                    break;
                                } else {
                                    i11 = i51;
                                }
                            }
                        } else if (getViewType() == 34 || getViewType() == 35 || getViewType() == 36) {
                            rectF.set(this.H, this.G, getMeasuredWidth() - this.H, getMeasuredHeight() - this.G);
                            rectF.inset(org.telegram.messenger.g0.L(3.33f), org.telegram.messenger.g0.L(4.0f));
                            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), paint5);
                        }
                    }
                }
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public void onMeasure(int i3, int i10) {
        if (!this.E) {
            super.onMeasure(i3, i10);
            return;
        }
        int i11 = this.L;
        if (i11 > 1 && this.T) {
            super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(getAdditionalHeight() + (c(View.MeasureSpec.getSize(i3)) * this.L), TLObject.FLAG_30));
        } else if (i11 <= 1 || View.MeasureSpec.getSize(i10) <= 0) {
            super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(getAdditionalHeight() + c(View.MeasureSpec.getSize(i3)), TLObject.FLAG_30));
        } else {
            super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(getAdditionalHeight() + Math.min(View.MeasureSpec.getSize(i10), c(View.MeasureSpec.getSize(i3)) * this.L), TLObject.FLAG_30));
        }
    }

    public void setGlobalGradientView(iz izVar) {
        this.S = izVar;
    }

    public void setIgnoreHeightCheck(boolean z10) {
        this.T = z10;
    }

    public void setIsSingleCell(boolean z10) {
        this.E = z10;
    }

    public void setItemsCount(int i3) {
        this.L = i3;
    }

    public void setMemberRequestButton(boolean z10) {
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        this.U = textPaint.measureText(org.telegram.messenger.bd.M0(z10 ? 2131754378 : 2131754373, null)) + org.telegram.messenger.g0.L(34.0f);
    }

    public void setPaddingLeft(int i3) {
        this.H = i3;
        invalidate();
    }

    public void setPaddingTop(int i3) {
        this.G = i3;
        invalidate();
    }

    public void setUseHeaderOffset(boolean z10) {
        this.y = z10;
    }

    public void setViewType(int i3) {
        this.F = i3;
        if (i3 == 11) {
            Random random = new Random();
            this.N = new float[2];
            for (int i10 = 0; i10 < 2; i10++) {
                this.N[i10] = Math.abs(random.nextInt() % 1000) / 1000.0f;
            }
        }
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        int i3;
        iz izVar = this.S;
        if (izVar != null) {
            izVar.updateColors();
            return;
        }
        int i10 = this.I;
        org.telegram.ui.ActionBar.e6 e6Var = this.M;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, e6Var);
        int w03 = org.telegram.ui.ActionBar.k6.w0(this.J, e6Var);
        if (this.s == w03 && this.r == w02) {
            return;
        }
        this.r = w02;
        this.s = w03;
        int i11 = this.F;
        if (i11 == 34 || i11 == 35 || i11 == 36) {
            this.a = org.telegram.messenger.g0.q.x;
        } else if (this.E || i11 == 13 || i11 == 14 || i11 == 17) {
            this.a = org.telegram.messenger.g0.L(200.0f);
        } else {
            this.a = org.telegram.messenger.g0.L(600.0f);
        }
        if (this.E || (i3 = this.F) == 13 || i3 == 14 || i3 == 17) {
            this.b = new LinearGradient(0.0f, 0.0f, this.a, 0.0f, new int[]{w03, w02, w02, w03}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        } else {
            this.b = new LinearGradient(0.0f, 0.0f, 0.0f, this.a, new int[]{w03, w02, w02, w03}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
        this.c.setShader(this.b);
    }

    public iz(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.c = new Paint();
        this.d = new Paint();
        this.n = new RectF();
        this.x = true;
        this.I = org.telegram.ui.ActionBar.k6.G8;
        this.J = org.telegram.ui.ActionBar.k6.i6;
        this.K = -1;
        this.L = 1;
        this.M = e6Var;
        this.h = new Matrix();
    }
}
