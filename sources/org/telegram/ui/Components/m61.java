package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class m61 extends View {
    public l61 a;
    public int b;
    public final RectF c;
    public CharSequence d;
    public ly0 e;
    public boolean f;
    public en0 h;
    public final w5 n;
    public final /* synthetic */ o61 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m61(o61 o61Var, Context context) {
        super(context);
        this.r = o61Var;
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
        ly0 ly0Var;
        Canvas canvas2;
        int i18;
        int i19;
        int i20;
        int i21;
        o61 o61Var = this.r;
        TextPaint textPaint = o61Var.d;
        TextPaint textPaint2 = o61Var.e;
        Paint paint = o61Var.f;
        org.telegram.ui.ActionBar.f6 f6Var = o61Var.j0;
        TextPaint textPaint3 = o61Var.c;
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
            int i23 = o61.s0;
        }
        int i24 = o61Var.M;
        if (i24 != -1) {
            i10 = o61Var.G;
            i7 = i24;
        } else {
            i7 = o61Var.G;
            i10 = o61Var.h0;
        }
        if (i22 == i7) {
            i11 = o61Var.Q;
            f10 = 0.0f;
            i12 = o61Var.R;
            i13 = org.telegram.ui.ActionBar.k6.T9;
            i14 = org.telegram.ui.ActionBar.k6.U9;
        } else {
            f10 = 0.0f;
            i11 = o61Var.R;
            i12 = o61Var.Q;
            i13 = org.telegram.ui.ActionBar.k6.U9;
            i14 = org.telegram.ui.ActionBar.k6.T9;
        }
        if (o61Var.E == 9) {
            textPaint3.setColor(org.telegram.ui.ActionBar.k6.w0(o61Var.R, f6Var));
        } else if ((o61Var.J || i24 != -1) && (i22 == i7 || i22 == i10)) {
            textPaint3.setColor(i0.a.f(o61Var.K, org.telegram.ui.ActionBar.k6.w0(i12, f6Var), org.telegram.ui.ActionBar.k6.w0(i11, f6Var)));
        } else {
            textPaint3.setColor(org.telegram.ui.ActionBar.k6.w0(i11, f6Var));
        }
        this.a.getClass();
        if (this.a.a != Integer.MAX_VALUE) {
            if (o61Var.n) {
                float L = org.telegram.messenger.g0.L(20.0f);
                int i25 = o61.s0;
                i15 = (int) ((L * f10) + 0);
                int i26 = this.a.c;
                if (i15 == 0) {
                    int i27 = o61.s0;
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
                    l61 l61Var = this.a;
                    i17 = 2;
                    CharSequence m10 = org.telegram.messenger.i6.m(l61Var.b, textPaint3.getFontMetricsInt(), false, null, 0);
                    l61Var.b = m10;
                    this.d = m10;
                    ly0 ly0Var2 = this.e;
                    if (ly0Var2 != null) {
                        r5.release(ly0Var2.j, ly0Var2.k);
                    }
                    ly0 ly0Var3 = new ly0(this.d, textPaint3.getTextSize() / org.telegram.messenger.g0.p, textPaint3.getTypeface());
                    ly0Var3.r(this);
                    this.e = ly0Var3;
                }
                ly0Var = this.e;
                if (ly0Var == null) {
                    ly0Var.p = org.telegram.messenger.g0.L(400.0f);
                    i20 = i10;
                    i19 = i7;
                    i18 = measuredWidth;
                    ly0Var.c(measuredWidth, getMeasuredHeight() / 2, 1.0f, textPaint3.getColor(), canvas);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    i18 = measuredWidth;
                    i19 = i7;
                    i20 = i10;
                }
                if (this.a.a != Integer.MAX_VALUE) {
                    if (o61Var.n) {
                        textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(o61Var.T, f6Var));
                        if (org.telegram.ui.ActionBar.k6.f1(i13) && org.telegram.ui.ActionBar.k6.f1(i14)) {
                            int w02 = org.telegram.ui.ActionBar.k6.w0(i13, f6Var);
                            if ((o61Var.J || o61Var.L != -1) && ((i21 = this.a.a) == i19 || i21 == i20)) {
                                paint.setColor(i0.a.f(o61Var.K, org.telegram.ui.ActionBar.k6.w0(i14, f6Var), w02));
                            } else {
                                paint.setColor(w02);
                            }
                        } else {
                            paint.setColor(textPaint3.getColor());
                        }
                        int L2 = org.telegram.messenger.g0.L(6.0f) + i18 + this.a.c;
                        int y10 = org.telegram.messenger.camera.q.y(20.0f, getMeasuredHeight(), i17);
                        if (this.a.a != Integer.MAX_VALUE) {
                            if (o61Var.n) {
                                int i28 = o61.s0;
                                paint.setAlpha((int) f10);
                                float L3 = org.telegram.messenger.g0.L(20.0f) + y10;
                                RectF rectF = this.c;
                                rectF.set(L2, y10, L2 + i15, L3);
                                float f11 = org.telegram.messenger.g0.p * 11.5f;
                                canvas2.drawRoundRect(rectF, f11, f11, paint);
                                if (this.a.a != Integer.MAX_VALUE) {
                                    if (o61Var.n) {
                                        textPaint2.setColor(textPaint.getColor());
                                        int i29 = o61.s0;
                                        textPaint2.setAlpha((int) 0.0f);
                                        float L4 = org.telegram.messenger.g0.L(3.0f);
                                        canvas2.drawLine(rectF.centerX() - L4, rectF.centerY() - L4, rectF.centerX() + L4, rectF.centerY() + L4, textPaint2);
                                        canvas.drawLine(rectF.centerX() - L4, rectF.centerY() + L4, rectF.centerX() + L4, rectF.centerY() - L4, textPaint2);
                                    } else {
                                        int i30 = o61.s0;
                                    }
                                }
                            } else {
                                int i31 = o61.s0;
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
                        int i32 = o61.s0;
                    }
                }
                if (this.a.a != Integer.MAX_VALUE) {
                    int i33 = o61.s0;
                }
                canvas.restore();
            }
            int i34 = o61.s0;
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
        ly0Var = this.e;
        if (ly0Var == null) {
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
        l61 l61Var = this.a;
        accessibilityNodeInfo.setSelected((l61Var == null || (i7 = this.r.G) == -1 || l61Var.a != i7) ? false : true);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        l61 l61Var = this.a;
        o61 o61Var = this.r;
        setMeasuredDimension(org.telegram.messenger.g0.L(o61Var.r * 2) + l61Var.a(o61Var.c) + o61Var.I, View.MeasureSpec.getSize(i10));
    }

    public void setReordering(boolean z9) {
        if (this.f == z9) {
            return;
        }
        this.f = z9;
        invalidate();
    }
}
