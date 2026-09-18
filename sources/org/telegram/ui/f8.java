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

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class f8 extends FrameLayout {
    public final org.telegram.ui.ActionBar.j5 a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int h;
    public SparseArray n;
    public SparseArray r;
    public final n2.e s;
    public final SparseArray v;
    public final SparseArray w;
    public final /* synthetic */ i8 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f8(i8 i8Var, Context context) {
        super(context);
        this.x = i8Var;
        this.n = new SparseArray();
        this.r = new SparseArray();
        this.v = new SparseArray();
        this.w = new SparseArray();
        setWillNotDraw(false);
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.a = j5Var;
        if (i8Var.e0 == 0 && i8Var.d0) {
            j5Var.setOnLongClickListener(new u(this, 1));
            j5Var.setOnClickListener(new z7(this, 0));
        }
        j5Var.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false), 2, -1));
        j5Var.setTextSize(15);
        j5Var.setTypeface(AndroidUtilities.bold());
        j5Var.setGravity(17);
        j5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        addView(j5Var, w7.y5.d(-1, 28.0f, 0, 0.0f, 12.0f, 0.0f, 4.0f));
        n2.e eVar = new n2.e(context, new d8(this, context));
        this.s = eVar;
        ((GestureDetector) eVar.b).setIsLongpressEnabled(i8Var.e0 == 0);
    }

    public static void a(f8 f8Var, int i10, int i11) {
        if (f8Var.n != null) {
            for (int i12 = 0; i12 < f8Var.d; i12++) {
                g8 g8Var = (g8) f8Var.n.get(i12, null);
                if (g8Var != null) {
                    g8Var.m = g8Var.l;
                    int i13 = g8Var.h;
                    g8Var.n = (i13 < i10 || i13 > i11) ? 0.0f : 1.0f;
                    g8Var.j = g8Var.i;
                    if (i13 == i10 || i13 == i11) {
                        g8Var.k = 1.0f;
                    } else {
                        g8Var.k = 0.0f;
                    }
                }
            }
        }
    }

    public static void b(f8 f8Var, float f7) {
        if (f8Var.n != null) {
            for (int i10 = 0; i10 < f8Var.d; i10++) {
                g8 g8Var = (g8) f8Var.n.get(i10, null);
                if (g8Var != null) {
                    float f10 = g8Var.m;
                    g8Var.l = com.google.android.gms.internal.vision.e2.z(g8Var.n, f10, f7, f10);
                    float f11 = g8Var.j;
                    g8Var.i = com.google.android.gms.internal.vision.e2.z(g8Var.k, f11, f7, f11);
                }
            }
        }
        f8Var.invalidate();
    }

    public final void c(int i10, int i11, int i12, boolean z10, boolean z11) {
        float f7;
        float f10;
        final float f11;
        SparseArray sparseArray = this.v;
        ValueAnimator valueAnimator = (ValueAnimator) sparseArray.get(i10);
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float measuredWidth = getMeasuredWidth() / 7.0f;
        SparseArray sparseArray2 = this.w;
        h8 h8Var = (h8) sparseArray2.get(i10);
        if (h8Var != null) {
            float f12 = h8Var.a;
            f10 = h8Var.b;
            f11 = h8Var.c;
            f7 = f12;
        } else {
            f7 = (measuredWidth / 2.0f) + (i11 * measuredWidth);
            f10 = f7;
            f11 = 0.0f;
        }
        float f13 = z10 ? (measuredWidth / 2.0f) + (i11 * measuredWidth) : f7;
        final float f14 = z10 ? (measuredWidth / 2.0f) + (i12 * measuredWidth) : f10;
        float f15 = z10 ? 1.0f : 0.0f;
        final h8 h8Var2 = new h8();
        h8Var2.a = f7;
        h8Var2.b = f10;
        sparseArray2.put(i10, h8Var2);
        if (!z11) {
            h8Var2.a = f13;
            h8Var2.b = f14;
            h8Var2.c = f15;
            invalidate();
            return;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        duration.setInterpolator(org.telegram.ui.Components.kt.e);
        final float f16 = f10;
        final float f17 = f15;
        final float f18 = f7;
        final float f19 = f13;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.y7
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                f8 f8Var = f8.this;
                f8Var.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float f20 = f19;
                float f21 = f18;
                float z12 = com.google.android.gms.internal.vision.e2.z(f20, f21, floatValue, f21);
                h8 h8Var3 = h8Var2;
                h8Var3.a = z12;
                float f22 = f14;
                float f23 = f16;
                h8Var3.b = com.google.android.gms.internal.vision.e2.z(f22, f23, floatValue, f23);
                float f24 = f17;
                float f25 = f11;
                h8Var3.c = com.google.android.gms.internal.vision.e2.z(f24, f25, floatValue, f25);
                f8Var.invalidate();
            }
        });
        duration.addListener(new e8(this, h8Var2, f19, f14, f17, i10, z10));
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
        float f7;
        Paint paint;
        Paint paint2;
        float f10;
        Paint paint3;
        i8 i8Var;
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
        f8 f8Var = this;
        Canvas canvas2 = canvas;
        i8 i8Var2 = f8Var.x;
        Paint paint7 = i8Var2.w;
        vh.h hVar = i8Var2.k0;
        Path path = i8Var2.j0;
        Paint paint8 = i8Var2.r;
        TextPaint textPaint = i8Var2.e;
        Paint paint9 = i8Var2.s;
        TextPaint textPaint2 = i8Var2.d;
        super.onDraw(canvas);
        int i15 = f8Var.e;
        float measuredWidth = f8Var.getMeasuredWidth() / 7.0f;
        float dp = AndroidUtilities.dp(52.0f);
        int dp2 = AndroidUtilities.dp(44.0f);
        Paint paint10 = paint8;
        int i16 = 0;
        while (true) {
            i10 = i15;
            f7 = dp;
            if (i16 >= Math.ceil((f8Var.e + f8Var.d) / 7.0f)) {
                break;
            }
            float dp3 = (f7 / 2.0f) + (i16 * f7) + AndroidUtilities.dp(44.0f);
            h8 h8Var = (h8) f8Var.w.get(i16);
            if (h8Var != null) {
                paint9.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.cf, false));
                paint9.setAlpha((int) (h8Var.c * 40.8f));
                RectF rectF = AndroidUtilities.rectTmp;
                float f18 = dp2 / 2.0f;
                i14 = dp2;
                rectF.set(h8Var.a - f18, dp3 - f18, h8Var.b + f18, dp3 + f18);
                float dp4 = AndroidUtilities.dp(32.0f);
                canvas2.drawRoundRect(rectF, dp4, dp4, paint9);
            } else {
                i14 = dp2;
            }
            i16++;
            i15 = i10;
            dp = f7;
            dp2 = i14;
        }
        int i17 = i10;
        int i18 = 0;
        int i19 = 0;
        while (i18 < f8Var.d) {
            float f19 = (i17 * measuredWidth) + (measuredWidth / 2.0f);
            float dp5 = (f7 / 2.0f) + (i19 * f7) + AndroidUtilities.dp(44.0f);
            int i20 = i19;
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            SparseArray sparseArray = f8Var.n;
            int i21 = i17;
            g8 g8Var = sparseArray != null ? (g8) sparseArray.get(i18, null) : null;
            int i22 = f8Var.h;
            int i23 = i18 + 1;
            if (currentTimeMillis < (i23 * 86400) + i22 || ((i11 = i8Var2.c0) > 0 && i11 > ((i18 + 2) * 86400) + i22)) {
                paint = paint7;
                paint2 = paint9;
                f10 = measuredWidth;
                paint3 = paint10;
                i8Var = i8Var2;
                int alpha = textPaint2.getAlpha();
                textPaint2.setAlpha((int) (alpha * 0.3f));
                canvas2.drawText(Integer.toString(i23), f19, AndroidUtilities.dp(5.0f) + dp5, textPaint2);
                textPaint2.setAlpha(alpha);
            } else if (g8Var == null || !g8Var.g) {
                Paint paint11 = paint9;
                f10 = measuredWidth;
                Paint paint12 = paint10;
                i8Var = i8Var2;
                if (g8Var == null || g8Var.i < 0.01f) {
                    paint = paint7;
                    paint2 = paint11;
                    paint3 = paint12;
                    canvas2.drawText(Integer.toString(i23), f19, AndroidUtilities.dp(5.0f) + dp5, textPaint2);
                } else {
                    paint11.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                    paint11.setAlpha((int) (g8Var.i * 255.0f));
                    canvas2.drawCircle(f19, dp5, AndroidUtilities.dp(44.0f) / 2.0f, paint11);
                    int i24 = org.telegram.ui.ActionBar.j6.cf;
                    paint3 = paint12;
                    paint3.setColor(org.telegram.ui.ActionBar.j6.w0(null, i24, false));
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(f19 - (AndroidUtilities.dp(44.0f) / 2.0f), dp5 - (AndroidUtilities.dp(44.0f) / 2.0f), (AndroidUtilities.dp(44.0f) / 2.0f) + f19, (AndroidUtilities.dp(44.0f) / 2.0f) + dp5);
                    paint2 = paint11;
                    paint = paint7;
                    canvas2 = canvas;
                    canvas2.drawArc(rectF2, -90.0f, g8Var.i * 360.0f, false, paint3);
                    int dp6 = (int) (AndroidUtilities.dp(7.0f) * g8Var.i);
                    paint2.setColor(org.telegram.ui.ActionBar.j6.w0(null, i24, false));
                    paint2.setAlpha((int) (g8Var.i * 255.0f));
                    canvas2.drawCircle(f19, dp5, (AndroidUtilities.dp(44.0f) - dp6) / 2.0f, paint2);
                    float f20 = g8Var.i;
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
                if (f8Var.r.get(i18) != null) {
                    float f21 = 0.0f;
                    if (i8Var2.F && !g8Var.f) {
                        g8Var.d = 0.0f;
                        f21 = 0.0f;
                        g8Var.e = Math.max(0.0f, ((f8Var.getY() + dp5) / i8Var2.b.getMeasuredHeight()) * 150.0f);
                    }
                    float f22 = g8Var.e;
                    if (f22 > f21) {
                        float f23 = f22 - 16.0f;
                        g8Var.e = f23;
                        if (f23 < f21) {
                            g8Var.e = f21;
                        } else {
                            f8Var.invalidate();
                        }
                    }
                    if (g8Var.e >= f21) {
                        float f24 = g8Var.d;
                        if (f24 != 1.0f) {
                            float f25 = f24 + 0.07272727f;
                            g8Var.d = f25;
                            if (f25 > 1.0f) {
                                f15 = 1.0f;
                                g8Var.d = 1.0f;
                            } else {
                                f15 = 1.0f;
                                f8Var.invalidate();
                            }
                            f16 = g8Var.d;
                            if (f16 != f15) {
                                canvas2.save();
                                float f26 = (0.2f * f16) + 0.8f;
                                canvas2.scale(f26, f26, f19, dp5);
                            }
                            int i25 = i18;
                            int dp7 = (int) (AndroidUtilities.dp(7.0f) * g8Var.l);
                            if (g8Var.i < 0.01f) {
                                i12 = dp7;
                                paint9.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                                paint9.setAlpha((int) (g8Var.i * 255.0f));
                                canvas2.drawCircle(f19, dp5, AndroidUtilities.dp(44.0f) / 2.0f, paint9);
                                paint10.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.cf, false));
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
                                i8Var = i8Var2;
                                i13 = i25;
                                canvas2.drawArc(rectF3, -90.0f, g8Var.i * 360.0f, false, paint6);
                            } else {
                                i12 = dp7;
                                f17 = f16;
                                paint4 = paint9;
                                f10 = measuredWidth;
                                f11 = 1.0f;
                                f12 = f19;
                                f13 = dp5;
                                paint6 = paint10;
                                i8Var = i8Var2;
                                i13 = i25;
                            }
                            ((ImageReceiver) f8Var.r.get(i13)).setAlpha(g8Var.d);
                            paint5 = paint6;
                            ((ImageReceiver) f8Var.r.get(i13)).setImageCoords(f12 - ((AndroidUtilities.dp(44.0f) - i12) / 2.0f), f13 - ((AndroidUtilities.dp(44.0f) - i12) / 2.0f), AndroidUtilities.dp(44.0f) - i12, AndroidUtilities.dp(44.0f) - i12);
                            ((ImageReceiver) f8Var.r.get(i13)).draw(canvas2);
                            if (f8Var.n.get(i13) != null && ((g8) f8Var.n.get(i13)).a != null && ((g8) f8Var.n.get(i13)).a.hasMediaSpoilers()) {
                                float dp8 = (AndroidUtilities.dp(44.0f) - i12) / 2.0f;
                                path.rewind();
                                path.addCircle(f12, f13, dp8, Path.Direction.CW);
                                canvas2.save();
                                canvas2.clipPath(path);
                                hVar.h(i0.a.k(-1, (int) (Color.alpha(-1) * 0.325f * g8Var.d)));
                                hVar.setBounds((int) (f12 - dp8), (int) (f13 - dp8), (int) (f12 + dp8), (int) (f13 + dp8));
                                hVar.draw(canvas2);
                                f8Var.invalidate();
                                canvas2.restore();
                            }
                            paint7.setColor(i0.a.k(-16777216, (int) (g8Var.d * 80.0f)));
                            canvas2.drawCircle(f12, f13, (AndroidUtilities.dp(44.0f) - i12) / 2.0f, paint7);
                            g8Var.f = true;
                            if (f16 != f15) {
                                canvas2.restore();
                            }
                            f14 = f17;
                        }
                    }
                    f15 = 1.0f;
                    f16 = g8Var.d;
                    if (f16 != f15) {
                    }
                    int i252 = i18;
                    int dp72 = (int) (AndroidUtilities.dp(7.0f) * g8Var.l);
                    if (g8Var.i < 0.01f) {
                    }
                    ((ImageReceiver) f8Var.r.get(i13)).setAlpha(g8Var.d);
                    paint5 = paint6;
                    ((ImageReceiver) f8Var.r.get(i13)).setImageCoords(f12 - ((AndroidUtilities.dp(44.0f) - i12) / 2.0f), f13 - ((AndroidUtilities.dp(44.0f) - i12) / 2.0f), AndroidUtilities.dp(44.0f) - i12, AndroidUtilities.dp(44.0f) - i12);
                    ((ImageReceiver) f8Var.r.get(i13)).draw(canvas2);
                    if (f8Var.n.get(i13) != null) {
                        float dp82 = (AndroidUtilities.dp(44.0f) - i12) / 2.0f;
                        path.rewind();
                        path.addCircle(f12, f13, dp82, Path.Direction.CW);
                        canvas2.save();
                        canvas2.clipPath(path);
                        hVar.h(i0.a.k(-1, (int) (Color.alpha(-1) * 0.325f * g8Var.d)));
                        hVar.setBounds((int) (f12 - dp82), (int) (f13 - dp82), (int) (f12 + dp82), (int) (f13 + dp82));
                        hVar.draw(canvas2);
                        f8Var.invalidate();
                        canvas2.restore();
                    }
                    paint7.setColor(i0.a.k(-16777216, (int) (g8Var.d * 80.0f)));
                    canvas2.drawCircle(f12, f13, (AndroidUtilities.dp(44.0f) - i12) / 2.0f, paint7);
                    g8Var.f = true;
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
                    i8Var = i8Var2;
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
            i8Var2 = i8Var;
            measuredWidth = f10;
            i18 = i23;
            paint7 = paint;
            f8Var = this;
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
