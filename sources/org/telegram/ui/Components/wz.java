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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class wz extends View {
    public float A;
    public float B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public StaticLayout G;
    public StaticLayout H;
    public StaticLayout I;
    public CharSequence J;
    public p5 K;
    public StaticLayout L;
    public p5 M;
    public StaticLayout N;
    public p5 O;
    public StaticLayout P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public float T;
    public int U;
    public int V;
    public int W;
    public ValueAnimator a;
    public float a0;
    public vz b;
    public float b0;
    public int c;
    public float c0;
    public int d;
    public float d0;
    public int e;
    public float e0;
    public final RectF f;
    public float f0;
    public float g0;
    public CharSequence h;
    public boolean h0;
    public final /* synthetic */ yz i0;
    public boolean n;
    public p5 r;
    public StaticLayout s;
    public int v;
    public boolean w;
    public float x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wz(yz yzVar, Context context) {
        super(context);
        this.i0 = yzVar;
        this.f = new RectF();
        this.E = -1;
    }

    public final void a() {
        this.w = false;
        this.D = false;
        this.Q = false;
        this.C = false;
        this.S = false;
        this.a = null;
        invalidate();
    }

    public final void b(float f10, int i10) {
        if (i10 == 6) {
            this.y = 0.0f;
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(f10));
        ofFloat.addUpdateListener(new pz(this, 1));
        animatorSet.playTogether(ofFloat);
        animatorSet.setDuration(50L);
        animatorSet.addListener(new hh.fb(this, i10, f10, 1));
        animatorSet.start();
    }

    @Override // android.view.View
    public int getId() {
        return this.b.a;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        this.h0 = true;
        super.onAttachedToWindow();
        this.r = t5.update(this.b.g ? 26 : 0, this, this.r, this.s);
        this.K = t5.update(this.b.g ? 26 : 0, this, this.K, this.L);
        this.M = t5.update(this.b.g ? 26 : 0, this, this.M, this.N);
        this.O = t5.update(this.b.g ? 26 : 0, this, this.O, this.P);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        this.h0 = false;
        super.onDetachedFromWindow();
        this.w = false;
        this.D = false;
        this.Q = false;
        this.C = false;
        this.S = false;
        ValueAnimator valueAnimator = this.a;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.a.removeAllUpdateListeners();
            this.a.cancel();
            this.a = null;
        }
        invalidate();
        t5.release(this, this.r);
        t5.release(this, this.K);
        t5.release(this, this.M);
        t5.release(this, this.O);
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x047b, code lost:
    
        if (r12.w != 0.0f) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0121, code lost:
    
        if (r12.M != (-1)) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0754  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0760  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0775  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x079a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x07a8  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x07ec  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0813  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x059d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.c6 c6Var;
        float f10;
        float f11;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        org.telegram.ui.ActionBar.c6 c6Var2;
        boolean z10;
        String format;
        float f12;
        int dp;
        int i18;
        org.telegram.ui.ActionBar.c6 c6Var3;
        int i19;
        int i20;
        String str;
        int i21;
        float f13;
        float f14;
        TextPaint textPaint;
        Paint paint;
        org.telegram.ui.ActionBar.c6 c6Var4;
        float f15;
        TextPaint textPaint2;
        float f16;
        float f17;
        Paint paint2;
        int i22;
        float f18;
        float f19;
        RectF rectF;
        int dp2;
        int lineBottom;
        int lineTop;
        int i23;
        boolean z11;
        int v02;
        int i24;
        TextPaint textPaint3;
        float f20;
        Canvas canvas2 = canvas;
        boolean z12 = this.b.e;
        yz yzVar = this.i0;
        TextPaint textPaint4 = yzVar.d;
        Paint paint3 = yzVar.e;
        TextPaint textPaint5 = yzVar.c;
        TextPaint textPaint6 = yzVar.b;
        org.telegram.ui.ActionBar.c6 c6Var5 = yzVar.a;
        if (yzVar.v != 0.0f) {
            canvas2.save();
            float f21 = yzVar.v;
            f10 = 0.0f;
            float sin = (float) Math.sin(((f21 * (this.e % 2 == 0 ? 1.0f : -1.0f)) + r8) * 3.141592653589793d * 2.5d);
            f11 = 400.0f;
            double elapsedRealtime = (float) ((SystemClock.elapsedRealtime() / 400.0f) * 3.141592653589793d * (this.e % 2 == 0 ? 1.0f : -1.0f));
            c6Var = c6Var5;
            canvas2.translate((float) (Math.cos(elapsedRealtime) * AndroidUtilities.dp(0.33f) * (this.e % 2 == 0 ? 1.0f : -1.0f)), (float) (Math.sin(elapsedRealtime) * (-AndroidUtilities.dp(0.33f))));
            canvas2.rotate(sin * 1.4f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        } else {
            c6Var = c6Var5;
            f10 = 0.0f;
            f11 = 400.0f;
        }
        int i25 = yzVar.N;
        if (i25 != -1) {
            i11 = yzVar.H;
            i10 = i25;
        } else {
            i10 = yzVar.H;
            i11 = yzVar.n0;
        }
        int i26 = this.b.a;
        if (i26 == i10) {
            i12 = yzVar.R;
            i13 = yzVar.W;
            i14 = yzVar.S;
            i17 = yzVar.a0;
            i15 = org.telegram.ui.ActionBar.g6.T9;
            i16 = org.telegram.ui.ActionBar.g6.U9;
        } else {
            i12 = yzVar.S;
            i13 = yzVar.a0;
            i14 = yzVar.R;
            i15 = org.telegram.ui.ActionBar.g6.U9;
            i16 = org.telegram.ui.ActionBar.g6.T9;
            i17 = i13;
        }
        if (i13 < 0) {
            if ((yzVar.K || i25 != -1) && (i26 == i10 || i26 == i11)) {
                c6Var2 = c6Var;
                textPaint6.setColor(i0.b.d(yzVar.L, org.telegram.ui.ActionBar.g6.v0(i14, c6Var2), org.telegram.ui.ActionBar.g6.v0(i12, c6Var2)));
            } else {
                c6Var2 = c6Var;
                textPaint6.setColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var2));
            }
            z10 = z12;
        } else {
            c6Var2 = c6Var;
            int v03 = org.telegram.ui.ActionBar.g6.v0(i12, c6Var2);
            int v04 = org.telegram.ui.ActionBar.g6.v0(i13, c6Var2);
            if (yzVar.K) {
                z10 = z12;
            } else {
                z10 = z12;
            }
            int i27 = this.b.a;
            if (i27 == i10 || i27 == i11) {
                textPaint6.setColor(i0.b.d(yzVar.L, i0.b.d(yzVar.s0, org.telegram.ui.ActionBar.g6.v0(i14, c6Var2), org.telegram.ui.ActionBar.g6.v0(i17, c6Var2)), i0.b.d(yzVar.s0, v03, v04)));
            }
            textPaint6.setColor(i0.b.d(yzVar.s0, v03, v04));
        }
        yzVar.f = new PorterDuffColorFilter(textPaint6.getColor(), PorterDuff.Mode.SRC_IN);
        int i28 = this.F;
        boolean z13 = i28 == 0 && this.D;
        boolean z14 = i28 > 0 && this.b.d == 0 && this.D;
        boolean z15 = i28 > 0 && this.b.d > 0 && this.D;
        int i29 = this.b.d;
        if (i29 > 0 || z14) {
            format = z14 ? String.format("%d", Integer.valueOf(i28)) : String.format("%d", Integer.valueOf(i29));
            float ceil = (int) Math.ceil(textPaint5.measureText(format));
            f12 = ceil;
            dp = AndroidUtilities.dp(10.0f) + ((int) Math.max(AndroidUtilities.dp(7.333f), ceil));
        } else {
            format = null;
            dp = 0;
            f12 = 0.0f;
        }
        if (!z10 && (yzVar.n || yzVar.w != f10)) {
            dp = (int) (((AndroidUtilities.dp(17.333f) - dp) * yzVar.w) + dp);
        }
        int i30 = this.b.c;
        if (dp == 0 || z14) {
            i18 = 0;
        } else {
            i18 = AndroidUtilities.dp((format != null ? 1.0f : yzVar.w) * (-2.0f)) + dp;
        }
        this.d = i30 + i18;
        float measuredWidth = (getMeasuredWidth() - this.d) / 2.0f;
        if (this.C) {
            float f22 = this.x;
            measuredWidth = com.google.android.recaptcha.internal.a.z(1.0f, f22, this.B, measuredWidth * f22);
        }
        float f23 = measuredWidth;
        if (TextUtils.equals(this.b.b, this.h)) {
            c6Var3 = c6Var2;
            i19 = i10;
            i20 = i11;
            str = format;
            i21 = dp;
            f13 = 1.0f;
        } else {
            this.h = this.b.b;
            c6Var3 = c6Var2;
            i20 = i11;
            str = format;
            i21 = dp;
            i19 = i10;
            f13 = 1.0f;
            StaticLayout staticLayout = new StaticLayout(this.h, textPaint6, AndroidUtilities.dp(f11), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.s = staticLayout;
            this.r = t5.update(this.b.g ? 26 : 0, this, this.r, staticLayout);
            this.c = this.s.getHeight();
            this.v = (int) (-this.s.getLineLeft(0));
        }
        if (this.Q) {
            float f24 = this.T * (this.R ? this.x : f13 - this.x);
            if (this.P != null) {
                canvas2.save();
                canvas2.translate(this.v + f23 + f24, ((getMeasuredHeight() - this.c) / 2.0f) + f13);
                this.P.draw(canvas2);
                textPaint = textPaint4;
                textPaint3 = textPaint6;
                f20 = 1.0f;
                f14 = f23;
                c6Var4 = c6Var3;
                t5.drawAnimatedEmojis(canvas2, this.P, this.O, 0.0f, null, computeVerticalScrollOffset() - AndroidUtilities.dp(6.0f), computeVerticalScrollOffset() + computeVerticalScrollExtent(), 0.0f, 1.0f, yzVar.f);
                canvas2.restore();
            } else {
                textPaint3 = textPaint6;
                f14 = f23;
                textPaint = textPaint4;
                c6Var4 = c6Var3;
                f20 = 1.0f;
            }
            if (this.L != null) {
                canvas2.save();
                int alpha = textPaint3.getAlpha();
                TextPaint textPaint7 = textPaint3;
                textPaint7.setAlpha((int) (alpha * (this.R ? f20 - this.x : this.x)));
                canvas2.translate(f14 + this.v + f24, ((getMeasuredHeight() - this.c) / 2.0f) + f20);
                this.L.draw(canvas2);
                StaticLayout staticLayout2 = this.L;
                p5 p5Var = this.K;
                float computeVerticalScrollOffset = computeVerticalScrollOffset() - AndroidUtilities.dp(6.0f);
                float computeVerticalScrollOffset2 = computeVerticalScrollOffset() + computeVerticalScrollExtent();
                float f25 = this.R ? f20 - this.x : this.x;
                paint = paint3;
                textPaint2 = textPaint7;
                f15 = 1.0f;
                t5.drawAnimatedEmojis(canvas2, staticLayout2, p5Var, 0.0f, null, computeVerticalScrollOffset, computeVerticalScrollOffset2, 0.0f, f25, yzVar.f);
                canvas2.restore();
                textPaint2.setAlpha(alpha);
            } else {
                paint = paint3;
                textPaint2 = textPaint3;
                f15 = 1.0f;
            }
            if (this.N != null) {
                canvas2.save();
                int alpha2 = textPaint2.getAlpha();
                textPaint2.setAlpha((int) (alpha2 * (this.R ? this.x : f15 - this.x)));
                canvas2.translate(f14 + this.v + f24, ((getMeasuredHeight() - this.c) / 2.0f) + f15);
                this.N.draw(canvas2);
                t5.drawAnimatedEmojis(canvas2, this.N, this.M, 0.0f, null, computeVerticalScrollOffset() - AndroidUtilities.dp(6.0f), computeVerticalScrollOffset() + computeVerticalScrollExtent(), 0.0f, this.R ? this.x : f15 - this.x, yzVar.f);
                canvas2.restore();
                textPaint2.setAlpha(alpha2);
            }
            f16 = f24;
        } else {
            f14 = f23;
            textPaint = textPaint4;
            paint = paint3;
            c6Var4 = c6Var3;
            f15 = 1.0f;
            textPaint2 = textPaint6;
            if (this.s != null) {
                canvas2.save();
                canvas2.translate(f14 + this.v, ((getMeasuredHeight() - this.c) / 2.0f) + 1.0f);
                this.s.draw(canvas2);
                t5.drawAnimatedEmojis(canvas2, this.s, this.r, 0.0f, null, computeVerticalScrollOffset() - AndroidUtilities.dp(6.0f), computeVerticalScrollOffset() + computeVerticalScrollExtent(), 0.0f, 1.0f, yzVar.f);
                canvas2.restore();
            }
            f16 = 0.0f;
        }
        String str2 = str;
        if (!z13 && str2 == null) {
            if (z10) {
                f17 = 0.0f;
            } else if (!yzVar.n) {
                f17 = 0.0f;
            }
            i22 = i21;
            float f26 = f12;
            if (yzVar.v != f17) {
                canvas2.restore();
            }
            this.A = f14;
            vz vzVar = this.b;
            this.E = vzVar.d;
            this.J = this.h;
            this.U = vzVar.c;
            this.W = i22;
            this.a0 = f26;
            this.d0 = this.d;
            this.f0 = getMeasuredWidth();
            if (this.b.f && this.g0 == f17) {
                return;
            }
            if (yzVar.p0 == null) {
                yzVar.p0 = getContext().getDrawable(R.drawable.other_lockedfolders);
            }
            z11 = this.b.f;
            if (z11) {
                float f27 = this.g0;
                if (f27 != f15) {
                    this.g0 = f27 + 0.10666667f;
                    this.g0 = Utilities.clamp(this.g0, 1.0f, f17);
                    v02 = org.telegram.ui.ActionBar.g6.v0(yzVar.S, c6Var4);
                    i24 = yzVar.a0;
                    if (i24 >= 0) {
                        v02 = i0.b.d(yzVar.s0, v02, org.telegram.ui.ActionBar.g6.v0(i24, c6Var4));
                    }
                    if (yzVar.q0 != v02) {
                        yzVar.q0 = v02;
                        yzVar.p0.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
                    }
                    int measuredWidth2 = (int) (((getMeasuredWidth() - yzVar.p0.getIntrinsicWidth()) / 2.0f) + this.y);
                    int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(12.0f);
                    Drawable drawable = yzVar.p0;
                    drawable.setBounds(measuredWidth2, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth2, yzVar.p0.getIntrinsicHeight() + measuredHeight);
                    if (this.g0 != 1.0f) {
                        yzVar.p0.draw(canvas2);
                        return;
                    }
                    canvas2.save();
                    float f28 = this.g0;
                    canvas2.scale(f28, f28, yzVar.p0.getBounds().centerX(), yzVar.p0.getBounds().centerY());
                    yzVar.p0.draw(canvas2);
                    canvas2.restore();
                    return;
                }
            }
            if (!z11) {
                this.g0 -= 0.10666667f;
            }
            this.g0 = Utilities.clamp(this.g0, 1.0f, f17);
            v02 = org.telegram.ui.ActionBar.g6.v0(yzVar.S, c6Var4);
            i24 = yzVar.a0;
            if (i24 >= 0) {
            }
            if (yzVar.q0 != v02) {
            }
            int measuredWidth22 = (int) (((getMeasuredWidth() - yzVar.p0.getIntrinsicWidth()) / 2.0f) + this.y);
            int measuredHeight2 = getMeasuredHeight() - AndroidUtilities.dp(12.0f);
            Drawable drawable2 = yzVar.p0;
            drawable2.setBounds(measuredWidth22, measuredHeight2, drawable2.getIntrinsicWidth() + measuredWidth22, yzVar.p0.getIntrinsicHeight() + measuredHeight2);
            if (this.g0 != 1.0f) {
            }
        }
        f17 = 0.0f;
        if (yzVar.b0 < 0) {
            textPaint5.setColor(org.telegram.ui.ActionBar.g6.v0(yzVar.U, c6Var4));
        } else {
            textPaint5.setColor(i0.b.d(yzVar.s0, org.telegram.ui.ActionBar.g6.v0(yzVar.U, c6Var4), org.telegram.ui.ActionBar.g6.v0(yzVar.b0, c6Var4)));
        }
        if (org.telegram.ui.ActionBar.g6.c1(i15) && org.telegram.ui.ActionBar.g6.c1(i16)) {
            int v05 = org.telegram.ui.ActionBar.g6.v0(i15, c6Var4);
            if (yzVar.K || yzVar.M != -1) {
                int i31 = this.b.a;
                if (i31 == i19) {
                    paint2 = paint;
                    i23 = i16;
                } else if (i31 == i20) {
                    i23 = i16;
                    paint2 = paint;
                }
                paint2.setColor(i0.b.d(yzVar.L, org.telegram.ui.ActionBar.g6.v0(i23, c6Var4), v05));
            }
            paint2 = paint;
            paint2.setColor(v05);
        } else {
            paint2 = paint;
            paint2.setColor(textPaint2.getColor());
        }
        float f29 = this.b.c;
        boolean z16 = this.Q;
        if (z16) {
            float f30 = this.V;
            float f31 = this.x;
            f29 = (f29 * f31) + ((f15 - f31) * f30);
        }
        float dp3 = (z16 && this.N == null) ? (f14 - this.T) + f16 + f29 + AndroidUtilities.dp(5.0f) : AndroidUtilities.dp(5.0f) + f14 + f29;
        int x8 = org.telegram.messenger.rl.x(17.333f, getMeasuredHeight(), 2);
        if (z10 || ((!yzVar.n && yzVar.w == f17) || str2 != null)) {
            paint2.setAlpha(255);
        } else {
            paint2.setAlpha((int) (yzVar.w * 255.0f));
        }
        if (z15) {
            float f32 = this.b0;
            i22 = i21;
            float f33 = i22;
            f18 = 17.333f;
            if (f32 != f33) {
                float f34 = this.x;
                f19 = (f33 * f34) + ((f15 - f34) * f32);
                if (z15) {
                    float f35 = this.c0;
                    float f36 = this.x;
                    f12 = (f12 * f36) + ((f15 - f36) * f35);
                }
                float f37 = x8;
                float dp4 = AndroidUtilities.dp(f18) + x8;
                rectF = this.f;
                rectF.set(dp3, f37, f19 + dp3, dp4);
                if (!z13 || z14) {
                    canvas2.save();
                    float f38 = this.x;
                    if (!z13) {
                        f38 = f15 - f38;
                    }
                    canvas2.scale(f38, f38, rectF.centerX(), rectF.centerY());
                }
                float f39 = AndroidUtilities.density * 11.5f;
                canvas2.drawRoundRect(rectF, f39, f39, paint2);
                if (!z15) {
                    if (this.G != null) {
                        dp2 = AndroidUtilities.dp(f18);
                        lineBottom = this.G.getLineBottom(0);
                        lineTop = this.G.getLineTop(0);
                    } else if (this.H != null) {
                        dp2 = AndroidUtilities.dp(f18);
                        lineBottom = this.H.getLineBottom(0);
                        lineTop = this.H.getLineTop(0);
                    } else {
                        if (this.I != null) {
                            dp2 = AndroidUtilities.dp(f18);
                            lineBottom = this.I.getLineBottom(0);
                            lineTop = this.I.getLineTop(0);
                        }
                        float dp5 = f37 - AndroidUtilities.dp(0.5f);
                        float f40 = z10 ? f15 - yzVar.w : 1.0f;
                        if (this.G != null) {
                            canvas2.save();
                            textPaint5.setAlpha((int) (f40 * 255.0f * this.x));
                            canvas2.translate(((rectF.width() - f12) / 2.0f) + rectF.left, ((f15 - this.x) * AndroidUtilities.dp(15.0f)) + dp5);
                            this.G.draw(canvas2);
                            canvas2.restore();
                        }
                        if (this.H != null) {
                            canvas2.save();
                            textPaint5.setAlpha((int) ((f15 - this.x) * f40 * 255.0f));
                            canvas2.translate(((rectF.width() - f12) / 2.0f) + rectF.left, (this.x * (-AndroidUtilities.dp(15.0f))) + dp5);
                            this.H.draw(canvas2);
                            canvas2.restore();
                        }
                        if (this.I != null) {
                            canvas2.save();
                            textPaint5.setAlpha((int) (f40 * 255.0f));
                            canvas2.translate(((rectF.width() - f12) / 2.0f) + rectF.left, dp5);
                            this.I.draw(canvas2);
                            canvas2.restore();
                        }
                        textPaint5.setAlpha(255);
                    }
                    f37 += (dp2 - (lineBottom - lineTop)) / 2.0f;
                    float dp52 = f37 - AndroidUtilities.dp(0.5f);
                    if (z10) {
                    }
                    if (this.G != null) {
                    }
                    if (this.H != null) {
                    }
                    if (this.I != null) {
                    }
                    textPaint5.setAlpha(255);
                } else if (str2 != null) {
                    if (!z10) {
                        textPaint5.setAlpha((int) ((f15 - yzVar.w) * 255.0f));
                    }
                    canvas2.drawText(str2, ((rectF.width() - f12) / 2.0f) + rectF.left, AndroidUtilities.dp(12.5f) + x8, textPaint5);
                }
                if (!z13 || z14) {
                    canvas2.restore();
                }
                if (!z10 && (yzVar.n || yzVar.w != f17)) {
                    TextPaint textPaint8 = textPaint;
                    textPaint8.setColor(textPaint5.getColor());
                    textPaint8.setAlpha((int) (yzVar.w * 255.0f));
                    float dp6 = AndroidUtilities.dp(3.0f);
                    canvas2.drawLine(rectF.centerX() - dp6, rectF.centerY() - dp6, rectF.centerX() + dp6, rectF.centerY() + dp6, textPaint8);
                    canvas2 = canvas;
                    canvas2.drawLine(rectF.centerX() - dp6, rectF.centerY() + dp6, rectF.centerX() + dp6, rectF.centerY() - dp6, textPaint8);
                }
                float f262 = f12;
                if (yzVar.v != f17) {
                }
                this.A = f14;
                vz vzVar2 = this.b;
                this.E = vzVar2.d;
                this.J = this.h;
                this.U = vzVar2.c;
                this.W = i22;
                this.a0 = f262;
                this.d0 = this.d;
                this.f0 = getMeasuredWidth();
                if (this.b.f) {
                }
                if (yzVar.p0 == null) {
                }
                z11 = this.b.f;
                if (z11) {
                }
                if (!z11) {
                }
                this.g0 = Utilities.clamp(this.g0, 1.0f, f17);
                v02 = org.telegram.ui.ActionBar.g6.v0(yzVar.S, c6Var4);
                i24 = yzVar.a0;
                if (i24 >= 0) {
                }
                if (yzVar.q0 != v02) {
                }
                int measuredWidth222 = (int) (((getMeasuredWidth() - yzVar.p0.getIntrinsicWidth()) / 2.0f) + this.y);
                int measuredHeight22 = getMeasuredHeight() - AndroidUtilities.dp(12.0f);
                Drawable drawable22 = yzVar.p0;
                drawable22.setBounds(measuredWidth222, measuredHeight22, drawable22.getIntrinsicWidth() + measuredWidth222, yzVar.p0.getIntrinsicHeight() + measuredHeight22);
                if (this.g0 != 1.0f) {
                }
            }
        } else {
            i22 = i21;
            f18 = 17.333f;
        }
        f19 = i22;
        if (z15) {
        }
        float f372 = x8;
        float dp42 = AndroidUtilities.dp(f18) + x8;
        rectF = this.f;
        rectF.set(dp3, f372, f19 + dp3, dp42);
        if (!z13) {
        }
        canvas2.save();
        float f382 = this.x;
        if (!z13) {
        }
        canvas2.scale(f382, f382, rectF.centerX(), rectF.centerY());
        float f392 = AndroidUtilities.density * 11.5f;
        canvas2.drawRoundRect(rectF, f392, f392, paint2);
        if (!z15) {
        }
        if (!z13) {
        }
        canvas2.restore();
        if (!z10) {
            TextPaint textPaint82 = textPaint;
            textPaint82.setColor(textPaint5.getColor());
            textPaint82.setAlpha((int) (yzVar.w * 255.0f));
            float dp62 = AndroidUtilities.dp(3.0f);
            canvas2.drawLine(rectF.centerX() - dp62, rectF.centerY() - dp62, rectF.centerX() + dp62, rectF.centerY() + dp62, textPaint82);
            canvas2 = canvas;
            canvas2.drawLine(rectF.centerX() - dp62, rectF.centerY() + dp62, rectF.centerX() + dp62, rectF.centerY() - dp62, textPaint82);
        }
        float f2622 = f12;
        if (yzVar.v != f17) {
        }
        this.A = f14;
        vz vzVar22 = this.b;
        this.E = vzVar22.d;
        this.J = this.h;
        this.U = vzVar22.c;
        this.W = i22;
        this.a0 = f2622;
        this.d0 = this.d;
        this.f0 = getMeasuredWidth();
        if (this.b.f) {
        }
        if (yzVar.p0 == null) {
        }
        z11 = this.b.f;
        if (z11) {
        }
        if (!z11) {
        }
        this.g0 = Utilities.clamp(this.g0, 1.0f, f17);
        v02 = org.telegram.ui.ActionBar.g6.v0(yzVar.S, c6Var4);
        i24 = yzVar.a0;
        if (i24 >= 0) {
        }
        if (yzVar.q0 != v02) {
        }
        int measuredWidth2222 = (int) (((getMeasuredWidth() - yzVar.p0.getIntrinsicWidth()) / 2.0f) + this.y);
        int measuredHeight222 = getMeasuredHeight() - AndroidUtilities.dp(12.0f);
        Drawable drawable222 = yzVar.p0;
        drawable222.setBounds(measuredWidth2222, measuredHeight222, drawable222.getIntrinsicWidth() + measuredWidth2222, yzVar.p0.getIntrinsicHeight() + measuredHeight222);
        if (this.g0 != 1.0f) {
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        vz vzVar = this.b;
        accessibilityNodeInfo.setSelected((vzVar == null || (i10 = this.i0.H) == -1 || vzVar.a != i10) ? false : true);
        accessibilityNodeInfo.addAction(16);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString(R.string.AccDescrOpenMenu2)));
        if (this.b != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.b.b);
            vz vzVar2 = this.b;
            int i11 = vzVar2 != null ? vzVar2.d : 0;
            if (i11 > 0) {
                sb2.append("\n");
                sb2.append(LocaleController.formatPluralString("AccDescrUnreadCount", i11, new Object[0]));
            }
            accessibilityNodeInfo.setContentDescription(sb2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(24.0f) + this.b.a(false) + this.i0.J, View.MeasureSpec.getSize(i11));
    }
}
