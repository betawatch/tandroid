// default package

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class dg4 extends View {
    public float E;
    public float F;
    public float G;
    public boolean H;
    public boolean I;
    public int J;
    public int K;
    public StaticLayout L;
    public StaticLayout M;
    public StaticLayout N;
    public CharSequence O;
    public dm P;
    public StaticLayout Q;
    public dm R;
    public StaticLayout S;
    public dm T;
    public StaticLayout U;
    public boolean V;
    public boolean W;
    public ValueAnimator a;
    public boolean a0;
    public bg4 b;
    public float b0;
    public int c;
    public int c0;
    public int d;
    public int d0;
    public int e;
    public int e0;
    public final RectF f;
    public float f0;
    public float g0;
    public CharSequence h;
    public float h0;
    public float i0;
    public float j0;
    public float k0;
    public float l0;
    public boolean m0;
    public boolean n;
    public final /* synthetic */ fg4 n0;
    public dm r;
    public StaticLayout s;
    public int w;
    public boolean x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dg4(fg4 fg4Var, Context context) {
        super(context);
        this.n0 = fg4Var;
        this.f = new RectF();
        this.J = -1;
    }

    public final void a() {
        this.x = false;
        this.I = false;
        this.V = false;
        this.H = false;
        this.a0 = false;
        this.a = null;
        invalidate();
    }

    public final void b(float f, int i) {
        if (i == 6) {
            this.E = 0.0f;
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, hl.L(f));
        ofFloat.addUpdateListener(new wf4(this, (byte) 1));
        animatorSet.playTogether(ofFloat);
        animatorSet.setDuration(50L);
        animatorSet.addListener(new cg4(this, i, f, (byte) 0));
        animatorSet.start();
    }

    @Override // android.view.View
    public int getId() {
        return this.b.a;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        this.m0 = true;
        super.onAttachedToWindow();
        this.r = hm.update(this.b.g ? 26 : 0, this, this.r, this.s);
        this.P = hm.update(this.b.g ? 26 : 0, this, this.P, this.Q);
        this.R = hm.update(this.b.g ? 26 : 0, this, this.R, this.S);
        this.T = hm.update(this.b.g ? 26 : 0, this, this.T, this.U);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        this.m0 = false;
        super.onDetachedFromWindow();
        this.x = false;
        this.I = false;
        this.V = false;
        this.H = false;
        this.a0 = false;
        ValueAnimator valueAnimator = this.a;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.a.removeAllUpdateListeners();
            this.a.cancel();
            this.a = null;
        }
        invalidate();
        hm.release(this, this.r);
        hm.release(this, this.P);
        hm.release(this, this.R);
        hm.release(this, this.T);
    }

    /* JADX WARN: Removed duplicated region for block: B:173:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0569  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        int i7;
        int i8;
        String format;
        float f3;
        int L;
        int i9;
        String str;
        int i10;
        float f4;
        int i11;
        int i12;
        TextPaint textPaint;
        Paint paint;
        float f5;
        TextPaint textPaint2;
        vnb vnbVar;
        float f6;
        Paint paint2;
        float f7;
        int L2;
        int i13;
        float f8;
        RectF rectF;
        int L3;
        int lineBottom;
        int lineTop;
        int i14;
        TextPaint textPaint3;
        float f9;
        float f10;
        Canvas canvas2 = canvas;
        boolean z2 = this.b.e;
        fg4 fg4Var = this.n0;
        TextPaint textPaint4 = fg4Var.d;
        Paint paint3 = fg4Var.e;
        TextPaint textPaint5 = fg4Var.c;
        TextPaint textPaint6 = fg4Var.b;
        vnb vnbVar2 = fg4Var.a;
        if (fg4Var.w != 0.0f) {
            canvas2.save();
            float f11 = fg4Var.w;
            float sin = (float) Math.sin(((f11 * (this.e % 2 == 0 ? 1.0f : -1.0f)) + r8) * 3.141592653589793d * 2.5d);
            f = 0.0f;
            f2 = 400.0f;
            double elapsedRealtime = (float) ((SystemClock.elapsedRealtime() / 400.0f) * 3.141592653589793d * (this.e % 2 == 0 ? 1.0f : -1.0f));
            canvas2.translate((float) (Math.cos(elapsedRealtime) * hl.L(0.33f) * (this.e % 2 == 0 ? 1.0f : -1.0f)), (float) (Math.sin(elapsedRealtime) * (-hl.L(0.33f))));
            canvas2.rotate(1.4f * sin, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        } else {
            f = 0.0f;
            f2 = 400.0f;
        }
        int i15 = fg4Var.T;
        int i16 = fg4Var.M;
        if (i15 != -1) {
            i = i16;
            i16 = i15;
        } else {
            i = fg4Var.t0;
        }
        int i17 = this.b.a;
        if (i17 == i16) {
            i2 = fg4Var.a0;
            int i18 = fg4Var.f0;
            int i19 = fg4Var.b0;
            int i20 = fg4Var.g0;
            i5 = aob.T9;
            i6 = aob.U9;
            i3 = i20;
            i4 = i19;
            z = z2;
            i7 = i18;
        } else {
            i2 = fg4Var.b0;
            i3 = fg4Var.g0;
            i4 = fg4Var.a0;
            i5 = aob.U9;
            i6 = aob.T9;
            z = z2;
            i7 = i3;
        }
        if (i7 >= 0) {
            int v0 = aob.v0(i2, vnbVar2);
            int v02 = aob.v0(i7, vnbVar2);
            if ((fg4Var.Q || fg4Var.S != -1) && ((i8 = this.b.a) == i16 || i8 == i)) {
                textPaint6.setColor(vm2.f(fg4Var.R, vm2.f(fg4Var.y0, aob.v0(i4, vnbVar2), aob.v0(i3, vnbVar2)), vm2.f(fg4Var.y0, v0, v02)));
            } else {
                textPaint6.setColor(vm2.f(fg4Var.y0, v0, v02));
            }
        } else if ((fg4Var.Q || i15 != -1) && (i17 == i16 || i17 == i)) {
            textPaint6.setColor(vm2.f(fg4Var.R, aob.v0(i4, vnbVar2), aob.v0(i2, vnbVar2)));
        } else {
            textPaint6.setColor(aob.v0(i2, vnbVar2));
        }
        fg4Var.f = new PorterDuffColorFilter(textPaint6.getColor(), PorterDuff.Mode.SRC_IN);
        int i21 = this.K;
        boolean z3 = i21 == 0 && this.I;
        boolean z4 = i21 > 0 && this.b.d == 0 && this.I;
        boolean z5 = i21 > 0 && this.b.d > 0 && this.I;
        int i22 = this.b.d;
        if (i22 > 0 || z4) {
            format = z4 ? String.format("%d", Integer.valueOf(i21)) : String.format("%d", Integer.valueOf(i22));
            float ceil = (int) Math.ceil(textPaint5.measureText(format));
            f3 = ceil;
            L = hl.L(10.0f) + ((int) Math.max(hl.L(7.333f), ceil));
        } else {
            format = null;
            L = 0;
            f3 = f;
        }
        if (!z && (fg4Var.n || fg4Var.x != f)) {
            L = (int) (((hl.L(17.333f) - L) * fg4Var.x) + L);
        }
        int i23 = this.b.c;
        if (L == 0 || z4) {
            i9 = 0;
        } else {
            i9 = hl.L((format != null ? 1.0f : fg4Var.x) * (-2.0f)) + L;
        }
        this.d = i23 + i9;
        float measuredWidth = (getMeasuredWidth() - this.d) / 2.0f;
        if (this.H) {
            float f12 = this.y;
            measuredWidth = qd4.A(1.0f, f12, this.G, measuredWidth * f12);
        }
        if (TextUtils.equals(this.b.b, this.h)) {
            str = format;
            i10 = i16;
            f4 = measuredWidth;
            i11 = i;
            i12 = L;
        } else {
            this.h = this.b.b;
            f4 = measuredWidth;
            i11 = i;
            i12 = L;
            i10 = i16;
            str = format;
            StaticLayout staticLayout = new StaticLayout(this.h, textPaint6, hl.L(f2), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.s = staticLayout;
            this.r = hm.update(this.b.g ? 26 : 0, this, this.r, staticLayout);
            this.c = this.s.getHeight();
            this.w = (int) (-this.s.getLineLeft(0));
        }
        if (this.V) {
            float f13 = this.b0;
            boolean z6 = this.W;
            float f14 = this.y;
            if (!z6) {
                f14 = 1.0f - f14;
            }
            float f15 = f13 * f14;
            if (this.U != null) {
                canvas2.save();
                canvas2.translate(f4 + this.w + f15, ((getMeasuredHeight() - this.c) / 2.0f) + 1.0f);
                this.U.draw(canvas2);
                f9 = 6.0f;
                vnbVar = vnbVar2;
                textPaint3 = textPaint6;
                textPaint = textPaint4;
                f10 = 1.0f;
                hm.drawAnimatedEmojis(canvas2, this.U, this.T, 0.0f, null, computeVerticalScrollOffset() - hl.L(6.0f), computeVerticalScrollOffset() + computeVerticalScrollExtent(), 0.0f, 1.0f, fg4Var.f);
                canvas2.restore();
            } else {
                textPaint3 = textPaint6;
                f9 = 6.0f;
                textPaint = textPaint4;
                f10 = 1.0f;
                vnbVar = vnbVar2;
            }
            if (this.Q != null) {
                canvas2.save();
                int alpha = textPaint3.getAlpha();
                float f16 = alpha;
                boolean z7 = this.W;
                float f17 = this.y;
                if (z7) {
                    f17 = f10 - f17;
                }
                TextPaint textPaint7 = textPaint3;
                textPaint7.setAlpha((int) (f16 * f17));
                canvas2.translate(f4 + this.w + f15, ((getMeasuredHeight() - this.c) / 2.0f) + f10);
                this.Q.draw(canvas2);
                StaticLayout staticLayout2 = this.Q;
                dm dmVar = this.P;
                float computeVerticalScrollOffset = computeVerticalScrollOffset() - hl.L(f9);
                float computeVerticalScrollOffset2 = computeVerticalScrollOffset() + computeVerticalScrollExtent();
                boolean z8 = this.W;
                float f18 = this.y;
                if (z8) {
                    f18 = f10 - f18;
                }
                paint = paint3;
                f5 = f10;
                textPaint2 = textPaint7;
                hm.drawAnimatedEmojis(canvas2, staticLayout2, dmVar, 0.0f, null, computeVerticalScrollOffset, computeVerticalScrollOffset2, 0.0f, f18, fg4Var.f);
                canvas2.restore();
                textPaint2.setAlpha(alpha);
            } else {
                f5 = f10;
                textPaint2 = textPaint3;
                paint = paint3;
            }
            if (this.S != null) {
                canvas2.save();
                int alpha2 = textPaint2.getAlpha();
                float f19 = alpha2;
                boolean z9 = this.W;
                float f20 = this.y;
                if (!z9) {
                    f20 = f5 - f20;
                }
                textPaint2.setAlpha((int) (f19 * f20));
                canvas2.translate(f4 + this.w + f15, ((getMeasuredHeight() - this.c) / 2.0f) + f5);
                this.S.draw(canvas2);
                StaticLayout staticLayout3 = this.S;
                dm dmVar2 = this.R;
                float computeVerticalScrollOffset3 = computeVerticalScrollOffset() - hl.L(f9);
                float computeVerticalScrollOffset4 = computeVerticalScrollOffset() + computeVerticalScrollExtent();
                boolean z10 = this.W;
                float f21 = this.y;
                if (!z10) {
                    f21 = f5 - f21;
                }
                hm.drawAnimatedEmojis(canvas2, staticLayout3, dmVar2, 0.0f, null, computeVerticalScrollOffset3, computeVerticalScrollOffset4, 0.0f, f21, fg4Var.f);
                canvas2.restore();
                textPaint2.setAlpha(alpha2);
            }
            f6 = f15;
        } else {
            textPaint = textPaint4;
            paint = paint3;
            f5 = 1.0f;
            textPaint2 = textPaint6;
            vnbVar = vnbVar2;
            if (this.s != null) {
                canvas2.save();
                canvas2.translate(f4 + this.w, ((getMeasuredHeight() - this.c) / 2.0f) + 1.0f);
                this.s.draw(canvas2);
                hm.drawAnimatedEmojis(canvas2, this.s, this.r, 0.0f, null, computeVerticalScrollOffset() - hl.L(6.0f), computeVerticalScrollOffset() + computeVerticalScrollExtent(), 0.0f, 1.0f, fg4Var.f);
                canvas2.restore();
            }
            f6 = f;
        }
        String str2 = str;
        if (z3 || str2 != null || (!z && (fg4Var.n || fg4Var.x != f))) {
            if (fg4Var.h0 < 0) {
                textPaint5.setColor(aob.v0(fg4Var.d0, vnbVar));
            } else {
                textPaint5.setColor(vm2.f(fg4Var.y0, aob.v0(fg4Var.d0, vnbVar), aob.v0(fg4Var.h0, vnbVar)));
            }
            if (aob.d1(i5) && aob.d1(i6)) {
                int v03 = aob.v0(i5, vnbVar);
                if (fg4Var.Q || fg4Var.S != -1) {
                    int i24 = this.b.a;
                    if (i24 == i10) {
                        paint2 = paint;
                        i14 = i6;
                    } else if (i24 == i11) {
                        i14 = i6;
                        paint2 = paint;
                    }
                    paint2.setColor(vm2.f(fg4Var.R, aob.v0(i14, vnbVar), v03));
                }
                paint2 = paint;
                paint2.setColor(v03);
            } else {
                paint2 = paint;
                paint2.setColor(textPaint2.getColor());
            }
            float f22 = this.b.c;
            boolean z11 = this.V;
            if (z11) {
                float f23 = this.d0;
                float f24 = this.y;
                f22 = (f22 * f24) + ((f5 - f24) * f23);
            }
            if (z11 && this.S == null) {
                f7 = (f4 - this.b0) + f6 + f22;
                L2 = hl.L(5.0f);
            } else {
                f7 = f4 + f22;
                L2 = hl.L(5.0f);
            }
            float f25 = f7 + L2;
            int D = ik8.D(17.333f, getMeasuredHeight(), 2);
            if (z || ((!fg4Var.n && fg4Var.x == f) || str2 != null)) {
                paint2.setAlpha(jn7.d4);
            } else {
                paint2.setAlpha((int) (fg4Var.x * 255.0f));
            }
            if (z5) {
                float f26 = this.g0;
                i13 = i12;
                float f27 = i13;
                if (f26 != f27) {
                    float f28 = this.y;
                    f8 = (f27 * f28) + ((f5 - f28) * f26);
                    if (z5) {
                        float f29 = this.h0;
                        float f30 = this.y;
                        f3 = (f3 * f30) + ((f5 - f30) * f29);
                    }
                    float f31 = D;
                    float L4 = hl.L(17.333f) + D;
                    rectF = this.f;
                    rectF.set(f25, f31, f8 + f25, L4);
                    if (!z3 || z4) {
                        canvas2.save();
                        float f32 = this.y;
                        if (!z3) {
                            f32 = f5 - f32;
                        }
                        canvas2.scale(f32, f32, rectF.centerX(), rectF.centerY());
                    }
                    float f33 = hl.p * 11.5f;
                    canvas2.drawRoundRect(rectF, f33, f33, paint2);
                    if (!z5) {
                        if (this.L != null) {
                            L3 = hl.L(17.333f);
                            lineBottom = this.L.getLineBottom(0);
                            lineTop = this.L.getLineTop(0);
                        } else if (this.M != null) {
                            L3 = hl.L(17.333f);
                            lineBottom = this.M.getLineBottom(0);
                            lineTop = this.M.getLineTop(0);
                        } else {
                            if (this.N != null) {
                                L3 = hl.L(17.333f);
                                lineBottom = this.N.getLineBottom(0);
                                lineTop = this.N.getLineTop(0);
                            }
                            float L5 = f31 - hl.L(0.5f);
                            float f34 = z ? f5 - fg4Var.x : f5;
                            if (this.L != null) {
                                canvas2.save();
                                textPaint5.setAlpha((int) (f34 * 255.0f * this.y));
                                canvas2.translate(((rectF.width() - f3) / 2.0f) + rectF.left, ((f5 - this.y) * hl.L(15.0f)) + L5);
                                this.L.draw(canvas2);
                                canvas2.restore();
                            }
                            if (this.M != null) {
                                canvas2.save();
                                textPaint5.setAlpha((int) ((f5 - this.y) * f34 * 255.0f));
                                canvas2.translate(((rectF.width() - f3) / 2.0f) + rectF.left, (this.y * (-hl.L(15.0f))) + L5);
                                this.M.draw(canvas2);
                                canvas2.restore();
                            }
                            if (this.N != null) {
                                canvas2.save();
                                textPaint5.setAlpha((int) (f34 * 255.0f));
                                canvas2.translate(((rectF.width() - f3) / 2.0f) + rectF.left, L5);
                                this.N.draw(canvas2);
                                canvas2.restore();
                            }
                            textPaint5.setAlpha(jn7.d4);
                        }
                        f31 += (L3 - (lineBottom - lineTop)) / 2.0f;
                        float L52 = f31 - hl.L(0.5f);
                        if (z) {
                        }
                        if (this.L != null) {
                        }
                        if (this.M != null) {
                        }
                        if (this.N != null) {
                        }
                        textPaint5.setAlpha(jn7.d4);
                    } else if (str2 != null) {
                        if (!z) {
                            textPaint5.setAlpha((int) ((f5 - fg4Var.x) * 255.0f));
                        }
                        canvas2.drawText(str2, ((rectF.width() - f3) / 2.0f) + rectF.left, hl.L(12.5f) + D, textPaint5);
                    }
                    if (!z3 || z4) {
                        canvas2.restore();
                    }
                    if (!z && (fg4Var.n || fg4Var.x != f)) {
                        TextPaint textPaint8 = textPaint;
                        textPaint8.setColor(textPaint5.getColor());
                        textPaint8.setAlpha((int) (fg4Var.x * 255.0f));
                        float L6 = hl.L(3.0f);
                        canvas2.drawLine(rectF.centerX() - L6, rectF.centerY() - L6, rectF.centerX() + L6, rectF.centerY() + L6, textPaint8);
                        canvas2 = canvas;
                        canvas2.drawLine(rectF.centerX() - L6, rectF.centerY() + L6, rectF.centerX() + L6, rectF.centerY() - L6, textPaint8);
                    }
                }
            } else {
                i13 = i12;
            }
            f8 = i13;
            if (z5) {
            }
            float f312 = D;
            float L42 = hl.L(17.333f) + D;
            rectF = this.f;
            rectF.set(f25, f312, f8 + f25, L42);
            if (!z3) {
            }
            canvas2.save();
            float f322 = this.y;
            if (!z3) {
            }
            canvas2.scale(f322, f322, rectF.centerX(), rectF.centerY());
            float f332 = hl.p * 11.5f;
            canvas2.drawRoundRect(rectF, f332, f332, paint2);
            if (!z5) {
            }
            if (!z3) {
            }
            canvas2.restore();
            if (!z) {
                TextPaint textPaint82 = textPaint;
                textPaint82.setColor(textPaint5.getColor());
                textPaint82.setAlpha((int) (fg4Var.x * 255.0f));
                float L62 = hl.L(3.0f);
                canvas2.drawLine(rectF.centerX() - L62, rectF.centerY() - L62, rectF.centerX() + L62, rectF.centerY() + L62, textPaint82);
                canvas2 = canvas;
                canvas2.drawLine(rectF.centerX() - L62, rectF.centerY() + L62, rectF.centerX() + L62, rectF.centerY() - L62, textPaint82);
            }
        } else {
            i13 = i12;
        }
        float f35 = f3;
        if (fg4Var.w != f) {
            canvas2.restore();
        }
        this.F = f4;
        bg4 bg4Var = this.b;
        this.J = bg4Var.d;
        this.O = this.h;
        this.c0 = bg4Var.c;
        this.e0 = i13;
        this.f0 = f35;
        this.i0 = this.d;
        this.k0 = getMeasuredWidth();
        if (this.b.f || this.l0 != f) {
            if (fg4Var.v0 == null) {
                fg4Var.v0 = getContext().getDrawable(R.drawable.other_lockedfolders);
            }
            boolean z12 = this.b.f;
            float f36 = this.l0;
            if (!z12) {
                f36 -= 0.10666667f;
                this.l0 = f36;
            } else if (f36 != f5) {
                f36 += 0.10666667f;
                this.l0 = f36;
            }
            this.l0 = Utilities.i(f36, f5, f);
            int v04 = aob.v0(fg4Var.b0, vnbVar);
            int i25 = fg4Var.g0;
            if (i25 >= 0) {
                v04 = vm2.f(fg4Var.y0, v04, aob.v0(i25, vnbVar));
            }
            if (fg4Var.w0 != v04) {
                fg4Var.w0 = v04;
                fg4Var.v0.setColorFilter(new PorterDuffColorFilter(v04, PorterDuff.Mode.MULTIPLY));
            }
            int measuredWidth2 = (int) (((getMeasuredWidth() - fg4Var.v0.getIntrinsicWidth()) / 2.0f) + this.E);
            int measuredHeight = getMeasuredHeight() - hl.L(12.0f);
            Drawable drawable = fg4Var.v0;
            drawable.setBounds(measuredWidth2, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth2, fg4Var.v0.getIntrinsicHeight() + measuredHeight);
            if (this.l0 == 1.0f) {
                fg4Var.v0.draw(canvas2);
                return;
            }
            canvas2.save();
            float f37 = this.l0;
            canvas2.scale(f37, f37, fg4Var.v0.getBounds().centerX(), fg4Var.v0.getBounds().centerY());
            fg4Var.v0.draw(canvas2);
            canvas2.restore();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        bg4 bg4Var = this.b;
        accessibilityNodeInfo.setSelected((bg4Var == null || (i = this.n0.M) == -1 || bg4Var.a != i) ? false : true);
        accessibilityNodeInfo.addAction(16);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, ob6.M0(2131754811, null)));
        if (this.b != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.b.b);
            bg4 bg4Var2 = this.b;
            int i2 = bg4Var2 != null ? bg4Var2.d : 0;
            if (i2 > 0) {
                sb.append("\n");
                sb.append(ob6.G(i2, "AccDescrUnreadCount", new Object[0]));
            }
            accessibilityNodeInfo.setContentDescription(sb);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(hl.L(24.0f) + this.b.a(false) + this.n0.O, View.MeasureSpec.getSize(i2));
    }
}
