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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class f8 extends FrameLayout {
    public final org.telegram.ui.ActionBar.k5 a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int h;
    public SparseArray n;
    public SparseArray r;
    public final org.telegram.ui.Components.y00 s;
    public final SparseArray w;
    public final SparseArray x;
    public final /* synthetic */ i8 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f8(i8 i8Var, Context context) {
        super(context);
        this.y = i8Var;
        this.n = new SparseArray();
        this.r = new SparseArray();
        this.w = new SparseArray();
        this.x = new SparseArray();
        setWillNotDraw(false);
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.a = k5Var;
        if (i8Var.f0 == 0 && i8Var.e0) {
            k5Var.setOnLongClickListener(new t(this, 1));
            k5Var.setOnClickListener(new a8(this, 0));
        }
        int i3 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i3, false), 2, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i3);
        k5Var.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(k5Var, h02, null, N, null);
        k5Var.setTextSize(15);
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        k5Var.setGravity(17);
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.G6, null);
        addView(k5Var, b8.mf.d(-1, 28.0f, 0, 0.0f, 12.0f, 0.0f, 4.0f));
        org.telegram.ui.Components.y00 y00Var = new org.telegram.ui.Components.y00(context, new d8(this, context));
        this.s = y00Var;
        ((GestureDetector) y00Var.a).setIsLongpressEnabled(i8Var.f0 == 0);
    }

    public static void a(f8 f8Var, int i3, int i10) {
        if (f8Var.n != null) {
            for (int i11 = 0; i11 < f8Var.d; i11++) {
                g8 g8Var = (g8) f8Var.n.get(i11, null);
                if (g8Var != null) {
                    g8Var.m = g8Var.l;
                    int i12 = g8Var.h;
                    g8Var.n = (i12 < i3 || i12 > i10) ? 0.0f : 1.0f;
                    g8Var.j = g8Var.i;
                    if (i12 == i3 || i12 == i10) {
                        g8Var.k = 1.0f;
                    } else {
                        g8Var.k = 0.0f;
                    }
                }
            }
        }
    }

    public static void b(f8 f8Var, float f10) {
        if (f8Var.n != null) {
            for (int i3 = 0; i3 < f8Var.d; i3++) {
                g8 g8Var = (g8) f8Var.n.get(i3, null);
                if (g8Var != null) {
                    float f11 = g8Var.m;
                    g8Var.l = com.google.android.recaptcha.internal.a.y(g8Var.n, f11, f10, f11);
                    float f12 = g8Var.j;
                    g8Var.i = com.google.android.recaptcha.internal.a.y(g8Var.k, f12, f10, f12);
                }
            }
        }
        f8Var.invalidate();
    }

    public final void c(int i3, int i10, int i11, boolean z10, boolean z11) {
        float f10;
        float f11;
        final float f12;
        SparseArray sparseArray = this.w;
        ValueAnimator valueAnimator = (ValueAnimator) sparseArray.get(i3);
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float measuredWidth = getMeasuredWidth() / 7.0f;
        SparseArray sparseArray2 = this.x;
        h8 h8Var = (h8) sparseArray2.get(i3);
        if (h8Var != null) {
            float f13 = h8Var.a;
            f11 = h8Var.b;
            f12 = h8Var.c;
            f10 = f13;
        } else {
            f10 = (measuredWidth / 2.0f) + (i10 * measuredWidth);
            f11 = f10;
            f12 = 0.0f;
        }
        float f14 = z10 ? (measuredWidth / 2.0f) + (i10 * measuredWidth) : f10;
        final float f15 = z10 ? (measuredWidth / 2.0f) + (i11 * measuredWidth) : f11;
        float f16 = z10 ? 1.0f : 0.0f;
        final h8 h8Var2 = new h8();
        h8Var2.a = f10;
        h8Var2.b = f11;
        sparseArray2.put(i3, h8Var2);
        if (!z11) {
            h8Var2.a = f14;
            h8Var2.b = f15;
            h8Var2.c = f16;
            invalidate();
            return;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        duration.setInterpolator(org.telegram.ui.Components.ks.e);
        final float f17 = f11;
        final float f18 = f16;
        final float f19 = f10;
        final float f20 = f14;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.z7
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                f8 f8Var = f8.this;
                f8Var.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float f21 = f20;
                float f22 = f19;
                float y9 = com.google.android.recaptcha.internal.a.y(f21, f22, floatValue, f22);
                h8 h8Var3 = h8Var2;
                h8Var3.a = y9;
                float f23 = f15;
                float f24 = f17;
                h8Var3.b = com.google.android.recaptcha.internal.a.y(f23, f24, floatValue, f24);
                float f25 = f18;
                float f26 = f12;
                h8Var3.c = com.google.android.recaptcha.internal.a.y(f25, f26, floatValue, f26);
                f8Var.invalidate();
            }
        });
        duration.addListener(new e8(this, h8Var2, f20, f15, f18, i3, z10));
        duration.start();
        sparseArray.put(i3, duration);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.r != null) {
            for (int i3 = 0; i3 < this.r.size(); i3++) {
                ((ImageReceiver) this.r.valueAt(i3)).P();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.r != null) {
            for (int i3 = 0; i3 < this.r.size(); i3++) {
                ((ImageReceiver) this.r.valueAt(i3)).R();
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
        int i3;
        float f10;
        Paint paint;
        Paint paint2;
        float f11;
        int i10;
        Paint paint3;
        i8 i8Var;
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
        f8 f8Var = this;
        Canvas canvas2 = canvas;
        i8 i8Var2 = f8Var.y;
        Paint paint5 = i8Var2.x;
        yh.f fVar = i8Var2.n0;
        Path path = i8Var2.m0;
        Paint paint6 = i8Var2.r;
        TextPaint textPaint3 = i8Var2.e;
        Paint paint7 = i8Var2.s;
        TextPaint textPaint4 = i8Var2.d;
        super.onDraw(canvas);
        int i15 = f8Var.e;
        float measuredWidth = f8Var.getMeasuredWidth() / 7.0f;
        float L = org.telegram.messenger.g0.L(52.0f);
        int L2 = org.telegram.messenger.g0.L(44.0f);
        Paint paint8 = paint6;
        int i16 = 0;
        while (true) {
            i3 = i15;
            f10 = L;
            if (i16 >= Math.ceil((f8Var.e + f8Var.d) / 7.0f)) {
                break;
            }
            float L3 = (f10 / 2.0f) + (i16 * f10) + org.telegram.messenger.g0.L(44.0f);
            h8 h8Var = (h8) f8Var.x.get(i16);
            if (h8Var != null) {
                paint7.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Rf, false));
                paint7.setAlpha((int) (h8Var.c * 40.8f));
                RectF rectF = org.telegram.messenger.g0.P;
                float f19 = L2 / 2.0f;
                i14 = L2;
                rectF.set(h8Var.a - f19, L3 - f19, h8Var.b + f19, L3 + f19);
                float L4 = org.telegram.messenger.g0.L(32.0f);
                canvas2.drawRoundRect(rectF, L4, L4, paint7);
            } else {
                i14 = L2;
            }
            i16++;
            i15 = i3;
            L = f10;
            L2 = i14;
        }
        int i17 = i3;
        int i18 = 0;
        int i19 = 0;
        while (i18 < f8Var.d) {
            float f20 = (i17 * measuredWidth) + (measuredWidth / 2.0f);
            float L5 = (f10 / 2.0f) + (i19 * f10) + org.telegram.messenger.g0.L(44.0f);
            int i20 = i19;
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            SparseArray sparseArray = f8Var.n;
            int i21 = i17;
            g8 g8Var = sparseArray != null ? (g8) sparseArray.get(i18, null) : null;
            int i22 = f8Var.h;
            int i23 = i18 + 1;
            if (currentTimeMillis < (i23 * 86400) + i22 || ((i11 = i8Var2.d0) > 0 && i11 > ((i18 + 2) * 86400) + i22)) {
                paint = paint5;
                paint2 = paint7;
                f11 = measuredWidth;
                i10 = 0;
                paint3 = paint8;
                i8Var = i8Var2;
                textPaint = textPaint3;
                int alpha = textPaint4.getAlpha();
                textPaint4.setAlpha((int) (alpha * 0.3f));
                canvas2.drawText(Integer.toString(i23), f20, org.telegram.messenger.g0.L(5.0f) + L5, textPaint4);
                textPaint4.setAlpha(alpha);
            } else if (g8Var == null || !g8Var.g) {
                Paint paint9 = paint7;
                f11 = measuredWidth;
                paint3 = paint8;
                i8Var = i8Var2;
                textPaint = textPaint3;
                if (g8Var == null || g8Var.i < 0.01f) {
                    paint2 = paint9;
                    paint = paint5;
                    i10 = 0;
                    canvas2.drawText(Integer.toString(i23), f20, org.telegram.messenger.g0.L(5.0f) + L5, textPaint4);
                } else {
                    paint9.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false));
                    paint9.setAlpha((int) (g8Var.i * 255.0f));
                    canvas2.drawCircle(f20, L5, org.telegram.messenger.g0.L(44.0f) / 2.0f, paint9);
                    int i24 = org.telegram.ui.ActionBar.k6.Rf;
                    paint3.setColor(org.telegram.ui.ActionBar.k6.x0(null, i24, false));
                    RectF rectF2 = org.telegram.messenger.g0.P;
                    rectF2.set(f20 - (org.telegram.messenger.g0.L(44.0f) / 2.0f), L5 - (org.telegram.messenger.g0.L(44.0f) / 2.0f), (org.telegram.messenger.g0.L(44.0f) / 2.0f) + f20, (org.telegram.messenger.g0.L(44.0f) / 2.0f) + L5);
                    paint2 = paint9;
                    paint = paint5;
                    i10 = 0;
                    canvas2 = canvas;
                    canvas2.drawArc(rectF2, -90.0f, g8Var.i * 360.0f, false, paint3);
                    int L6 = (int) (org.telegram.messenger.g0.L(7.0f) * g8Var.i);
                    paint2.setColor(org.telegram.ui.ActionBar.k6.x0(null, i24, false));
                    paint2.setAlpha((int) (g8Var.i * 255.0f));
                    canvas2.drawCircle(f20, L5, (org.telegram.messenger.g0.L(44.0f) - L6) / 2.0f, paint2);
                    float f21 = g8Var.i;
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
                if (f8Var.r.get(i18) != null) {
                    float f22 = 0.0f;
                    if (i8Var2.G && !g8Var.f) {
                        g8Var.d = 0.0f;
                        f22 = 0.0f;
                        g8Var.e = Math.max(0.0f, ((f8Var.getY() + L5) / i8Var2.b.getMeasuredHeight()) * 150.0f);
                    }
                    float f23 = g8Var.e;
                    if (f23 > f22) {
                        float f24 = f23 - 16.0f;
                        g8Var.e = f24;
                        if (f24 < f22) {
                            g8Var.e = f22;
                        } else {
                            f8Var.invalidate();
                        }
                    }
                    if (g8Var.e >= f22) {
                        float f25 = g8Var.d;
                        if (f25 != 1.0f) {
                            float f26 = f25 + 0.07272727f;
                            g8Var.d = f26;
                            if (f26 > 1.0f) {
                                f16 = 1.0f;
                                g8Var.d = 1.0f;
                            } else {
                                f16 = 1.0f;
                                f8Var.invalidate();
                            }
                            f17 = g8Var.d;
                            if (f17 != f16) {
                                canvas2.save();
                                float f27 = (0.2f * f17) + 0.8f;
                                canvas2.scale(f27, f27, f20, L5);
                            }
                            int i25 = i18;
                            int L7 = (int) (org.telegram.messenger.g0.L(7.0f) * g8Var.l);
                            if (g8Var.i < 0.01f) {
                                i12 = L7;
                                paint7.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false));
                                paint7.setAlpha((int) (g8Var.i * 255.0f));
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
                                i8Var = i8Var2;
                                i13 = i25;
                                textPaint2 = textPaint3;
                                canvas2.drawArc(rectF3, -90.0f, g8Var.i * 360.0f, false, paint3);
                            } else {
                                i12 = L7;
                                f18 = f17;
                                paint4 = paint7;
                                f11 = measuredWidth;
                                f12 = 1.0f;
                                f13 = f20;
                                f14 = L5;
                                paint3 = paint8;
                                i8Var = i8Var2;
                                i13 = i25;
                                textPaint2 = textPaint3;
                            }
                            ((ImageReceiver) f8Var.r.get(i13)).setAlpha(g8Var.d);
                            ((ImageReceiver) f8Var.r.get(i13)).y0(f13 - ((org.telegram.messenger.g0.L(44.0f) - i12) / 2.0f), f14 - ((org.telegram.messenger.g0.L(44.0f) - i12) / 2.0f), org.telegram.messenger.g0.L(44.0f) - i12, org.telegram.messenger.g0.L(44.0f) - i12);
                            ((ImageReceiver) f8Var.r.get(i13)).h(canvas2, null);
                            if (f8Var.n.get(i13) != null && ((g8) f8Var.n.get(i13)).a != null && ((g8) f8Var.n.get(i13)).a.u2()) {
                                float L8 = (org.telegram.messenger.g0.L(44.0f) - i12) / 2.0f;
                                path.rewind();
                                path.addCircle(f13, f14, L8, Path.Direction.CW);
                                canvas2.save();
                                canvas2.clipPath(path);
                                fVar.h(i0.a.o(-1, (int) (Color.alpha(-1) * 0.325f * g8Var.d)));
                                fVar.setBounds((int) (f13 - L8), (int) (f14 - L8), (int) (f13 + L8), (int) (L8 + f14));
                                fVar.draw(canvas2);
                                f8Var.invalidate();
                                canvas2.restore();
                            }
                            paint5.setColor(i0.a.o(-16777216, (int) (g8Var.d * 80.0f)));
                            canvas2.drawCircle(f13, f14, (org.telegram.messenger.g0.L(44.0f) - i12) / 2.0f, paint5);
                            g8Var.f = true;
                            if (f17 != f16) {
                                canvas2.restore();
                            }
                            f15 = f18;
                        }
                    }
                    f16 = 1.0f;
                    f17 = g8Var.d;
                    if (f17 != f16) {
                    }
                    int i252 = i18;
                    int L72 = (int) (org.telegram.messenger.g0.L(7.0f) * g8Var.l);
                    if (g8Var.i < 0.01f) {
                    }
                    ((ImageReceiver) f8Var.r.get(i13)).setAlpha(g8Var.d);
                    ((ImageReceiver) f8Var.r.get(i13)).y0(f13 - ((org.telegram.messenger.g0.L(44.0f) - i12) / 2.0f), f14 - ((org.telegram.messenger.g0.L(44.0f) - i12) / 2.0f), org.telegram.messenger.g0.L(44.0f) - i12, org.telegram.messenger.g0.L(44.0f) - i12);
                    ((ImageReceiver) f8Var.r.get(i13)).h(canvas2, null);
                    if (f8Var.n.get(i13) != null) {
                        float L82 = (org.telegram.messenger.g0.L(44.0f) - i12) / 2.0f;
                        path.rewind();
                        path.addCircle(f13, f14, L82, Path.Direction.CW);
                        canvas2.save();
                        canvas2.clipPath(path);
                        fVar.h(i0.a.o(-1, (int) (Color.alpha(-1) * 0.325f * g8Var.d)));
                        fVar.setBounds((int) (f13 - L82), (int) (f14 - L82), (int) (f13 + L82), (int) (L82 + f14));
                        fVar.draw(canvas2);
                        f8Var.invalidate();
                        canvas2.restore();
                    }
                    paint5.setColor(i0.a.o(-16777216, (int) (g8Var.d * 80.0f)));
                    canvas2.drawCircle(f13, f14, (org.telegram.messenger.g0.L(44.0f) - i12) / 2.0f, paint5);
                    g8Var.f = true;
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
                    i8Var = i8Var2;
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
            i8Var2 = i8Var;
            measuredWidth = f11;
            paint5 = paint;
            i18 = i23;
            f8Var = this;
            paint8 = paint3;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L((this.f * 52) + 44), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return ((GestureDetector) this.s.a).onTouchEvent(motionEvent);
    }
}
