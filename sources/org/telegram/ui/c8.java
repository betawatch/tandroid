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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class c8 extends FrameLayout {
    public final org.telegram.ui.ActionBar.h5 a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int h;
    public SparseArray n;
    public SparseArray r;
    public final o4.g s;
    public final SparseArray v;
    public final SparseArray w;
    public final /* synthetic */ f8 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8(f8 f8Var, Context context) {
        super(context);
        this.x = f8Var;
        this.n = new SparseArray();
        this.r = new SparseArray();
        this.v = new SparseArray();
        this.w = new SparseArray();
        setWillNotDraw(false);
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.a = h5Var;
        if (f8Var.a0 == 0 && f8Var.Z) {
            h5Var.setOnLongClickListener(new w(this, 1));
            h5Var.setOnClickListener(new w7(this, 0));
        }
        h5Var.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.i6, false), 2, -1));
        h5Var.setTextSize(15);
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setGravity(17);
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        addView(h5Var, i7.f6.d(-1, 28.0f, 0, 0.0f, 12.0f, 0.0f, 4.0f));
        o4.g gVar = new o4.g(context, new a8(this, context));
        this.s = gVar;
        ((GestureDetector) gVar.b).setIsLongpressEnabled(f8Var.a0 == 0);
    }

    public static void a(c8 c8Var, int i10, int i11) {
        if (c8Var.n != null) {
            for (int i12 = 0; i12 < c8Var.d; i12++) {
                d8 d8Var = (d8) c8Var.n.get(i12, null);
                if (d8Var != null) {
                    d8Var.m = d8Var.l;
                    int i13 = d8Var.h;
                    d8Var.n = (i13 < i10 || i13 > i11) ? 0.0f : 1.0f;
                    d8Var.j = d8Var.i;
                    if (i13 == i10 || i13 == i11) {
                        d8Var.k = 1.0f;
                    } else {
                        d8Var.k = 0.0f;
                    }
                }
            }
        }
    }

    public static void b(c8 c8Var, float f9) {
        if (c8Var.n != null) {
            for (int i10 = 0; i10 < c8Var.d; i10++) {
                d8 d8Var = (d8) c8Var.n.get(i10, null);
                if (d8Var != null) {
                    float f10 = d8Var.m;
                    d8Var.l = com.google.android.recaptcha.internal.a.z(d8Var.n, f10, f9, f10);
                    float f11 = d8Var.j;
                    d8Var.i = com.google.android.recaptcha.internal.a.z(d8Var.k, f11, f9, f11);
                }
            }
        }
        c8Var.invalidate();
    }

    public final void c(int i10, int i11, int i12, boolean z10, boolean z11) {
        float f9;
        float f10;
        final float f11;
        SparseArray sparseArray = this.v;
        ValueAnimator valueAnimator = (ValueAnimator) sparseArray.get(i10);
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float measuredWidth = getMeasuredWidth() / 7.0f;
        SparseArray sparseArray2 = this.w;
        e8 e8Var = (e8) sparseArray2.get(i10);
        if (e8Var != null) {
            float f12 = e8Var.a;
            f10 = e8Var.b;
            f11 = e8Var.c;
            f9 = f12;
        } else {
            f9 = (measuredWidth / 2.0f) + (i11 * measuredWidth);
            f10 = f9;
            f11 = 0.0f;
        }
        float f13 = z10 ? (measuredWidth / 2.0f) + (i11 * measuredWidth) : f9;
        final float f14 = z10 ? (measuredWidth / 2.0f) + (i12 * measuredWidth) : f10;
        float f15 = z10 ? 1.0f : 0.0f;
        final e8 e8Var2 = new e8();
        e8Var2.a = f9;
        e8Var2.b = f10;
        sparseArray2.put(i10, e8Var2);
        if (!z11) {
            e8Var2.a = f13;
            e8Var2.b = f14;
            e8Var2.c = f15;
            invalidate();
            return;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        duration.setInterpolator(org.telegram.ui.Components.ct.e);
        final float f16 = f10;
        final float f17 = f15;
        final float f18 = f9;
        final float f19 = f13;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.v7
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                c8 c8Var = c8.this;
                c8Var.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float f20 = f19;
                float f21 = f18;
                float z12 = com.google.android.recaptcha.internal.a.z(f20, f21, floatValue, f21);
                e8 e8Var3 = e8Var2;
                e8Var3.a = z12;
                float f22 = f14;
                float f23 = f16;
                e8Var3.b = com.google.android.recaptcha.internal.a.z(f22, f23, floatValue, f23);
                float f24 = f17;
                float f25 = f11;
                e8Var3.c = com.google.android.recaptcha.internal.a.z(f24, f25, floatValue, f25);
                c8Var.invalidate();
            }
        });
        duration.addListener(new b8(this, e8Var2, f19, f14, f17, i10, z10));
        duration.start();
        sparseArray.put(i10, duration);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.r != null) {
            for (int i10 = 0; i10 < this.r.size(); i10++) {
                ((ImageReceiver) this.r.valueAt(i10)).onAttachedToWindow();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.r != null) {
            for (int i10 = 0; i10 < this.r.size(); i10++) {
                ((ImageReceiver) this.r.valueAt(i10)).onDetachedFromWindow();
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
        int i10;
        float f9;
        Paint paint;
        Paint paint2;
        float f10;
        Paint paint3;
        f8 f8Var;
        int i11;
        Paint paint4;
        Paint paint5;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        int i12;
        float f17;
        Paint paint6;
        int i13;
        int i14;
        c8 c8Var = this;
        Canvas canvas2 = canvas;
        f8 f8Var2 = c8Var.x;
        Paint paint7 = f8Var2.w;
        gh.k kVar = f8Var2.g0;
        Path path = f8Var2.f0;
        Paint paint8 = f8Var2.r;
        TextPaint textPaint = f8Var2.e;
        Paint paint9 = f8Var2.s;
        TextPaint textPaint2 = f8Var2.d;
        super.onDraw(canvas);
        int i15 = c8Var.e;
        float measuredWidth = c8Var.getMeasuredWidth() / 7.0f;
        float dp = AndroidUtilities.dp(52.0f);
        int dp2 = AndroidUtilities.dp(44.0f);
        Paint paint10 = paint8;
        int i16 = 0;
        while (true) {
            i10 = i15;
            f9 = dp;
            if (i16 >= Math.ceil((c8Var.e + c8Var.d) / 7.0f)) {
                break;
            }
            float dp3 = (f9 / 2.0f) + (i16 * f9) + AndroidUtilities.dp(44.0f);
            e8 e8Var = (e8) c8Var.w.get(i16);
            if (e8Var != null) {
                paint9.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.cf, false));
                paint9.setAlpha((int) (e8Var.c * 40.8f));
                RectF rectF = AndroidUtilities.rectTmp;
                float f18 = dp2 / 2.0f;
                i14 = dp2;
                rectF.set(e8Var.a - f18, dp3 - f18, e8Var.b + f18, dp3 + f18);
                float dp4 = AndroidUtilities.dp(32.0f);
                canvas2.drawRoundRect(rectF, dp4, dp4, paint9);
            } else {
                i14 = dp2;
            }
            i16++;
            i15 = i10;
            dp = f9;
            dp2 = i14;
        }
        int i17 = i10;
        int i18 = 0;
        int i19 = 0;
        while (i18 < c8Var.d) {
            float f19 = (i17 * measuredWidth) + (measuredWidth / 2.0f);
            float dp5 = (f9 / 2.0f) + (i19 * f9) + AndroidUtilities.dp(44.0f);
            int i20 = i19;
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            SparseArray sparseArray = c8Var.n;
            int i21 = i17;
            d8 d8Var = sparseArray != null ? (d8) sparseArray.get(i18, null) : null;
            int i22 = c8Var.h;
            int i23 = i18 + 1;
            if (currentTimeMillis < (i23 * 86400) + i22 || ((i11 = f8Var2.Y) > 0 && i11 > ((i18 + 2) * 86400) + i22)) {
                paint = paint7;
                paint2 = paint9;
                f10 = measuredWidth;
                paint3 = paint10;
                f8Var = f8Var2;
                int alpha = textPaint2.getAlpha();
                textPaint2.setAlpha((int) (alpha * 0.3f));
                canvas2.drawText(Integer.toString(i23), f19, AndroidUtilities.dp(5.0f) + dp5, textPaint2);
                textPaint2.setAlpha(alpha);
            } else if (d8Var == null || !d8Var.g) {
                Paint paint11 = paint9;
                f10 = measuredWidth;
                Paint paint12 = paint10;
                f8Var = f8Var2;
                if (d8Var == null || d8Var.i < 0.01f) {
                    paint = paint7;
                    paint2 = paint11;
                    paint3 = paint12;
                    canvas2.drawText(Integer.toString(i23), f19, AndroidUtilities.dp(5.0f) + dp5, textPaint2);
                } else {
                    paint11.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
                    paint11.setAlpha((int) (d8Var.i * 255.0f));
                    canvas2.drawCircle(f19, dp5, AndroidUtilities.dp(44.0f) / 2.0f, paint11);
                    int i24 = org.telegram.ui.ActionBar.g6.cf;
                    paint3 = paint12;
                    paint3.setColor(org.telegram.ui.ActionBar.g6.w0(null, i24, false));
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(f19 - (AndroidUtilities.dp(44.0f) / 2.0f), dp5 - (AndroidUtilities.dp(44.0f) / 2.0f), (AndroidUtilities.dp(44.0f) / 2.0f) + f19, (AndroidUtilities.dp(44.0f) / 2.0f) + dp5);
                    paint2 = paint11;
                    paint = paint7;
                    canvas2 = canvas;
                    canvas2.drawArc(rectF2, -90.0f, d8Var.i * 360.0f, false, paint3);
                    int dp6 = (int) (AndroidUtilities.dp(7.0f) * d8Var.i);
                    paint2.setColor(org.telegram.ui.ActionBar.g6.w0(null, i24, false));
                    paint2.setAlpha((int) (d8Var.i * 255.0f));
                    canvas2.drawCircle(f19, dp5, (AndroidUtilities.dp(44.0f) - dp6) / 2.0f, paint2);
                    float f20 = d8Var.i;
                    if (f20 != 1.0f) {
                        int alpha2 = textPaint2.getAlpha();
                        textPaint2.setAlpha((int) ((1.0f - f20) * alpha2));
                        canvas2.drawText(Integer.toString(i23), f19, AndroidUtilities.dp(5.0f) + dp5, textPaint2);
                        textPaint2.setAlpha(alpha2);
                        int alpha3 = textPaint2.getAlpha();
                        textPaint.setAlpha((int) (alpha3 * f20));
                        canvas2.drawText(Integer.toString(i23), f19, AndroidUtilities.dp(5.0f) + dp5, textPaint);
                        textPaint.setAlpha(alpha3);
                    } else {
                        canvas2.drawText(Integer.toString(i23), f19, AndroidUtilities.dp(5.0f) + dp5, textPaint);
                    }
                }
            } else {
                if (c8Var.r.get(i18) != null) {
                    float f21 = 0.0f;
                    if (f8Var2.B && !d8Var.f) {
                        d8Var.d = 0.0f;
                        f21 = 0.0f;
                        d8Var.e = Math.max(0.0f, ((c8Var.getY() + dp5) / f8Var2.b.getMeasuredHeight()) * 150.0f);
                    }
                    float f22 = d8Var.e;
                    if (f22 > f21) {
                        float f23 = f22 - 16.0f;
                        d8Var.e = f23;
                        if (f23 < f21) {
                            d8Var.e = f21;
                        } else {
                            c8Var.invalidate();
                        }
                    }
                    if (d8Var.e >= f21) {
                        float f24 = d8Var.d;
                        if (f24 != 1.0f) {
                            float f25 = f24 + 0.07272727f;
                            d8Var.d = f25;
                            if (f25 > 1.0f) {
                                f15 = 1.0f;
                                d8Var.d = 1.0f;
                            } else {
                                f15 = 1.0f;
                                c8Var.invalidate();
                            }
                            f16 = d8Var.d;
                            if (f16 != f15) {
                                canvas2.save();
                                float f26 = (0.2f * f16) + 0.8f;
                                canvas2.scale(f26, f26, f19, dp5);
                            }
                            int i25 = i18;
                            int dp7 = (int) (AndroidUtilities.dp(7.0f) * d8Var.l);
                            if (d8Var.i < 0.01f) {
                                i12 = dp7;
                                paint9.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
                                paint9.setAlpha((int) (d8Var.i * 255.0f));
                                canvas2.drawCircle(f19, dp5, AndroidUtilities.dp(44.0f) / 2.0f, paint9);
                                paint10.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.cf, false));
                                RectF rectF3 = AndroidUtilities.rectTmp;
                                rectF3.set(f19 - (AndroidUtilities.dp(44.0f) / 2.0f), dp5 - (AndroidUtilities.dp(44.0f) / 2.0f), (AndroidUtilities.dp(44.0f) / 2.0f) + f19, (AndroidUtilities.dp(44.0f) / 2.0f) + dp5);
                                canvas2 = canvas;
                                paint4 = paint9;
                                f17 = f16;
                                f11 = 1.0f;
                                f13 = dp5;
                                f10 = measuredWidth;
                                paint6 = paint10;
                                f12 = f19;
                                f8Var = f8Var2;
                                i13 = i25;
                                canvas2.drawArc(rectF3, -90.0f, d8Var.i * 360.0f, false, paint6);
                            } else {
                                i12 = dp7;
                                f17 = f16;
                                paint4 = paint9;
                                f10 = measuredWidth;
                                f11 = 1.0f;
                                f12 = f19;
                                f13 = dp5;
                                paint6 = paint10;
                                f8Var = f8Var2;
                                i13 = i25;
                            }
                            ((ImageReceiver) c8Var.r.get(i13)).setAlpha(d8Var.d);
                            paint5 = paint6;
                            ((ImageReceiver) c8Var.r.get(i13)).setImageCoords(f12 - ((AndroidUtilities.dp(44.0f) - i12) / 2.0f), f13 - ((AndroidUtilities.dp(44.0f) - i12) / 2.0f), AndroidUtilities.dp(44.0f) - i12, AndroidUtilities.dp(44.0f) - i12);
                            ((ImageReceiver) c8Var.r.get(i13)).draw(canvas2);
                            if (c8Var.n.get(i13) != null && ((d8) c8Var.n.get(i13)).a != null && ((d8) c8Var.n.get(i13)).a.hasMediaSpoilers()) {
                                float dp8 = (AndroidUtilities.dp(44.0f) - i12) / 2.0f;
                                path.rewind();
                                path.addCircle(f12, f13, dp8, Path.Direction.CW);
                                canvas2.save();
                                canvas2.clipPath(path);
                                kVar.h(i0.a.k(-1, (int) (Color.alpha(-1) * 0.325f * d8Var.d)));
                                kVar.setBounds((int) (f12 - dp8), (int) (f13 - dp8), (int) (f12 + dp8), (int) (f13 + dp8));
                                kVar.draw(canvas2);
                                c8Var.invalidate();
                                canvas2.restore();
                            }
                            paint7.setColor(i0.a.k(-16777216, (int) (d8Var.d * 80.0f)));
                            canvas2.drawCircle(f12, f13, (AndroidUtilities.dp(44.0f) - i12) / 2.0f, paint7);
                            d8Var.f = true;
                            if (f16 != f15) {
                                canvas2.restore();
                            }
                            f14 = f17;
                        }
                    }
                    f15 = 1.0f;
                    f16 = d8Var.d;
                    if (f16 != f15) {
                    }
                    int i252 = i18;
                    int dp72 = (int) (AndroidUtilities.dp(7.0f) * d8Var.l);
                    if (d8Var.i < 0.01f) {
                    }
                    ((ImageReceiver) c8Var.r.get(i13)).setAlpha(d8Var.d);
                    paint5 = paint6;
                    ((ImageReceiver) c8Var.r.get(i13)).setImageCoords(f12 - ((AndroidUtilities.dp(44.0f) - i12) / 2.0f), f13 - ((AndroidUtilities.dp(44.0f) - i12) / 2.0f), AndroidUtilities.dp(44.0f) - i12, AndroidUtilities.dp(44.0f) - i12);
                    ((ImageReceiver) c8Var.r.get(i13)).draw(canvas2);
                    if (c8Var.n.get(i13) != null) {
                        float dp82 = (AndroidUtilities.dp(44.0f) - i12) / 2.0f;
                        path.rewind();
                        path.addCircle(f12, f13, dp82, Path.Direction.CW);
                        canvas2.save();
                        canvas2.clipPath(path);
                        kVar.h(i0.a.k(-1, (int) (Color.alpha(-1) * 0.325f * d8Var.d)));
                        kVar.setBounds((int) (f12 - dp82), (int) (f13 - dp82), (int) (f12 + dp82), (int) (f13 + dp82));
                        kVar.draw(canvas2);
                        c8Var.invalidate();
                        canvas2.restore();
                    }
                    paint7.setColor(i0.a.k(-16777216, (int) (d8Var.d * 80.0f)));
                    canvas2.drawCircle(f12, f13, (AndroidUtilities.dp(44.0f) - i12) / 2.0f, paint7);
                    d8Var.f = true;
                    if (f16 != f15) {
                    }
                    f14 = f17;
                } else {
                    paint4 = paint9;
                    f10 = measuredWidth;
                    paint5 = paint10;
                    f11 = 1.0f;
                    f12 = f19;
                    f13 = dp5;
                    f8Var = f8Var2;
                    f14 = 1.0f;
                }
                if (f14 != f11) {
                    int alpha4 = textPaint2.getAlpha();
                    textPaint2.setAlpha((int) ((f11 - f14) * alpha4));
                    canvas2.drawText(Integer.toString(i23), f12, f13 + AndroidUtilities.dp(5.0f), textPaint2);
                    textPaint2.setAlpha(alpha4);
                    int alpha5 = textPaint2.getAlpha();
                    textPaint.setAlpha((int) (alpha5 * f14));
                    canvas2.drawText(Integer.toString(i23), f12, f13 + AndroidUtilities.dp(5.0f), textPaint);
                    textPaint.setAlpha(alpha5);
                } else {
                    canvas2.drawText(Integer.toString(i23), f12, f13 + AndroidUtilities.dp(5.0f), textPaint);
                }
                paint = paint7;
                paint2 = paint4;
                paint3 = paint5;
            }
            i17 = i21 + 1;
            if (i17 >= 7) {
                i19 = i20 + 1;
                i17 = 0;
            } else {
                i19 = i20;
            }
            paint9 = paint2;
            f8Var2 = f8Var;
            measuredWidth = f10;
            i18 = i23;
            paint7 = paint;
            c8Var = this;
            paint10 = paint3;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((this.f * 52) + 44), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return ((GestureDetector) this.s.b).onTouchEvent(motionEvent);
    }
}
