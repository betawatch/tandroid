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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class rz extends View {
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
    public k5 O;
    public StaticLayout P;
    public k5 Q;
    public StaticLayout R;
    public k5 S;
    public StaticLayout T;
    public boolean U;
    public boolean V;
    public boolean W;
    public ValueAnimator a;
    public float a0;
    public pz b;
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
    public final /* synthetic */ tz m0;
    public boolean n;
    public k5 r;
    public StaticLayout s;
    public int w;
    public boolean x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rz(tz tzVar, Context context) {
        super(context);
        this.m0 = tzVar;
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

    public final void b(float f7, int i10) {
        if (i10 == 6) {
            this.D = 0.0f;
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, org.telegram.messenger.i0.L(f7));
        ofFloat.addUpdateListener(new lz(this, 1));
        animatorSet.playTogether(ofFloat);
        animatorSet.setDuration(50L);
        animatorSet.addListener(new qz(this, i10, f7, 0));
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
        this.r = o5.update(this.b.g ? 26 : 0, this, this.r, this.s);
        this.O = o5.update(this.b.g ? 26 : 0, this, this.O, this.P);
        this.Q = o5.update(this.b.g ? 26 : 0, this, this.Q, this.R);
        this.S = o5.update(this.b.g ? 26 : 0, this, this.S, this.T);
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
        o5.release(this, this.r);
        o5.release(this, this.O);
        o5.release(this, this.Q);
        o5.release(this, this.S);
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
        float f7;
        float f10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z10;
        int i17;
        String format;
        float f11;
        int L;
        int i18;
        String str;
        float f12;
        int i19;
        int i20;
        int i21;
        TextPaint textPaint;
        Paint paint;
        float f13;
        float f14;
        TextPaint textPaint2;
        org.telegram.ui.ActionBar.p6 p6Var;
        float f15;
        Paint paint2;
        int i22;
        float f16;
        RectF rectF;
        int L2;
        int lineBottom;
        int lineTop;
        int i23;
        int w02;
        int i24;
        float f17;
        float f18;
        TextPaint textPaint3;
        float f19;
        float f20;
        Canvas canvas2 = canvas;
        boolean z11 = this.b.e;
        tz tzVar = this.m0;
        TextPaint textPaint4 = tzVar.d;
        Paint paint3 = tzVar.e;
        TextPaint textPaint5 = tzVar.c;
        TextPaint textPaint6 = tzVar.b;
        org.telegram.ui.ActionBar.p6 p6Var2 = tzVar.a;
        if (tzVar.w != 0.0f) {
            canvas2.save();
            float f21 = tzVar.w;
            float sin = (float) Math.sin(((f21 * (this.e % 2 == 0 ? 1.0f : -1.0f)) + r8) * 3.141592653589793d * 2.5d);
            f7 = 0.0f;
            f10 = 400.0f;
            double elapsedRealtime = (float) ((SystemClock.elapsedRealtime() / 400.0f) * 3.141592653589793d * (this.e % 2 == 0 ? 1.0f : -1.0f));
            canvas2.translate((float) (Math.cos(elapsedRealtime) * org.telegram.messenger.i0.L(0.33f) * (this.e % 2 == 0 ? 1.0f : -1.0f)), (float) (Math.sin(elapsedRealtime) * (-org.telegram.messenger.i0.L(0.33f))));
            canvas2.rotate(1.4f * sin, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        } else {
            f7 = 0.0f;
            f10 = 400.0f;
        }
        int i25 = tzVar.R;
        if (i25 != -1) {
            i11 = tzVar.L;
            i10 = i25;
        } else {
            i10 = tzVar.L;
            i11 = tzVar.r0;
        }
        int i26 = this.b.a;
        if (i26 == i10) {
            i12 = tzVar.V;
            int i27 = tzVar.d0;
            int i28 = tzVar.W;
            int i29 = tzVar.e0;
            i15 = org.telegram.ui.ActionBar.t6.T9;
            i16 = org.telegram.ui.ActionBar.t6.U9;
            i13 = i29;
            i14 = i28;
            z10 = z11;
            i17 = i27;
        } else {
            i12 = tzVar.W;
            i13 = tzVar.e0;
            i14 = tzVar.V;
            i15 = org.telegram.ui.ActionBar.t6.U9;
            i16 = org.telegram.ui.ActionBar.t6.T9;
            z10 = z11;
            i17 = i13;
        }
        if (i17 >= 0) {
            int w03 = org.telegram.ui.ActionBar.t6.w0(i12, p6Var2);
            int w04 = org.telegram.ui.ActionBar.t6.w0(i17, p6Var2);
            if (tzVar.O) {
            }
            int i30 = this.b.a;
            if (i30 == i10 || i30 == i11) {
                textPaint6.setColor(i0.b.f(tzVar.P, i0.b.f(tzVar.w0, org.telegram.ui.ActionBar.t6.w0(i14, p6Var2), org.telegram.ui.ActionBar.t6.w0(i13, p6Var2)), i0.b.f(tzVar.w0, w03, w04)));
            }
            textPaint6.setColor(i0.b.f(tzVar.w0, w03, w04));
        } else if ((tzVar.O || i25 != -1) && (i26 == i10 || i26 == i11)) {
            textPaint6.setColor(i0.b.f(tzVar.P, org.telegram.ui.ActionBar.t6.w0(i14, p6Var2), org.telegram.ui.ActionBar.t6.w0(i12, p6Var2)));
        } else {
            textPaint6.setColor(org.telegram.ui.ActionBar.t6.w0(i12, p6Var2));
        }
        tzVar.f = new PorterDuffColorFilter(textPaint6.getColor(), PorterDuff.Mode.SRC_IN);
        int i31 = this.J;
        boolean z12 = i31 == 0 && this.H;
        boolean z13 = i31 > 0 && this.b.d == 0 && this.H;
        boolean z14 = i31 > 0 && this.b.d > 0 && this.H;
        int i32 = this.b.d;
        if (i32 > 0 || z13) {
            format = z13 ? String.format("%d", Integer.valueOf(i31)) : String.format("%d", Integer.valueOf(i32));
            float ceil = (int) Math.ceil(textPaint5.measureText(format));
            f11 = ceil;
            L = org.telegram.messenger.i0.L(10.0f) + ((int) Math.max(org.telegram.messenger.i0.L(7.333f), ceil));
        } else {
            format = null;
            L = 0;
            f11 = f7;
        }
        if (!z10 && (tzVar.n || tzVar.x != f7)) {
            L = (int) (((org.telegram.messenger.i0.L(17.333f) - L) * tzVar.x) + L);
        }
        int i33 = this.b.c;
        if (L == 0 || z13) {
            i18 = 0;
        } else {
            i18 = org.telegram.messenger.i0.L((format != null ? 1.0f : tzVar.x) * (-2.0f)) + L;
        }
        this.d = i33 + i18;
        float measuredWidth = (getMeasuredWidth() - this.d) / 2.0f;
        if (this.G) {
            float f22 = this.y;
            measuredWidth = c3.i0.z(1.0f, f22, this.F, measuredWidth * f22);
        }
        if (TextUtils.equals(this.b.b, this.h)) {
            str = format;
            f12 = measuredWidth;
            i19 = i10;
            i20 = i11;
            i21 = L;
        } else {
            this.h = this.b.b;
            i19 = i10;
            i20 = i11;
            i21 = L;
            f12 = measuredWidth;
            str = format;
            StaticLayout staticLayout = new StaticLayout(this.h, textPaint6, org.telegram.messenger.i0.L(f10), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.s = staticLayout;
            this.r = o5.update(this.b.g ? 26 : 0, this, this.r, staticLayout);
            this.c = this.s.getHeight();
            this.w = (int) (-this.s.getLineLeft(0));
        }
        if (this.U) {
            float f23 = this.a0;
            if (this.V) {
                f18 = this.y;
                f17 = 1.0f;
            } else {
                f17 = 1.0f;
                f18 = 1.0f - this.y;
            }
            float f24 = f23 * f18;
            if (this.T != null) {
                canvas2.save();
                f13 = f12;
                canvas2.translate(f13 + this.w + f24, ((getMeasuredHeight() - this.c) / 2.0f) + f17);
                this.T.draw(canvas2);
                textPaint3 = textPaint6;
                f19 = 6.0f;
                p6Var = p6Var2;
                textPaint = textPaint4;
                f20 = f17;
                o5.drawAnimatedEmojis(canvas2, this.T, this.S, 0.0f, null, computeVerticalScrollOffset() - org.telegram.messenger.i0.L(6.0f), computeVerticalScrollOffset() + computeVerticalScrollExtent(), 0.0f, 1.0f, tzVar.f);
                canvas2.restore();
            } else {
                textPaint3 = textPaint6;
                f19 = 6.0f;
                textPaint = textPaint4;
                f20 = f17;
                f13 = f12;
                p6Var = p6Var2;
            }
            if (this.P != null) {
                canvas2.save();
                int alpha = textPaint3.getAlpha();
                TextPaint textPaint7 = textPaint3;
                textPaint7.setAlpha((int) (alpha * (this.V ? f20 - this.y : this.y)));
                canvas2.translate(f13 + this.w + f24, ((getMeasuredHeight() - this.c) / 2.0f) + f20);
                this.P.draw(canvas2);
                StaticLayout staticLayout2 = this.P;
                k5 k5Var = this.O;
                float computeVerticalScrollOffset = computeVerticalScrollOffset() - org.telegram.messenger.i0.L(f19);
                float computeVerticalScrollOffset2 = computeVerticalScrollOffset() + computeVerticalScrollExtent();
                float f25 = this.V ? f20 - this.y : this.y;
                f14 = f20;
                textPaint2 = textPaint7;
                paint = paint3;
                o5.drawAnimatedEmojis(canvas2, staticLayout2, k5Var, 0.0f, null, computeVerticalScrollOffset, computeVerticalScrollOffset2, 0.0f, f25, tzVar.f);
                canvas2.restore();
                textPaint2.setAlpha(alpha);
            } else {
                f14 = f20;
                textPaint2 = textPaint3;
                paint = paint3;
            }
            if (this.R != null) {
                canvas2.save();
                int alpha2 = textPaint2.getAlpha();
                textPaint2.setAlpha((int) (alpha2 * (this.V ? this.y : f14 - this.y)));
                canvas2.translate(f13 + this.w + f24, ((getMeasuredHeight() - this.c) / 2.0f) + f14);
                this.R.draw(canvas2);
                o5.drawAnimatedEmojis(canvas2, this.R, this.Q, 0.0f, null, computeVerticalScrollOffset() - org.telegram.messenger.i0.L(f19), computeVerticalScrollOffset() + computeVerticalScrollExtent(), 0.0f, this.V ? this.y : f14 - this.y, tzVar.f);
                canvas2.restore();
                textPaint2.setAlpha(alpha2);
            }
            f15 = f24;
        } else {
            textPaint = textPaint4;
            paint = paint3;
            f13 = f12;
            f14 = 1.0f;
            textPaint2 = textPaint6;
            p6Var = p6Var2;
            if (this.s != null) {
                canvas2.save();
                canvas2.translate(f13 + this.w, ((getMeasuredHeight() - this.c) / 2.0f) + 1.0f);
                this.s.draw(canvas2);
                o5.drawAnimatedEmojis(canvas2, this.s, this.r, 0.0f, null, computeVerticalScrollOffset() - org.telegram.messenger.i0.L(6.0f), computeVerticalScrollOffset() + computeVerticalScrollExtent(), 0.0f, 1.0f, tzVar.f);
                canvas2.restore();
            }
            f15 = f7;
        }
        String str2 = str;
        if (z12 || str2 != null || (!z10 && (tzVar.n || tzVar.x != f7))) {
            if (tzVar.f0 < 0) {
                textPaint5.setColor(org.telegram.ui.ActionBar.t6.w0(tzVar.b0, p6Var));
            } else {
                textPaint5.setColor(i0.b.f(tzVar.w0, org.telegram.ui.ActionBar.t6.w0(tzVar.b0, p6Var), org.telegram.ui.ActionBar.t6.w0(tzVar.f0, p6Var)));
            }
            if (org.telegram.ui.ActionBar.t6.f1(i15) && org.telegram.ui.ActionBar.t6.f1(i16)) {
                int w05 = org.telegram.ui.ActionBar.t6.w0(i15, p6Var);
                if (tzVar.O || tzVar.Q != -1) {
                    int i34 = this.b.a;
                    if (i34 == i19) {
                        paint2 = paint;
                        i23 = i16;
                    } else if (i34 == i20) {
                        i23 = i16;
                        paint2 = paint;
                    }
                    paint2.setColor(i0.b.f(tzVar.P, org.telegram.ui.ActionBar.t6.w0(i23, p6Var), w05));
                }
                paint2 = paint;
                paint2.setColor(w05);
            } else {
                paint2 = paint;
                paint2.setColor(textPaint2.getColor());
            }
            float f26 = this.b.c;
            boolean z15 = this.U;
            if (z15) {
                float f27 = this.c0;
                float f28 = this.y;
                f26 = (f26 * f28) + ((f14 - f28) * f27);
            }
            float L3 = (z15 && this.R == null) ? (f13 - this.a0) + f15 + f26 + org.telegram.messenger.i0.L(5.0f) : f13 + f26 + org.telegram.messenger.i0.L(5.0f);
            int y3 = org.telegram.messenger.z20.y(17.333f, getMeasuredHeight(), 2);
            if (z10 || ((!tzVar.n && tzVar.x == f7) || str2 != null)) {
                paint2.setAlpha(org.telegram.messenger.zs.e4);
            } else {
                paint2.setAlpha((int) (tzVar.x * 255.0f));
            }
            if (z14) {
                float f29 = this.f0;
                i22 = i21;
                float f30 = i22;
                if (f29 != f30) {
                    float f31 = this.y;
                    f16 = (f30 * f31) + ((f14 - f31) * f29);
                    if (z14) {
                        float f32 = this.g0;
                        float f33 = this.y;
                        f11 = (f11 * f33) + ((f14 - f33) * f32);
                    }
                    float f34 = y3;
                    float L4 = org.telegram.messenger.i0.L(17.333f) + y3;
                    rectF = this.f;
                    rectF.set(L3, f34, f16 + L3, L4);
                    if (!z12 || z13) {
                        canvas2.save();
                        float f35 = !z12 ? this.y : f14 - this.y;
                        canvas2.scale(f35, f35, rectF.centerX(), rectF.centerY());
                    }
                    float f36 = org.telegram.messenger.i0.p * 11.5f;
                    canvas2.drawRoundRect(rectF, f36, f36, paint2);
                    if (!z14) {
                        if (this.K != null) {
                            L2 = org.telegram.messenger.i0.L(17.333f);
                            lineBottom = this.K.getLineBottom(0);
                            lineTop = this.K.getLineTop(0);
                        } else if (this.L != null) {
                            L2 = org.telegram.messenger.i0.L(17.333f);
                            lineBottom = this.L.getLineBottom(0);
                            lineTop = this.L.getLineTop(0);
                        } else {
                            if (this.M != null) {
                                L2 = org.telegram.messenger.i0.L(17.333f);
                                lineBottom = this.M.getLineBottom(0);
                                lineTop = this.M.getLineTop(0);
                            }
                            float L5 = f34 - org.telegram.messenger.i0.L(0.5f);
                            float f37 = z10 ? f14 - tzVar.x : f14;
                            if (this.K != null) {
                                canvas2.save();
                                textPaint5.setAlpha((int) (f37 * 255.0f * this.y));
                                canvas2.translate(((rectF.width() - f11) / 2.0f) + rectF.left, ((f14 - this.y) * org.telegram.messenger.i0.L(15.0f)) + L5);
                                this.K.draw(canvas2);
                                canvas2.restore();
                            }
                            if (this.L != null) {
                                canvas2.save();
                                textPaint5.setAlpha((int) ((f14 - this.y) * f37 * 255.0f));
                                canvas2.translate(((rectF.width() - f11) / 2.0f) + rectF.left, (this.y * (-org.telegram.messenger.i0.L(15.0f))) + L5);
                                this.L.draw(canvas2);
                                canvas2.restore();
                            }
                            if (this.M != null) {
                                canvas2.save();
                                textPaint5.setAlpha((int) (f37 * 255.0f));
                                canvas2.translate(((rectF.width() - f11) / 2.0f) + rectF.left, L5);
                                this.M.draw(canvas2);
                                canvas2.restore();
                            }
                            textPaint5.setAlpha(org.telegram.messenger.zs.e4);
                        }
                        f34 += (L2 - (lineBottom - lineTop)) / 2.0f;
                        float L52 = f34 - org.telegram.messenger.i0.L(0.5f);
                        if (z10) {
                        }
                        if (this.K != null) {
                        }
                        if (this.L != null) {
                        }
                        if (this.M != null) {
                        }
                        textPaint5.setAlpha(org.telegram.messenger.zs.e4);
                    } else if (str2 != null) {
                        if (!z10) {
                            textPaint5.setAlpha((int) ((f14 - tzVar.x) * 255.0f));
                        }
                        canvas2.drawText(str2, ((rectF.width() - f11) / 2.0f) + rectF.left, org.telegram.messenger.i0.L(12.5f) + y3, textPaint5);
                    }
                    if (!z12 || z13) {
                        canvas2.restore();
                    }
                    if (!z10 && (tzVar.n || tzVar.x != f7)) {
                        TextPaint textPaint8 = textPaint;
                        textPaint8.setColor(textPaint5.getColor());
                        textPaint8.setAlpha((int) (tzVar.x * 255.0f));
                        float L6 = org.telegram.messenger.i0.L(3.0f);
                        canvas2.drawLine(rectF.centerX() - L6, rectF.centerY() - L6, rectF.centerX() + L6, rectF.centerY() + L6, textPaint8);
                        canvas2 = canvas;
                        canvas2.drawLine(rectF.centerX() - L6, rectF.centerY() + L6, rectF.centerX() + L6, rectF.centerY() - L6, textPaint8);
                    }
                }
            } else {
                i22 = i21;
            }
            f16 = i22;
            if (z14) {
            }
            float f342 = y3;
            float L42 = org.telegram.messenger.i0.L(17.333f) + y3;
            rectF = this.f;
            rectF.set(L3, f342, f16 + L3, L42);
            if (!z12) {
            }
            canvas2.save();
            if (!z12) {
            }
            canvas2.scale(f35, f35, rectF.centerX(), rectF.centerY());
            float f362 = org.telegram.messenger.i0.p * 11.5f;
            canvas2.drawRoundRect(rectF, f362, f362, paint2);
            if (!z14) {
            }
            if (!z12) {
            }
            canvas2.restore();
            if (!z10) {
                TextPaint textPaint82 = textPaint;
                textPaint82.setColor(textPaint5.getColor());
                textPaint82.setAlpha((int) (tzVar.x * 255.0f));
                float L62 = org.telegram.messenger.i0.L(3.0f);
                canvas2.drawLine(rectF.centerX() - L62, rectF.centerY() - L62, rectF.centerX() + L62, rectF.centerY() + L62, textPaint82);
                canvas2 = canvas;
                canvas2.drawLine(rectF.centerX() - L62, rectF.centerY() + L62, rectF.centerX() + L62, rectF.centerY() - L62, textPaint82);
            }
        } else {
            i22 = i21;
        }
        float f38 = f11;
        if (tzVar.w != f7) {
            canvas2.restore();
        }
        this.E = f13;
        pz pzVar = this.b;
        this.I = pzVar.d;
        this.N = this.h;
        this.b0 = pzVar.c;
        this.d0 = i22;
        this.e0 = f38;
        this.h0 = this.d;
        this.j0 = getMeasuredWidth();
        if (!this.b.f && this.k0 == f7) {
            return;
        }
        if (tzVar.t0 == null) {
            tzVar.t0 = getContext().getDrawable(R.drawable.other_lockedfolders);
        }
        boolean z16 = this.b.f;
        if (z16) {
            float f39 = this.k0;
            if (f39 != f14) {
                this.k0 = f39 + 0.10666667f;
                this.k0 = Utilities.i(this.k0, f14, f7);
                w02 = org.telegram.ui.ActionBar.t6.w0(tzVar.W, p6Var);
                i24 = tzVar.e0;
                if (i24 >= 0) {
                    w02 = i0.b.f(tzVar.w0, w02, org.telegram.ui.ActionBar.t6.w0(i24, p6Var));
                }
                if (tzVar.u0 != w02) {
                    tzVar.u0 = w02;
                    tzVar.t0.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
                }
                int measuredWidth2 = (int) (((getMeasuredWidth() - tzVar.t0.getIntrinsicWidth()) / 2.0f) + this.D);
                int measuredHeight = getMeasuredHeight() - org.telegram.messenger.i0.L(12.0f);
                Drawable drawable = tzVar.t0;
                drawable.setBounds(measuredWidth2, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth2, tzVar.t0.getIntrinsicHeight() + measuredHeight);
                if (this.k0 != 1.0f) {
                    tzVar.t0.draw(canvas2);
                    return;
                }
                canvas2.save();
                float f40 = this.k0;
                canvas2.scale(f40, f40, tzVar.t0.getBounds().centerX(), tzVar.t0.getBounds().centerY());
                tzVar.t0.draw(canvas2);
                canvas2.restore();
                return;
            }
        }
        if (!z16) {
            this.k0 -= 0.10666667f;
        }
        this.k0 = Utilities.i(this.k0, f14, f7);
        w02 = org.telegram.ui.ActionBar.t6.w0(tzVar.W, p6Var);
        i24 = tzVar.e0;
        if (i24 >= 0) {
        }
        if (tzVar.u0 != w02) {
        }
        int measuredWidth22 = (int) (((getMeasuredWidth() - tzVar.t0.getIntrinsicWidth()) / 2.0f) + this.D);
        int measuredHeight2 = getMeasuredHeight() - org.telegram.messenger.i0.L(12.0f);
        Drawable drawable2 = tzVar.t0;
        drawable2.setBounds(measuredWidth22, measuredHeight2, drawable2.getIntrinsicWidth() + measuredWidth22, tzVar.t0.getIntrinsicHeight() + measuredHeight2);
        if (this.k0 != 1.0f) {
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        pz pzVar = this.b;
        accessibilityNodeInfo.setSelected((pzVar == null || (i10 = this.m0.L) == -1 || pzVar.a != i10) ? false : true);
        accessibilityNodeInfo.addAction(16);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, org.telegram.messenger.cd.L0(2131754816, null)));
        if (this.b != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.b.b);
            pz pzVar2 = this.b;
            int i11 = pzVar2 != null ? pzVar2.d : 0;
            if (i11 > 0) {
                sb2.append("\n");
                sb2.append(org.telegram.messenger.cd.G(i11, "AccDescrUnreadCount", new Object[0]));
            }
            accessibilityNodeInfo.setContentDescription(sb2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(org.telegram.messenger.i0.L(24.0f) + this.b.a(false) + this.m0.N, View.MeasureSpec.getSize(i11));
    }
}
