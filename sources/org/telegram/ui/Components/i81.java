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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class i81 extends View {
    public h81 a;
    public int b;
    public final RectF c;
    public CharSequence d;
    public k01 e;
    public boolean f;
    public bp0 h;
    public final z5 n;
    public final /* synthetic */ k81 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i81(k81 k81Var, Context context) {
        super(context);
        this.r = k81Var;
        this.c = new RectF();
        this.n = new z5(this, 360L, mr.h);
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
        k01 k01Var;
        Canvas canvas2;
        int i18;
        int i19;
        int i20;
        int i21;
        k81 k81Var = this.r;
        TextPaint textPaint = k81Var.d;
        TextPaint textPaint2 = k81Var.e;
        Paint paint = k81Var.f;
        org.telegram.ui.ActionBar.f6 f6Var = k81Var.g0;
        TextPaint textPaint3 = k81Var.c;
        canvas.save();
        float e = this.n.e(this.f);
        if (e > 0.0f) {
            if (this.h == null) {
                this.h = new bp0(this);
            }
            canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
            this.h.a(canvas, e);
            canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
        }
        int i22 = this.a.a;
        if (i22 != Integer.MAX_VALUE) {
            int i23 = k81.p0;
        }
        int i24 = k81Var.J;
        if (i24 != -1) {
            i11 = k81Var.D;
            i10 = i24;
        } else {
            i10 = k81Var.D;
            i11 = k81Var.e0;
        }
        if (i22 == i10) {
            i12 = k81Var.N;
            f10 = 0.0f;
            i13 = k81Var.O;
            i14 = org.telegram.ui.ActionBar.j6.T9;
            i15 = org.telegram.ui.ActionBar.j6.U9;
        } else {
            f10 = 0.0f;
            i12 = k81Var.O;
            i13 = k81Var.N;
            i14 = org.telegram.ui.ActionBar.j6.U9;
            i15 = org.telegram.ui.ActionBar.j6.T9;
        }
        if (k81Var.B == 9) {
            textPaint3.setColor(org.telegram.ui.ActionBar.j6.v0(k81Var.O, f6Var));
        } else if ((k81Var.G || i24 != -1) && (i22 == i10 || i22 == i11)) {
            textPaint3.setColor(i0.a.d(k81Var.H, org.telegram.ui.ActionBar.j6.v0(i13, f6Var), org.telegram.ui.ActionBar.j6.v0(i12, f6Var)));
        } else {
            textPaint3.setColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        }
        this.a.getClass();
        if (this.a.a != Integer.MAX_VALUE) {
            if (k81Var.n) {
                float dp = AndroidUtilities.dp(20.0f);
                int i25 = k81.p0;
                i16 = (int) ((dp * f10) + 0);
                int i26 = this.a.c;
                if (i16 == 0) {
                    int i27 = k81.p0;
                    i17 = AndroidUtilities.dp(f10) + i16;
                } else {
                    i17 = 0;
                }
                this.b = i26 + i17;
                int measuredWidth = (getMeasuredWidth() - this.b) / 2;
                charSequence = this.a.b;
                if ((charSequence != null && this.d != null) || !TextUtils.equals(charSequence, this.d)) {
                    h81 h81Var = this.a;
                    CharSequence replaceEmoji = Emoji.replaceEmoji(h81Var.b, textPaint3.getFontMetricsInt(), false);
                    h81Var.b = replaceEmoji;
                    this.d = replaceEmoji;
                    k01 k01Var2 = this.e;
                    if (k01Var2 != null) {
                        u5.release(k01Var2.j, k01Var2.k);
                    }
                    k01 k01Var3 = new k01(this.d, textPaint3.getTextSize() / AndroidUtilities.density, textPaint3.getTypeface());
                    k01Var3.s(this);
                    this.e = k01Var3;
                }
                k01Var = this.e;
                if (k01Var == null) {
                    k01Var.p = AndroidUtilities.dp(400.0f);
                    i20 = i11;
                    i19 = i10;
                    i18 = measuredWidth;
                    k01Var.c(measuredWidth, getMeasuredHeight() / 2, 1.0f, textPaint3.getColor(), canvas);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    i18 = measuredWidth;
                    i19 = i10;
                    i20 = i11;
                }
                if (this.a.a != Integer.MAX_VALUE) {
                    if (k81Var.n) {
                        textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(k81Var.Q, f6Var));
                        if (org.telegram.ui.ActionBar.j6.c1(i14) && org.telegram.ui.ActionBar.j6.c1(i15)) {
                            int v02 = org.telegram.ui.ActionBar.j6.v0(i14, f6Var);
                            if ((k81Var.G || k81Var.I != -1) && ((i21 = this.a.a) == i19 || i21 == i20)) {
                                paint.setColor(i0.a.d(k81Var.H, org.telegram.ui.ActionBar.j6.v0(i15, f6Var), v02));
                            } else {
                                paint.setColor(v02);
                            }
                        } else {
                            paint.setColor(textPaint3.getColor());
                        }
                        int dp2 = AndroidUtilities.dp(6.0f) + i18 + this.a.c;
                        int x10 = org.telegram.ui.b.x(20.0f, getMeasuredHeight(), 2);
                        if (this.a.a != Integer.MAX_VALUE) {
                            if (k81Var.n) {
                                int i28 = k81.p0;
                                paint.setAlpha((int) 0.0f);
                                float dp3 = AndroidUtilities.dp(20.0f) + x10;
                                RectF rectF = this.c;
                                rectF.set(dp2, x10, dp2 + i16, dp3);
                                float f11 = AndroidUtilities.density * 11.5f;
                                canvas2.drawRoundRect(rectF, f11, f11, paint);
                                if (this.a.a != Integer.MAX_VALUE) {
                                    if (k81Var.n) {
                                        textPaint2.setColor(textPaint.getColor());
                                        int i29 = k81.p0;
                                        textPaint2.setAlpha((int) 0.0f);
                                        float dp4 = AndroidUtilities.dp(3.0f);
                                        canvas2.drawLine(rectF.centerX() - dp4, rectF.centerY() - dp4, rectF.centerX() + dp4, rectF.centerY() + dp4, textPaint2);
                                        canvas.drawLine(rectF.centerX() - dp4, rectF.centerY() + dp4, rectF.centerX() + dp4, rectF.centerY() - dp4, textPaint2);
                                    } else {
                                        int i30 = k81.p0;
                                    }
                                }
                            } else {
                                int i31 = k81.p0;
                            }
                        }
                        paint.setAlpha(255);
                        float dp32 = AndroidUtilities.dp(20.0f) + x10;
                        RectF rectF2 = this.c;
                        rectF2.set(dp2, x10, dp2 + i16, dp32);
                        float f112 = AndroidUtilities.density * 11.5f;
                        canvas2.drawRoundRect(rectF2, f112, f112, paint);
                        if (this.a.a != Integer.MAX_VALUE) {
                        }
                    } else {
                        int i32 = k81.p0;
                    }
                }
                if (this.a.a != Integer.MAX_VALUE) {
                    int i33 = k81.p0;
                }
                canvas.restore();
            }
            int i34 = k81.p0;
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
        k01Var = this.e;
        if (k01Var == null) {
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
        h81 h81Var = this.a;
        accessibilityNodeInfo.setSelected((h81Var == null || (i10 = this.r.D) == -1 || h81Var.a != i10) ? false : true);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        h81 h81Var = this.a;
        k81 k81Var = this.r;
        setMeasuredDimension(AndroidUtilities.dp(k81Var.r * 2) + h81Var.a(k81Var.c) + k81Var.F, View.MeasureSpec.getSize(i11));
    }

    public void setReordering(boolean z4) {
        if (this.f == z4) {
            return;
        }
        this.f = z4;
        invalidate();
    }
}
