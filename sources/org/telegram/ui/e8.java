package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class e8 extends FrameLayout {
    public final org.telegram.ui.ActionBar.k5 a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int h;
    public SparseArray n;
    public SparseArray r;
    public final org.telegram.ui.Components.vy s;
    public final SparseArray w;
    public final SparseArray x;
    public final /* synthetic */ h8 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8(h8 h8Var, Context context) {
        super(context);
        this.y = h8Var;
        this.n = new SparseArray();
        this.r = new SparseArray();
        this.w = new SparseArray();
        this.x = new SparseArray();
        setWillNotDraw(false);
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.a = k5Var;
        if (h8Var.e0 == 0 && h8Var.d0) {
            k5Var.setOnLongClickListener(new t(this, 1));
            k5Var.setOnClickListener(new z7(this, 0));
        }
        int i7 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i7, false), 2, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i7);
        k5Var.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(k5Var, h02, null, N, null);
        k5Var.setTextSize(15);
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        k5Var.setGravity(17);
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.G6, null);
        addView(k5Var, c8.ha.d(-1, 28.0f, 0, 0.0f, 12.0f, 0.0f, 4.0f));
        org.telegram.ui.Components.vy vyVar = new org.telegram.ui.Components.vy(context, new c8(this, context));
        this.s = vyVar;
        ((GestureDetector) vyVar.b).setIsLongpressEnabled(h8Var.e0 == 0);
    }

    public static void a(e8 e8Var, int i7, int i10) {
        if (e8Var.n != null) {
            for (int i11 = 0; i11 < e8Var.d; i11++) {
                f8 f8Var = (f8) e8Var.n.get(i11, null);
                if (f8Var != null) {
                    f8Var.m = f8Var.l;
                    int i12 = f8Var.h;
                    f8Var.n = (i12 < i7 || i12 > i10) ? 0.0f : 1.0f;
                    f8Var.j = f8Var.i;
                    if (i12 == i7 || i12 == i10) {
                        f8Var.k = 1.0f;
                    } else {
                        f8Var.k = 0.0f;
                    }
                }
            }
        }
    }

    public static void b(e8 e8Var, float f10) {
        if (e8Var.n != null) {
            for (int i7 = 0; i7 < e8Var.d; i7++) {
                f8 f8Var = (f8) e8Var.n.get(i7, null);
                if (f8Var != null) {
                    float f11 = f8Var.m;
                    f8Var.l = com.google.android.recaptcha.internal.a.z(f8Var.n, f11, f10, f11);
                    float f12 = f8Var.j;
                    f8Var.i = com.google.android.recaptcha.internal.a.z(f8Var.k, f12, f10, f12);
                }
            }
        }
        e8Var.invalidate();
    }

    public final void c(int i7, int i10, int i11, boolean z9, boolean z10) {
        float f10;
        float f11;
        final float f12;
        SparseArray sparseArray = this.w;
        ValueAnimator valueAnimator = (ValueAnimator) sparseArray.get(i7);
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float measuredWidth = getMeasuredWidth() / 7.0f;
        SparseArray sparseArray2 = this.x;
        g8 g8Var = (g8) sparseArray2.get(i7);
        if (g8Var != null) {
            float f13 = g8Var.a;
            f11 = g8Var.b;
            f12 = g8Var.c;
            f10 = f13;
        } else {
            f10 = (measuredWidth / 2.0f) + (i10 * measuredWidth);
            f11 = f10;
            f12 = 0.0f;
        }
        float f14 = z9 ? (measuredWidth / 2.0f) + (i10 * measuredWidth) : f10;
        final float f15 = z9 ? (measuredWidth / 2.0f) + (i11 * measuredWidth) : f11;
        float f16 = z9 ? 1.0f : 0.0f;
        final g8 g8Var2 = new g8();
        g8Var2.a = f10;
        g8Var2.b = f11;
        sparseArray2.put(i7, g8Var2);
        if (!z10) {
            g8Var2.a = f14;
            g8Var2.b = f15;
            g8Var2.c = f16;
            invalidate();
            return;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        duration.setInterpolator(org.telegram.ui.Components.ks.e);
        final float f17 = f11;
        final float f18 = f16;
        final float f19 = f10;
        final float f20 = f14;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.y7
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                e8 e8Var = e8.this;
                e8Var.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float f21 = f20;
                float f22 = f19;
                float z11 = com.google.android.recaptcha.internal.a.z(f21, f22, floatValue, f22);
                g8 g8Var3 = g8Var2;
                g8Var3.a = z11;
                float f23 = f15;
                float f24 = f17;
                g8Var3.b = com.google.android.recaptcha.internal.a.z(f23, f24, floatValue, f24);
                float f25 = f18;
                float f26 = f12;
                g8Var3.c = com.google.android.recaptcha.internal.a.z(f25, f26, floatValue, f26);
                e8Var.invalidate();
            }
        });
        duration.addListener(new d8(this, g8Var2, f20, f15, f18, i7, z9));
        duration.start();
        sparseArray.put(i7, duration);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.r != null) {
            for (int i7 = 0; i7 < this.r.size(); i7++) {
                ((ImageReceiver) this.r.valueAt(i7)).P();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.r != null) {
            for (int i7 = 0; i7 < this.r.size(); i7++) {
                ((ImageReceiver) this.r.valueAt(i7)).R();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0216  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        int i7;
        float f10;
        Paint paint;
        Paint paint2;
        float f11;
        int i10;
        Paint paint3;
        h8 h8Var;
        TextPaint textPaint;
        int i11;
        TextPaint textPaint2;
        Paint paint4;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        int i12;
        float f18;
        int i13;
        int i14;
        e8 e8Var = this;
        Canvas canvas2 = canvas;
        h8 h8Var2 = e8Var.y;
        Paint paint5 = h8Var2.x;
        xh.f fVar = h8Var2.m0;
        Path path = h8Var2.l0;
        Paint paint6 = h8Var2.r;
        TextPaint textPaint3 = h8Var2.e;
        Paint paint7 = h8Var2.s;
        TextPaint textPaint4 = h8Var2.d;
        super.onDraw(canvas);
        int i15 = e8Var.e;
        float measuredWidth = e8Var.getMeasuredWidth() / 7.0f;
        float L = org.telegram.messenger.g0.L(52.0f);
        int L2 = org.telegram.messenger.g0.L(44.0f);
        Paint paint8 = paint6;
        int i16 = 0;
        while (true) {
            i7 = i15;
            f10 = L;
            if (i16 >= Math.ceil((e8Var.e + e8Var.d) / 7.0f)) {
                break;
            }
            float L3 = (f10 / 2.0f) + (i16 * f10) + org.telegram.messenger.g0.L(44.0f);
            g8 g8Var = (g8) e8Var.x.get(i16);
            if (g8Var != null) {
                paint7.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Rf, false));
                paint7.setAlpha((int) (g8Var.c * 40.8f));
                RectF rectF = org.telegram.messenger.g0.P;
                float f19 = L2 / 2.0f;
                i14 = L2;
                rectF.set(g8Var.a - f19, L3 - f19, g8Var.b + f19, L3 + f19);
                float L4 = org.telegram.messenger.g0.L(32.0f);
                canvas2.drawRoundRect(rectF, L4, L4, paint7);
            } else {
                i14 = L2;
            }
            i16++;
            i15 = i7;
            L = f10;
            L2 = i14;
        }
        int i17 = i7;
        int i18 = 0;
        int i19 = 0;
        while (i18 < e8Var.d) {
            float f20 = (i17 * measuredWidth) + (measuredWidth / 2.0f);
            float L5 = (f10 / 2.0f) + (i19 * f10) + org.telegram.messenger.g0.L(44.0f);
            int i20 = i19;
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            SparseArray sparseArray = e8Var.n;
            int i21 = i17;
            f8 f8Var = sparseArray != null ? (f8) sparseArray.get(i18, null) : null;
            int i22 = e8Var.h;
            int i23 = i18 + 1;
            if (currentTimeMillis < (i23 * 86400) + i22 || ((i11 = h8Var2.c0) > 0 && i11 > ((i18 + 2) * 86400) + i22)) {
                paint = paint5;
                paint2 = paint7;
                f11 = measuredWidth;
                i10 = 0;
                paint3 = paint8;
                h8Var = h8Var2;
                textPaint = textPaint3;
                int alpha = textPaint4.getAlpha();
                textPaint4.setAlpha((int) (alpha * 0.3f));
                canvas2.drawText(Integer.toString(i23), f20, org.telegram.messenger.g0.L(5.0f) + L5, textPaint4);
                textPaint4.setAlpha(alpha);
            } else if (f8Var == null || !f8Var.g) {
                Paint paint9 = paint7;
                f11 = measuredWidth;
                paint3 = paint8;
                h8Var = h8Var2;
                textPaint = textPaint3;
                if (f8Var == null || f8Var.i < 0.01f) {
                    paint2 = paint9;
                    paint = paint5;
                    i10 = 0;
                    canvas2.drawText(Integer.toString(i23), f20, org.telegram.messenger.g0.L(5.0f) + L5, textPaint4);
                } else {
                    paint9.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false));
                    paint9.setAlpha((int) (f8Var.i * 255.0f));
                    canvas2.drawCircle(f20, L5, org.telegram.messenger.g0.L(44.0f) / 2.0f, paint9);
                    int i24 = org.telegram.ui.ActionBar.k6.Rf;
                    paint3.setColor(org.telegram.ui.ActionBar.k6.x0(null, i24, false));
                    RectF rectF2 = org.telegram.messenger.g0.P;
                    rectF2.set(f20 - (org.telegram.messenger.g0.L(44.0f) / 2.0f), L5 - (org.telegram.messenger.g0.L(44.0f) / 2.0f), (org.telegram.messenger.g0.L(44.0f) / 2.0f) + f20, (org.telegram.messenger.g0.L(44.0f) / 2.0f) + L5);
                    paint2 = paint9;
                    paint = paint5;
                    i10 = 0;
                    canvas2 = canvas;
                    canvas2.drawArc(rectF2, -90.0f, f8Var.i * 360.0f, false, paint3);
                    int L6 = (int) (org.telegram.messenger.g0.L(7.0f) * f8Var.i);
                    paint2.setColor(org.telegram.ui.ActionBar.k6.x0(null, i24, false));
                    paint2.setAlpha((int) (f8Var.i * 255.0f));
                    canvas2.drawCircle(f20, L5, (org.telegram.messenger.g0.L(44.0f) - L6) / 2.0f, paint2);
                    float f21 = f8Var.i;
                    if (f21 != 1.0f) {
                        int alpha2 = textPaint4.getAlpha();
                        textPaint4.setAlpha((int) ((1.0f - f21) * alpha2));
                        canvas2.drawText(Integer.toString(i23), f20, org.telegram.messenger.g0.L(5.0f) + L5, textPaint4);
                        textPaint4.setAlpha(alpha2);
                        int alpha3 = textPaint4.getAlpha();
                        textPaint.setAlpha((int) (alpha3 * f21));
                        canvas2.drawText(Integer.toString(i23), f20, org.telegram.messenger.g0.L(5.0f) + L5, textPaint);
                        textPaint.setAlpha(alpha3);
                    } else {
                        canvas2.drawText(Integer.toString(i23), f20, org.telegram.messenger.g0.L(5.0f) + L5, textPaint);
                    }
                }
            } else {
                if (e8Var.r.get(i18) != null) {
                    float f22 = 0.0f;
                    if (h8Var2.F && !f8Var.f) {
                        f8Var.d = 0.0f;
                        f22 = 0.0f;
                        f8Var.e = Math.max(0.0f, ((e8Var.getY() + L5) / h8Var2.b.getMeasuredHeight()) * 150.0f);
                    }
                    float f23 = f8Var.e;
                    if (f23 > f22) {
                        float f24 = f23 - 16.0f;
                        f8Var.e = f24;
                        if (f24 < f22) {
                            f8Var.e = f22;
                        } else {
                            e8Var.invalidate();
                        }
                    }
                    if (f8Var.e >= f22) {
                        float f25 = f8Var.d;
                        if (f25 != 1.0f) {
                            float f26 = f25 + 0.07272727f;
                            f8Var.d = f26;
                            if (f26 > 1.0f) {
                                f16 = 1.0f;
                                f8Var.d = 1.0f;
                            } else {
                                f16 = 1.0f;
                                e8Var.invalidate();
                            }
                            f17 = f8Var.d;
                            if (f17 != f16) {
                                canvas2.save();
                                float f27 = (0.2f * f17) + 0.8f;
                                canvas2.scale(f27, f27, f20, L5);
                            }
                            int i25 = i18;
                            int L7 = (int) (org.telegram.messenger.g0.L(7.0f) * f8Var.l);
                            if (f8Var.i < 0.01f) {
                                i12 = L7;
                                paint7.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false));
                                paint7.setAlpha((int) (f8Var.i * 255.0f));
                                canvas2.drawCircle(f20, L5, org.telegram.messenger.g0.L(44.0f) / 2.0f, paint7);
                                paint8.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Rf, false));
                                RectF rectF3 = org.telegram.messenger.g0.P;
                                rectF3.set(f20 - (org.telegram.messenger.g0.L(44.0f) / 2.0f), L5 - (org.telegram.messenger.g0.L(44.0f) / 2.0f), (org.telegram.messenger.g0.L(44.0f) / 2.0f) + f20, (org.telegram.messenger.g0.L(44.0f) / 2.0f) + L5);
                                canvas2 = canvas;
                                paint4 = paint7;
                                f18 = f17;
                                f12 = 1.0f;
                                f14 = L5;
                                f11 = measuredWidth;
                                paint3 = paint8;
                                f13 = f20;
                                h8Var = h8Var2;
                                i13 = i25;
                                textPaint2 = textPaint3;
                                canvas2.drawArc(rectF3, -90.0f, f8Var.i * 360.0f, false, paint3);
                            } else {
                                i12 = L7;
                                f18 = f17;
                                paint4 = paint7;
                                f11 = measuredWidth;
                                f12 = 1.0f;
                                f13 = f20;
                                f14 = L5;
                                paint3 = paint8;
                                h8Var = h8Var2;
                                i13 = i25;
                                textPaint2 = textPaint3;
                            }
                            ((ImageReceiver) e8Var.r.get(i13)).setAlpha(f8Var.d);
                            ((ImageReceiver) e8Var.r.get(i13)).y0(f13 - ((org.telegram.messenger.g0.L(44.0f) - i12) / 2.0f), f14 - ((org.telegram.messenger.g0.L(44.0f) - i12) / 2.0f), org.telegram.messenger.g0.L(44.0f) - i12, org.telegram.messenger.g0.L(44.0f) - i12);
                            ((ImageReceiver) e8Var.r.get(i13)).h(canvas2, null);
                            if (e8Var.n.get(i13) != null && ((f8) e8Var.n.get(i13)).a != null && ((f8) e8Var.n.get(i13)).a.u2()) {
                                float L8 = (org.telegram.messenger.g0.L(44.0f) - i12) / 2.0f;
                                path.rewind();
                                path.addCircle(f13, f14, L8, Path.Direction.CW);
                                canvas2.save();
                                canvas2.clipPath(path);
                                fVar.h(i0.a.o(-1, (int) (Color.alpha(-1) * 0.325f * f8Var.d)));
                                fVar.setBounds((int) (f13 - L8), (int) (f14 - L8), (int) (f13 + L8), (int) (L8 + f14));
                                fVar.draw(canvas2);
                                e8Var.invalidate();
                                canvas2.restore();
                            }
                            paint5.setColor(i0.a.o(-16777216, (int) (f8Var.d * 80.0f)));
                            canvas2.drawCircle(f13, f14, (org.telegram.messenger.g0.L(44.0f) - i12) / 2.0f, paint5);
                            f8Var.f = true;
                            if (f17 != f16) {
                                canvas2.restore();
                            }
                            f15 = f18;
                        }
                    }
                    f16 = 1.0f;
                    f17 = f8Var.d;
                    if (f17 != f16) {
                    }
                    int i252 = i18;
                    int L72 = (int) (org.telegram.messenger.g0.L(7.0f) * f8Var.l);
                    if (f8Var.i < 0.01f) {
                    }
                    ((ImageReceiver) e8Var.r.get(i13)).setAlpha(f8Var.d);
                    ((ImageReceiver) e8Var.r.get(i13)).y0(f13 - ((org.telegram.messenger.g0.L(44.0f) - i12) / 2.0f), f14 - ((org.telegram.messenger.g0.L(44.0f) - i12) / 2.0f), org.telegram.messenger.g0.L(44.0f) - i12, org.telegram.messenger.g0.L(44.0f) - i12);
                    ((ImageReceiver) e8Var.r.get(i13)).h(canvas2, null);
                    if (e8Var.n.get(i13) != null) {
                        float L82 = (org.telegram.messenger.g0.L(44.0f) - i12) / 2.0f;
                        path.rewind();
                        path.addCircle(f13, f14, L82, Path.Direction.CW);
                        canvas2.save();
                        canvas2.clipPath(path);
                        fVar.h(i0.a.o(-1, (int) (Color.alpha(-1) * 0.325f * f8Var.d)));
                        fVar.setBounds((int) (f13 - L82), (int) (f14 - L82), (int) (f13 + L82), (int) (L82 + f14));
                        fVar.draw(canvas2);
                        e8Var.invalidate();
                        canvas2.restore();
                    }
                    paint5.setColor(i0.a.o(-16777216, (int) (f8Var.d * 80.0f)));
                    canvas2.drawCircle(f13, f14, (org.telegram.messenger.g0.L(44.0f) - i12) / 2.0f, paint5);
                    f8Var.f = true;
                    if (f17 != f16) {
                    }
                    f15 = f18;
                } else {
                    textPaint2 = textPaint3;
                    paint4 = paint7;
                    f11 = measuredWidth;
                    f12 = 1.0f;
                    f13 = f20;
                    f14 = L5;
                    paint3 = paint8;
                    h8Var = h8Var2;
                    f15 = 1.0f;
                }
                if (f15 != f12) {
                    int alpha4 = textPaint4.getAlpha();
                    textPaint4.setAlpha((int) ((f12 - f15) * alpha4));
                    canvas2.drawText(Integer.toString(i23), f13, org.telegram.messenger.g0.L(5.0f) + f14, textPaint4);
                    textPaint4.setAlpha(alpha4);
                    int alpha5 = textPaint4.getAlpha();
                    textPaint = textPaint2;
                    textPaint.setAlpha((int) (alpha5 * f15));
                    canvas2.drawText(Integer.toString(i23), f13, org.telegram.messenger.g0.L(5.0f) + f14, textPaint);
                    textPaint.setAlpha(alpha5);
                } else {
                    textPaint = textPaint2;
                    canvas2.drawText(Integer.toString(i23), f13, org.telegram.messenger.g0.L(5.0f) + f14, textPaint);
                }
                paint2 = paint4;
                paint = paint5;
                i10 = 0;
            }
            i17 = i21 + 1;
            if (i17 >= 7) {
                i19 = i20 + 1;
                i17 = i10;
            } else {
                i19 = i20;
            }
            paint7 = paint2;
            textPaint3 = textPaint;
            h8Var2 = h8Var;
            measuredWidth = f11;
            paint5 = paint;
            i18 = i23;
            e8Var = this;
            paint8 = paint3;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L((this.f * 52) + 44), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return ((GestureDetector) this.s.b).onTouchEvent(motionEvent);
    }
}
