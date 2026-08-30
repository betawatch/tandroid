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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class h00 extends View {
    public float B;
    public float C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public StaticLayout H;
    public StaticLayout I;
    public StaticLayout J;
    public CharSequence K;
    public q5 L;
    public StaticLayout M;
    public q5 N;
    public StaticLayout O;
    public q5 P;
    public StaticLayout Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public float U;
    public int V;
    public int W;
    public ValueAnimator a;
    public int a0;
    public g00 b;
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
    public float h0;
    public boolean i0;
    public final /* synthetic */ j00 j0;
    public boolean n;
    public q5 r;
    public StaticLayout s;
    public int v;
    public boolean w;
    public float x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h00(j00 j00Var, Context context) {
        super(context);
        this.j0 = j00Var;
        this.f = new RectF();
        this.F = -1;
    }

    public final void a() {
        this.w = false;
        this.E = false;
        this.R = false;
        this.D = false;
        this.T = false;
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
        ofFloat.addUpdateListener(new b00(this, 1));
        animatorSet.playTogether(ofFloat);
        animatorSet.setDuration(50L);
        animatorSet.addListener(new lh.ab(this, i10, f10, 1));
        animatorSet.start();
    }

    @Override // android.view.View
    public int getId() {
        return this.b.a;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        this.i0 = true;
        super.onAttachedToWindow();
        this.r = u5.update(this.b.g ? 26 : 0, this, this.r, this.s);
        this.L = u5.update(this.b.g ? 26 : 0, this, this.L, this.M);
        this.N = u5.update(this.b.g ? 26 : 0, this, this.N, this.O);
        this.P = u5.update(this.b.g ? 26 : 0, this, this.P, this.Q);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        this.i0 = false;
        super.onDetachedFromWindow();
        this.w = false;
        this.E = false;
        this.R = false;
        this.D = false;
        this.T = false;
        ValueAnimator valueAnimator = this.a;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.a.removeAllUpdateListeners();
            this.a.cancel();
            this.a = null;
        }
        invalidate();
        u5.release(this, this.r);
        u5.release(this, this.L);
        u5.release(this, this.N);
        u5.release(this, this.P);
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x047a, code lost:
    
        if (r12.w != 0.0f) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0121, code lost:
    
        if (r12.N != (-1)) goto L46;
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
        org.telegram.ui.ActionBar.f6 f6Var2;
        boolean z4;
        String format;
        float f12;
        int dp;
        int i18;
        org.telegram.ui.ActionBar.f6 f6Var3;
        int i19;
        int i20;
        String str;
        int i21;
        float f13;
        float f14;
        TextPaint textPaint;
        Paint paint;
        org.telegram.ui.ActionBar.f6 f6Var4;
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
        boolean z10;
        int v02;
        int i24;
        TextPaint textPaint3;
        float f20;
        Canvas canvas2 = canvas;
        boolean z11 = this.b.e;
        j00 j00Var = this.j0;
        TextPaint textPaint4 = j00Var.d;
        Paint paint3 = j00Var.e;
        TextPaint textPaint5 = j00Var.c;
        TextPaint textPaint6 = j00Var.b;
        org.telegram.ui.ActionBar.f6 f6Var5 = j00Var.a;
        if (j00Var.v != 0.0f) {
            canvas2.save();
            float f21 = j00Var.v;
            f10 = 0.0f;
            float sin = (float) Math.sin(((f21 * (this.e % 2 == 0 ? 1.0f : -1.0f)) + r8) * 3.141592653589793d * 2.5d);
            f11 = 400.0f;
            double elapsedRealtime = (float) ((SystemClock.elapsedRealtime() / 400.0f) * 3.141592653589793d * (this.e % 2 == 0 ? 1.0f : -1.0f));
            f6Var = f6Var5;
            canvas2.translate((float) (Math.cos(elapsedRealtime) * AndroidUtilities.dp(0.33f) * (this.e % 2 == 0 ? 1.0f : -1.0f)), (float) (Math.sin(elapsedRealtime) * (-AndroidUtilities.dp(0.33f))));
            canvas2.rotate(sin * 1.4f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        } else {
            f6Var = f6Var5;
            f10 = 0.0f;
            f11 = 400.0f;
        }
        int i25 = j00Var.O;
        if (i25 != -1) {
            i11 = j00Var.I;
            i10 = i25;
        } else {
            i10 = j00Var.I;
            i11 = j00Var.o0;
        }
        int i26 = this.b.a;
        if (i26 == i10) {
            i12 = j00Var.S;
            i13 = j00Var.a0;
            i14 = j00Var.T;
            i17 = j00Var.b0;
            i15 = org.telegram.ui.ActionBar.j6.T9;
            i16 = org.telegram.ui.ActionBar.j6.U9;
        } else {
            i12 = j00Var.T;
            i13 = j00Var.b0;
            i14 = j00Var.S;
            i15 = org.telegram.ui.ActionBar.j6.U9;
            i16 = org.telegram.ui.ActionBar.j6.T9;
            i17 = i13;
        }
        if (i13 < 0) {
            if ((j00Var.L || i25 != -1) && (i26 == i10 || i26 == i11)) {
                f6Var2 = f6Var;
                textPaint6.setColor(i0.a.d(j00Var.M, org.telegram.ui.ActionBar.j6.v0(i14, f6Var2), org.telegram.ui.ActionBar.j6.v0(i12, f6Var2)));
            } else {
                f6Var2 = f6Var;
                textPaint6.setColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var2));
            }
            z4 = z11;
        } else {
            f6Var2 = f6Var;
            int v03 = org.telegram.ui.ActionBar.j6.v0(i12, f6Var2);
            int v04 = org.telegram.ui.ActionBar.j6.v0(i13, f6Var2);
            if (j00Var.L) {
                z4 = z11;
            } else {
                z4 = z11;
            }
            int i27 = this.b.a;
            if (i27 == i10 || i27 == i11) {
                textPaint6.setColor(i0.a.d(j00Var.M, i0.a.d(j00Var.t0, org.telegram.ui.ActionBar.j6.v0(i14, f6Var2), org.telegram.ui.ActionBar.j6.v0(i17, f6Var2)), i0.a.d(j00Var.t0, v03, v04)));
            }
            textPaint6.setColor(i0.a.d(j00Var.t0, v03, v04));
        }
        j00Var.f = new PorterDuffColorFilter(textPaint6.getColor(), PorterDuff.Mode.SRC_IN);
        int i28 = this.G;
        boolean z12 = i28 == 0 && this.E;
        boolean z13 = i28 > 0 && this.b.d == 0 && this.E;
        boolean z14 = i28 > 0 && this.b.d > 0 && this.E;
        int i29 = this.b.d;
        if (i29 > 0 || z13) {
            format = z13 ? String.format("%d", Integer.valueOf(i28)) : String.format("%d", Integer.valueOf(i29));
            float ceil = (int) Math.ceil(textPaint5.measureText(format));
            f12 = ceil;
            dp = AndroidUtilities.dp(10.0f) + ((int) Math.max(AndroidUtilities.dp(7.333f), ceil));
        } else {
            format = null;
            dp = 0;
            f12 = 0.0f;
        }
        if (!z4 && (j00Var.n || j00Var.w != f10)) {
            dp = (int) (((AndroidUtilities.dp(17.333f) - dp) * j00Var.w) + dp);
        }
        int i30 = this.b.c;
        if (dp == 0 || z13) {
            i18 = 0;
        } else {
            i18 = AndroidUtilities.dp((format != null ? 1.0f : j00Var.w) * (-2.0f)) + dp;
        }
        this.d = i30 + i18;
        float measuredWidth = (getMeasuredWidth() - this.d) / 2.0f;
        if (this.D) {
            float f22 = this.x;
            measuredWidth = e2.c.w(1.0f, f22, this.C, measuredWidth * f22);
        }
        float f23 = measuredWidth;
        if (TextUtils.equals(this.b.b, this.h)) {
            f6Var3 = f6Var2;
            i19 = i10;
            i20 = i11;
            str = format;
            i21 = dp;
            f13 = 1.0f;
        } else {
            this.h = this.b.b;
            f6Var3 = f6Var2;
            i20 = i11;
            str = format;
            i21 = dp;
            i19 = i10;
            f13 = 1.0f;
            StaticLayout staticLayout = new StaticLayout(this.h, textPaint6, AndroidUtilities.dp(f11), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.s = staticLayout;
            this.r = u5.update(this.b.g ? 26 : 0, this, this.r, staticLayout);
            this.c = this.s.getHeight();
            this.v = (int) (-this.s.getLineLeft(0));
        }
        if (this.R) {
            float f24 = this.U * (this.S ? this.x : f13 - this.x);
            if (this.Q != null) {
                canvas2.save();
                canvas2.translate(this.v + f23 + f24, ((getMeasuredHeight() - this.c) / 2.0f) + f13);
                this.Q.draw(canvas2);
                textPaint = textPaint4;
                textPaint3 = textPaint6;
                f20 = 1.0f;
                f14 = f23;
                f6Var4 = f6Var3;
                u5.drawAnimatedEmojis(canvas2, this.Q, this.P, 0.0f, null, computeVerticalScrollOffset() - AndroidUtilities.dp(6.0f), computeVerticalScrollOffset() + computeVerticalScrollExtent(), 0.0f, 1.0f, j00Var.f);
                canvas2.restore();
            } else {
                textPaint3 = textPaint6;
                f14 = f23;
                textPaint = textPaint4;
                f6Var4 = f6Var3;
                f20 = 1.0f;
            }
            if (this.M != null) {
                canvas2.save();
                int alpha = textPaint3.getAlpha();
                TextPaint textPaint7 = textPaint3;
                textPaint7.setAlpha((int) (alpha * (this.S ? f20 - this.x : this.x)));
                canvas2.translate(f14 + this.v + f24, ((getMeasuredHeight() - this.c) / 2.0f) + f20);
                this.M.draw(canvas2);
                StaticLayout staticLayout2 = this.M;
                q5 q5Var = this.L;
                float computeVerticalScrollOffset = computeVerticalScrollOffset() - AndroidUtilities.dp(6.0f);
                float computeVerticalScrollOffset2 = computeVerticalScrollOffset() + computeVerticalScrollExtent();
                float f25 = this.S ? f20 - this.x : this.x;
                paint = paint3;
                textPaint2 = textPaint7;
                f15 = 1.0f;
                u5.drawAnimatedEmojis(canvas2, staticLayout2, q5Var, 0.0f, null, computeVerticalScrollOffset, computeVerticalScrollOffset2, 0.0f, f25, j00Var.f);
                canvas2.restore();
                textPaint2.setAlpha(alpha);
            } else {
                paint = paint3;
                textPaint2 = textPaint3;
                f15 = 1.0f;
            }
            if (this.O != null) {
                canvas2.save();
                int alpha2 = textPaint2.getAlpha();
                textPaint2.setAlpha((int) (alpha2 * (this.S ? this.x : f15 - this.x)));
                canvas2.translate(f14 + this.v + f24, ((getMeasuredHeight() - this.c) / 2.0f) + f15);
                this.O.draw(canvas2);
                u5.drawAnimatedEmojis(canvas2, this.O, this.N, 0.0f, null, computeVerticalScrollOffset() - AndroidUtilities.dp(6.0f), computeVerticalScrollOffset() + computeVerticalScrollExtent(), 0.0f, this.S ? this.x : f15 - this.x, j00Var.f);
                canvas2.restore();
                textPaint2.setAlpha(alpha2);
            }
            f16 = f24;
        } else {
            f14 = f23;
            textPaint = textPaint4;
            paint = paint3;
            f6Var4 = f6Var3;
            f15 = 1.0f;
            textPaint2 = textPaint6;
            if (this.s != null) {
                canvas2.save();
                canvas2.translate(f14 + this.v, ((getMeasuredHeight() - this.c) / 2.0f) + 1.0f);
                this.s.draw(canvas2);
                u5.drawAnimatedEmojis(canvas2, this.s, this.r, 0.0f, null, computeVerticalScrollOffset() - AndroidUtilities.dp(6.0f), computeVerticalScrollOffset() + computeVerticalScrollExtent(), 0.0f, 1.0f, j00Var.f);
                canvas2.restore();
            }
            f16 = 0.0f;
        }
        String str2 = str;
        if (!z12 && str2 == null) {
            if (z4) {
                f17 = 0.0f;
            } else if (!j00Var.n) {
                f17 = 0.0f;
            }
            i22 = i21;
            float f26 = f12;
            if (j00Var.v != f17) {
                canvas2.restore();
            }
            this.B = f14;
            g00 g00Var = this.b;
            this.F = g00Var.d;
            this.K = this.h;
            this.V = g00Var.c;
            this.a0 = i22;
            this.b0 = f26;
            this.e0 = this.d;
            this.g0 = getMeasuredWidth();
            if (this.b.f && this.h0 == f17) {
                return;
            }
            if (j00Var.q0 == null) {
                j00Var.q0 = getContext().getDrawable(R.drawable.other_lockedfolders);
            }
            z10 = this.b.f;
            if (z10) {
                float f27 = this.h0;
                if (f27 != f15) {
                    this.h0 = f27 + 0.10666667f;
                    this.h0 = Utilities.clamp(this.h0, 1.0f, f17);
                    v02 = org.telegram.ui.ActionBar.j6.v0(j00Var.T, f6Var4);
                    i24 = j00Var.b0;
                    if (i24 >= 0) {
                        v02 = i0.a.d(j00Var.t0, v02, org.telegram.ui.ActionBar.j6.v0(i24, f6Var4));
                    }
                    if (j00Var.r0 != v02) {
                        j00Var.r0 = v02;
                        j00Var.q0.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
                    }
                    int measuredWidth2 = (int) (((getMeasuredWidth() - j00Var.q0.getIntrinsicWidth()) / 2.0f) + this.y);
                    int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(12.0f);
                    Drawable drawable = j00Var.q0;
                    drawable.setBounds(measuredWidth2, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth2, j00Var.q0.getIntrinsicHeight() + measuredHeight);
                    if (this.h0 != 1.0f) {
                        j00Var.q0.draw(canvas2);
                        return;
                    }
                    canvas2.save();
                    float f28 = this.h0;
                    canvas2.scale(f28, f28, j00Var.q0.getBounds().centerX(), j00Var.q0.getBounds().centerY());
                    j00Var.q0.draw(canvas2);
                    canvas2.restore();
                    return;
                }
            }
            if (!z10) {
                this.h0 -= 0.10666667f;
            }
            this.h0 = Utilities.clamp(this.h0, 1.0f, f17);
            v02 = org.telegram.ui.ActionBar.j6.v0(j00Var.T, f6Var4);
            i24 = j00Var.b0;
            if (i24 >= 0) {
            }
            if (j00Var.r0 != v02) {
            }
            int measuredWidth22 = (int) (((getMeasuredWidth() - j00Var.q0.getIntrinsicWidth()) / 2.0f) + this.y);
            int measuredHeight2 = getMeasuredHeight() - AndroidUtilities.dp(12.0f);
            Drawable drawable2 = j00Var.q0;
            drawable2.setBounds(measuredWidth22, measuredHeight2, drawable2.getIntrinsicWidth() + measuredWidth22, j00Var.q0.getIntrinsicHeight() + measuredHeight2);
            if (this.h0 != 1.0f) {
            }
        }
        f17 = 0.0f;
        if (j00Var.c0 < 0) {
            textPaint5.setColor(org.telegram.ui.ActionBar.j6.v0(j00Var.V, f6Var4));
        } else {
            textPaint5.setColor(i0.a.d(j00Var.t0, org.telegram.ui.ActionBar.j6.v0(j00Var.V, f6Var4), org.telegram.ui.ActionBar.j6.v0(j00Var.c0, f6Var4)));
        }
        if (org.telegram.ui.ActionBar.j6.c1(i15) && org.telegram.ui.ActionBar.j6.c1(i16)) {
            int v05 = org.telegram.ui.ActionBar.j6.v0(i15, f6Var4);
            if (j00Var.L || j00Var.N != -1) {
                int i31 = this.b.a;
                if (i31 == i19) {
                    paint2 = paint;
                    i23 = i16;
                } else if (i31 == i20) {
                    i23 = i16;
                    paint2 = paint;
                }
                paint2.setColor(i0.a.d(j00Var.M, org.telegram.ui.ActionBar.j6.v0(i23, f6Var4), v05));
            }
            paint2 = paint;
            paint2.setColor(v05);
        } else {
            paint2 = paint;
            paint2.setColor(textPaint2.getColor());
        }
        float f29 = this.b.c;
        boolean z15 = this.R;
        if (z15) {
            float f30 = this.W;
            float f31 = this.x;
            f29 = (f29 * f31) + ((f15 - f31) * f30);
        }
        float dp3 = (z15 && this.O == null) ? (f14 - this.U) + f16 + f29 + AndroidUtilities.dp(5.0f) : AndroidUtilities.dp(5.0f) + f14 + f29;
        int x10 = org.telegram.ui.b.x(17.333f, getMeasuredHeight(), 2);
        if (z4 || ((!j00Var.n && j00Var.w == f17) || str2 != null)) {
            paint2.setAlpha(255);
        } else {
            paint2.setAlpha((int) (j00Var.w * 255.0f));
        }
        if (z14) {
            float f32 = this.c0;
            i22 = i21;
            float f33 = i22;
            f18 = 17.333f;
            if (f32 != f33) {
                float f34 = this.x;
                f19 = (f33 * f34) + ((f15 - f34) * f32);
                if (z14) {
                    float f35 = this.d0;
                    float f36 = this.x;
                    f12 = (f12 * f36) + ((f15 - f36) * f35);
                }
                float f37 = x10;
                float dp4 = AndroidUtilities.dp(f18) + x10;
                rectF = this.f;
                rectF.set(dp3, f37, f19 + dp3, dp4);
                if (!z12 || z13) {
                    canvas2.save();
                    float f38 = !z12 ? this.x : f15 - this.x;
                    canvas2.scale(f38, f38, rectF.centerX(), rectF.centerY());
                }
                float f39 = AndroidUtilities.density * 11.5f;
                canvas2.drawRoundRect(rectF, f39, f39, paint2);
                if (!z14) {
                    if (this.H != null) {
                        dp2 = AndroidUtilities.dp(f18);
                        lineBottom = this.H.getLineBottom(0);
                        lineTop = this.H.getLineTop(0);
                    } else if (this.I != null) {
                        dp2 = AndroidUtilities.dp(f18);
                        lineBottom = this.I.getLineBottom(0);
                        lineTop = this.I.getLineTop(0);
                    } else {
                        if (this.J != null) {
                            dp2 = AndroidUtilities.dp(f18);
                            lineBottom = this.J.getLineBottom(0);
                            lineTop = this.J.getLineTop(0);
                        }
                        float dp5 = f37 - AndroidUtilities.dp(0.5f);
                        float f40 = z4 ? f15 - j00Var.w : 1.0f;
                        if (this.H != null) {
                            canvas2.save();
                            textPaint5.setAlpha((int) (f40 * 255.0f * this.x));
                            canvas2.translate(((rectF.width() - f12) / 2.0f) + rectF.left, ((f15 - this.x) * AndroidUtilities.dp(15.0f)) + dp5);
                            this.H.draw(canvas2);
                            canvas2.restore();
                        }
                        if (this.I != null) {
                            canvas2.save();
                            textPaint5.setAlpha((int) ((f15 - this.x) * f40 * 255.0f));
                            canvas2.translate(((rectF.width() - f12) / 2.0f) + rectF.left, (this.x * (-AndroidUtilities.dp(15.0f))) + dp5);
                            this.I.draw(canvas2);
                            canvas2.restore();
                        }
                        if (this.J != null) {
                            canvas2.save();
                            textPaint5.setAlpha((int) (f40 * 255.0f));
                            canvas2.translate(((rectF.width() - f12) / 2.0f) + rectF.left, dp5);
                            this.J.draw(canvas2);
                            canvas2.restore();
                        }
                        textPaint5.setAlpha(255);
                    }
                    f37 += (dp2 - (lineBottom - lineTop)) / 2.0f;
                    float dp52 = f37 - AndroidUtilities.dp(0.5f);
                    if (z4) {
                    }
                    if (this.H != null) {
                    }
                    if (this.I != null) {
                    }
                    if (this.J != null) {
                    }
                    textPaint5.setAlpha(255);
                } else if (str2 != null) {
                    if (!z4) {
                        textPaint5.setAlpha((int) ((f15 - j00Var.w) * 255.0f));
                    }
                    canvas2.drawText(str2, ((rectF.width() - f12) / 2.0f) + rectF.left, AndroidUtilities.dp(12.5f) + x10, textPaint5);
                }
                if (!z12 || z13) {
                    canvas2.restore();
                }
                if (!z4 && (j00Var.n || j00Var.w != f17)) {
                    TextPaint textPaint8 = textPaint;
                    textPaint8.setColor(textPaint5.getColor());
                    textPaint8.setAlpha((int) (j00Var.w * 255.0f));
                    float dp6 = AndroidUtilities.dp(3.0f);
                    canvas2.drawLine(rectF.centerX() - dp6, rectF.centerY() - dp6, rectF.centerX() + dp6, rectF.centerY() + dp6, textPaint8);
                    canvas2 = canvas;
                    canvas2.drawLine(rectF.centerX() - dp6, rectF.centerY() + dp6, rectF.centerX() + dp6, rectF.centerY() - dp6, textPaint8);
                }
                float f262 = f12;
                if (j00Var.v != f17) {
                }
                this.B = f14;
                g00 g00Var2 = this.b;
                this.F = g00Var2.d;
                this.K = this.h;
                this.V = g00Var2.c;
                this.a0 = i22;
                this.b0 = f262;
                this.e0 = this.d;
                this.g0 = getMeasuredWidth();
                if (this.b.f) {
                }
                if (j00Var.q0 == null) {
                }
                z10 = this.b.f;
                if (z10) {
                }
                if (!z10) {
                }
                this.h0 = Utilities.clamp(this.h0, 1.0f, f17);
                v02 = org.telegram.ui.ActionBar.j6.v0(j00Var.T, f6Var4);
                i24 = j00Var.b0;
                if (i24 >= 0) {
                }
                if (j00Var.r0 != v02) {
                }
                int measuredWidth222 = (int) (((getMeasuredWidth() - j00Var.q0.getIntrinsicWidth()) / 2.0f) + this.y);
                int measuredHeight22 = getMeasuredHeight() - AndroidUtilities.dp(12.0f);
                Drawable drawable22 = j00Var.q0;
                drawable22.setBounds(measuredWidth222, measuredHeight22, drawable22.getIntrinsicWidth() + measuredWidth222, j00Var.q0.getIntrinsicHeight() + measuredHeight22);
                if (this.h0 != 1.0f) {
                }
            }
        } else {
            i22 = i21;
            f18 = 17.333f;
        }
        f19 = i22;
        if (z14) {
        }
        float f372 = x10;
        float dp42 = AndroidUtilities.dp(f18) + x10;
        rectF = this.f;
        rectF.set(dp3, f372, f19 + dp3, dp42);
        if (!z12) {
        }
        canvas2.save();
        if (!z12) {
        }
        canvas2.scale(f38, f38, rectF.centerX(), rectF.centerY());
        float f392 = AndroidUtilities.density * 11.5f;
        canvas2.drawRoundRect(rectF, f392, f392, paint2);
        if (!z14) {
        }
        if (!z12) {
        }
        canvas2.restore();
        if (!z4) {
            TextPaint textPaint82 = textPaint;
            textPaint82.setColor(textPaint5.getColor());
            textPaint82.setAlpha((int) (j00Var.w * 255.0f));
            float dp62 = AndroidUtilities.dp(3.0f);
            canvas2.drawLine(rectF.centerX() - dp62, rectF.centerY() - dp62, rectF.centerX() + dp62, rectF.centerY() + dp62, textPaint82);
            canvas2 = canvas;
            canvas2.drawLine(rectF.centerX() - dp62, rectF.centerY() + dp62, rectF.centerX() + dp62, rectF.centerY() - dp62, textPaint82);
        }
        float f2622 = f12;
        if (j00Var.v != f17) {
        }
        this.B = f14;
        g00 g00Var22 = this.b;
        this.F = g00Var22.d;
        this.K = this.h;
        this.V = g00Var22.c;
        this.a0 = i22;
        this.b0 = f2622;
        this.e0 = this.d;
        this.g0 = getMeasuredWidth();
        if (this.b.f) {
        }
        if (j00Var.q0 == null) {
        }
        z10 = this.b.f;
        if (z10) {
        }
        if (!z10) {
        }
        this.h0 = Utilities.clamp(this.h0, 1.0f, f17);
        v02 = org.telegram.ui.ActionBar.j6.v0(j00Var.T, f6Var4);
        i24 = j00Var.b0;
        if (i24 >= 0) {
        }
        if (j00Var.r0 != v02) {
        }
        int measuredWidth2222 = (int) (((getMeasuredWidth() - j00Var.q0.getIntrinsicWidth()) / 2.0f) + this.y);
        int measuredHeight222 = getMeasuredHeight() - AndroidUtilities.dp(12.0f);
        Drawable drawable222 = j00Var.q0;
        drawable222.setBounds(measuredWidth2222, measuredHeight222, drawable222.getIntrinsicWidth() + measuredWidth2222, j00Var.q0.getIntrinsicHeight() + measuredHeight222);
        if (this.h0 != 1.0f) {
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        g00 g00Var = this.b;
        accessibilityNodeInfo.setSelected((g00Var == null || (i10 = this.j0.I) == -1 || g00Var.a != i10) ? false : true);
        accessibilityNodeInfo.addAction(16);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString(R.string.AccDescrOpenMenu2)));
        if (this.b != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.b.b);
            g00 g00Var2 = this.b;
            int i11 = g00Var2 != null ? g00Var2.d : 0;
            if (i11 > 0) {
                sb.append("\n");
                sb.append(LocaleController.formatPluralString("AccDescrUnreadCount", i11, new Object[0]));
            }
            accessibilityNodeInfo.setContentDescription(sb);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(24.0f) + this.b.a(false) + this.j0.K, View.MeasureSpec.getSize(i11));
    }
}
