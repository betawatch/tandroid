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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class s81 extends View {
    public r81 a;
    public int b;
    public final RectF c;
    public CharSequence d;
    public t01 e;
    public boolean f;
    public jp0 h;
    public final d6 n;
    public final /* synthetic */ u81 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s81(u81 u81Var, Context context) {
        super(context);
        this.r = u81Var;
        this.c = new RectF();
        this.n = new d6(this, 360L, wr.h);
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
        t01 t01Var;
        Canvas canvas2;
        int i18;
        int i19;
        int i20;
        int i21;
        u81 u81Var = this.r;
        TextPaint textPaint = u81Var.d;
        TextPaint textPaint2 = u81Var.e;
        Paint paint = u81Var.f;
        org.telegram.ui.ActionBar.f6 f6Var = u81Var.j0;
        TextPaint textPaint3 = u81Var.c;
        canvas.save();
        float e = this.n.e(this.f);
        if (e > 0.0f) {
            if (this.h == null) {
                this.h = new jp0(this);
            }
            canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
            this.h.a(canvas, e);
            canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
        }
        int i22 = this.a.a;
        if (i22 != Integer.MAX_VALUE) {
            int i23 = u81.s0;
        }
        int i24 = u81Var.M;
        if (i24 != -1) {
            i11 = u81Var.G;
            i10 = i24;
        } else {
            i10 = u81Var.G;
            i11 = u81Var.h0;
        }
        if (i22 == i10) {
            i12 = u81Var.Q;
            f7 = 0.0f;
            i13 = u81Var.R;
            i14 = org.telegram.ui.ActionBar.j6.T9;
            i15 = org.telegram.ui.ActionBar.j6.U9;
        } else {
            f7 = 0.0f;
            i12 = u81Var.R;
            i13 = u81Var.Q;
            i14 = org.telegram.ui.ActionBar.j6.U9;
            i15 = org.telegram.ui.ActionBar.j6.T9;
        }
        if (u81Var.E == 9) {
            textPaint3.setColor(org.telegram.ui.ActionBar.j6.v0(u81Var.R, f6Var));
        } else if ((u81Var.J || i24 != -1) && (i22 == i10 || i22 == i11)) {
            textPaint3.setColor(i0.a.d(u81Var.K, org.telegram.ui.ActionBar.j6.v0(i13, f6Var), org.telegram.ui.ActionBar.j6.v0(i12, f6Var)));
        } else {
            textPaint3.setColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        }
        this.a.getClass();
        if (this.a.a != Integer.MAX_VALUE) {
            if (u81Var.n) {
                float dp = AndroidUtilities.dp(20.0f);
                int i25 = u81.s0;
                i16 = (int) ((dp * f7) + 0);
                int i26 = this.a.c;
                if (i16 == 0) {
                    int i27 = u81.s0;
                    i17 = AndroidUtilities.dp(f7) + i16;
                } else {
                    i17 = 0;
                }
                this.b = i26 + i17;
                int measuredWidth = (getMeasuredWidth() - this.b) / 2;
                charSequence = this.a.b;
                if ((charSequence != null && this.d != null) || !TextUtils.equals(charSequence, this.d)) {
                    r81 r81Var = this.a;
                    CharSequence replaceEmoji = Emoji.replaceEmoji(r81Var.b, textPaint3.getFontMetricsInt(), false);
                    r81Var.b = replaceEmoji;
                    this.d = replaceEmoji;
                    t01 t01Var2 = this.e;
                    if (t01Var2 != null) {
                        y5.release(t01Var2.j, t01Var2.k);
                    }
                    t01 t01Var3 = new t01(this.d, textPaint3.getTextSize() / AndroidUtilities.density, textPaint3.getTypeface());
                    t01Var3.s(this);
                    this.e = t01Var3;
                }
                t01Var = this.e;
                if (t01Var == null) {
                    t01Var.p = AndroidUtilities.dp(400.0f);
                    i20 = i11;
                    i19 = i10;
                    i18 = measuredWidth;
                    t01Var.c(measuredWidth, getMeasuredHeight() / 2, 1.0f, textPaint3.getColor(), canvas);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    i18 = measuredWidth;
                    i19 = i10;
                    i20 = i11;
                }
                if (this.a.a != Integer.MAX_VALUE) {
                    if (u81Var.n) {
                        textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(u81Var.T, f6Var));
                        if (org.telegram.ui.ActionBar.j6.c1(i14) && org.telegram.ui.ActionBar.j6.c1(i15)) {
                            int v02 = org.telegram.ui.ActionBar.j6.v0(i14, f6Var);
                            if ((u81Var.J || u81Var.L != -1) && ((i21 = this.a.a) == i19 || i21 == i20)) {
                                paint.setColor(i0.a.d(u81Var.K, org.telegram.ui.ActionBar.j6.v0(i15, f6Var), v02));
                            } else {
                                paint.setColor(v02);
                            }
                        } else {
                            paint.setColor(textPaint3.getColor());
                        }
                        int dp2 = AndroidUtilities.dp(6.0f) + i18 + this.a.c;
                        int y3 = org.telegram.messenger.em.y(20.0f, getMeasuredHeight(), 2);
                        if (this.a.a != Integer.MAX_VALUE) {
                            if (u81Var.n) {
                                int i28 = u81.s0;
                                paint.setAlpha((int) 0.0f);
                                float dp3 = AndroidUtilities.dp(20.0f) + y3;
                                RectF rectF = this.c;
                                rectF.set(dp2, y3, dp2 + i16, dp3);
                                float f10 = AndroidUtilities.density * 11.5f;
                                canvas2.drawRoundRect(rectF, f10, f10, paint);
                                if (this.a.a != Integer.MAX_VALUE) {
                                    if (u81Var.n) {
                                        textPaint2.setColor(textPaint.getColor());
                                        int i29 = u81.s0;
                                        textPaint2.setAlpha((int) 0.0f);
                                        float dp4 = AndroidUtilities.dp(3.0f);
                                        canvas2.drawLine(rectF.centerX() - dp4, rectF.centerY() - dp4, rectF.centerX() + dp4, rectF.centerY() + dp4, textPaint2);
                                        canvas.drawLine(rectF.centerX() - dp4, rectF.centerY() + dp4, rectF.centerX() + dp4, rectF.centerY() - dp4, textPaint2);
                                    } else {
                                        int i30 = u81.s0;
                                    }
                                }
                            } else {
                                int i31 = u81.s0;
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
                        int i32 = u81.s0;
                    }
                }
                if (this.a.a != Integer.MAX_VALUE) {
                    int i33 = u81.s0;
                }
                canvas.restore();
            }
            int i34 = u81.s0;
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
        t01Var = this.e;
        if (t01Var == null) {
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
        r81 r81Var = this.a;
        accessibilityNodeInfo.setSelected((r81Var == null || (i10 = this.r.G) == -1 || r81Var.a != i10) ? false : true);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        r81 r81Var = this.a;
        u81 u81Var = this.r;
        setMeasuredDimension(AndroidUtilities.dp(u81Var.r * 2) + r81Var.a(u81Var.c) + u81Var.I, View.MeasureSpec.getSize(i11));
    }

    public void setReordering(boolean z10) {
        if (this.f == z10) {
            return;
        }
        this.f = z10;
        invalidate();
    }
}
