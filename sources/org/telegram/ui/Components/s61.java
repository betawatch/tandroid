package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class s61 extends View {
    public r61 a;
    public int b;
    public final RectF c;
    public CharSequence d;
    public my0 e;
    public boolean f;
    public en0 h;
    public final w5 n;
    public final /* synthetic */ u61 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s61(u61 u61Var, Context context) {
        super(context);
        this.r = u61Var;
        this.c = new RectF();
        this.n = new w5(this, 360L, xq.h);
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
        int i7;
        int i10;
        float f10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        CharSequence charSequence;
        int i17;
        my0 my0Var;
        Canvas canvas2;
        int i18;
        int i19;
        int i20;
        int i21;
        u61 u61Var = this.r;
        TextPaint textPaint = u61Var.d;
        TextPaint textPaint2 = u61Var.e;
        Paint paint = u61Var.f;
        org.telegram.ui.ActionBar.f6 f6Var = u61Var.j0;
        TextPaint textPaint3 = u61Var.c;
        canvas.save();
        float d = this.n.d(this.f);
        if (d > 0.0f) {
            if (this.h == null) {
                this.h = new en0(this);
            }
            canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
            this.h.a(canvas, d);
            canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
        }
        int i22 = this.a.a;
        if (i22 != Integer.MAX_VALUE) {
            int i23 = u61.s0;
        }
        int i24 = u61Var.M;
        if (i24 != -1) {
            i10 = u61Var.G;
            i7 = i24;
        } else {
            i7 = u61Var.G;
            i10 = u61Var.h0;
        }
        if (i22 == i7) {
            i11 = u61Var.Q;
            f10 = 0.0f;
            i12 = u61Var.R;
            i13 = org.telegram.ui.ActionBar.k6.T9;
            i14 = org.telegram.ui.ActionBar.k6.U9;
        } else {
            f10 = 0.0f;
            i11 = u61Var.R;
            i12 = u61Var.Q;
            i13 = org.telegram.ui.ActionBar.k6.U9;
            i14 = org.telegram.ui.ActionBar.k6.T9;
        }
        if (u61Var.E == 9) {
            textPaint3.setColor(org.telegram.ui.ActionBar.k6.w0(u61Var.R, f6Var));
        } else if ((u61Var.J || i24 != -1) && (i22 == i7 || i22 == i10)) {
            textPaint3.setColor(i0.a.f(u61Var.K, org.telegram.ui.ActionBar.k6.w0(i12, f6Var), org.telegram.ui.ActionBar.k6.w0(i11, f6Var)));
        } else {
            textPaint3.setColor(org.telegram.ui.ActionBar.k6.w0(i11, f6Var));
        }
        this.a.getClass();
        if (this.a.a != Integer.MAX_VALUE) {
            if (u61Var.n) {
                float L = org.telegram.messenger.g0.L(20.0f);
                int i25 = u61.s0;
                i15 = (int) ((L * f10) + 0);
                int i26 = this.a.c;
                if (i15 == 0) {
                    int i27 = u61.s0;
                    i16 = org.telegram.messenger.g0.L(f10) + i15;
                } else {
                    i16 = 0;
                }
                this.b = i26 + i16;
                int measuredWidth = (getMeasuredWidth() - this.b) / 2;
                charSequence = this.a.b;
                if ((charSequence == null || this.d == null) && TextUtils.equals(charSequence, this.d)) {
                    i17 = 2;
                } else {
                    r61 r61Var = this.a;
                    i17 = 2;
                    CharSequence m10 = org.telegram.messenger.i6.m(r61Var.b, textPaint3.getFontMetricsInt(), false, null, 0);
                    r61Var.b = m10;
                    this.d = m10;
                    my0 my0Var2 = this.e;
                    if (my0Var2 != null) {
                        r5.release(my0Var2.j, my0Var2.k);
                    }
                    my0 my0Var3 = new my0(this.d, textPaint3.getTextSize() / org.telegram.messenger.g0.p, textPaint3.getTypeface());
                    my0Var3.r(this);
                    this.e = my0Var3;
                }
                my0Var = this.e;
                if (my0Var == null) {
                    my0Var.p = org.telegram.messenger.g0.L(400.0f);
                    i20 = i10;
                    i19 = i7;
                    i18 = measuredWidth;
                    my0Var.c(measuredWidth, getMeasuredHeight() / 2, 1.0f, textPaint3.getColor(), canvas);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    i18 = measuredWidth;
                    i19 = i7;
                    i20 = i10;
                }
                if (this.a.a != Integer.MAX_VALUE) {
                    if (u61Var.n) {
                        textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(u61Var.T, f6Var));
                        if (org.telegram.ui.ActionBar.k6.f1(i13) && org.telegram.ui.ActionBar.k6.f1(i14)) {
                            int w02 = org.telegram.ui.ActionBar.k6.w0(i13, f6Var);
                            if ((u61Var.J || u61Var.L != -1) && ((i21 = this.a.a) == i19 || i21 == i20)) {
                                paint.setColor(i0.a.f(u61Var.K, org.telegram.ui.ActionBar.k6.w0(i14, f6Var), w02));
                            } else {
                                paint.setColor(w02);
                            }
                        } else {
                            paint.setColor(textPaint3.getColor());
                        }
                        int L2 = org.telegram.messenger.g0.L(6.0f) + i18 + this.a.c;
                        int y10 = org.telegram.messenger.camera.q.y(20.0f, getMeasuredHeight(), i17);
                        if (this.a.a != Integer.MAX_VALUE) {
                            if (u61Var.n) {
                                int i28 = u61.s0;
                                paint.setAlpha((int) f10);
                                float L3 = org.telegram.messenger.g0.L(20.0f) + y10;
                                RectF rectF = this.c;
                                rectF.set(L2, y10, L2 + i15, L3);
                                float f11 = org.telegram.messenger.g0.p * 11.5f;
                                canvas2.drawRoundRect(rectF, f11, f11, paint);
                                if (this.a.a != Integer.MAX_VALUE) {
                                    if (u61Var.n) {
                                        textPaint2.setColor(textPaint.getColor());
                                        int i29 = u61.s0;
                                        textPaint2.setAlpha((int) 0.0f);
                                        float L4 = org.telegram.messenger.g0.L(3.0f);
                                        canvas2.drawLine(rectF.centerX() - L4, rectF.centerY() - L4, rectF.centerX() + L4, rectF.centerY() + L4, textPaint2);
                                        canvas.drawLine(rectF.centerX() - L4, rectF.centerY() + L4, rectF.centerX() + L4, rectF.centerY() - L4, textPaint2);
                                    } else {
                                        int i30 = u61.s0;
                                    }
                                }
                            } else {
                                int i31 = u61.s0;
                            }
                        }
                        paint.setAlpha(org.telegram.messenger.qs.e4);
                        float L32 = org.telegram.messenger.g0.L(20.0f) + y10;
                        RectF rectF2 = this.c;
                        rectF2.set(L2, y10, L2 + i15, L32);
                        float f112 = org.telegram.messenger.g0.p * 11.5f;
                        canvas2.drawRoundRect(rectF2, f112, f112, paint);
                        if (this.a.a != Integer.MAX_VALUE) {
                        }
                    } else {
                        int i32 = u61.s0;
                    }
                }
                if (this.a.a != Integer.MAX_VALUE) {
                    int i33 = u61.s0;
                }
                canvas.restore();
            }
            int i34 = u61.s0;
        }
        i15 = 0;
        int i262 = this.a.c;
        if (i15 == 0) {
        }
        this.b = i262 + i16;
        int measuredWidth2 = (getMeasuredWidth() - this.b) / 2;
        charSequence = this.a.b;
        if (charSequence == null) {
        }
        i17 = 2;
        my0Var = this.e;
        if (my0Var == null) {
        }
        if (this.a.a != Integer.MAX_VALUE) {
        }
        if (this.a.a != Integer.MAX_VALUE) {
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i7;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        r61 r61Var = this.a;
        accessibilityNodeInfo.setSelected((r61Var == null || (i7 = this.r.G) == -1 || r61Var.a != i7) ? false : true);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        r61 r61Var = this.a;
        u61 u61Var = this.r;
        setMeasuredDimension(org.telegram.messenger.g0.L(u61Var.r * 2) + r61Var.a(u61Var.c) + u61Var.I, View.MeasureSpec.getSize(i10));
    }

    public void setReordering(boolean z9) {
        if (this.f == z9) {
            return;
        }
        this.f = z9;
        invalidate();
    }
}
