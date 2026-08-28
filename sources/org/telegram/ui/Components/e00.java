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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class e00 extends View implements org.telegram.ui.ActionBar.w5 {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public final org.telegram.ui.ActionBar.b6 H;
    public float[] I;
    public Paint J;
    public int K;
    public int L;
    public float M;
    public e00 N;
    public boolean O;
    public float P;
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

    public e00(Context context) {
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

    public final int c(int i9) {
        switch (getViewType()) {
            case 1:
                return AndroidUtilities.dp(78.0f) + 1;
            case 2:
                return AndroidUtilities.dp(2.0f) + ((i9 - ((getColumnsCount() - 1) * AndroidUtilities.dp(2.0f))) / getColumnsCount());
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

    @Override // org.telegram.ui.ActionBar.w5
    public final void d() {
        int i9;
        e00 e00Var = this.N;
        if (e00Var != null) {
            e00Var.d();
            return;
        }
        int i10 = this.D;
        org.telegram.ui.ActionBar.b6 b6Var = this.H;
        int v02 = org.telegram.ui.ActionBar.f6.v0(i10, b6Var);
        int v03 = org.telegram.ui.ActionBar.f6.v0(this.E, b6Var);
        if (this.s == v03 && this.r == v02) {
            return;
        }
        this.r = v02;
        this.s = v03;
        int i11 = this.A;
        if (i11 == 34 || i11 == 35 || i11 == 36) {
            this.a = AndroidUtilities.displaySize.x;
        } else if (this.y || i11 == 13 || i11 == 14 || i11 == 17) {
            this.a = AndroidUtilities.dp(200.0f);
        } else {
            this.a = AndroidUtilities.dp(600.0f);
        }
        if (this.y || (i9 = this.A) == 13 || i9 == 14 || i9 == 17) {
            this.b = new LinearGradient(0.0f, 0.0f, this.a, 0.0f, new int[]{v03, v02, v02, v03}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        } else {
            this.b = new LinearGradient(0.0f, 0.0f, 0.0f, this.a, new int[]{v03, v02, v02, v03}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
        this.c.setShader(this.b);
    }

    public final int e(int i9) {
        return org.telegram.ui.ActionBar.f6.v0(i9, this.H);
    }

    public final void f(int i9, int i10, int i11) {
        this.D = i9;
        this.E = i10;
        this.F = i11;
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
        return this.A;
    }

    public final void h() {
        e00 e00Var = this.N;
        if (e00Var != null) {
            e00Var.h();
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
        int i9 = this.K;
        if (i9 == 0) {
            i9 = getMeasuredWidth();
        }
        int i10 = this.A;
        if (i10 == 34 || i10 == 35 || i10 == 36) {
            i9 = Math.max(i9, AndroidUtilities.displaySize.x);
        }
        int i11 = this.L;
        if (i11 == 0) {
            i11 = getMeasuredHeight();
        }
        this.e = elapsedRealtime;
        boolean z10 = this.y;
        Matrix matrix = this.h;
        if (z10 || this.A == 13 || getViewType() == 14 || getViewType() == 17) {
            int i12 = (int) (((abs * i9) / 400.0f) + this.f);
            this.f = i12;
            if (i12 >= i9 * 2) {
                this.f = (-this.a) * 2;
            }
            matrix.setTranslate(this.f + this.M, 0.0f);
        } else {
            int i13 = (int) (((abs * i11) / 400.0f) + this.f);
            this.f = i13;
            if (i13 >= i11 * 2) {
                this.f = (-this.a) * 2;
            }
            matrix.setTranslate(this.M, this.f);
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
        if (this.N != null) {
            if (getParent() != null) {
                View view = (View) getParent();
                e00 e00Var = this.N;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                float f11 = -getX();
                e00Var.K = measuredWidth;
                e00Var.L = measuredHeight;
                e00Var.M = f11;
            }
            paint = this.N.c;
        } else {
            paint = this.c;
        }
        Paint paint3 = paint;
        if (getViewType() == 34 || getViewType() == 35 || getViewType() == 36) {
            this.M = -getX();
        }
        d();
        h();
        int i9 = this.B;
        if (this.x) {
            int dp = AndroidUtilities.dp(32.0f) + i9;
            int i10 = this.F;
            if (i10 >= 0) {
                this.d.setColor(e(i10));
            }
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(32.0f), this.F >= 0 ? this.d : paint3);
            canvas2 = canvas;
            i9 = dp;
        } else {
            canvas2 = canvas;
        }
        int viewType = getViewType();
        int i11 = 0;
        int i12 = 1;
        RectF rectF = this.n;
        if (viewType == 7) {
            while (i9 <= getMeasuredHeight()) {
                int c10 = c(getMeasuredWidth());
                canvas2.drawCircle(a(AndroidUtilities.dp(10.0f) + r4), (c10 >> 1) + i9, AndroidUtilities.dp(28.0f), paint3);
                rectF.set(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(16.0f) + i9, AndroidUtilities.dp(148.0f), AndroidUtilities.dp(24.0f) + i9);
                b(rectF);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint3);
                rectF.set(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(38.0f) + i9, AndroidUtilities.dp(268.0f), AndroidUtilities.dp(46.0f) + i9);
                b(rectF);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint3);
                if (SharedConfig.useThreeLinesLayout) {
                    rectF.set(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(54.0f) + i9, AndroidUtilities.dp(220.0f), AndroidUtilities.dp(62.0f) + i9);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint3);
                }
                if (this.w) {
                    rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(16.0f) + i9, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(24.0f) + i9);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint3);
                }
                i9 = org.telegram.ui.Cells.j2.f(this, i9);
                int i13 = i11 + 1;
                if (this.y && i13 >= this.G) {
                    break;
                } else {
                    i11 = i13;
                }
            }
        } else if (getViewType() == 24) {
            while (i9 <= getMeasuredHeight()) {
                canvas2.drawCircle(a(AndroidUtilities.dp(10.0f) + r3), org.telegram.messenger.l0.C(10.0f, i9, r3), AndroidUtilities.dp(14.0f), paint3);
                canvas2.save();
                canvas2.translate(0.0f, -AndroidUtilities.dp(4.0f));
                rectF.set(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(16.0f) + i9, AndroidUtilities.dp(148.0f), AndroidUtilities.dp(24.0f) + i9);
                b(rectF);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint3);
                rectF.set(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(38.0f) + i9, AndroidUtilities.dp(268.0f), AndroidUtilities.dp(46.0f) + i9);
                b(rectF);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint3);
                if (SharedConfig.useThreeLinesLayout) {
                    rectF.set(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(54.0f) + i9, AndroidUtilities.dp(220.0f), AndroidUtilities.dp(62.0f) + i9);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint3);
                }
                if (this.w) {
                    rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(16.0f) + i9, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(24.0f) + i9);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint3);
                }
                canvas2.restore();
                i9 += c(getMeasuredWidth());
                int i14 = i11 + 1;
                if (this.y && i14 >= this.G) {
                    break;
                } else {
                    i11 = i14;
                }
            }
        } else if (getViewType() == 18) {
            int i15 = i9;
            while (i15 <= getMeasuredHeight()) {
                canvas2.drawCircle(a(org.telegram.messenger.l0.C(9.0f, this.C, r1)), AndroidUtilities.dp(32.0f) + i15, AndroidUtilities.dp(25.0f), paint3);
                int i16 = i11 % 2 == 0 ? 52 : 72;
                float f12 = 76;
                rectF.set(AndroidUtilities.dp(f12), AndroidUtilities.dp(20.0f) + i15, AndroidUtilities.dp(i16 + 76), AndroidUtilities.dp(28.0f) + i15);
                b(rectF);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint3);
                rectF.set(AndroidUtilities.dp(i16 + 84), AndroidUtilities.dp(20.0f) + i15, AndroidUtilities.dp(i16 + 168), AndroidUtilities.dp(28.0f) + i15);
                b(rectF);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint3);
                rectF.set(AndroidUtilities.dp(f12), AndroidUtilities.dp(42.0f) + i15, AndroidUtilities.dp(140), AndroidUtilities.dp(50.0f) + i15);
                b(rectF);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint3);
                Canvas canvas3 = canvas2;
                Paint paint4 = paint3;
                canvas3.drawLine(AndroidUtilities.dp(f12), org.telegram.ui.Cells.j2.f(this, i15), getMeasuredWidth(), org.telegram.ui.Cells.j2.f(this, i15), paint4);
                canvas2 = canvas3;
                i15 = org.telegram.ui.Cells.j2.f(this, i15);
                int i17 = i11 + 1;
                if (this.y && i17 >= this.G) {
                    break;
                }
                i11 = i17;
                paint3 = paint4;
            }
        } else {
            Paint paint5 = paint3;
            if (getViewType() == 19) {
                int i18 = i9;
                while (i18 <= getMeasuredHeight()) {
                    canvas2.drawCircle(a(org.telegram.messenger.l0.C(9.0f, this.C, r1)), AndroidUtilities.dp(29.0f) + i18, AndroidUtilities.dp(20.0f), paint5);
                    float f13 = 76;
                    rectF.set(AndroidUtilities.dp(f13), AndroidUtilities.dp(16.0f) + i18, AndroidUtilities.dp((i11 % 2 == 0 ? 92 : 128) + 76), AndroidUtilities.dp(24.0f) + i18);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                    rectF.set(AndroidUtilities.dp(f13), AndroidUtilities.dp(38.0f) + i18, AndroidUtilities.dp(240), AndroidUtilities.dp(46.0f) + i18);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                    Canvas canvas4 = canvas2;
                    Paint paint6 = paint5;
                    canvas4.drawLine(AndroidUtilities.dp(f13), org.telegram.ui.Cells.j2.f(this, i18), getMeasuredWidth(), org.telegram.ui.Cells.j2.f(this, i18), paint6);
                    canvas2 = canvas4;
                    paint5 = paint6;
                    i18 = org.telegram.ui.Cells.j2.f(this, i18);
                    int i19 = i11 + 1;
                    if (this.y && i19 >= this.G) {
                        break;
                    } else {
                        i11 = i19;
                    }
                }
            } else if (getViewType() == 1) {
                while (i9 <= getMeasuredHeight()) {
                    canvas2.drawCircle(a(AndroidUtilities.dp(9.0f) + r4), (AndroidUtilities.dp(78.0f) >> 1) + i9, AndroidUtilities.dp(25.0f), paint5);
                    rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(20.0f) + i9, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(28.0f) + i9);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                    rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(42.0f) + i9, AndroidUtilities.dp(260.0f), AndroidUtilities.dp(50.0f) + i9);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                    if (this.w) {
                        rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(20.0f) + i9, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(28.0f) + i9);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                    }
                    i9 = org.telegram.ui.Cells.j2.f(this, i9);
                    int i20 = i11 + 1;
                    if (this.y && i20 >= this.G) {
                        break;
                    } else {
                        i11 = i20;
                    }
                }
            } else if (getViewType() == 2 || getViewType() == 27) {
                int measuredWidth2 = (getMeasuredWidth() - ((getColumnsCount() - 1) * AndroidUtilities.dp(2.0f))) / getColumnsCount();
                int i21 = getViewType() == 27 ? (int) (measuredWidth2 * 1.25f) : measuredWidth2;
                int i22 = i9;
                int i23 = 0;
                while (true) {
                    if (i22 >= getMeasuredHeight() && !this.y) {
                        break;
                    }
                    int i24 = 0;
                    while (i24 < getColumnsCount()) {
                        if (i23 != 0 || i24 >= this.v) {
                            paint2 = paint5;
                            canvas.drawRect((AndroidUtilities.dp(2.0f) + measuredWidth2) * i24, i22, r1 + measuredWidth2, i22 + i21, paint2);
                        } else {
                            paint2 = paint5;
                        }
                        i24++;
                        paint5 = paint2;
                    }
                    Paint paint7 = paint5;
                    i22 = org.telegram.messenger.l0.C(2.0f, i21, i22);
                    i23++;
                    if (this.y && i23 >= 2) {
                        break;
                    }
                    paint5 = paint7;
                }
            } else {
                float f14 = 8.0f;
                if (getViewType() == 3) {
                    while (i9 <= getMeasuredHeight()) {
                        rectF.set(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f) + i9, AndroidUtilities.dp(52.0f), AndroidUtilities.dp(48.0f) + i9);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(12.0f) + i9, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(20.0f) + i9);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(34.0f) + i9, AndroidUtilities.dp(260.0f), AndroidUtilities.dp(42.0f) + i9);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        if (this.w) {
                            rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(12.0f) + i9, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(20.0f) + i9);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        }
                        i9 = org.telegram.ui.Cells.j2.f(this, i9);
                        int i25 = i11 + 1;
                        if (this.y && i25 >= this.G) {
                            break;
                        } else {
                            i11 = i25;
                        }
                    }
                } else if (getViewType() == 4) {
                    while (i9 <= getMeasuredHeight()) {
                        canvas2.drawCircle(a(AndroidUtilities.dp(12.0f) + r4), org.telegram.messenger.l0.C(6.0f, i9, r4), AndroidUtilities.dp(44.0f) >> 1, paint5);
                        rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(12.0f) + i9, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(20.0f) + i9);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(34.0f) + i9, AndroidUtilities.dp(260.0f), AndroidUtilities.dp(42.0f) + i9);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        if (this.w) {
                            rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(12.0f) + i9, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(20.0f) + i9);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        }
                        i9 = org.telegram.ui.Cells.j2.f(this, i9);
                        int i26 = i11 + 1;
                        if (this.y && i26 >= this.G) {
                            break;
                        } else {
                            i11 = i26;
                        }
                    }
                } else if (getViewType() == 5) {
                    while (i9 <= getMeasuredHeight()) {
                        rectF.set(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(11.0f) + i9, AndroidUtilities.dp(62.0f), AndroidUtilities.dp(63.0f) + i9);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(12.0f) + i9, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(20.0f) + i9);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(34.0f) + i9, AndroidUtilities.dp(268.0f), AndroidUtilities.dp(42.0f) + i9);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(54.0f) + i9, AndroidUtilities.dp(188.0f), AndroidUtilities.dp(62.0f) + i9);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        if (this.w) {
                            rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(12.0f) + i9, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(20.0f) + i9);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        }
                        i9 = org.telegram.ui.Cells.j2.f(this, i9);
                        int i27 = i11 + 1;
                        if (this.y && i27 >= this.G) {
                            break;
                        } else {
                            i11 = i27;
                        }
                    }
                } else if (getViewType() == 6 || getViewType() == 10) {
                    while (i9 <= getMeasuredHeight()) {
                        canvas2.drawCircle(a(org.telegram.messenger.l0.C(9.0f, this.C, r4)), (AndroidUtilities.dp(64.0f) >> 1) + i9, AndroidUtilities.dp(23.0f), paint5);
                        rectF.set(AndroidUtilities.dp(68.0f) + this.C, AndroidUtilities.dp(17.0f) + i9, AndroidUtilities.dp(260.0f) + this.C, AndroidUtilities.dp(25.0f) + i9);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(AndroidUtilities.dp(68.0f) + this.C, AndroidUtilities.dp(39.0f) + i9, AndroidUtilities.dp(140.0f) + this.C, AndroidUtilities.dp(47.0f) + i9);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        if (this.w) {
                            rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(20.0f) + i9, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(28.0f) + i9);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        }
                        i9 = org.telegram.ui.Cells.j2.f(this, i9);
                        int i28 = i11 + 1;
                        if (this.y && i28 >= this.G) {
                            break;
                        } else {
                            i11 = i28;
                        }
                    }
                } else if (getViewType() == 29) {
                    while (i9 <= getMeasuredHeight()) {
                        canvas2.drawCircle(a(org.telegram.messenger.l0.C(9.0f, this.C, r4)), (AndroidUtilities.dp(64.0f) >> 1) + i9, AndroidUtilities.dp(23.0f), paint5);
                        rectF.set(AndroidUtilities.dp(68.0f) + this.C, AndroidUtilities.dp(17.0f) + i9, AndroidUtilities.dp(260.0f) + this.C, AndroidUtilities.dp(25.0f) + i9);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(AndroidUtilities.dp(68.0f) + this.C, AndroidUtilities.dp(39.0f) + i9, AndroidUtilities.dp(140.0f) + this.C, AndroidUtilities.dp(47.0f) + i9);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        i9 = org.telegram.ui.Cells.j2.f(this, i9);
                        int i29 = i11 + 1;
                        if (this.y && i29 >= this.G) {
                            break;
                        } else {
                            i11 = i29;
                        }
                    }
                } else if (getViewType() == 33) {
                    while (i9 <= getMeasuredHeight()) {
                        canvas2.drawCircle(a(org.telegram.messenger.l0.C(13.0f, this.C, r4)), (AndroidUtilities.dp(58.0f) >> 1) + i9, AndroidUtilities.dp(23.0f), paint5);
                        rectF.set(AndroidUtilities.dp(72.0f) + this.C, AndroidUtilities.dp(17.0f) + i9, AndroidUtilities.dp(260.0f) + this.C, AndroidUtilities.dp(25.0f) + i9);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(AndroidUtilities.dp(72.0f) + this.C, AndroidUtilities.dp(39.0f) + i9, AndroidUtilities.dp(140.0f) + this.C, AndroidUtilities.dp(47.0f) + i9);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        i9 = org.telegram.ui.Cells.j2.f(this, i9);
                        int i30 = i11 + 1;
                        if (this.y && i30 >= this.G) {
                            break;
                        } else {
                            i11 = i30;
                        }
                    }
                } else if (getViewType() == 30) {
                    while (i9 <= getMeasuredHeight()) {
                        i9 += c(getMeasuredWidth());
                        rectF.set(0.0f, i9, getMeasuredWidth(), i9);
                        b(rectF);
                        canvas2.drawRect(rectF, paint5);
                        int i31 = i11 + 1;
                        if (this.y && i31 >= this.G) {
                            break;
                        } else {
                            i11 = i31;
                        }
                    }
                } else if (getViewType() == 8) {
                    while (i9 <= getMeasuredHeight()) {
                        canvas2.drawCircle(a(org.telegram.messenger.l0.C(11.0f, this.C, r4)), (AndroidUtilities.dp(64.0f) >> 1) + i9, AndroidUtilities.dp(23.0f), paint5);
                        rectF.set(AndroidUtilities.dp(68.0f) + this.C, AndroidUtilities.dp(17.0f) + i9, AndroidUtilities.dp(140.0f) + this.C, AndroidUtilities.dp(25.0f) + i9);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(AndroidUtilities.dp(68.0f) + this.C, AndroidUtilities.dp(39.0f) + i9, AndroidUtilities.dp(260.0f) + this.C, AndroidUtilities.dp(47.0f) + i9);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        if (this.w) {
                            rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(20.0f) + i9, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(28.0f) + i9);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        }
                        i9 = org.telegram.ui.Cells.j2.f(this, i9);
                        int i32 = i11 + 1;
                        if (this.y && i32 >= this.G) {
                            break;
                        } else {
                            i11 = i32;
                        }
                    }
                } else if (getViewType() == 9) {
                    while (i9 <= getMeasuredHeight()) {
                        canvas2.drawCircle(a(AndroidUtilities.dp(35.0f)), (c(getMeasuredWidth()) >> 1) + i9, AndroidUtilities.dp(32.0f) / 2, paint5);
                        rectF.set(AndroidUtilities.dp(72.0f), AndroidUtilities.dp(16.0f) + i9, AndroidUtilities.dp(268.0f), AndroidUtilities.dp(24.0f) + i9);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(AndroidUtilities.dp(72.0f), AndroidUtilities.dp(38.0f) + i9, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(46.0f) + i9);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        if (this.w) {
                            rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(16.0f) + i9, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(24.0f) + i9);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        }
                        i9 = org.telegram.ui.Cells.j2.f(this, i9);
                        int i33 = i11 + 1;
                        if (this.y && i33 >= this.G) {
                            break;
                        } else {
                            i11 = i33;
                        }
                    }
                } else if (getViewType() == 11) {
                    int i34 = 0;
                    while (i9 <= getMeasuredHeight()) {
                        rectF.set(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(14.0f), (getMeasuredWidth() * 0.5f) + AndroidUtilities.dp(this.I[0] * 40.0f), AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(14.0f));
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(getMeasuredWidth() - AndroidUtilities.dp(18.0f), AndroidUtilities.dp(14.0f), (getMeasuredWidth() - (getMeasuredWidth() * 0.2f)) - AndroidUtilities.dp(this.I[0] * 20.0f), AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(14.0f));
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        i9 = org.telegram.ui.Cells.j2.f(this, i9);
                        i34++;
                        if (this.y && i34 >= this.G) {
                            break;
                        }
                    }
                } else if (getViewType() == 12) {
                    int dp2 = AndroidUtilities.dp(14.0f) + i9;
                    while (dp2 <= getMeasuredHeight()) {
                        int measuredWidth3 = getMeasuredWidth() / 4;
                        for (int i35 = 0; i35 < 4; i35++) {
                            float f15 = (measuredWidth3 / 2.0f) + (measuredWidth3 * i35);
                            canvas2.drawCircle(f15, (AndroidUtilities.dp(56.0f) / 2.0f) + AndroidUtilities.dp(7.0f) + dp2, AndroidUtilities.dp(28.0f), paint5);
                            float dp3 = AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(56.0f) + AndroidUtilities.dp(7.0f) + dp2;
                            RectF rectF2 = AndroidUtilities.rectTmp;
                            rectF2.set(f15 - AndroidUtilities.dp(24.0f), dp3 - AndroidUtilities.dp(4.0f), f15 + AndroidUtilities.dp(24.0f), dp3 + AndroidUtilities.dp(4.0f));
                            canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        }
                        dp2 = org.telegram.ui.Cells.j2.f(this, dp2);
                        if (this.y) {
                            break;
                        }
                    }
                } else if (getViewType() == 13) {
                    float measuredHeight2 = getMeasuredHeight() / 2.0f;
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(AndroidUtilities.dp(40.0f), measuredHeight2 - AndroidUtilities.dp(4.0f), getMeasuredWidth() - AndroidUtilities.dp(120.0f), AndroidUtilities.dp(4.0f) + measuredHeight2);
                    canvas2.drawRoundRect(rectF3, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                    if (this.J == null) {
                        Paint paint8 = new Paint(1);
                        this.J = paint8;
                        paint8.setColor(org.telegram.ui.ActionBar.f6.u0(org.telegram.ui.ActionBar.f6.G8));
                    }
                    for (int i36 = 0; i36 < 3; i36++) {
                        canvas2.drawCircle(org.telegram.messenger.l0.D(12.0f, i36, AndroidUtilities.dp(13.0f) + (getMeasuredWidth() - AndroidUtilities.dp(56.0f))), measuredHeight2, AndroidUtilities.dp(13.0f), this.J);
                        canvas2.drawCircle(org.telegram.messenger.l0.D(12.0f, i36, AndroidUtilities.dp(13.0f) + (getMeasuredWidth() - AndroidUtilities.dp(56.0f))), measuredHeight2, AndroidUtilities.dp(12.0f), paint5);
                    }
                } else if (getViewType() == 14 || getViewType() == 17) {
                    int dp4 = AndroidUtilities.dp(12.0f);
                    int dp5 = AndroidUtilities.dp(77.0f);
                    int dp6 = AndroidUtilities.dp(4.0f);
                    float dp7 = AndroidUtilities.dp(21.0f);
                    float dp8 = AndroidUtilities.dp(41.0f);
                    while (dp4 < getMeasuredWidth()) {
                        if (this.J == null) {
                            this.J = new Paint(i12);
                        }
                        this.J.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.h5, this.H));
                        RectF rectF4 = AndroidUtilities.rectTmp;
                        int i37 = dp4 + dp5;
                        rectF4.set(AndroidUtilities.dp(4.0f) + dp4, AndroidUtilities.dp(4.0f), i37 - AndroidUtilities.dp(4.0f), getMeasuredHeight() - AndroidUtilities.dp(4.0f));
                        canvas2.drawRoundRect(rectF4, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint5);
                        if (getViewType() == 14) {
                            float dp9 = AndroidUtilities.dp(f14) + dp6;
                            float f16 = dp4;
                            float dp10 = AndroidUtilities.dp(22.0f) + dp6 + f16;
                            rectF.set(dp10, dp9, dp10 + dp8, dp9 + dp7);
                            canvas2.drawRoundRect(rectF, rectF.height() * 0.5f, rectF.height() * 0.5f, this.J);
                            float dp11 = AndroidUtilities.dp(4.0f) + dp7 + dp9;
                            float dp12 = f16 + AndroidUtilities.dp(5.0f) + dp6;
                            rectF.set(dp12, dp11, dp12 + dp8, dp11 + dp7);
                            canvas2.drawRoundRect(rectF, rectF.height() * 0.5f, rectF.height() * 0.5f, this.J);
                        } else if (getViewType() == 17) {
                            float dp13 = AndroidUtilities.dp(5.0f);
                            float dp14 = AndroidUtilities.dp(32.0f);
                            f10 = 8.0f;
                            float A = e2.c.A(dp5, dp14, 2.0f, dp4);
                            rectF4.set(A, AndroidUtilities.dp(21.0f), dp14 + A, AndroidUtilities.dp(32.0f) + r13);
                            canvas2.drawRoundRect(rectF4, dp13, dp13, this.J);
                            canvas2.drawCircle((dp5 / 2) + dp4, getMeasuredHeight() - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(f10), this.J);
                            dp4 = i37;
                            i12 = 1;
                            f14 = 8.0f;
                        }
                        f10 = 8.0f;
                        canvas2.drawCircle((dp5 / 2) + dp4, getMeasuredHeight() - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(f10), this.J);
                        dp4 = i37;
                        i12 = 1;
                        f14 = 8.0f;
                    }
                } else if (getViewType() == 15) {
                    int dp15 = AndroidUtilities.dp(23.0f);
                    int dp16 = AndroidUtilities.dp(4.0f);
                    while (i9 <= getMeasuredHeight()) {
                        canvas2.drawCircle(a(org.telegram.messenger.l0.C(12.0f, this.C, dp15)), org.telegram.messenger.l0.C(8.0f, i9, dp15), dp15, paint5);
                        rectF.set(AndroidUtilities.dp(74.0f) + this.C, AndroidUtilities.dp(12.0f) + i9, AndroidUtilities.dp(260.0f) + this.C, AndroidUtilities.dp(20.0f) + i9);
                        b(rectF);
                        float f17 = dp16;
                        canvas2.drawRoundRect(rectF, f17, f17, paint5);
                        rectF.set(AndroidUtilities.dp(74.0f) + this.C, AndroidUtilities.dp(36.0f) + i9, AndroidUtilities.dp(140.0f) + this.C, AndroidUtilities.dp(42.0f) + i9);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, f17, f17, paint5);
                        if (this.P > 0.0f) {
                            rectF.set(AndroidUtilities.dp(73.0f) + this.C, AndroidUtilities.dp(62.0f) + i9, AndroidUtilities.dp(73.0f) + this.C + this.P, AndroidUtilities.dp(94.0f) + i9);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, f17, f17, paint5);
                        }
                        i9 = org.telegram.ui.Cells.j2.f(this, i9);
                        int i38 = i11 + 1;
                        if (this.y && i38 >= this.G) {
                            break;
                        } else {
                            i11 = i38;
                        }
                    }
                } else if (getViewType() == 16 || getViewType() == 23) {
                    int i39 = 0;
                    while (i9 <= getMeasuredHeight()) {
                        canvas2.drawCircle(a(org.telegram.messenger.l0.C(8.0f, this.C, r6)), AndroidUtilities.dp(24.0f) + i9, AndroidUtilities.dp(18.0f), paint5);
                        rectF.set(AndroidUtilities.dp(58.0f) + this.C, AndroidUtilities.dp(20.0f) + i9, getWidth() - AndroidUtilities.dp(53.0f), AndroidUtilities.dp(28.0f) + i9);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint5);
                        if (i39 < 4) {
                            canvas2.drawCircle(a(org.telegram.messenger.l0.B(12.0f, getWidth(), r6)), AndroidUtilities.dp(24.0f) + i9, AndroidUtilities.dp(12.0f), paint5);
                        }
                        i9 = org.telegram.ui.Cells.j2.f(this, i9);
                        i39++;
                        if (this.y && i39 >= this.G) {
                            break;
                        }
                    }
                    rectF.set(AndroidUtilities.dp(8.0f) + this.C, AndroidUtilities.dp(20.0f) + i9, getWidth() - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(28.0f) + i9);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint5);
                    rectF.set(AndroidUtilities.dp(8.0f) + this.C, AndroidUtilities.dp(36.0f) + i9, getWidth() - AndroidUtilities.dp(53.0f), AndroidUtilities.dp(44.0f) + i9);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint5);
                } else {
                    int i40 = this.A;
                    if (i40 == 21) {
                        while (i9 <= getMeasuredHeight()) {
                            canvas2.drawCircle(a(AndroidUtilities.dp(20.0f) + r4), (AndroidUtilities.dp(58.0f) >> 1) + i9, AndroidUtilities.dp(46.0f) >> 1, paint5);
                            rectF.set(AndroidUtilities.dp(74.0f), AndroidUtilities.dp(16.0f) + i9, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(24.0f) + i9);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                            rectF.set(AndroidUtilities.dp(74.0f), AndroidUtilities.dp(38.0f) + i9, AndroidUtilities.dp(260.0f), AndroidUtilities.dp(46.0f) + i9);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                            i9 = org.telegram.ui.Cells.j2.f(this, i9);
                            int i41 = i11 + 1;
                            if (this.y && i41 >= this.G) {
                                break;
                            } else {
                                i11 = i41;
                            }
                        }
                    } else if (i40 == 22) {
                        while (i9 <= getMeasuredHeight()) {
                            canvas2.drawCircle(a(AndroidUtilities.dp(20.0f) + r4), org.telegram.messenger.l0.C(6.0f, i9, r4), AndroidUtilities.dp(48.0f) >> 1, paint5);
                            rectF.set(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(16.0f) + i9, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(24.0f) + i9);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                            rectF.set(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(38.0f) + i9, AndroidUtilities.dp(260.0f), AndroidUtilities.dp(46.0f) + i9);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                            i9 = org.telegram.ui.Cells.j2.f(this, i9);
                            int i42 = i11 + 1;
                            if (this.y && i42 >= this.G) {
                                break;
                            } else {
                                i11 = i42;
                            }
                        }
                    } else if (i40 == 25) {
                        while (i9 <= getMeasuredHeight()) {
                            canvas2.drawCircle(AndroidUtilities.dp(17.0f) + r4, org.telegram.messenger.l0.C(6.0f, i9, r4), AndroidUtilities.dp(38.0f) >> 1, paint5);
                            rectF.set(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(21.0f) + i9, AndroidUtilities.dp(220.0f), AndroidUtilities.dp(29.0f) + i9);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                            i9 = org.telegram.ui.Cells.j2.f(this, i9);
                            int i43 = i11 + 1;
                            if (this.y && i43 >= this.G) {
                                break;
                            } else {
                                i11 = i43;
                            }
                        }
                    } else if (i40 == 26) {
                        while (i9 <= getMeasuredHeight()) {
                            canvas2.drawCircle(LocaleController.isRTL ? org.telegram.messenger.l0.B(21.0f, getMeasuredWidth(), r4) : AndroidUtilities.dp(21.0f) + r4, org.telegram.messenger.l0.C(16.0f, i9, r4), AndroidUtilities.dp(21.0f) >> 1, paint5);
                            rectF.set(AndroidUtilities.dp(60.0f), AndroidUtilities.dp(21.0f) + i9, AndroidUtilities.dp(190.0f), AndroidUtilities.dp(29.0f) + i9);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                            rectF.set(getMeasuredWidth() - AndroidUtilities.dp(16.0f), AndroidUtilities.dp(21.0f) + i9, getMeasuredWidth() - AndroidUtilities.dp(62.0f), AndroidUtilities.dp(29.0f) + i9);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                            i9 = org.telegram.ui.Cells.j2.f(this, i9);
                            int i44 = i11 + 1;
                            if (this.y && i44 >= this.G) {
                                break;
                            } else {
                                i11 = i44;
                            }
                        }
                    } else if (getViewType() == 28) {
                        while (i9 <= getMeasuredHeight()) {
                            canvas2.drawCircle(a(org.telegram.messenger.l0.C(10.0f, this.C, r4)), (AndroidUtilities.dp(58.0f) >> 1) + i9, AndroidUtilities.dp(24.0f), paint5);
                            rectF.set(AndroidUtilities.dp(68.0f) + this.C, AndroidUtilities.dp(17.0f) + i9, AndroidUtilities.dp(260.0f) + this.C, AndroidUtilities.dp(25.0f) + i9);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                            rectF.set(AndroidUtilities.dp(68.0f) + this.C, AndroidUtilities.dp(39.0f) + i9, AndroidUtilities.dp(140.0f) + this.C, AndroidUtilities.dp(47.0f) + i9);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                            if (this.w) {
                                rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(20.0f) + i9, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(28.0f) + i9);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                            }
                            i9 = org.telegram.ui.Cells.j2.f(this, i9);
                            int i45 = i11 + 1;
                            if (this.y && i45 >= this.G) {
                                break;
                            } else {
                                i11 = i45;
                            }
                        }
                    } else if (getViewType() == 31) {
                        while (i9 <= getMeasuredHeight()) {
                            int c11 = c(getMeasuredWidth());
                            float f18 = i9;
                            rectF.set(AndroidUtilities.dp(18.0f) + this.C, ((c11 - AndroidUtilities.dp(22.0f)) / 2.0f) + f18, AndroidUtilities.dp(40.0f) + this.C, ((AndroidUtilities.dp(22.0f) + c11) / 2.0f) + f18);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), paint5);
                            rectF.set(AndroidUtilities.dp(58.0f) + this.C, ((c11 - AndroidUtilities.dp(8.0f)) / 2.0f) + f18, Math.min(AndroidUtilities.dp(132.0f) + this.C, getMeasuredWidth() - AndroidUtilities.dp(19.0f)), ((AndroidUtilities.dp(8.0f) + c11) / 2.0f) + f18);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                            i9 += c11;
                            int i46 = i11 + 1;
                            if (this.y && i46 >= this.G) {
                                break;
                            } else {
                                i11 = i46;
                            }
                        }
                    } else if (getViewType() == 32) {
                        while (i9 <= getMeasuredHeight()) {
                            int c12 = c(getMeasuredWidth());
                            float f19 = i9;
                            rectF.set(AndroidUtilities.dp(10.0f) + this.C, ((c12 - AndroidUtilities.dp(32.0f)) / 2.0f) + f19, AndroidUtilities.dp(42.0f) + this.C, ((AndroidUtilities.dp(32.0f) + c12) / 2.0f) + f19);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint5);
                            rectF.set(AndroidUtilities.dp(64.0f) + this.C, (((c12 - AndroidUtilities.dp(14.0f)) - AndroidUtilities.dp(10.0f)) / 2.0f) + f19, Math.min(AndroidUtilities.dp(118.0f) + this.C, getMeasuredWidth() - AndroidUtilities.dp(19.0f)), ((AndroidUtilities.dp(10.0f) + (c12 - AndroidUtilities.dp(14.0f))) / 2.0f) + f19);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                            rectF.set(AndroidUtilities.dp(64.0f) + this.C, (((AndroidUtilities.dp(14.0f) + c12) - AndroidUtilities.dp(8.0f)) / 2.0f) + f19, Math.min(AndroidUtilities.dp(144.0f) + this.C, getMeasuredWidth() - AndroidUtilities.dp(19.0f)), ((AndroidUtilities.dp(8.0f) + (AndroidUtilities.dp(14.0f) + c12)) / 2.0f) + f19);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                            i9 += c12;
                            int i47 = i11 + 1;
                            if (this.y && i47 >= this.G) {
                                break;
                            } else {
                                i11 = i47;
                            }
                        }
                    } else if (getViewType() == 34 || getViewType() == 35 || getViewType() == 36) {
                        rectF.set(this.C, this.B, getMeasuredWidth() - this.C, getMeasuredHeight() - this.B);
                        rectF.inset(AndroidUtilities.dp(3.33f), AndroidUtilities.dp(4.0f));
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), paint5);
                    }
                }
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public void onMeasure(int i9, int i10) {
        if (!this.y) {
            super.onMeasure(i9, i10);
            return;
        }
        int i11 = this.G;
        if (i11 > 1 && this.O) {
            super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(getAdditionalHeight() + (c(View.MeasureSpec.getSize(i9)) * this.G), TLObject.FLAG_30));
        } else if (i11 <= 1 || View.MeasureSpec.getSize(i10) <= 0) {
            super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(getAdditionalHeight() + c(View.MeasureSpec.getSize(i9)), TLObject.FLAG_30));
        } else {
            super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(getAdditionalHeight() + Math.min(View.MeasureSpec.getSize(i10), c(View.MeasureSpec.getSize(i9)) * this.G), TLObject.FLAG_30));
        }
    }

    public void setGlobalGradientView(e00 e00Var) {
        this.N = e00Var;
    }

    public void setIgnoreHeightCheck(boolean z10) {
        this.O = z10;
    }

    public void setIsSingleCell(boolean z10) {
        this.y = z10;
    }

    public void setItemsCount(int i9) {
        this.G = i9;
    }

    public void setMemberRequestButton(boolean z10) {
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        this.P = textPaint.measureText(LocaleController.getString(z10 ? R.string.AddToChannel : R.string.AddToGroup)) + AndroidUtilities.dp(34.0f);
    }

    public void setPaddingLeft(int i9) {
        this.C = i9;
        invalidate();
    }

    public void setPaddingTop(int i9) {
        this.B = i9;
        invalidate();
    }

    public void setUseHeaderOffset(boolean z10) {
        this.x = z10;
    }

    public void setViewType(int i9) {
        this.A = i9;
        if (i9 == 11) {
            Random random = new Random();
            this.I = new float[2];
            for (int i10 = 0; i10 < 2; i10++) {
                this.I[i10] = org.telegram.ui.Cells.j2.e(random, MediaDataController.MAX_STYLE_RUNS_COUNT) / 1000.0f;
            }
        }
        invalidate();
    }

    public e00(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.c = new Paint();
        this.d = new Paint();
        this.n = new RectF();
        this.w = true;
        this.D = org.telegram.ui.ActionBar.f6.G8;
        this.E = org.telegram.ui.ActionBar.f6.i6;
        this.F = -1;
        this.G = 1;
        this.H = b6Var;
        this.h = new Matrix();
    }
}
