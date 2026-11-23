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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class pz extends View {
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
    public u5 P;
    public StaticLayout Q;
    public u5 R;
    public StaticLayout S;
    public u5 T;
    public StaticLayout U;
    public boolean V;
    public boolean W;
    public ValueAnimator a;
    public boolean a0;
    public oz b;
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
    public final /* synthetic */ rz n0;
    public u5 r;
    public StaticLayout s;
    public int w;
    public boolean x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pz(rz rzVar, Context context) {
        super(context);
        this.n0 = rzVar;
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

    public final void b(float f10, int i7) {
        if (i7 == 6) {
            this.E = 0.0f;
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, org.telegram.messenger.g0.L(f10));
        ofFloat.addUpdateListener(new jz(this, 1));
        animatorSet.playTogether(ofFloat);
        animatorSet.setDuration(50L);
        animatorSet.addListener(new di.ic(this, i7, f10, 1));
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
        this.r = y5.update(this.b.g ? 26 : 0, this, this.r, this.s);
        this.P = y5.update(this.b.g ? 26 : 0, this, this.P, this.Q);
        this.R = y5.update(this.b.g ? 26 : 0, this, this.R, this.S);
        this.T = y5.update(this.b.g ? 26 : 0, this, this.T, this.U);
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
        y5.release(this, this.r);
        y5.release(this, this.P);
        y5.release(this, this.R);
        y5.release(this, this.T);
    }

    /* JADX WARN: Code restructure failed: missing block: B:266:0x011f, code lost:
    
        if (r12.R == (-1)) goto L49;
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
        boolean z10;
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
        org.telegram.ui.ActionBar.h6 h6Var;
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
        boolean z11 = this.b.e;
        rz rzVar = this.n0;
        TextPaint textPaint4 = rzVar.d;
        Paint paint3 = rzVar.e;
        TextPaint textPaint5 = rzVar.c;
        TextPaint textPaint6 = rzVar.b;
        org.telegram.ui.ActionBar.h6 h6Var2 = rzVar.a;
        if (rzVar.w != 0.0f) {
            canvas2.save();
            float f22 = rzVar.w;
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
        int i24 = rzVar.S;
        if (i24 != -1) {
            i10 = rzVar.M;
            i7 = i24;
        } else {
            i7 = rzVar.M;
            i10 = rzVar.s0;
        }
        int i25 = this.b.a;
        if (i25 == i7) {
            i11 = rzVar.W;
            int i26 = rzVar.e0;
            int i27 = rzVar.a0;
            int i28 = rzVar.f0;
            i14 = org.telegram.ui.ActionBar.m6.T9;
            i15 = org.telegram.ui.ActionBar.m6.U9;
            i12 = i28;
            i13 = i27;
            z10 = z11;
            i16 = i26;
        } else {
            i11 = rzVar.a0;
            i12 = rzVar.f0;
            i13 = rzVar.W;
            i14 = org.telegram.ui.ActionBar.m6.U9;
            i15 = org.telegram.ui.ActionBar.m6.T9;
            z10 = z11;
            i16 = i12;
        }
        if (i16 >= 0) {
            int w03 = org.telegram.ui.ActionBar.m6.w0(i11, h6Var2);
            int w04 = org.telegram.ui.ActionBar.m6.w0(i16, h6Var2);
            if (rzVar.P) {
            }
            int i29 = this.b.a;
            if (i29 == i7 || i29 == i10) {
                textPaint6.setColor(i0.a.f(rzVar.Q, i0.a.f(rzVar.x0, org.telegram.ui.ActionBar.m6.w0(i13, h6Var2), org.telegram.ui.ActionBar.m6.w0(i12, h6Var2)), i0.a.f(rzVar.x0, w03, w04)));
            }
            textPaint6.setColor(i0.a.f(rzVar.x0, w03, w04));
        } else if ((rzVar.P || i24 != -1) && (i25 == i7 || i25 == i10)) {
            textPaint6.setColor(i0.a.f(rzVar.Q, org.telegram.ui.ActionBar.m6.w0(i13, h6Var2), org.telegram.ui.ActionBar.m6.w0(i11, h6Var2)));
        } else {
            textPaint6.setColor(org.telegram.ui.ActionBar.m6.w0(i11, h6Var2));
        }
        rzVar.f = new PorterDuffColorFilter(textPaint6.getColor(), PorterDuff.Mode.SRC_IN);
        int i30 = this.K;
        boolean z12 = i30 == 0 && this.I;
        boolean z13 = i30 > 0 && this.b.d == 0 && this.I;
        boolean z14 = i30 > 0 && this.b.d > 0 && this.I;
        int i31 = this.b.d;
        if (i31 > 0 || z13) {
            format = z13 ? String.format("%d", Integer.valueOf(i30)) : String.format("%d", Integer.valueOf(i31));
            float ceil = (int) Math.ceil(textPaint5.measureText(format));
            f12 = ceil;
            L = org.telegram.messenger.g0.L(10.0f) + ((int) Math.max(org.telegram.messenger.g0.L(7.333f), ceil));
        } else {
            format = null;
            L = 0;
            f12 = f10;
        }
        if (!z10 && (rzVar.n || rzVar.x != f10)) {
            L = (int) (((org.telegram.messenger.g0.L(17.333f) - L) * rzVar.x) + L);
        }
        int i32 = this.b.c;
        if (L == 0 || z13) {
            i17 = 0;
        } else {
            i17 = org.telegram.messenger.g0.L((format != null ? 1.0f : rzVar.x) * (-2.0f)) + L;
        }
        this.d = i32 + i17;
        float measuredWidth = (getMeasuredWidth() - this.d) / 2.0f;
        if (this.H) {
            float f23 = this.y;
            measuredWidth = com.google.android.gms.internal.vision.e2.z(1.0f, f23, this.G, measuredWidth * f23);
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
            this.r = y5.update(this.b.g ? 26 : 0, this, this.r, staticLayout);
            this.c = this.s.getHeight();
            this.w = (int) (-this.s.getLineLeft(0));
        }
        if (this.V) {
            float f24 = this.b0;
            if (this.W) {
                f19 = this.y;
                f18 = 1.0f;
            } else {
                f18 = 1.0f;
                f19 = 1.0f - this.y;
            }
            float f25 = f24 * f19;
            if (this.U != null) {
                canvas2.save();
                f14 = f13;
                canvas2.translate(f14 + this.w + f25, ((getMeasuredHeight() - this.c) / 2.0f) + f18);
                this.U.draw(canvas2);
                textPaint3 = textPaint6;
                f20 = 6.0f;
                h6Var = h6Var2;
                textPaint = textPaint4;
                f21 = f18;
                y5.drawAnimatedEmojis(canvas2, this.U, this.T, 0.0f, null, computeVerticalScrollOffset() - org.telegram.messenger.g0.L(6.0f), computeVerticalScrollOffset() + computeVerticalScrollExtent(), 0.0f, 1.0f, rzVar.f);
                canvas2.restore();
            } else {
                textPaint3 = textPaint6;
                f20 = 6.0f;
                textPaint = textPaint4;
                f21 = f18;
                f14 = f13;
                h6Var = h6Var2;
            }
            if (this.Q != null) {
                canvas2.save();
                int alpha = textPaint3.getAlpha();
                TextPaint textPaint7 = textPaint3;
                textPaint7.setAlpha((int) (alpha * (this.W ? f21 - this.y : this.y)));
                canvas2.translate(f14 + this.w + f25, ((getMeasuredHeight() - this.c) / 2.0f) + f21);
                this.Q.draw(canvas2);
                StaticLayout staticLayout2 = this.Q;
                u5 u5Var = this.P;
                float computeVerticalScrollOffset = computeVerticalScrollOffset() - org.telegram.messenger.g0.L(f20);
                float computeVerticalScrollOffset2 = computeVerticalScrollOffset() + computeVerticalScrollExtent();
                float f26 = this.W ? f21 - this.y : this.y;
                f15 = f21;
                textPaint2 = textPaint7;
                paint = paint3;
                y5.drawAnimatedEmojis(canvas2, staticLayout2, u5Var, 0.0f, null, computeVerticalScrollOffset, computeVerticalScrollOffset2, 0.0f, f26, rzVar.f);
                canvas2.restore();
                textPaint2.setAlpha(alpha);
            } else {
                f15 = f21;
                textPaint2 = textPaint3;
                paint = paint3;
            }
            if (this.S != null) {
                canvas2.save();
                int alpha2 = textPaint2.getAlpha();
                textPaint2.setAlpha((int) (alpha2 * (this.W ? this.y : f15 - this.y)));
                canvas2.translate(f14 + this.w + f25, ((getMeasuredHeight() - this.c) / 2.0f) + f15);
                this.S.draw(canvas2);
                y5.drawAnimatedEmojis(canvas2, this.S, this.R, 0.0f, null, computeVerticalScrollOffset() - org.telegram.messenger.g0.L(f20), computeVerticalScrollOffset() + computeVerticalScrollExtent(), 0.0f, this.W ? this.y : f15 - this.y, rzVar.f);
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
            h6Var = h6Var2;
            if (this.s != null) {
                canvas2.save();
                canvas2.translate(f14 + this.w, ((getMeasuredHeight() - this.c) / 2.0f) + 1.0f);
                this.s.draw(canvas2);
                y5.drawAnimatedEmojis(canvas2, this.s, this.r, 0.0f, null, computeVerticalScrollOffset() - org.telegram.messenger.g0.L(6.0f), computeVerticalScrollOffset() + computeVerticalScrollExtent(), 0.0f, 1.0f, rzVar.f);
                canvas2.restore();
            }
            f16 = f10;
        }
        String str2 = str;
        if (z12 || str2 != null || (!z10 && (rzVar.n || rzVar.x != f10))) {
            if (rzVar.g0 < 0) {
                textPaint5.setColor(org.telegram.ui.ActionBar.m6.w0(rzVar.c0, h6Var));
            } else {
                textPaint5.setColor(i0.a.f(rzVar.x0, org.telegram.ui.ActionBar.m6.w0(rzVar.c0, h6Var), org.telegram.ui.ActionBar.m6.w0(rzVar.g0, h6Var)));
            }
            if (org.telegram.ui.ActionBar.m6.f1(i14) && org.telegram.ui.ActionBar.m6.f1(i15)) {
                int w05 = org.telegram.ui.ActionBar.m6.w0(i14, h6Var);
                if (rzVar.P || rzVar.R != -1) {
                    int i33 = this.b.a;
                    if (i33 == i18) {
                        paint2 = paint;
                        i22 = i15;
                    } else if (i33 == i19) {
                        i22 = i15;
                        paint2 = paint;
                    }
                    paint2.setColor(i0.a.f(rzVar.Q, org.telegram.ui.ActionBar.m6.w0(i22, h6Var), w05));
                }
                paint2 = paint;
                paint2.setColor(w05);
            } else {
                paint2 = paint;
                paint2.setColor(textPaint2.getColor());
            }
            float f27 = this.b.c;
            boolean z15 = this.V;
            if (z15) {
                float f28 = this.d0;
                float f29 = this.y;
                f27 = (f27 * f29) + ((f15 - f29) * f28);
            }
            float L3 = (z15 && this.S == null) ? (f14 - this.b0) + f16 + f27 + org.telegram.messenger.g0.L(5.0f) : f14 + f27 + org.telegram.messenger.g0.L(5.0f);
            int z16 = org.telegram.messenger.o10.z(17.333f, getMeasuredHeight(), 2);
            if (z10 || ((!rzVar.n && rzVar.x == f10) || str2 != null)) {
                paint2.setAlpha(org.telegram.messenger.ls.e4);
            } else {
                paint2.setAlpha((int) (rzVar.x * 255.0f));
            }
            if (z14) {
                float f30 = this.g0;
                i21 = i20;
                float f31 = i21;
                if (f30 != f31) {
                    float f32 = this.y;
                    f17 = (f31 * f32) + ((f15 - f32) * f30);
                    if (z14) {
                        float f33 = this.h0;
                        float f34 = this.y;
                        f12 = (f12 * f34) + ((f15 - f34) * f33);
                    }
                    float f35 = z16;
                    float L4 = org.telegram.messenger.g0.L(17.333f) + z16;
                    rectF = this.f;
                    rectF.set(L3, f35, f17 + L3, L4);
                    if (!z12 || z13) {
                        canvas2.save();
                        float f36 = !z12 ? this.y : f15 - this.y;
                        canvas2.scale(f36, f36, rectF.centerX(), rectF.centerY());
                    }
                    float f37 = org.telegram.messenger.g0.p * 11.5f;
                    canvas2.drawRoundRect(rectF, f37, f37, paint2);
                    if (!z14) {
                        if (this.L != null) {
                            L2 = org.telegram.messenger.g0.L(17.333f);
                            lineBottom = this.L.getLineBottom(0);
                            lineTop = this.L.getLineTop(0);
                        } else if (this.M != null) {
                            L2 = org.telegram.messenger.g0.L(17.333f);
                            lineBottom = this.M.getLineBottom(0);
                            lineTop = this.M.getLineTop(0);
                        } else {
                            if (this.N != null) {
                                L2 = org.telegram.messenger.g0.L(17.333f);
                                lineBottom = this.N.getLineBottom(0);
                                lineTop = this.N.getLineTop(0);
                            }
                            float L5 = f35 - org.telegram.messenger.g0.L(0.5f);
                            float f38 = z10 ? f15 - rzVar.x : f15;
                            if (this.L != null) {
                                canvas2.save();
                                textPaint5.setAlpha((int) (f38 * 255.0f * this.y));
                                canvas2.translate(((rectF.width() - f12) / 2.0f) + rectF.left, ((f15 - this.y) * org.telegram.messenger.g0.L(15.0f)) + L5);
                                this.L.draw(canvas2);
                                canvas2.restore();
                            }
                            if (this.M != null) {
                                canvas2.save();
                                textPaint5.setAlpha((int) ((f15 - this.y) * f38 * 255.0f));
                                canvas2.translate(((rectF.width() - f12) / 2.0f) + rectF.left, (this.y * (-org.telegram.messenger.g0.L(15.0f))) + L5);
                                this.M.draw(canvas2);
                                canvas2.restore();
                            }
                            if (this.N != null) {
                                canvas2.save();
                                textPaint5.setAlpha((int) (f38 * 255.0f));
                                canvas2.translate(((rectF.width() - f12) / 2.0f) + rectF.left, L5);
                                this.N.draw(canvas2);
                                canvas2.restore();
                            }
                            textPaint5.setAlpha(org.telegram.messenger.ls.e4);
                        }
                        f35 += (L2 - (lineBottom - lineTop)) / 2.0f;
                        float L52 = f35 - org.telegram.messenger.g0.L(0.5f);
                        if (z10) {
                        }
                        if (this.L != null) {
                        }
                        if (this.M != null) {
                        }
                        if (this.N != null) {
                        }
                        textPaint5.setAlpha(org.telegram.messenger.ls.e4);
                    } else if (str2 != null) {
                        if (!z10) {
                            textPaint5.setAlpha((int) ((f15 - rzVar.x) * 255.0f));
                        }
                        canvas2.drawText(str2, ((rectF.width() - f12) / 2.0f) + rectF.left, org.telegram.messenger.g0.L(12.5f) + z16, textPaint5);
                    }
                    if (!z12 || z13) {
                        canvas2.restore();
                    }
                    if (!z10 && (rzVar.n || rzVar.x != f10)) {
                        TextPaint textPaint8 = textPaint;
                        textPaint8.setColor(textPaint5.getColor());
                        textPaint8.setAlpha((int) (rzVar.x * 255.0f));
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
            if (z14) {
            }
            float f352 = z16;
            float L42 = org.telegram.messenger.g0.L(17.333f) + z16;
            rectF = this.f;
            rectF.set(L3, f352, f17 + L3, L42);
            if (!z12) {
            }
            canvas2.save();
            if (!z12) {
            }
            canvas2.scale(f36, f36, rectF.centerX(), rectF.centerY());
            float f372 = org.telegram.messenger.g0.p * 11.5f;
            canvas2.drawRoundRect(rectF, f372, f372, paint2);
            if (!z14) {
            }
            if (!z12) {
            }
            canvas2.restore();
            if (!z10) {
                TextPaint textPaint82 = textPaint;
                textPaint82.setColor(textPaint5.getColor());
                textPaint82.setAlpha((int) (rzVar.x * 255.0f));
                float L62 = org.telegram.messenger.g0.L(3.0f);
                canvas2.drawLine(rectF.centerX() - L62, rectF.centerY() - L62, rectF.centerX() + L62, rectF.centerY() + L62, textPaint82);
                canvas2 = canvas;
                canvas2.drawLine(rectF.centerX() - L62, rectF.centerY() + L62, rectF.centerX() + L62, rectF.centerY() - L62, textPaint82);
            }
        } else {
            i21 = i20;
        }
        float f39 = f12;
        if (rzVar.w != f10) {
            canvas2.restore();
        }
        this.F = f14;
        oz ozVar = this.b;
        this.J = ozVar.d;
        this.O = this.h;
        this.c0 = ozVar.c;
        this.e0 = i21;
        this.f0 = f39;
        this.i0 = this.d;
        this.k0 = getMeasuredWidth();
        if (!this.b.f && this.l0 == f10) {
            return;
        }
        if (rzVar.u0 == null) {
            rzVar.u0 = getContext().getDrawable(R.drawable.other_lockedfolders);
        }
        boolean z17 = this.b.f;
        if (z17) {
            float f40 = this.l0;
            if (f40 != f15) {
                this.l0 = f40 + 0.10666667f;
                this.l0 = Utilities.i(this.l0, f15, f10);
                w02 = org.telegram.ui.ActionBar.m6.w0(rzVar.a0, h6Var);
                i23 = rzVar.f0;
                if (i23 >= 0) {
                    w02 = i0.a.f(rzVar.x0, w02, org.telegram.ui.ActionBar.m6.w0(i23, h6Var));
                }
                if (rzVar.v0 != w02) {
                    rzVar.v0 = w02;
                    rzVar.u0.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
                }
                int measuredWidth2 = (int) (((getMeasuredWidth() - rzVar.u0.getIntrinsicWidth()) / 2.0f) + this.E);
                int measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(12.0f);
                Drawable drawable = rzVar.u0;
                drawable.setBounds(measuredWidth2, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth2, rzVar.u0.getIntrinsicHeight() + measuredHeight);
                if (this.l0 != 1.0f) {
                    rzVar.u0.draw(canvas2);
                    return;
                }
                canvas2.save();
                float f41 = this.l0;
                canvas2.scale(f41, f41, rzVar.u0.getBounds().centerX(), rzVar.u0.getBounds().centerY());
                rzVar.u0.draw(canvas2);
                canvas2.restore();
                return;
            }
        }
        if (!z17) {
            this.l0 -= 0.10666667f;
        }
        this.l0 = Utilities.i(this.l0, f15, f10);
        w02 = org.telegram.ui.ActionBar.m6.w0(rzVar.a0, h6Var);
        i23 = rzVar.f0;
        if (i23 >= 0) {
        }
        if (rzVar.v0 != w02) {
        }
        int measuredWidth22 = (int) (((getMeasuredWidth() - rzVar.u0.getIntrinsicWidth()) / 2.0f) + this.E);
        int measuredHeight2 = getMeasuredHeight() - org.telegram.messenger.g0.L(12.0f);
        Drawable drawable2 = rzVar.u0;
        drawable2.setBounds(measuredWidth22, measuredHeight2, drawable2.getIntrinsicWidth() + measuredWidth22, rzVar.u0.getIntrinsicHeight() + measuredHeight2);
        if (this.l0 != 1.0f) {
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i7;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        oz ozVar = this.b;
        accessibilityNodeInfo.setSelected((ozVar == null || (i7 = this.n0.M) == -1 || ozVar.a != i7) ? false : true);
        accessibilityNodeInfo.addAction(16);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, org.telegram.messenger.hd.N0(2131754815, null)));
        if (this.b != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.b.b);
            oz ozVar2 = this.b;
            int i10 = ozVar2 != null ? ozVar2.d : 0;
            if (i10 > 0) {
                sb2.append("\n");
                sb2.append(org.telegram.messenger.hd.G(i10, "AccDescrUnreadCount", new Object[0]));
            }
            accessibilityNodeInfo.setContentDescription(sb2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(24.0f) + this.b.a(false) + this.n0.O, View.MeasureSpec.getSize(i10));
    }
}
