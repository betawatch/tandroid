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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class zz extends View implements org.telegram.ui.ActionBar.k6 {
    public boolean D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public final org.telegram.ui.ActionBar.p6 L;
    public float[] M;
    public Paint N;
    public int O;
    public int P;
    public float Q;
    public zz R;
    public boolean S;
    public float T;
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

    public zz(Context context) {
        this(context, null);
    }

    public final float a(float f7) {
        return org.telegram.messenger.cd.X ? getMeasuredWidth() - f7 : f7;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(this.H));
        hashSet.add(Integer.valueOf(this.I));
    }

    public final void b(RectF rectF) {
        if (org.telegram.messenger.cd.X) {
            rectF.left = getMeasuredWidth() - rectF.left;
            rectF.right = getMeasuredWidth() - rectF.right;
        }
    }

    public final int c(int i10) {
        switch (getViewType()) {
            case 1:
                return org.telegram.messenger.i0.L(78.0f) + 1;
            case 2:
                return org.telegram.messenger.i0.L(2.0f) + ((i10 - ((getColumnsCount() - 1) * org.telegram.messenger.i0.L(2.0f))) / getColumnsCount());
            case 3:
            case 4:
                return org.telegram.messenger.i0.L(56.0f);
            case 5:
                return org.telegram.messenger.i0.L(80.0f);
            case 6:
            case 18:
                return org.telegram.messenger.i0.L(64.0f);
            case 7:
                return org.telegram.messenger.i0.L((org.telegram.messenger.tz.p1 ? 78 : 72) + 1);
            case 8:
                return org.telegram.messenger.i0.L(61.0f);
            case 9:
                return org.telegram.messenger.i0.L(66.0f);
            case 10:
                return org.telegram.messenger.i0.L(58.0f);
            case 11:
                return org.telegram.messenger.i0.L(36.0f);
            case 12:
                return org.telegram.messenger.i0.L(103.0f);
            case 13:
            case 14:
            case 17:
            case 20:
            case 27:
            default:
                return 0;
            case 15:
                return org.telegram.messenger.i0.L(107.0f);
            case 16:
            case 23:
                return org.telegram.messenger.i0.L(50.0f);
            case 19:
                return org.telegram.messenger.i0.L(58.0f);
            case 21:
                return org.telegram.messenger.i0.L(58.0f);
            case 22:
                return org.telegram.messenger.i0.L(60.0f);
            case 24:
                return org.telegram.messenger.i0.L((org.telegram.messenger.tz.p1 ? 76 : 64) + 1);
            case 25:
                return org.telegram.messenger.i0.L(51.0f);
            case 26:
                return org.telegram.messenger.i0.L(50.0f) + 1;
            case 28:
                return org.telegram.messenger.i0.L(58.0f);
            case 29:
                return org.telegram.messenger.i0.L(60.0f) + 1;
            case org.telegram.messenger.zs.T /* 30 */:
                return org.telegram.messenger.i0.L(32.0f);
            case org.telegram.messenger.zs.U /* 31 */:
                return org.telegram.messenger.i0.L(48.0f) + 1;
            case 32:
                return org.telegram.messenger.i0.L(56.0f) + 1;
            case 33:
                return org.telegram.messenger.i0.L(58.0f);
            case 34:
                return org.telegram.messenger.i0.L(140.0f);
            case 35:
                return org.telegram.messenger.i0.L(112.0f);
            case 36:
                return org.telegram.messenger.i0.L(108.0f);
            case 37:
                return org.telegram.messenger.i0.L(73.0f);
            case 38:
                return org.telegram.messenger.i0.L(58.0f);
        }
    }

    public final int d(int i10) {
        return org.telegram.ui.ActionBar.t6.w0(i10, this.L);
    }

    public final void e(int i10, int i11, int i12) {
        this.H = i10;
        this.I = i11;
        this.J = i12;
        invalidate();
    }

    public final void f() {
        zz zzVar = this.R;
        if (zzVar != null) {
            zzVar.f();
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
        int i10 = this.O;
        if (i10 == 0) {
            i10 = getMeasuredWidth();
        }
        int i11 = this.E;
        if (i11 == 34 || i11 == 35 || i11 == 36) {
            i10 = Math.max(i10, org.telegram.messenger.i0.q.x);
        }
        int i12 = this.P;
        if (i12 == 0) {
            i12 = getMeasuredHeight();
        }
        this.e = elapsedRealtime;
        boolean z10 = this.D;
        Matrix matrix = this.h;
        if (z10 || this.E == 13 || getViewType() == 14 || getViewType() == 17) {
            int i13 = (int) (((abs * i10) / 400.0f) + this.f);
            this.f = i13;
            if (i13 >= i10 * 2) {
                this.f = (-this.a) * 2;
            }
            matrix.setTranslate(this.f + this.Q, 0.0f);
        } else {
            int i14 = (int) (((abs * i12) / 400.0f) + this.f);
            this.f = i14;
            if (i14 >= i12 * 2) {
                this.f = (-this.a) * 2;
            }
            matrix.setTranslate(this.Q, this.f);
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
        return this.E;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Paint paint;
        Canvas canvas2;
        Paint paint2;
        float f7;
        if (this.R != null) {
            if (getParent() != null) {
                View view = (View) getParent();
                zz zzVar = this.R;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                float f10 = -getX();
                zzVar.O = measuredWidth;
                zzVar.P = measuredHeight;
                zzVar.Q = f10;
            }
            paint = this.R.c;
        } else {
            paint = this.c;
        }
        Paint paint3 = paint;
        if (getViewType() == 34 || getViewType() == 35 || getViewType() == 36) {
            this.Q = -getX();
        }
        updateColors();
        f();
        int i10 = this.F;
        if (this.y) {
            int L = org.telegram.messenger.i0.L(32.0f) + i10;
            int i11 = this.J;
            if (i11 >= 0) {
                this.d.setColor(d(i11));
            }
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), org.telegram.messenger.i0.L(32.0f), this.J >= 0 ? this.d : paint3);
            canvas2 = canvas;
            i10 = L;
        } else {
            canvas2 = canvas;
        }
        int viewType = getViewType();
        int i12 = 0;
        int i13 = 1;
        RectF rectF = this.n;
        if (viewType == 7) {
            while (i10 <= getMeasuredHeight()) {
                int c10 = c(getMeasuredWidth());
                canvas2.drawCircle(a(org.telegram.messenger.i0.L(10.0f) + r4), (c10 >> 1) + i10, org.telegram.messenger.i0.L(28.0f), paint3);
                rectF.set(org.telegram.messenger.i0.L(76.0f), org.telegram.messenger.i0.L(16.0f) + i10, org.telegram.messenger.i0.L(148.0f), org.telegram.messenger.i0.L(24.0f) + i10);
                b(rectF);
                canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint3);
                rectF.set(org.telegram.messenger.i0.L(76.0f), org.telegram.messenger.i0.L(38.0f) + i10, org.telegram.messenger.i0.L(268.0f), org.telegram.messenger.i0.L(46.0f) + i10);
                b(rectF);
                canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint3);
                if (org.telegram.messenger.tz.p1) {
                    rectF.set(org.telegram.messenger.i0.L(76.0f), org.telegram.messenger.i0.L(54.0f) + i10, org.telegram.messenger.i0.L(220.0f), org.telegram.messenger.i0.L(62.0f) + i10);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint3);
                }
                if (this.x) {
                    rectF.set(getMeasuredWidth() - org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(16.0f) + i10, getMeasuredWidth() - org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(24.0f) + i10);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint3);
                }
                i10 = org.telegram.ui.Cells.f1.h(this, i10);
                int i14 = i12 + 1;
                if (this.D && i14 >= this.K) {
                    break;
                } else {
                    i12 = i14;
                }
            }
        } else if (getViewType() == 24) {
            while (i10 <= getMeasuredHeight()) {
                canvas2.drawCircle(a(org.telegram.messenger.i0.L(10.0f) + r3), org.telegram.messenger.m5.C(10.0f, i10, r3), org.telegram.messenger.i0.L(14.0f), paint3);
                canvas2.save();
                canvas2.translate(0.0f, -org.telegram.messenger.i0.L(4.0f));
                rectF.set(org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(16.0f) + i10, org.telegram.messenger.i0.L(148.0f), org.telegram.messenger.i0.L(24.0f) + i10);
                b(rectF);
                canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint3);
                rectF.set(org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(38.0f) + i10, org.telegram.messenger.i0.L(268.0f), org.telegram.messenger.i0.L(46.0f) + i10);
                b(rectF);
                canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint3);
                if (org.telegram.messenger.tz.p1) {
                    rectF.set(org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(54.0f) + i10, org.telegram.messenger.i0.L(220.0f), org.telegram.messenger.i0.L(62.0f) + i10);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint3);
                }
                if (this.x) {
                    rectF.set(getMeasuredWidth() - org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(16.0f) + i10, getMeasuredWidth() - org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(24.0f) + i10);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint3);
                }
                canvas2.restore();
                i10 += c(getMeasuredWidth());
                int i15 = i12 + 1;
                if (this.D && i15 >= this.K) {
                    break;
                } else {
                    i12 = i15;
                }
            }
        } else if (getViewType() == 18) {
            int i16 = i10;
            while (i16 <= getMeasuredHeight()) {
                canvas2.drawCircle(a(org.telegram.messenger.m5.C(9.0f, this.G, r1)), org.telegram.messenger.i0.L(32.0f) + i16, org.telegram.messenger.i0.L(25.0f), paint3);
                int i17 = i12 % 2 == 0 ? 52 : 72;
                float f11 = 76;
                rectF.set(org.telegram.messenger.i0.L(f11), org.telegram.messenger.i0.L(20.0f) + i16, org.telegram.messenger.i0.L(i17 + 76), org.telegram.messenger.i0.L(28.0f) + i16);
                b(rectF);
                canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint3);
                rectF.set(org.telegram.messenger.i0.L(i17 + 84), org.telegram.messenger.i0.L(20.0f) + i16, org.telegram.messenger.i0.L(i17 + org.telegram.messenger.zs.y2), org.telegram.messenger.i0.L(28.0f) + i16);
                b(rectF);
                canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint3);
                rectF.set(org.telegram.messenger.i0.L(f11), org.telegram.messenger.i0.L(42.0f) + i16, org.telegram.messenger.i0.L(org.telegram.messenger.zs.W1), org.telegram.messenger.i0.L(50.0f) + i16);
                b(rectF);
                canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint3);
                Canvas canvas3 = canvas2;
                Paint paint4 = paint3;
                canvas3.drawLine(org.telegram.messenger.i0.L(f11), org.telegram.ui.Cells.f1.h(this, i16), getMeasuredWidth(), org.telegram.ui.Cells.f1.h(this, i16), paint4);
                canvas2 = canvas3;
                i16 = org.telegram.ui.Cells.f1.h(this, i16);
                int i18 = i12 + 1;
                if (this.D && i18 >= this.K) {
                    break;
                }
                i12 = i18;
                paint3 = paint4;
            }
        } else {
            Paint paint5 = paint3;
            float f12 = 6.0f;
            if (getViewType() == 37 || getViewType() == 38) {
                boolean z10 = getViewType() == 37;
                int c11 = c(getMeasuredWidth());
                while (i10 <= getMeasuredHeight()) {
                    if (z10) {
                        canvas2.drawCircle(org.telegram.messenger.i0.L(36.0f) + this.G, org.telegram.messenger.i0.L(35.0f) + i10, org.telegram.messenger.i0.L(23.0f), paint5);
                    } else {
                        rectF.set(org.telegram.messenger.i0.L(15.0f) + this.G, org.telegram.messenger.i0.L(6.0f) + i10, org.telegram.messenger.i0.L(61.0f) + this.G, org.telegram.messenger.i0.L(52.0f) + i10);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), paint5);
                    }
                    float L2 = org.telegram.messenger.i0.L(71.0f) + this.G;
                    float max = Math.max(L2, getMeasuredWidth() - org.telegram.messenger.i0.L(z10 ? 76.0f : 20.0f));
                    rectF.set(L2, org.telegram.messenger.i0.L(14.0f) + i10, Math.min(org.telegram.messenger.i0.L(100.0f) + L2, max), org.telegram.messenger.i0.L(22.0f) + i10);
                    canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint5);
                    rectF.set(L2, org.telegram.messenger.i0.L(z10 ? 33.0f : 36.0f) + i10, Math.min(org.telegram.messenger.i0.L(140.0f) + L2, max), org.telegram.messenger.i0.L(z10 ? 41.0f : 44.0f) + i10);
                    canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint5);
                    if (z10) {
                        rectF.set(L2, org.telegram.messenger.i0.L(51.0f) + i10, Math.min(org.telegram.messenger.i0.L(80.0f) + L2, max), org.telegram.messenger.i0.L(59.0f) + i10);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint5);
                        if (getMeasuredWidth() - org.telegram.messenger.i0.L(68.0f) >= L2) {
                            rectF.set(getMeasuredWidth() - org.telegram.messenger.i0.L(68.0f), org.telegram.messenger.i0.L(15.0f) + i10, getMeasuredWidth() - org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(23.0f) + i10);
                            canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint5);
                        }
                    }
                    i10 += c11;
                    int i19 = i12 + 1;
                    if (this.D && i19 >= this.K) {
                        break;
                    } else {
                        i12 = i19;
                    }
                }
            } else if (getViewType() == 19) {
                int i20 = i10;
                while (i20 <= getMeasuredHeight()) {
                    canvas2.drawCircle(a(org.telegram.messenger.m5.C(9.0f, this.G, r1)), org.telegram.messenger.i0.L(29.0f) + i20, org.telegram.messenger.i0.L(20.0f), paint5);
                    float f13 = 76;
                    rectF.set(org.telegram.messenger.i0.L(f13), org.telegram.messenger.i0.L(16.0f) + i20, org.telegram.messenger.i0.L((i12 % 2 == 0 ? 92 : 128) + 76), org.telegram.messenger.i0.L(24.0f) + i20);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint5);
                    rectF.set(org.telegram.messenger.i0.L(f13), org.telegram.messenger.i0.L(38.0f) + i20, org.telegram.messenger.i0.L(org.telegram.messenger.zs.P3), org.telegram.messenger.i0.L(46.0f) + i20);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint5);
                    Canvas canvas4 = canvas2;
                    Paint paint6 = paint5;
                    canvas4.drawLine(org.telegram.messenger.i0.L(f13), org.telegram.ui.Cells.f1.h(this, i20), getMeasuredWidth(), org.telegram.ui.Cells.f1.h(this, i20), paint6);
                    canvas2 = canvas4;
                    paint5 = paint6;
                    i20 = org.telegram.ui.Cells.f1.h(this, i20);
                    int i21 = i12 + 1;
                    if (this.D && i21 >= this.K) {
                        break;
                    } else {
                        i12 = i21;
                    }
                }
            } else if (getViewType() == 1) {
                while (i10 <= getMeasuredHeight()) {
                    canvas2.drawCircle(a(org.telegram.messenger.i0.L(9.0f) + r4), (org.telegram.messenger.i0.L(78.0f) >> 1) + i10, org.telegram.messenger.i0.L(25.0f), paint5);
                    rectF.set(org.telegram.messenger.i0.L(68.0f), org.telegram.messenger.i0.L(20.0f) + i10, org.telegram.messenger.i0.L(140.0f), org.telegram.messenger.i0.L(28.0f) + i10);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint5);
                    rectF.set(org.telegram.messenger.i0.L(68.0f), org.telegram.messenger.i0.L(42.0f) + i10, org.telegram.messenger.i0.L(260.0f), org.telegram.messenger.i0.L(50.0f) + i10);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint5);
                    if (this.x) {
                        rectF.set(getMeasuredWidth() - org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(20.0f) + i10, getMeasuredWidth() - org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(28.0f) + i10);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint5);
                    }
                    i10 = org.telegram.ui.Cells.f1.h(this, i10);
                    int i22 = i12 + 1;
                    if (this.D && i22 >= this.K) {
                        break;
                    } else {
                        i12 = i22;
                    }
                }
            } else if (getViewType() == 2 || getViewType() == 27) {
                int i23 = 2;
                int measuredWidth2 = (getMeasuredWidth() - ((getColumnsCount() - 1) * org.telegram.messenger.i0.L(2.0f))) / getColumnsCount();
                int i24 = getViewType() == 27 ? (int) (measuredWidth2 * 1.25f) : measuredWidth2;
                int i25 = i10;
                int i26 = 0;
                while (true) {
                    if (i25 >= getMeasuredHeight() && !this.D) {
                        break;
                    }
                    int i27 = 0;
                    while (i27 < getColumnsCount()) {
                        if (i26 != 0 || i27 >= this.w) {
                            paint2 = paint5;
                            canvas.drawRect((org.telegram.messenger.i0.L(2.0f) + measuredWidth2) * i27, i25, r1 + measuredWidth2, i25 + i24, paint2);
                        } else {
                            paint2 = paint5;
                        }
                        i27++;
                        paint5 = paint2;
                    }
                    Paint paint7 = paint5;
                    i25 = org.telegram.messenger.m5.C(2.0f, i24, i25);
                    i26++;
                    int i28 = i23;
                    if (this.D && i26 >= i28) {
                        break;
                    }
                    i23 = i28;
                    paint5 = paint7;
                }
            } else if (getViewType() == 3) {
                while (i10 <= getMeasuredHeight()) {
                    rectF.set(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(8.0f) + i10, org.telegram.messenger.i0.L(52.0f), org.telegram.messenger.i0.L(48.0f) + i10);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint5);
                    rectF.set(org.telegram.messenger.i0.L(68.0f), org.telegram.messenger.i0.L(12.0f) + i10, org.telegram.messenger.i0.L(140.0f), org.telegram.messenger.i0.L(20.0f) + i10);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint5);
                    rectF.set(org.telegram.messenger.i0.L(68.0f), org.telegram.messenger.i0.L(34.0f) + i10, org.telegram.messenger.i0.L(260.0f), org.telegram.messenger.i0.L(42.0f) + i10);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint5);
                    if (this.x) {
                        rectF.set(getMeasuredWidth() - org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(12.0f) + i10, getMeasuredWidth() - org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(20.0f) + i10);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint5);
                    }
                    i10 = org.telegram.ui.Cells.f1.h(this, i10);
                    int i29 = i12 + 1;
                    if (this.D && i29 >= this.K) {
                        break;
                    } else {
                        i12 = i29;
                    }
                }
            } else if (getViewType() == 4) {
                while (i10 <= getMeasuredHeight()) {
                    canvas2.drawCircle(a(org.telegram.messenger.i0.L(12.0f) + r4), org.telegram.messenger.m5.C(6.0f, i10, r4), org.telegram.messenger.i0.L(44.0f) >> 1, paint5);
                    rectF.set(org.telegram.messenger.i0.L(68.0f), org.telegram.messenger.i0.L(12.0f) + i10, org.telegram.messenger.i0.L(140.0f), org.telegram.messenger.i0.L(20.0f) + i10);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint5);
                    rectF.set(org.telegram.messenger.i0.L(68.0f), org.telegram.messenger.i0.L(34.0f) + i10, org.telegram.messenger.i0.L(260.0f), org.telegram.messenger.i0.L(42.0f) + i10);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint5);
                    if (this.x) {
                        rectF.set(getMeasuredWidth() - org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(12.0f) + i10, getMeasuredWidth() - org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(20.0f) + i10);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint5);
                    }
                    i10 = org.telegram.ui.Cells.f1.h(this, i10);
                    int i30 = i12 + 1;
                    if (this.D && i30 >= this.K) {
                        break;
                    } else {
                        i12 = i30;
                    }
                }
            } else {
                float f14 = 2.0f;
                if (getViewType() == 5) {
                    while (i10 <= getMeasuredHeight()) {
                        rectF.set(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(11.0f) + i10, org.telegram.messenger.i0.L(62.0f), org.telegram.messenger.i0.L(63.0f) + i10);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint5);
                        rectF.set(org.telegram.messenger.i0.L(68.0f), org.telegram.messenger.i0.L(12.0f) + i10, org.telegram.messenger.i0.L(140.0f), org.telegram.messenger.i0.L(20.0f) + i10);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint5);
                        rectF.set(org.telegram.messenger.i0.L(68.0f), org.telegram.messenger.i0.L(34.0f) + i10, org.telegram.messenger.i0.L(268.0f), org.telegram.messenger.i0.L(42.0f) + i10);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint5);
                        rectF.set(org.telegram.messenger.i0.L(68.0f), org.telegram.messenger.i0.L(54.0f) + i10, org.telegram.messenger.i0.L(188.0f), org.telegram.messenger.i0.L(62.0f) + i10);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint5);
                        if (this.x) {
                            rectF.set(getMeasuredWidth() - org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(12.0f) + i10, getMeasuredWidth() - org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(20.0f) + i10);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint5);
                        }
                        i10 = org.telegram.ui.Cells.f1.h(this, i10);
                        int i31 = i12 + 1;
                        if (this.D && i31 >= this.K) {
                            break;
                        } else {
                            i12 = i31;
                        }
                    }
                } else if (getViewType() == 6 || getViewType() == 10) {
                    while (i10 <= getMeasuredHeight()) {
                        canvas2.drawCircle(a(org.telegram.messenger.m5.C(9.0f, this.G, r4)), (org.telegram.messenger.i0.L(64.0f) >> 1) + i10, org.telegram.messenger.i0.L(23.0f), paint5);
                        rectF.set(org.telegram.messenger.i0.L(68.0f) + this.G, org.telegram.messenger.i0.L(17.0f) + i10, org.telegram.messenger.i0.L(260.0f) + this.G, org.telegram.messenger.i0.L(25.0f) + i10);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint5);
                        rectF.set(org.telegram.messenger.i0.L(68.0f) + this.G, org.telegram.messenger.i0.L(39.0f) + i10, org.telegram.messenger.i0.L(140.0f) + this.G, org.telegram.messenger.i0.L(47.0f) + i10);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint5);
                        if (this.x) {
                            rectF.set(getMeasuredWidth() - org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(20.0f) + i10, getMeasuredWidth() - org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(28.0f) + i10);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint5);
                        }
                        i10 = org.telegram.ui.Cells.f1.h(this, i10);
                        int i32 = i12 + 1;
                        if (this.D && i32 >= this.K) {
                            break;
                        } else {
                            i12 = i32;
                        }
                    }
                } else if (getViewType() == 29) {
                    while (i10 <= getMeasuredHeight()) {
                        canvas2.drawCircle(a(org.telegram.messenger.m5.C(9.0f, this.G, r4)), (org.telegram.messenger.i0.L(64.0f) >> 1) + i10, org.telegram.messenger.i0.L(23.0f), paint5);
                        rectF.set(org.telegram.messenger.i0.L(68.0f) + this.G, org.telegram.messenger.i0.L(17.0f) + i10, org.telegram.messenger.i0.L(260.0f) + this.G, org.telegram.messenger.i0.L(25.0f) + i10);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint5);
                        rectF.set(org.telegram.messenger.i0.L(68.0f) + this.G, org.telegram.messenger.i0.L(39.0f) + i10, org.telegram.messenger.i0.L(140.0f) + this.G, org.telegram.messenger.i0.L(47.0f) + i10);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint5);
                        i10 = org.telegram.ui.Cells.f1.h(this, i10);
                        int i33 = i12 + 1;
                        if (this.D && i33 >= this.K) {
                            break;
                        } else {
                            i12 = i33;
                        }
                    }
                } else if (getViewType() == 33) {
                    while (i10 <= getMeasuredHeight()) {
                        canvas2.drawCircle(a(org.telegram.messenger.m5.C(13.0f, this.G, r4)), (org.telegram.messenger.i0.L(58.0f) >> 1) + i10, org.telegram.messenger.i0.L(23.0f), paint5);
                        rectF.set(org.telegram.messenger.i0.L(72.0f) + this.G, org.telegram.messenger.i0.L(17.0f) + i10, org.telegram.messenger.i0.L(260.0f) + this.G, org.telegram.messenger.i0.L(25.0f) + i10);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint5);
                        rectF.set(org.telegram.messenger.i0.L(72.0f) + this.G, org.telegram.messenger.i0.L(39.0f) + i10, org.telegram.messenger.i0.L(140.0f) + this.G, org.telegram.messenger.i0.L(47.0f) + i10);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint5);
                        i10 = org.telegram.ui.Cells.f1.h(this, i10);
                        int i34 = i12 + 1;
                        if (this.D && i34 >= this.K) {
                            break;
                        } else {
                            i12 = i34;
                        }
                    }
                } else if (getViewType() == 30) {
                    while (i10 <= getMeasuredHeight()) {
                        i10 += c(getMeasuredWidth());
                        rectF.set(0.0f, i10, getMeasuredWidth(), i10);
                        b(rectF);
                        canvas2.drawRect(rectF, paint5);
                        int i35 = i12 + 1;
                        if (this.D && i35 >= this.K) {
                            break;
                        } else {
                            i12 = i35;
                        }
                    }
                } else if (getViewType() == 8) {
                    while (i10 <= getMeasuredHeight()) {
                        canvas2.drawCircle(a(org.telegram.messenger.m5.C(11.0f, this.G, r4)), (org.telegram.messenger.i0.L(64.0f) >> 1) + i10, org.telegram.messenger.i0.L(23.0f), paint5);
                        rectF.set(org.telegram.messenger.i0.L(68.0f) + this.G, org.telegram.messenger.i0.L(17.0f) + i10, org.telegram.messenger.i0.L(140.0f) + this.G, org.telegram.messenger.i0.L(25.0f) + i10);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint5);
                        rectF.set(org.telegram.messenger.i0.L(68.0f) + this.G, org.telegram.messenger.i0.L(39.0f) + i10, org.telegram.messenger.i0.L(260.0f) + this.G, org.telegram.messenger.i0.L(47.0f) + i10);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint5);
                        if (this.x) {
                            rectF.set(getMeasuredWidth() - org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(20.0f) + i10, getMeasuredWidth() - org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(28.0f) + i10);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint5);
                        }
                        i10 = org.telegram.ui.Cells.f1.h(this, i10);
                        int i36 = i12 + 1;
                        if (this.D && i36 >= this.K) {
                            break;
                        } else {
                            i12 = i36;
                        }
                    }
                } else if (getViewType() == 9) {
                    while (i10 <= getMeasuredHeight()) {
                        canvas2.drawCircle(a(org.telegram.messenger.i0.L(35.0f)), (c(getMeasuredWidth()) >> 1) + i10, org.telegram.messenger.i0.L(32.0f) / 2, paint5);
                        rectF.set(org.telegram.messenger.i0.L(72.0f), org.telegram.messenger.i0.L(16.0f) + i10, org.telegram.messenger.i0.L(268.0f), org.telegram.messenger.i0.L(24.0f) + i10);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint5);
                        rectF.set(org.telegram.messenger.i0.L(72.0f), org.telegram.messenger.i0.L(38.0f) + i10, org.telegram.messenger.i0.L(140.0f), org.telegram.messenger.i0.L(46.0f) + i10);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint5);
                        if (this.x) {
                            rectF.set(getMeasuredWidth() - org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(16.0f) + i10, getMeasuredWidth() - org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(24.0f) + i10);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint5);
                        }
                        i10 = org.telegram.ui.Cells.f1.h(this, i10);
                        int i37 = i12 + 1;
                        if (this.D && i37 >= this.K) {
                            break;
                        } else {
                            i12 = i37;
                        }
                    }
                } else if (getViewType() == 11) {
                    int i38 = 0;
                    while (i10 <= getMeasuredHeight()) {
                        rectF.set(org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(14.0f), (getMeasuredWidth() * 0.5f) + org.telegram.messenger.i0.L(this.M[0] * 40.0f), org.telegram.messenger.i0.L(8.0f) + org.telegram.messenger.i0.L(14.0f));
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint5);
                        rectF.set(getMeasuredWidth() - org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(14.0f), (getMeasuredWidth() - (getMeasuredWidth() * 0.2f)) - org.telegram.messenger.i0.L(this.M[0] * 20.0f), org.telegram.messenger.i0.L(8.0f) + org.telegram.messenger.i0.L(14.0f));
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint5);
                        i10 = org.telegram.ui.Cells.f1.h(this, i10);
                        i38++;
                        if (this.D && i38 >= this.K) {
                            break;
                        }
                    }
                } else if (getViewType() == 12) {
                    int L3 = org.telegram.messenger.i0.L(14.0f) + i10;
                    while (L3 <= getMeasuredHeight()) {
                        int measuredWidth3 = getMeasuredWidth() / 4;
                        for (int i39 = 0; i39 < 4; i39++) {
                            float f15 = (measuredWidth3 / 2.0f) + (measuredWidth3 * i39);
                            canvas2.drawCircle(f15, (org.telegram.messenger.i0.L(56.0f) / 2.0f) + org.telegram.messenger.i0.L(7.0f) + L3, org.telegram.messenger.i0.L(28.0f), paint5);
                            float L4 = org.telegram.messenger.i0.L(16.0f) + org.telegram.messenger.i0.L(56.0f) + org.telegram.messenger.i0.L(7.0f) + L3;
                            RectF rectF2 = org.telegram.messenger.i0.P;
                            rectF2.set(f15 - org.telegram.messenger.i0.L(24.0f), L4 - org.telegram.messenger.i0.L(4.0f), f15 + org.telegram.messenger.i0.L(24.0f), L4 + org.telegram.messenger.i0.L(4.0f));
                            canvas2.drawRoundRect(rectF2, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint5);
                        }
                        L3 = org.telegram.ui.Cells.f1.h(this, L3);
                        if (this.D) {
                            break;
                        }
                    }
                } else if (getViewType() == 13) {
                    float measuredHeight2 = getMeasuredHeight() / 2.0f;
                    RectF rectF3 = org.telegram.messenger.i0.P;
                    rectF3.set(org.telegram.messenger.i0.L(40.0f), measuredHeight2 - org.telegram.messenger.i0.L(4.0f), getMeasuredWidth() - org.telegram.messenger.i0.L(120.0f), org.telegram.messenger.i0.L(4.0f) + measuredHeight2);
                    canvas2.drawRoundRect(rectF3, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint5);
                    if (this.N == null) {
                        Paint paint8 = new Paint(1);
                        this.N = paint8;
                        paint8.setColor(org.telegram.ui.ActionBar.t6.v0(org.telegram.ui.ActionBar.t6.G8));
                    }
                    for (int i40 = 0; i40 < 3; i40++) {
                        canvas2.drawCircle(org.telegram.messenger.m5.D(12.0f, i40, org.telegram.messenger.i0.L(13.0f) + (getMeasuredWidth() - org.telegram.messenger.i0.L(56.0f))), measuredHeight2, org.telegram.messenger.i0.L(13.0f), this.N);
                        canvas2.drawCircle(org.telegram.messenger.m5.D(12.0f, i40, org.telegram.messenger.i0.L(13.0f) + (getMeasuredWidth() - org.telegram.messenger.i0.L(56.0f))), measuredHeight2, org.telegram.messenger.i0.L(12.0f), paint5);
                    }
                } else {
                    float f16 = 21.0f;
                    if (getViewType() == 14 || getViewType() == 17) {
                        int L5 = org.telegram.messenger.i0.L(12.0f);
                        int L6 = org.telegram.messenger.i0.L(77.0f);
                        int L7 = org.telegram.messenger.i0.L(4.0f);
                        float L8 = org.telegram.messenger.i0.L(21.0f);
                        float L9 = org.telegram.messenger.i0.L(41.0f);
                        while (L5 < getMeasuredWidth()) {
                            if (this.N == null) {
                                this.N = new Paint(i13);
                            }
                            this.N.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, this.L));
                            RectF rectF4 = org.telegram.messenger.i0.P;
                            int i41 = L5 + L6;
                            int i42 = i13;
                            float f17 = f12;
                            rectF4.set(org.telegram.messenger.i0.L(4.0f) + L5, org.telegram.messenger.i0.L(4.0f), i41 - org.telegram.messenger.i0.L(4.0f), getMeasuredHeight() - org.telegram.messenger.i0.L(4.0f));
                            canvas2.drawRoundRect(rectF4, org.telegram.messenger.i0.L(f17), org.telegram.messenger.i0.L(f17), paint5);
                            if (getViewType() == 14) {
                                float L10 = org.telegram.messenger.i0.L(8.0f) + L7;
                                float f18 = L5;
                                float L11 = org.telegram.messenger.i0.L(22.0f) + L7 + f18;
                                rectF.set(L11, L10, L11 + L9, L10 + L8);
                                canvas2.drawRoundRect(rectF, rectF.height() * 0.5f, rectF.height() * 0.5f, this.N);
                                float L12 = org.telegram.messenger.i0.L(4.0f) + L8 + L10;
                                float L13 = f18 + org.telegram.messenger.i0.L(5.0f) + L7;
                                rectF.set(L13, L12, L13 + L9, L12 + L8);
                                canvas2.drawRoundRect(rectF, rectF.height() * 0.5f, rectF.height() * 0.5f, this.N);
                            } else if (getViewType() == 17) {
                                float L14 = org.telegram.messenger.i0.L(5.0f);
                                float L15 = org.telegram.messenger.i0.L(32.0f);
                                f7 = f16;
                                float B = c3.i0.B(L6, L15, f14, L5);
                                rectF4.set(B, org.telegram.messenger.i0.L(f7), L15 + B, org.telegram.messenger.i0.L(32.0f) + r10);
                                canvas2.drawRoundRect(rectF4, L14, L14, this.N);
                                canvas2.drawCircle((L6 / 2) + L5, getMeasuredHeight() - org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(8.0f), this.N);
                                L5 = i41;
                                f16 = f7;
                                i13 = i42;
                                f12 = f17;
                                f14 = 2.0f;
                            }
                            f7 = f16;
                            canvas2.drawCircle((L6 / 2) + L5, getMeasuredHeight() - org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(8.0f), this.N);
                            L5 = i41;
                            f16 = f7;
                            i13 = i42;
                            f12 = f17;
                            f14 = 2.0f;
                        }
                    } else if (getViewType() == 15) {
                        int L16 = org.telegram.messenger.i0.L(23.0f);
                        int L17 = org.telegram.messenger.i0.L(4.0f);
                        while (i10 <= getMeasuredHeight()) {
                            canvas2.drawCircle(a(org.telegram.messenger.m5.C(12.0f, this.G, L16)), org.telegram.messenger.m5.C(8.0f, i10, L16), L16, paint5);
                            rectF.set(org.telegram.messenger.i0.L(74.0f) + this.G, org.telegram.messenger.i0.L(12.0f) + i10, org.telegram.messenger.i0.L(260.0f) + this.G, org.telegram.messenger.i0.L(20.0f) + i10);
                            b(rectF);
                            float f19 = L17;
                            canvas2.drawRoundRect(rectF, f19, f19, paint5);
                            rectF.set(org.telegram.messenger.i0.L(74.0f) + this.G, org.telegram.messenger.i0.L(36.0f) + i10, org.telegram.messenger.i0.L(140.0f) + this.G, org.telegram.messenger.i0.L(42.0f) + i10);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, f19, f19, paint5);
                            if (this.T > 0.0f) {
                                rectF.set(org.telegram.messenger.i0.L(73.0f) + this.G, org.telegram.messenger.i0.L(62.0f) + i10, org.telegram.messenger.i0.L(73.0f) + this.G + this.T, org.telegram.messenger.i0.L(94.0f) + i10);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, f19, f19, paint5);
                            }
                            i10 = org.telegram.ui.Cells.f1.h(this, i10);
                            int i43 = i12 + 1;
                            if (this.D && i43 >= this.K) {
                                break;
                            } else {
                                i12 = i43;
                            }
                        }
                    } else if (getViewType() == 16 || getViewType() == 23) {
                        int i44 = 0;
                        while (i10 <= getMeasuredHeight()) {
                            canvas2.drawCircle(a(org.telegram.messenger.m5.C(8.0f, this.G, r6)), org.telegram.messenger.i0.L(24.0f) + i10, org.telegram.messenger.i0.L(18.0f), paint5);
                            rectF.set(org.telegram.messenger.i0.L(58.0f) + this.G, org.telegram.messenger.i0.L(20.0f) + i10, getWidth() - org.telegram.messenger.i0.L(53.0f), org.telegram.messenger.i0.L(28.0f) + i10);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), paint5);
                            if (i44 < 4) {
                                canvas2.drawCircle(a(org.telegram.messenger.m5.z(12.0f, getWidth(), r6)), org.telegram.messenger.i0.L(24.0f) + i10, org.telegram.messenger.i0.L(12.0f), paint5);
                            }
                            i10 = org.telegram.ui.Cells.f1.h(this, i10);
                            i44++;
                            if (this.D && i44 >= this.K) {
                                break;
                            }
                        }
                        rectF.set(org.telegram.messenger.i0.L(8.0f) + this.G, org.telegram.messenger.i0.L(20.0f) + i10, getWidth() - org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(28.0f) + i10);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), paint5);
                        rectF.set(org.telegram.messenger.i0.L(8.0f) + this.G, org.telegram.messenger.i0.L(36.0f) + i10, getWidth() - org.telegram.messenger.i0.L(53.0f), org.telegram.messenger.i0.L(44.0f) + i10);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), paint5);
                    } else {
                        int i45 = this.E;
                        if (i45 == 21) {
                            while (i10 <= getMeasuredHeight()) {
                                canvas2.drawCircle(a(org.telegram.messenger.i0.L(20.0f) + r4), (org.telegram.messenger.i0.L(58.0f) >> 1) + i10, org.telegram.messenger.i0.L(46.0f) >> 1, paint5);
                                rectF.set(org.telegram.messenger.i0.L(74.0f), org.telegram.messenger.i0.L(16.0f) + i10, org.telegram.messenger.i0.L(140.0f), org.telegram.messenger.i0.L(24.0f) + i10);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint5);
                                rectF.set(org.telegram.messenger.i0.L(74.0f), org.telegram.messenger.i0.L(38.0f) + i10, org.telegram.messenger.i0.L(260.0f), org.telegram.messenger.i0.L(46.0f) + i10);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint5);
                                i10 = org.telegram.ui.Cells.f1.h(this, i10);
                                int i46 = i12 + 1;
                                if (this.D && i46 >= this.K) {
                                    break;
                                } else {
                                    i12 = i46;
                                }
                            }
                        } else if (i45 == 22) {
                            while (i10 <= getMeasuredHeight()) {
                                canvas2.drawCircle(a(org.telegram.messenger.i0.L(20.0f) + r4), org.telegram.messenger.m5.C(6.0f, i10, r4), org.telegram.messenger.i0.L(48.0f) >> 1, paint5);
                                rectF.set(org.telegram.messenger.i0.L(76.0f), org.telegram.messenger.i0.L(16.0f) + i10, org.telegram.messenger.i0.L(140.0f), org.telegram.messenger.i0.L(24.0f) + i10);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint5);
                                rectF.set(org.telegram.messenger.i0.L(76.0f), org.telegram.messenger.i0.L(38.0f) + i10, org.telegram.messenger.i0.L(260.0f), org.telegram.messenger.i0.L(46.0f) + i10);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint5);
                                i10 = org.telegram.ui.Cells.f1.h(this, i10);
                                int i47 = i12 + 1;
                                if (this.D && i47 >= this.K) {
                                    break;
                                } else {
                                    i12 = i47;
                                }
                            }
                        } else if (i45 == 25) {
                            while (i10 <= getMeasuredHeight()) {
                                canvas2.drawCircle(org.telegram.messenger.i0.L(17.0f) + r4, org.telegram.messenger.m5.C(6.0f, i10, r4), org.telegram.messenger.i0.L(38.0f) >> 1, paint5);
                                rectF.set(org.telegram.messenger.i0.L(76.0f), org.telegram.messenger.i0.L(21.0f) + i10, org.telegram.messenger.i0.L(220.0f), org.telegram.messenger.i0.L(29.0f) + i10);
                                canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint5);
                                i10 = org.telegram.ui.Cells.f1.h(this, i10);
                                int i48 = i12 + 1;
                                if (this.D && i48 >= this.K) {
                                    break;
                                } else {
                                    i12 = i48;
                                }
                            }
                        } else if (i45 == 26) {
                            while (i10 <= getMeasuredHeight()) {
                                canvas2.drawCircle(org.telegram.messenger.cd.X ? org.telegram.messenger.m5.z(21.0f, getMeasuredWidth(), r4) : org.telegram.messenger.i0.L(21.0f) + r4, org.telegram.messenger.m5.C(16.0f, i10, r4), org.telegram.messenger.i0.L(21.0f) >> 1, paint5);
                                rectF.set(org.telegram.messenger.i0.L(60.0f), org.telegram.messenger.i0.L(21.0f) + i10, org.telegram.messenger.i0.L(190.0f), org.telegram.messenger.i0.L(29.0f) + i10);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint5);
                                rectF.set(getMeasuredWidth() - org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(21.0f) + i10, getMeasuredWidth() - org.telegram.messenger.i0.L(62.0f), org.telegram.messenger.i0.L(29.0f) + i10);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint5);
                                i10 = org.telegram.ui.Cells.f1.h(this, i10);
                                int i49 = i12 + 1;
                                if (this.D && i49 >= this.K) {
                                    break;
                                } else {
                                    i12 = i49;
                                }
                            }
                        } else if (getViewType() == 28) {
                            while (i10 <= getMeasuredHeight()) {
                                canvas2.drawCircle(a(org.telegram.messenger.m5.C(10.0f, this.G, r4)), (org.telegram.messenger.i0.L(58.0f) >> 1) + i10, org.telegram.messenger.i0.L(24.0f), paint5);
                                rectF.set(org.telegram.messenger.i0.L(68.0f) + this.G, org.telegram.messenger.i0.L(17.0f) + i10, org.telegram.messenger.i0.L(260.0f) + this.G, org.telegram.messenger.i0.L(25.0f) + i10);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint5);
                                rectF.set(org.telegram.messenger.i0.L(68.0f) + this.G, org.telegram.messenger.i0.L(39.0f) + i10, org.telegram.messenger.i0.L(140.0f) + this.G, org.telegram.messenger.i0.L(47.0f) + i10);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint5);
                                if (this.x) {
                                    rectF.set(getMeasuredWidth() - org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(20.0f) + i10, getMeasuredWidth() - org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(28.0f) + i10);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint5);
                                }
                                i10 = org.telegram.ui.Cells.f1.h(this, i10);
                                int i50 = i12 + 1;
                                if (this.D && i50 >= this.K) {
                                    break;
                                } else {
                                    i12 = i50;
                                }
                            }
                        } else if (getViewType() == 31) {
                            while (i10 <= getMeasuredHeight()) {
                                int c12 = c(getMeasuredWidth());
                                float f20 = i10;
                                rectF.set(org.telegram.messenger.i0.L(18.0f) + this.G, ((c12 - org.telegram.messenger.i0.L(22.0f)) / 2.0f) + f20, org.telegram.messenger.i0.L(40.0f) + this.G, ((org.telegram.messenger.i0.L(22.0f) + c12) / 2.0f) + f20);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(11.0f), paint5);
                                rectF.set(org.telegram.messenger.i0.L(58.0f) + this.G, ((c12 - org.telegram.messenger.i0.L(8.0f)) / 2.0f) + f20, org.telegram.messenger.z20.C(19.0f, getMeasuredWidth(), org.telegram.messenger.i0.L(132.0f) + this.G), ((org.telegram.messenger.i0.L(8.0f) + c12) / 2.0f) + f20);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint5);
                                i10 += c12;
                                int i51 = i12 + 1;
                                if (this.D && i51 >= this.K) {
                                    break;
                                } else {
                                    i12 = i51;
                                }
                            }
                        } else if (getViewType() == 32) {
                            while (i10 <= getMeasuredHeight()) {
                                int c13 = c(getMeasuredWidth());
                                float f21 = i10;
                                rectF.set(org.telegram.messenger.i0.L(10.0f) + this.G, ((c13 - org.telegram.messenger.i0.L(32.0f)) / 2.0f) + f21, org.telegram.messenger.i0.L(42.0f) + this.G, ((org.telegram.messenger.i0.L(32.0f) + c13) / 2.0f) + f21);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), paint5);
                                rectF.set(org.telegram.messenger.i0.L(64.0f) + this.G, (((c13 - org.telegram.messenger.i0.L(14.0f)) - org.telegram.messenger.i0.L(10.0f)) / 2.0f) + f21, org.telegram.messenger.z20.C(19.0f, getMeasuredWidth(), org.telegram.messenger.i0.L(118.0f) + this.G), ((org.telegram.messenger.i0.L(10.0f) + (c13 - org.telegram.messenger.i0.L(14.0f))) / 2.0f) + f21);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint5);
                                rectF.set(org.telegram.messenger.i0.L(64.0f) + this.G, (((org.telegram.messenger.i0.L(14.0f) + c13) - org.telegram.messenger.i0.L(8.0f)) / 2.0f) + f21, org.telegram.messenger.z20.C(19.0f, getMeasuredWidth(), org.telegram.messenger.i0.L(144.0f) + this.G), ((org.telegram.messenger.i0.L(8.0f) + (org.telegram.messenger.i0.L(14.0f) + c13)) / 2.0f) + f21);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint5);
                                i10 += c13;
                                int i52 = i12 + 1;
                                if (this.D && i52 >= this.K) {
                                    break;
                                } else {
                                    i12 = i52;
                                }
                            }
                        } else if (getViewType() == 34 || getViewType() == 35 || getViewType() == 36) {
                            rectF.set(this.G, this.F, getMeasuredWidth() - this.G, getMeasuredHeight() - this.F);
                            rectF.inset(org.telegram.messenger.i0.L(3.33f), org.telegram.messenger.i0.L(4.0f));
                            canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(11.0f), paint5);
                        }
                    }
                }
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (!this.D) {
            super.onMeasure(i10, i11);
            return;
        }
        int i12 = this.K;
        if (i12 > 1 && this.S) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getAdditionalHeight() + (c(View.MeasureSpec.getSize(i10)) * this.K), TLObject.FLAG_30));
        } else if (i12 <= 1 || View.MeasureSpec.getSize(i11) <= 0) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getAdditionalHeight() + c(View.MeasureSpec.getSize(i10)), TLObject.FLAG_30));
        } else {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getAdditionalHeight() + Math.min(View.MeasureSpec.getSize(i11), c(View.MeasureSpec.getSize(i10)) * this.K), TLObject.FLAG_30));
        }
    }

    public void setGlobalGradientView(zz zzVar) {
        this.R = zzVar;
    }

    public void setIgnoreHeightCheck(boolean z10) {
        this.S = z10;
    }

    public void setIsSingleCell(boolean z10) {
        this.D = z10;
    }

    public void setItemsCount(int i10) {
        this.K = i10;
    }

    public void setMemberRequestButton(boolean z10) {
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        textPaint.setTextSize(org.telegram.messenger.i0.L(14.0f));
        this.T = textPaint.measureText(org.telegram.messenger.cd.L0(z10 ? 2131754378 : 2131754373, null)) + org.telegram.messenger.i0.L(34.0f);
    }

    public void setPaddingLeft(int i10) {
        this.G = i10;
        invalidate();
    }

    public void setPaddingTop(int i10) {
        this.F = i10;
        invalidate();
    }

    public void setUseHeaderOffset(boolean z10) {
        this.y = z10;
    }

    public void setViewType(int i10) {
        this.E = i10;
        if (i10 == 11) {
            Random random = new Random();
            this.M = new float[2];
            for (int i11 = 0; i11 < 2; i11++) {
                this.M[i11] = Math.abs(random.nextInt() % 1000) / 1000.0f;
            }
        }
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        int i10;
        zz zzVar = this.R;
        if (zzVar != null) {
            zzVar.updateColors();
            return;
        }
        int i11 = this.H;
        org.telegram.ui.ActionBar.p6 p6Var = this.L;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i11, p6Var);
        int w03 = org.telegram.ui.ActionBar.t6.w0(this.I, p6Var);
        if (this.s == w03 && this.r == w02) {
            return;
        }
        this.r = w02;
        this.s = w03;
        int i12 = this.E;
        if (i12 == 34 || i12 == 35 || i12 == 36) {
            this.a = org.telegram.messenger.i0.q.x;
        } else if (this.D || i12 == 13 || i12 == 14 || i12 == 17) {
            this.a = org.telegram.messenger.i0.L(200.0f);
        } else {
            this.a = org.telegram.messenger.i0.L(600.0f);
        }
        if (this.D || (i10 = this.E) == 13 || i10 == 14 || i10 == 17) {
            this.b = new LinearGradient(0.0f, 0.0f, this.a, 0.0f, new int[]{w03, w02, w02, w03}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        } else {
            this.b = new LinearGradient(0.0f, 0.0f, 0.0f, this.a, new int[]{w03, w02, w02, w03}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
        this.c.setShader(this.b);
    }

    public zz(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.c = new Paint();
        this.d = new Paint();
        this.n = new RectF();
        this.x = true;
        this.H = org.telegram.ui.ActionBar.t6.G8;
        this.I = org.telegram.ui.ActionBar.t6.i6;
        this.J = -1;
        this.K = 1;
        this.L = p6Var;
        this.h = new Matrix();
    }
}
