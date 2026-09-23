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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class e81 extends View {
    public d81 a;
    public int b;
    public final RectF c;
    public CharSequence d;
    public f01 e;
    public boolean f;
    public yo0 h;
    public final e6 n;
    public final /* synthetic */ g81 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e81(g81 g81Var, Context context) {
        super(context);
        this.r = g81Var;
        this.c = new RectF();
        this.n = new e6(this, 360L, rr.h);
    }

    @Override // android.view.View
    public int getId() {
        return this.a.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x027c  */
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
        f01 f01Var;
        Canvas canvas2;
        int i18;
        int i19;
        int i20;
        int i21;
        g81 g81Var = this.r;
        TextPaint textPaint = g81Var.d;
        TextPaint textPaint2 = g81Var.e;
        Paint paint = g81Var.f;
        org.telegram.ui.ActionBar.d6 d6Var = g81Var.j0;
        TextPaint textPaint3 = g81Var.c;
        canvas.save();
        float e = this.n.e(this.f);
        if (e > 0.0f) {
            if (this.h == null) {
                this.h = new yo0(this);
            }
            canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
            this.h.a(canvas, e);
            canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
        }
        int i22 = this.a.a;
        if (i22 != Integer.MAX_VALUE) {
            int i23 = g81.s0;
        }
        int i24 = g81Var.M;
        if (i24 != -1) {
            i11 = g81Var.G;
            i10 = i24;
        } else {
            i10 = g81Var.G;
            i11 = g81Var.h0;
        }
        if (i22 == i10) {
            i12 = g81Var.Q;
            f7 = 0.0f;
            i13 = g81Var.R;
            i14 = org.telegram.ui.ActionBar.h6.T9;
            i15 = org.telegram.ui.ActionBar.h6.U9;
        } else {
            f7 = 0.0f;
            i12 = g81Var.R;
            i13 = g81Var.Q;
            i14 = org.telegram.ui.ActionBar.h6.U9;
            i15 = org.telegram.ui.ActionBar.h6.T9;
        }
        if (g81Var.E == 9) {
            textPaint3.setColor(org.telegram.ui.ActionBar.h6.v0(g81Var.R, d6Var));
        } else if ((g81Var.J || i24 != -1) && (i22 == i10 || i22 == i11)) {
            textPaint3.setColor(i0.a.d(g81Var.K, org.telegram.ui.ActionBar.h6.v0(i13, d6Var), org.telegram.ui.ActionBar.h6.v0(i12, d6Var)));
        } else {
            textPaint3.setColor(org.telegram.ui.ActionBar.h6.v0(i12, d6Var));
        }
        this.a.getClass();
        if (this.a.a != Integer.MAX_VALUE) {
            if (g81Var.n) {
                float dp = AndroidUtilities.dp(20.0f);
                int i25 = g81.s0;
                i16 = (int) ((dp * f7) + 0);
                int i26 = this.a.c;
                if (i16 == 0) {
                    int i27 = g81.s0;
                    i17 = AndroidUtilities.dp(f7) + i16;
                } else {
                    i17 = 0;
                }
                this.b = i26 + i17;
                int measuredWidth = (getMeasuredWidth() - this.b) / 2;
                charSequence = this.a.b;
                if ((charSequence != null && this.d != null) || !TextUtils.equals(charSequence, this.d)) {
                    d81 d81Var = this.a;
                    CharSequence replaceEmoji = Emoji.replaceEmoji(d81Var.b, textPaint3.getFontMetricsInt(), false);
                    d81Var.b = replaceEmoji;
                    this.d = replaceEmoji;
                    f01 f01Var2 = this.e;
                    if (f01Var2 != null) {
                        z5.release(f01Var2.j, f01Var2.k);
                    }
                    f01 f01Var3 = new f01(this.d, textPaint3.getTextSize() / AndroidUtilities.density, textPaint3.getTypeface());
                    f01Var3.s(this);
                    this.e = f01Var3;
                }
                f01Var = this.e;
                if (f01Var == null) {
                    f01Var.p = AndroidUtilities.dp(400.0f);
                    i20 = i11;
                    i19 = i10;
                    i18 = measuredWidth;
                    f01Var.c(measuredWidth, getMeasuredHeight() / 2, 1.0f, textPaint3.getColor(), canvas);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    i18 = measuredWidth;
                    i19 = i10;
                    i20 = i11;
                }
                if (this.a.a != Integer.MAX_VALUE) {
                    if (g81Var.n) {
                        textPaint.setColor(org.telegram.ui.ActionBar.h6.v0(g81Var.T, d6Var));
                        if (org.telegram.ui.ActionBar.h6.c1(i14) && org.telegram.ui.ActionBar.h6.c1(i15)) {
                            int v02 = org.telegram.ui.ActionBar.h6.v0(i14, d6Var);
                            if ((g81Var.J || g81Var.L != -1) && ((i21 = this.a.a) == i19 || i21 == i20)) {
                                paint.setColor(i0.a.d(g81Var.K, org.telegram.ui.ActionBar.h6.v0(i15, d6Var), v02));
                            } else {
                                paint.setColor(v02);
                            }
                        } else {
                            paint.setColor(textPaint3.getColor());
                        }
                        int dp2 = AndroidUtilities.dp(6.0f) + i18 + this.a.c;
                        int y3 = org.telegram.messenger.ul.y(20.0f, getMeasuredHeight(), 2);
                        if (this.a.a != Integer.MAX_VALUE) {
                            if (g81Var.n) {
                                int i28 = g81.s0;
                                paint.setAlpha((int) 0.0f);
                                float dp3 = AndroidUtilities.dp(20.0f) + y3;
                                RectF rectF = this.c;
                                rectF.set(dp2, y3, dp2 + i16, dp3);
                                float f10 = AndroidUtilities.density * 11.5f;
                                canvas2.drawRoundRect(rectF, f10, f10, paint);
                                if (this.a.a != Integer.MAX_VALUE) {
                                    if (g81Var.n) {
                                        textPaint2.setColor(textPaint.getColor());
                                        int i29 = g81.s0;
                                        textPaint2.setAlpha((int) 0.0f);
                                        float dp4 = AndroidUtilities.dp(3.0f);
                                        canvas2.drawLine(rectF.centerX() - dp4, rectF.centerY() - dp4, rectF.centerX() + dp4, rectF.centerY() + dp4, textPaint2);
                                        canvas.drawLine(rectF.centerX() - dp4, rectF.centerY() + dp4, rectF.centerX() + dp4, rectF.centerY() - dp4, textPaint2);
                                    } else {
                                        int i30 = g81.s0;
                                    }
                                }
                            } else {
                                int i31 = g81.s0;
                            }
                        }
                        paint.setAlpha(255);
                        float dp32 = AndroidUtilities.dp(20.0f) + y3;
                        RectF rectF2 = this.c;
                        rectF2.set(dp2, y3, dp2 + i16, dp32);
                        float f102 = AndroidUtilities.density * 11.5f;
                        canvas2.drawRoundRect(rectF2, f102, f102, paint);
                        if (this.a.a != Integer.MAX_VALUE) {
                        }
                    } else {
                        int i32 = g81.s0;
                    }
                }
                if (this.a.a != Integer.MAX_VALUE) {
                    int i33 = g81.s0;
                }
                canvas.restore();
            }
            int i34 = g81.s0;
        }
        i16 = 0;
        int i262 = this.a.c;
        if (i16 == 0) {
        }
        this.b = i262 + i17;
        int measuredWidth2 = (getMeasuredWidth() - this.b) / 2;
        charSequence = this.a.b;
        if (charSequence != null) {
        }
        f01Var = this.e;
        if (f01Var == null) {
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
        d81 d81Var = this.a;
        accessibilityNodeInfo.setSelected((d81Var == null || (i10 = this.r.G) == -1 || d81Var.a != i10) ? false : true);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        d81 d81Var = this.a;
        g81 g81Var = this.r;
        setMeasuredDimension(AndroidUtilities.dp(g81Var.r * 2) + d81Var.a(g81Var.c) + g81Var.I, View.MeasureSpec.getSize(i11));
    }

    public void setReordering(boolean z10) {
        if (this.f == z10) {
            return;
        }
        this.f = z10;
        invalidate();
    }
}
