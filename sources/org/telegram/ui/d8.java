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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class d8 extends FrameLayout {
    public final org.telegram.ui.ActionBar.h5 a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int h;
    public SparseArray n;
    public SparseArray r;
    public final m5.c0 s;
    public final SparseArray v;
    public final SparseArray w;
    public final /* synthetic */ g8 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8(g8 g8Var, Context context) {
        super(context);
        this.x = g8Var;
        this.n = new SparseArray();
        this.r = new SparseArray();
        this.v = new SparseArray();
        this.w = new SparseArray();
        setWillNotDraw(false);
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.a = h5Var;
        if (g8Var.a0 == 0 && g8Var.Z) {
            h5Var.setOnLongClickListener(new u(this, 1));
            h5Var.setOnClickListener(new x7(this, 0));
        }
        h5Var.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.i6, false), 2, -1));
        h5Var.setTextSize(15);
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setGravity(17);
        h5Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
        addView(h5Var, g7.e6.d(-1, 28.0f, 0, 0.0f, 12.0f, 0.0f, 4.0f));
        m5.c0 c0Var = new m5.c0(context, new b8(this, context));
        this.s = c0Var;
        ((GestureDetector) c0Var.b).setIsLongpressEnabled(g8Var.a0 == 0);
    }

    public static void a(d8 d8Var, int i9, int i10) {
        if (d8Var.n != null) {
            for (int i11 = 0; i11 < d8Var.d; i11++) {
                e8 e8Var = (e8) d8Var.n.get(i11, null);
                if (e8Var != null) {
                    e8Var.m = e8Var.l;
                    int i12 = e8Var.h;
                    e8Var.n = (i12 < i9 || i12 > i10) ? 0.0f : 1.0f;
                    e8Var.j = e8Var.i;
                    if (i12 == i9 || i12 == i10) {
                        e8Var.k = 1.0f;
                    } else {
                        e8Var.k = 0.0f;
                    }
                }
            }
        }
    }

    public static void b(d8 d8Var, float f10) {
        if (d8Var.n != null) {
            for (int i9 = 0; i9 < d8Var.d; i9++) {
                e8 e8Var = (e8) d8Var.n.get(i9, null);
                if (e8Var != null) {
                    float f11 = e8Var.m;
                    e8Var.l = e2.c.z(e8Var.n, f11, f10, f11);
                    float f12 = e8Var.j;
                    e8Var.i = e2.c.z(e8Var.k, f12, f10, f12);
                }
            }
        }
        d8Var.invalidate();
    }

    public final void c(int i9, int i10, int i11, boolean z10, boolean z11) {
        float f10;
        float f11;
        final float f12;
        SparseArray sparseArray = this.v;
        ValueAnimator valueAnimator = (ValueAnimator) sparseArray.get(i9);
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float measuredWidth = getMeasuredWidth() / 7.0f;
        SparseArray sparseArray2 = this.w;
        f8 f8Var = (f8) sparseArray2.get(i9);
        if (f8Var != null) {
            float f13 = f8Var.a;
            f11 = f8Var.b;
            f12 = f8Var.c;
            f10 = f13;
        } else {
            f10 = (measuredWidth / 2.0f) + (i10 * measuredWidth);
            f11 = f10;
            f12 = 0.0f;
        }
        float f14 = z10 ? (measuredWidth / 2.0f) + (i10 * measuredWidth) : f10;
        final float f15 = z10 ? (measuredWidth / 2.0f) + (i11 * measuredWidth) : f11;
        float f16 = z10 ? 1.0f : 0.0f;
        final f8 f8Var2 = new f8();
        f8Var2.a = f10;
        f8Var2.b = f11;
        sparseArray2.put(i9, f8Var2);
        if (!z11) {
            f8Var2.a = f14;
            f8Var2.b = f15;
            f8Var2.c = f16;
            invalidate();
            return;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        duration.setInterpolator(org.telegram.ui.Components.xs.e);
        final float f17 = f11;
        final float f18 = f16;
        final float f19 = f10;
        final float f20 = f14;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.w7
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                d8 d8Var = d8.this;
                d8Var.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float f21 = f20;
                float f22 = f19;
                float z12 = e2.c.z(f21, f22, floatValue, f22);
                f8 f8Var3 = f8Var2;
                f8Var3.a = z12;
                float f23 = f15;
                float f24 = f17;
                f8Var3.b = e2.c.z(f23, f24, floatValue, f24);
                float f25 = f18;
                float f26 = f12;
                f8Var3.c = e2.c.z(f25, f26, floatValue, f26);
                d8Var.invalidate();
            }
        });
        duration.addListener(new c8(this, f8Var2, f20, f15, f18, i9, z10));
        duration.start();
        sparseArray.put(i9, duration);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.r != null) {
            for (int i9 = 0; i9 < this.r.size(); i9++) {
                ((ImageReceiver) this.r.valueAt(i9)).onAttachedToWindow();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.r != null) {
            for (int i9 = 0; i9 < this.r.size(); i9++) {
                ((ImageReceiver) this.r.valueAt(i9)).onDetachedFromWindow();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0218  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        int i9;
        float f10;
        Paint paint;
        Paint paint2;
        float f11;
        Paint paint3;
        g8 g8Var;
        int i10;
        Paint paint4;
        Paint paint5;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        int i11;
        float f18;
        Paint paint6;
        int i12;
        int i13;
        d8 d8Var = this;
        Canvas canvas2 = canvas;
        g8 g8Var2 = d8Var.x;
        Paint paint7 = g8Var2.w;
        dh.l lVar = g8Var2.g0;
        Path path = g8Var2.f0;
        Paint paint8 = g8Var2.r;
        TextPaint textPaint = g8Var2.e;
        Paint paint9 = g8Var2.s;
        TextPaint textPaint2 = g8Var2.d;
        super.onDraw(canvas);
        int i14 = d8Var.e;
        float measuredWidth = d8Var.getMeasuredWidth() / 7.0f;
        float dp = AndroidUtilities.dp(52.0f);
        int dp2 = AndroidUtilities.dp(44.0f);
        Paint paint10 = paint8;
        int i15 = 0;
        while (true) {
            i9 = i14;
            f10 = dp;
            if (i15 >= Math.ceil((d8Var.e + d8Var.d) / 7.0f)) {
                break;
            }
            float dp3 = (f10 / 2.0f) + (i15 * f10) + AndroidUtilities.dp(44.0f);
            f8 f8Var = (f8) d8Var.w.get(i15);
            if (f8Var != null) {
                paint9.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.cf, false));
                paint9.setAlpha((int) (f8Var.c * 40.8f));
                RectF rectF = AndroidUtilities.rectTmp;
                float f19 = dp2 / 2.0f;
                i13 = dp2;
                rectF.set(f8Var.a - f19, dp3 - f19, f8Var.b + f19, dp3 + f19);
                float dp4 = AndroidUtilities.dp(32.0f);
                canvas2.drawRoundRect(rectF, dp4, dp4, paint9);
            } else {
                i13 = dp2;
            }
            i15++;
            i14 = i9;
            dp = f10;
            dp2 = i13;
        }
        int i16 = i9;
        int i17 = 0;
        int i18 = 0;
        while (i17 < d8Var.d) {
            float f20 = (i16 * measuredWidth) + (measuredWidth / 2.0f);
            float dp5 = (f10 / 2.0f) + (i18 * f10) + AndroidUtilities.dp(44.0f);
            int i19 = i18;
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            SparseArray sparseArray = d8Var.n;
            int i20 = i16;
            e8 e8Var = sparseArray != null ? (e8) sparseArray.get(i17, null) : null;
            int i21 = d8Var.h;
            int i22 = i17 + 1;
            if (currentTimeMillis < (i22 * 86400) + i21 || ((i10 = g8Var2.Y) > 0 && i10 > ((i17 + 2) * 86400) + i21)) {
                paint = paint7;
                paint2 = paint9;
                f11 = measuredWidth;
                paint3 = paint10;
                g8Var = g8Var2;
                int alpha = textPaint2.getAlpha();
                textPaint2.setAlpha((int) (alpha * 0.3f));
                canvas2.drawText(Integer.toString(i22), f20, AndroidUtilities.dp(5.0f) + dp5, textPaint2);
                textPaint2.setAlpha(alpha);
            } else if (e8Var == null || !e8Var.g) {
                Paint paint11 = paint9;
                f11 = measuredWidth;
                Paint paint12 = paint10;
                g8Var = g8Var2;
                if (e8Var == null || e8Var.i < 0.01f) {
                    paint = paint7;
                    paint2 = paint11;
                    paint3 = paint12;
                    canvas2.drawText(Integer.toString(i22), f20, AndroidUtilities.dp(5.0f) + dp5, textPaint2);
                } else {
                    paint11.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
                    paint11.setAlpha((int) (e8Var.i * 255.0f));
                    canvas2.drawCircle(f20, dp5, AndroidUtilities.dp(44.0f) / 2.0f, paint11);
                    int i23 = org.telegram.ui.ActionBar.f6.cf;
                    paint3 = paint12;
                    paint3.setColor(org.telegram.ui.ActionBar.f6.w0(null, i23, false));
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(f20 - (AndroidUtilities.dp(44.0f) / 2.0f), dp5 - (AndroidUtilities.dp(44.0f) / 2.0f), (AndroidUtilities.dp(44.0f) / 2.0f) + f20, (AndroidUtilities.dp(44.0f) / 2.0f) + dp5);
                    paint2 = paint11;
                    paint = paint7;
                    canvas2 = canvas;
                    canvas2.drawArc(rectF2, -90.0f, e8Var.i * 360.0f, false, paint3);
                    int dp6 = (int) (AndroidUtilities.dp(7.0f) * e8Var.i);
                    paint2.setColor(org.telegram.ui.ActionBar.f6.w0(null, i23, false));
                    paint2.setAlpha((int) (e8Var.i * 255.0f));
                    canvas2.drawCircle(f20, dp5, (AndroidUtilities.dp(44.0f) - dp6) / 2.0f, paint2);
                    float f21 = e8Var.i;
                    if (f21 != 1.0f) {
                        int alpha2 = textPaint2.getAlpha();
                        textPaint2.setAlpha((int) ((1.0f - f21) * alpha2));
                        canvas2.drawText(Integer.toString(i22), f20, AndroidUtilities.dp(5.0f) + dp5, textPaint2);
                        textPaint2.setAlpha(alpha2);
                        int alpha3 = textPaint2.getAlpha();
                        textPaint.setAlpha((int) (alpha3 * f21));
                        canvas2.drawText(Integer.toString(i22), f20, AndroidUtilities.dp(5.0f) + dp5, textPaint);
                        textPaint.setAlpha(alpha3);
                    } else {
                        canvas2.drawText(Integer.toString(i22), f20, AndroidUtilities.dp(5.0f) + dp5, textPaint);
                    }
                }
            } else {
                if (d8Var.r.get(i17) != null) {
                    float f22 = 0.0f;
                    if (g8Var2.B && !e8Var.f) {
                        e8Var.d = 0.0f;
                        f22 = 0.0f;
                        e8Var.e = Math.max(0.0f, ((d8Var.getY() + dp5) / g8Var2.b.getMeasuredHeight()) * 150.0f);
                    }
                    float f23 = e8Var.e;
                    if (f23 > f22) {
                        float f24 = f23 - 16.0f;
                        e8Var.e = f24;
                        if (f24 < f22) {
                            e8Var.e = f22;
                        } else {
                            d8Var.invalidate();
                        }
                    }
                    if (e8Var.e >= f22) {
                        float f25 = e8Var.d;
                        if (f25 != 1.0f) {
                            float f26 = f25 + 0.07272727f;
                            e8Var.d = f26;
                            if (f26 > 1.0f) {
                                f16 = 1.0f;
                                e8Var.d = 1.0f;
                            } else {
                                f16 = 1.0f;
                                d8Var.invalidate();
                            }
                            f17 = e8Var.d;
                            if (f17 != f16) {
                                canvas2.save();
                                float f27 = (0.2f * f17) + 0.8f;
                                canvas2.scale(f27, f27, f20, dp5);
                            }
                            int i24 = i17;
                            int dp7 = (int) (AndroidUtilities.dp(7.0f) * e8Var.l);
                            if (e8Var.i < 0.01f) {
                                i11 = dp7;
                                paint9.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
                                paint9.setAlpha((int) (e8Var.i * 255.0f));
                                canvas2.drawCircle(f20, dp5, AndroidUtilities.dp(44.0f) / 2.0f, paint9);
                                paint10.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.cf, false));
                                RectF rectF3 = AndroidUtilities.rectTmp;
                                rectF3.set(f20 - (AndroidUtilities.dp(44.0f) / 2.0f), dp5 - (AndroidUtilities.dp(44.0f) / 2.0f), (AndroidUtilities.dp(44.0f) / 2.0f) + f20, (AndroidUtilities.dp(44.0f) / 2.0f) + dp5);
                                canvas2 = canvas;
                                paint4 = paint9;
                                f18 = f17;
                                f12 = 1.0f;
                                f14 = dp5;
                                f11 = measuredWidth;
                                paint6 = paint10;
                                f13 = f20;
                                g8Var = g8Var2;
                                i12 = i24;
                                canvas2.drawArc(rectF3, -90.0f, e8Var.i * 360.0f, false, paint6);
                            } else {
                                i11 = dp7;
                                f18 = f17;
                                paint4 = paint9;
                                f11 = measuredWidth;
                                f12 = 1.0f;
                                f13 = f20;
                                f14 = dp5;
                                paint6 = paint10;
                                g8Var = g8Var2;
                                i12 = i24;
                            }
                            ((ImageReceiver) d8Var.r.get(i12)).setAlpha(e8Var.d);
                            paint5 = paint6;
                            ((ImageReceiver) d8Var.r.get(i12)).setImageCoords(f13 - ((AndroidUtilities.dp(44.0f) - i11) / 2.0f), f14 - ((AndroidUtilities.dp(44.0f) - i11) / 2.0f), AndroidUtilities.dp(44.0f) - i11, AndroidUtilities.dp(44.0f) - i11);
                            ((ImageReceiver) d8Var.r.get(i12)).draw(canvas2);
                            if (d8Var.n.get(i12) != null && ((e8) d8Var.n.get(i12)).a != null && ((e8) d8Var.n.get(i12)).a.hasMediaSpoilers()) {
                                float dp8 = (AndroidUtilities.dp(44.0f) - i11) / 2.0f;
                                path.rewind();
                                path.addCircle(f13, f14, dp8, Path.Direction.CW);
                                canvas2.save();
                                canvas2.clipPath(path);
                                lVar.h(i0.a.k(-1, (int) (Color.alpha(-1) * 0.325f * e8Var.d)));
                                lVar.setBounds((int) (f13 - dp8), (int) (f14 - dp8), (int) (f13 + dp8), (int) (f14 + dp8));
                                lVar.draw(canvas2);
                                d8Var.invalidate();
                                canvas2.restore();
                            }
                            paint7.setColor(i0.a.k(-16777216, (int) (e8Var.d * 80.0f)));
                            canvas2.drawCircle(f13, f14, (AndroidUtilities.dp(44.0f) - i11) / 2.0f, paint7);
                            e8Var.f = true;
                            if (f17 != f16) {
                                canvas2.restore();
                            }
                            f15 = f18;
                        }
                    }
                    f16 = 1.0f;
                    f17 = e8Var.d;
                    if (f17 != f16) {
                    }
                    int i242 = i17;
                    int dp72 = (int) (AndroidUtilities.dp(7.0f) * e8Var.l);
                    if (e8Var.i < 0.01f) {
                    }
                    ((ImageReceiver) d8Var.r.get(i12)).setAlpha(e8Var.d);
                    paint5 = paint6;
                    ((ImageReceiver) d8Var.r.get(i12)).setImageCoords(f13 - ((AndroidUtilities.dp(44.0f) - i11) / 2.0f), f14 - ((AndroidUtilities.dp(44.0f) - i11) / 2.0f), AndroidUtilities.dp(44.0f) - i11, AndroidUtilities.dp(44.0f) - i11);
                    ((ImageReceiver) d8Var.r.get(i12)).draw(canvas2);
                    if (d8Var.n.get(i12) != null) {
                        float dp82 = (AndroidUtilities.dp(44.0f) - i11) / 2.0f;
                        path.rewind();
                        path.addCircle(f13, f14, dp82, Path.Direction.CW);
                        canvas2.save();
                        canvas2.clipPath(path);
                        lVar.h(i0.a.k(-1, (int) (Color.alpha(-1) * 0.325f * e8Var.d)));
                        lVar.setBounds((int) (f13 - dp82), (int) (f14 - dp82), (int) (f13 + dp82), (int) (f14 + dp82));
                        lVar.draw(canvas2);
                        d8Var.invalidate();
                        canvas2.restore();
                    }
                    paint7.setColor(i0.a.k(-16777216, (int) (e8Var.d * 80.0f)));
                    canvas2.drawCircle(f13, f14, (AndroidUtilities.dp(44.0f) - i11) / 2.0f, paint7);
                    e8Var.f = true;
                    if (f17 != f16) {
                    }
                    f15 = f18;
                } else {
                    paint4 = paint9;
                    f11 = measuredWidth;
                    paint5 = paint10;
                    f12 = 1.0f;
                    f13 = f20;
                    f14 = dp5;
                    g8Var = g8Var2;
                    f15 = 1.0f;
                }
                if (f15 != f12) {
                    int alpha4 = textPaint2.getAlpha();
                    textPaint2.setAlpha((int) ((f12 - f15) * alpha4));
                    canvas2.drawText(Integer.toString(i22), f13, f14 + AndroidUtilities.dp(5.0f), textPaint2);
                    textPaint2.setAlpha(alpha4);
                    int alpha5 = textPaint2.getAlpha();
                    textPaint.setAlpha((int) (alpha5 * f15));
                    canvas2.drawText(Integer.toString(i22), f13, f14 + AndroidUtilities.dp(5.0f), textPaint);
                    textPaint.setAlpha(alpha5);
                } else {
                    canvas2.drawText(Integer.toString(i22), f13, f14 + AndroidUtilities.dp(5.0f), textPaint);
                }
                paint = paint7;
                paint2 = paint4;
                paint3 = paint5;
            }
            i16 = i20 + 1;
            if (i16 >= 7) {
                i18 = i19 + 1;
                i16 = 0;
            } else {
                i18 = i19;
            }
            paint9 = paint2;
            g8Var2 = g8Var;
            measuredWidth = f11;
            i17 = i22;
            paint7 = paint;
            d8Var = this;
            paint10 = paint3;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((this.f * 52) + 44), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return ((GestureDetector) this.s.b).onTouchEvent(motionEvent);
    }
}
