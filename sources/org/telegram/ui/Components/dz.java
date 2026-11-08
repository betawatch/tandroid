package org.telegram.ui.Components;

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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class dz extends View {
    public float D;
    public float E;
    public float F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public StaticLayout K;
    public StaticLayout L;
    public StaticLayout M;
    public CharSequence N;
    public n5 O;
    public StaticLayout P;
    public n5 Q;
    public StaticLayout R;
    public n5 S;
    public StaticLayout T;
    public boolean U;
    public boolean V;
    public boolean W;
    public ValueAnimator a;
    public float a0;
    public cz b;
    public int b0;
    public int c;
    public int c0;
    public int d;
    public int d0;
    public int e;
    public float e0;
    public final RectF f;
    public float f0;
    public float g0;
    public CharSequence h;
    public float h0;
    public float i0;
    public float j0;
    public float k0;
    public boolean l0;
    public final /* synthetic */ fz m0;
    public boolean n;
    public n5 r;
    public StaticLayout s;
    public int w;
    public boolean x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dz(fz fzVar, Context context) {
        super(context);
        this.m0 = fzVar;
        this.f = new RectF();
        this.I = -1;
    }

    public final void a() {
        this.x = false;
        this.H = false;
        this.U = false;
        this.G = false;
        this.W = false;
        this.a = null;
        invalidate();
    }

    public final void b(float f10, int i7) {
        if (i7 == 6) {
            this.D = 0.0f;
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, org.telegram.messenger.g0.L(f10));
        ofFloat.addUpdateListener(new yy(this, 1));
        animatorSet.playTogether(ofFloat);
        animatorSet.setDuration(50L);
        animatorSet.addListener(new bi.yd(this, i7, f10, 1));
        animatorSet.start();
    }

    @Override // android.view.View
    public int getId() {
        return this.b.a;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        this.l0 = true;
        super.onAttachedToWindow();
        this.r = r5.update(this.b.g ? 26 : 0, this, this.r, this.s);
        this.O = r5.update(this.b.g ? 26 : 0, this, this.O, this.P);
        this.Q = r5.update(this.b.g ? 26 : 0, this, this.Q, this.R);
        this.S = r5.update(this.b.g ? 26 : 0, this, this.S, this.T);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        this.l0 = false;
        super.onDetachedFromWindow();
        this.x = false;
        this.H = false;
        this.U = false;
        this.G = false;
        this.W = false;
        ValueAnimator valueAnimator = this.a;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.a.removeAllUpdateListeners();
            this.a.cancel();
            this.a = null;
        }
        invalidate();
        r5.release(this, this.r);
        r5.release(this, this.O);
        r5.release(this, this.Q);
        r5.release(this, this.S);
    }

    /* JADX WARN: Code restructure failed: missing block: B:266:0x011f, code lost:
    
        if (r12.Q == (-1)) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x078c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x079a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x07de  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0805  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x058f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z9;
        int i16;
        String format;
        float f12;
        int L;
        int i17;
        String str;
        float f13;
        int i18;
        int i19;
        int i20;
        TextPaint textPaint;
        Paint paint;
        float f14;
        float f15;
        TextPaint textPaint2;
        org.telegram.ui.ActionBar.f6 f6Var;
        float f16;
        Paint paint2;
        int i21;
        float f17;
        RectF rectF;
        int L2;
        int lineBottom;
        int lineTop;
        int i22;
        int w02;
        int i23;
        float f18;
        float f19;
        TextPaint textPaint3;
        float f20;
        float f21;
        Canvas canvas2 = canvas;
        boolean z10 = this.b.e;
        fz fzVar = this.m0;
        TextPaint textPaint4 = fzVar.d;
        Paint paint3 = fzVar.e;
        TextPaint textPaint5 = fzVar.c;
        TextPaint textPaint6 = fzVar.b;
        org.telegram.ui.ActionBar.f6 f6Var2 = fzVar.a;
        if (fzVar.w != 0.0f) {
            canvas2.save();
            float f22 = fzVar.w;
            float sin = (float) Math.sin(((f22 * (this.e % 2 == 0 ? 1.0f : -1.0f)) + r8) * 3.141592653589793d * 2.5d);
            f10 = 0.0f;
            f11 = 400.0f;
            double elapsedRealtime = (float) ((SystemClock.elapsedRealtime() / 400.0f) * 3.141592653589793d * (this.e % 2 == 0 ? 1.0f : -1.0f));
            canvas2.translate((float) (Math.cos(elapsedRealtime) * org.telegram.messenger.g0.L(0.33f) * (this.e % 2 == 0 ? 1.0f : -1.0f)), (float) (Math.sin(elapsedRealtime) * (-org.telegram.messenger.g0.L(0.33f))));
            canvas2.rotate(1.4f * sin, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        } else {
            f10 = 0.0f;
            f11 = 400.0f;
        }
        int i24 = fzVar.R;
        if (i24 != -1) {
            i10 = fzVar.L;
            i7 = i24;
        } else {
            i7 = fzVar.L;
            i10 = fzVar.r0;
        }
        int i25 = this.b.a;
        if (i25 == i7) {
            i11 = fzVar.V;
            int i26 = fzVar.d0;
            int i27 = fzVar.W;
            int i28 = fzVar.e0;
            i14 = org.telegram.ui.ActionBar.k6.T9;
            i15 = org.telegram.ui.ActionBar.k6.U9;
            i12 = i28;
            i13 = i27;
            z9 = z10;
            i16 = i26;
        } else {
            i11 = fzVar.W;
            i12 = fzVar.e0;
            i13 = fzVar.V;
            i14 = org.telegram.ui.ActionBar.k6.U9;
            i15 = org.telegram.ui.ActionBar.k6.T9;
            z9 = z10;
            i16 = i12;
        }
        if (i16 >= 0) {
            int w03 = org.telegram.ui.ActionBar.k6.w0(i11, f6Var2);
            int w04 = org.telegram.ui.ActionBar.k6.w0(i16, f6Var2);
            if (fzVar.O) {
            }
            int i29 = this.b.a;
            if (i29 == i7 || i29 == i10) {
                textPaint6.setColor(i0.a.f(fzVar.P, i0.a.f(fzVar.w0, org.telegram.ui.ActionBar.k6.w0(i13, f6Var2), org.telegram.ui.ActionBar.k6.w0(i12, f6Var2)), i0.a.f(fzVar.w0, w03, w04)));
            }
            textPaint6.setColor(i0.a.f(fzVar.w0, w03, w04));
        } else if ((fzVar.O || i24 != -1) && (i25 == i7 || i25 == i10)) {
            textPaint6.setColor(i0.a.f(fzVar.P, org.telegram.ui.ActionBar.k6.w0(i13, f6Var2), org.telegram.ui.ActionBar.k6.w0(i11, f6Var2)));
        } else {
            textPaint6.setColor(org.telegram.ui.ActionBar.k6.w0(i11, f6Var2));
        }
        fzVar.f = new PorterDuffColorFilter(textPaint6.getColor(), PorterDuff.Mode.SRC_IN);
        int i30 = this.J;
        boolean z11 = i30 == 0 && this.H;
        boolean z12 = i30 > 0 && this.b.d == 0 && this.H;
        boolean z13 = i30 > 0 && this.b.d > 0 && this.H;
        int i31 = this.b.d;
        if (i31 > 0 || z12) {
            format = z12 ? String.format("%d", Integer.valueOf(i30)) : String.format("%d", Integer.valueOf(i31));
            float ceil = (int) Math.ceil(textPaint5.measureText(format));
            f12 = ceil;
            L = org.telegram.messenger.g0.L(10.0f) + ((int) Math.max(org.telegram.messenger.g0.L(7.333f), ceil));
        } else {
            format = null;
            L = 0;
            f12 = f10;
        }
        if (!z9 && (fzVar.n || fzVar.x != f10)) {
            L = (int) (((org.telegram.messenger.g0.L(17.333f) - L) * fzVar.x) + L);
        }
        int i32 = this.b.c;
        if (L == 0 || z12) {
            i17 = 0;
        } else {
            i17 = org.telegram.messenger.g0.L((format != null ? 1.0f : fzVar.x) * (-2.0f)) + L;
        }
        this.d = i32 + i17;
        float measuredWidth = (getMeasuredWidth() - this.d) / 2.0f;
        if (this.G) {
            float f23 = this.y;
            measuredWidth = com.google.android.recaptcha.internal.a.z(1.0f, f23, this.F, measuredWidth * f23);
        }
        if (TextUtils.equals(this.b.b, this.h)) {
            str = format;
            f13 = measuredWidth;
            i18 = i7;
            i19 = i10;
            i20 = L;
        } else {
            this.h = this.b.b;
            i18 = i7;
            i19 = i10;
            i20 = L;
            f13 = measuredWidth;
            str = format;
            StaticLayout staticLayout = new StaticLayout(this.h, textPaint6, org.telegram.messenger.g0.L(f11), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.s = staticLayout;
            this.r = r5.update(this.b.g ? 26 : 0, this, this.r, staticLayout);
            this.c = this.s.getHeight();
            this.w = (int) (-this.s.getLineLeft(0));
        }
        if (this.U) {
            float f24 = this.a0;
            if (this.V) {
                f19 = this.y;
                f18 = 1.0f;
            } else {
                f18 = 1.0f;
                f19 = 1.0f - this.y;
            }
            float f25 = f24 * f19;
            if (this.T != null) {
                canvas2.save();
                f14 = f13;
                canvas2.translate(f14 + this.w + f25, ((getMeasuredHeight() - this.c) / 2.0f) + f18);
                this.T.draw(canvas2);
                textPaint3 = textPaint6;
                f20 = 6.0f;
                f6Var = f6Var2;
                textPaint = textPaint4;
                f21 = f18;
                r5.drawAnimatedEmojis(canvas2, this.T, this.S, 0.0f, null, computeVerticalScrollOffset() - org.telegram.messenger.g0.L(6.0f), computeVerticalScrollOffset() + computeVerticalScrollExtent(), 0.0f, 1.0f, fzVar.f);
                canvas2.restore();
            } else {
                textPaint3 = textPaint6;
                f20 = 6.0f;
                textPaint = textPaint4;
                f21 = f18;
                f14 = f13;
                f6Var = f6Var2;
            }
            if (this.P != null) {
                canvas2.save();
                int alpha = textPaint3.getAlpha();
                TextPaint textPaint7 = textPaint3;
                textPaint7.setAlpha((int) (alpha * (this.V ? f21 - this.y : this.y)));
                canvas2.translate(f14 + this.w + f25, ((getMeasuredHeight() - this.c) / 2.0f) + f21);
                this.P.draw(canvas2);
                StaticLayout staticLayout2 = this.P;
                n5 n5Var = this.O;
                float computeVerticalScrollOffset = computeVerticalScrollOffset() - org.telegram.messenger.g0.L(f20);
                float computeVerticalScrollOffset2 = computeVerticalScrollOffset() + computeVerticalScrollExtent();
                float f26 = this.V ? f21 - this.y : this.y;
                f15 = f21;
                textPaint2 = textPaint7;
                paint = paint3;
                r5.drawAnimatedEmojis(canvas2, staticLayout2, n5Var, 0.0f, null, computeVerticalScrollOffset, computeVerticalScrollOffset2, 0.0f, f26, fzVar.f);
                canvas2.restore();
                textPaint2.setAlpha(alpha);
            } else {
                f15 = f21;
                textPaint2 = textPaint3;
                paint = paint3;
            }
            if (this.R != null) {
                canvas2.save();
                int alpha2 = textPaint2.getAlpha();
                textPaint2.setAlpha((int) (alpha2 * (this.V ? this.y : f15 - this.y)));
                canvas2.translate(f14 + this.w + f25, ((getMeasuredHeight() - this.c) / 2.0f) + f15);
                this.R.draw(canvas2);
                r5.drawAnimatedEmojis(canvas2, this.R, this.Q, 0.0f, null, computeVerticalScrollOffset() - org.telegram.messenger.g0.L(f20), computeVerticalScrollOffset() + computeVerticalScrollExtent(), 0.0f, this.V ? this.y : f15 - this.y, fzVar.f);
                canvas2.restore();
                textPaint2.setAlpha(alpha2);
            }
            f16 = f25;
        } else {
            textPaint = textPaint4;
            paint = paint3;
            f14 = f13;
            f15 = 1.0f;
            textPaint2 = textPaint6;
            f6Var = f6Var2;
            if (this.s != null) {
                canvas2.save();
                canvas2.translate(f14 + this.w, ((getMeasuredHeight() - this.c) / 2.0f) + 1.0f);
                this.s.draw(canvas2);
                r5.drawAnimatedEmojis(canvas2, this.s, this.r, 0.0f, null, computeVerticalScrollOffset() - org.telegram.messenger.g0.L(6.0f), computeVerticalScrollOffset() + computeVerticalScrollExtent(), 0.0f, 1.0f, fzVar.f);
                canvas2.restore();
            }
            f16 = f10;
        }
        String str2 = str;
        if (z11 || str2 != null || (!z9 && (fzVar.n || fzVar.x != f10))) {
            if (fzVar.f0 < 0) {
                textPaint5.setColor(org.telegram.ui.ActionBar.k6.w0(fzVar.b0, f6Var));
            } else {
                textPaint5.setColor(i0.a.f(fzVar.w0, org.telegram.ui.ActionBar.k6.w0(fzVar.b0, f6Var), org.telegram.ui.ActionBar.k6.w0(fzVar.f0, f6Var)));
            }
            if (org.telegram.ui.ActionBar.k6.f1(i14) && org.telegram.ui.ActionBar.k6.f1(i15)) {
                int w05 = org.telegram.ui.ActionBar.k6.w0(i14, f6Var);
                if (fzVar.O || fzVar.Q != -1) {
                    int i33 = this.b.a;
                    if (i33 == i18) {
                        paint2 = paint;
                        i22 = i15;
                    } else if (i33 == i19) {
                        i22 = i15;
                        paint2 = paint;
                    }
                    paint2.setColor(i0.a.f(fzVar.P, org.telegram.ui.ActionBar.k6.w0(i22, f6Var), w05));
                }
                paint2 = paint;
                paint2.setColor(w05);
            } else {
                paint2 = paint;
                paint2.setColor(textPaint2.getColor());
            }
            float f27 = this.b.c;
            boolean z14 = this.U;
            if (z14) {
                float f28 = this.c0;
                float f29 = this.y;
                f27 = (f27 * f29) + ((f15 - f29) * f28);
            }
            float L3 = (z14 && this.R == null) ? (f14 - this.a0) + f16 + f27 + org.telegram.messenger.g0.L(5.0f) : f14 + f27 + org.telegram.messenger.g0.L(5.0f);
            int y10 = org.telegram.messenger.camera.q.y(17.333f, getMeasuredHeight(), 2);
            if (z9 || ((!fzVar.n && fzVar.x == f10) || str2 != null)) {
                paint2.setAlpha(org.telegram.messenger.qs.e4);
            } else {
                paint2.setAlpha((int) (fzVar.x * 255.0f));
            }
            if (z13) {
                float f30 = this.f0;
                i21 = i20;
                float f31 = i21;
                if (f30 != f31) {
                    float f32 = this.y;
                    f17 = (f31 * f32) + ((f15 - f32) * f30);
                    if (z13) {
                        float f33 = this.g0;
                        float f34 = this.y;
                        f12 = (f12 * f34) + ((f15 - f34) * f33);
                    }
                    float f35 = y10;
                    float L4 = org.telegram.messenger.g0.L(17.333f) + y10;
                    rectF = this.f;
                    rectF.set(L3, f35, f17 + L3, L4);
                    if (!z11 || z12) {
                        canvas2.save();
                        float f36 = !z11 ? this.y : f15 - this.y;
                        canvas2.scale(f36, f36, rectF.centerX(), rectF.centerY());
                    }
                    float f37 = org.telegram.messenger.g0.p * 11.5f;
                    canvas2.drawRoundRect(rectF, f37, f37, paint2);
                    if (!z13) {
                        if (this.K != null) {
                            L2 = org.telegram.messenger.g0.L(17.333f);
                            lineBottom = this.K.getLineBottom(0);
                            lineTop = this.K.getLineTop(0);
                        } else if (this.L != null) {
                            L2 = org.telegram.messenger.g0.L(17.333f);
                            lineBottom = this.L.getLineBottom(0);
                            lineTop = this.L.getLineTop(0);
                        } else {
                            if (this.M != null) {
                                L2 = org.telegram.messenger.g0.L(17.333f);
                                lineBottom = this.M.getLineBottom(0);
                                lineTop = this.M.getLineTop(0);
                            }
                            float L5 = f35 - org.telegram.messenger.g0.L(0.5f);
                            float f38 = z9 ? f15 - fzVar.x : f15;
                            if (this.K != null) {
                                canvas2.save();
                                textPaint5.setAlpha((int) (f38 * 255.0f * this.y));
                                canvas2.translate(((rectF.width() - f12) / 2.0f) + rectF.left, ((f15 - this.y) * org.telegram.messenger.g0.L(15.0f)) + L5);
                                this.K.draw(canvas2);
                                canvas2.restore();
                            }
                            if (this.L != null) {
                                canvas2.save();
                                textPaint5.setAlpha((int) ((f15 - this.y) * f38 * 255.0f));
                                canvas2.translate(((rectF.width() - f12) / 2.0f) + rectF.left, (this.y * (-org.telegram.messenger.g0.L(15.0f))) + L5);
                                this.L.draw(canvas2);
                                canvas2.restore();
                            }
                            if (this.M != null) {
                                canvas2.save();
                                textPaint5.setAlpha((int) (f38 * 255.0f));
                                canvas2.translate(((rectF.width() - f12) / 2.0f) + rectF.left, L5);
                                this.M.draw(canvas2);
                                canvas2.restore();
                            }
                            textPaint5.setAlpha(org.telegram.messenger.qs.e4);
                        }
                        f35 += (L2 - (lineBottom - lineTop)) / 2.0f;
                        float L52 = f35 - org.telegram.messenger.g0.L(0.5f);
                        if (z9) {
                        }
                        if (this.K != null) {
                        }
                        if (this.L != null) {
                        }
                        if (this.M != null) {
                        }
                        textPaint5.setAlpha(org.telegram.messenger.qs.e4);
                    } else if (str2 != null) {
                        if (!z9) {
                            textPaint5.setAlpha((int) ((f15 - fzVar.x) * 255.0f));
                        }
                        canvas2.drawText(str2, ((rectF.width() - f12) / 2.0f) + rectF.left, org.telegram.messenger.g0.L(12.5f) + y10, textPaint5);
                    }
                    if (!z11 || z12) {
                        canvas2.restore();
                    }
                    if (!z9 && (fzVar.n || fzVar.x != f10)) {
                        TextPaint textPaint8 = textPaint;
                        textPaint8.setColor(textPaint5.getColor());
                        textPaint8.setAlpha((int) (fzVar.x * 255.0f));
                        float L6 = org.telegram.messenger.g0.L(3.0f);
                        canvas2.drawLine(rectF.centerX() - L6, rectF.centerY() - L6, rectF.centerX() + L6, rectF.centerY() + L6, textPaint8);
                        canvas2 = canvas;
                        canvas2.drawLine(rectF.centerX() - L6, rectF.centerY() + L6, rectF.centerX() + L6, rectF.centerY() - L6, textPaint8);
                    }
                }
            } else {
                i21 = i20;
            }
            f17 = i21;
            if (z13) {
            }
            float f352 = y10;
            float L42 = org.telegram.messenger.g0.L(17.333f) + y10;
            rectF = this.f;
            rectF.set(L3, f352, f17 + L3, L42);
            if (!z11) {
            }
            canvas2.save();
            if (!z11) {
            }
            canvas2.scale(f36, f36, rectF.centerX(), rectF.centerY());
            float f372 = org.telegram.messenger.g0.p * 11.5f;
            canvas2.drawRoundRect(rectF, f372, f372, paint2);
            if (!z13) {
            }
            if (!z11) {
            }
            canvas2.restore();
            if (!z9) {
                TextPaint textPaint82 = textPaint;
                textPaint82.setColor(textPaint5.getColor());
                textPaint82.setAlpha((int) (fzVar.x * 255.0f));
                float L62 = org.telegram.messenger.g0.L(3.0f);
                canvas2.drawLine(rectF.centerX() - L62, rectF.centerY() - L62, rectF.centerX() + L62, rectF.centerY() + L62, textPaint82);
                canvas2 = canvas;
                canvas2.drawLine(rectF.centerX() - L62, rectF.centerY() + L62, rectF.centerX() + L62, rectF.centerY() - L62, textPaint82);
            }
        } else {
            i21 = i20;
        }
        float f39 = f12;
        if (fzVar.w != f10) {
            canvas2.restore();
        }
        this.E = f14;
        cz czVar = this.b;
        this.I = czVar.d;
        this.N = this.h;
        this.b0 = czVar.c;
        this.d0 = i21;
        this.e0 = f39;
        this.h0 = this.d;
        this.j0 = getMeasuredWidth();
        if (!this.b.f && this.k0 == f10) {
            return;
        }
        if (fzVar.t0 == null) {
            fzVar.t0 = getContext().getDrawable(R.drawable.other_lockedfolders);
        }
        boolean z15 = this.b.f;
        if (z15) {
            float f40 = this.k0;
            if (f40 != f15) {
                this.k0 = f40 + 0.10666667f;
                this.k0 = Utilities.i(this.k0, f15, f10);
                w02 = org.telegram.ui.ActionBar.k6.w0(fzVar.W, f6Var);
                i23 = fzVar.e0;
                if (i23 >= 0) {
                    w02 = i0.a.f(fzVar.w0, w02, org.telegram.ui.ActionBar.k6.w0(i23, f6Var));
                }
                if (fzVar.u0 != w02) {
                    fzVar.u0 = w02;
                    fzVar.t0.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
                }
                int measuredWidth2 = (int) (((getMeasuredWidth() - fzVar.t0.getIntrinsicWidth()) / 2.0f) + this.D);
                int measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(12.0f);
                Drawable drawable = fzVar.t0;
                drawable.setBounds(measuredWidth2, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth2, fzVar.t0.getIntrinsicHeight() + measuredHeight);
                if (this.k0 != 1.0f) {
                    fzVar.t0.draw(canvas2);
                    return;
                }
                canvas2.save();
                float f41 = this.k0;
                canvas2.scale(f41, f41, fzVar.t0.getBounds().centerX(), fzVar.t0.getBounds().centerY());
                fzVar.t0.draw(canvas2);
                canvas2.restore();
                return;
            }
        }
        if (!z15) {
            this.k0 -= 0.10666667f;
        }
        this.k0 = Utilities.i(this.k0, f15, f10);
        w02 = org.telegram.ui.ActionBar.k6.w0(fzVar.W, f6Var);
        i23 = fzVar.e0;
        if (i23 >= 0) {
        }
        if (fzVar.u0 != w02) {
        }
        int measuredWidth22 = (int) (((getMeasuredWidth() - fzVar.t0.getIntrinsicWidth()) / 2.0f) + this.D);
        int measuredHeight2 = getMeasuredHeight() - org.telegram.messenger.g0.L(12.0f);
        Drawable drawable2 = fzVar.t0;
        drawable2.setBounds(measuredWidth22, measuredHeight2, drawable2.getIntrinsicWidth() + measuredWidth22, fzVar.t0.getIntrinsicHeight() + measuredHeight2);
        if (this.k0 != 1.0f) {
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i7;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        cz czVar = this.b;
        accessibilityNodeInfo.setSelected((czVar == null || (i7 = this.m0.L) == -1 || czVar.a != i7) ? false : true);
        accessibilityNodeInfo.addAction(16);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, org.telegram.messenger.id.M0(2131754816, null)));
        if (this.b != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.b.b);
            cz czVar2 = this.b;
            int i10 = czVar2 != null ? czVar2.d : 0;
            if (i10 > 0) {
                sb2.append("\n");
                sb2.append(org.telegram.messenger.id.G(i10, "AccDescrUnreadCount", new Object[0]));
            }
            accessibilityNodeInfo.setContentDescription(sb2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(24.0f) + this.b.a(false) + this.m0.N, View.MeasureSpec.getSize(i10));
    }
}
