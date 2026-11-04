package ei;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import b8.mf;
import ci.uc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gh0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.mv;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class q extends FrameLayout {
    public org.telegram.ui.ActionBar.k5 E;
    public long F;
    public boolean G;
    public boolean H;
    public boolean I;
    public long J;
    public float K;
    public float L;
    public float M;
    public float N;
    public boolean O;
    public final o7 P;
    public float Q;
    public float R;
    public gh0 S;
    public h T;
    public final float U;
    public boolean V;
    public boolean W;
    public boolean a;
    public boolean a0;
    public int b;
    public final org.telegram.ui.Components.u5 b0;
    public boolean c;
    public final /* synthetic */ mv c0;
    public boolean d;
    public p7 e;
    public TLRPC.User f;
    public TLRPC.Chat h;
    public final org.telegram.ui.Components.u8 n;
    public final ImageReceiver r;
    public final ImageReceiver s;
    public final org.telegram.ui.Components.u8 w;
    public boolean x;
    public final FrameLayout y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(mv mvVar, Context context) {
        super(context);
        this.c0 = mvVar;
        this.n = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.r = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.s = imageReceiver2;
        this.w = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        this.x = true;
        o7 o7Var = new o7(null, true);
        this.P = o7Var;
        this.Q = 1.0f;
        this.R = 1.0f;
        this.U = 1.0f;
        this.b0 = new org.telegram.ui.Components.u5(this, 0L, 350L, xq.h);
        o7Var.o = mvVar.b == 1;
        o7Var.D = true;
        imageReceiver.K0 = true;
        imageReceiver.A1 = true;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.y = frameLayout;
        frameLayout.setClipChildren(false);
        if (!this.O) {
            setClipChildren(false);
        }
        b();
        addView(frameLayout, mf.c(-2.0f, -1));
        imageReceiver.J0(org.telegram.messenger.g0.L(48.0f) / 2);
        imageReceiver2.J0(org.telegram.messenger.g0.L(48.0f) / 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClipInParent(boolean z10) {
        if (getParent() != null) {
            ((ViewGroup) getParent()).setClipChildren(z10);
        }
        if (getParent() == null || getParent().getParent() == null || getParent().getParent().getParent() == null) {
            return;
        }
        ((ViewGroup) getParent().getParent().getParent()).setClipChildren(z10);
    }

    public final void b() {
        int textColor;
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(getContext());
        this.E = k5Var;
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        this.E.setGravity(17);
        this.E.setTextSize(11);
        org.telegram.ui.ActionBar.k5 k5Var2 = this.E;
        textColor = this.c0.getTextColor();
        k5Var2.setTextColor(textColor);
        hs.i(this.E);
        this.E.setMaxLines(1);
        this.y.addView(this.E, mf.d(-1, -2.0f, 0, 1.0f, 0.0f, 1.0f, 0.0f));
        this.r.J0(org.telegram.messenger.g0.L(48.0f) / 2);
        this.s.J0(org.telegram.messenger.g0.L(48.0f) / 2);
    }

    public final void c(Canvas canvas, float f10, float f11, float f12) {
        mv mvVar = this.c0;
        int i3 = mvVar.b;
        Paint paint = mvVar.H;
        z6 z6Var = mvVar.s;
        Paint paint2 = mvVar.I;
        Drawable drawable = mvVar.c;
        if (this.G && !z6Var.K(this.F) && Utilities.x(z6Var.F(this.F))) {
            float L = f10 + org.telegram.messenger.g0.L(16.0f);
            float L2 = f11 + org.telegram.messenger.g0.L(16.0f);
            paint.setColor(org.telegram.ui.ActionBar.k6.r1(f12, mvVar.f(org.telegram.ui.ActionBar.k6.Vl)));
            if (i3 == 0) {
                paint2.setColor(org.telegram.ui.ActionBar.k6.r1(f12, mvVar.f(org.telegram.ui.ActionBar.k6.s8)));
            } else {
                paint2.setColor(org.telegram.ui.ActionBar.k6.r1(f12, mvVar.f(org.telegram.ui.ActionBar.k6.M8)));
            }
            canvas.drawCircle(L, L2, org.telegram.messenger.g0.L(11.0f), paint2);
            canvas.drawCircle(L, L2, org.telegram.messenger.g0.L(9.0f), paint);
            int f13 = mvVar.f(i3 == 0 ? org.telegram.ui.ActionBar.k6.s8 : org.telegram.ui.ActionBar.k6.M8);
            if (f13 != mvVar.e) {
                mvVar.e = f13;
                drawable.setColorFilter(new PorterDuffColorFilter(f13, PorterDuff.Mode.MULTIPLY));
            }
            drawable.setAlpha((int) (f12 * 255.0f));
            drawable.setBounds((int) (L - (drawable.getIntrinsicWidth() / 2.0f)), (int) (L2 - (drawable.getIntrinsicHeight() / 2.0f)), (int) ((drawable.getIntrinsicWidth() / 2.0f) + L), (int) ((drawable.getIntrinsicHeight() / 2.0f) + L2));
            drawable.draw(canvas);
        }
    }

    public final void d(float f10, float f11, float f12, boolean z10) {
        float f13 = this.K;
        mv mvVar = this.c0;
        if (f13 != f10 || this.L != f11 || 0.0f != f12 || this.W != z10) {
            this.W = z10;
            this.K = f10;
            this.L = f11;
            invalidate();
            mvVar.h.invalidate();
        }
        float i3 = this.O ? 0.0f : 1.0f - Utilities.i(mvVar.O / mvVar.C0, 1.0f, 0.0f);
        this.R = i3;
        float f14 = i3 * this.Q;
        FrameLayout frameLayout = this.y;
        frameLayout.setAlpha(f14);
        frameLayout.setVisibility(f14 > 0.0f ? 0 : 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x020c  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        ImageReceiver imageReceiver;
        float f11;
        Canvas canvas2;
        o7 o7Var;
        float f12;
        boolean z10;
        float f13;
        float size;
        boolean z11;
        float f14;
        mv mvVar;
        int textColor;
        mv mvVar2;
        float f15;
        boolean z12;
        float f16;
        ImageReceiver imageReceiver2;
        boolean[] zArr;
        gh0 gh0Var;
        float L = org.telegram.messenger.g0.L(48.0f);
        float L2 = org.telegram.messenger.g0.L(26.33f);
        float L3 = org.telegram.messenger.g0.L(8.0f);
        mv mvVar3 = this.c0;
        int i3 = mvVar3.b;
        z6 z6Var = mvVar3.s;
        Paint paint = mvVar3.I;
        float i10 = Utilities.i(mvVar3.o0 / 0.5f, 1.0f, 0.0f) * L3;
        if (this.W) {
            i10 += Utilities.i((mvVar3.o0 - 0.5f) / 0.5f, 1.0f, 0.0f) * org.telegram.messenger.g0.L(16.0f);
        }
        float T1 = org.telegram.messenger.g0.T1(L + i10, L2, this.K);
        float f17 = T1 / 2.0f;
        float measuredWidth = (getMeasuredWidth() / 2.0f) - f17;
        float T12 = org.telegram.messenger.g0.T1(measuredWidth, 0.0f, this.K);
        float T13 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(5.0f), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - L2) / 2.0f, this.K);
        float i11 = Utilities.i(this.K / 0.5f, 1.0f, 0.0f);
        o7 o7Var2 = this.P;
        o7Var2.a = true;
        RectF rectF = o7Var2.F;
        if (!o7Var2.p) {
            o7Var2.e = 1.0f - mvVar3.e0;
        }
        float f18 = T13 + T1;
        rectF.set(T12, T13, T12 + T1, f18);
        o7Var2.G = org.telegram.messenger.g0.N(1.33f) * this.K;
        ImageReceiver imageReceiver3 = this.r;
        imageReceiver3.setAlpha(1.0f);
        imageReceiver3.J0((int) f17);
        float f19 = T12 + f17;
        this.M = f19;
        float f20 = T13 + f17;
        this.N = f20;
        if (i3 == 0) {
            f10 = f17;
            paint.setColor(mvVar3.f(org.telegram.ui.ActionBar.k6.s8));
        } else {
            f10 = f17;
            paint.setColor(mvVar3.f(org.telegram.ui.ActionBar.k6.M8));
        }
        if (this.K != 0.0f) {
            imageReceiver = imageReceiver3;
            f11 = T12;
            canvas.drawCircle(this.M, this.N, org.telegram.messenger.g0.N(1.5f) + f10, paint);
        } else {
            imageReceiver = imageReceiver3;
            f11 = T12;
        }
        canvas.save();
        float f21 = this.M;
        float f22 = this.N;
        float f23 = this.U;
        canvas.scale(f23, f23, f21, f22);
        if (this.S == null) {
            this.S = mvVar3.n;
        }
        ArrayList arrayList = (ArrayList) z6Var.c.f(this.F);
        boolean z13 = (arrayList == null || arrayList.isEmpty()) ? false : true;
        if (z13 || (this.a0 && (gh0Var = this.S) != null && gh0Var.f < 0.98f)) {
            canvas2 = canvas;
            o7Var = o7Var2;
            ImageReceiver imageReceiver4 = imageReceiver;
            f12 = f11;
            z10 = false;
            f13 = f18;
            if (z13) {
                float f24 = 0.0f;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    f24 += ((y6) arrayList.get(i12)).h;
                }
                size = (z6Var.d + f24) / (arrayList.size() + r4);
                z11 = ((y6) k2.p1.h(1, arrayList)).H;
                mvVar3.n0 = z11;
            } else {
                z11 = mvVar3.n0;
                size = 1.0f;
            }
            invalidate();
            if (this.S == null) {
                gh0 gh0Var2 = mvVar3.n;
                if (gh0Var2 != null) {
                    this.S = gh0Var2;
                } else {
                    gh0 gh0Var3 = new gh0(this);
                    this.S = gh0Var3;
                    mvVar3.n = gh0Var3;
                    gh0Var3.d(null, true, false);
                }
            }
            if (this.x) {
                canvas2.save();
                canvas2.scale(o7Var.b(), o7Var.b(), rectF.centerX(), rectF.centerY());
                imageReceiver4.A0(rectF);
                imageReceiver4.h(canvas2, null);
                canvas2.restore();
            }
            this.S.q = 0;
            Paint o10 = z11 ? s7.o(imageReceiver4) : s7.t(imageReceiver4, true);
            o10.setAlpha(hs.e4);
            gh0 gh0Var4 = this.S;
            gh0Var4.t = o10;
            gh0Var4.f((int) (imageReceiver4.L0 - org.telegram.messenger.g0.L(3.0f)), (int) (imageReceiver4.M0 - org.telegram.messenger.g0.L(3.0f)), (int) (imageReceiver4.y() + org.telegram.messenger.g0.L(3.0f)), (int) (imageReceiver4.A() + org.telegram.messenger.g0.L(3.0f)));
            this.S.e(this.a0, Utilities.i(size, 1.0f, 0.0f));
            if (imageReceiver4.R0) {
                this.S.a(canvas2);
            }
            this.a0 = true;
            invalidate();
        } else {
            float d = this.b0.d(this.H);
            if (this.x) {
                if (this.a0) {
                    o7Var2.p = true;
                    o7Var2.e = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new bh.f(this, 12));
                    ofFloat.addListener(new ai.e1(this, 8));
                    mvVar2 = mvVar3;
                    ofFloat.setDuration(100L);
                    ofFloat.start();
                } else {
                    mvVar2 = mvVar3;
                }
                float f25 = d * o7Var2.e;
                o7Var2.b = !this.a0;
                mvVar = mvVar2;
                if (!this.c && mvVar.o0 <= 0.0f) {
                    if (org.telegram.messenger.g0.W1(xq.g.getInterpolation(this.K), getMeasuredWidth(), org.telegram.messenger.g0.L(16.0f)) < (org.telegram.messenger.g0.N(3.5f) + f10) * 2.0f) {
                        f15 = ((float) Math.toDegrees(Math.acos((r1 / 2.0f) / r4))) * 2.0f;
                        o7Var2.f = f15;
                        o7Var2.l = this.c;
                        o7Var2.m = this.d;
                        o7Var2.u = 1.0f - f25;
                        z12 = this.G;
                        if (z12 && this.I) {
                            o7Var2.s = this.J;
                        } else {
                            o7Var2.s = 0L;
                        }
                        if (z12) {
                            o7Var = o7Var2;
                            f16 = f25;
                            imageReceiver2 = imageReceiver;
                            f12 = f11;
                            z10 = false;
                            f13 = f18;
                            zArr = null;
                            long j10 = this.F;
                            canvas2 = canvas;
                            s7.i(j10, canvas2, imageReceiver2, z6Var.K(j10), o7Var);
                        } else {
                            o7Var = o7Var2;
                            f16 = f25;
                            imageReceiver2 = imageReceiver;
                            f12 = f11;
                            z10 = false;
                            f13 = f18;
                            zArr = null;
                            canvas2 = canvas;
                            s7.i(this.F, canvas2, imageReceiver2, z6Var.J(), o7Var);
                        }
                        ImageReceiver imageReceiver5 = imageReceiver2;
                        if (f16 > 0.0f) {
                            if (s7.d == null) {
                                b10 b10Var = new b10();
                                s7.d = b10Var;
                                b10Var.a = true;
                                b10Var.b = true;
                                b10Var.c.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
                                s7.d.c.setStyle(Paint.Style.STROKE);
                                s7.d.c.setStrokeCap(Paint.Cap.ROUND);
                            }
                            int x02 = org.telegram.ui.ActionBar.k6.x0(zArr, org.telegram.ui.ActionBar.k6.lk, z10);
                            int x03 = org.telegram.ui.ActionBar.k6.x0(zArr, org.telegram.ui.ActionBar.k6.q7, z10);
                            s7.d.d(i0.a.f(0.25f, x02, x03), x03, z10 ? 1 : 0, z10 ? 1 : 0);
                            s7.d.b(imageReceiver5.L0, imageReceiver5.M0, imageReceiver5.y(), imageReceiver5.A());
                            Paint paint2 = s7.d.c;
                            paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
                            paint2.setAlpha((int) (255.0f * f16));
                            canvas2.drawCircle(f19, f20, o7Var.b() * (f10 + org.telegram.messenger.g0.L(4.0f)), paint2);
                        }
                        d = f16;
                    }
                }
                f15 = 0.0f;
                o7Var2.f = f15;
                o7Var2.l = this.c;
                o7Var2.m = this.d;
                o7Var2.u = 1.0f - f25;
                z12 = this.G;
                if (z12) {
                }
                o7Var2.s = 0L;
                if (z12) {
                }
                ImageReceiver imageReceiver52 = imageReceiver2;
                if (f16 > 0.0f) {
                }
                d = f16;
            } else {
                canvas2 = canvas;
                o7Var = o7Var2;
                mvVar = mvVar3;
                f13 = f18;
                f12 = f11;
                z10 = false;
            }
            this.a0 = z10;
            if (this.x) {
                canvas2.save();
                float f26 = 1.0f - i11;
                canvas2.scale(f26, f26, this.M + org.telegram.messenger.g0.L(16.0f), this.N + org.telegram.messenger.g0.L(16.0f));
                c(canvas2, this.M, this.N, 1.0f);
                float f27 = this.M;
                float f28 = this.N;
                if (d > 0.0f) {
                    float L4 = f27 + org.telegram.messenger.g0.L(17.0f);
                    float L5 = f28 + org.telegram.messenger.g0.L(17.0f);
                    Paint paint3 = mvVar.H;
                    paint3.setColor(org.telegram.ui.ActionBar.k6.r1(d, mvVar.f(org.telegram.ui.ActionBar.k6.q7)));
                    if (i3 == 0) {
                        paint.setColor(org.telegram.ui.ActionBar.k6.r1(d, mvVar.f(org.telegram.ui.ActionBar.k6.s8)));
                    } else {
                        paint.setColor(org.telegram.ui.ActionBar.k6.r1(d, mvVar.f(org.telegram.ui.ActionBar.k6.M8)));
                    }
                    float interpolation = xq.k.getInterpolation(d) * org.telegram.messenger.g0.L(9.0f);
                    canvas2.drawCircle(L4, L5, org.telegram.messenger.g0.L(2.0f) + interpolation, paint);
                    canvas2.drawCircle(L4, L5, interpolation, paint3);
                    textColor = mvVar.getTextColor();
                    paint3.setColor(org.telegram.ui.ActionBar.k6.r1(d, textColor));
                    RectF rectF2 = org.telegram.messenger.g0.P;
                    rectF2.set(L4 - org.telegram.messenger.g0.L(1.0f), L5 - org.telegram.messenger.g0.N(4.6f), org.telegram.messenger.g0.L(1.0f) + L4, org.telegram.messenger.g0.N(1.6f) + L5);
                    canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), paint3);
                    rectF2.set(L4 - org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.N(2.6f) + L5, L4 + org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.N(4.6f) + L5);
                    canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), paint3);
                }
                canvas2.restore();
            }
        }
        canvas2.restore();
        if (!this.I || this.L <= 0.0f) {
            f14 = f12;
        } else {
            ImageReceiver imageReceiver6 = this.s;
            f14 = f12;
            imageReceiver6.y0(f14, T13, T1, T1);
            imageReceiver6.setAlpha(this.L);
            imageReceiver6.h(canvas2, null);
        }
        float L6 = ((1.0f - this.K) * org.telegram.messenger.g0.L(7.0f)) + f13;
        FrameLayout frameLayout = this.y;
        frameLayout.setTranslationY(L6);
        frameLayout.setTranslationX(f14 - measuredWidth);
        if (!this.O) {
            if (this.G) {
                this.Q = 1.0f;
            } else {
                this.Q = o7Var.n == 2 ? 0.7f : 1.0f;
            }
            float f29 = this.R * this.Q;
            frameLayout.setAlpha(f29);
            frameLayout.setVisibility(f29 > 0.0f ? z10 : 4);
        }
        super.dispatchDraw(canvas);
    }

    public float getCy() {
        float L = org.telegram.messenger.g0.L(48.0f);
        float L2 = org.telegram.messenger.g0.L(26.33f);
        return org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(5.0f), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - L2) / 2.0f, this.c0.d0) + (org.telegram.messenger.g0.T1(L, L2, this.K) / 2.0f);
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.O || (this.a && getParent() != null)) {
            ViewParent parent = getParent();
            mv mvVar = this.c0;
            j jVar = mvVar.r;
            if (parent == jVar) {
                jVar.invalidate();
            } else {
                mvVar.invalidate();
            }
        }
        super.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.r.P();
        this.s.P();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r.R();
        this.s.R();
        this.P.g();
        p7 p7Var = this.e;
        if (p7Var != null) {
            p7Var.a();
            this.e = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.O ? org.telegram.messenger.g0.L(70.0f) : this.c0.N, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(81.0f), TLObject.FLAG_30));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCrossfadeTo(long j10) {
        TLRPC.Chat chat;
        int i3 = this.c0.f;
        if (this.J != j10) {
            this.J = j10;
            boolean z10 = j10 != -1;
            this.I = z10;
            ImageReceiver imageReceiver = this.s;
            if (!z10) {
                imageReceiver.f();
                return;
            }
            if (j10 > 0) {
                TLRPC.User a22 = hp.s1(i3).a2(Long.valueOf(j10));
                this.f = a22;
                this.h = null;
                chat = a22;
            } else {
                TLRPC.Chat M0 = hp.s1(i3).M0(Long.valueOf(-j10));
                this.h = M0;
                this.f = null;
                chat = M0;
            }
            if (chat != null) {
                org.telegram.ui.Components.u8 u8Var = this.w;
                u8Var.p(chat);
                imageReceiver.i0(chat, u8Var, null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setDialogId(long j10) {
        TLRPC.Chat chat;
        y6 y6Var;
        mv mvVar = this.c0;
        int i3 = mvVar.f;
        z6 z6Var = mvVar.s;
        long j11 = this.F;
        int i10 = 0;
        boolean z10 = j11 == j10;
        if (!z10 && this.e != null) {
            z6Var.h0(j11, false);
            this.e.a();
            this.e = null;
        }
        this.F = j10;
        this.G = j10 == h10.i(i3).e();
        this.H = z6Var.Q(j10);
        if (j10 > 0) {
            TLRPC.User a22 = hp.s1(i3).a2(Long.valueOf(j10));
            this.f = a22;
            this.h = null;
            chat = a22;
        } else {
            TLRPC.Chat M0 = hp.s1(i3).M0(Long.valueOf(-j10));
            this.h = M0;
            this.f = null;
            chat = M0;
        }
        ImageReceiver imageReceiver = this.r;
        if (chat == null) {
            this.E.l("", false);
            imageReceiver.f();
            return;
        }
        org.telegram.ui.Components.u8 u8Var = this.n;
        u8Var.p(chat);
        imageReceiver.i0(chat, u8Var, null);
        if (this.O) {
            return;
        }
        this.E.i(null);
        if (z6Var.Q(j10)) {
            this.E.setTextSize(10);
            this.E.l(bd.M0(2131750846, null), false);
            this.V = false;
            return;
        }
        if (!Utilities.x(z6Var.F(j10))) {
            this.E.setTextSize(10);
            s7.a(this.E);
            this.V = true;
            return;
        }
        HashMap hashMap = (HashMap) z6Var.e.f(j10);
        if (hashMap != null && !hashMap.isEmpty()) {
            Collection values = hashMap.values();
            if (!values.isEmpty()) {
                y6Var = (y6) values.iterator().next();
                if (y6Var == null) {
                    this.E.setTextSize(10);
                    s7.a(this.E);
                    this.V = true;
                    return;
                }
                if (this.G) {
                    if (z10 && this.V && !this.O) {
                        org.telegram.ui.ActionBar.k5 k5Var = this.E;
                        b();
                        ValueAnimator valueAnimator = mvVar.k0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            mvVar.k0 = null;
                        }
                        int i11 = 2;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        mvVar.k0 = ofFloat;
                        ofFloat.addUpdateListener(new uc(i11, this, k5Var));
                        mvVar.k0.addListener(new bh.j(i11, this, k5Var));
                        mvVar.k0.setDuration(150L);
                        this.E.setAlpha(0.0f);
                        this.E.setTranslationY(org.telegram.messenger.g0.L(5.0f));
                        mvVar.l0 = new p(this, i10);
                    }
                    org.telegram.messenger.g0.i3(mvVar.l0, 500L);
                    this.V = false;
                    this.E.setTextSize(10);
                    this.E.l(bd.M0(2131748309, null), false);
                    return;
                }
                if (this.f == null) {
                    this.E.setTextSize(11);
                    this.E.l(org.telegram.messenger.i6.m(this.h.title, this.E.getPaint().getFontMetricsInt(), false, null, 0), false);
                    this.E.i(null);
                    return;
                }
                this.E.setTextSize(11);
                String str = this.f.first_name;
                String trim = str != null ? str.trim() : "";
                int indexOf = trim.indexOf(" ");
                if (indexOf > 0) {
                    trim = trim.substring(0, indexOf);
                }
                String str2 = trim;
                if (!this.f.verified) {
                    this.E.l(org.telegram.messenger.i6.m(str2, this.E.getPaint().getFontMetricsInt(), false, null, 0), false);
                    this.E.i(null);
                    return;
                }
                if (this.T == null) {
                    Drawable mutate = mvVar.getContext().getDrawable(R.drawable.verified_area).mutate();
                    Drawable mutate2 = mvVar.getContext().getDrawable(R.drawable.verified_check).mutate();
                    h hVar = new h(mvVar, mutate, mutate2, mutate, mutate2);
                    hVar.x = true;
                    this.T = hVar;
                }
                this.E.l(org.telegram.messenger.i6.m(str2, this.E.getPaint().getFontMetricsInt(), false, null, 0), false);
                this.E.i(this.T);
                return;
            }
        }
        y6Var = null;
        if (y6Var == null) {
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        o7 o7Var = this.P;
        if (z10 && o7Var.H == null) {
            o7Var.H = new gc(this, 1.5f, 5.0f);
        }
        gc gcVar = o7Var.H;
        if (gcVar != null) {
            gcVar.c(z10);
        }
    }

    @Override // android.view.View
    public final void invalidate(int i3, int i10, int i11, int i12) {
        if (this.O || (this.a && getParent() != null)) {
            ViewParent parent = getParent();
            mv mvVar = this.c0;
            j jVar = mvVar.r;
            if (parent == jVar) {
                jVar.invalidate();
            }
            mvVar.invalidate();
        }
        super.invalidate(i3, i10, i11, i12);
    }
}
