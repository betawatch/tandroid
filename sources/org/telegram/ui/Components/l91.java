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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class l91 extends View {
    public k91 a;
    public int b;
    public final RectF c;
    public CharSequence d;
    public l11 e;
    public boolean f;
    public dq0 h;
    public final g6 n;
    public final /* synthetic */ n91 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l91(n91 n91Var, Context context) {
        super(context);
        this.r = n91Var;
        this.c = new RectF();
        this.n = new g6(this, 360L, hs.h);
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
        l11 l11Var;
        Canvas canvas2;
        int i19;
        int i20;
        int i21;
        int i22;
        n91 n91Var = this.r;
        TextPaint textPaint = n91Var.d;
        TextPaint textPaint2 = n91Var.e;
        Paint paint = n91Var.f;
        org.telegram.ui.ActionBar.e6 e6Var = n91Var.j0;
        TextPaint textPaint3 = n91Var.c;
        canvas.save();
        float e7 = this.n.e(this.f);
        if (e7 > 0.0f) {
            if (this.h == null) {
                this.h = new dq0(this);
            }
            canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
            this.h.a(canvas, e7);
            canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
        }
        int i23 = this.a.a;
        if (i23 != Integer.MAX_VALUE) {
            int i24 = n91.s0;
        }
        int i25 = n91Var.M;
        if (i25 != -1) {
            i11 = n91Var.G;
            i10 = i25;
        } else {
            i10 = n91Var.G;
            i11 = n91Var.h0;
        }
        if (i23 == i10) {
            i12 = n91Var.Q;
            f7 = 0.0f;
            i13 = n91Var.R;
            i14 = org.telegram.ui.ActionBar.i6.T9;
            i15 = org.telegram.ui.ActionBar.i6.U9;
        } else {
            f7 = 0.0f;
            i12 = n91Var.R;
            i13 = n91Var.Q;
            i14 = org.telegram.ui.ActionBar.i6.U9;
            i15 = org.telegram.ui.ActionBar.i6.T9;
        }
        if (n91Var.E == 9) {
            textPaint3.setColor(org.telegram.ui.ActionBar.i6.w0(n91Var.R, e6Var));
        } else if ((n91Var.J || i25 != -1) && (i23 == i10 || i23 == i11)) {
            textPaint3.setColor(i0.a.d(n91Var.K, org.telegram.ui.ActionBar.i6.w0(i13, e6Var), org.telegram.ui.ActionBar.i6.w0(i12, e6Var)));
        } else {
            textPaint3.setColor(org.telegram.ui.ActionBar.i6.w0(i12, e6Var));
        }
        this.a.getClass();
        if (this.a.a != Integer.MAX_VALUE) {
            if (n91Var.n) {
                float dp = AndroidUtilities.dp(20.0f);
                int i26 = n91.s0;
                i16 = (int) ((dp * f7) + 0);
                int i27 = this.a.c;
                if (i16 == 0) {
                    int i28 = n91.s0;
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
                    k91 k91Var = this.a;
                    i18 = 2;
                    CharSequence replaceEmoji = Emoji.replaceEmoji(k91Var.b, textPaint3.getFontMetricsInt(), false);
                    k91Var.b = replaceEmoji;
                    this.d = replaceEmoji;
                    l11 l11Var2 = this.e;
                    if (l11Var2 != null) {
                        b6.release(l11Var2.j, l11Var2.k);
                    }
                    l11 l11Var3 = new l11(this.d, textPaint3.getTextSize() / AndroidUtilities.density, textPaint3.getTypeface());
                    l11Var3.s(this);
                    this.e = l11Var3;
                }
                l11Var = this.e;
                if (l11Var == null) {
                    l11Var.p = AndroidUtilities.dp(400.0f);
                    i21 = i11;
                    i20 = i10;
                    i19 = measuredWidth;
                    l11Var.c(measuredWidth, getMeasuredHeight() / 2, 1.0f, textPaint3.getColor(), canvas);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    i19 = measuredWidth;
                    i20 = i10;
                    i21 = i11;
                }
                if (this.a.a != Integer.MAX_VALUE) {
                    if (n91Var.n) {
                        textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(n91Var.T, e6Var));
                        if (org.telegram.ui.ActionBar.i6.d1(i14) && org.telegram.ui.ActionBar.i6.d1(i15)) {
                            int w02 = org.telegram.ui.ActionBar.i6.w0(i14, e6Var);
                            if ((n91Var.J || n91Var.L != -1) && ((i22 = this.a.a) == i20 || i22 == i21)) {
                                paint.setColor(i0.a.d(n91Var.K, org.telegram.ui.ActionBar.i6.w0(i15, e6Var), w02));
                            } else {
                                paint.setColor(w02);
                            }
                        } else {
                            paint.setColor(textPaint3.getColor());
                        }
                        int dp2 = AndroidUtilities.dp(6.0f) + i19 + this.a.c;
                        int A = org.telegram.messenger.bi.A(20.0f, getMeasuredHeight(), i18);
                        if (this.a.a != Integer.MAX_VALUE) {
                            if (n91Var.n) {
                                int i29 = n91.s0;
                                paint.setAlpha((int) f7);
                                float dp3 = AndroidUtilities.dp(20.0f) + A;
                                RectF rectF = this.c;
                                rectF.set(dp2, A, dp2 + i16, dp3);
                                float f10 = AndroidUtilities.density * 11.5f;
                                canvas2.drawRoundRect(rectF, f10, f10, paint);
                                if (this.a.a != Integer.MAX_VALUE) {
                                    if (n91Var.n) {
                                        textPaint2.setColor(textPaint.getColor());
                                        int i30 = n91.s0;
                                        textPaint2.setAlpha((int) 0.0f);
                                        float dp4 = AndroidUtilities.dp(3.0f);
                                        canvas2.drawLine(rectF.centerX() - dp4, rectF.centerY() - dp4, rectF.centerX() + dp4, rectF.centerY() + dp4, textPaint2);
                                        canvas.drawLine(rectF.centerX() - dp4, rectF.centerY() + dp4, rectF.centerX() + dp4, rectF.centerY() - dp4, textPaint2);
                                    } else {
                                        int i31 = n91.s0;
                                    }
                                }
                            } else {
                                int i32 = n91.s0;
                            }
                        }
                        paint.setAlpha(255);
                        float dp32 = AndroidUtilities.dp(20.0f) + A;
                        RectF rectF2 = this.c;
                        rectF2.set(dp2, A, dp2 + i16, dp32);
                        float f102 = AndroidUtilities.density * 11.5f;
                        canvas2.drawRoundRect(rectF2, f102, f102, paint);
                        if (this.a.a != Integer.MAX_VALUE) {
                        }
                    } else {
                        int i33 = n91.s0;
                    }
                }
                if (this.a.a != Integer.MAX_VALUE) {
                    int i34 = n91.s0;
                }
                canvas.restore();
            }
            int i35 = n91.s0;
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
        l11Var = this.e;
        if (l11Var == null) {
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
        k91 k91Var = this.a;
        accessibilityNodeInfo.setSelected((k91Var == null || (i10 = this.r.G) == -1 || k91Var.a != i10) ? false : true);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        k91 k91Var = this.a;
        n91 n91Var = this.r;
        setMeasuredDimension(AndroidUtilities.dp(n91Var.r * 2) + k91Var.a(n91Var.c) + n91Var.I, View.MeasureSpec.getSize(i11));
    }

    public void setReordering(boolean z10) {
        if (this.f == z10) {
            return;
        }
        this.f = z10;
        invalidate();
    }
}
