package fi;

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
import c8.ma;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.p10;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.tv;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class p extends FrameLayout {
    public org.telegram.ui.ActionBar.n5 E;
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
    public final e7 P;
    public float Q;
    public float R;
    public qh0 S;
    public g T;
    public final float U;
    public boolean V;
    public boolean W;
    public boolean a;
    public boolean a0;
    public int b;
    public final org.telegram.ui.Components.c6 b0;
    public boolean c;
    public final /* synthetic */ tv c0;
    public boolean d;
    public f7 e;
    public TLRPC.User f;
    public TLRPC.Chat h;
    public final org.telegram.ui.Components.b9 n;
    public final ImageReceiver r;
    public final ImageReceiver s;
    public final org.telegram.ui.Components.b9 w;
    public boolean x;
    public final FrameLayout y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(tv tvVar, Context context) {
        super(context);
        this.c0 = tvVar;
        this.n = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.r = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.s = imageReceiver2;
        this.w = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
        this.x = true;
        e7 e7Var = new e7(null, true);
        this.P = e7Var;
        this.Q = 1.0f;
        this.R = 1.0f;
        this.U = 1.0f;
        this.b0 = new org.telegram.ui.Components.c6(this, 0L, 350L, lr.h);
        e7Var.o = tvVar.b == 1;
        e7Var.D = true;
        imageReceiver.K0 = true;
        imageReceiver.A1 = true;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.y = frameLayout;
        frameLayout.setClipChildren(false);
        if (!this.O) {
            setClipChildren(false);
        }
        b();
        addView(frameLayout, ma.c(-2.0f, -1));
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
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(getContext());
        this.E = n5Var;
        n5Var.setTypeface(org.telegram.messenger.g0.o());
        this.E.setGravity(17);
        this.E.setTextSize(11);
        this.E.setTextColor(this.c0.getTextColor());
        ks.i(this.E);
        this.E.setMaxLines(1);
        this.y.addView(this.E, ma.d(-1, -2.0f, 0, 1.0f, 0.0f, 1.0f, 0.0f));
        this.r.J0(org.telegram.messenger.g0.L(48.0f) / 2);
        this.s.J0(org.telegram.messenger.g0.L(48.0f) / 2);
    }

    public final void c(Canvas canvas, float f10, float f11, float f12) {
        tv tvVar = this.c0;
        int i7 = tvVar.b;
        Paint paint = tvVar.H;
        p6 p6Var = tvVar.s;
        Paint paint2 = tvVar.I;
        Drawable drawable = tvVar.c;
        if (this.G && !p6Var.K(this.F) && Utilities.x(p6Var.F(this.F))) {
            float L = f10 + org.telegram.messenger.g0.L(16.0f);
            float L2 = f11 + org.telegram.messenger.g0.L(16.0f);
            paint.setColor(org.telegram.ui.ActionBar.n6.r1(f12, tvVar.f(org.telegram.ui.ActionBar.n6.Yl)));
            if (i7 == 0) {
                paint2.setColor(org.telegram.ui.ActionBar.n6.r1(f12, tvVar.f(org.telegram.ui.ActionBar.n6.s8)));
            } else {
                paint2.setColor(org.telegram.ui.ActionBar.n6.r1(f12, tvVar.f(org.telegram.ui.ActionBar.n6.M8)));
            }
            canvas.drawCircle(L, L2, org.telegram.messenger.g0.L(11.0f), paint2);
            canvas.drawCircle(L, L2, org.telegram.messenger.g0.L(9.0f), paint);
            int f13 = tvVar.f(i7 == 0 ? org.telegram.ui.ActionBar.n6.s8 : org.telegram.ui.ActionBar.n6.M8);
            if (f13 != tvVar.e) {
                tvVar.e = f13;
                drawable.setColorFilter(new PorterDuffColorFilter(f13, PorterDuff.Mode.MULTIPLY));
            }
            drawable.setAlpha((int) (f12 * 255.0f));
            drawable.setBounds((int) (L - (drawable.getIntrinsicWidth() / 2.0f)), (int) (L2 - (drawable.getIntrinsicHeight() / 2.0f)), (int) ((drawable.getIntrinsicWidth() / 2.0f) + L), (int) ((drawable.getIntrinsicHeight() / 2.0f) + L2));
            drawable.draw(canvas);
        }
    }

    public final void d(float f10, float f11, float f12, boolean z10) {
        float f13 = this.K;
        tv tvVar = this.c0;
        if (f13 != f10 || this.L != f11 || 0.0f != f12 || this.W != z10) {
            this.W = z10;
            this.K = f10;
            this.L = f11;
            invalidate();
            tvVar.h.invalidate();
        }
        float i7 = this.O ? 0.0f : 1.0f - Utilities.i(tvVar.O / tvVar.C0, 1.0f, 0.0f);
        this.R = i7;
        float f14 = i7 * this.Q;
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
        e7 e7Var;
        float f12;
        boolean z10;
        float f13;
        float size;
        boolean z11;
        float f14;
        tv tvVar;
        tv tvVar2;
        float f15;
        boolean z12;
        float f16;
        ImageReceiver imageReceiver2;
        boolean[] zArr;
        qh0 qh0Var;
        float L = org.telegram.messenger.g0.L(48.0f);
        float L2 = org.telegram.messenger.g0.L(26.33f);
        float L3 = org.telegram.messenger.g0.L(8.0f);
        tv tvVar3 = this.c0;
        int i7 = tvVar3.b;
        p6 p6Var = tvVar3.s;
        Paint paint = tvVar3.I;
        float i10 = Utilities.i(tvVar3.o0 / 0.5f, 1.0f, 0.0f) * L3;
        if (this.W) {
            i10 += Utilities.i((tvVar3.o0 - 0.5f) / 0.5f, 1.0f, 0.0f) * org.telegram.messenger.g0.L(16.0f);
        }
        float T1 = org.telegram.messenger.g0.T1(L + i10, L2, this.K);
        float f17 = T1 / 2.0f;
        float measuredWidth = (getMeasuredWidth() / 2.0f) - f17;
        float T12 = org.telegram.messenger.g0.T1(measuredWidth, 0.0f, this.K);
        float T13 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(5.0f), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - L2) / 2.0f, this.K);
        float i11 = Utilities.i(this.K / 0.5f, 1.0f, 0.0f);
        e7 e7Var2 = this.P;
        e7Var2.a = true;
        RectF rectF = e7Var2.F;
        if (!e7Var2.p) {
            e7Var2.e = 1.0f - tvVar3.e0;
        }
        float f18 = T13 + T1;
        rectF.set(T12, T13, T12 + T1, f18);
        e7Var2.G = org.telegram.messenger.g0.N(1.33f) * this.K;
        ImageReceiver imageReceiver3 = this.r;
        imageReceiver3.setAlpha(1.0f);
        imageReceiver3.J0((int) f17);
        float f19 = T12 + f17;
        this.M = f19;
        float f20 = T13 + f17;
        this.N = f20;
        if (i7 == 0) {
            f10 = f17;
            paint.setColor(tvVar3.f(org.telegram.ui.ActionBar.n6.s8));
        } else {
            f10 = f17;
            paint.setColor(tvVar3.f(org.telegram.ui.ActionBar.n6.M8));
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
            this.S = tvVar3.n;
        }
        ArrayList arrayList = (ArrayList) p6Var.c.f(this.F);
        boolean z13 = (arrayList == null || arrayList.isEmpty()) ? false : true;
        if (z13 || (this.a0 && (qh0Var = this.S) != null && qh0Var.f < 0.98f)) {
            canvas2 = canvas;
            e7Var = e7Var2;
            ImageReceiver imageReceiver4 = imageReceiver;
            f12 = f11;
            z10 = false;
            f13 = f18;
            if (z13) {
                float f24 = 0.0f;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    f24 += ((o6) arrayList.get(i12)).h;
                }
                size = (p6Var.d + f24) / (arrayList.size() + r4);
                z11 = ((o6) i5.c.h(1, arrayList)).H;
                tvVar3.n0 = z11;
            } else {
                z11 = tvVar3.n0;
                size = 1.0f;
            }
            invalidate();
            if (this.S == null) {
                qh0 qh0Var2 = tvVar3.n;
                if (qh0Var2 != null) {
                    this.S = qh0Var2;
                } else {
                    qh0 qh0Var3 = new qh0(this);
                    this.S = qh0Var3;
                    tvVar3.n = qh0Var3;
                    qh0Var3.d(null, true, false);
                }
            }
            if (this.x) {
                canvas2.save();
                canvas2.scale(e7Var.b(), e7Var.b(), rectF.centerX(), rectF.centerY());
                imageReceiver4.A0(rectF);
                imageReceiver4.h(canvas2, null);
                canvas2.restore();
            }
            this.S.q = 0;
            Paint o4 = z11 ? i7.o(imageReceiver4) : i7.t(imageReceiver4, true);
            o4.setAlpha(ks.e4);
            qh0 qh0Var4 = this.S;
            qh0Var4.t = o4;
            qh0Var4.f((int) (imageReceiver4.L0 - org.telegram.messenger.g0.L(3.0f)), (int) (imageReceiver4.M0 - org.telegram.messenger.g0.L(3.0f)), (int) (imageReceiver4.y() + org.telegram.messenger.g0.L(3.0f)), (int) (imageReceiver4.A() + org.telegram.messenger.g0.L(3.0f)));
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
                    e7Var2.p = true;
                    e7Var2.e = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new ah.g(this, 13));
                    ofFloat.addListener(new ai.j0(this, 9));
                    tvVar2 = tvVar3;
                    ofFloat.setDuration(100L);
                    ofFloat.start();
                } else {
                    tvVar2 = tvVar3;
                }
                float f25 = d * e7Var2.e;
                e7Var2.b = !this.a0;
                tvVar = tvVar2;
                if (!this.c && tvVar.o0 <= 0.0f) {
                    if (org.telegram.messenger.g0.W1(lr.g.getInterpolation(this.K), getMeasuredWidth(), org.telegram.messenger.g0.L(16.0f)) < (org.telegram.messenger.g0.N(3.5f) + f10) * 2.0f) {
                        f15 = ((float) Math.toDegrees(Math.acos((r1 / 2.0f) / r4))) * 2.0f;
                        e7Var2.f = f15;
                        e7Var2.l = this.c;
                        e7Var2.m = this.d;
                        e7Var2.u = 1.0f - f25;
                        z12 = this.G;
                        if (z12 && this.I) {
                            e7Var2.s = this.J;
                        } else {
                            e7Var2.s = 0L;
                        }
                        if (z12) {
                            e7Var = e7Var2;
                            f16 = f25;
                            imageReceiver2 = imageReceiver;
                            f12 = f11;
                            z10 = false;
                            f13 = f18;
                            zArr = null;
                            long j3 = this.F;
                            canvas2 = canvas;
                            i7.i(j3, canvas2, imageReceiver2, p6Var.K(j3), e7Var);
                        } else {
                            e7Var = e7Var2;
                            f16 = f25;
                            imageReceiver2 = imageReceiver;
                            f12 = f11;
                            z10 = false;
                            f13 = f18;
                            zArr = null;
                            canvas2 = canvas;
                            i7.i(this.F, canvas2, imageReceiver2, p6Var.J(), e7Var);
                        }
                        ImageReceiver imageReceiver5 = imageReceiver2;
                        if (f16 > 0.0f) {
                            if (i7.d == null) {
                                p10 p10Var = new p10();
                                i7.d = p10Var;
                                p10Var.a = true;
                                p10Var.b = true;
                                p10Var.c.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
                                i7.d.c.setStyle(Paint.Style.STROKE);
                                i7.d.c.setStrokeCap(Paint.Cap.ROUND);
                            }
                            int x02 = org.telegram.ui.ActionBar.n6.x0(zArr, org.telegram.ui.ActionBar.n6.ok, z10);
                            int x03 = org.telegram.ui.ActionBar.n6.x0(zArr, org.telegram.ui.ActionBar.n6.q7, z10);
                            i7.d.d(i0.a.f(0.25f, x02, x03), x03, z10 ? 1 : 0, z10 ? 1 : 0);
                            i7.d.b(imageReceiver5.L0, imageReceiver5.M0, imageReceiver5.y(), imageReceiver5.A());
                            Paint paint2 = i7.d.c;
                            paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
                            paint2.setAlpha((int) (255.0f * f16));
                            canvas2.drawCircle(f19, f20, e7Var.b() * (f10 + org.telegram.messenger.g0.L(4.0f)), paint2);
                        }
                        d = f16;
                    }
                }
                f15 = 0.0f;
                e7Var2.f = f15;
                e7Var2.l = this.c;
                e7Var2.m = this.d;
                e7Var2.u = 1.0f - f25;
                z12 = this.G;
                if (z12) {
                }
                e7Var2.s = 0L;
                if (z12) {
                }
                ImageReceiver imageReceiver52 = imageReceiver2;
                if (f16 > 0.0f) {
                }
                d = f16;
            } else {
                canvas2 = canvas;
                e7Var = e7Var2;
                tvVar = tvVar3;
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
                    Paint paint3 = tvVar.H;
                    paint3.setColor(org.telegram.ui.ActionBar.n6.r1(d, tvVar.f(org.telegram.ui.ActionBar.n6.q7)));
                    if (i7 == 0) {
                        paint.setColor(org.telegram.ui.ActionBar.n6.r1(d, tvVar.f(org.telegram.ui.ActionBar.n6.s8)));
                    } else {
                        paint.setColor(org.telegram.ui.ActionBar.n6.r1(d, tvVar.f(org.telegram.ui.ActionBar.n6.M8)));
                    }
                    float interpolation = lr.k.getInterpolation(d) * org.telegram.messenger.g0.L(9.0f);
                    canvas2.drawCircle(L4, L5, org.telegram.messenger.g0.L(2.0f) + interpolation, paint);
                    canvas2.drawCircle(L4, L5, interpolation, paint3);
                    paint3.setColor(org.telegram.ui.ActionBar.n6.r1(d, tvVar.getTextColor()));
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
                this.Q = e7Var.n == 2 ? 0.7f : 1.0f;
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
            tv tvVar = this.c0;
            i iVar = tvVar.r;
            if (parent == iVar) {
                iVar.invalidate();
            } else {
                tvVar.invalidate();
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
        f7 f7Var = this.e;
        if (f7Var != null) {
            f7Var.a();
            this.e = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.O ? org.telegram.messenger.g0.L(70.0f) : this.c0.N, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(81.0f), TLObject.FLAG_30));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCrossfadeTo(long j3) {
        TLRPC.Chat chat;
        int i7 = this.c0.f;
        if (this.J != j3) {
            this.J = j3;
            boolean z10 = j3 != -1;
            this.I = z10;
            ImageReceiver imageReceiver = this.s;
            if (!z10) {
                imageReceiver.f();
                return;
            }
            if (j3 > 0) {
                TLRPC.User c22 = mp.u1(i7).c2(Long.valueOf(j3));
                this.f = c22;
                this.h = null;
                chat = c22;
            } else {
                TLRPC.Chat O0 = mp.u1(i7).O0(Long.valueOf(-j3));
                this.h = O0;
                this.f = null;
                chat = O0;
            }
            if (chat != null) {
                org.telegram.ui.Components.b9 b9Var = this.w;
                b9Var.p(chat);
                imageReceiver.i0(chat, b9Var, null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setDialogId(long j3) {
        TLRPC.Chat chat;
        o6 o6Var;
        tv tvVar = this.c0;
        int i7 = tvVar.f;
        p6 p6Var = tvVar.s;
        long j10 = this.F;
        int i10 = 0;
        boolean z10 = j10 == j3;
        if (!z10 && this.e != null) {
            p6Var.h0(j10, false);
            this.e.a();
            this.e = null;
        }
        this.F = j3;
        this.G = j3 == j10.i(i7).e();
        this.H = p6Var.Q(j3);
        if (j3 > 0) {
            TLRPC.User c22 = mp.u1(i7).c2(Long.valueOf(j3));
            this.f = c22;
            this.h = null;
            chat = c22;
        } else {
            TLRPC.Chat O0 = mp.u1(i7).O0(Long.valueOf(-j3));
            this.h = O0;
            this.f = null;
            chat = O0;
        }
        ImageReceiver imageReceiver = this.r;
        if (chat == null) {
            this.E.l("", false);
            imageReceiver.f();
            return;
        }
        org.telegram.ui.Components.b9 b9Var = this.n;
        b9Var.p(chat);
        imageReceiver.i0(chat, b9Var, null);
        if (this.O) {
            return;
        }
        this.E.i(null);
        if (p6Var.Q(j3)) {
            this.E.setTextSize(10);
            this.E.l(gd.M0(2131750834, null), false);
            this.V = false;
            return;
        }
        if (!Utilities.x(p6Var.F(j3))) {
            this.E.setTextSize(10);
            i7.a(this.E);
            this.V = true;
            return;
        }
        HashMap hashMap = (HashMap) p6Var.e.f(j3);
        if (hashMap != null && !hashMap.isEmpty()) {
            Collection values = hashMap.values();
            if (!values.isEmpty()) {
                o6Var = (o6) values.iterator().next();
                if (o6Var == null) {
                    this.E.setTextSize(10);
                    i7.a(this.E);
                    this.V = true;
                    return;
                }
                if (this.G) {
                    if (z10 && this.V && !this.O) {
                        org.telegram.ui.ActionBar.n5 n5Var = this.E;
                        b();
                        ValueAnimator valueAnimator = tvVar.k0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            tvVar.k0 = null;
                        }
                        int i11 = 2;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        tvVar.k0 = ofFloat;
                        ofFloat.addUpdateListener(new ch.w(i11, this, n5Var));
                        tvVar.k0.addListener(new ah.l(i11, this, n5Var));
                        tvVar.k0.setDuration(150L);
                        this.E.setAlpha(0.0f);
                        this.E.setTranslationY(org.telegram.messenger.g0.L(5.0f));
                        tvVar.l0 = new o(this, i10);
                    }
                    org.telegram.messenger.g0.h3(tvVar.l0, 500L);
                    this.V = false;
                    this.E.setTextSize(10);
                    this.E.l(gd.M0(2131748109, null), false);
                    return;
                }
                if (this.f == null) {
                    this.E.setTextSize(11);
                    this.E.l(org.telegram.messenger.j6.m(this.h.title, this.E.getPaint().getFontMetricsInt(), false, null, 0), false);
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
                    this.E.l(org.telegram.messenger.j6.m(str2, this.E.getPaint().getFontMetricsInt(), false, null, 0), false);
                    this.E.i(null);
                    return;
                }
                if (this.T == null) {
                    Drawable mutate = tvVar.getContext().getDrawable(R.drawable.verified_area).mutate();
                    Drawable mutate2 = tvVar.getContext().getDrawable(R.drawable.verified_check).mutate();
                    g gVar = new g(tvVar, mutate, mutate2, mutate, mutate2);
                    gVar.x = true;
                    this.T = gVar;
                }
                this.E.l(org.telegram.messenger.j6.m(str2, this.E.getPaint().getFontMetricsInt(), false, null, 0), false);
                this.E.i(this.T);
                return;
            }
        }
        o6Var = null;
        if (o6Var == null) {
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        e7 e7Var = this.P;
        if (z10 && e7Var.H == null) {
            e7Var.H = new mc(this, 1.5f, 5.0f);
        }
        mc mcVar = e7Var.H;
        if (mcVar != null) {
            mcVar.c(z10);
        }
    }

    @Override // android.view.View
    public final void invalidate(int i7, int i10, int i11, int i12) {
        if (this.O || (this.a && getParent() != null)) {
            ViewParent parent = getParent();
            tv tvVar = this.c0;
            i iVar = tvVar.r;
            if (parent == iVar) {
                iVar.invalidate();
            }
            tvVar.invalidate();
        }
        super.invalidate(i7, i10, i11, i12);
    }
}
