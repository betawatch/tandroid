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
import androidx.car.app.navigation.model.Maneuver;
import java.util.HashSet;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public class c10 extends View implements org.telegram.ui.ActionBar.p6 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public final org.telegram.ui.ActionBar.u6 L;
    public float[] M;
    public Paint N;
    public int O;
    public int P;
    public float Q;
    public c10 R;
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
    public int v;
    public boolean w;
    public boolean x;
    public boolean y;

    public c10(Context context) {
        this(context, null);
    }

    public final float a(float f7) {
        return LocaleController.isRTL ? getMeasuredWidth() - f7 : f7;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(this.H));
        hashSet.add(Integer.valueOf(this.I));
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
            case 37:
                return AndroidUtilities.dp(73.0f);
            case 38:
                return AndroidUtilities.dp(58.0f);
            case Maneuver.TYPE_DESTINATION /* 39 */:
                return AndroidUtilities.dp(96.0f);
        }
    }

    public final int d(int i10) {
        return org.telegram.ui.ActionBar.y6.w0(i10, this.L);
    }

    public final void e(int i10, int i11, int i12) {
        this.H = i10;
        this.I = i11;
        this.J = i12;
        invalidate();
    }

    public final void f() {
        c10 c10Var = this.R;
        if (c10Var != null) {
            c10Var.f();
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
            i10 = Math.max(i10, AndroidUtilities.displaySize.x);
        }
        int i12 = this.P;
        if (i12 == 0) {
            i12 = getMeasuredHeight();
        }
        this.e = elapsedRealtime;
        boolean z10 = this.y;
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
                c10 c10Var = this.R;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                float f10 = -getX();
                c10Var.O = measuredWidth;
                c10Var.P = measuredHeight;
                c10Var.Q = f10;
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
        if (this.x) {
            int dp = AndroidUtilities.dp(32.0f) + i10;
            int i11 = this.J;
            if (i11 >= 0) {
                this.d.setColor(d(i11));
            }
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(32.0f), this.J >= 0 ? this.d : paint3);
            canvas2 = canvas;
            i10 = dp;
        } else {
            canvas2 = canvas;
        }
        int viewType = getViewType();
        float f11 = 24.0f;
        float f12 = 8.0f;
        int i12 = 0;
        RectF rectF = this.n;
        if (viewType == 39) {
            canvas2.save();
            if (LocaleController.isRTL) {
                canvas2.scale(-1.0f, 1.0f, getMeasuredWidth() / 2.0f, 0.0f);
            }
            int i13 = 0;
            while (i10 < getMeasuredHeight()) {
                canvas2.drawCircle(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(18.0f) + i10, AndroidUtilities.dp(8.0f), paint3);
                rectF.set(AndroidUtilities.dp(36.0f), AndroidUtilities.dp(12.0f) + i10, AndroidUtilities.dp(128.0f), AndroidUtilities.dp(f11) + i10);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint3);
                rectF.set(getMeasuredWidth() - AndroidUtilities.dp(83.0f), AndroidUtilities.dp(10.0f) + i10, getMeasuredWidth() - AndroidUtilities.dp(11.0f), AndroidUtilities.dp(82.0f) + i10);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint3);
                int i14 = 0;
                while (i14 < 3) {
                    int i15 = i14 * 18;
                    rectF.set(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(i15 + 33) + i10, getMeasuredWidth() - AndroidUtilities.dp(i14 == 2 ? 136.0f : 100.0f), AndroidUtilities.dp(i15 + 45) + i10);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint3);
                    i14++;
                    f11 = f11;
                }
                float f13 = f11;
                i10 = b10.f(this, i10);
                if (this.y && (i13 = i13 + 1) >= this.K) {
                    break;
                } else {
                    f11 = f13;
                }
            }
            canvas2.restore();
        } else if (getViewType() == 7) {
            while (i10 <= getMeasuredHeight()) {
                int c10 = c(getMeasuredWidth());
                canvas2.drawCircle(a(AndroidUtilities.dp(10.0f) + r4), (c10 >> 1) + i10, AndroidUtilities.dp(28.0f), paint3);
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
                i10 = b10.f(this, i10);
                int i16 = i12 + 1;
                if (this.y && i16 >= this.K) {
                    break;
                } else {
                    i12 = i16;
                }
            }
        } else if (getViewType() == 24) {
            while (i10 <= getMeasuredHeight()) {
                canvas2.drawCircle(a(AndroidUtilities.dp(10.0f) + r3), org.telegram.messenger.t.D(10.0f, i10, r3), AndroidUtilities.dp(14.0f), paint3);
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
                int i17 = i12 + 1;
                if (this.y && i17 >= this.K) {
                    break;
                } else {
                    i12 = i17;
                }
            }
        } else {
            float f14 = 2.0f;
            if (getViewType() == 18) {
                int i18 = i10;
                while (i18 <= getMeasuredHeight()) {
                    canvas2.drawCircle(a(org.telegram.messenger.t.D(9.0f, this.G, r1)), AndroidUtilities.dp(32.0f) + i18, AndroidUtilities.dp(25.0f), paint3);
                    int i19 = i12 % 2 == 0 ? 52 : 72;
                    float f15 = 76;
                    rectF.set(AndroidUtilities.dp(f15), AndroidUtilities.dp(20.0f) + i18, AndroidUtilities.dp(i19 + 76), AndroidUtilities.dp(28.0f) + i18);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint3);
                    rectF.set(AndroidUtilities.dp(i19 + 84), AndroidUtilities.dp(20.0f) + i18, AndroidUtilities.dp(i19 + 168), AndroidUtilities.dp(28.0f) + i18);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint3);
                    rectF.set(AndroidUtilities.dp(f15), AndroidUtilities.dp(42.0f) + i18, AndroidUtilities.dp(140), AndroidUtilities.dp(50.0f) + i18);
                    b(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint3);
                    Canvas canvas3 = canvas2;
                    Paint paint4 = paint3;
                    canvas3.drawLine(AndroidUtilities.dp(f15), b10.f(this, i18), getMeasuredWidth(), b10.f(this, i18), paint4);
                    canvas2 = canvas3;
                    i18 = b10.f(this, i18);
                    int i20 = i12 + 1;
                    if (this.y && i20 >= this.K) {
                        break;
                    }
                    i12 = i20;
                    paint3 = paint4;
                }
            } else {
                Paint paint5 = paint3;
                float f16 = 10.0f;
                float f17 = 6.0f;
                if (getViewType() == 37 || getViewType() == 38) {
                    boolean z10 = getViewType() == 37;
                    int c11 = c(getMeasuredWidth());
                    while (i10 <= getMeasuredHeight()) {
                        if (z10) {
                            canvas2.drawCircle(AndroidUtilities.dp(36.0f) + this.G, AndroidUtilities.dp(35.0f) + i10, AndroidUtilities.dp(23.0f), paint5);
                        } else {
                            rectF.set(AndroidUtilities.dp(15.0f) + this.G, AndroidUtilities.dp(6.0f) + i10, AndroidUtilities.dp(61.0f) + this.G, AndroidUtilities.dp(52.0f) + i10);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint5);
                        }
                        float dp2 = AndroidUtilities.dp(71.0f) + this.G;
                        float max = Math.max(dp2, getMeasuredWidth() - AndroidUtilities.dp(z10 ? 76.0f : 20.0f));
                        rectF.set(dp2, AndroidUtilities.dp(14.0f) + i10, Math.min(AndroidUtilities.dp(100.0f) + dp2, max), AndroidUtilities.dp(22.0f) + i10);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(dp2, AndroidUtilities.dp(z10 ? 33.0f : 36.0f) + i10, Math.min(AndroidUtilities.dp(140.0f) + dp2, max), AndroidUtilities.dp(z10 ? 41.0f : 44.0f) + i10);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        if (z10) {
                            rectF.set(dp2, AndroidUtilities.dp(51.0f) + i10, Math.min(AndroidUtilities.dp(80.0f) + dp2, max), AndroidUtilities.dp(59.0f) + i10);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                            if (getMeasuredWidth() - AndroidUtilities.dp(68.0f) >= dp2) {
                                rectF.set(getMeasuredWidth() - AndroidUtilities.dp(68.0f), AndroidUtilities.dp(15.0f) + i10, getMeasuredWidth() - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(23.0f) + i10);
                                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                            }
                        }
                        i10 += c11;
                        int i21 = i12 + 1;
                        if (this.y && i21 >= this.K) {
                            break;
                        } else {
                            i12 = i21;
                        }
                    }
                } else if (getViewType() == 19) {
                    int i22 = i10;
                    while (i22 <= getMeasuredHeight()) {
                        canvas2.drawCircle(a(org.telegram.messenger.t.D(9.0f, this.G, r1)), AndroidUtilities.dp(29.0f) + i22, AndroidUtilities.dp(20.0f), paint5);
                        float f18 = 76;
                        rectF.set(AndroidUtilities.dp(f18), AndroidUtilities.dp(16.0f) + i22, AndroidUtilities.dp((i12 % 2 == 0 ? 92 : 128) + 76), AndroidUtilities.dp(24.0f) + i22);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(AndroidUtilities.dp(f18), AndroidUtilities.dp(38.0f) + i22, AndroidUtilities.dp(240), AndroidUtilities.dp(46.0f) + i22);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        Canvas canvas4 = canvas2;
                        Paint paint6 = paint5;
                        canvas4.drawLine(AndroidUtilities.dp(f18), b10.f(this, i22), getMeasuredWidth(), b10.f(this, i22), paint6);
                        canvas2 = canvas4;
                        paint5 = paint6;
                        i22 = b10.f(this, i22);
                        int i23 = i12 + 1;
                        if (this.y && i23 >= this.K) {
                            break;
                        } else {
                            i12 = i23;
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
                        i10 = b10.f(this, i10);
                        int i24 = i12 + 1;
                        if (this.y && i24 >= this.K) {
                            break;
                        } else {
                            i12 = i24;
                        }
                    }
                } else if (getViewType() == 2 || getViewType() == 27) {
                    int i25 = 2;
                    int measuredWidth2 = (getMeasuredWidth() - ((getColumnsCount() - 1) * AndroidUtilities.dp(2.0f))) / getColumnsCount();
                    int i26 = getViewType() == 27 ? (int) (measuredWidth2 * 1.25f) : measuredWidth2;
                    int i27 = i10;
                    int i28 = 0;
                    while (true) {
                        if (i27 >= getMeasuredHeight() && !this.y) {
                            break;
                        }
                        int i29 = 0;
                        while (i29 < getColumnsCount()) {
                            if (i28 != 0 || i29 >= this.v) {
                                paint2 = paint5;
                                canvas.drawRect((AndroidUtilities.dp(2.0f) + measuredWidth2) * i29, i27, r1 + measuredWidth2, i27 + i26, paint2);
                            } else {
                                paint2 = paint5;
                            }
                            i29++;
                            paint5 = paint2;
                        }
                        Paint paint7 = paint5;
                        i27 = org.telegram.messenger.t.D(2.0f, i26, i27);
                        i28++;
                        int i30 = i25;
                        if (this.y && i28 >= i30) {
                            break;
                        }
                        i25 = i30;
                        paint5 = paint7;
                    }
                } else if (getViewType() == 3) {
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
                        i10 = b10.f(this, i10);
                        int i31 = i12 + 1;
                        if (this.y && i31 >= this.K) {
                            break;
                        } else {
                            i12 = i31;
                        }
                    }
                } else if (getViewType() == 4) {
                    while (i10 <= getMeasuredHeight()) {
                        canvas2.drawCircle(a(AndroidUtilities.dp(12.0f) + r4), org.telegram.messenger.t.D(6.0f, i10, r4), AndroidUtilities.dp(44.0f) >> 1, paint5);
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
                        i10 = b10.f(this, i10);
                        int i32 = i12 + 1;
                        if (this.y && i32 >= this.K) {
                            break;
                        } else {
                            i12 = i32;
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
                        i10 = b10.f(this, i10);
                        int i33 = i12 + 1;
                        if (this.y && i33 >= this.K) {
                            break;
                        } else {
                            i12 = i33;
                        }
                    }
                } else if (getViewType() == 6 || getViewType() == 10) {
                    while (i10 <= getMeasuredHeight()) {
                        canvas2.drawCircle(a(org.telegram.messenger.t.D(9.0f, this.G, r4)), (AndroidUtilities.dp(64.0f) >> 1) + i10, AndroidUtilities.dp(23.0f), paint5);
                        rectF.set(AndroidUtilities.dp(68.0f) + this.G, AndroidUtilities.dp(17.0f) + i10, AndroidUtilities.dp(260.0f) + this.G, AndroidUtilities.dp(25.0f) + i10);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(AndroidUtilities.dp(68.0f) + this.G, AndroidUtilities.dp(39.0f) + i10, AndroidUtilities.dp(140.0f) + this.G, AndroidUtilities.dp(47.0f) + i10);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        if (this.w) {
                            rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(20.0f) + i10, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(28.0f) + i10);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        }
                        i10 = b10.f(this, i10);
                        int i34 = i12 + 1;
                        if (this.y && i34 >= this.K) {
                            break;
                        } else {
                            i12 = i34;
                        }
                    }
                } else if (getViewType() == 29) {
                    while (i10 <= getMeasuredHeight()) {
                        canvas2.drawCircle(a(org.telegram.messenger.t.D(9.0f, this.G, r4)), (AndroidUtilities.dp(64.0f) >> 1) + i10, AndroidUtilities.dp(23.0f), paint5);
                        rectF.set(AndroidUtilities.dp(68.0f) + this.G, AndroidUtilities.dp(17.0f) + i10, AndroidUtilities.dp(260.0f) + this.G, AndroidUtilities.dp(25.0f) + i10);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(AndroidUtilities.dp(68.0f) + this.G, AndroidUtilities.dp(39.0f) + i10, AndroidUtilities.dp(140.0f) + this.G, AndroidUtilities.dp(47.0f) + i10);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        i10 = b10.f(this, i10);
                        int i35 = i12 + 1;
                        if (this.y && i35 >= this.K) {
                            break;
                        } else {
                            i12 = i35;
                        }
                    }
                } else if (getViewType() == 33) {
                    while (i10 <= getMeasuredHeight()) {
                        canvas2.drawCircle(a(org.telegram.messenger.t.D(13.0f, this.G, r4)), (AndroidUtilities.dp(58.0f) >> 1) + i10, AndroidUtilities.dp(23.0f), paint5);
                        rectF.set(AndroidUtilities.dp(72.0f) + this.G, AndroidUtilities.dp(17.0f) + i10, AndroidUtilities.dp(260.0f) + this.G, AndroidUtilities.dp(25.0f) + i10);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(AndroidUtilities.dp(72.0f) + this.G, AndroidUtilities.dp(39.0f) + i10, AndroidUtilities.dp(140.0f) + this.G, AndroidUtilities.dp(47.0f) + i10);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        i10 = b10.f(this, i10);
                        int i36 = i12 + 1;
                        if (this.y && i36 >= this.K) {
                            break;
                        } else {
                            i12 = i36;
                        }
                    }
                } else if (getViewType() == 30) {
                    while (i10 <= getMeasuredHeight()) {
                        i10 += c(getMeasuredWidth());
                        rectF.set(0.0f, i10, getMeasuredWidth(), i10);
                        b(rectF);
                        canvas2.drawRect(rectF, paint5);
                        int i37 = i12 + 1;
                        if (this.y && i37 >= this.K) {
                            break;
                        } else {
                            i12 = i37;
                        }
                    }
                } else if (getViewType() == 8) {
                    while (i10 <= getMeasuredHeight()) {
                        canvas2.drawCircle(a(org.telegram.messenger.t.D(11.0f, this.G, r4)), (AndroidUtilities.dp(64.0f) >> 1) + i10, AndroidUtilities.dp(23.0f), paint5);
                        rectF.set(AndroidUtilities.dp(68.0f) + this.G, AndroidUtilities.dp(17.0f) + i10, AndroidUtilities.dp(140.0f) + this.G, AndroidUtilities.dp(25.0f) + i10);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(AndroidUtilities.dp(68.0f) + this.G, AndroidUtilities.dp(39.0f) + i10, AndroidUtilities.dp(260.0f) + this.G, AndroidUtilities.dp(47.0f) + i10);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        if (this.w) {
                            rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(20.0f) + i10, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(28.0f) + i10);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        }
                        i10 = b10.f(this, i10);
                        int i38 = i12 + 1;
                        if (this.y && i38 >= this.K) {
                            break;
                        } else {
                            i12 = i38;
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
                        i10 = b10.f(this, i10);
                        int i39 = i12 + 1;
                        if (this.y && i39 >= this.K) {
                            break;
                        } else {
                            i12 = i39;
                        }
                    }
                } else if (getViewType() == 11) {
                    int i40 = 0;
                    while (i10 <= getMeasuredHeight()) {
                        rectF.set(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(14.0f), (getMeasuredWidth() * 0.5f) + AndroidUtilities.dp(this.M[0] * 40.0f), AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(14.0f));
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(getMeasuredWidth() - AndroidUtilities.dp(18.0f), AndroidUtilities.dp(14.0f), (getMeasuredWidth() - (getMeasuredWidth() * 0.2f)) - AndroidUtilities.dp(this.M[0] * 20.0f), AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(14.0f));
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        i10 = b10.f(this, i10);
                        i40++;
                        if (this.y && i40 >= this.K) {
                            break;
                        }
                    }
                } else if (getViewType() == 12) {
                    int dp3 = AndroidUtilities.dp(14.0f) + i10;
                    while (dp3 <= getMeasuredHeight()) {
                        int measuredWidth3 = getMeasuredWidth() / 4;
                        for (int i41 = 0; i41 < 4; i41++) {
                            float f19 = (measuredWidth3 / 2.0f) + (measuredWidth3 * i41);
                            canvas2.drawCircle(f19, (AndroidUtilities.dp(56.0f) / 2.0f) + AndroidUtilities.dp(7.0f) + dp3, AndroidUtilities.dp(28.0f), paint5);
                            float dp4 = AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(56.0f) + AndroidUtilities.dp(7.0f) + dp3;
                            RectF rectF2 = AndroidUtilities.rectTmp;
                            rectF2.set(f19 - AndroidUtilities.dp(24.0f), dp4 - AndroidUtilities.dp(4.0f), f19 + AndroidUtilities.dp(24.0f), dp4 + AndroidUtilities.dp(4.0f));
                            canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        }
                        dp3 = b10.f(this, dp3);
                        if (this.y) {
                            break;
                        }
                    }
                } else if (getViewType() == 13) {
                    float measuredHeight2 = getMeasuredHeight() / 2.0f;
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(AndroidUtilities.dp(40.0f), measuredHeight2 - AndroidUtilities.dp(4.0f), getMeasuredWidth() - AndroidUtilities.dp(120.0f), AndroidUtilities.dp(4.0f) + measuredHeight2);
                    canvas2.drawRoundRect(rectF3, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                    if (this.N == null) {
                        Paint paint8 = new Paint(1);
                        this.N = paint8;
                        paint8.setColor(org.telegram.ui.ActionBar.y6.v0(org.telegram.ui.ActionBar.y6.G8));
                    }
                    for (int i42 = 0; i42 < 3; i42++) {
                        canvas2.drawCircle(org.telegram.messenger.vh.b(12.0f, i42, AndroidUtilities.dp(13.0f) + (getMeasuredWidth() - AndroidUtilities.dp(56.0f))), measuredHeight2, AndroidUtilities.dp(13.0f), this.N);
                        canvas2.drawCircle(org.telegram.messenger.vh.b(12.0f, i42, AndroidUtilities.dp(13.0f) + (getMeasuredWidth() - AndroidUtilities.dp(56.0f))), measuredHeight2, AndroidUtilities.dp(12.0f), paint5);
                    }
                } else {
                    float f20 = 21.0f;
                    if (getViewType() == 14 || getViewType() == 17) {
                        int dp5 = AndroidUtilities.dp(12.0f);
                        int dp6 = AndroidUtilities.dp(77.0f);
                        int dp7 = AndroidUtilities.dp(4.0f);
                        float dp8 = AndroidUtilities.dp(21.0f);
                        float dp9 = AndroidUtilities.dp(41.0f);
                        while (dp5 < getMeasuredWidth()) {
                            if (this.N == null) {
                                this.N = new Paint(1);
                            }
                            this.N.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.h5, this.L));
                            RectF rectF4 = AndroidUtilities.rectTmp;
                            int i43 = dp5 + dp6;
                            float f21 = f12;
                            float f22 = f20;
                            rectF4.set(AndroidUtilities.dp(4.0f) + dp5, AndroidUtilities.dp(4.0f), i43 - AndroidUtilities.dp(4.0f), getMeasuredHeight() - AndroidUtilities.dp(4.0f));
                            canvas2.drawRoundRect(rectF4, AndroidUtilities.dp(f17), AndroidUtilities.dp(f17), paint5);
                            if (getViewType() == 14) {
                                float dp10 = AndroidUtilities.dp(f21) + dp7;
                                float f23 = dp5;
                                float dp11 = AndroidUtilities.dp(22.0f) + dp7 + f23;
                                rectF.set(dp11, dp10, dp11 + dp9, dp10 + dp8);
                                canvas2.drawRoundRect(rectF, rectF.height() * 0.5f, rectF.height() * 0.5f, this.N);
                                float dp12 = AndroidUtilities.dp(4.0f) + dp8 + dp10;
                                float dp13 = f23 + AndroidUtilities.dp(5.0f) + dp7;
                                rectF.set(dp13, dp12, dp13 + dp9, dp12 + dp8);
                                canvas2.drawRoundRect(rectF, rectF.height() * 0.5f, rectF.height() * 0.5f, this.N);
                            } else if (getViewType() == 17) {
                                float dp14 = AndroidUtilities.dp(5.0f);
                                float dp15 = AndroidUtilities.dp(32.0f);
                                f7 = f17;
                                float B = c3.h0.B(dp6, dp15, f14, dp5);
                                rectF4.set(B, AndroidUtilities.dp(f22), dp15 + B, AndroidUtilities.dp(32.0f) + r13);
                                canvas2.drawRoundRect(rectF4, dp14, dp14, this.N);
                                canvas2.drawCircle((dp6 / 2) + dp5, getMeasuredHeight() - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(f21), this.N);
                                dp5 = i43;
                                f17 = f7;
                                f12 = f21;
                                f20 = f22;
                                f14 = 2.0f;
                            }
                            f7 = f17;
                            canvas2.drawCircle((dp6 / 2) + dp5, getMeasuredHeight() - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(f21), this.N);
                            dp5 = i43;
                            f17 = f7;
                            f12 = f21;
                            f20 = f22;
                            f14 = 2.0f;
                        }
                    } else if (getViewType() == 15) {
                        int dp16 = AndroidUtilities.dp(23.0f);
                        int dp17 = AndroidUtilities.dp(4.0f);
                        while (i10 <= getMeasuredHeight()) {
                            canvas2.drawCircle(a(org.telegram.messenger.t.D(12.0f, this.G, dp16)), org.telegram.messenger.t.D(8.0f, i10, dp16), dp16, paint5);
                            rectF.set(AndroidUtilities.dp(74.0f) + this.G, AndroidUtilities.dp(12.0f) + i10, AndroidUtilities.dp(260.0f) + this.G, AndroidUtilities.dp(20.0f) + i10);
                            b(rectF);
                            float f24 = dp17;
                            canvas2.drawRoundRect(rectF, f24, f24, paint5);
                            rectF.set(AndroidUtilities.dp(74.0f) + this.G, AndroidUtilities.dp(36.0f) + i10, AndroidUtilities.dp(140.0f) + this.G, AndroidUtilities.dp(42.0f) + i10);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, f24, f24, paint5);
                            if (this.T > 0.0f) {
                                rectF.set(AndroidUtilities.dp(73.0f) + this.G, AndroidUtilities.dp(62.0f) + i10, AndroidUtilities.dp(73.0f) + this.G + this.T, AndroidUtilities.dp(94.0f) + i10);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, f24, f24, paint5);
                            }
                            i10 = b10.f(this, i10);
                            int i44 = i12 + 1;
                            if (this.y && i44 >= this.K) {
                                break;
                            } else {
                                i12 = i44;
                            }
                        }
                    } else if (getViewType() == 16 || getViewType() == 23) {
                        int i45 = 0;
                        while (i10 <= getMeasuredHeight()) {
                            canvas2.drawCircle(a(org.telegram.messenger.t.D(8.0f, this.G, r5)), AndroidUtilities.dp(24.0f) + i10, AndroidUtilities.dp(18.0f), paint5);
                            rectF.set(AndroidUtilities.dp(58.0f) + this.G, AndroidUtilities.dp(20.0f) + i10, getWidth() - AndroidUtilities.dp(53.0f), AndroidUtilities.dp(28.0f) + i10);
                            b(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint5);
                            if (i45 < 4) {
                                canvas2.drawCircle(a(org.telegram.messenger.t.C(12.0f, getWidth(), r5)), AndroidUtilities.dp(24.0f) + i10, AndroidUtilities.dp(12.0f), paint5);
                            }
                            i10 = b10.f(this, i10);
                            i45++;
                            if (this.y && i45 >= this.K) {
                                break;
                            }
                        }
                        rectF.set(AndroidUtilities.dp(8.0f) + this.G, AndroidUtilities.dp(20.0f) + i10, getWidth() - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(28.0f) + i10);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint5);
                        rectF.set(AndroidUtilities.dp(8.0f) + this.G, AndroidUtilities.dp(36.0f) + i10, getWidth() - AndroidUtilities.dp(53.0f), AndroidUtilities.dp(44.0f) + i10);
                        b(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint5);
                    } else {
                        int i46 = this.E;
                        if (i46 == 21) {
                            while (i10 <= getMeasuredHeight()) {
                                canvas2.drawCircle(a(AndroidUtilities.dp(20.0f) + r4), (AndroidUtilities.dp(58.0f) >> 1) + i10, AndroidUtilities.dp(46.0f) >> 1, paint5);
                                rectF.set(AndroidUtilities.dp(74.0f), AndroidUtilities.dp(16.0f) + i10, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(24.0f) + i10);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                                rectF.set(AndroidUtilities.dp(74.0f), AndroidUtilities.dp(38.0f) + i10, AndroidUtilities.dp(260.0f), AndroidUtilities.dp(46.0f) + i10);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                                i10 = b10.f(this, i10);
                                int i47 = i12 + 1;
                                if (this.y && i47 >= this.K) {
                                    break;
                                } else {
                                    i12 = i47;
                                }
                            }
                        } else if (i46 == 22) {
                            while (i10 <= getMeasuredHeight()) {
                                canvas2.drawCircle(a(AndroidUtilities.dp(20.0f) + r4), org.telegram.messenger.t.D(6.0f, i10, r4), AndroidUtilities.dp(48.0f) >> 1, paint5);
                                rectF.set(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(16.0f) + i10, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(24.0f) + i10);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                                rectF.set(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(38.0f) + i10, AndroidUtilities.dp(260.0f), AndroidUtilities.dp(46.0f) + i10);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                                i10 = b10.f(this, i10);
                                int i48 = i12 + 1;
                                if (this.y && i48 >= this.K) {
                                    break;
                                } else {
                                    i12 = i48;
                                }
                            }
                        } else if (i46 == 25) {
                            while (i10 <= getMeasuredHeight()) {
                                canvas2.drawCircle(AndroidUtilities.dp(17.0f) + r4, org.telegram.messenger.t.D(6.0f, i10, r4), AndroidUtilities.dp(38.0f) >> 1, paint5);
                                rectF.set(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(21.0f) + i10, AndroidUtilities.dp(220.0f), AndroidUtilities.dp(29.0f) + i10);
                                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                                i10 = b10.f(this, i10);
                                int i49 = i12 + 1;
                                if (this.y && i49 >= this.K) {
                                    break;
                                } else {
                                    i12 = i49;
                                }
                            }
                        } else if (i46 == 26) {
                            while (i10 <= getMeasuredHeight()) {
                                canvas2.drawCircle(LocaleController.isRTL ? org.telegram.messenger.t.C(21.0f, getMeasuredWidth(), r4) : AndroidUtilities.dp(21.0f) + r4, org.telegram.messenger.t.D(16.0f, i10, r4), AndroidUtilities.dp(21.0f) >> 1, paint5);
                                rectF.set(AndroidUtilities.dp(60.0f), AndroidUtilities.dp(21.0f) + i10, AndroidUtilities.dp(190.0f), AndroidUtilities.dp(29.0f) + i10);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                                rectF.set(getMeasuredWidth() - AndroidUtilities.dp(16.0f), AndroidUtilities.dp(21.0f) + i10, getMeasuredWidth() - AndroidUtilities.dp(62.0f), AndroidUtilities.dp(29.0f) + i10);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                                i10 = b10.f(this, i10);
                                int i50 = i12 + 1;
                                if (this.y && i50 >= this.K) {
                                    break;
                                } else {
                                    i12 = i50;
                                }
                            }
                        } else if (getViewType() == 28) {
                            while (i10 <= getMeasuredHeight()) {
                                canvas2.drawCircle(a(org.telegram.messenger.t.D(f16, this.G, r4)), (AndroidUtilities.dp(58.0f) >> 1) + i10, AndroidUtilities.dp(24.0f), paint5);
                                rectF.set(AndroidUtilities.dp(68.0f) + this.G, AndroidUtilities.dp(17.0f) + i10, AndroidUtilities.dp(260.0f) + this.G, AndroidUtilities.dp(25.0f) + i10);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                                rectF.set(AndroidUtilities.dp(68.0f) + this.G, AndroidUtilities.dp(39.0f) + i10, AndroidUtilities.dp(140.0f) + this.G, AndroidUtilities.dp(47.0f) + i10);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                                if (this.w) {
                                    rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(20.0f) + i10, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(28.0f) + i10);
                                    b(rectF);
                                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                                }
                                i10 = b10.f(this, i10);
                                int i51 = i12 + 1;
                                if (this.y && i51 >= this.K) {
                                    break;
                                }
                                i12 = i51;
                                f16 = 10.0f;
                            }
                        } else if (getViewType() == 31) {
                            while (i10 <= getMeasuredHeight()) {
                                int c12 = c(getMeasuredWidth());
                                float f25 = i10;
                                rectF.set(AndroidUtilities.dp(18.0f) + this.G, ((c12 - AndroidUtilities.dp(22.0f)) / 2.0f) + f25, AndroidUtilities.dp(40.0f) + this.G, ((AndroidUtilities.dp(22.0f) + c12) / 2.0f) + f25);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), paint5);
                                rectF.set(AndroidUtilities.dp(58.0f) + this.G, ((c12 - AndroidUtilities.dp(8.0f)) / 2.0f) + f25, org.telegram.ui.d3.g(19.0f, getMeasuredWidth(), AndroidUtilities.dp(132.0f) + this.G), ((AndroidUtilities.dp(8.0f) + c12) / 2.0f) + f25);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                                i10 += c12;
                                int i52 = i12 + 1;
                                if (this.y && i52 >= this.K) {
                                    break;
                                } else {
                                    i12 = i52;
                                }
                            }
                        } else if (getViewType() == 32) {
                            while (i10 <= getMeasuredHeight()) {
                                int c13 = c(getMeasuredWidth());
                                float f26 = i10;
                                rectF.set(AndroidUtilities.dp(10.0f) + this.G, ((c13 - AndroidUtilities.dp(32.0f)) / 2.0f) + f26, AndroidUtilities.dp(42.0f) + this.G, ((AndroidUtilities.dp(32.0f) + c13) / 2.0f) + f26);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint5);
                                rectF.set(AndroidUtilities.dp(64.0f) + this.G, (((c13 - AndroidUtilities.dp(14.0f)) - AndroidUtilities.dp(10.0f)) / 2.0f) + f26, org.telegram.ui.d3.g(19.0f, getMeasuredWidth(), AndroidUtilities.dp(118.0f) + this.G), ((AndroidUtilities.dp(10.0f) + (c13 - AndroidUtilities.dp(14.0f))) / 2.0f) + f26);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                                rectF.set(AndroidUtilities.dp(64.0f) + this.G, (((AndroidUtilities.dp(14.0f) + c13) - AndroidUtilities.dp(8.0f)) / 2.0f) + f26, org.telegram.ui.d3.g(19.0f, getMeasuredWidth(), AndroidUtilities.dp(144.0f) + this.G), ((AndroidUtilities.dp(8.0f) + (AndroidUtilities.dp(14.0f) + c13)) / 2.0f) + f26);
                                b(rectF);
                                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                                i10 += c13;
                                int i53 = i12 + 1;
                                if (this.y && i53 >= this.K) {
                                    break;
                                } else {
                                    i12 = i53;
                                }
                            }
                        } else if (getViewType() == 34 || getViewType() == 35 || getViewType() == 36) {
                            rectF.set(this.G, this.F, getMeasuredWidth() - this.G, getMeasuredHeight() - this.F);
                            rectF.inset(AndroidUtilities.dp(3.33f), AndroidUtilities.dp(4.0f));
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), paint5);
                        }
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
        int i12 = this.K;
        if (i12 > 1 && this.S) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getAdditionalHeight() + (c(View.MeasureSpec.getSize(i10)) * this.K), TLObject.FLAG_30));
        } else if (i12 <= 1 || View.MeasureSpec.getSize(i11) <= 0) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getAdditionalHeight() + c(View.MeasureSpec.getSize(i10)), TLObject.FLAG_30));
        } else {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getAdditionalHeight() + Math.min(View.MeasureSpec.getSize(i11), c(View.MeasureSpec.getSize(i10)) * this.K), TLObject.FLAG_30));
        }
    }

    public void setGlobalGradientView(c10 c10Var) {
        this.R = c10Var;
    }

    public void setIgnoreHeightCheck(boolean z10) {
        this.S = z10;
    }

    public void setIsSingleCell(boolean z10) {
        this.y = z10;
    }

    public void setItemsCount(int i10) {
        this.K = i10;
    }

    public void setMemberRequestButton(boolean z10) {
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        this.T = textPaint.measureText(LocaleController.getString(z10 ? R.string.AddToChannel : R.string.AddToGroup)) + AndroidUtilities.dp(34.0f);
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
        this.x = z10;
    }

    public void setViewType(int i10) {
        this.E = i10;
        if (i10 == 11) {
            Random random = new Random();
            this.M = new float[2];
            for (int i11 = 0; i11 < 2; i11++) {
                this.M[i11] = org.telegram.ui.d3.j(random, MediaDataController.MAX_STYLE_RUNS_COUNT) / 1000.0f;
            }
        }
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        int i10;
        c10 c10Var = this.R;
        if (c10Var != null) {
            c10Var.updateColors();
            return;
        }
        int i11 = this.H;
        org.telegram.ui.ActionBar.u6 u6Var = this.L;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i11, u6Var);
        int w03 = org.telegram.ui.ActionBar.y6.w0(this.I, u6Var);
        if (this.s == w03 && this.r == w02) {
            return;
        }
        this.r = w02;
        this.s = w03;
        int i12 = this.E;
        if (i12 == 34 || i12 == 35 || i12 == 36) {
            this.a = AndroidUtilities.displaySize.x;
        } else if (this.y || i12 == 13 || i12 == 14 || i12 == 17) {
            this.a = AndroidUtilities.dp(200.0f);
        } else {
            this.a = AndroidUtilities.dp(600.0f);
        }
        if (this.y || (i10 = this.E) == 13 || i10 == 14 || i10 == 17) {
            this.b = new LinearGradient(0.0f, 0.0f, this.a, 0.0f, new int[]{w03, w02, w02, w03}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        } else {
            this.b = new LinearGradient(0.0f, 0.0f, 0.0f, this.a, new int[]{w03, w02, w02, w03}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
        this.c.setShader(this.b);
    }

    public c10(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.c = new Paint();
        this.d = new Paint();
        this.n = new RectF();
        this.w = true;
        this.H = org.telegram.ui.ActionBar.y6.G8;
        this.I = org.telegram.ui.ActionBar.y6.i6;
        this.J = -1;
        this.K = 1;
        this.L = u6Var;
        this.h = new Matrix();
    }
}
