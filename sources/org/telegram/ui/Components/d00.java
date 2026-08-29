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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class d00 extends View {
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
    public u5 K;
    public StaticLayout L;
    public u5 M;
    public StaticLayout N;
    public u5 O;
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
    public c00 b;
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
    public final /* synthetic */ f00 i0;
    public boolean n;
    public u5 r;
    public StaticLayout s;
    public int v;
    public boolean w;
    public float x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d00(f00 f00Var, Context context) {
        super(context);
        this.i0 = f00Var;
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

    public final void b(float f9, int i10) {
        if (i10 == 6) {
            this.y = 0.0f;
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(f9));
        ofFloat.addUpdateListener(new wz(this, 1));
        animatorSet.playTogether(ofFloat);
        animatorSet.setDuration(50L);
        animatorSet.addListener(new jh.za(this, i10, f9, 1));
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
        this.r = y5.update(this.b.g ? 26 : 0, this, this.r, this.s);
        this.K = y5.update(this.b.g ? 26 : 0, this, this.K, this.L);
        this.M = y5.update(this.b.g ? 26 : 0, this, this.M, this.N);
        this.O = y5.update(this.b.g ? 26 : 0, this, this.O, this.P);
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
        y5.release(this, this.r);
        y5.release(this, this.K);
        y5.release(this, this.M);
        y5.release(this, this.O);
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x047a, code lost:
    
        if (r12.w != 0.0f) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0121, code lost:
    
        if (r12.M != (-1)) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0755  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0761  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0776  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x079b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x07a9  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x07ed  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0814  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0782  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x059c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.c6 c6Var;
        float f9;
        float f10;
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
        float f11;
        int dp;
        int i18;
        org.telegram.ui.ActionBar.c6 c6Var3;
        int i19;
        int i20;
        String str;
        int i21;
        float f12;
        float f13;
        TextPaint textPaint;
        Paint paint;
        org.telegram.ui.ActionBar.c6 c6Var4;
        float f14;
        TextPaint textPaint2;
        float f15;
        float f16;
        Paint paint2;
        int i22;
        float f17;
        float f18;
        RectF rectF;
        int dp2;
        int lineBottom;
        int lineTop;
        int i23;
        boolean z11;
        int v02;
        int i24;
        TextPaint textPaint3;
        float f19;
        Canvas canvas2 = canvas;
        boolean z12 = this.b.e;
        f00 f00Var = this.i0;
        TextPaint textPaint4 = f00Var.d;
        Paint paint3 = f00Var.e;
        TextPaint textPaint5 = f00Var.c;
        TextPaint textPaint6 = f00Var.b;
        org.telegram.ui.ActionBar.c6 c6Var5 = f00Var.a;
        if (f00Var.v != 0.0f) {
            canvas2.save();
            float f20 = f00Var.v;
            f9 = 0.0f;
            float sin = (float) Math.sin(((f20 * (this.e % 2 == 0 ? 1.0f : -1.0f)) + r8) * 3.141592653589793d * 2.5d);
            f10 = 400.0f;
            double elapsedRealtime = (float) ((SystemClock.elapsedRealtime() / 400.0f) * 3.141592653589793d * (this.e % 2 == 0 ? 1.0f : -1.0f));
            c6Var = c6Var5;
            canvas2.translate((float) (Math.cos(elapsedRealtime) * AndroidUtilities.dp(0.33f) * (this.e % 2 == 0 ? 1.0f : -1.0f)), (float) (Math.sin(elapsedRealtime) * (-AndroidUtilities.dp(0.33f))));
            canvas2.rotate(sin * 1.4f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        } else {
            c6Var = c6Var5;
            f9 = 0.0f;
            f10 = 400.0f;
        }
        int i25 = f00Var.N;
        if (i25 != -1) {
            i11 = f00Var.H;
            i10 = i25;
        } else {
            i10 = f00Var.H;
            i11 = f00Var.n0;
        }
        int i26 = this.b.a;
        if (i26 == i10) {
            i12 = f00Var.R;
            i13 = f00Var.W;
            i14 = f00Var.S;
            i17 = f00Var.a0;
            i15 = org.telegram.ui.ActionBar.g6.T9;
            i16 = org.telegram.ui.ActionBar.g6.U9;
        } else {
            i12 = f00Var.S;
            i13 = f00Var.a0;
            i14 = f00Var.R;
            i15 = org.telegram.ui.ActionBar.g6.U9;
            i16 = org.telegram.ui.ActionBar.g6.T9;
            i17 = i13;
        }
        if (i13 < 0) {
            if ((f00Var.K || i25 != -1) && (i26 == i10 || i26 == i11)) {
                c6Var2 = c6Var;
                textPaint6.setColor(i0.a.d(f00Var.L, org.telegram.ui.ActionBar.g6.v0(i14, c6Var2), org.telegram.ui.ActionBar.g6.v0(i12, c6Var2)));
            } else {
                c6Var2 = c6Var;
                textPaint6.setColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var2));
            }
            z10 = z12;
        } else {
            c6Var2 = c6Var;
            int v03 = org.telegram.ui.ActionBar.g6.v0(i12, c6Var2);
            int v04 = org.telegram.ui.ActionBar.g6.v0(i13, c6Var2);
            if (f00Var.K) {
                z10 = z12;
            } else {
                z10 = z12;
            }
            int i27 = this.b.a;
            if (i27 == i10 || i27 == i11) {
                textPaint6.setColor(i0.a.d(f00Var.L, i0.a.d(f00Var.s0, org.telegram.ui.ActionBar.g6.v0(i14, c6Var2), org.telegram.ui.ActionBar.g6.v0(i17, c6Var2)), i0.a.d(f00Var.s0, v03, v04)));
            }
            textPaint6.setColor(i0.a.d(f00Var.s0, v03, v04));
        }
        f00Var.f = new PorterDuffColorFilter(textPaint6.getColor(), PorterDuff.Mode.SRC_IN);
        int i28 = this.F;
        boolean z13 = i28 == 0 && this.D;
        boolean z14 = i28 > 0 && this.b.d == 0 && this.D;
        boolean z15 = i28 > 0 && this.b.d > 0 && this.D;
        int i29 = this.b.d;
        if (i29 > 0 || z14) {
            format = z14 ? String.format("%d", Integer.valueOf(i28)) : String.format("%d", Integer.valueOf(i29));
            float ceil = (int) Math.ceil(textPaint5.measureText(format));
            f11 = ceil;
            dp = AndroidUtilities.dp(10.0f) + ((int) Math.max(AndroidUtilities.dp(7.333f), ceil));
        } else {
            format = null;
            dp = 0;
            f11 = 0.0f;
        }
        if (!z10 && (f00Var.n || f00Var.w != f9)) {
            dp = (int) (((AndroidUtilities.dp(17.333f) - dp) * f00Var.w) + dp);
        }
        int i30 = this.b.c;
        if (dp == 0 || z14) {
            i18 = 0;
        } else {
            i18 = AndroidUtilities.dp((format != null ? 1.0f : f00Var.w) * (-2.0f)) + dp;
        }
        this.d = i30 + i18;
        float measuredWidth = (getMeasuredWidth() - this.d) / 2.0f;
        if (this.C) {
            float f21 = this.x;
            measuredWidth = com.google.android.recaptcha.internal.a.z(1.0f, f21, this.B, measuredWidth * f21);
        }
        float f22 = measuredWidth;
        if (TextUtils.equals(this.b.b, this.h)) {
            c6Var3 = c6Var2;
            i19 = i10;
            i20 = i11;
            str = format;
            i21 = dp;
            f12 = 1.0f;
        } else {
            this.h = this.b.b;
            c6Var3 = c6Var2;
            i20 = i11;
            str = format;
            i21 = dp;
            i19 = i10;
            f12 = 1.0f;
            StaticLayout staticLayout = new StaticLayout(this.h, textPaint6, AndroidUtilities.dp(f10), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.s = staticLayout;
            this.r = y5.update(this.b.g ? 26 : 0, this, this.r, staticLayout);
            this.c = this.s.getHeight();
            this.v = (int) (-this.s.getLineLeft(0));
        }
        if (this.Q) {
            float f23 = this.T * (this.R ? this.x : f12 - this.x);
            if (this.P != null) {
                canvas2.save();
                canvas2.translate(this.v + f22 + f23, ((getMeasuredHeight() - this.c) / 2.0f) + f12);
                this.P.draw(canvas2);
                textPaint = textPaint4;
                textPaint3 = textPaint6;
                f19 = 1.0f;
                f13 = f22;
                c6Var4 = c6Var3;
                y5.drawAnimatedEmojis(canvas2, this.P, this.O, 0.0f, null, computeVerticalScrollOffset() - AndroidUtilities.dp(6.0f), computeVerticalScrollOffset() + computeVerticalScrollExtent(), 0.0f, 1.0f, f00Var.f);
                canvas2.restore();
            } else {
                textPaint3 = textPaint6;
                f13 = f22;
                textPaint = textPaint4;
                c6Var4 = c6Var3;
                f19 = 1.0f;
            }
            if (this.L != null) {
                canvas2.save();
                int alpha = textPaint3.getAlpha();
                TextPaint textPaint7 = textPaint3;
                textPaint7.setAlpha((int) (alpha * (this.R ? f19 - this.x : this.x)));
                canvas2.translate(f13 + this.v + f23, ((getMeasuredHeight() - this.c) / 2.0f) + f19);
                this.L.draw(canvas2);
                StaticLayout staticLayout2 = this.L;
                u5 u5Var = this.K;
                float computeVerticalScrollOffset = computeVerticalScrollOffset() - AndroidUtilities.dp(6.0f);
                float computeVerticalScrollOffset2 = computeVerticalScrollOffset() + computeVerticalScrollExtent();
                float f24 = this.R ? f19 - this.x : this.x;
                paint = paint3;
                textPaint2 = textPaint7;
                f14 = 1.0f;
                y5.drawAnimatedEmojis(canvas2, staticLayout2, u5Var, 0.0f, null, computeVerticalScrollOffset, computeVerticalScrollOffset2, 0.0f, f24, f00Var.f);
                canvas2.restore();
                textPaint2.setAlpha(alpha);
            } else {
                paint = paint3;
                textPaint2 = textPaint3;
                f14 = 1.0f;
            }
            if (this.N != null) {
                canvas2.save();
                int alpha2 = textPaint2.getAlpha();
                textPaint2.setAlpha((int) (alpha2 * (this.R ? this.x : f14 - this.x)));
                canvas2.translate(f13 + this.v + f23, ((getMeasuredHeight() - this.c) / 2.0f) + f14);
                this.N.draw(canvas2);
                y5.drawAnimatedEmojis(canvas2, this.N, this.M, 0.0f, null, computeVerticalScrollOffset() - AndroidUtilities.dp(6.0f), computeVerticalScrollOffset() + computeVerticalScrollExtent(), 0.0f, this.R ? this.x : f14 - this.x, f00Var.f);
                canvas2.restore();
                textPaint2.setAlpha(alpha2);
            }
            f15 = f23;
        } else {
            f13 = f22;
            textPaint = textPaint4;
            paint = paint3;
            c6Var4 = c6Var3;
            f14 = 1.0f;
            textPaint2 = textPaint6;
            if (this.s != null) {
                canvas2.save();
                canvas2.translate(f13 + this.v, ((getMeasuredHeight() - this.c) / 2.0f) + 1.0f);
                this.s.draw(canvas2);
                y5.drawAnimatedEmojis(canvas2, this.s, this.r, 0.0f, null, computeVerticalScrollOffset() - AndroidUtilities.dp(6.0f), computeVerticalScrollOffset() + computeVerticalScrollExtent(), 0.0f, 1.0f, f00Var.f);
                canvas2.restore();
            }
            f15 = 0.0f;
        }
        String str2 = str;
        if (!z13 && str2 == null) {
            if (z10) {
                f16 = 0.0f;
            } else if (!f00Var.n) {
                f16 = 0.0f;
            }
            i22 = i21;
            float f25 = f11;
            if (f00Var.v != f16) {
                canvas2.restore();
            }
            this.A = f13;
            c00 c00Var = this.b;
            this.E = c00Var.d;
            this.J = this.h;
            this.U = c00Var.c;
            this.W = i22;
            this.a0 = f25;
            this.d0 = this.d;
            this.f0 = getMeasuredWidth();
            if (this.b.f && this.g0 == f16) {
                return;
            }
            if (f00Var.p0 == null) {
                f00Var.p0 = getContext().getDrawable(R.drawable.other_lockedfolders);
            }
            z11 = this.b.f;
            if (z11) {
                float f26 = this.g0;
                if (f26 != f14) {
                    this.g0 = f26 + 0.10666667f;
                    this.g0 = Utilities.clamp(this.g0, 1.0f, f16);
                    v02 = org.telegram.ui.ActionBar.g6.v0(f00Var.S, c6Var4);
                    i24 = f00Var.a0;
                    if (i24 >= 0) {
                        v02 = i0.a.d(f00Var.s0, v02, org.telegram.ui.ActionBar.g6.v0(i24, c6Var4));
                    }
                    if (f00Var.q0 != v02) {
                        f00Var.q0 = v02;
                        f00Var.p0.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
                    }
                    int measuredWidth2 = (int) (((getMeasuredWidth() - f00Var.p0.getIntrinsicWidth()) / 2.0f) + this.y);
                    int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(12.0f);
                    Drawable drawable = f00Var.p0;
                    drawable.setBounds(measuredWidth2, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth2, f00Var.p0.getIntrinsicHeight() + measuredHeight);
                    if (this.g0 != 1.0f) {
                        f00Var.p0.draw(canvas2);
                        return;
                    }
                    canvas2.save();
                    float f27 = this.g0;
                    canvas2.scale(f27, f27, f00Var.p0.getBounds().centerX(), f00Var.p0.getBounds().centerY());
                    f00Var.p0.draw(canvas2);
                    canvas2.restore();
                    return;
                }
            }
            if (!z11) {
                this.g0 -= 0.10666667f;
            }
            this.g0 = Utilities.clamp(this.g0, 1.0f, f16);
            v02 = org.telegram.ui.ActionBar.g6.v0(f00Var.S, c6Var4);
            i24 = f00Var.a0;
            if (i24 >= 0) {
            }
            if (f00Var.q0 != v02) {
            }
            int measuredWidth22 = (int) (((getMeasuredWidth() - f00Var.p0.getIntrinsicWidth()) / 2.0f) + this.y);
            int measuredHeight2 = getMeasuredHeight() - AndroidUtilities.dp(12.0f);
            Drawable drawable2 = f00Var.p0;
            drawable2.setBounds(measuredWidth22, measuredHeight2, drawable2.getIntrinsicWidth() + measuredWidth22, f00Var.p0.getIntrinsicHeight() + measuredHeight2);
            if (this.g0 != 1.0f) {
            }
        }
        f16 = 0.0f;
        if (f00Var.b0 < 0) {
            textPaint5.setColor(org.telegram.ui.ActionBar.g6.v0(f00Var.U, c6Var4));
        } else {
            textPaint5.setColor(i0.a.d(f00Var.s0, org.telegram.ui.ActionBar.g6.v0(f00Var.U, c6Var4), org.telegram.ui.ActionBar.g6.v0(f00Var.b0, c6Var4)));
        }
        if (org.telegram.ui.ActionBar.g6.c1(i15) && org.telegram.ui.ActionBar.g6.c1(i16)) {
            int v05 = org.telegram.ui.ActionBar.g6.v0(i15, c6Var4);
            if (f00Var.K || f00Var.M != -1) {
                int i31 = this.b.a;
                if (i31 == i19) {
                    paint2 = paint;
                    i23 = i16;
                } else if (i31 == i20) {
                    i23 = i16;
                    paint2 = paint;
                }
                paint2.setColor(i0.a.d(f00Var.L, org.telegram.ui.ActionBar.g6.v0(i23, c6Var4), v05));
            }
            paint2 = paint;
            paint2.setColor(v05);
        } else {
            paint2 = paint;
            paint2.setColor(textPaint2.getColor());
        }
        float f28 = this.b.c;
        boolean z16 = this.Q;
        if (z16) {
            float f29 = this.V;
            float f30 = this.x;
            f28 = (f28 * f30) + ((f14 - f30) * f29);
        }
        float dp3 = (z16 && this.N == null) ? (f13 - this.T) + f15 + f28 + AndroidUtilities.dp(5.0f) : AndroidUtilities.dp(5.0f) + f13 + f28;
        int x4 = org.telegram.ui.b.x(17.333f, getMeasuredHeight(), 2);
        if (z10 || ((!f00Var.n && f00Var.w == f16) || str2 != null)) {
            paint2.setAlpha(255);
        } else {
            paint2.setAlpha((int) (f00Var.w * 255.0f));
        }
        if (z15) {
            float f31 = this.b0;
            i22 = i21;
            float f32 = i22;
            f17 = 17.333f;
            if (f31 != f32) {
                float f33 = this.x;
                f18 = (f32 * f33) + ((f14 - f33) * f31);
                if (z15) {
                    float f34 = this.c0;
                    float f35 = this.x;
                    f11 = (f11 * f35) + ((f14 - f35) * f34);
                }
                float f36 = x4;
                float dp4 = AndroidUtilities.dp(f17) + x4;
                rectF = this.f;
                rectF.set(dp3, f36, f18 + dp3, dp4);
                if (!z13 || z14) {
                    canvas2.save();
                    float f37 = !z13 ? this.x : f14 - this.x;
                    canvas2.scale(f37, f37, rectF.centerX(), rectF.centerY());
                }
                float f38 = AndroidUtilities.density * 11.5f;
                canvas2.drawRoundRect(rectF, f38, f38, paint2);
                if (!z15) {
                    if (this.G != null) {
                        dp2 = AndroidUtilities.dp(f17);
                        lineBottom = this.G.getLineBottom(0);
                        lineTop = this.G.getLineTop(0);
                    } else if (this.H != null) {
                        dp2 = AndroidUtilities.dp(f17);
                        lineBottom = this.H.getLineBottom(0);
                        lineTop = this.H.getLineTop(0);
                    } else {
                        if (this.I != null) {
                            dp2 = AndroidUtilities.dp(f17);
                            lineBottom = this.I.getLineBottom(0);
                            lineTop = this.I.getLineTop(0);
                        }
                        float dp5 = f36 - AndroidUtilities.dp(0.5f);
                        float f39 = z10 ? f14 - f00Var.w : 1.0f;
                        if (this.G != null) {
                            canvas2.save();
                            textPaint5.setAlpha((int) (f39 * 255.0f * this.x));
                            canvas2.translate(((rectF.width() - f11) / 2.0f) + rectF.left, ((f14 - this.x) * AndroidUtilities.dp(15.0f)) + dp5);
                            this.G.draw(canvas2);
                            canvas2.restore();
                        }
                        if (this.H != null) {
                            canvas2.save();
                            textPaint5.setAlpha((int) ((f14 - this.x) * f39 * 255.0f));
                            canvas2.translate(((rectF.width() - f11) / 2.0f) + rectF.left, (this.x * (-AndroidUtilities.dp(15.0f))) + dp5);
                            this.H.draw(canvas2);
                            canvas2.restore();
                        }
                        if (this.I != null) {
                            canvas2.save();
                            textPaint5.setAlpha((int) (f39 * 255.0f));
                            canvas2.translate(((rectF.width() - f11) / 2.0f) + rectF.left, dp5);
                            this.I.draw(canvas2);
                            canvas2.restore();
                        }
                        textPaint5.setAlpha(255);
                    }
                    f36 += (dp2 - (lineBottom - lineTop)) / 2.0f;
                    float dp52 = f36 - AndroidUtilities.dp(0.5f);
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
                        textPaint5.setAlpha((int) ((f14 - f00Var.w) * 255.0f));
                    }
                    canvas2.drawText(str2, ((rectF.width() - f11) / 2.0f) + rectF.left, AndroidUtilities.dp(12.5f) + x4, textPaint5);
                }
                if (!z13 || z14) {
                    canvas2.restore();
                }
                if (!z10 && (f00Var.n || f00Var.w != f16)) {
                    TextPaint textPaint8 = textPaint;
                    textPaint8.setColor(textPaint5.getColor());
                    textPaint8.setAlpha((int) (f00Var.w * 255.0f));
                    float dp6 = AndroidUtilities.dp(3.0f);
                    canvas2.drawLine(rectF.centerX() - dp6, rectF.centerY() - dp6, rectF.centerX() + dp6, rectF.centerY() + dp6, textPaint8);
                    canvas2 = canvas;
                    canvas2.drawLine(rectF.centerX() - dp6, rectF.centerY() + dp6, rectF.centerX() + dp6, rectF.centerY() - dp6, textPaint8);
                }
                float f252 = f11;
                if (f00Var.v != f16) {
                }
                this.A = f13;
                c00 c00Var2 = this.b;
                this.E = c00Var2.d;
                this.J = this.h;
                this.U = c00Var2.c;
                this.W = i22;
                this.a0 = f252;
                this.d0 = this.d;
                this.f0 = getMeasuredWidth();
                if (this.b.f) {
                }
                if (f00Var.p0 == null) {
                }
                z11 = this.b.f;
                if (z11) {
                }
                if (!z11) {
                }
                this.g0 = Utilities.clamp(this.g0, 1.0f, f16);
                v02 = org.telegram.ui.ActionBar.g6.v0(f00Var.S, c6Var4);
                i24 = f00Var.a0;
                if (i24 >= 0) {
                }
                if (f00Var.q0 != v02) {
                }
                int measuredWidth222 = (int) (((getMeasuredWidth() - f00Var.p0.getIntrinsicWidth()) / 2.0f) + this.y);
                int measuredHeight22 = getMeasuredHeight() - AndroidUtilities.dp(12.0f);
                Drawable drawable22 = f00Var.p0;
                drawable22.setBounds(measuredWidth222, measuredHeight22, drawable22.getIntrinsicWidth() + measuredWidth222, f00Var.p0.getIntrinsicHeight() + measuredHeight22);
                if (this.g0 != 1.0f) {
                }
            }
        } else {
            i22 = i21;
            f17 = 17.333f;
        }
        f18 = i22;
        if (z15) {
        }
        float f362 = x4;
        float dp42 = AndroidUtilities.dp(f17) + x4;
        rectF = this.f;
        rectF.set(dp3, f362, f18 + dp3, dp42);
        if (!z13) {
        }
        canvas2.save();
        if (!z13) {
        }
        canvas2.scale(f37, f37, rectF.centerX(), rectF.centerY());
        float f382 = AndroidUtilities.density * 11.5f;
        canvas2.drawRoundRect(rectF, f382, f382, paint2);
        if (!z15) {
        }
        if (!z13) {
        }
        canvas2.restore();
        if (!z10) {
            TextPaint textPaint82 = textPaint;
            textPaint82.setColor(textPaint5.getColor());
            textPaint82.setAlpha((int) (f00Var.w * 255.0f));
            float dp62 = AndroidUtilities.dp(3.0f);
            canvas2.drawLine(rectF.centerX() - dp62, rectF.centerY() - dp62, rectF.centerX() + dp62, rectF.centerY() + dp62, textPaint82);
            canvas2 = canvas;
            canvas2.drawLine(rectF.centerX() - dp62, rectF.centerY() + dp62, rectF.centerX() + dp62, rectF.centerY() - dp62, textPaint82);
        }
        float f2522 = f11;
        if (f00Var.v != f16) {
        }
        this.A = f13;
        c00 c00Var22 = this.b;
        this.E = c00Var22.d;
        this.J = this.h;
        this.U = c00Var22.c;
        this.W = i22;
        this.a0 = f2522;
        this.d0 = this.d;
        this.f0 = getMeasuredWidth();
        if (this.b.f) {
        }
        if (f00Var.p0 == null) {
        }
        z11 = this.b.f;
        if (z11) {
        }
        if (!z11) {
        }
        this.g0 = Utilities.clamp(this.g0, 1.0f, f16);
        v02 = org.telegram.ui.ActionBar.g6.v0(f00Var.S, c6Var4);
        i24 = f00Var.a0;
        if (i24 >= 0) {
        }
        if (f00Var.q0 != v02) {
        }
        int measuredWidth2222 = (int) (((getMeasuredWidth() - f00Var.p0.getIntrinsicWidth()) / 2.0f) + this.y);
        int measuredHeight222 = getMeasuredHeight() - AndroidUtilities.dp(12.0f);
        Drawable drawable222 = f00Var.p0;
        drawable222.setBounds(measuredWidth2222, measuredHeight222, drawable222.getIntrinsicWidth() + measuredWidth2222, f00Var.p0.getIntrinsicHeight() + measuredHeight222);
        if (this.g0 != 1.0f) {
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        c00 c00Var = this.b;
        accessibilityNodeInfo.setSelected((c00Var == null || (i10 = this.i0.H) == -1 || c00Var.a != i10) ? false : true);
        accessibilityNodeInfo.addAction(16);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString(R.string.AccDescrOpenMenu2)));
        if (this.b != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.b.b);
            c00 c00Var2 = this.b;
            int i11 = c00Var2 != null ? c00Var2.d : 0;
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
