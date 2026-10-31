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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e8 extends FrameLayout {
    public final org.telegram.ui.ActionBar.u5 a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int h;
    public SparseArray n;
    public SparseArray r;
    public final m2.t s;
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
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.a = u5Var;
        if (h8Var.e0 == 0 && h8Var.d0) {
            u5Var.setOnLongClickListener(new s(this, 1));
            u5Var.setOnClickListener(new z7(this, 0));
        }
        int i10 = org.telegram.ui.ActionBar.t6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i10, false), 2, -1);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
        u5Var.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(u5Var, h02, null, N, null);
        u5Var.setTextSize(15);
        u5Var.setTypeface(org.telegram.messenger.i0.o());
        u5Var.setGravity(17);
        org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.G6, null);
        addView(u5Var, w7.b6.d(-1, 28.0f, 0, 0.0f, 12.0f, 0.0f, 4.0f));
        m2.t tVar = new m2.t(context, new c8(this, context));
        this.s = tVar;
        ((GestureDetector) tVar.b).setIsLongpressEnabled(h8Var.e0 == 0);
    }

    public static void a(e8 e8Var, int i10, int i11) {
        if (e8Var.n != null) {
            for (int i12 = 0; i12 < e8Var.d; i12++) {
                f8 f8Var = (f8) e8Var.n.get(i12, null);
                if (f8Var != null) {
                    f8Var.m = f8Var.l;
                    int i13 = f8Var.h;
                    f8Var.n = (i13 < i10 || i13 > i11) ? 0.0f : 1.0f;
                    f8Var.j = f8Var.i;
                    if (i13 == i10 || i13 == i11) {
                        f8Var.k = 1.0f;
                    } else {
                        f8Var.k = 0.0f;
                    }
                }
            }
        }
    }

    public static void b(e8 e8Var, float f7) {
        if (e8Var.n != null) {
            for (int i10 = 0; i10 < e8Var.d; i10++) {
                f8 f8Var = (f8) e8Var.n.get(i10, null);
                if (f8Var != null) {
                    float f10 = f8Var.m;
                    f8Var.l = c3.i0.z(f8Var.n, f10, f7, f10);
                    float f11 = f8Var.j;
                    f8Var.i = c3.i0.z(f8Var.k, f11, f7, f11);
                }
            }
        }
        e8Var.invalidate();
    }

    public final void c(int i10, int i11, int i12, boolean z10, boolean z11) {
        float f7;
        float f10;
        final float f11;
        SparseArray sparseArray = this.w;
        ValueAnimator valueAnimator = (ValueAnimator) sparseArray.get(i10);
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float measuredWidth = getMeasuredWidth() / 7.0f;
        SparseArray sparseArray2 = this.x;
        g8 g8Var = (g8) sparseArray2.get(i10);
        if (g8Var != null) {
            float f12 = g8Var.a;
            f10 = g8Var.b;
            f11 = g8Var.c;
            f7 = f12;
        } else {
            f7 = (measuredWidth / 2.0f) + (i11 * measuredWidth);
            f10 = f7;
            f11 = 0.0f;
        }
        float f13 = z10 ? (measuredWidth / 2.0f) + (i11 * measuredWidth) : f7;
        final float f14 = z10 ? (measuredWidth / 2.0f) + (i12 * measuredWidth) : f10;
        float f15 = z10 ? 1.0f : 0.0f;
        final g8 g8Var2 = new g8();
        g8Var2.a = f7;
        g8Var2.b = f10;
        sparseArray2.put(i10, g8Var2);
        if (!z11) {
            g8Var2.a = f13;
            g8Var2.b = f14;
            g8Var2.c = f15;
            invalidate();
            return;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        duration.setInterpolator(org.telegram.ui.Components.vs.e);
        final float f16 = f10;
        final float f17 = f15;
        final float f18 = f7;
        final float f19 = f13;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.y7
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                e8 e8Var = e8.this;
                e8Var.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float f20 = f19;
                float f21 = f18;
                float z12 = c3.i0.z(f20, f21, floatValue, f21);
                g8 g8Var3 = g8Var2;
                g8Var3.a = z12;
                float f22 = f14;
                float f23 = f16;
                g8Var3.b = c3.i0.z(f22, f23, floatValue, f23);
                float f24 = f17;
                float f25 = f11;
                g8Var3.c = c3.i0.z(f24, f25, floatValue, f25);
                e8Var.invalidate();
            }
        });
        duration.addListener(new d8(this, g8Var2, f19, f14, f17, i10, z10));
        duration.start();
        sparseArray.put(i10, duration);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.r != null) {
            for (int i10 = 0; i10 < this.r.size(); i10++) {
                ((ImageReceiver) this.r.valueAt(i10)).P();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.r != null) {
            for (int i10 = 0; i10 < this.r.size(); i10++) {
                ((ImageReceiver) this.r.valueAt(i10)).R();
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
        int i10;
        float f7;
        Paint paint;
        Paint paint2;
        float f10;
        int i11;
        Paint paint3;
        h8 h8Var;
        TextPaint textPaint;
        int i12;
        TextPaint textPaint2;
        Paint paint4;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        int i13;
        float f17;
        int i14;
        int i15;
        e8 e8Var = this;
        Canvas canvas2 = canvas;
        h8 h8Var2 = e8Var.y;
        Paint paint5 = h8Var2.x;
        nh.i iVar = h8Var2.m0;
        Path path = h8Var2.l0;
        Paint paint6 = h8Var2.r;
        TextPaint textPaint3 = h8Var2.e;
        Paint paint7 = h8Var2.s;
        TextPaint textPaint4 = h8Var2.d;
        super.onDraw(canvas);
        int i16 = e8Var.e;
        float measuredWidth = e8Var.getMeasuredWidth() / 7.0f;
        float L = org.telegram.messenger.i0.L(52.0f);
        int L2 = org.telegram.messenger.i0.L(44.0f);
        Paint paint8 = paint6;
        int i17 = 0;
        while (true) {
            i10 = i16;
            f7 = L;
            if (i17 >= Math.ceil((e8Var.e + e8Var.d) / 7.0f)) {
                break;
            }
            float L3 = (f7 / 2.0f) + (i17 * f7) + org.telegram.messenger.i0.L(44.0f);
            g8 g8Var = (g8) e8Var.x.get(i17);
            if (g8Var != null) {
                paint7.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Rf, false));
                paint7.setAlpha((int) (g8Var.c * 40.8f));
                RectF rectF = org.telegram.messenger.i0.P;
                float f18 = L2 / 2.0f;
                i15 = L2;
                rectF.set(g8Var.a - f18, L3 - f18, g8Var.b + f18, L3 + f18);
                float L4 = org.telegram.messenger.i0.L(32.0f);
                canvas2.drawRoundRect(rectF, L4, L4, paint7);
            } else {
                i15 = L2;
            }
            i17++;
            i16 = i10;
            L = f7;
            L2 = i15;
        }
        int i18 = i10;
        int i19 = 0;
        int i20 = 0;
        while (i19 < e8Var.d) {
            float f19 = (i18 * measuredWidth) + (measuredWidth / 2.0f);
            float L5 = (f7 / 2.0f) + (i20 * f7) + org.telegram.messenger.i0.L(44.0f);
            int i21 = i20;
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            SparseArray sparseArray = e8Var.n;
            int i22 = i18;
            f8 f8Var = sparseArray != null ? (f8) sparseArray.get(i19, null) : null;
            int i23 = e8Var.h;
            int i24 = i19 + 1;
            if (currentTimeMillis < (i24 * 86400) + i23 || ((i12 = h8Var2.c0) > 0 && i12 > ((i19 + 2) * 86400) + i23)) {
                paint = paint5;
                paint2 = paint7;
                f10 = measuredWidth;
                i11 = 0;
                paint3 = paint8;
                h8Var = h8Var2;
                textPaint = textPaint3;
                int alpha = textPaint4.getAlpha();
                textPaint4.setAlpha((int) (alpha * 0.3f));
                canvas2.drawText(Integer.toString(i24), f19, org.telegram.messenger.i0.L(5.0f) + L5, textPaint4);
                textPaint4.setAlpha(alpha);
            } else if (f8Var == null || !f8Var.g) {
                Paint paint9 = paint7;
                f10 = measuredWidth;
                paint3 = paint8;
                h8Var = h8Var2;
                textPaint = textPaint3;
                if (f8Var == null || f8Var.i < 0.01f) {
                    paint2 = paint9;
                    paint = paint5;
                    i11 = 0;
                    canvas2.drawText(Integer.toString(i24), f19, org.telegram.messenger.i0.L(5.0f) + L5, textPaint4);
                } else {
                    paint9.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false));
                    paint9.setAlpha((int) (f8Var.i * 255.0f));
                    canvas2.drawCircle(f19, L5, org.telegram.messenger.i0.L(44.0f) / 2.0f, paint9);
                    int i25 = org.telegram.ui.ActionBar.t6.Rf;
                    paint3.setColor(org.telegram.ui.ActionBar.t6.x0(null, i25, false));
                    RectF rectF2 = org.telegram.messenger.i0.P;
                    rectF2.set(f19 - (org.telegram.messenger.i0.L(44.0f) / 2.0f), L5 - (org.telegram.messenger.i0.L(44.0f) / 2.0f), (org.telegram.messenger.i0.L(44.0f) / 2.0f) + f19, (org.telegram.messenger.i0.L(44.0f) / 2.0f) + L5);
                    paint2 = paint9;
                    paint = paint5;
                    i11 = 0;
                    canvas2 = canvas;
                    canvas2.drawArc(rectF2, -90.0f, f8Var.i * 360.0f, false, paint3);
                    int L6 = (int) (org.telegram.messenger.i0.L(7.0f) * f8Var.i);
                    paint2.setColor(org.telegram.ui.ActionBar.t6.x0(null, i25, false));
                    paint2.setAlpha((int) (f8Var.i * 255.0f));
                    canvas2.drawCircle(f19, L5, (org.telegram.messenger.i0.L(44.0f) - L6) / 2.0f, paint2);
                    float f20 = f8Var.i;
                    if (f20 != 1.0f) {
                        int alpha2 = textPaint4.getAlpha();
                        textPaint4.setAlpha((int) ((1.0f - f20) * alpha2));
                        canvas2.drawText(Integer.toString(i24), f19, org.telegram.messenger.i0.L(5.0f) + L5, textPaint4);
                        textPaint4.setAlpha(alpha2);
                        int alpha3 = textPaint4.getAlpha();
                        textPaint.setAlpha((int) (alpha3 * f20));
                        canvas2.drawText(Integer.toString(i24), f19, org.telegram.messenger.i0.L(5.0f) + L5, textPaint);
                        textPaint.setAlpha(alpha3);
                    } else {
                        canvas2.drawText(Integer.toString(i24), f19, org.telegram.messenger.i0.L(5.0f) + L5, textPaint);
                    }
                }
            } else {
                if (e8Var.r.get(i19) != null) {
                    float f21 = 0.0f;
                    if (h8Var2.F && !f8Var.f) {
                        f8Var.d = 0.0f;
                        f21 = 0.0f;
                        f8Var.e = Math.max(0.0f, ((e8Var.getY() + L5) / h8Var2.b.getMeasuredHeight()) * 150.0f);
                    }
                    float f22 = f8Var.e;
                    if (f22 > f21) {
                        float f23 = f22 - 16.0f;
                        f8Var.e = f23;
                        if (f23 < f21) {
                            f8Var.e = f21;
                        } else {
                            e8Var.invalidate();
                        }
                    }
                    if (f8Var.e >= f21) {
                        float f24 = f8Var.d;
                        if (f24 != 1.0f) {
                            float f25 = f24 + 0.07272727f;
                            f8Var.d = f25;
                            if (f25 > 1.0f) {
                                f15 = 1.0f;
                                f8Var.d = 1.0f;
                            } else {
                                f15 = 1.0f;
                                e8Var.invalidate();
                            }
                            f16 = f8Var.d;
                            if (f16 != f15) {
                                canvas2.save();
                                float f26 = (0.2f * f16) + 0.8f;
                                canvas2.scale(f26, f26, f19, L5);
                            }
                            int i26 = i19;
                            int L7 = (int) (org.telegram.messenger.i0.L(7.0f) * f8Var.l);
                            if (f8Var.i < 0.01f) {
                                i13 = L7;
                                paint7.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false));
                                paint7.setAlpha((int) (f8Var.i * 255.0f));
                                canvas2.drawCircle(f19, L5, org.telegram.messenger.i0.L(44.0f) / 2.0f, paint7);
                                paint8.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Rf, false));
                                RectF rectF3 = org.telegram.messenger.i0.P;
                                rectF3.set(f19 - (org.telegram.messenger.i0.L(44.0f) / 2.0f), L5 - (org.telegram.messenger.i0.L(44.0f) / 2.0f), (org.telegram.messenger.i0.L(44.0f) / 2.0f) + f19, (org.telegram.messenger.i0.L(44.0f) / 2.0f) + L5);
                                canvas2 = canvas;
                                paint4 = paint7;
                                f17 = f16;
                                f11 = 1.0f;
                                f13 = L5;
                                f10 = measuredWidth;
                                paint3 = paint8;
                                f12 = f19;
                                h8Var = h8Var2;
                                i14 = i26;
                                textPaint2 = textPaint3;
                                canvas2.drawArc(rectF3, -90.0f, f8Var.i * 360.0f, false, paint3);
                            } else {
                                i13 = L7;
                                f17 = f16;
                                paint4 = paint7;
                                f10 = measuredWidth;
                                f11 = 1.0f;
                                f12 = f19;
                                f13 = L5;
                                paint3 = paint8;
                                h8Var = h8Var2;
                                i14 = i26;
                                textPaint2 = textPaint3;
                            }
                            ((ImageReceiver) e8Var.r.get(i14)).setAlpha(f8Var.d);
                            ((ImageReceiver) e8Var.r.get(i14)).y0(f12 - ((org.telegram.messenger.i0.L(44.0f) - i13) / 2.0f), f13 - ((org.telegram.messenger.i0.L(44.0f) - i13) / 2.0f), org.telegram.messenger.i0.L(44.0f) - i13, org.telegram.messenger.i0.L(44.0f) - i13);
                            ((ImageReceiver) e8Var.r.get(i14)).h(canvas2, null);
                            if (e8Var.n.get(i14) != null && ((f8) e8Var.n.get(i14)).a != null && ((f8) e8Var.n.get(i14)).a.t2()) {
                                float L8 = (org.telegram.messenger.i0.L(44.0f) - i13) / 2.0f;
                                path.rewind();
                                path.addCircle(f12, f13, L8, Path.Direction.CW);
                                canvas2.save();
                                canvas2.clipPath(path);
                                iVar.h(i0.b.o(-1, (int) (Color.alpha(-1) * 0.325f * f8Var.d)));
                                iVar.setBounds((int) (f12 - L8), (int) (f13 - L8), (int) (f12 + L8), (int) (L8 + f13));
                                iVar.draw(canvas2);
                                e8Var.invalidate();
                                canvas2.restore();
                            }
                            paint5.setColor(i0.b.o(-16777216, (int) (f8Var.d * 80.0f)));
                            canvas2.drawCircle(f12, f13, (org.telegram.messenger.i0.L(44.0f) - i13) / 2.0f, paint5);
                            f8Var.f = true;
                            if (f16 != f15) {
                                canvas2.restore();
                            }
                            f14 = f17;
                        }
                    }
                    f15 = 1.0f;
                    f16 = f8Var.d;
                    if (f16 != f15) {
                    }
                    int i262 = i19;
                    int L72 = (int) (org.telegram.messenger.i0.L(7.0f) * f8Var.l);
                    if (f8Var.i < 0.01f) {
                    }
                    ((ImageReceiver) e8Var.r.get(i14)).setAlpha(f8Var.d);
                    ((ImageReceiver) e8Var.r.get(i14)).y0(f12 - ((org.telegram.messenger.i0.L(44.0f) - i13) / 2.0f), f13 - ((org.telegram.messenger.i0.L(44.0f) - i13) / 2.0f), org.telegram.messenger.i0.L(44.0f) - i13, org.telegram.messenger.i0.L(44.0f) - i13);
                    ((ImageReceiver) e8Var.r.get(i14)).h(canvas2, null);
                    if (e8Var.n.get(i14) != null) {
                        float L82 = (org.telegram.messenger.i0.L(44.0f) - i13) / 2.0f;
                        path.rewind();
                        path.addCircle(f12, f13, L82, Path.Direction.CW);
                        canvas2.save();
                        canvas2.clipPath(path);
                        iVar.h(i0.b.o(-1, (int) (Color.alpha(-1) * 0.325f * f8Var.d)));
                        iVar.setBounds((int) (f12 - L82), (int) (f13 - L82), (int) (f12 + L82), (int) (L82 + f13));
                        iVar.draw(canvas2);
                        e8Var.invalidate();
                        canvas2.restore();
                    }
                    paint5.setColor(i0.b.o(-16777216, (int) (f8Var.d * 80.0f)));
                    canvas2.drawCircle(f12, f13, (org.telegram.messenger.i0.L(44.0f) - i13) / 2.0f, paint5);
                    f8Var.f = true;
                    if (f16 != f15) {
                    }
                    f14 = f17;
                } else {
                    textPaint2 = textPaint3;
                    paint4 = paint7;
                    f10 = measuredWidth;
                    f11 = 1.0f;
                    f12 = f19;
                    f13 = L5;
                    paint3 = paint8;
                    h8Var = h8Var2;
                    f14 = 1.0f;
                }
                if (f14 != f11) {
                    int alpha4 = textPaint4.getAlpha();
                    textPaint4.setAlpha((int) ((f11 - f14) * alpha4));
                    canvas2.drawText(Integer.toString(i24), f12, org.telegram.messenger.i0.L(5.0f) + f13, textPaint4);
                    textPaint4.setAlpha(alpha4);
                    int alpha5 = textPaint4.getAlpha();
                    textPaint = textPaint2;
                    textPaint.setAlpha((int) (alpha5 * f14));
                    canvas2.drawText(Integer.toString(i24), f12, org.telegram.messenger.i0.L(5.0f) + f13, textPaint);
                    textPaint.setAlpha(alpha5);
                } else {
                    textPaint = textPaint2;
                    canvas2.drawText(Integer.toString(i24), f12, org.telegram.messenger.i0.L(5.0f) + f13, textPaint);
                }
                paint2 = paint4;
                paint = paint5;
                i11 = 0;
            }
            i18 = i22 + 1;
            if (i18 >= 7) {
                i20 = i21 + 1;
                i18 = i11;
            } else {
                i20 = i21;
            }
            paint7 = paint2;
            textPaint3 = textPaint;
            h8Var2 = h8Var;
            measuredWidth = f10;
            paint5 = paint;
            i19 = i24;
            e8Var = this;
            paint8 = paint3;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L((this.f * 52) + 44), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return ((GestureDetector) this.s.b).onTouchEvent(motionEvent);
    }
}
