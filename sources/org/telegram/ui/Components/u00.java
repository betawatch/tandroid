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
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public class u00 extends View implements org.telegram.ui.ActionBar.b6 {
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public final org.telegram.ui.ActionBar.g6 I;
    public float[] J;
    public Paint K;
    public int L;
    public int M;
    public float N;
    public u00 O;
    public boolean P;
    public float Q;
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
    public int v;
    public boolean w;
    public boolean x;
    public boolean y;

    public u00(Context context) {
        this(context, null);
    }

    public final float a(float f10) {
        return LocaleController.isRTL ? getMeasuredWidth() - f10 : f10;
    }

    public final void b(RectF rectF) {
        if (LocaleController.isRTL) {
            rectF.left = getMeasuredWidth() - rectF.left;
            rectF.right = getMeasuredWidth() - rectF.right;
        }
    }

    public final int c(int i10) {
        switch (getViewType()) {
            case 1:
                return AndroidUtilities.dp(78.0f) + 1;
            case 2:
                return AndroidUtilities.dp(2.0f) + ((i10 - ((getColumnsCount() - 1) * AndroidUtilities.dp(2.0f))) / getColumnsCount());
            case 3:
            case 4:
                return AndroidUtilities.dp(56.0f);
            case 5:
                return AndroidUtilities.dp(80.0f);
            case 6:
            case 18:
                return AndroidUtilities.dp(64.0f);
            case 7:
                return AndroidUtilities.dp((SharedConfig.useThreeLinesLayout ? 78 : 72) + 1);
            case 8:
                return AndroidUtilities.dp(61.0f);
            case 9:
                return AndroidUtilities.dp(66.0f);
            case 10:
                return AndroidUtilities.dp(58.0f);
            case 11:
                return AndroidUtilities.dp(36.0f);
            case 12:
                return AndroidUtilities.dp(103.0f);
            case 13:
            case 14:
            case 17:
            case 20:
            case 27:
            default:
                return 0;
            case 15:
                return AndroidUtilities.dp(107.0f);
            case 16:
            case 23:
                return AndroidUtilities.dp(50.0f);
            case 19:
                return AndroidUtilities.dp(58.0f);
            case 21:
                return AndroidUtilities.dp(58.0f);
            case 22:
                return AndroidUtilities.dp(60.0f);
            case 24:
                return AndroidUtilities.dp((SharedConfig.useThreeLinesLayout ? 76 : 64) + 1);
            case 25:
                return AndroidUtilities.dp(51.0f);
            case 26:
                return AndroidUtilities.dp(50.0f) + 1;
            case 28:
                return AndroidUtilities.dp(58.0f);
            case 29:
                return AndroidUtilities.dp(60.0f) + 1;
            case MessageObject.TYPE_GIFT_STARS /* 30 */:
                return AndroidUtilities.dp(32.0f);
            case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                return AndroidUtilities.dp(48.0f) + 1;
            case 32:
                return AndroidUtilities.dp(56.0f) + 1;
            case 33:
                return AndroidUtilities.dp(58.0f);
            case 34:
                return AndroidUtilities.dp(140.0f);
            case 35:
                return AndroidUtilities.dp(112.0f);
            case 36:
                return AndroidUtilities.dp(108.0f);
        }
    }

    public final int d(int i10) {
        return org.telegram.ui.ActionBar.k6.v0(i10, this.I);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void e() {
        int i10;
        u00 u00Var = this.O;
        if (u00Var != null) {
            u00Var.e();
            return;
        }
        int i11 = this.E;
        org.telegram.ui.ActionBar.g6 g6Var = this.I;
        int v02 = org.telegram.ui.ActionBar.k6.v0(i11, g6Var);
        int v03 = org.telegram.ui.ActionBar.k6.v0(this.F, g6Var);
        if (this.s == v03 && this.r == v02) {
            return;
        }
        this.r = v02;
        this.s = v03;
        int i12 = this.B;
        if (i12 == 34 || i12 == 35 || i12 == 36) {
            this.a = AndroidUtilities.displaySize.x;
        } else if (this.y || i12 == 13 || i12 == 14 || i12 == 17) {
            this.a = AndroidUtilities.dp(200.0f);
        } else {
            this.a = AndroidUtilities.dp(600.0f);
        }
        if (this.y || (i10 = this.B) == 13 || i10 == 14 || i10 == 17) {
            this.b = new LinearGradient(0.0f, 0.0f, this.a, 0.0f, new int[]{v03, v02, v02, v03}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        } else {
            this.b = new LinearGradient(0.0f, 0.0f, 0.0f, this.a, new int[]{v03, v02, v02, v03}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
        this.c.setShader(this.b);
    }

    public final void f(int i10, int i11, int i12) {
        this.E = i10;
        this.F = i11;
        this.G = i12;
        invalidate();
    }

    public final void g() {
        this.w = false;
    }

    public int getAdditionalHeight() {
        return 0;
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public int getColumnsCount() {
        return 2;
    }

    public Paint getPaint() {
        return this.c;
    }

    public int getViewType() {
        return this.B;
    }

    public final void h() {
        u00 u00Var = this.O;
        if (u00Var != null) {
            u00Var.h();
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
        int i10 = this.L;
        if (i10 == 0) {
            i10 = getMeasuredWidth();
        }
        int i11 = this.B;
        if (i11 == 34 || i11 == 35 || i11 == 36) {
            i10 = Math.max(i10, AndroidUtilities.displaySize.x);
        }
        int i12 = this.M;
        if (i12 == 0) {
            i12 = getMeasuredHeight();
        }
        this.e = elapsedRealtime;
        boolean z4 = this.y;
        Matrix matrix = this.h;
        if (z4 || this.B == 13 || getViewType() == 14 || getViewType() == 17) {
            int i13 = (int) (((abs * i10) / 400.0f) + this.f);
            this.f = i13;
            if (i13 >= i10 * 2) {
                this.f = (-this.a) * 2;
            }
            matrix.setTranslate(this.f + this.N, 0.0f);
        } else {
            int i14 = (int) (((abs * i12) / 400.0f) + this.f);
            this.f = i14;
            if (i14 >= i12 * 2) {
                this.f = (-this.a) * 2;
            }
            matrix.setTranslate(this.N, this.f);
        }
        LinearGradient linearGradient = this.b;
        if (linearGradient != null) {
            linearGradient.setLocalMatrix(matrix);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Paint paint;
        Canvas canvas2;
        Paint paint2;
        float f10;
        if (this.O != null) {
            if (getParent() != null) {
                View view = (View) getParent();
                u00 u00Var = this.O;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                float f11 = -getX();
                u00Var.L = measuredWidth;
                u00Var.M = measuredHeight;
                u00Var.N = f11;
            }
            paint = this.O.c;
        } else {
            paint = this.c;
        }
        Paint paint3 = paint;
        if (getViewType() == 34 || getViewType() == 35 || getViewType() == 36) {
            this.N = -getX();
        }
        e();
        h();
        int i10 = this.C;
        if (this.x) {
            int dp = AndroidUtilities.dp(32.0f) + i10;
            int i11 = this.G;
            if (i11 >= 0) {
                this.d.setColor(d(i11));
            }
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(32.0f), this.G >= 0 ? this.d : paint3);
            canvas2 = canvas;
            i10 = dp;
        } else {
            canvas2 = canvas;
        }
        int viewType = getViewType();
        int i12 = 0;
        int i13 = 1;
        RectF rectF = this.n;
        if (viewType == 7) {
            while (i10 <= getMeasuredHeight()) {
                int c3 = c(getMeasuredWidth());
                canvas2.drawCircle(a(AndroidUtilities.dp(10.0f) + r4), (c3 >> 1) + i10, AndroidUtilities.dp(28.0f), paint3);
                rectF.set(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(16.0f) + i10, AndroidUtilities.dp(148.0f), AndroidUtilities.dp(24.0f) + i10);
                b(rectF);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint3);
                rectF.set(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(38.0f) + i10, AndroidUtilities.dp(268.0f), AndroidUtilities.dp(46.0f) + i10);
                b(rectF);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint3);
                if (SharedConfig.useThreeLinesLayout) {
                    rectF.set(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(54.0f) + i10, AndroidUtilities.dp(220.0f), AndroidUtilities.dp(62.0f) + i10);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint3);
                }
                if (this.w) {
                    rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(16.0f) + i10, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(24.0f) + i10);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint3);
                }
                i10 = org.telegram.ui.yh.g(this, i10);
                int i14 = i12 + 1;
                if (this.y && i14 >= this.H) {
                    break;
                } else {
                    i12 = i14;
                }
            }
        } else if (getViewType() == 24) {
            while (i10 <= getMeasuredHeight()) {
                canvas2.drawCircle(a(AndroidUtilities.dp(10.0f) + r3), org.telegram.messenger.y3.C(10.0f, i10, r3), AndroidUtilities.dp(14.0f), paint3);
                canvas2.save();
                canvas2.translate(0.0f, -AndroidUtilities.dp(4.0f));
                rectF.set(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(16.0f) + i10, AndroidUtilities.dp(148.0f), AndroidUtilities.dp(24.0f) + i10);
                b(rectF);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint3);
                rectF.set(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(38.0f) + i10, AndroidUtilities.dp(268.0f), AndroidUtilities.dp(46.0f) + i10);
                b(rectF);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint3);
                if (SharedConfig.useThreeLinesLayout) {
                    rectF.set(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(54.0f) + i10, AndroidUtilities.dp(220.0f), AndroidUtilities.dp(62.0f) + i10);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint3);
                }
                if (this.w) {
                    rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(16.0f) + i10, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(24.0f) + i10);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint3);
                }
                canvas2.restore();
                i10 += c(getMeasuredWidth());
                int i15 = i12 + 1;
                if (this.y && i15 >= this.H) {
                    break;
                } else {
                    i12 = i15;
                }
            }
        } else if (getViewType() == 18) {
            int i16 = i10;
            while (i16 <= getMeasuredHeight()) {
                canvas2.drawCircle(a(org.telegram.messenger.y3.C(9.0f, this.D, r1)), AndroidUtilities.dp(32.0f) + i16, AndroidUtilities.dp(25.0f), paint3);
                int i17 = i12 % 2 == 0 ? 52 : 72;
                float f12 = 76;
                rectF.set(AndroidUtilities.dp(f12), AndroidUtilities.dp(20.0f) + i16, AndroidUtilities.dp(i17 + 76), AndroidUtilities.dp(28.0f) + i16);
                b(rectF);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint3);
                rectF.set(AndroidUtilities.dp(i17 + 84), AndroidUtilities.dp(20.0f) + i16, AndroidUtilities.dp(i17 + 168), AndroidUtilities.dp(28.0f) + i16);
                b(rectF);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint3);
                rectF.set(AndroidUtilities.dp(f12), AndroidUtilities.dp(42.0f) + i16, AndroidUtilities.dp(140), AndroidUtilities.dp(50.0f) + i16);
                b(rectF);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint3);
                Canvas canvas3 = canvas2;
                Paint paint4 = paint3;
                canvas3.drawLine(AndroidUtilities.dp(f12), org.telegram.ui.yh.g(this, i16), getMeasuredWidth(), org.telegram.ui.yh.g(this, i16), paint4);
                canvas2 = canvas3;
                i16 = org.telegram.ui.yh.g(this, i16);
                int i18 = i12 + 1;
                if (this.y && i18 >= this.H) {
                    break;
                }
                i12 = i18;
                paint3 = paint4;
            }
        } else {
            Paint paint5 = paint3;
            if (getViewType() == 19) {
                int i19 = i10;
                while (i19 <= getMeasuredHeight()) {
                    canvas2.drawCircle(a(org.telegram.messenger.y3.C(9.0f, this.D, r1)), AndroidUtilities.dp(29.0f) + i19, AndroidUtilities.dp(20.0f), paint5);
                    float f13 = 76;
                    rectF.set(AndroidUtilities.dp(f13), AndroidUtilities.dp(16.0f) + i19, AndroidUtilities.dp((i12 % 2 == 0 ? 92 : 128) + 76), AndroidUtilities.dp(24.0f) + i19);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                    rectF.set(AndroidUtilities.dp(f13), AndroidUtilities.dp(38.0f) + i19, AndroidUtilities.dp(240), AndroidUtilities.dp(46.0f) + i19);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                    Canvas canvas4 = canvas2;
                    Paint paint6 = paint5;
                    canvas4.drawLine(AndroidUtilities.dp(f13), org.telegram.ui.yh.g(this, i19), getMeasuredWidth(), org.telegram.ui.yh.g(this, i19), paint6);
                    canvas2 = canvas4;
                    paint5 = paint6;
                    i19 = org.telegram.ui.yh.g(this, i19);
                    int i20 = i12 + 1;
                    if (this.y && i20 >= this.H) {
                        break;
                    } else {
                        i12 = i20;
                    }
                }
            } else if (getViewType() == 1) {
                while (i10 <= getMeasuredHeight()) {
                    canvas2.drawCircle(a(AndroidUtilities.dp(9.0f) + r4), (AndroidUtilities.dp(78.0f) >> 1) + i10, AndroidUtilities.dp(25.0f), paint5);
                    rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(20.0f) + i10, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(28.0f) + i10);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                    rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(42.0f) + i10, AndroidUtilities.dp(260.0f), AndroidUtilities.dp(50.0f) + i10);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                    if (this.w) {
                        rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(20.0f) + i10, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(28.0f) + i10);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                    }
                    i10 = org.telegram.ui.yh.g(this, i10);
                    int i21 = i12 + 1;
                    if (this.y && i21 >= this.H) {
                        break;
                    } else {
                        i12 = i21;
                    }
                }
            } else if (getViewType() == 2 || getViewType() == 27) {
                int measuredWidth2 = (getMeasuredWidth() - ((getColumnsCount() - 1) * AndroidUtilities.dp(2.0f))) / getColumnsCount();
                int i22 = getViewType() == 27 ? (int) (measuredWidth2 * 1.25f) : measuredWidth2;
                int i23 = i10;
                int i24 = 0;
                while (true) {
                    if (i23 >= getMeasuredHeight() && !this.y) {
                        break;
                    }
                    int i25 = 0;
                    while (i25 < getColumnsCount()) {
                        if (i24 != 0 || i25 >= this.v) {
                            paint2 = paint5;
                            canvas.drawRect((AndroidUtilities.dp(2.0f) + measuredWidth2) * i25, i23, r1 + measuredWidth2, i23 + i22, paint2);
                        } else {
                            paint2 = paint5;
                        }
                        i25++;
                        paint5 = paint2;
                    }
                    Paint paint7 = paint5;
                    i23 = org.telegram.messenger.y3.C(2.0f, i22, i23);
                    i24++;
                    if (this.y && i24 >= 2) {
                        break;
                    }
                    paint5 = paint7;
                }
            } else {
                float f14 = 8.0f;
                if (getViewType() == 3) {
                    while (i10 <= getMeasuredHeight()) {
                        rectF.set(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f) + i10, AndroidUtilities.dp(52.0f), AndroidUtilities.dp(48.0f) + i10);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(12.0f) + i10, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(20.0f) + i10);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(34.0f) + i10, AndroidUtilities.dp(260.0f), AndroidUtilities.dp(42.0f) + i10);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        if (this.w) {
                            rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(12.0f) + i10, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(20.0f) + i10);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        }
                        i10 = org.telegram.ui.yh.g(this, i10);
                        int i26 = i12 + 1;
                        if (this.y && i26 >= this.H) {
                            break;
                        } else {
                            i12 = i26;
                        }
                    }
                } else if (getViewType() == 4) {
                    while (i10 <= getMeasuredHeight()) {
                        canvas2.drawCircle(a(AndroidUtilities.dp(12.0f) + r4), org.telegram.messenger.y3.C(6.0f, i10, r4), AndroidUtilities.dp(44.0f) >> 1, paint5);
                        rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(12.0f) + i10, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(20.0f) + i10);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(34.0f) + i10, AndroidUtilities.dp(260.0f), AndroidUtilities.dp(42.0f) + i10);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        if (this.w) {
                            rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(12.0f) + i10, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(20.0f) + i10);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        }
                        i10 = org.telegram.ui.yh.g(this, i10);
                        int i27 = i12 + 1;
                        if (this.y && i27 >= this.H) {
                            break;
                        } else {
                            i12 = i27;
                        }
                    }
                } else if (getViewType() == 5) {
                    while (i10 <= getMeasuredHeight()) {
                        rectF.set(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(11.0f) + i10, AndroidUtilities.dp(62.0f), AndroidUtilities.dp(63.0f) + i10);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(12.0f) + i10, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(20.0f) + i10);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(34.0f) + i10, AndroidUtilities.dp(268.0f), AndroidUtilities.dp(42.0f) + i10);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(54.0f) + i10, AndroidUtilities.dp(188.0f), AndroidUtilities.dp(62.0f) + i10);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        if (this.w) {
                            rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(12.0f) + i10, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(20.0f) + i10);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        }
                        i10 = org.telegram.ui.yh.g(this, i10);
                        int i28 = i12 + 1;
                        if (this.y && i28 >= this.H) {
                            break;
                        } else {
                            i12 = i28;
                        }
                    }
                } else if (getViewType() == 6 || getViewType() == 10) {
                    while (i10 <= getMeasuredHeight()) {
                        canvas2.drawCircle(a(org.telegram.messenger.y3.C(9.0f, this.D, r4)), (AndroidUtilities.dp(64.0f) >> 1) + i10, AndroidUtilities.dp(23.0f), paint5);
                        rectF.set(AndroidUtilities.dp(68.0f) + this.D, AndroidUtilities.dp(17.0f) + i10, AndroidUtilities.dp(260.0f) + this.D, AndroidUtilities.dp(25.0f) + i10);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(AndroidUtilities.dp(68.0f) + this.D, AndroidUtilities.dp(39.0f) + i10, AndroidUtilities.dp(140.0f) + this.D, AndroidUtilities.dp(47.0f) + i10);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        if (this.w) {
                            rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(20.0f) + i10, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(28.0f) + i10);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        }
                        i10 = org.telegram.ui.yh.g(this, i10);
                        int i29 = i12 + 1;
                        if (this.y && i29 >= this.H) {
                            break;
                        } else {
                            i12 = i29;
                        }
                    }
                } else if (getViewType() == 29) {
                    while (i10 <= getMeasuredHeight()) {
                        canvas2.drawCircle(a(org.telegram.messenger.y3.C(9.0f, this.D, r4)), (AndroidUtilities.dp(64.0f) >> 1) + i10, AndroidUtilities.dp(23.0f), paint5);
                        rectF.set(AndroidUtilities.dp(68.0f) + this.D, AndroidUtilities.dp(17.0f) + i10, AndroidUtilities.dp(260.0f) + this.D, AndroidUtilities.dp(25.0f) + i10);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(AndroidUtilities.dp(68.0f) + this.D, AndroidUtilities.dp(39.0f) + i10, AndroidUtilities.dp(140.0f) + this.D, AndroidUtilities.dp(47.0f) + i10);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        i10 = org.telegram.ui.yh.g(this, i10);
                        int i30 = i12 + 1;
                        if (this.y && i30 >= this.H) {
                            break;
                        } else {
                            i12 = i30;
                        }
                    }
                } else if (getViewType() == 33) {
                    while (i10 <= getMeasuredHeight()) {
                        canvas2.drawCircle(a(org.telegram.messenger.y3.C(13.0f, this.D, r4)), (AndroidUtilities.dp(58.0f) >> 1) + i10, AndroidUtilities.dp(23.0f), paint5);
                        rectF.set(AndroidUtilities.dp(72.0f) + this.D, AndroidUtilities.dp(17.0f) + i10, AndroidUtilities.dp(260.0f) + this.D, AndroidUtilities.dp(25.0f) + i10);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(AndroidUtilities.dp(72.0f) + this.D, AndroidUtilities.dp(39.0f) + i10, AndroidUtilities.dp(140.0f) + this.D, AndroidUtilities.dp(47.0f) + i10);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        i10 = org.telegram.ui.yh.g(this, i10);
                        int i31 = i12 + 1;
                        if (this.y && i31 >= this.H) {
                            break;
                        } else {
                            i12 = i31;
                        }
                    }
                } else if (getViewType() == 30) {
                    while (i10 <= getMeasuredHeight()) {
                        i10 += c(getMeasuredWidth());
                        rectF.set(0.0f, i10, getMeasuredWidth(), i10);
                        b(rectF);
                        canvas2.drawRect(rectF, paint5);
                        int i32 = i12 + 1;
                        if (this.y && i32 >= this.H) {
                            break;
                        } else {
                            i12 = i32;
                        }
                    }
                } else if (getViewType() == 8) {
                    while (i10 <= getMeasuredHeight()) {
                        canvas2.drawCircle(a(org.telegram.messenger.y3.C(11.0f, this.D, r4)), (AndroidUtilities.dp(64.0f) >> 1) + i10, AndroidUtilities.dp(23.0f), paint5);
                        rectF.set(AndroidUtilities.dp(68.0f) + this.D, AndroidUtilities.dp(17.0f) + i10, AndroidUtilities.dp(140.0f) + this.D, AndroidUtilities.dp(25.0f) + i10);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(AndroidUtilities.dp(68.0f) + this.D, AndroidUtilities.dp(39.0f) + i10, AndroidUtilities.dp(260.0f) + this.D, AndroidUtilities.dp(47.0f) + i10);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        if (this.w) {
                            rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(20.0f) + i10, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(28.0f) + i10);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        }
                        i10 = org.telegram.ui.yh.g(this, i10);
                        int i33 = i12 + 1;
                        if (this.y && i33 >= this.H) {
                            break;
                        } else {
                            i12 = i33;
                        }
                    }
                } else if (getViewType() == 9) {
                    while (i10 <= getMeasuredHeight()) {
                        canvas2.drawCircle(a(AndroidUtilities.dp(35.0f)), (c(getMeasuredWidth()) >> 1) + i10, AndroidUtilities.dp(32.0f) / 2, paint5);
                        rectF.set(AndroidUtilities.dp(72.0f), AndroidUtilities.dp(16.0f) + i10, AndroidUtilities.dp(268.0f), AndroidUtilities.dp(24.0f) + i10);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(AndroidUtilities.dp(72.0f), AndroidUtilities.dp(38.0f) + i10, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(46.0f) + i10);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        if (this.w) {
                            rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(16.0f) + i10, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(24.0f) + i10);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        }
                        i10 = org.telegram.ui.yh.g(this, i10);
                        int i34 = i12 + 1;
                        if (this.y && i34 >= this.H) {
                            break;
                        } else {
                            i12 = i34;
                        }
                    }
                } else if (getViewType() == 11) {
                    int i35 = 0;
                    while (i10 <= getMeasuredHeight()) {
                        rectF.set(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(14.0f), (getMeasuredWidth() * 0.5f) + AndroidUtilities.dp(this.J[0] * 40.0f), AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(14.0f));
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(getMeasuredWidth() - AndroidUtilities.dp(18.0f), AndroidUtilities.dp(14.0f), (getMeasuredWidth() - (getMeasuredWidth() * 0.2f)) - AndroidUtilities.dp(this.J[0] * 20.0f), AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(14.0f));
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        i10 = org.telegram.ui.yh.g(this, i10);
                        i35++;
                        if (this.y && i35 >= this.H) {
                            break;
                        }
                    }
                } else if (getViewType() == 12) {
                    int dp2 = AndroidUtilities.dp(14.0f) + i10;
                    while (dp2 <= getMeasuredHeight()) {
                        int measuredWidth3 = getMeasuredWidth() / 4;
                        for (int i36 = 0; i36 < 4; i36++) {
                            float f15 = (measuredWidth3 / 2.0f) + (measuredWidth3 * i36);
                            canvas2.drawCircle(f15, (AndroidUtilities.dp(56.0f) / 2.0f) + AndroidUtilities.dp(7.0f) + dp2, AndroidUtilities.dp(28.0f), paint5);
                            float dp3 = AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(56.0f) + AndroidUtilities.dp(7.0f) + dp2;
                            RectF rectF2 = AndroidUtilities.rectTmp;
                            rectF2.set(f15 - AndroidUtilities.dp(24.0f), dp3 - AndroidUtilities.dp(4.0f), f15 + AndroidUtilities.dp(24.0f), dp3 + AndroidUtilities.dp(4.0f));
                            canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        }
                        dp2 = org.telegram.ui.yh.g(this, dp2);
                        if (this.y) {
                            break;
                        }
                    }
                } else if (getViewType() == 13) {
                    float measuredHeight2 = getMeasuredHeight() / 2.0f;
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(AndroidUtilities.dp(40.0f), measuredHeight2 - AndroidUtilities.dp(4.0f), getMeasuredWidth() - AndroidUtilities.dp(120.0f), AndroidUtilities.dp(4.0f) + measuredHeight2);
                    canvas2.drawRoundRect(rectF3, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                    if (this.K == null) {
                        Paint paint8 = new Paint(1);
                        this.K = paint8;
                        paint8.setColor(org.telegram.ui.ActionBar.k6.u0(org.telegram.ui.ActionBar.k6.G8));
                    }
                    for (int i37 = 0; i37 < 3; i37++) {
                        canvas2.drawCircle(org.telegram.messenger.y3.D(12.0f, i37, AndroidUtilities.dp(13.0f) + (getMeasuredWidth() - AndroidUtilities.dp(56.0f))), measuredHeight2, AndroidUtilities.dp(13.0f), this.K);
                        canvas2.drawCircle(org.telegram.messenger.y3.D(12.0f, i37, AndroidUtilities.dp(13.0f) + (getMeasuredWidth() - AndroidUtilities.dp(56.0f))), measuredHeight2, AndroidUtilities.dp(12.0f), paint5);
                    }
                } else if (getViewType() == 14 || getViewType() == 17) {
                    int dp4 = AndroidUtilities.dp(12.0f);
                    int dp5 = AndroidUtilities.dp(77.0f);
                    int dp6 = AndroidUtilities.dp(4.0f);
                    float dp7 = AndroidUtilities.dp(21.0f);
                    float dp8 = AndroidUtilities.dp(41.0f);
                    while (dp4 < getMeasuredWidth()) {
                        if (this.K == null) {
                            this.K = new Paint(i13);
                        }
                        this.K.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.h5, this.I));
                        RectF rectF4 = AndroidUtilities.rectTmp;
                        int i38 = dp4 + dp5;
                        rectF4.set(AndroidUtilities.dp(4.0f) + dp4, AndroidUtilities.dp(4.0f), i38 - AndroidUtilities.dp(4.0f), getMeasuredHeight() - AndroidUtilities.dp(4.0f));
                        canvas2.drawRoundRect(rectF4, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint5);
                        if (getViewType() == 14) {
                            float dp9 = AndroidUtilities.dp(f14) + dp6;
                            float f16 = dp4;
                            float dp10 = AndroidUtilities.dp(22.0f) + dp6 + f16;
                            rectF.set(dp10, dp9, dp10 + dp8, dp9 + dp7);
                            canvas2.drawRoundRect(rectF, rectF.height() * 0.5f, rectF.height() * 0.5f, this.K);
                            float dp11 = AndroidUtilities.dp(4.0f) + dp7 + dp9;
                            float dp12 = f16 + AndroidUtilities.dp(5.0f) + dp6;
                            rectF.set(dp12, dp11, dp12 + dp8, dp11 + dp7);
                            canvas2.drawRoundRect(rectF, rectF.height() * 0.5f, rectF.height() * 0.5f, this.K);
                        } else if (getViewType() == 17) {
                            float dp13 = AndroidUtilities.dp(5.0f);
                            float dp14 = AndroidUtilities.dp(32.0f);
                            f10 = 8.0f;
                            float x10 = e2.c.x(dp5, dp14, 2.0f, dp4);
                            rectF4.set(x10, AndroidUtilities.dp(21.0f), dp14 + x10, AndroidUtilities.dp(32.0f) + r13);
                            canvas2.drawRoundRect(rectF4, dp13, dp13, this.K);
                            canvas2.drawCircle((dp5 / 2) + dp4, getMeasuredHeight() - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(f10), this.K);
                            dp4 = i38;
                            i13 = 1;
                            f14 = 8.0f;
                        }
                        f10 = 8.0f;
                        canvas2.drawCircle((dp5 / 2) + dp4, getMeasuredHeight() - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(f10), this.K);
                        dp4 = i38;
                        i13 = 1;
                        f14 = 8.0f;
                    }
                } else if (getViewType() == 15) {
                    int dp15 = AndroidUtilities.dp(23.0f);
                    int dp16 = AndroidUtilities.dp(4.0f);
                    while (i10 <= getMeasuredHeight()) {
                        canvas2.drawCircle(a(org.telegram.messenger.y3.C(12.0f, this.D, dp15)), org.telegram.messenger.y3.C(8.0f, i10, dp15), dp15, paint5);
                        rectF.set(AndroidUtilities.dp(74.0f) + this.D, AndroidUtilities.dp(12.0f) + i10, AndroidUtilities.dp(260.0f) + this.D, AndroidUtilities.dp(20.0f) + i10);
                        b(rectF);
                        float f17 = dp16;
                        canvas2.drawRoundRect(rectF, f17, f17, paint5);
                        rectF.set(AndroidUtilities.dp(74.0f) + this.D, AndroidUtilities.dp(36.0f) + i10, AndroidUtilities.dp(140.0f) + this.D, AndroidUtilities.dp(42.0f) + i10);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, f17, f17, paint5);
                        if (this.Q > 0.0f) {
                            rectF.set(AndroidUtilities.dp(73.0f) + this.D, AndroidUtilities.dp(62.0f) + i10, AndroidUtilities.dp(73.0f) + this.D + this.Q, AndroidUtilities.dp(94.0f) + i10);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, f17, f17, paint5);
                        }
                        i10 = org.telegram.ui.yh.g(this, i10);
                        int i39 = i12 + 1;
                        if (this.y && i39 >= this.H) {
                            break;
                        } else {
                            i12 = i39;
                        }
                    }
                } else if (getViewType() == 16 || getViewType() == 23) {
                    int i40 = 0;
                    while (i10 <= getMeasuredHeight()) {
                        canvas2.drawCircle(a(org.telegram.messenger.y3.C(8.0f, this.D, r6)), AndroidUtilities.dp(24.0f) + i10, AndroidUtilities.dp(18.0f), paint5);
                        rectF.set(AndroidUtilities.dp(58.0f) + this.D, AndroidUtilities.dp(20.0f) + i10, getWidth() - AndroidUtilities.dp(53.0f), AndroidUtilities.dp(28.0f) + i10);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint5);
                        if (i40 < 4) {
                            canvas2.drawCircle(a(org.telegram.messenger.y3.B(12.0f, getWidth(), r6)), AndroidUtilities.dp(24.0f) + i10, AndroidUtilities.dp(12.0f), paint5);
                        }
                        i10 = org.telegram.ui.yh.g(this, i10);
                        i40++;
                        if (this.y && i40 >= this.H) {
                            break;
                        }
                    }
                    rectF.set(AndroidUtilities.dp(8.0f) + this.D, AndroidUtilities.dp(20.0f) + i10, getWidth() - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(28.0f) + i10);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint5);
                    rectF.set(AndroidUtilities.dp(8.0f) + this.D, AndroidUtilities.dp(36.0f) + i10, getWidth() - AndroidUtilities.dp(53.0f), AndroidUtilities.dp(44.0f) + i10);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint5);
                } else {
                    int i41 = this.B;
                    if (i41 == 21) {
                        while (i10 <= getMeasuredHeight()) {
                            canvas2.drawCircle(a(AndroidUtilities.dp(20.0f) + r4), (AndroidUtilities.dp(58.0f) >> 1) + i10, AndroidUtilities.dp(46.0f) >> 1, paint5);
                            rectF.set(AndroidUtilities.dp(74.0f), AndroidUtilities.dp(16.0f) + i10, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(24.0f) + i10);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                            rectF.set(AndroidUtilities.dp(74.0f), AndroidUtilities.dp(38.0f) + i10, AndroidUtilities.dp(260.0f), AndroidUtilities.dp(46.0f) + i10);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                            i10 = org.telegram.ui.yh.g(this, i10);
                            int i42 = i12 + 1;
                            if (this.y && i42 >= this.H) {
                                break;
                            } else {
                                i12 = i42;
                            }
                        }
                    } else if (i41 == 22) {
                        while (i10 <= getMeasuredHeight()) {
                            canvas2.drawCircle(a(AndroidUtilities.dp(20.0f) + r4), org.telegram.messenger.y3.C(6.0f, i10, r4), AndroidUtilities.dp(48.0f) >> 1, paint5);
                            rectF.set(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(16.0f) + i10, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(24.0f) + i10);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                            rectF.set(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(38.0f) + i10, AndroidUtilities.dp(260.0f), AndroidUtilities.dp(46.0f) + i10);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                            i10 = org.telegram.ui.yh.g(this, i10);
                            int i43 = i12 + 1;
                            if (this.y && i43 >= this.H) {
                                break;
                            } else {
                                i12 = i43;
                            }
                        }
                    } else if (i41 == 25) {
                        while (i10 <= getMeasuredHeight()) {
                            canvas2.drawCircle(AndroidUtilities.dp(17.0f) + r4, org.telegram.messenger.y3.C(6.0f, i10, r4), AndroidUtilities.dp(38.0f) >> 1, paint5);
                            rectF.set(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(21.0f) + i10, AndroidUtilities.dp(220.0f), AndroidUtilities.dp(29.0f) + i10);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                            i10 = org.telegram.ui.yh.g(this, i10);
                            int i44 = i12 + 1;
                            if (this.y && i44 >= this.H) {
                                break;
                            } else {
                                i12 = i44;
                            }
                        }
                    } else if (i41 == 26) {
                        while (i10 <= getMeasuredHeight()) {
                            canvas2.drawCircle(LocaleController.isRTL ? org.telegram.messenger.y3.B(21.0f, getMeasuredWidth(), r4) : AndroidUtilities.dp(21.0f) + r4, org.telegram.messenger.y3.C(16.0f, i10, r4), AndroidUtilities.dp(21.0f) >> 1, paint5);
                            rectF.set(AndroidUtilities.dp(60.0f), AndroidUtilities.dp(21.0f) + i10, AndroidUtilities.dp(190.0f), AndroidUtilities.dp(29.0f) + i10);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                            rectF.set(getMeasuredWidth() - AndroidUtilities.dp(16.0f), AndroidUtilities.dp(21.0f) + i10, getMeasuredWidth() - AndroidUtilities.dp(62.0f), AndroidUtilities.dp(29.0f) + i10);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                            i10 = org.telegram.ui.yh.g(this, i10);
                            int i45 = i12 + 1;
                            if (this.y && i45 >= this.H) {
                                break;
                            } else {
                                i12 = i45;
                            }
                        }
                    } else if (getViewType() == 28) {
                        while (i10 <= getMeasuredHeight()) {
                            canvas2.drawCircle(a(org.telegram.messenger.y3.C(10.0f, this.D, r4)), (AndroidUtilities.dp(58.0f) >> 1) + i10, AndroidUtilities.dp(24.0f), paint5);
                            rectF.set(AndroidUtilities.dp(68.0f) + this.D, AndroidUtilities.dp(17.0f) + i10, AndroidUtilities.dp(260.0f) + this.D, AndroidUtilities.dp(25.0f) + i10);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                            rectF.set(AndroidUtilities.dp(68.0f) + this.D, AndroidUtilities.dp(39.0f) + i10, AndroidUtilities.dp(140.0f) + this.D, AndroidUtilities.dp(47.0f) + i10);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                            if (this.w) {
                                rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(20.0f) + i10, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(28.0f) + i10);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                            }
                            i10 = org.telegram.ui.yh.g(this, i10);
                            int i46 = i12 + 1;
                            if (this.y && i46 >= this.H) {
                                break;
                            } else {
                                i12 = i46;
                            }
                        }
                    } else if (getViewType() == 31) {
                        while (i10 <= getMeasuredHeight()) {
                            int c10 = c(getMeasuredWidth());
                            float f18 = i10;
                            rectF.set(AndroidUtilities.dp(18.0f) + this.D, ((c10 - AndroidUtilities.dp(22.0f)) / 2.0f) + f18, AndroidUtilities.dp(40.0f) + this.D, ((AndroidUtilities.dp(22.0f) + c10) / 2.0f) + f18);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), paint5);
                            rectF.set(AndroidUtilities.dp(58.0f) + this.D, ((c10 - AndroidUtilities.dp(8.0f)) / 2.0f) + f18, Math.min(AndroidUtilities.dp(132.0f) + this.D, getMeasuredWidth() - AndroidUtilities.dp(19.0f)), ((AndroidUtilities.dp(8.0f) + c10) / 2.0f) + f18);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                            i10 += c10;
                            int i47 = i12 + 1;
                            if (this.y && i47 >= this.H) {
                                break;
                            } else {
                                i12 = i47;
                            }
                        }
                    } else if (getViewType() == 32) {
                        while (i10 <= getMeasuredHeight()) {
                            int c11 = c(getMeasuredWidth());
                            float f19 = i10;
                            rectF.set(AndroidUtilities.dp(10.0f) + this.D, ((c11 - AndroidUtilities.dp(32.0f)) / 2.0f) + f19, AndroidUtilities.dp(42.0f) + this.D, ((AndroidUtilities.dp(32.0f) + c11) / 2.0f) + f19);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint5);
                            rectF.set(AndroidUtilities.dp(64.0f) + this.D, (((c11 - AndroidUtilities.dp(14.0f)) - AndroidUtilities.dp(10.0f)) / 2.0f) + f19, Math.min(AndroidUtilities.dp(118.0f) + this.D, getMeasuredWidth() - AndroidUtilities.dp(19.0f)), ((AndroidUtilities.dp(10.0f) + (c11 - AndroidUtilities.dp(14.0f))) / 2.0f) + f19);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                            rectF.set(AndroidUtilities.dp(64.0f) + this.D, (((AndroidUtilities.dp(14.0f) + c11) - AndroidUtilities.dp(8.0f)) / 2.0f) + f19, Math.min(AndroidUtilities.dp(144.0f) + this.D, getMeasuredWidth() - AndroidUtilities.dp(19.0f)), ((AndroidUtilities.dp(8.0f) + (AndroidUtilities.dp(14.0f) + c11)) / 2.0f) + f19);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                            i10 += c11;
                            int i48 = i12 + 1;
                            if (this.y && i48 >= this.H) {
                                break;
                            } else {
                                i12 = i48;
                            }
                        }
                    } else if (getViewType() == 34 || getViewType() == 35 || getViewType() == 36) {
                        rectF.set(this.D, this.C, getMeasuredWidth() - this.D, getMeasuredHeight() - this.C);
                        rectF.inset(AndroidUtilities.dp(3.33f), AndroidUtilities.dp(4.0f));
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), paint5);
                    }
                }
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (!this.y) {
            super.onMeasure(i10, i11);
            return;
        }
        int i12 = this.H;
        if (i12 > 1 && this.P) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getAdditionalHeight() + (c(View.MeasureSpec.getSize(i10)) * this.H), TLObject.FLAG_30));
        } else if (i12 <= 1 || View.MeasureSpec.getSize(i11) <= 0) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getAdditionalHeight() + c(View.MeasureSpec.getSize(i10)), TLObject.FLAG_30));
        } else {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getAdditionalHeight() + Math.min(View.MeasureSpec.getSize(i11), c(View.MeasureSpec.getSize(i10)) * this.H), TLObject.FLAG_30));
        }
    }

    public void setGlobalGradientView(u00 u00Var) {
        this.O = u00Var;
    }

    public void setIgnoreHeightCheck(boolean z4) {
        this.P = z4;
    }

    public void setIsSingleCell(boolean z4) {
        this.y = z4;
    }

    public void setItemsCount(int i10) {
        this.H = i10;
    }

    public void setMemberRequestButton(boolean z4) {
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        this.Q = textPaint.measureText(LocaleController.getString(z4 ? R.string.AddToChannel : R.string.AddToGroup)) + AndroidUtilities.dp(34.0f);
    }

    public void setPaddingLeft(int i10) {
        this.D = i10;
        invalidate();
    }

    public void setPaddingTop(int i10) {
        this.C = i10;
        invalidate();
    }

    public void setUseHeaderOffset(boolean z4) {
        this.x = z4;
    }

    public void setViewType(int i10) {
        this.B = i10;
        if (i10 == 11) {
            Random random = new Random();
            this.J = new float[2];
            for (int i11 = 0; i11 < 2; i11++) {
                this.J[i11] = org.telegram.ui.yh.f(random, MediaDataController.MAX_STYLE_RUNS_COUNT) / 1000.0f;
            }
        }
        invalidate();
    }

    public u00(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.c = new Paint();
        this.d = new Paint();
        this.n = new RectF();
        this.w = true;
        this.E = org.telegram.ui.ActionBar.k6.G8;
        this.F = org.telegram.ui.ActionBar.k6.i6;
        this.G = -1;
        this.H = 1;
        this.I = g6Var;
        this.h = new Matrix();
    }
}
