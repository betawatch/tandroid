// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class g81 extends FrameLayout {
    public static final /* synthetic */ int E = 0;
    public final ema a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int h;
    public SparseArray n;
    public SparseArray r;
    public final kj4 s;
    public final SparseArray w;
    public final SparseArray x;
    public final /* synthetic */ j81 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g81(j81 j81Var, Context context) {
        super(context);
        this.y = j81Var;
        this.n = new SparseArray();
        this.r = new SparseArray();
        this.w = new SparseArray();
        this.x = new SparseArray();
        setWillNotDraw(false);
        ema emaVar = new ema(context);
        this.a = emaVar;
        byte b = 2;
        byte b2 = 1;
        if (j81Var.f0 == 0 && j81Var.e0) {
            emaVar.setOnLongClickListener(new zs(this, b2));
            emaVar.setOnClickListener(new h6(this, b));
        }
        int i = aob.i6;
        hf0 f0 = aob.f0(aob.w0(null, i, false), 2, -1);
        uob M = yob.M(i);
        emaVar.setBackground(f0);
        yob.j(emaVar, f0, null, M, null);
        emaVar.setTextSize(15);
        emaVar.setTypeface(hl.o());
        emaVar.setGravity(17);
        yob.W(emaVar, aob.G6, null);
        addView(emaVar, tre.d(-1, 28.0f, 0, 0.0f, 12.0f, 0.0f, 4.0f));
        kj4 kj4Var = new kj4(context, new e81(this, context));
        this.s = kj4Var;
        ((GestureDetector) kj4Var.b).setIsLongpressEnabled(j81Var.f0 == 0);
    }

    public final void a(int i, int i2, int i3, boolean z, boolean z2) {
        float f;
        float f2;
        final float f3;
        float f4;
        final float f5;
        SparseArray sparseArray = this.w;
        ValueAnimator valueAnimator = (ValueAnimator) sparseArray.get(i);
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float measuredWidth = getMeasuredWidth() / 7.0f;
        SparseArray sparseArray2 = this.x;
        i81 i81Var = (i81) sparseArray2.get(i);
        float f6 = 0.0f;
        if (i81Var != null) {
            float f7 = i81Var.a;
            f2 = i81Var.b;
            f3 = i81Var.c;
            f = f7;
        } else {
            f = (measuredWidth / 2.0f) + (i2 * measuredWidth);
            f2 = f;
            f3 = 0.0f;
        }
        if (z) {
            float f8 = measuredWidth / 2.0f;
            f4 = (i2 * measuredWidth) + f8;
            float f9 = (measuredWidth * i3) + f8;
            f6 = 1.0f;
            f5 = f9;
        } else {
            f4 = f;
            f5 = f2;
        }
        final i81 i81Var2 = new i81();
        i81Var2.a = f;
        i81Var2.b = f2;
        sparseArray2.put(i, i81Var2);
        if (!z2) {
            i81Var2.a = f4;
            i81Var2.b = f5;
            i81Var2.c = f6;
            invalidate();
            return;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        duration.setInterpolator(dt3.e);
        final float f10 = f4;
        final float f11 = f;
        final float f12 = f2;
        final float f13 = f6;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: b81
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float f14 = f10;
                float f15 = f11;
                float A = qd4.A(f14, f15, floatValue, f15);
                i81 i81Var3 = i81Var2;
                i81Var3.a = A;
                float f16 = f5;
                float f17 = f12;
                i81Var3.b = qd4.A(f16, f17, floatValue, f17);
                float f18 = f13;
                float f19 = f3;
                i81Var3.c = qd4.A(f18, f19, floatValue, f19);
                g81.this.invalidate();
            }
        });
        duration.addListener(new f81(this, i81Var2, f10, f5, f13, i, z));
        duration.start();
        sparseArray.put(i, duration);
    }

    public final void b(float f) {
        if (this.n != null) {
            for (int i = 0; i < this.d; i++) {
                h81 h81Var = (h81) this.n.get(i, null);
                if (h81Var != null) {
                    float f2 = h81Var.m;
                    h81Var.l = qd4.A(h81Var.n, f2, f, f2);
                    float f3 = h81Var.j;
                    h81Var.i = qd4.A(h81Var.k, f3, f, f3);
                }
            }
        }
        invalidate();
    }

    public final void c(int i, int i2) {
        if (this.n != null) {
            for (int i3 = 0; i3 < this.d; i3++) {
                h81 h81Var = (h81) this.n.get(i3, null);
                if (h81Var != null) {
                    h81Var.m = h81Var.l;
                    int i4 = h81Var.h;
                    h81Var.n = (i4 < i || i4 > i2) ? 0.0f : 1.0f;
                    h81Var.j = h81Var.i;
                    if (i4 == i || i4 == i2) {
                        h81Var.k = 1.0f;
                    } else {
                        h81Var.k = 0.0f;
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.r != null) {
            for (int i = 0; i < this.r.size(); i++) {
                ((ImageReceiver) this.r.valueAt(i)).I();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.r != null) {
            for (int i = 0; i < this.r.size(); i++) {
                ((ImageReceiver) this.r.valueAt(i)).K();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0207  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        Paint paint;
        Paint paint2;
        float f2;
        int i2;
        Paint paint3;
        j81 j81Var;
        TextPaint textPaint;
        int i3;
        float f3;
        float f4;
        TextPaint textPaint2;
        Paint paint4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        int i4;
        float f11;
        int i5;
        int i6;
        g81 g81Var = this;
        Canvas canvas2 = canvas;
        j81 j81Var2 = g81Var.y;
        Paint paint5 = j81Var2.x;
        npa npaVar = j81Var2.n0;
        Path path = j81Var2.m0;
        Paint paint6 = j81Var2.r;
        TextPaint textPaint3 = j81Var2.e;
        Paint paint7 = j81Var2.s;
        TextPaint textPaint4 = j81Var2.d;
        super.onDraw(canvas);
        int i7 = g81Var.e;
        float measuredWidth = g81Var.getMeasuredWidth() / 7.0f;
        float L = hl.L(52.0f);
        int L2 = hl.L(44.0f);
        Paint paint8 = paint6;
        int i8 = 0;
        while (true) {
            i = i7;
            f = L;
            if (i8 >= Math.ceil((g81Var.e + g81Var.d) / 7.0f)) {
                break;
            }
            float L3 = (f / 2.0f) + (i8 * f) + hl.L(44.0f);
            i81 i81Var = (i81) g81Var.x.get(i8);
            if (i81Var != null) {
                paint7.setColor(aob.w0(null, aob.Uf, false));
                paint7.setAlpha((int) (i81Var.c * 40.8f));
                RectF rectF = hl.P;
                float f12 = L2 / 2.0f;
                i6 = L2;
                rectF.set(i81Var.a - f12, L3 - f12, i81Var.b + f12, L3 + f12);
                float L4 = hl.L(32.0f);
                canvas2.drawRoundRect(rectF, L4, L4, paint7);
            } else {
                i6 = L2;
            }
            i8++;
            i7 = i;
            L = f;
            L2 = i6;
        }
        int i9 = i;
        int i10 = 0;
        int i11 = 0;
        while (i10 < g81Var.d) {
            float f13 = (i9 * measuredWidth) + (measuredWidth / 2.0f);
            float L5 = (f / 2.0f) + (i11 * f) + hl.L(44.0f);
            int i12 = i11;
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            SparseArray sparseArray = g81Var.n;
            int i13 = i9;
            h81 h81Var = sparseArray != null ? (h81) sparseArray.get(i10, null) : null;
            int i14 = g81Var.h;
            int i15 = i10 + 1;
            if (currentTimeMillis < (i15 * 86400) + i14 || ((i3 = j81Var2.d0) > 0 && i3 > ((i10 + 2) * 86400) + i14)) {
                paint = paint5;
                paint2 = paint7;
                f2 = measuredWidth;
                i2 = 0;
                paint3 = paint8;
                j81Var = j81Var2;
                textPaint = textPaint3;
                int alpha = textPaint4.getAlpha();
                textPaint4.setAlpha((int) (alpha * 0.3f));
                canvas2.drawText(Integer.toString(i15), f13, hl.L(5.0f) + L5, textPaint4);
                textPaint4.setAlpha(alpha);
            } else {
                if (h81Var == null) {
                    paint2 = paint7;
                    f2 = measuredWidth;
                    f3 = f13;
                    f4 = L5;
                    paint3 = paint8;
                    j81Var = j81Var2;
                    textPaint = textPaint3;
                } else if (h81Var.g) {
                    if (g81Var.r.get(i10) != null) {
                        float f14 = 0.0f;
                        if (j81Var2.G && !h81Var.f) {
                            h81Var.d = 0.0f;
                            f14 = 0.0f;
                            h81Var.e = Math.max(0.0f, ((g81Var.getY() + L5) / j81Var2.b.getMeasuredHeight()) * 150.0f);
                        }
                        float f15 = h81Var.e;
                        if (f15 > f14) {
                            float f16 = f15 - 16.0f;
                            h81Var.e = f16;
                            if (f16 < f14) {
                                h81Var.e = f14;
                            } else {
                                g81Var.invalidate();
                            }
                        }
                        if (h81Var.e >= f14) {
                            float f17 = h81Var.d;
                            if (f17 != 1.0f) {
                                float f18 = f17 + 0.07272727f;
                                h81Var.d = f18;
                                if (f18 > 1.0f) {
                                    f9 = 1.0f;
                                    h81Var.d = 1.0f;
                                } else {
                                    f9 = 1.0f;
                                    g81Var.invalidate();
                                }
                                f10 = h81Var.d;
                                if (f10 != f9) {
                                    canvas2.save();
                                    float f19 = (0.2f * f10) + 0.8f;
                                    canvas2.scale(f19, f19, f13, L5);
                                }
                                int i16 = i10;
                                int L6 = (int) (hl.L(7.0f) * h81Var.l);
                                if (h81Var.i < 0.01f) {
                                    i4 = L6;
                                    paint7.setColor(aob.w0(null, aob.d6, false));
                                    paint7.setAlpha((int) (h81Var.i * 255.0f));
                                    canvas2.drawCircle(f13, L5, hl.L(44.0f) / 2.0f, paint7);
                                    paint8.setColor(aob.w0(null, aob.Uf, false));
                                    RectF rectF2 = hl.P;
                                    rectF2.set(f13 - (hl.L(44.0f) / 2.0f), L5 - (hl.L(44.0f) / 2.0f), (hl.L(44.0f) / 2.0f) + f13, (hl.L(44.0f) / 2.0f) + L5);
                                    canvas2 = canvas;
                                    paint4 = paint7;
                                    f11 = f10;
                                    f5 = 1.0f;
                                    f7 = L5;
                                    f2 = measuredWidth;
                                    paint3 = paint8;
                                    f6 = f13;
                                    j81Var = j81Var2;
                                    i5 = i16;
                                    textPaint2 = textPaint3;
                                    canvas2.drawArc(rectF2, -90.0f, h81Var.i * 360.0f, false, paint3);
                                } else {
                                    i4 = L6;
                                    f11 = f10;
                                    paint4 = paint7;
                                    f2 = measuredWidth;
                                    f5 = 1.0f;
                                    f6 = f13;
                                    f7 = L5;
                                    paint3 = paint8;
                                    j81Var = j81Var2;
                                    i5 = i16;
                                    textPaint2 = textPaint3;
                                }
                                ((ImageReceiver) g81Var.r.get(i5)).setAlpha(h81Var.d);
                                ((ImageReceiver) g81Var.r.get(i5)).i0(f6 - ((hl.L(44.0f) - i4) / 2.0f), f7 - ((hl.L(44.0f) - i4) / 2.0f), hl.L(44.0f) - i4, hl.L(44.0f) - i4);
                                ((ImageReceiver) g81Var.r.get(i5)).h(canvas2, null);
                                if (g81Var.n.get(i5) != null && ((h81) g81Var.n.get(i5)).a != null && ((h81) g81Var.n.get(i5)).a.t2()) {
                                    float L7 = (hl.L(44.0f) - i4) / 2.0f;
                                    path.rewind();
                                    path.addCircle(f6, f7, L7, Path.Direction.CW);
                                    canvas2.save();
                                    canvas2.clipPath(path);
                                    npaVar.h(vm2.o(-1, (int) (82.875f * h81Var.d)));
                                    npaVar.setBounds((int) (f6 - L7), (int) (f7 - L7), (int) (f6 + L7), (int) (L7 + f7));
                                    npaVar.draw(canvas2);
                                    g81Var.invalidate();
                                    canvas2.restore();
                                }
                                paint5.setColor(vm2.o(-16777216, (int) (h81Var.d * 80.0f)));
                                canvas2.drawCircle(f6, f7, (hl.L(44.0f) - i4) / 2.0f, paint5);
                                h81Var.f = true;
                                if (f10 != f9) {
                                    canvas2.restore();
                                }
                                f8 = f11;
                            }
                        }
                        f9 = 1.0f;
                        f10 = h81Var.d;
                        if (f10 != f9) {
                        }
                        int i162 = i10;
                        int L62 = (int) (hl.L(7.0f) * h81Var.l);
                        if (h81Var.i < 0.01f) {
                        }
                        ((ImageReceiver) g81Var.r.get(i5)).setAlpha(h81Var.d);
                        ((ImageReceiver) g81Var.r.get(i5)).i0(f6 - ((hl.L(44.0f) - i4) / 2.0f), f7 - ((hl.L(44.0f) - i4) / 2.0f), hl.L(44.0f) - i4, hl.L(44.0f) - i4);
                        ((ImageReceiver) g81Var.r.get(i5)).h(canvas2, null);
                        if (g81Var.n.get(i5) != null) {
                            float L72 = (hl.L(44.0f) - i4) / 2.0f;
                            path.rewind();
                            path.addCircle(f6, f7, L72, Path.Direction.CW);
                            canvas2.save();
                            canvas2.clipPath(path);
                            npaVar.h(vm2.o(-1, (int) (82.875f * h81Var.d)));
                            npaVar.setBounds((int) (f6 - L72), (int) (f7 - L72), (int) (f6 + L72), (int) (L72 + f7));
                            npaVar.draw(canvas2);
                            g81Var.invalidate();
                            canvas2.restore();
                        }
                        paint5.setColor(vm2.o(-16777216, (int) (h81Var.d * 80.0f)));
                        canvas2.drawCircle(f6, f7, (hl.L(44.0f) - i4) / 2.0f, paint5);
                        h81Var.f = true;
                        if (f10 != f9) {
                        }
                        f8 = f11;
                    } else {
                        textPaint2 = textPaint3;
                        paint4 = paint7;
                        f2 = measuredWidth;
                        f5 = 1.0f;
                        f6 = f13;
                        f7 = L5;
                        paint3 = paint8;
                        j81Var = j81Var2;
                        f8 = 1.0f;
                    }
                    if (f8 != f5) {
                        int alpha2 = textPaint4.getAlpha();
                        textPaint4.setAlpha((int) ((f5 - f8) * alpha2));
                        canvas2.drawText(Integer.toString(i15), f6, hl.L(5.0f) + f7, textPaint4);
                        textPaint4.setAlpha(alpha2);
                        int alpha3 = textPaint4.getAlpha();
                        textPaint = textPaint2;
                        textPaint.setAlpha((int) (alpha3 * f8));
                        canvas2.drawText(Integer.toString(i15), f6, hl.L(5.0f) + f7, textPaint);
                        textPaint.setAlpha(alpha3);
                    } else {
                        textPaint = textPaint2;
                        canvas2.drawText(Integer.toString(i15), f6, hl.L(5.0f) + f7, textPaint);
                    }
                    paint2 = paint4;
                    paint = paint5;
                    i2 = 0;
                } else {
                    Paint paint9 = paint7;
                    f2 = measuredWidth;
                    f3 = f13;
                    f4 = L5;
                    paint3 = paint8;
                    j81Var = j81Var2;
                    textPaint = textPaint3;
                    if (h81Var.i >= 0.01f) {
                        paint9.setColor(aob.w0(null, aob.d6, false));
                        paint9.setAlpha((int) (h81Var.i * 255.0f));
                        canvas2.drawCircle(f3, f4, hl.L(44.0f) / 2.0f, paint9);
                        int i17 = aob.Uf;
                        paint3.setColor(aob.w0(null, i17, false));
                        RectF rectF3 = hl.P;
                        rectF3.set(f3 - (hl.L(44.0f) / 2.0f), f4 - (hl.L(44.0f) / 2.0f), (hl.L(44.0f) / 2.0f) + f3, (hl.L(44.0f) / 2.0f) + f4);
                        paint2 = paint9;
                        paint = paint5;
                        i2 = 0;
                        canvas2 = canvas;
                        canvas2.drawArc(rectF3, -90.0f, h81Var.i * 360.0f, false, paint3);
                        int L8 = (int) (hl.L(7.0f) * h81Var.i);
                        paint2.setColor(aob.w0(null, i17, false));
                        paint2.setAlpha((int) (h81Var.i * 255.0f));
                        canvas2.drawCircle(f3, f4, (hl.L(44.0f) - L8) / 2.0f, paint2);
                        float f20 = h81Var.i;
                        if (f20 != 1.0f) {
                            int alpha4 = textPaint4.getAlpha();
                            textPaint4.setAlpha((int) ((1.0f - f20) * alpha4));
                            canvas2.drawText(Integer.toString(i15), f3, hl.L(5.0f) + f4, textPaint4);
                            textPaint4.setAlpha(alpha4);
                            int alpha5 = textPaint4.getAlpha();
                            textPaint.setAlpha((int) (alpha5 * f20));
                            canvas2.drawText(Integer.toString(i15), f3, hl.L(5.0f) + f4, textPaint);
                            textPaint.setAlpha(alpha5);
                        } else {
                            canvas2.drawText(Integer.toString(i15), f3, hl.L(5.0f) + f4, textPaint);
                        }
                    } else {
                        paint2 = paint9;
                    }
                }
                paint = paint5;
                i2 = 0;
                canvas2.drawText(Integer.toString(i15), f3, hl.L(5.0f) + f4, textPaint4);
            }
            i9 = i13 + 1;
            if (i9 >= 7) {
                i11 = i12 + 1;
                i9 = i2;
            } else {
                i11 = i12;
            }
            paint7 = paint2;
            textPaint3 = textPaint;
            j81Var2 = j81Var;
            measuredWidth = f2;
            paint5 = paint;
            i10 = i15;
            g81Var = this;
            paint8 = paint3;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L((this.f * 52) + 44), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return ((GestureDetector) this.s.b).onTouchEvent(motionEvent);
    }
}
