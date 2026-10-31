package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class t71 extends View {
    public s71 a;
    public int b;
    public final RectF c;
    public CharSequence d;
    public qz0 e;
    public boolean f;
    public fo0 h;
    public final t5 n;
    public final /* synthetic */ v71 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t71(v71 v71Var, Context context) {
        super(context);
        this.r = v71Var;
        this.c = new RectF();
        this.n = new t5(this, 360L, gr.h);
    }

    @Override // android.view.View
    public int getId() {
        return this.a.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016b  */
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
        qz0 qz0Var;
        Canvas canvas2;
        int i19;
        int i20;
        int i21;
        int i22;
        v71 v71Var = this.r;
        TextPaint textPaint = v71Var.d;
        TextPaint textPaint2 = v71Var.e;
        Paint paint = v71Var.f;
        org.telegram.ui.ActionBar.p6 p6Var = v71Var.j0;
        TextPaint textPaint3 = v71Var.c;
        canvas.save();
        float d = this.n.d(this.f);
        if (d > 0.0f) {
            if (this.h == null) {
                this.h = new fo0(this);
            }
            canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
            this.h.a(canvas, d);
            canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
        }
        int i23 = this.a.a;
        if (i23 != Integer.MAX_VALUE) {
            int i24 = v71.s0;
        }
        int i25 = v71Var.M;
        if (i25 != -1) {
            i11 = v71Var.G;
            i10 = i25;
        } else {
            i10 = v71Var.G;
            i11 = v71Var.h0;
        }
        if (i23 == i10) {
            i12 = v71Var.Q;
            f7 = 0.0f;
            i13 = v71Var.R;
            i14 = org.telegram.ui.ActionBar.t6.T9;
            i15 = org.telegram.ui.ActionBar.t6.U9;
        } else {
            f7 = 0.0f;
            i12 = v71Var.R;
            i13 = v71Var.Q;
            i14 = org.telegram.ui.ActionBar.t6.U9;
            i15 = org.telegram.ui.ActionBar.t6.T9;
        }
        if (v71Var.E == 9) {
            textPaint3.setColor(org.telegram.ui.ActionBar.t6.w0(v71Var.R, p6Var));
        } else if ((v71Var.J || i25 != -1) && (i23 == i10 || i23 == i11)) {
            textPaint3.setColor(i0.b.f(v71Var.K, org.telegram.ui.ActionBar.t6.w0(i13, p6Var), org.telegram.ui.ActionBar.t6.w0(i12, p6Var)));
        } else {
            textPaint3.setColor(org.telegram.ui.ActionBar.t6.w0(i12, p6Var));
        }
        this.a.getClass();
        if (this.a.a != Integer.MAX_VALUE) {
            if (v71Var.n) {
                float L = org.telegram.messenger.i0.L(20.0f);
                int i26 = v71.s0;
                i16 = (int) ((L * f7) + 0);
                int i27 = this.a.c;
                if (i16 == 0) {
                    int i28 = v71.s0;
                    i17 = org.telegram.messenger.i0.L(f7) + i16;
                } else {
                    i17 = 0;
                }
                this.b = i27 + i17;
                int measuredWidth = (getMeasuredWidth() - this.b) / 2;
                charSequence = this.a.b;
                if ((charSequence == null || this.d == null) && TextUtils.equals(charSequence, this.d)) {
                    i18 = 2;
                } else {
                    s71 s71Var = this.a;
                    i18 = 2;
                    CharSequence m10 = org.telegram.messenger.k6.m(s71Var.b, textPaint3.getFontMetricsInt(), false, null, 0);
                    s71Var.b = m10;
                    this.d = m10;
                    qz0 qz0Var2 = this.e;
                    if (qz0Var2 != null) {
                        o5.release(qz0Var2.j, qz0Var2.k);
                    }
                    qz0 qz0Var3 = new qz0(this.d, textPaint3.getTextSize() / org.telegram.messenger.i0.p, textPaint3.getTypeface());
                    qz0Var3.r(this);
                    this.e = qz0Var3;
                }
                qz0Var = this.e;
                if (qz0Var == null) {
                    qz0Var.p = org.telegram.messenger.i0.L(400.0f);
                    i21 = i11;
                    i20 = i10;
                    i19 = measuredWidth;
                    qz0Var.c(measuredWidth, getMeasuredHeight() / 2, 1.0f, textPaint3.getColor(), canvas);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    i19 = measuredWidth;
                    i20 = i10;
                    i21 = i11;
                }
                if (this.a.a != Integer.MAX_VALUE) {
                    if (v71Var.n) {
                        textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(v71Var.T, p6Var));
                        if (org.telegram.ui.ActionBar.t6.f1(i14) && org.telegram.ui.ActionBar.t6.f1(i15)) {
                            int w02 = org.telegram.ui.ActionBar.t6.w0(i14, p6Var);
                            if ((v71Var.J || v71Var.L != -1) && ((i22 = this.a.a) == i20 || i22 == i21)) {
                                paint.setColor(i0.b.f(v71Var.K, org.telegram.ui.ActionBar.t6.w0(i15, p6Var), w02));
                            } else {
                                paint.setColor(w02);
                            }
                        } else {
                            paint.setColor(textPaint3.getColor());
                        }
                        int L2 = org.telegram.messenger.i0.L(6.0f) + i19 + this.a.c;
                        int y3 = org.telegram.messenger.z20.y(20.0f, getMeasuredHeight(), i18);
                        if (this.a.a != Integer.MAX_VALUE) {
                            if (v71Var.n) {
                                int i29 = v71.s0;
                                paint.setAlpha((int) f7);
                                float L3 = org.telegram.messenger.i0.L(20.0f) + y3;
                                RectF rectF = this.c;
                                rectF.set(L2, y3, L2 + i16, L3);
                                float f10 = org.telegram.messenger.i0.p * 11.5f;
                                canvas2.drawRoundRect(rectF, f10, f10, paint);
                                if (this.a.a != Integer.MAX_VALUE) {
                                    if (v71Var.n) {
                                        textPaint2.setColor(textPaint.getColor());
                                        int i30 = v71.s0;
                                        textPaint2.setAlpha((int) 0.0f);
                                        float L4 = org.telegram.messenger.i0.L(3.0f);
                                        canvas2.drawLine(rectF.centerX() - L4, rectF.centerY() - L4, rectF.centerX() + L4, rectF.centerY() + L4, textPaint2);
                                        canvas.drawLine(rectF.centerX() - L4, rectF.centerY() + L4, rectF.centerX() + L4, rectF.centerY() - L4, textPaint2);
                                    } else {
                                        int i31 = v71.s0;
                                    }
                                }
                            } else {
                                int i32 = v71.s0;
                            }
                        }
                        paint.setAlpha(org.telegram.messenger.zs.e4);
                        float L32 = org.telegram.messenger.i0.L(20.0f) + y3;
                        RectF rectF2 = this.c;
                        rectF2.set(L2, y3, L2 + i16, L32);
                        float f102 = org.telegram.messenger.i0.p * 11.5f;
                        canvas2.drawRoundRect(rectF2, f102, f102, paint);
                        if (this.a.a != Integer.MAX_VALUE) {
                        }
                    } else {
                        int i33 = v71.s0;
                    }
                }
                if (this.a.a != Integer.MAX_VALUE) {
                    int i34 = v71.s0;
                }
                canvas.restore();
            }
            int i35 = v71.s0;
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
        qz0Var = this.e;
        if (qz0Var == null) {
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
        s71 s71Var = this.a;
        accessibilityNodeInfo.setSelected((s71Var == null || (i10 = this.r.G) == -1 || s71Var.a != i10) ? false : true);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        s71 s71Var = this.a;
        v71 v71Var = this.r;
        setMeasuredDimension(org.telegram.messenger.i0.L(v71Var.r * 2) + s71Var.a(v71Var.c) + v71Var.I, View.MeasureSpec.getSize(i11));
    }

    public void setReordering(boolean z10) {
        if (this.f == z10) {
            return;
        }
        this.f = z10;
        invalidate();
    }
}
