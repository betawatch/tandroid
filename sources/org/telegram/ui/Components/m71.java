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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class m71 extends View {
    public l71 a;
    public int b;
    public final RectF c;
    public CharSequence d;
    public pz0 e;
    public boolean f;
    public io0 h;
    public final y5 n;
    public final /* synthetic */ o71 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m71(o71 o71Var, Context context) {
        super(context);
        this.r = o71Var;
        this.c = new RectF();
        this.n = new y5(this, 360L, er.h);
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
        float f10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        CharSequence charSequence;
        pz0 pz0Var;
        Canvas canvas2;
        int i18;
        int i19;
        int i20;
        int i21;
        o71 o71Var = this.r;
        TextPaint textPaint = o71Var.d;
        TextPaint textPaint2 = o71Var.e;
        Paint paint = o71Var.f;
        org.telegram.ui.ActionBar.c6 c6Var = o71Var.f0;
        TextPaint textPaint3 = o71Var.c;
        canvas.save();
        float e9 = this.n.e(this.f);
        if (e9 > 0.0f) {
            if (this.h == null) {
                this.h = new io0(this);
            }
            canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
            this.h.a(canvas, e9);
            canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
        }
        int i22 = this.a.a;
        if (i22 != Integer.MAX_VALUE) {
            int i23 = o71.o0;
        }
        int i24 = o71Var.I;
        if (i24 != -1) {
            i11 = o71Var.C;
            i10 = i24;
        } else {
            i10 = o71Var.C;
            i11 = o71Var.d0;
        }
        if (i22 == i10) {
            i12 = o71Var.M;
            f10 = 0.0f;
            i13 = o71Var.N;
            i14 = org.telegram.ui.ActionBar.g6.T9;
            i15 = org.telegram.ui.ActionBar.g6.U9;
        } else {
            f10 = 0.0f;
            i12 = o71Var.N;
            i13 = o71Var.M;
            i14 = org.telegram.ui.ActionBar.g6.U9;
            i15 = org.telegram.ui.ActionBar.g6.T9;
        }
        if (o71Var.A == 9) {
            textPaint3.setColor(org.telegram.ui.ActionBar.g6.v0(o71Var.N, c6Var));
        } else if ((o71Var.F || i24 != -1) && (i22 == i10 || i22 == i11)) {
            textPaint3.setColor(i0.b.d(o71Var.G, org.telegram.ui.ActionBar.g6.v0(i13, c6Var), org.telegram.ui.ActionBar.g6.v0(i12, c6Var)));
        } else {
            textPaint3.setColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        }
        this.a.getClass();
        if (this.a.a != Integer.MAX_VALUE) {
            if (o71Var.n) {
                float dp = AndroidUtilities.dp(20.0f);
                int i25 = o71.o0;
                i16 = (int) ((dp * f10) + 0);
                int i26 = this.a.c;
                if (i16 == 0) {
                    int i27 = o71.o0;
                    i17 = AndroidUtilities.dp(f10) + i16;
                } else {
                    i17 = 0;
                }
                this.b = i26 + i17;
                int measuredWidth = (getMeasuredWidth() - this.b) / 2;
                charSequence = this.a.b;
                if ((charSequence != null && this.d != null) || !TextUtils.equals(charSequence, this.d)) {
                    l71 l71Var = this.a;
                    CharSequence replaceEmoji = Emoji.replaceEmoji(l71Var.b, textPaint3.getFontMetricsInt(), false);
                    l71Var.b = replaceEmoji;
                    this.d = replaceEmoji;
                    pz0 pz0Var2 = this.e;
                    if (pz0Var2 != null) {
                        t5.release(pz0Var2.j, pz0Var2.k);
                    }
                    pz0 pz0Var3 = new pz0(this.d, textPaint3.getTextSize() / AndroidUtilities.density, textPaint3.getTypeface());
                    pz0Var3.s(this);
                    this.e = pz0Var3;
                }
                pz0Var = this.e;
                if (pz0Var == null) {
                    pz0Var.p = AndroidUtilities.dp(400.0f);
                    i20 = i11;
                    i19 = i10;
                    i18 = measuredWidth;
                    pz0Var.c(measuredWidth, getMeasuredHeight() / 2, 1.0f, textPaint3.getColor(), canvas);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    i18 = measuredWidth;
                    i19 = i10;
                    i20 = i11;
                }
                if (this.a.a != Integer.MAX_VALUE) {
                    if (o71Var.n) {
                        textPaint.setColor(org.telegram.ui.ActionBar.g6.v0(o71Var.P, c6Var));
                        if (org.telegram.ui.ActionBar.g6.c1(i14) && org.telegram.ui.ActionBar.g6.c1(i15)) {
                            int v02 = org.telegram.ui.ActionBar.g6.v0(i14, c6Var);
                            if ((o71Var.F || o71Var.H != -1) && ((i21 = this.a.a) == i19 || i21 == i20)) {
                                paint.setColor(i0.b.d(o71Var.G, org.telegram.ui.ActionBar.g6.v0(i15, c6Var), v02));
                            } else {
                                paint.setColor(v02);
                            }
                        } else {
                            paint.setColor(textPaint3.getColor());
                        }
                        int dp2 = AndroidUtilities.dp(6.0f) + i18 + this.a.c;
                        int x8 = org.telegram.messenger.rl.x(20.0f, getMeasuredHeight(), 2);
                        if (this.a.a != Integer.MAX_VALUE) {
                            if (o71Var.n) {
                                int i28 = o71.o0;
                                paint.setAlpha((int) 0.0f);
                                float dp3 = AndroidUtilities.dp(20.0f) + x8;
                                RectF rectF = this.c;
                                rectF.set(dp2, x8, dp2 + i16, dp3);
                                float f11 = AndroidUtilities.density * 11.5f;
                                canvas2.drawRoundRect(rectF, f11, f11, paint);
                                if (this.a.a != Integer.MAX_VALUE) {
                                    if (o71Var.n) {
                                        textPaint2.setColor(textPaint.getColor());
                                        int i29 = o71.o0;
                                        textPaint2.setAlpha((int) 0.0f);
                                        float dp4 = AndroidUtilities.dp(3.0f);
                                        canvas2.drawLine(rectF.centerX() - dp4, rectF.centerY() - dp4, rectF.centerX() + dp4, rectF.centerY() + dp4, textPaint2);
                                        canvas.drawLine(rectF.centerX() - dp4, rectF.centerY() + dp4, rectF.centerX() + dp4, rectF.centerY() - dp4, textPaint2);
                                    } else {
                                        int i30 = o71.o0;
                                    }
                                }
                            } else {
                                int i31 = o71.o0;
                            }
                        }
                        paint.setAlpha(255);
                        float dp32 = AndroidUtilities.dp(20.0f) + x8;
                        RectF rectF2 = this.c;
                        rectF2.set(dp2, x8, dp2 + i16, dp32);
                        float f112 = AndroidUtilities.density * 11.5f;
                        canvas2.drawRoundRect(rectF2, f112, f112, paint);
                        if (this.a.a != Integer.MAX_VALUE) {
                        }
                    } else {
                        int i32 = o71.o0;
                    }
                }
                if (this.a.a != Integer.MAX_VALUE) {
                    int i33 = o71.o0;
                }
                canvas.restore();
            }
            int i34 = o71.o0;
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
        pz0Var = this.e;
        if (pz0Var == null) {
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
        l71 l71Var = this.a;
        accessibilityNodeInfo.setSelected((l71Var == null || (i10 = this.r.C) == -1 || l71Var.a != i10) ? false : true);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        l71 l71Var = this.a;
        o71 o71Var = this.r;
        setMeasuredDimension(AndroidUtilities.dp(o71Var.r * 2) + l71Var.a(o71Var.c) + o71Var.E, View.MeasureSpec.getSize(i11));
    }

    public void setReordering(boolean z10) {
        if (this.f == z10) {
            return;
        }
        this.f = z10;
        invalidate();
    }
}
