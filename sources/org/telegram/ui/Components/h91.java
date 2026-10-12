package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class h91 extends View {
    public g91 a;
    public int b;
    public final RectF c;
    public CharSequence d;
    public h11 e;
    public boolean f;
    public zp0 h;
    public final g6 n;
    public final /* synthetic */ j91 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h91(j91 j91Var, Context context) {
        super(context);
        this.r = j91Var;
        this.c = new RectF();
        this.n = new g6(this, 360L, es.h);
    }

    @Override // android.view.View
    public int getId() {
        return this.a.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ec  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        float f7;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        CharSequence charSequence;
        int i18;
        h11 h11Var;
        Canvas canvas2;
        int i19;
        int i20;
        int i21;
        int i22;
        j91 j91Var = this.r;
        TextPaint textPaint = j91Var.d;
        TextPaint textPaint2 = j91Var.e;
        Paint paint = j91Var.f;
        org.telegram.ui.ActionBar.c6 c6Var = j91Var.j0;
        TextPaint textPaint3 = j91Var.c;
        canvas.save();
        float e = this.n.e(this.f);
        if (e > 0.0f) {
            if (this.h == null) {
                this.h = new zp0(this);
            }
            canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
            this.h.a(canvas, e);
            canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
        }
        int i23 = this.a.a;
        if (i23 != Integer.MAX_VALUE) {
            int i24 = j91.s0;
        }
        int i25 = j91Var.M;
        if (i25 != -1) {
            i11 = j91Var.G;
            i10 = i25;
        } else {
            i10 = j91Var.G;
            i11 = j91Var.h0;
        }
        if (i23 == i10) {
            i12 = j91Var.Q;
            f7 = 0.0f;
            i13 = j91Var.R;
            i14 = org.telegram.ui.ActionBar.g6.T9;
            i15 = org.telegram.ui.ActionBar.g6.U9;
        } else {
            f7 = 0.0f;
            i12 = j91Var.R;
            i13 = j91Var.Q;
            i14 = org.telegram.ui.ActionBar.g6.U9;
            i15 = org.telegram.ui.ActionBar.g6.T9;
        }
        if (j91Var.E == 9) {
            textPaint3.setColor(org.telegram.ui.ActionBar.g6.w0(j91Var.R, c6Var));
        } else if ((j91Var.J || i25 != -1) && (i23 == i10 || i23 == i11)) {
            textPaint3.setColor(i0.a.d(j91Var.K, org.telegram.ui.ActionBar.g6.w0(i13, c6Var), org.telegram.ui.ActionBar.g6.w0(i12, c6Var)));
        } else {
            textPaint3.setColor(org.telegram.ui.ActionBar.g6.w0(i12, c6Var));
        }
        this.a.getClass();
        if (this.a.a != Integer.MAX_VALUE) {
            if (j91Var.n) {
                float dp = AndroidUtilities.dp(20.0f);
                int i26 = j91.s0;
                i16 = (int) ((dp * f7) + 0);
                int i27 = this.a.c;
                if (i16 == 0) {
                    int i28 = j91.s0;
                    i17 = AndroidUtilities.dp(f7) + i16;
                } else {
                    i17 = 0;
                }
                this.b = i27 + i17;
                int measuredWidth = (getMeasuredWidth() - this.b) / 2;
                charSequence = this.a.b;
                if ((charSequence == null || this.d == null) && TextUtils.equals(charSequence, this.d)) {
                    i18 = 2;
                } else {
                    g91 g91Var = this.a;
                    i18 = 2;
                    CharSequence replaceEmoji = Emoji.replaceEmoji(g91Var.b, textPaint3.getFontMetricsInt(), false);
                    g91Var.b = replaceEmoji;
                    this.d = replaceEmoji;
                    h11 h11Var2 = this.e;
                    if (h11Var2 != null) {
                        b6.release(h11Var2.j, h11Var2.k);
                    }
                    h11 h11Var3 = new h11(this.d, textPaint3.getTextSize() / AndroidUtilities.density, textPaint3.getTypeface());
                    h11Var3.s(this);
                    this.e = h11Var3;
                }
                h11Var = this.e;
                if (h11Var == null) {
                    h11Var.p = AndroidUtilities.dp(400.0f);
                    i21 = i11;
                    i20 = i10;
                    i19 = measuredWidth;
                    h11Var.c(measuredWidth, getMeasuredHeight() / 2, 1.0f, textPaint3.getColor(), canvas);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    i19 = measuredWidth;
                    i20 = i10;
                    i21 = i11;
                }
                if (this.a.a != Integer.MAX_VALUE) {
                    if (j91Var.n) {
                        textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(j91Var.T, c6Var));
                        if (org.telegram.ui.ActionBar.g6.d1(i14) && org.telegram.ui.ActionBar.g6.d1(i15)) {
                            int w02 = org.telegram.ui.ActionBar.g6.w0(i14, c6Var);
                            if ((j91Var.J || j91Var.L != -1) && ((i22 = this.a.a) == i20 || i22 == i21)) {
                                paint.setColor(i0.a.d(j91Var.K, org.telegram.ui.ActionBar.g6.w0(i15, c6Var), w02));
                            } else {
                                paint.setColor(w02);
                            }
                        } else {
                            paint.setColor(textPaint3.getColor());
                        }
                        int dp2 = AndroidUtilities.dp(6.0f) + i19 + this.a.c;
                        int B = org.telegram.messenger.yh.B(20.0f, getMeasuredHeight(), i18);
                        if (this.a.a != Integer.MAX_VALUE) {
                            if (j91Var.n) {
                                int i29 = j91.s0;
                                paint.setAlpha((int) f7);
                                float dp3 = AndroidUtilities.dp(20.0f) + B;
                                RectF rectF = this.c;
                                rectF.set(dp2, B, dp2 + i16, dp3);
                                float f10 = AndroidUtilities.density * 11.5f;
                                canvas2.drawRoundRect(rectF, f10, f10, paint);
                                if (this.a.a != Integer.MAX_VALUE) {
                                    if (j91Var.n) {
                                        textPaint2.setColor(textPaint.getColor());
                                        int i30 = j91.s0;
                                        textPaint2.setAlpha((int) 0.0f);
                                        float dp4 = AndroidUtilities.dp(3.0f);
                                        canvas2.drawLine(rectF.centerX() - dp4, rectF.centerY() - dp4, rectF.centerX() + dp4, rectF.centerY() + dp4, textPaint2);
                                        canvas.drawLine(rectF.centerX() - dp4, rectF.centerY() + dp4, rectF.centerX() + dp4, rectF.centerY() - dp4, textPaint2);
                                    } else {
                                        int i31 = j91.s0;
                                    }
                                }
                            } else {
                                int i32 = j91.s0;
                            }
                        }
                        paint.setAlpha(255);
                        float dp32 = AndroidUtilities.dp(20.0f) + B;
                        RectF rectF2 = this.c;
                        rectF2.set(dp2, B, dp2 + i16, dp32);
                        float f102 = AndroidUtilities.density * 11.5f;
                        canvas2.drawRoundRect(rectF2, f102, f102, paint);
                        if (this.a.a != Integer.MAX_VALUE) {
                        }
                    } else {
                        int i33 = j91.s0;
                    }
                }
                if (this.a.a != Integer.MAX_VALUE) {
                    int i34 = j91.s0;
                }
                canvas.restore();
            }
            int i35 = j91.s0;
        }
        i16 = 0;
        int i272 = this.a.c;
        if (i16 == 0) {
        }
        this.b = i272 + i17;
        int measuredWidth2 = (getMeasuredWidth() - this.b) / 2;
        charSequence = this.a.b;
        if (charSequence == null) {
        }
        i18 = 2;
        h11Var = this.e;
        if (h11Var == null) {
        }
        if (this.a.a != Integer.MAX_VALUE) {
        }
        if (this.a.a != Integer.MAX_VALUE) {
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        g91 g91Var = this.a;
        accessibilityNodeInfo.setSelected((g91Var == null || (i10 = this.r.G) == -1 || g91Var.a != i10) ? false : true);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        g91 g91Var = this.a;
        j91 j91Var = this.r;
        setMeasuredDimension(AndroidUtilities.dp(j91Var.r * 2) + g91Var.a(j91Var.c) + j91Var.I, View.MeasureSpec.getSize(i11));
    }

    public void setReordering(boolean z10) {
        if (this.f == z10) {
            return;
        }
        this.f = z10;
        invalidate();
    }
}
