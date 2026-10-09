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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class y00 extends View {
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
    public x5 O;
    public StaticLayout P;
    public x5 Q;
    public StaticLayout R;
    public x5 S;
    public StaticLayout T;
    public boolean U;
    public boolean V;
    public boolean W;
    public ValueAnimator a;
    public float a0;
    public w00 b;
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
    public final /* synthetic */ a10 m0;
    public boolean n;
    public x5 r;
    public StaticLayout s;
    public int v;
    public boolean w;
    public float x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y00(a10 a10Var, Context context) {
        super(context);
        this.m0 = a10Var;
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
        ofFloat.addUpdateListener(new r00(this, 1));
        animatorSet.playTogether(ofFloat);
        animatorSet.setDuration(50L);
        animatorSet.addListener(new x00(this, i10, f7, 0));
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
        this.r = b6.update(this.b.g ? 26 : 0, this, this.r, this.s);
        this.O = b6.update(this.b.g ? 26 : 0, this, this.O, this.P);
        this.Q = b6.update(this.b.g ? 26 : 0, this, this.Q, this.R);
        this.S = b6.update(this.b.g ? 26 : 0, this, this.S, this.T);
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
        b6.release(this, this.r);
        b6.release(this, this.O);
        b6.release(this, this.Q);
        b6.release(this, this.S);
    }

    /* JADX WARN: Code restructure failed: missing block: B:266:0x011f, code lost:
    
        if (r12.Q == (-1)) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x078b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0799  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x07dd  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0804  */
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
        int dp;
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
        org.telegram.ui.ActionBar.e6 e6Var;
        float f15;
        Paint paint2;
        int i22;
        float f16;
        RectF rectF;
        int dp2;
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
        a10 a10Var = this.m0;
        TextPaint textPaint4 = a10Var.d;
        Paint paint3 = a10Var.e;
        TextPaint textPaint5 = a10Var.c;
        TextPaint textPaint6 = a10Var.b;
        org.telegram.ui.ActionBar.e6 e6Var2 = a10Var.a;
        if (a10Var.v != 0.0f) {
            canvas2.save();
            float f21 = a10Var.v;
            float sin = (float) Math.sin(((f21 * (this.e % 2 == 0 ? 1.0f : -1.0f)) + r8) * 3.141592653589793d * 2.5d);
            f7 = 0.0f;
            f10 = 400.0f;
            double elapsedRealtime = (float) ((SystemClock.elapsedRealtime() / 400.0f) * 3.141592653589793d * (this.e % 2 == 0 ? 1.0f : -1.0f));
            canvas2.translate((float) (Math.cos(elapsedRealtime) * AndroidUtilities.dp(0.33f) * (this.e % 2 == 0 ? 1.0f : -1.0f)), (float) (Math.sin(elapsedRealtime) * (-AndroidUtilities.dp(0.33f))));
            canvas2.rotate(1.4f * sin, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        } else {
            f7 = 0.0f;
            f10 = 400.0f;
        }
        int i25 = a10Var.R;
        if (i25 != -1) {
            i11 = a10Var.L;
            i10 = i25;
        } else {
            i10 = a10Var.L;
            i11 = a10Var.r0;
        }
        int i26 = this.b.a;
        if (i26 == i10) {
            i12 = a10Var.V;
            int i27 = a10Var.d0;
            int i28 = a10Var.W;
            int i29 = a10Var.e0;
            i15 = org.telegram.ui.ActionBar.i6.T9;
            i16 = org.telegram.ui.ActionBar.i6.U9;
            i13 = i29;
            i14 = i28;
            z10 = z11;
            i17 = i27;
        } else {
            i12 = a10Var.W;
            i13 = a10Var.e0;
            i14 = a10Var.V;
            i15 = org.telegram.ui.ActionBar.i6.U9;
            i16 = org.telegram.ui.ActionBar.i6.T9;
            z10 = z11;
            i17 = i13;
        }
        if (i17 >= 0) {
            int w03 = org.telegram.ui.ActionBar.i6.w0(i12, e6Var2);
            int w04 = org.telegram.ui.ActionBar.i6.w0(i17, e6Var2);
            if (a10Var.O) {
            }
            int i30 = this.b.a;
            if (i30 == i10 || i30 == i11) {
                textPaint6.setColor(i0.a.d(a10Var.P, i0.a.d(a10Var.w0, org.telegram.ui.ActionBar.i6.w0(i14, e6Var2), org.telegram.ui.ActionBar.i6.w0(i13, e6Var2)), i0.a.d(a10Var.w0, w03, w04)));
            }
            textPaint6.setColor(i0.a.d(a10Var.w0, w03, w04));
        } else if ((a10Var.O || i25 != -1) && (i26 == i10 || i26 == i11)) {
            textPaint6.setColor(i0.a.d(a10Var.P, org.telegram.ui.ActionBar.i6.w0(i14, e6Var2), org.telegram.ui.ActionBar.i6.w0(i12, e6Var2)));
        } else {
            textPaint6.setColor(org.telegram.ui.ActionBar.i6.w0(i12, e6Var2));
        }
        a10Var.f = new PorterDuffColorFilter(textPaint6.getColor(), PorterDuff.Mode.SRC_IN);
        int i31 = this.J;
        boolean z12 = i31 == 0 && this.H;
        boolean z13 = i31 > 0 && this.b.d == 0 && this.H;
        boolean z14 = i31 > 0 && this.b.d > 0 && this.H;
        int i32 = this.b.d;
        if (i32 > 0 || z13) {
            format = z13 ? String.format("%d", Integer.valueOf(i31)) : String.format("%d", Integer.valueOf(i32));
            float ceil = (int) Math.ceil(textPaint5.measureText(format));
            f11 = ceil;
            dp = AndroidUtilities.dp(10.0f) + ((int) Math.max(AndroidUtilities.dp(7.333f), ceil));
        } else {
            format = null;
            dp = 0;
            f11 = f7;
        }
        if (!z10 && (a10Var.n || a10Var.w != f7)) {
            dp = (int) (((AndroidUtilities.dp(17.333f) - dp) * a10Var.w) + dp);
        }
        int i33 = this.b.c;
        if (dp == 0 || z13) {
            i18 = 0;
        } else {
            i18 = AndroidUtilities.dp((format != null ? 1.0f : a10Var.w) * (-2.0f)) + dp;
        }
        this.d = i33 + i18;
        float measuredWidth = (getMeasuredWidth() - this.d) / 2.0f;
        if (this.G) {
            float f22 = this.x;
            measuredWidth = com.google.android.gms.internal.vision.e2.y(1.0f, f22, this.F, measuredWidth * f22);
        }
        if (TextUtils.equals(this.b.b, this.h)) {
            str = format;
            f12 = measuredWidth;
            i19 = i10;
            i20 = i11;
            i21 = dp;
        } else {
            this.h = this.b.b;
            i19 = i10;
            i20 = i11;
            i21 = dp;
            f12 = measuredWidth;
            str = format;
            StaticLayout staticLayout = new StaticLayout(this.h, textPaint6, AndroidUtilities.dp(f10), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.s = staticLayout;
            this.r = b6.update(this.b.g ? 26 : 0, this, this.r, staticLayout);
            this.c = this.s.getHeight();
            this.v = (int) (-this.s.getLineLeft(0));
        }
        if (this.U) {
            float f23 = this.a0;
            if (this.V) {
                f18 = this.x;
                f17 = 1.0f;
            } else {
                f17 = 1.0f;
                f18 = 1.0f - this.x;
            }
            float f24 = f23 * f18;
            if (this.T != null) {
                canvas2.save();
                f13 = f12;
                canvas2.translate(f13 + this.v + f24, ((getMeasuredHeight() - this.c) / 2.0f) + f17);
                this.T.draw(canvas2);
                textPaint3 = textPaint6;
                f19 = 6.0f;
                e6Var = e6Var2;
                textPaint = textPaint4;
                f20 = f17;
                b6.drawAnimatedEmojis(canvas2, this.T, this.S, 0.0f, null, computeVerticalScrollOffset() - AndroidUtilities.dp(6.0f), computeVerticalScrollOffset() + computeVerticalScrollExtent(), 0.0f, 1.0f, a10Var.f);
                canvas2.restore();
            } else {
                textPaint3 = textPaint6;
                f19 = 6.0f;
                textPaint = textPaint4;
                f20 = f17;
                f13 = f12;
                e6Var = e6Var2;
            }
            if (this.P != null) {
                canvas2.save();
                int alpha = textPaint3.getAlpha();
                TextPaint textPaint7 = textPaint3;
                textPaint7.setAlpha((int) (alpha * (this.V ? f20 - this.x : this.x)));
                canvas2.translate(f13 + this.v + f24, ((getMeasuredHeight() - this.c) / 2.0f) + f20);
                this.P.draw(canvas2);
                StaticLayout staticLayout2 = this.P;
                x5 x5Var = this.O;
                float computeVerticalScrollOffset = computeVerticalScrollOffset() - AndroidUtilities.dp(f19);
                float computeVerticalScrollOffset2 = computeVerticalScrollOffset() + computeVerticalScrollExtent();
                float f25 = this.V ? f20 - this.x : this.x;
                f14 = f20;
                textPaint2 = textPaint7;
                paint = paint3;
                b6.drawAnimatedEmojis(canvas2, staticLayout2, x5Var, 0.0f, null, computeVerticalScrollOffset, computeVerticalScrollOffset2, 0.0f, f25, a10Var.f);
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
                textPaint2.setAlpha((int) (alpha2 * (this.V ? this.x : f14 - this.x)));
                canvas2.translate(f13 + this.v + f24, ((getMeasuredHeight() - this.c) / 2.0f) + f14);
                this.R.draw(canvas2);
                b6.drawAnimatedEmojis(canvas2, this.R, this.Q, 0.0f, null, computeVerticalScrollOffset() - AndroidUtilities.dp(f19), computeVerticalScrollOffset() + computeVerticalScrollExtent(), 0.0f, this.V ? this.x : f14 - this.x, a10Var.f);
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
            e6Var = e6Var2;
            if (this.s != null) {
                canvas2.save();
                canvas2.translate(f13 + this.v, ((getMeasuredHeight() - this.c) / 2.0f) + 1.0f);
                this.s.draw(canvas2);
                b6.drawAnimatedEmojis(canvas2, this.s, this.r, 0.0f, null, computeVerticalScrollOffset() - AndroidUtilities.dp(6.0f), computeVerticalScrollOffset() + computeVerticalScrollExtent(), 0.0f, 1.0f, a10Var.f);
                canvas2.restore();
            }
            f15 = f7;
        }
        String str2 = str;
        if (z12 || str2 != null || (!z10 && (a10Var.n || a10Var.w != f7))) {
            if (a10Var.f0 < 0) {
                textPaint5.setColor(org.telegram.ui.ActionBar.i6.w0(a10Var.b0, e6Var));
            } else {
                textPaint5.setColor(i0.a.d(a10Var.w0, org.telegram.ui.ActionBar.i6.w0(a10Var.b0, e6Var), org.telegram.ui.ActionBar.i6.w0(a10Var.f0, e6Var)));
            }
            if (org.telegram.ui.ActionBar.i6.d1(i15) && org.telegram.ui.ActionBar.i6.d1(i16)) {
                int w05 = org.telegram.ui.ActionBar.i6.w0(i15, e6Var);
                if (a10Var.O || a10Var.Q != -1) {
                    int i34 = this.b.a;
                    if (i34 == i19) {
                        paint2 = paint;
                        i23 = i16;
                    } else if (i34 == i20) {
                        i23 = i16;
                        paint2 = paint;
                    }
                    paint2.setColor(i0.a.d(a10Var.P, org.telegram.ui.ActionBar.i6.w0(i23, e6Var), w05));
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
                float f28 = this.x;
                f26 = (f26 * f28) + ((f14 - f28) * f27);
            }
            float dp3 = (z15 && this.R == null) ? (f13 - this.a0) + f15 + f26 + AndroidUtilities.dp(5.0f) : f13 + f26 + AndroidUtilities.dp(5.0f);
            int A = org.telegram.messenger.bi.A(17.333f, getMeasuredHeight(), 2);
            if (z10 || ((!a10Var.n && a10Var.w == f7) || str2 != null)) {
                paint2.setAlpha(255);
            } else {
                paint2.setAlpha((int) (a10Var.w * 255.0f));
            }
            if (z14) {
                float f29 = this.f0;
                i22 = i21;
                float f30 = i22;
                if (f29 != f30) {
                    float f31 = this.x;
                    f16 = (f30 * f31) + ((f14 - f31) * f29);
                    if (z14) {
                        float f32 = this.g0;
                        float f33 = this.x;
                        f11 = (f11 * f33) + ((f14 - f33) * f32);
                    }
                    float f34 = A;
                    float dp4 = AndroidUtilities.dp(17.333f) + A;
                    rectF = this.f;
                    rectF.set(dp3, f34, f16 + dp3, dp4);
                    if (!z12 || z13) {
                        canvas2.save();
                        float f35 = !z12 ? this.x : f14 - this.x;
                        canvas2.scale(f35, f35, rectF.centerX(), rectF.centerY());
                    }
                    float f36 = AndroidUtilities.density * 11.5f;
                    canvas2.drawRoundRect(rectF, f36, f36, paint2);
                    if (!z14) {
                        if (this.K != null) {
                            dp2 = AndroidUtilities.dp(17.333f);
                            lineBottom = this.K.getLineBottom(0);
                            lineTop = this.K.getLineTop(0);
                        } else if (this.L != null) {
                            dp2 = AndroidUtilities.dp(17.333f);
                            lineBottom = this.L.getLineBottom(0);
                            lineTop = this.L.getLineTop(0);
                        } else {
                            if (this.M != null) {
                                dp2 = AndroidUtilities.dp(17.333f);
                                lineBottom = this.M.getLineBottom(0);
                                lineTop = this.M.getLineTop(0);
                            }
                            float dp5 = f34 - AndroidUtilities.dp(0.5f);
                            float f37 = z10 ? f14 - a10Var.w : f14;
                            if (this.K != null) {
                                canvas2.save();
                                textPaint5.setAlpha((int) (f37 * 255.0f * this.x));
                                canvas2.translate(((rectF.width() - f11) / 2.0f) + rectF.left, ((f14 - this.x) * AndroidUtilities.dp(15.0f)) + dp5);
                                this.K.draw(canvas2);
                                canvas2.restore();
                            }
                            if (this.L != null) {
                                canvas2.save();
                                textPaint5.setAlpha((int) ((f14 - this.x) * f37 * 255.0f));
                                canvas2.translate(((rectF.width() - f11) / 2.0f) + rectF.left, (this.x * (-AndroidUtilities.dp(15.0f))) + dp5);
                                this.L.draw(canvas2);
                                canvas2.restore();
                            }
                            if (this.M != null) {
                                canvas2.save();
                                textPaint5.setAlpha((int) (f37 * 255.0f));
                                canvas2.translate(((rectF.width() - f11) / 2.0f) + rectF.left, dp5);
                                this.M.draw(canvas2);
                                canvas2.restore();
                            }
                            textPaint5.setAlpha(255);
                        }
                        f34 += (dp2 - (lineBottom - lineTop)) / 2.0f;
                        float dp52 = f34 - AndroidUtilities.dp(0.5f);
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
                            textPaint5.setAlpha((int) ((f14 - a10Var.w) * 255.0f));
                        }
                        canvas2.drawText(str2, ((rectF.width() - f11) / 2.0f) + rectF.left, AndroidUtilities.dp(12.5f) + A, textPaint5);
                    }
                    if (!z12 || z13) {
                        canvas2.restore();
                    }
                    if (!z10 && (a10Var.n || a10Var.w != f7)) {
                        TextPaint textPaint8 = textPaint;
                        textPaint8.setColor(textPaint5.getColor());
                        textPaint8.setAlpha((int) (a10Var.w * 255.0f));
                        float dp6 = AndroidUtilities.dp(3.0f);
                        canvas2.drawLine(rectF.centerX() - dp6, rectF.centerY() - dp6, rectF.centerX() + dp6, rectF.centerY() + dp6, textPaint8);
                        canvas2 = canvas;
                        canvas2.drawLine(rectF.centerX() - dp6, rectF.centerY() + dp6, rectF.centerX() + dp6, rectF.centerY() - dp6, textPaint8);
                    }
                }
            } else {
                i22 = i21;
            }
            f16 = i22;
            if (z14) {
            }
            float f342 = A;
            float dp42 = AndroidUtilities.dp(17.333f) + A;
            rectF = this.f;
            rectF.set(dp3, f342, f16 + dp3, dp42);
            if (!z12) {
            }
            canvas2.save();
            if (!z12) {
            }
            canvas2.scale(f35, f35, rectF.centerX(), rectF.centerY());
            float f362 = AndroidUtilities.density * 11.5f;
            canvas2.drawRoundRect(rectF, f362, f362, paint2);
            if (!z14) {
            }
            if (!z12) {
            }
            canvas2.restore();
            if (!z10) {
                TextPaint textPaint82 = textPaint;
                textPaint82.setColor(textPaint5.getColor());
                textPaint82.setAlpha((int) (a10Var.w * 255.0f));
                float dp62 = AndroidUtilities.dp(3.0f);
                canvas2.drawLine(rectF.centerX() - dp62, rectF.centerY() - dp62, rectF.centerX() + dp62, rectF.centerY() + dp62, textPaint82);
                canvas2 = canvas;
                canvas2.drawLine(rectF.centerX() - dp62, rectF.centerY() + dp62, rectF.centerX() + dp62, rectF.centerY() - dp62, textPaint82);
            }
        } else {
            i22 = i21;
        }
        float f38 = f11;
        if (a10Var.v != f7) {
            canvas2.restore();
        }
        this.E = f13;
        w00 w00Var = this.b;
        this.I = w00Var.d;
        this.N = this.h;
        this.b0 = w00Var.c;
        this.d0 = i22;
        this.e0 = f38;
        this.h0 = this.d;
        this.j0 = getMeasuredWidth();
        if (!this.b.f && this.k0 == f7) {
            return;
        }
        if (a10Var.t0 == null) {
            a10Var.t0 = getContext().getDrawable(R.drawable.other_lockedfolders);
        }
        boolean z16 = this.b.f;
        if (z16) {
            float f39 = this.k0;
            if (f39 != f14) {
                this.k0 = f39 + 0.10666667f;
                this.k0 = Utilities.clamp(this.k0, f14, f7);
                w02 = org.telegram.ui.ActionBar.i6.w0(a10Var.W, e6Var);
                i24 = a10Var.e0;
                if (i24 >= 0) {
                    w02 = i0.a.d(a10Var.w0, w02, org.telegram.ui.ActionBar.i6.w0(i24, e6Var));
                }
                if (a10Var.u0 != w02) {
                    a10Var.u0 = w02;
                    a10Var.t0.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
                }
                int measuredWidth2 = (int) (((getMeasuredWidth() - a10Var.t0.getIntrinsicWidth()) / 2.0f) + this.y);
                int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(12.0f);
                Drawable drawable = a10Var.t0;
                drawable.setBounds(measuredWidth2, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth2, a10Var.t0.getIntrinsicHeight() + measuredHeight);
                if (this.k0 != 1.0f) {
                    a10Var.t0.draw(canvas2);
                    return;
                }
                canvas2.save();
                float f40 = this.k0;
                canvas2.scale(f40, f40, a10Var.t0.getBounds().centerX(), a10Var.t0.getBounds().centerY());
                a10Var.t0.draw(canvas2);
                canvas2.restore();
                return;
            }
        }
        if (!z16) {
            this.k0 -= 0.10666667f;
        }
        this.k0 = Utilities.clamp(this.k0, f14, f7);
        w02 = org.telegram.ui.ActionBar.i6.w0(a10Var.W, e6Var);
        i24 = a10Var.e0;
        if (i24 >= 0) {
        }
        if (a10Var.u0 != w02) {
        }
        int measuredWidth22 = (int) (((getMeasuredWidth() - a10Var.t0.getIntrinsicWidth()) / 2.0f) + this.y);
        int measuredHeight2 = getMeasuredHeight() - AndroidUtilities.dp(12.0f);
        Drawable drawable2 = a10Var.t0;
        drawable2.setBounds(measuredWidth22, measuredHeight2, drawable2.getIntrinsicWidth() + measuredWidth22, a10Var.t0.getIntrinsicHeight() + measuredHeight2);
        if (this.k0 != 1.0f) {
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        w00 w00Var = this.b;
        accessibilityNodeInfo.setSelected((w00Var == null || (i10 = this.m0.L) == -1 || w00Var.a != i10) ? false : true);
        accessibilityNodeInfo.addAction(16);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString(R.string.AccDescrOpenMenu2)));
        if (this.b != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.b.b);
            w00 w00Var2 = this.b;
            int i11 = w00Var2 != null ? w00Var2.d : 0;
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
