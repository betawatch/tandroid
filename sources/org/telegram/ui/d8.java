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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class d8 extends FrameLayout {
    public final org.telegram.ui.ActionBar.j5 a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int h;
    public SparseArray n;
    public SparseArray r;
    public final m.f3 s;
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
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.a = j5Var;
        if (g8Var.e0 == 0 && g8Var.d0) {
            j5Var.setOnLongClickListener(new v(this, 1));
            j5Var.setOnClickListener(new x7(this, 0));
        }
        j5Var.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.i6, false), 2, -1));
        j5Var.setTextSize(15);
        j5Var.setTypeface(AndroidUtilities.bold());
        j5Var.setGravity(17);
        j5Var.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.G6, false));
        addView(j5Var, w7.x5.a(28.0f, 0.0f, 12.0f, 0.0f, 4.0f, -1, 0));
        m.f3 f3Var = new m.f3(context, new b8(this, context));
        this.s = f3Var;
        ((GestureDetector) f3Var.b).setIsLongpressEnabled(g8Var.e0 == 0);
    }

    public static void a(d8 d8Var, int i10, int i11) {
        if (d8Var.n != null) {
            for (int i12 = 0; i12 < d8Var.d; i12++) {
                e8 e8Var = (e8) d8Var.n.get(i12, null);
                if (e8Var != null) {
                    e8Var.m = e8Var.l;
                    int i13 = e8Var.h;
                    e8Var.n = (i13 < i10 || i13 > i11) ? 0.0f : 1.0f;
                    e8Var.j = e8Var.i;
                    if (i13 == i10 || i13 == i11) {
                        e8Var.k = 1.0f;
                    } else {
                        e8Var.k = 0.0f;
                    }
                }
            }
        }
    }

    public static void b(d8 d8Var, float f7) {
        if (d8Var.n != null) {
            for (int i10 = 0; i10 < d8Var.d; i10++) {
                e8 e8Var = (e8) d8Var.n.get(i10, null);
                if (e8Var != null) {
                    float f10 = e8Var.m;
                    e8Var.l = com.google.android.gms.internal.vision.e2.y(e8Var.n, f10, f7, f10);
                    float f11 = e8Var.j;
                    e8Var.i = com.google.android.gms.internal.vision.e2.y(e8Var.k, f11, f7, f11);
                }
            }
        }
        d8Var.invalidate();
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
        f8 f8Var = (f8) sparseArray2.get(i10);
        if (f8Var != null) {
            float f12 = f8Var.a;
            f10 = f8Var.b;
            f11 = f8Var.c;
            f7 = f12;
        } else {
            f7 = (measuredWidth / 2.0f) + (i11 * measuredWidth);
            f10 = f7;
            f11 = 0.0f;
        }
        float f13 = z10 ? (measuredWidth / 2.0f) + (i11 * measuredWidth) : f7;
        final float f14 = z10 ? (measuredWidth / 2.0f) + (i12 * measuredWidth) : f10;
        float f15 = z10 ? 1.0f : 0.0f;
        final f8 f8Var2 = new f8();
        f8Var2.a = f7;
        f8Var2.b = f10;
        sparseArray2.put(i10, f8Var2);
        if (!z11) {
            f8Var2.a = f13;
            f8Var2.b = f14;
            f8Var2.c = f15;
            invalidate();
            return;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        duration.setInterpolator(org.telegram.ui.Components.au.e);
        final float f16 = f10;
        final float f17 = f15;
        final float f18 = f7;
        final float f19 = f13;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.w7
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                d8 d8Var = d8.this;
                d8Var.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float f20 = f19;
                float f21 = f18;
                float y3 = com.google.android.gms.internal.vision.e2.y(f20, f21, floatValue, f21);
                f8 f8Var3 = f8Var2;
                f8Var3.a = y3;
                float f22 = f14;
                float f23 = f16;
                f8Var3.b = com.google.android.gms.internal.vision.e2.y(f22, f23, floatValue, f23);
                float f24 = f17;
                float f25 = f11;
                f8Var3.c = com.google.android.gms.internal.vision.e2.y(f24, f25, floatValue, f25);
                d8Var.invalidate();
            }
        });
        duration.addListener(new c8(this, f8Var2, f19, f14, f17, i10, z10));
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

    /* JADX WARN: Removed duplicated region for block: B:50:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0212  */
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
        g8 g8Var;
        int i12;
        Paint paint4;
        Paint paint5;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        int i13;
        float f17;
        Paint paint6;
        int i14;
        int i15;
        d8 d8Var = this;
        Canvas canvas2 = canvas;
        g8 g8Var2 = d8Var.x;
        Paint paint7 = g8Var2.w;
        vh.g gVar = g8Var2.k0;
        Path path = g8Var2.j0;
        Paint paint8 = g8Var2.r;
        TextPaint textPaint = g8Var2.e;
        Paint paint9 = g8Var2.s;
        TextPaint textPaint2 = g8Var2.d;
        super.onDraw(canvas);
        int i16 = d8Var.e;
        float measuredWidth = d8Var.getMeasuredWidth() / 7.0f;
        float dp = AndroidUtilities.dp(52.0f);
        int dp2 = AndroidUtilities.dp(44.0f);
        Paint paint10 = paint8;
        int i17 = 0;
        while (true) {
            i10 = i16;
            f7 = dp;
            if (i17 >= Math.ceil((d8Var.e + d8Var.d) / 7.0f)) {
                break;
            }
            float dp3 = (f7 / 2.0f) + (i17 * f7) + AndroidUtilities.dp(44.0f);
            f8 f8Var = (f8) d8Var.w.get(i17);
            if (f8Var != null) {
                paint9.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.cf, false));
                paint9.setAlpha((int) (f8Var.c * 40.8f));
                RectF rectF = AndroidUtilities.rectTmp;
                float f18 = dp2 / 2.0f;
                i15 = dp2;
                rectF.set(f8Var.a - f18, dp3 - f18, f8Var.b + f18, dp3 + f18);
                float dp4 = AndroidUtilities.dp(32.0f);
                canvas2.drawRoundRect(rectF, dp4, dp4, paint9);
            } else {
                i15 = dp2;
            }
            i17++;
            i16 = i10;
            dp = f7;
            dp2 = i15;
        }
        int i18 = i10;
        int i19 = 0;
        int i20 = 0;
        while (i19 < d8Var.d) {
            float f19 = (i18 * measuredWidth) + (measuredWidth / 2.0f);
            float dp5 = (f7 / 2.0f) + (i20 * f7) + AndroidUtilities.dp(44.0f);
            int i21 = i20;
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            SparseArray sparseArray = d8Var.n;
            int i22 = i18;
            e8 e8Var = sparseArray != null ? (e8) sparseArray.get(i19, null) : null;
            int i23 = d8Var.h;
            int i24 = i19 + 1;
            if (currentTimeMillis < (i24 * 86400) + i23 || ((i12 = g8Var2.c0) > 0 && i12 > ((i19 + 2) * 86400) + i23)) {
                paint = paint7;
                paint2 = paint9;
                f10 = measuredWidth;
                i11 = 0;
                paint3 = paint10;
                g8Var = g8Var2;
                int alpha = textPaint2.getAlpha();
                textPaint2.setAlpha((int) (alpha * 0.3f));
                canvas2.drawText(Integer.toString(i24), f19, AndroidUtilities.dp(5.0f) + dp5, textPaint2);
                textPaint2.setAlpha(alpha);
            } else if (e8Var == null || !e8Var.g) {
                Paint paint11 = paint9;
                f10 = measuredWidth;
                Paint paint12 = paint10;
                g8Var = g8Var2;
                if (e8Var == null || e8Var.i < 0.01f) {
                    paint = paint7;
                    paint2 = paint11;
                    paint3 = paint12;
                    i11 = 0;
                    canvas2.drawText(Integer.toString(i24), f19, AndroidUtilities.dp(5.0f) + dp5, textPaint2);
                } else {
                    paint11.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.d6, false));
                    paint11.setAlpha((int) (e8Var.i * 255.0f));
                    canvas2.drawCircle(f19, dp5, AndroidUtilities.dp(44.0f) / 2.0f, paint11);
                    int i25 = org.telegram.ui.ActionBar.i6.cf;
                    paint3 = paint12;
                    paint3.setColor(org.telegram.ui.ActionBar.i6.x0(null, i25, false));
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(f19 - (AndroidUtilities.dp(44.0f) / 2.0f), dp5 - (AndroidUtilities.dp(44.0f) / 2.0f), (AndroidUtilities.dp(44.0f) / 2.0f) + f19, (AndroidUtilities.dp(44.0f) / 2.0f) + dp5);
                    paint2 = paint11;
                    paint = paint7;
                    i11 = 0;
                    canvas2 = canvas;
                    canvas2.drawArc(rectF2, -90.0f, e8Var.i * 360.0f, false, paint3);
                    int dp6 = (int) (AndroidUtilities.dp(7.0f) * e8Var.i);
                    paint2.setColor(org.telegram.ui.ActionBar.i6.x0(null, i25, false));
                    paint2.setAlpha((int) (e8Var.i * 255.0f));
                    canvas2.drawCircle(f19, dp5, (AndroidUtilities.dp(44.0f) - dp6) / 2.0f, paint2);
                    float f20 = e8Var.i;
                    if (f20 != 1.0f) {
                        int alpha2 = textPaint2.getAlpha();
                        textPaint2.setAlpha((int) ((1.0f - f20) * alpha2));
                        canvas2.drawText(Integer.toString(i24), f19, AndroidUtilities.dp(5.0f) + dp5, textPaint2);
                        textPaint2.setAlpha(alpha2);
                        int alpha3 = textPaint2.getAlpha();
                        textPaint.setAlpha((int) (alpha3 * f20));
                        canvas2.drawText(Integer.toString(i24), f19, AndroidUtilities.dp(5.0f) + dp5, textPaint);
                        textPaint.setAlpha(alpha3);
                    } else {
                        canvas2.drawText(Integer.toString(i24), f19, AndroidUtilities.dp(5.0f) + dp5, textPaint);
                    }
                }
            } else {
                if (d8Var.r.get(i19) != null) {
                    float f21 = 0.0f;
                    if (g8Var2.F && !e8Var.f) {
                        e8Var.d = 0.0f;
                        f21 = 0.0f;
                        e8Var.e = Math.max(0.0f, ((d8Var.getY() + dp5) / g8Var2.b.getMeasuredHeight()) * 150.0f);
                    }
                    float f22 = e8Var.e;
                    if (f22 > f21) {
                        float f23 = f22 - 16.0f;
                        e8Var.e = f23;
                        if (f23 < f21) {
                            e8Var.e = f21;
                        } else {
                            d8Var.invalidate();
                        }
                    }
                    if (e8Var.e >= f21) {
                        float f24 = e8Var.d;
                        if (f24 != 1.0f) {
                            float f25 = f24 + 0.07272727f;
                            e8Var.d = f25;
                            if (f25 > 1.0f) {
                                f15 = 1.0f;
                                e8Var.d = 1.0f;
                            } else {
                                f15 = 1.0f;
                                d8Var.invalidate();
                            }
                            f16 = e8Var.d;
                            if (f16 != f15) {
                                canvas2.save();
                                float f26 = (0.2f * f16) + 0.8f;
                                canvas2.scale(f26, f26, f19, dp5);
                            }
                            int i26 = i19;
                            int dp7 = (int) (AndroidUtilities.dp(7.0f) * e8Var.l);
                            if (e8Var.i < 0.01f) {
                                i13 = dp7;
                                paint9.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.d6, false));
                                paint9.setAlpha((int) (e8Var.i * 255.0f));
                                canvas2.drawCircle(f19, dp5, AndroidUtilities.dp(44.0f) / 2.0f, paint9);
                                paint10.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.cf, false));
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
                                g8Var = g8Var2;
                                i14 = i26;
                                canvas2.drawArc(rectF3, -90.0f, e8Var.i * 360.0f, false, paint6);
                            } else {
                                i13 = dp7;
                                f17 = f16;
                                paint4 = paint9;
                                f10 = measuredWidth;
                                f11 = 1.0f;
                                f12 = f19;
                                f13 = dp5;
                                paint6 = paint10;
                                g8Var = g8Var2;
                                i14 = i26;
                            }
                            ((ImageReceiver) d8Var.r.get(i14)).setAlpha(e8Var.d);
                            paint5 = paint6;
                            ((ImageReceiver) d8Var.r.get(i14)).setImageCoords(f12 - ((AndroidUtilities.dp(44.0f) - i13) / 2.0f), f13 - ((AndroidUtilities.dp(44.0f) - i13) / 2.0f), AndroidUtilities.dp(44.0f) - i13, AndroidUtilities.dp(44.0f) - i13);
                            ((ImageReceiver) d8Var.r.get(i14)).draw(canvas2);
                            if (d8Var.n.get(i14) != null && ((e8) d8Var.n.get(i14)).a != null && ((e8) d8Var.n.get(i14)).a.hasMediaSpoilers()) {
                                float dp8 = (AndroidUtilities.dp(44.0f) - i13) / 2.0f;
                                path.rewind();
                                path.addCircle(f12, f13, dp8, Path.Direction.CW);
                                canvas2.save();
                                canvas2.clipPath(path);
                                gVar.h(i0.a.k(-1, (int) (Color.alpha(-1) * 0.325f * e8Var.d)));
                                gVar.setBounds((int) (f12 - dp8), (int) (f13 - dp8), (int) (f12 + dp8), (int) (f13 + dp8));
                                gVar.draw(canvas2);
                                d8Var.invalidate();
                                canvas2.restore();
                            }
                            paint7.setColor(i0.a.k(-16777216, (int) (e8Var.d * 80.0f)));
                            canvas2.drawCircle(f12, f13, (AndroidUtilities.dp(44.0f) - i13) / 2.0f, paint7);
                            e8Var.f = true;
                            if (f16 != f15) {
                                canvas2.restore();
                            }
                            f14 = f17;
                        }
                    }
                    f15 = 1.0f;
                    f16 = e8Var.d;
                    if (f16 != f15) {
                    }
                    int i262 = i19;
                    int dp72 = (int) (AndroidUtilities.dp(7.0f) * e8Var.l);
                    if (e8Var.i < 0.01f) {
                    }
                    ((ImageReceiver) d8Var.r.get(i14)).setAlpha(e8Var.d);
                    paint5 = paint6;
                    ((ImageReceiver) d8Var.r.get(i14)).setImageCoords(f12 - ((AndroidUtilities.dp(44.0f) - i13) / 2.0f), f13 - ((AndroidUtilities.dp(44.0f) - i13) / 2.0f), AndroidUtilities.dp(44.0f) - i13, AndroidUtilities.dp(44.0f) - i13);
                    ((ImageReceiver) d8Var.r.get(i14)).draw(canvas2);
                    if (d8Var.n.get(i14) != null) {
                        float dp82 = (AndroidUtilities.dp(44.0f) - i13) / 2.0f;
                        path.rewind();
                        path.addCircle(f12, f13, dp82, Path.Direction.CW);
                        canvas2.save();
                        canvas2.clipPath(path);
                        gVar.h(i0.a.k(-1, (int) (Color.alpha(-1) * 0.325f * e8Var.d)));
                        gVar.setBounds((int) (f12 - dp82), (int) (f13 - dp82), (int) (f12 + dp82), (int) (f13 + dp82));
                        gVar.draw(canvas2);
                        d8Var.invalidate();
                        canvas2.restore();
                    }
                    paint7.setColor(i0.a.k(-16777216, (int) (e8Var.d * 80.0f)));
                    canvas2.drawCircle(f12, f13, (AndroidUtilities.dp(44.0f) - i13) / 2.0f, paint7);
                    e8Var.f = true;
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
                    g8Var = g8Var2;
                    f14 = 1.0f;
                }
                if (f14 != f11) {
                    int alpha4 = textPaint2.getAlpha();
                    textPaint2.setAlpha((int) ((f11 - f14) * alpha4));
                    canvas2.drawText(Integer.toString(i24), f12, f13 + AndroidUtilities.dp(5.0f), textPaint2);
                    textPaint2.setAlpha(alpha4);
                    int alpha5 = textPaint2.getAlpha();
                    textPaint.setAlpha((int) (alpha5 * f14));
                    canvas2.drawText(Integer.toString(i24), f12, f13 + AndroidUtilities.dp(5.0f), textPaint);
                    textPaint.setAlpha(alpha5);
                } else {
                    canvas2.drawText(Integer.toString(i24), f12, f13 + AndroidUtilities.dp(5.0f), textPaint);
                }
                paint = paint7;
                paint2 = paint4;
                paint3 = paint5;
                i11 = 0;
            }
            i18 = i22 + 1;
            if (i18 >= 7) {
                i20 = i21 + 1;
                i18 = i11;
            } else {
                i20 = i21;
            }
            paint9 = paint2;
            g8Var2 = g8Var;
            measuredWidth = f10;
            i19 = i24;
            paint7 = paint;
            d8Var = this;
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
