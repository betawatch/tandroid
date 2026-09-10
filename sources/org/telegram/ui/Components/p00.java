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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class p00 extends View {
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
    public u5 O;
    public StaticLayout P;
    public u5 Q;
    public StaticLayout R;
    public u5 S;
    public StaticLayout T;
    public boolean U;
    public boolean V;
    public boolean W;
    public ValueAnimator a;
    public float a0;
    public n00 b;
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
    public final /* synthetic */ r00 m0;
    public boolean n;
    public u5 r;
    public StaticLayout s;
    public int v;
    public boolean w;
    public float x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p00(r00 r00Var, Context context) {
        super(context);
        this.m0 = r00Var;
        this.f = new RectF();
        this.I = -1;
    }

    public final void a() {
        this.w = false;
        this.H = false;
        this.U = false;
        this.G = false;
        this.W = false;
        this.a = null;
        invalidate();
    }

    public final void b(float f7, int i10) {
        if (i10 == 6) {
            this.y = 0.0f;
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(f7));
        ofFloat.addUpdateListener(new i00(this, 1));
        animatorSet.playTogether(ofFloat);
        animatorSet.setDuration(50L);
        animatorSet.addListener(new o00(this, i10, f7, 0));
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
        this.r = y5.update(this.b.g ? 26 : 0, this, this.r, this.s);
        this.O = y5.update(this.b.g ? 26 : 0, this, this.O, this.P);
        this.Q = y5.update(this.b.g ? 26 : 0, this, this.Q, this.R);
        this.S = y5.update(this.b.g ? 26 : 0, this, this.S, this.T);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        this.l0 = false;
        super.onDetachedFromWindow();
        this.w = false;
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
        y5.release(this, this.r);
        y5.release(this, this.O);
        y5.release(this, this.Q);
        y5.release(this, this.S);
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x047a, code lost:
    
        if (r12.w != 0.0f) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0121, code lost:
    
        if (r12.Q != (-1)) goto L46;
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
        org.telegram.ui.ActionBar.f6 f6Var;
        float f7;
        float f10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        org.telegram.ui.ActionBar.f6 f6Var2;
        boolean z10;
        String format;
        float f11;
        int dp;
        int i18;
        org.telegram.ui.ActionBar.f6 f6Var3;
        int i19;
        int i20;
        String str;
        int i21;
        float f12;
        float f13;
        TextPaint textPaint;
        Paint paint;
        org.telegram.ui.ActionBar.f6 f6Var4;
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
        r00 r00Var = this.m0;
        TextPaint textPaint4 = r00Var.d;
        Paint paint3 = r00Var.e;
        TextPaint textPaint5 = r00Var.c;
        TextPaint textPaint6 = r00Var.b;
        org.telegram.ui.ActionBar.f6 f6Var5 = r00Var.a;
        if (r00Var.v != 0.0f) {
            canvas2.save();
            float f20 = r00Var.v;
            f7 = 0.0f;
            float sin = (float) Math.sin(((f20 * (this.e % 2 == 0 ? 1.0f : -1.0f)) + r8) * 3.141592653589793d * 2.5d);
            f10 = 400.0f;
            double elapsedRealtime = (float) ((SystemClock.elapsedRealtime() / 400.0f) * 3.141592653589793d * (this.e % 2 == 0 ? 1.0f : -1.0f));
            f6Var = f6Var5;
            canvas2.translate((float) (Math.cos(elapsedRealtime) * AndroidUtilities.dp(0.33f) * (this.e % 2 == 0 ? 1.0f : -1.0f)), (float) (Math.sin(elapsedRealtime) * (-AndroidUtilities.dp(0.33f))));
            canvas2.rotate(sin * 1.4f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        } else {
            f6Var = f6Var5;
            f7 = 0.0f;
            f10 = 400.0f;
        }
        int i25 = r00Var.R;
        if (i25 != -1) {
            i11 = r00Var.L;
            i10 = i25;
        } else {
            i10 = r00Var.L;
            i11 = r00Var.r0;
        }
        int i26 = this.b.a;
        if (i26 == i10) {
            i12 = r00Var.V;
            i13 = r00Var.d0;
            i14 = r00Var.W;
            i17 = r00Var.e0;
            i15 = org.telegram.ui.ActionBar.j6.T9;
            i16 = org.telegram.ui.ActionBar.j6.U9;
        } else {
            i12 = r00Var.W;
            i13 = r00Var.e0;
            i14 = r00Var.V;
            i15 = org.telegram.ui.ActionBar.j6.U9;
            i16 = org.telegram.ui.ActionBar.j6.T9;
            i17 = i13;
        }
        if (i13 < 0) {
            if ((r00Var.O || i25 != -1) && (i26 == i10 || i26 == i11)) {
                f6Var2 = f6Var;
                textPaint6.setColor(i0.a.d(r00Var.P, org.telegram.ui.ActionBar.j6.v0(i14, f6Var2), org.telegram.ui.ActionBar.j6.v0(i12, f6Var2)));
            } else {
                f6Var2 = f6Var;
                textPaint6.setColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var2));
            }
            z10 = z12;
        } else {
            f6Var2 = f6Var;
            int v03 = org.telegram.ui.ActionBar.j6.v0(i12, f6Var2);
            int v04 = org.telegram.ui.ActionBar.j6.v0(i13, f6Var2);
            if (r00Var.O) {
                z10 = z12;
            } else {
                z10 = z12;
            }
            int i27 = this.b.a;
            if (i27 == i10 || i27 == i11) {
                textPaint6.setColor(i0.a.d(r00Var.P, i0.a.d(r00Var.w0, org.telegram.ui.ActionBar.j6.v0(i14, f6Var2), org.telegram.ui.ActionBar.j6.v0(i17, f6Var2)), i0.a.d(r00Var.w0, v03, v04)));
            }
            textPaint6.setColor(i0.a.d(r00Var.w0, v03, v04));
        }
        r00Var.f = new PorterDuffColorFilter(textPaint6.getColor(), PorterDuff.Mode.SRC_IN);
        int i28 = this.J;
        boolean z13 = i28 == 0 && this.H;
        boolean z14 = i28 > 0 && this.b.d == 0 && this.H;
        boolean z15 = i28 > 0 && this.b.d > 0 && this.H;
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
        if (!z10 && (r00Var.n || r00Var.w != f7)) {
            dp = (int) (((AndroidUtilities.dp(17.333f) - dp) * r00Var.w) + dp);
        }
        int i30 = this.b.c;
        if (dp == 0 || z14) {
            i18 = 0;
        } else {
            i18 = AndroidUtilities.dp((format != null ? 1.0f : r00Var.w) * (-2.0f)) + dp;
        }
        this.d = i30 + i18;
        float measuredWidth = (getMeasuredWidth() - this.d) / 2.0f;
        if (this.G) {
            float f21 = this.x;
            measuredWidth = com.google.android.gms.internal.vision.e2.z(1.0f, f21, this.F, measuredWidth * f21);
        }
        float f22 = measuredWidth;
        if (TextUtils.equals(this.b.b, this.h)) {
            f6Var3 = f6Var2;
            i19 = i10;
            i20 = i11;
            str = format;
            i21 = dp;
            f12 = 1.0f;
        } else {
            this.h = this.b.b;
            f6Var3 = f6Var2;
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
        if (this.U) {
            float f23 = this.a0 * (this.V ? this.x : f12 - this.x);
            if (this.T != null) {
                canvas2.save();
                canvas2.translate(this.v + f22 + f23, ((getMeasuredHeight() - this.c) / 2.0f) + f12);
                this.T.draw(canvas2);
                textPaint = textPaint4;
                textPaint3 = textPaint6;
                f19 = 1.0f;
                f13 = f22;
                f6Var4 = f6Var3;
                y5.drawAnimatedEmojis(canvas2, this.T, this.S, 0.0f, null, computeVerticalScrollOffset() - AndroidUtilities.dp(6.0f), computeVerticalScrollOffset() + computeVerticalScrollExtent(), 0.0f, 1.0f, r00Var.f);
                canvas2.restore();
            } else {
                textPaint3 = textPaint6;
                f13 = f22;
                textPaint = textPaint4;
                f6Var4 = f6Var3;
                f19 = 1.0f;
            }
            if (this.P != null) {
                canvas2.save();
                int alpha = textPaint3.getAlpha();
                TextPaint textPaint7 = textPaint3;
                textPaint7.setAlpha((int) (alpha * (this.V ? f19 - this.x : this.x)));
                canvas2.translate(f13 + this.v + f23, ((getMeasuredHeight() - this.c) / 2.0f) + f19);
                this.P.draw(canvas2);
                StaticLayout staticLayout2 = this.P;
                u5 u5Var = this.O;
                float computeVerticalScrollOffset = computeVerticalScrollOffset() - AndroidUtilities.dp(6.0f);
                float computeVerticalScrollOffset2 = computeVerticalScrollOffset() + computeVerticalScrollExtent();
                float f24 = this.V ? f19 - this.x : this.x;
                paint = paint3;
                textPaint2 = textPaint7;
                f14 = 1.0f;
                y5.drawAnimatedEmojis(canvas2, staticLayout2, u5Var, 0.0f, null, computeVerticalScrollOffset, computeVerticalScrollOffset2, 0.0f, f24, r00Var.f);
                canvas2.restore();
                textPaint2.setAlpha(alpha);
            } else {
                paint = paint3;
                textPaint2 = textPaint3;
                f14 = 1.0f;
            }
            if (this.R != null) {
                canvas2.save();
                int alpha2 = textPaint2.getAlpha();
                textPaint2.setAlpha((int) (alpha2 * (this.V ? this.x : f14 - this.x)));
                canvas2.translate(f13 + this.v + f23, ((getMeasuredHeight() - this.c) / 2.0f) + f14);
                this.R.draw(canvas2);
                y5.drawAnimatedEmojis(canvas2, this.R, this.Q, 0.0f, null, computeVerticalScrollOffset() - AndroidUtilities.dp(6.0f), computeVerticalScrollOffset() + computeVerticalScrollExtent(), 0.0f, this.V ? this.x : f14 - this.x, r00Var.f);
                canvas2.restore();
                textPaint2.setAlpha(alpha2);
            }
            f15 = f23;
        } else {
            f13 = f22;
            textPaint = textPaint4;
            paint = paint3;
            f6Var4 = f6Var3;
            f14 = 1.0f;
            textPaint2 = textPaint6;
            if (this.s != null) {
                canvas2.save();
                canvas2.translate(f13 + this.v, ((getMeasuredHeight() - this.c) / 2.0f) + 1.0f);
                this.s.draw(canvas2);
                y5.drawAnimatedEmojis(canvas2, this.s, this.r, 0.0f, null, computeVerticalScrollOffset() - AndroidUtilities.dp(6.0f), computeVerticalScrollOffset() + computeVerticalScrollExtent(), 0.0f, 1.0f, r00Var.f);
                canvas2.restore();
            }
            f15 = 0.0f;
        }
        String str2 = str;
        if (!z13 && str2 == null) {
            if (z10) {
                f16 = 0.0f;
            } else if (!r00Var.n) {
                f16 = 0.0f;
            }
            i22 = i21;
            float f25 = f11;
            if (r00Var.v != f16) {
                canvas2.restore();
            }
            this.E = f13;
            n00 n00Var = this.b;
            this.I = n00Var.d;
            this.N = this.h;
            this.b0 = n00Var.c;
            this.d0 = i22;
            this.e0 = f25;
            this.h0 = this.d;
            this.j0 = getMeasuredWidth();
            if (this.b.f && this.k0 == f16) {
                return;
            }
            if (r00Var.t0 == null) {
                r00Var.t0 = getContext().getDrawable(R.drawable.other_lockedfolders);
            }
            z11 = this.b.f;
            if (z11) {
                float f26 = this.k0;
                if (f26 != f14) {
                    this.k0 = f26 + 0.10666667f;
                    this.k0 = Utilities.clamp(this.k0, 1.0f, f16);
                    v02 = org.telegram.ui.ActionBar.j6.v0(r00Var.W, f6Var4);
                    i24 = r00Var.e0;
                    if (i24 >= 0) {
                        v02 = i0.a.d(r00Var.w0, v02, org.telegram.ui.ActionBar.j6.v0(i24, f6Var4));
                    }
                    if (r00Var.u0 != v02) {
                        r00Var.u0 = v02;
                        r00Var.t0.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
                    }
                    int measuredWidth2 = (int) (((getMeasuredWidth() - r00Var.t0.getIntrinsicWidth()) / 2.0f) + this.y);
                    int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(12.0f);
                    Drawable drawable = r00Var.t0;
                    drawable.setBounds(measuredWidth2, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth2, r00Var.t0.getIntrinsicHeight() + measuredHeight);
                    if (this.k0 != 1.0f) {
                        r00Var.t0.draw(canvas2);
                        return;
                    }
                    canvas2.save();
                    float f27 = this.k0;
                    canvas2.scale(f27, f27, r00Var.t0.getBounds().centerX(), r00Var.t0.getBounds().centerY());
                    r00Var.t0.draw(canvas2);
                    canvas2.restore();
                    return;
                }
            }
            if (!z11) {
                this.k0 -= 0.10666667f;
            }
            this.k0 = Utilities.clamp(this.k0, 1.0f, f16);
            v02 = org.telegram.ui.ActionBar.j6.v0(r00Var.W, f6Var4);
            i24 = r00Var.e0;
            if (i24 >= 0) {
            }
            if (r00Var.u0 != v02) {
            }
            int measuredWidth22 = (int) (((getMeasuredWidth() - r00Var.t0.getIntrinsicWidth()) / 2.0f) + this.y);
            int measuredHeight2 = getMeasuredHeight() - AndroidUtilities.dp(12.0f);
            Drawable drawable2 = r00Var.t0;
            drawable2.setBounds(measuredWidth22, measuredHeight2, drawable2.getIntrinsicWidth() + measuredWidth22, r00Var.t0.getIntrinsicHeight() + measuredHeight2);
            if (this.k0 != 1.0f) {
            }
        }
        f16 = 0.0f;
        if (r00Var.f0 < 0) {
            textPaint5.setColor(org.telegram.ui.ActionBar.j6.v0(r00Var.b0, f6Var4));
        } else {
            textPaint5.setColor(i0.a.d(r00Var.w0, org.telegram.ui.ActionBar.j6.v0(r00Var.b0, f6Var4), org.telegram.ui.ActionBar.j6.v0(r00Var.f0, f6Var4)));
        }
        if (org.telegram.ui.ActionBar.j6.c1(i15) && org.telegram.ui.ActionBar.j6.c1(i16)) {
            int v05 = org.telegram.ui.ActionBar.j6.v0(i15, f6Var4);
            if (r00Var.O || r00Var.Q != -1) {
                int i31 = this.b.a;
                if (i31 == i19) {
                    paint2 = paint;
                    i23 = i16;
                } else if (i31 == i20) {
                    i23 = i16;
                    paint2 = paint;
                }
                paint2.setColor(i0.a.d(r00Var.P, org.telegram.ui.ActionBar.j6.v0(i23, f6Var4), v05));
            }
            paint2 = paint;
            paint2.setColor(v05);
        } else {
            paint2 = paint;
            paint2.setColor(textPaint2.getColor());
        }
        float f28 = this.b.c;
        boolean z16 = this.U;
        if (z16) {
            float f29 = this.c0;
            float f30 = this.x;
            f28 = (f28 * f30) + ((f14 - f30) * f29);
        }
        float dp3 = (z16 && this.R == null) ? (f13 - this.a0) + f15 + f28 + AndroidUtilities.dp(5.0f) : AndroidUtilities.dp(5.0f) + f13 + f28;
        int y3 = org.telegram.messenger.em.y(17.333f, getMeasuredHeight(), 2);
        if (z10 || ((!r00Var.n && r00Var.w == f16) || str2 != null)) {
            paint2.setAlpha(255);
        } else {
            paint2.setAlpha((int) (r00Var.w * 255.0f));
        }
        if (z15) {
            float f31 = this.f0;
            i22 = i21;
            float f32 = i22;
            f17 = 17.333f;
            if (f31 != f32) {
                float f33 = this.x;
                f18 = (f32 * f33) + ((f14 - f33) * f31);
                if (z15) {
                    float f34 = this.g0;
                    float f35 = this.x;
                    f11 = (f11 * f35) + ((f14 - f35) * f34);
                }
                float f36 = y3;
                float dp4 = AndroidUtilities.dp(f17) + y3;
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
                    if (this.K != null) {
                        dp2 = AndroidUtilities.dp(f17);
                        lineBottom = this.K.getLineBottom(0);
                        lineTop = this.K.getLineTop(0);
                    } else if (this.L != null) {
                        dp2 = AndroidUtilities.dp(f17);
                        lineBottom = this.L.getLineBottom(0);
                        lineTop = this.L.getLineTop(0);
                    } else {
                        if (this.M != null) {
                            dp2 = AndroidUtilities.dp(f17);
                            lineBottom = this.M.getLineBottom(0);
                            lineTop = this.M.getLineTop(0);
                        }
                        float dp5 = f36 - AndroidUtilities.dp(0.5f);
                        float f39 = z10 ? f14 - r00Var.w : 1.0f;
                        if (this.K != null) {
                            canvas2.save();
                            textPaint5.setAlpha((int) (f39 * 255.0f * this.x));
                            canvas2.translate(((rectF.width() - f11) / 2.0f) + rectF.left, ((f14 - this.x) * AndroidUtilities.dp(15.0f)) + dp5);
                            this.K.draw(canvas2);
                            canvas2.restore();
                        }
                        if (this.L != null) {
                            canvas2.save();
                            textPaint5.setAlpha((int) ((f14 - this.x) * f39 * 255.0f));
                            canvas2.translate(((rectF.width() - f11) / 2.0f) + rectF.left, (this.x * (-AndroidUtilities.dp(15.0f))) + dp5);
                            this.L.draw(canvas2);
                            canvas2.restore();
                        }
                        if (this.M != null) {
                            canvas2.save();
                            textPaint5.setAlpha((int) (f39 * 255.0f));
                            canvas2.translate(((rectF.width() - f11) / 2.0f) + rectF.left, dp5);
                            this.M.draw(canvas2);
                            canvas2.restore();
                        }
                        textPaint5.setAlpha(255);
                    }
                    f36 += (dp2 - (lineBottom - lineTop)) / 2.0f;
                    float dp52 = f36 - AndroidUtilities.dp(0.5f);
                    if (z10) {
                    }
                    if (this.K != null) {
                    }
                    if (this.L != null) {
                    }
                    if (this.M != null) {
                    }
                    textPaint5.setAlpha(255);
                } else if (str2 != null) {
                    if (!z10) {
                        textPaint5.setAlpha((int) ((f14 - r00Var.w) * 255.0f));
                    }
                    canvas2.drawText(str2, ((rectF.width() - f11) / 2.0f) + rectF.left, AndroidUtilities.dp(12.5f) + y3, textPaint5);
                }
                if (!z13 || z14) {
                    canvas2.restore();
                }
                if (!z10 && (r00Var.n || r00Var.w != f16)) {
                    TextPaint textPaint8 = textPaint;
                    textPaint8.setColor(textPaint5.getColor());
                    textPaint8.setAlpha((int) (r00Var.w * 255.0f));
                    float dp6 = AndroidUtilities.dp(3.0f);
                    canvas2.drawLine(rectF.centerX() - dp6, rectF.centerY() - dp6, rectF.centerX() + dp6, rectF.centerY() + dp6, textPaint8);
                    canvas2 = canvas;
                    canvas2.drawLine(rectF.centerX() - dp6, rectF.centerY() + dp6, rectF.centerX() + dp6, rectF.centerY() - dp6, textPaint8);
                }
                float f252 = f11;
                if (r00Var.v != f16) {
                }
                this.E = f13;
                n00 n00Var2 = this.b;
                this.I = n00Var2.d;
                this.N = this.h;
                this.b0 = n00Var2.c;
                this.d0 = i22;
                this.e0 = f252;
                this.h0 = this.d;
                this.j0 = getMeasuredWidth();
                if (this.b.f) {
                }
                if (r00Var.t0 == null) {
                }
                z11 = this.b.f;
                if (z11) {
                }
                if (!z11) {
                }
                this.k0 = Utilities.clamp(this.k0, 1.0f, f16);
                v02 = org.telegram.ui.ActionBar.j6.v0(r00Var.W, f6Var4);
                i24 = r00Var.e0;
                if (i24 >= 0) {
                }
                if (r00Var.u0 != v02) {
                }
                int measuredWidth222 = (int) (((getMeasuredWidth() - r00Var.t0.getIntrinsicWidth()) / 2.0f) + this.y);
                int measuredHeight22 = getMeasuredHeight() - AndroidUtilities.dp(12.0f);
                Drawable drawable22 = r00Var.t0;
                drawable22.setBounds(measuredWidth222, measuredHeight22, drawable22.getIntrinsicWidth() + measuredWidth222, r00Var.t0.getIntrinsicHeight() + measuredHeight22);
                if (this.k0 != 1.0f) {
                }
            }
        } else {
            i22 = i21;
            f17 = 17.333f;
        }
        f18 = i22;
        if (z15) {
        }
        float f362 = y3;
        float dp42 = AndroidUtilities.dp(f17) + y3;
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
            textPaint82.setAlpha((int) (r00Var.w * 255.0f));
            float dp62 = AndroidUtilities.dp(3.0f);
            canvas2.drawLine(rectF.centerX() - dp62, rectF.centerY() - dp62, rectF.centerX() + dp62, rectF.centerY() + dp62, textPaint82);
            canvas2 = canvas;
            canvas2.drawLine(rectF.centerX() - dp62, rectF.centerY() + dp62, rectF.centerX() + dp62, rectF.centerY() - dp62, textPaint82);
        }
        float f2522 = f11;
        if (r00Var.v != f16) {
        }
        this.E = f13;
        n00 n00Var22 = this.b;
        this.I = n00Var22.d;
        this.N = this.h;
        this.b0 = n00Var22.c;
        this.d0 = i22;
        this.e0 = f2522;
        this.h0 = this.d;
        this.j0 = getMeasuredWidth();
        if (this.b.f) {
        }
        if (r00Var.t0 == null) {
        }
        z11 = this.b.f;
        if (z11) {
        }
        if (!z11) {
        }
        this.k0 = Utilities.clamp(this.k0, 1.0f, f16);
        v02 = org.telegram.ui.ActionBar.j6.v0(r00Var.W, f6Var4);
        i24 = r00Var.e0;
        if (i24 >= 0) {
        }
        if (r00Var.u0 != v02) {
        }
        int measuredWidth2222 = (int) (((getMeasuredWidth() - r00Var.t0.getIntrinsicWidth()) / 2.0f) + this.y);
        int measuredHeight222 = getMeasuredHeight() - AndroidUtilities.dp(12.0f);
        Drawable drawable222 = r00Var.t0;
        drawable222.setBounds(measuredWidth2222, measuredHeight222, drawable222.getIntrinsicWidth() + measuredWidth2222, r00Var.t0.getIntrinsicHeight() + measuredHeight222);
        if (this.k0 != 1.0f) {
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        n00 n00Var = this.b;
        accessibilityNodeInfo.setSelected((n00Var == null || (i10 = this.m0.L) == -1 || n00Var.a != i10) ? false : true);
        accessibilityNodeInfo.addAction(16);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString(R.string.AccDescrOpenMenu2)));
        if (this.b != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.b.b);
            n00 n00Var2 = this.b;
            int i11 = n00Var2 != null ? n00Var2.d : 0;
            if (i11 > 0) {
                sb2.append("\n");
                sb2.append(LocaleController.formatPluralString("AccDescrUnreadCount", i11, new Object[0]));
            }
            accessibilityNodeInfo.setContentDescription(sb2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(24.0f) + this.b.a(false) + this.m0.N, View.MeasureSpec.getSize(i11));
    }
}
