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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class g8 extends FrameLayout {
    public final org.telegram.ui.ActionBar.k5 a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int h;
    public SparseArray n;
    public SparseArray r;
    public final org.telegram.ui.Cells.f1 s;
    public final SparseArray v;
    public final SparseArray w;
    public final /* synthetic */ j8 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8(j8 j8Var, Context context) {
        super(context);
        this.x = j8Var;
        this.n = new SparseArray();
        this.r = new SparseArray();
        this.v = new SparseArray();
        this.w = new SparseArray();
        setWillNotDraw(false);
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.a = k5Var;
        if (j8Var.b0 == 0 && j8Var.a0) {
            k5Var.setOnLongClickListener(new w(this, 1));
            k5Var.setOnClickListener(new a8(this, 0));
        }
        k5Var.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false), 2, -1));
        k5Var.setTextSize(15);
        k5Var.setTypeface(AndroidUtilities.bold());
        k5Var.setGravity(17);
        k5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        addView(k5Var, k7.b6.d(-1, 28.0f, 0, 0.0f, 12.0f, 0.0f, 4.0f));
        org.telegram.ui.Cells.f1 f1Var = new org.telegram.ui.Cells.f1(context, new e8(this, context));
        this.s = f1Var;
        ((GestureDetector) f1Var.b).setIsLongpressEnabled(j8Var.b0 == 0);
    }

    public static void a(g8 g8Var, int i10, int i11) {
        if (g8Var.n != null) {
            for (int i12 = 0; i12 < g8Var.d; i12++) {
                h8 h8Var = (h8) g8Var.n.get(i12, null);
                if (h8Var != null) {
                    h8Var.m = h8Var.l;
                    int i13 = h8Var.h;
                    h8Var.n = (i13 < i10 || i13 > i11) ? 0.0f : 1.0f;
                    h8Var.j = h8Var.i;
                    if (i13 == i10 || i13 == i11) {
                        h8Var.k = 1.0f;
                    } else {
                        h8Var.k = 0.0f;
                    }
                }
            }
        }
    }

    public static void b(g8 g8Var, float f10) {
        if (g8Var.n != null) {
            for (int i10 = 0; i10 < g8Var.d; i10++) {
                h8 h8Var = (h8) g8Var.n.get(i10, null);
                if (h8Var != null) {
                    float f11 = h8Var.m;
                    h8Var.l = e2.c.w(h8Var.n, f11, f10, f11);
                    float f12 = h8Var.j;
                    h8Var.i = e2.c.w(h8Var.k, f12, f10, f12);
                }
            }
        }
        g8Var.invalidate();
    }

    public final void c(int i10, int i11, int i12, boolean z4, boolean z10) {
        float f10;
        float f11;
        final float f12;
        SparseArray sparseArray = this.v;
        ValueAnimator valueAnimator = (ValueAnimator) sparseArray.get(i10);
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float measuredWidth = getMeasuredWidth() / 7.0f;
        SparseArray sparseArray2 = this.w;
        i8 i8Var = (i8) sparseArray2.get(i10);
        if (i8Var != null) {
            float f13 = i8Var.a;
            f11 = i8Var.b;
            f12 = i8Var.c;
            f10 = f13;
        } else {
            f10 = (measuredWidth / 2.0f) + (i11 * measuredWidth);
            f11 = f10;
            f12 = 0.0f;
        }
        float f14 = z4 ? (measuredWidth / 2.0f) + (i11 * measuredWidth) : f10;
        final float f15 = z4 ? (measuredWidth / 2.0f) + (i12 * measuredWidth) : f11;
        float f16 = z4 ? 1.0f : 0.0f;
        final i8 i8Var2 = new i8();
        i8Var2.a = f10;
        i8Var2.b = f11;
        sparseArray2.put(i10, i8Var2);
        if (!z10) {
            i8Var2.a = f14;
            i8Var2.b = f15;
            i8Var2.c = f16;
            invalidate();
            return;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        duration.setInterpolator(org.telegram.ui.Components.gt.e);
        final float f17 = f11;
        final float f18 = f16;
        final float f19 = f10;
        final float f20 = f14;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.z7
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                g8 g8Var = g8.this;
                g8Var.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float f21 = f20;
                float f22 = f19;
                float w10 = e2.c.w(f21, f22, floatValue, f22);
                i8 i8Var3 = i8Var2;
                i8Var3.a = w10;
                float f23 = f15;
                float f24 = f17;
                i8Var3.b = e2.c.w(f23, f24, floatValue, f24);
                float f25 = f18;
                float f26 = f12;
                i8Var3.c = e2.c.w(f25, f26, floatValue, f26);
                g8Var.invalidate();
            }
        });
        duration.addListener(new f8(this, i8Var2, f20, f15, f18, i10, z4));
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
        float f10;
        Paint paint;
        Paint paint2;
        float f11;
        Paint paint3;
        j8 j8Var;
        int i11;
        Paint paint4;
        Paint paint5;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        int i12;
        float f18;
        Paint paint6;
        int i13;
        int i14;
        g8 g8Var = this;
        Canvas canvas2 = canvas;
        j8 j8Var2 = g8Var.x;
        Paint paint7 = j8Var2.w;
        ih.k kVar = j8Var2.h0;
        Path path = j8Var2.g0;
        Paint paint8 = j8Var2.r;
        TextPaint textPaint = j8Var2.e;
        Paint paint9 = j8Var2.s;
        TextPaint textPaint2 = j8Var2.d;
        super.onDraw(canvas);
        int i15 = g8Var.e;
        float measuredWidth = g8Var.getMeasuredWidth() / 7.0f;
        float dp = AndroidUtilities.dp(52.0f);
        int dp2 = AndroidUtilities.dp(44.0f);
        Paint paint10 = paint8;
        int i16 = 0;
        while (true) {
            i10 = i15;
            f10 = dp;
            if (i16 >= Math.ceil((g8Var.e + g8Var.d) / 7.0f)) {
                break;
            }
            float dp3 = (f10 / 2.0f) + (i16 * f10) + AndroidUtilities.dp(44.0f);
            i8 i8Var = (i8) g8Var.w.get(i16);
            if (i8Var != null) {
                paint9.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.cf, false));
                paint9.setAlpha((int) (i8Var.c * 40.8f));
                RectF rectF = AndroidUtilities.rectTmp;
                float f19 = dp2 / 2.0f;
                i14 = dp2;
                rectF.set(i8Var.a - f19, dp3 - f19, i8Var.b + f19, dp3 + f19);
                float dp4 = AndroidUtilities.dp(32.0f);
                canvas2.drawRoundRect(rectF, dp4, dp4, paint9);
            } else {
                i14 = dp2;
            }
            i16++;
            i15 = i10;
            dp = f10;
            dp2 = i14;
        }
        int i17 = i10;
        int i18 = 0;
        int i19 = 0;
        while (i18 < g8Var.d) {
            float f20 = (i17 * measuredWidth) + (measuredWidth / 2.0f);
            float dp5 = (f10 / 2.0f) + (i19 * f10) + AndroidUtilities.dp(44.0f);
            int i20 = i19;
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            SparseArray sparseArray = g8Var.n;
            int i21 = i17;
            h8 h8Var = sparseArray != null ? (h8) sparseArray.get(i18, null) : null;
            int i22 = g8Var.h;
            int i23 = i18 + 1;
            if (currentTimeMillis < (i23 * 86400) + i22 || ((i11 = j8Var2.Z) > 0 && i11 > ((i18 + 2) * 86400) + i22)) {
                paint = paint7;
                paint2 = paint9;
                f11 = measuredWidth;
                paint3 = paint10;
                j8Var = j8Var2;
                int alpha = textPaint2.getAlpha();
                textPaint2.setAlpha((int) (alpha * 0.3f));
                canvas2.drawText(Integer.toString(i23), f20, AndroidUtilities.dp(5.0f) + dp5, textPaint2);
                textPaint2.setAlpha(alpha);
            } else if (h8Var == null || !h8Var.g) {
                Paint paint11 = paint9;
                f11 = measuredWidth;
                Paint paint12 = paint10;
                j8Var = j8Var2;
                if (h8Var == null || h8Var.i < 0.01f) {
                    paint = paint7;
                    paint2 = paint11;
                    paint3 = paint12;
                    canvas2.drawText(Integer.toString(i23), f20, AndroidUtilities.dp(5.0f) + dp5, textPaint2);
                } else {
                    paint11.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                    paint11.setAlpha((int) (h8Var.i * 255.0f));
                    canvas2.drawCircle(f20, dp5, AndroidUtilities.dp(44.0f) / 2.0f, paint11);
                    int i24 = org.telegram.ui.ActionBar.j6.cf;
                    paint3 = paint12;
                    paint3.setColor(org.telegram.ui.ActionBar.j6.w0(null, i24, false));
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(f20 - (AndroidUtilities.dp(44.0f) / 2.0f), dp5 - (AndroidUtilities.dp(44.0f) / 2.0f), (AndroidUtilities.dp(44.0f) / 2.0f) + f20, (AndroidUtilities.dp(44.0f) / 2.0f) + dp5);
                    paint2 = paint11;
                    paint = paint7;
                    canvas2 = canvas;
                    canvas2.drawArc(rectF2, -90.0f, h8Var.i * 360.0f, false, paint3);
                    int dp6 = (int) (AndroidUtilities.dp(7.0f) * h8Var.i);
                    paint2.setColor(org.telegram.ui.ActionBar.j6.w0(null, i24, false));
                    paint2.setAlpha((int) (h8Var.i * 255.0f));
                    canvas2.drawCircle(f20, dp5, (AndroidUtilities.dp(44.0f) - dp6) / 2.0f, paint2);
                    float f21 = h8Var.i;
                    if (f21 != 1.0f) {
                        int alpha2 = textPaint2.getAlpha();
                        textPaint2.setAlpha((int) ((1.0f - f21) * alpha2));
                        canvas2.drawText(Integer.toString(i23), f20, AndroidUtilities.dp(5.0f) + dp5, textPaint2);
                        textPaint2.setAlpha(alpha2);
                        int alpha3 = textPaint2.getAlpha();
                        textPaint.setAlpha((int) (alpha3 * f21));
                        canvas2.drawText(Integer.toString(i23), f20, AndroidUtilities.dp(5.0f) + dp5, textPaint);
                        textPaint.setAlpha(alpha3);
                    } else {
                        canvas2.drawText(Integer.toString(i23), f20, AndroidUtilities.dp(5.0f) + dp5, textPaint);
                    }
                }
            } else {
                if (g8Var.r.get(i18) != null) {
                    float f22 = 0.0f;
                    if (j8Var2.C && !h8Var.f) {
                        h8Var.d = 0.0f;
                        f22 = 0.0f;
                        h8Var.e = Math.max(0.0f, ((g8Var.getY() + dp5) / j8Var2.b.getMeasuredHeight()) * 150.0f);
                    }
                    float f23 = h8Var.e;
                    if (f23 > f22) {
                        float f24 = f23 - 16.0f;
                        h8Var.e = f24;
                        if (f24 < f22) {
                            h8Var.e = f22;
                        } else {
                            g8Var.invalidate();
                        }
                    }
                    if (h8Var.e >= f22) {
                        float f25 = h8Var.d;
                        if (f25 != 1.0f) {
                            float f26 = f25 + 0.07272727f;
                            h8Var.d = f26;
                            if (f26 > 1.0f) {
                                f16 = 1.0f;
                                h8Var.d = 1.0f;
                            } else {
                                f16 = 1.0f;
                                g8Var.invalidate();
                            }
                            f17 = h8Var.d;
                            if (f17 != f16) {
                                canvas2.save();
                                float f27 = (0.2f * f17) + 0.8f;
                                canvas2.scale(f27, f27, f20, dp5);
                            }
                            int i25 = i18;
                            int dp7 = (int) (AndroidUtilities.dp(7.0f) * h8Var.l);
                            if (h8Var.i < 0.01f) {
                                i12 = dp7;
                                paint9.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                                paint9.setAlpha((int) (h8Var.i * 255.0f));
                                canvas2.drawCircle(f20, dp5, AndroidUtilities.dp(44.0f) / 2.0f, paint9);
                                paint10.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.cf, false));
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
                                j8Var = j8Var2;
                                i13 = i25;
                                canvas2.drawArc(rectF3, -90.0f, h8Var.i * 360.0f, false, paint6);
                            } else {
                                i12 = dp7;
                                f18 = f17;
                                paint4 = paint9;
                                f11 = measuredWidth;
                                f12 = 1.0f;
                                f13 = f20;
                                f14 = dp5;
                                paint6 = paint10;
                                j8Var = j8Var2;
                                i13 = i25;
                            }
                            ((ImageReceiver) g8Var.r.get(i13)).setAlpha(h8Var.d);
                            paint5 = paint6;
                            ((ImageReceiver) g8Var.r.get(i13)).setImageCoords(f13 - ((AndroidUtilities.dp(44.0f) - i12) / 2.0f), f14 - ((AndroidUtilities.dp(44.0f) - i12) / 2.0f), AndroidUtilities.dp(44.0f) - i12, AndroidUtilities.dp(44.0f) - i12);
                            ((ImageReceiver) g8Var.r.get(i13)).draw(canvas2);
                            if (g8Var.n.get(i13) != null && ((h8) g8Var.n.get(i13)).a != null && ((h8) g8Var.n.get(i13)).a.hasMediaSpoilers()) {
                                float dp8 = (AndroidUtilities.dp(44.0f) - i12) / 2.0f;
                                path.rewind();
                                path.addCircle(f13, f14, dp8, Path.Direction.CW);
                                canvas2.save();
                                canvas2.clipPath(path);
                                kVar.h(i0.a.k(-1, (int) (Color.alpha(-1) * 0.325f * h8Var.d)));
                                kVar.setBounds((int) (f13 - dp8), (int) (f14 - dp8), (int) (f13 + dp8), (int) (f14 + dp8));
                                kVar.draw(canvas2);
                                g8Var.invalidate();
                                canvas2.restore();
                            }
                            paint7.setColor(i0.a.k(-16777216, (int) (h8Var.d * 80.0f)));
                            canvas2.drawCircle(f13, f14, (AndroidUtilities.dp(44.0f) - i12) / 2.0f, paint7);
                            h8Var.f = true;
                            if (f17 != f16) {
                                canvas2.restore();
                            }
                            f15 = f18;
                        }
                    }
                    f16 = 1.0f;
                    f17 = h8Var.d;
                    if (f17 != f16) {
                    }
                    int i252 = i18;
                    int dp72 = (int) (AndroidUtilities.dp(7.0f) * h8Var.l);
                    if (h8Var.i < 0.01f) {
                    }
                    ((ImageReceiver) g8Var.r.get(i13)).setAlpha(h8Var.d);
                    paint5 = paint6;
                    ((ImageReceiver) g8Var.r.get(i13)).setImageCoords(f13 - ((AndroidUtilities.dp(44.0f) - i12) / 2.0f), f14 - ((AndroidUtilities.dp(44.0f) - i12) / 2.0f), AndroidUtilities.dp(44.0f) - i12, AndroidUtilities.dp(44.0f) - i12);
                    ((ImageReceiver) g8Var.r.get(i13)).draw(canvas2);
                    if (g8Var.n.get(i13) != null) {
                        float dp82 = (AndroidUtilities.dp(44.0f) - i12) / 2.0f;
                        path.rewind();
                        path.addCircle(f13, f14, dp82, Path.Direction.CW);
                        canvas2.save();
                        canvas2.clipPath(path);
                        kVar.h(i0.a.k(-1, (int) (Color.alpha(-1) * 0.325f * h8Var.d)));
                        kVar.setBounds((int) (f13 - dp82), (int) (f14 - dp82), (int) (f13 + dp82), (int) (f14 + dp82));
                        kVar.draw(canvas2);
                        g8Var.invalidate();
                        canvas2.restore();
                    }
                    paint7.setColor(i0.a.k(-16777216, (int) (h8Var.d * 80.0f)));
                    canvas2.drawCircle(f13, f14, (AndroidUtilities.dp(44.0f) - i12) / 2.0f, paint7);
                    h8Var.f = true;
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
                    j8Var = j8Var2;
                    f15 = 1.0f;
                }
                if (f15 != f12) {
                    int alpha4 = textPaint2.getAlpha();
                    textPaint2.setAlpha((int) ((f12 - f15) * alpha4));
                    canvas2.drawText(Integer.toString(i23), f13, f14 + AndroidUtilities.dp(5.0f), textPaint2);
                    textPaint2.setAlpha(alpha4);
                    int alpha5 = textPaint2.getAlpha();
                    textPaint.setAlpha((int) (alpha5 * f15));
                    canvas2.drawText(Integer.toString(i23), f13, f14 + AndroidUtilities.dp(5.0f), textPaint);
                    textPaint.setAlpha(alpha5);
                } else {
                    canvas2.drawText(Integer.toString(i23), f13, f14 + AndroidUtilities.dp(5.0f), textPaint);
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
            j8Var2 = j8Var;
            measuredWidth = f11;
            i18 = i23;
            paint7 = paint;
            g8Var = this;
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
