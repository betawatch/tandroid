package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class h71 extends View {
    public g71 a;
    public int b;
    public final RectF c;
    public CharSequence d;
    public wy0 e;
    public boolean f;
    public sn0 h;
    public final c6 n;
    public final /* synthetic */ j71 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h71(j71 j71Var, Context context) {
        super(context);
        this.r = j71Var;
        this.c = new RectF();
        this.n = new c6(this, 360L, kr.h);
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
        wy0 wy0Var;
        Canvas canvas2;
        int i18;
        int i19;
        int i20;
        int i21;
        j71 j71Var = this.r;
        TextPaint textPaint = j71Var.d;
        TextPaint textPaint2 = j71Var.e;
        Paint paint = j71Var.f;
        org.telegram.ui.ActionBar.i6 i6Var = j71Var.k0;
        TextPaint textPaint3 = j71Var.c;
        canvas.save();
        float d = this.n.d(this.f);
        if (d > 0.0f) {
            if (this.h == null) {
                this.h = new sn0(this);
            }
            canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
            this.h.a(canvas, d);
            canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
        }
        int i22 = this.a.a;
        if (i22 != Integer.MAX_VALUE) {
            int i23 = j71.t0;
        }
        int i24 = j71Var.N;
        if (i24 != -1) {
            i10 = j71Var.H;
            i7 = i24;
        } else {
            i7 = j71Var.H;
            i10 = j71Var.i0;
        }
        if (i22 == i7) {
            i11 = j71Var.R;
            f10 = 0.0f;
            i12 = j71Var.S;
            i13 = org.telegram.ui.ActionBar.n6.T9;
            i14 = org.telegram.ui.ActionBar.n6.U9;
        } else {
            f10 = 0.0f;
            i11 = j71Var.S;
            i12 = j71Var.R;
            i13 = org.telegram.ui.ActionBar.n6.U9;
            i14 = org.telegram.ui.ActionBar.n6.T9;
        }
        if (j71Var.F == 9) {
            textPaint3.setColor(org.telegram.ui.ActionBar.n6.w0(j71Var.S, i6Var));
        } else if ((j71Var.K || i24 != -1) && (i22 == i7 || i22 == i10)) {
            textPaint3.setColor(i0.a.f(j71Var.L, org.telegram.ui.ActionBar.n6.w0(i12, i6Var), org.telegram.ui.ActionBar.n6.w0(i11, i6Var)));
        } else {
            textPaint3.setColor(org.telegram.ui.ActionBar.n6.w0(i11, i6Var));
        }
        this.a.getClass();
        if (this.a.a != Integer.MAX_VALUE) {
            if (j71Var.n) {
                float L = org.telegram.messenger.g0.L(20.0f);
                int i25 = j71.t0;
                i15 = (int) ((L * f10) + 0);
                int i26 = this.a.c;
                if (i15 == 0) {
                    int i27 = j71.t0;
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
                    g71 g71Var = this.a;
                    i17 = 2;
                    CharSequence m10 = org.telegram.messenger.j6.m(g71Var.b, textPaint3.getFontMetricsInt(), false, null, 0);
                    g71Var.b = m10;
                    this.d = m10;
                    wy0 wy0Var2 = this.e;
                    if (wy0Var2 != null) {
                        x5.release(wy0Var2.j, wy0Var2.k);
                    }
                    wy0 wy0Var3 = new wy0(this.d, textPaint3.getTextSize() / org.telegram.messenger.g0.p, textPaint3.getTypeface());
                    wy0Var3.r(this);
                    this.e = wy0Var3;
                }
                wy0Var = this.e;
                if (wy0Var == null) {
                    wy0Var.p = org.telegram.messenger.g0.L(400.0f);
                    i20 = i10;
                    i19 = i7;
                    i18 = measuredWidth;
                    wy0Var.c(measuredWidth, getMeasuredHeight() / 2, 1.0f, textPaint3.getColor(), canvas);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    i18 = measuredWidth;
                    i19 = i7;
                    i20 = i10;
                }
                if (this.a.a != Integer.MAX_VALUE) {
                    if (j71Var.n) {
                        textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(j71Var.U, i6Var));
                        if (org.telegram.ui.ActionBar.n6.f1(i13) && org.telegram.ui.ActionBar.n6.f1(i14)) {
                            int w02 = org.telegram.ui.ActionBar.n6.w0(i13, i6Var);
                            if ((j71Var.K || j71Var.M != -1) && ((i21 = this.a.a) == i19 || i21 == i20)) {
                                paint.setColor(i0.a.f(j71Var.L, org.telegram.ui.ActionBar.n6.w0(i14, i6Var), w02));
                            } else {
                                paint.setColor(w02);
                            }
                        } else {
                            paint.setColor(textPaint3.getColor());
                        }
                        int L2 = org.telegram.messenger.g0.L(6.0f) + i18 + this.a.c;
                        int z10 = org.telegram.messenger.m10.z(20.0f, getMeasuredHeight(), i17);
                        if (this.a.a != Integer.MAX_VALUE) {
                            if (j71Var.n) {
                                int i28 = j71.t0;
                                paint.setAlpha((int) f10);
                                float L3 = org.telegram.messenger.g0.L(20.0f) + z10;
                                RectF rectF = this.c;
                                rectF.set(L2, z10, L2 + i15, L3);
                                float f11 = org.telegram.messenger.g0.p * 11.5f;
                                canvas2.drawRoundRect(rectF, f11, f11, paint);
                                if (this.a.a != Integer.MAX_VALUE) {
                                    if (j71Var.n) {
                                        textPaint2.setColor(textPaint.getColor());
                                        int i29 = j71.t0;
                                        textPaint2.setAlpha((int) 0.0f);
                                        float L4 = org.telegram.messenger.g0.L(3.0f);
                                        canvas2.drawLine(rectF.centerX() - L4, rectF.centerY() - L4, rectF.centerX() + L4, rectF.centerY() + L4, textPaint2);
                                        canvas.drawLine(rectF.centerX() - L4, rectF.centerY() + L4, rectF.centerX() + L4, rectF.centerY() - L4, textPaint2);
                                    } else {
                                        int i30 = j71.t0;
                                    }
                                }
                            } else {
                                int i31 = j71.t0;
                            }
                        }
                        paint.setAlpha(org.telegram.messenger.ks.e4);
                        float L32 = org.telegram.messenger.g0.L(20.0f) + z10;
                        RectF rectF2 = this.c;
                        rectF2.set(L2, z10, L2 + i15, L32);
                        float f112 = org.telegram.messenger.g0.p * 11.5f;
                        canvas2.drawRoundRect(rectF2, f112, f112, paint);
                        if (this.a.a != Integer.MAX_VALUE) {
                        }
                    } else {
                        int i32 = j71.t0;
                    }
                }
                if (this.a.a != Integer.MAX_VALUE) {
                    int i33 = j71.t0;
                }
                canvas.restore();
            }
            int i34 = j71.t0;
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
        wy0Var = this.e;
        if (wy0Var == null) {
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
        g71 g71Var = this.a;
        accessibilityNodeInfo.setSelected((g71Var == null || (i7 = this.r.H) == -1 || g71Var.a != i7) ? false : true);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        g71 g71Var = this.a;
        j71 j71Var = this.r;
        setMeasuredDimension(org.telegram.messenger.g0.L(j71Var.r * 2) + g71Var.a(j71Var.c) + j71Var.J, View.MeasureSpec.getSize(i10));
    }

    public void setReordering(boolean z10) {
        if (this.f == z10) {
            return;
        }
        this.f = z10;
        invalidate();
    }
}
