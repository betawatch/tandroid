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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class w71 extends View {
    public v71 a;
    public int b;
    public final RectF c;
    public CharSequence d;
    public zz0 e;
    public boolean f;
    public so0 h;
    public final d6 n;
    public final /* synthetic */ y71 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w71(y71 y71Var, Context context) {
        super(context);
        this.r = y71Var;
        this.c = new RectF();
        this.n = new d6(this, 360L, jr.h);
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
        float f9;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        CharSequence charSequence;
        zz0 zz0Var;
        Canvas canvas2;
        int i18;
        int i19;
        int i20;
        int i21;
        y71 y71Var = this.r;
        TextPaint textPaint = y71Var.d;
        TextPaint textPaint2 = y71Var.e;
        Paint paint = y71Var.f;
        org.telegram.ui.ActionBar.c6 c6Var = y71Var.f0;
        TextPaint textPaint3 = y71Var.c;
        canvas.save();
        float e10 = this.n.e(this.f);
        if (e10 > 0.0f) {
            if (this.h == null) {
                this.h = new so0(this);
            }
            canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
            this.h.a(canvas, e10);
            canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
        }
        int i22 = this.a.a;
        if (i22 != Integer.MAX_VALUE) {
            int i23 = y71.o0;
        }
        int i24 = y71Var.I;
        if (i24 != -1) {
            i11 = y71Var.C;
            i10 = i24;
        } else {
            i10 = y71Var.C;
            i11 = y71Var.d0;
        }
        if (i22 == i10) {
            i12 = y71Var.M;
            f9 = 0.0f;
            i13 = y71Var.N;
            i14 = org.telegram.ui.ActionBar.g6.T9;
            i15 = org.telegram.ui.ActionBar.g6.U9;
        } else {
            f9 = 0.0f;
            i12 = y71Var.N;
            i13 = y71Var.M;
            i14 = org.telegram.ui.ActionBar.g6.U9;
            i15 = org.telegram.ui.ActionBar.g6.T9;
        }
        if (y71Var.A == 9) {
            textPaint3.setColor(org.telegram.ui.ActionBar.g6.v0(y71Var.N, c6Var));
        } else if ((y71Var.F || i24 != -1) && (i22 == i10 || i22 == i11)) {
            textPaint3.setColor(i0.a.d(y71Var.G, org.telegram.ui.ActionBar.g6.v0(i13, c6Var), org.telegram.ui.ActionBar.g6.v0(i12, c6Var)));
        } else {
            textPaint3.setColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        }
        this.a.getClass();
        if (this.a.a != Integer.MAX_VALUE) {
            if (y71Var.n) {
                float dp = AndroidUtilities.dp(20.0f);
                int i25 = y71.o0;
                i16 = (int) ((dp * f9) + 0);
                int i26 = this.a.c;
                if (i16 == 0) {
                    int i27 = y71.o0;
                    i17 = AndroidUtilities.dp(f9) + i16;
                } else {
                    i17 = 0;
                }
                this.b = i26 + i17;
                int measuredWidth = (getMeasuredWidth() - this.b) / 2;
                charSequence = this.a.b;
                if ((charSequence != null && this.d != null) || !TextUtils.equals(charSequence, this.d)) {
                    v71 v71Var = this.a;
                    CharSequence replaceEmoji = Emoji.replaceEmoji(v71Var.b, textPaint3.getFontMetricsInt(), false);
                    v71Var.b = replaceEmoji;
                    this.d = replaceEmoji;
                    zz0 zz0Var2 = this.e;
                    if (zz0Var2 != null) {
                        y5.release(zz0Var2.j, zz0Var2.k);
                    }
                    zz0 zz0Var3 = new zz0(this.d, textPaint3.getTextSize() / AndroidUtilities.density, textPaint3.getTypeface());
                    zz0Var3.s(this);
                    this.e = zz0Var3;
                }
                zz0Var = this.e;
                if (zz0Var == null) {
                    zz0Var.p = AndroidUtilities.dp(400.0f);
                    i20 = i11;
                    i19 = i10;
                    i18 = measuredWidth;
                    zz0Var.c(measuredWidth, getMeasuredHeight() / 2, 1.0f, textPaint3.getColor(), canvas);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    i18 = measuredWidth;
                    i19 = i10;
                    i20 = i11;
                }
                if (this.a.a != Integer.MAX_VALUE) {
                    if (y71Var.n) {
                        textPaint.setColor(org.telegram.ui.ActionBar.g6.v0(y71Var.P, c6Var));
                        if (org.telegram.ui.ActionBar.g6.c1(i14) && org.telegram.ui.ActionBar.g6.c1(i15)) {
                            int v02 = org.telegram.ui.ActionBar.g6.v0(i14, c6Var);
                            if ((y71Var.F || y71Var.H != -1) && ((i21 = this.a.a) == i19 || i21 == i20)) {
                                paint.setColor(i0.a.d(y71Var.G, org.telegram.ui.ActionBar.g6.v0(i15, c6Var), v02));
                            } else {
                                paint.setColor(v02);
                            }
                        } else {
                            paint.setColor(textPaint3.getColor());
                        }
                        int dp2 = AndroidUtilities.dp(6.0f) + i18 + this.a.c;
                        int x4 = org.telegram.ui.b.x(20.0f, getMeasuredHeight(), 2);
                        if (this.a.a != Integer.MAX_VALUE) {
                            if (y71Var.n) {
                                int i28 = y71.o0;
                                paint.setAlpha((int) 0.0f);
                                float dp3 = AndroidUtilities.dp(20.0f) + x4;
                                RectF rectF = this.c;
                                rectF.set(dp2, x4, dp2 + i16, dp3);
                                float f10 = AndroidUtilities.density * 11.5f;
                                canvas2.drawRoundRect(rectF, f10, f10, paint);
                                if (this.a.a != Integer.MAX_VALUE) {
                                    if (y71Var.n) {
                                        textPaint2.setColor(textPaint.getColor());
                                        int i29 = y71.o0;
                                        textPaint2.setAlpha((int) 0.0f);
                                        float dp4 = AndroidUtilities.dp(3.0f);
                                        canvas2.drawLine(rectF.centerX() - dp4, rectF.centerY() - dp4, rectF.centerX() + dp4, rectF.centerY() + dp4, textPaint2);
                                        canvas.drawLine(rectF.centerX() - dp4, rectF.centerY() + dp4, rectF.centerX() + dp4, rectF.centerY() - dp4, textPaint2);
                                    } else {
                                        int i30 = y71.o0;
                                    }
                                }
                            } else {
                                int i31 = y71.o0;
                            }
                        }
                        paint.setAlpha(255);
                        float dp32 = AndroidUtilities.dp(20.0f) + x4;
                        RectF rectF2 = this.c;
                        rectF2.set(dp2, x4, dp2 + i16, dp32);
                        float f102 = AndroidUtilities.density * 11.5f;
                        canvas2.drawRoundRect(rectF2, f102, f102, paint);
                        if (this.a.a != Integer.MAX_VALUE) {
                        }
                    } else {
                        int i32 = y71.o0;
                    }
                }
                if (this.a.a != Integer.MAX_VALUE) {
                    int i33 = y71.o0;
                }
                canvas.restore();
            }
            int i34 = y71.o0;
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
        zz0Var = this.e;
        if (zz0Var == null) {
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
        v71 v71Var = this.a;
        accessibilityNodeInfo.setSelected((v71Var == null || (i10 = this.r.C) == -1 || v71Var.a != i10) ? false : true);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        v71 v71Var = this.a;
        y71 y71Var = this.r;
        setMeasuredDimension(AndroidUtilities.dp(y71Var.r * 2) + v71Var.a(y71Var.c) + y71Var.E, View.MeasureSpec.getSize(i11));
    }

    public void setReordering(boolean z10) {
        if (this.f == z10) {
            return;
        }
        this.f = z10;
        invalidate();
    }
}
