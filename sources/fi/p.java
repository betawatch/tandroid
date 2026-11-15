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
import c8.ja;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.gh0;
import org.telegram.ui.Components.i10;
import org.telegram.ui.qv;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class p extends FrameLayout {
    public org.telegram.ui.ActionBar.j5 E;
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
    public final h7 P;
    public float Q;
    public float R;
    public gh0 S;
    public g T;
    public final float U;
    public boolean V;
    public boolean W;
    public boolean a;
    public boolean a0;
    public int b;
    public final org.telegram.ui.Components.u5 b0;
    public boolean c;
    public final /* synthetic */ qv c0;
    public boolean d;
    public i7 e;
    public TLRPC.User f;
    public TLRPC.Chat h;
    public final org.telegram.ui.Components.t8 n;
    public final ImageReceiver r;
    public final ImageReceiver s;
    public final org.telegram.ui.Components.t8 w;
    public boolean x;
    public final FrameLayout y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(qv qvVar, Context context) {
        super(context);
        this.c0 = qvVar;
        this.n = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.r = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.s = imageReceiver2;
        this.w = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        this.x = true;
        h7 h7Var = new h7(null, true);
        this.P = h7Var;
        this.Q = 1.0f;
        this.R = 1.0f;
        this.U = 1.0f;
        this.b0 = new org.telegram.ui.Components.u5(this, 0L, 350L, er.h);
        h7Var.o = qvVar.b == 1;
        h7Var.D = true;
        imageReceiver.K0 = true;
        imageReceiver.A1 = true;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.y = frameLayout;
        frameLayout.setClipChildren(false);
        if (!this.O) {
            setClipChildren(false);
        }
        b();
        addView(frameLayout, ja.c(-2.0f, -1));
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
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(getContext());
        this.E = j5Var;
        j5Var.setTypeface(org.telegram.messenger.g0.o());
        this.E.setGravity(17);
        this.E.setTextSize(11);
        this.E.setTextColor(this.c0.getTextColor());
        ns.i(this.E);
        this.E.setMaxLines(1);
        this.y.addView(this.E, ja.d(-1, -2.0f, 0, 1.0f, 0.0f, 1.0f, 0.0f));
        this.r.J0(org.telegram.messenger.g0.L(48.0f) / 2);
        this.s.J0(org.telegram.messenger.g0.L(48.0f) / 2);
    }

    public final void c(Canvas canvas, float f10, float f11, float f12) {
        qv qvVar = this.c0;
        int i7 = qvVar.b;
        Paint paint = qvVar.H;
        s6 s6Var = qvVar.s;
        Paint paint2 = qvVar.I;
        Drawable drawable = qvVar.c;
        if (this.G && !s6Var.K(this.F) && Utilities.x(s6Var.F(this.F))) {
            float L = f10 + org.telegram.messenger.g0.L(16.0f);
            float L2 = f11 + org.telegram.messenger.g0.L(16.0f);
            paint.setColor(org.telegram.ui.ActionBar.j6.r1(f12, qvVar.f(org.telegram.ui.ActionBar.j6.Yl)));
            if (i7 == 0) {
                paint2.setColor(org.telegram.ui.ActionBar.j6.r1(f12, qvVar.f(org.telegram.ui.ActionBar.j6.s8)));
            } else {
                paint2.setColor(org.telegram.ui.ActionBar.j6.r1(f12, qvVar.f(org.telegram.ui.ActionBar.j6.M8)));
            }
            canvas.drawCircle(L, L2, org.telegram.messenger.g0.L(11.0f), paint2);
            canvas.drawCircle(L, L2, org.telegram.messenger.g0.L(9.0f), paint);
            int f13 = qvVar.f(i7 == 0 ? org.telegram.ui.ActionBar.j6.s8 : org.telegram.ui.ActionBar.j6.M8);
            if (f13 != qvVar.e) {
                qvVar.e = f13;
                drawable.setColorFilter(new PorterDuffColorFilter(f13, PorterDuff.Mode.MULTIPLY));
            }
            drawable.setAlpha((int) (f12 * 255.0f));
            drawable.setBounds((int) (L - (drawable.getIntrinsicWidth() / 2.0f)), (int) (L2 - (drawable.getIntrinsicHeight() / 2.0f)), (int) ((drawable.getIntrinsicWidth() / 2.0f) + L), (int) ((drawable.getIntrinsicHeight() / 2.0f) + L2));
            drawable.draw(canvas);
        }
    }

    public final void d(float f10, float f11, float f12, boolean z10) {
        float f13 = this.K;
        qv qvVar = this.c0;
        if (f13 != f10 || this.L != f11 || 0.0f != f12 || this.W != z10) {
            this.W = z10;
            this.K = f10;
            this.L = f11;
            invalidate();
            qvVar.h.invalidate();
        }
        float i7 = this.O ? 0.0f : 1.0f - Utilities.i(qvVar.O / qvVar.C0, 1.0f, 0.0f);
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
        h7 h7Var;
        float f12;
        boolean z10;
        float f13;
        float size;
        boolean z11;
        float f14;
        qv qvVar;
        qv qvVar2;
        float f15;
        boolean z12;
        float f16;
        ImageReceiver imageReceiver2;
        boolean[] zArr;
        gh0 gh0Var;
        float L = org.telegram.messenger.g0.L(48.0f);
        float L2 = org.telegram.messenger.g0.L(26.33f);
        float L3 = org.telegram.messenger.g0.L(8.0f);
        qv qvVar3 = this.c0;
        int i7 = qvVar3.b;
        s6 s6Var = qvVar3.s;
        Paint paint = qvVar3.I;
        float i10 = Utilities.i(qvVar3.o0 / 0.5f, 1.0f, 0.0f) * L3;
        if (this.W) {
            i10 += Utilities.i((qvVar3.o0 - 0.5f) / 0.5f, 1.0f, 0.0f) * org.telegram.messenger.g0.L(16.0f);
        }
        float T1 = org.telegram.messenger.g0.T1(L + i10, L2, this.K);
        float f17 = T1 / 2.0f;
        float measuredWidth = (getMeasuredWidth() / 2.0f) - f17;
        float T12 = org.telegram.messenger.g0.T1(measuredWidth, 0.0f, this.K);
        float T13 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(5.0f), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - L2) / 2.0f, this.K);
        float i11 = Utilities.i(this.K / 0.5f, 1.0f, 0.0f);
        h7 h7Var2 = this.P;
        h7Var2.a = true;
        RectF rectF = h7Var2.F;
        if (!h7Var2.p) {
            h7Var2.e = 1.0f - qvVar3.e0;
        }
        float f18 = T13 + T1;
        rectF.set(T12, T13, T12 + T1, f18);
        h7Var2.G = org.telegram.messenger.g0.N(1.33f) * this.K;
        ImageReceiver imageReceiver3 = this.r;
        imageReceiver3.setAlpha(1.0f);
        imageReceiver3.J0((int) f17);
        float f19 = T12 + f17;
        this.M = f19;
        float f20 = T13 + f17;
        this.N = f20;
        if (i7 == 0) {
            f10 = f17;
            paint.setColor(qvVar3.f(org.telegram.ui.ActionBar.j6.s8));
        } else {
            f10 = f17;
            paint.setColor(qvVar3.f(org.telegram.ui.ActionBar.j6.M8));
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
            this.S = qvVar3.n;
        }
        ArrayList arrayList = (ArrayList) s6Var.c.f(this.F);
        boolean z13 = (arrayList == null || arrayList.isEmpty()) ? false : true;
        if (z13 || (this.a0 && (gh0Var = this.S) != null && gh0Var.f < 0.98f)) {
            canvas2 = canvas;
            h7Var = h7Var2;
            ImageReceiver imageReceiver4 = imageReceiver;
            f12 = f11;
            z10 = false;
            f13 = f18;
            if (z13) {
                float f24 = 0.0f;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    f24 += ((r6) arrayList.get(i12)).h;
                }
                size = (s6Var.d + f24) / (arrayList.size() + r4);
                z11 = ((r6) i5.c.h(1, arrayList)).H;
                qvVar3.n0 = z11;
            } else {
                z11 = qvVar3.n0;
                size = 1.0f;
            }
            invalidate();
            if (this.S == null) {
                gh0 gh0Var2 = qvVar3.n;
                if (gh0Var2 != null) {
                    this.S = gh0Var2;
                } else {
                    gh0 gh0Var3 = new gh0(this);
                    this.S = gh0Var3;
                    qvVar3.n = gh0Var3;
                    gh0Var3.d(null, true, false);
                }
            }
            if (this.x) {
                canvas2.save();
                canvas2.scale(h7Var.b(), h7Var.b(), rectF.centerX(), rectF.centerY());
                imageReceiver4.A0(rectF);
                imageReceiver4.h(canvas2, null);
                canvas2.restore();
            }
            this.S.q = 0;
            Paint o4 = z11 ? l7.o(imageReceiver4) : l7.t(imageReceiver4, true);
            o4.setAlpha(ns.e4);
            gh0 gh0Var4 = this.S;
            gh0Var4.t = o4;
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
                    h7Var2.p = true;
                    h7Var2.e = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new ah.h(this, 13));
                    ofFloat.addListener(new ai.j0(this, 9));
                    qvVar2 = qvVar3;
                    ofFloat.setDuration(100L);
                    ofFloat.start();
                } else {
                    qvVar2 = qvVar3;
                }
                float f25 = d * h7Var2.e;
                h7Var2.b = !this.a0;
                qvVar = qvVar2;
                if (!this.c && qvVar.o0 <= 0.0f) {
                    if (org.telegram.messenger.g0.W1(er.g.getInterpolation(this.K), getMeasuredWidth(), org.telegram.messenger.g0.L(16.0f)) < (org.telegram.messenger.g0.N(3.5f) + f10) * 2.0f) {
                        f15 = ((float) Math.toDegrees(Math.acos((r1 / 2.0f) / r4))) * 2.0f;
                        h7Var2.f = f15;
                        h7Var2.l = this.c;
                        h7Var2.m = this.d;
                        h7Var2.u = 1.0f - f25;
                        z12 = this.G;
                        if (z12 && this.I) {
                            h7Var2.s = this.J;
                        } else {
                            h7Var2.s = 0L;
                        }
                        if (z12) {
                            h7Var = h7Var2;
                            f16 = f25;
                            imageReceiver2 = imageReceiver;
                            f12 = f11;
                            z10 = false;
                            f13 = f18;
                            zArr = null;
                            long j3 = this.F;
                            canvas2 = canvas;
                            l7.i(j3, canvas2, imageReceiver2, s6Var.K(j3), h7Var);
                        } else {
                            h7Var = h7Var2;
                            f16 = f25;
                            imageReceiver2 = imageReceiver;
                            f12 = f11;
                            z10 = false;
                            f13 = f18;
                            zArr = null;
                            canvas2 = canvas;
                            l7.i(this.F, canvas2, imageReceiver2, s6Var.J(), h7Var);
                        }
                        ImageReceiver imageReceiver5 = imageReceiver2;
                        if (f16 > 0.0f) {
                            if (l7.d == null) {
                                i10 i10Var = new i10();
                                l7.d = i10Var;
                                i10Var.a = true;
                                i10Var.b = true;
                                i10Var.c.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
                                l7.d.c.setStyle(Paint.Style.STROKE);
                                l7.d.c.setStrokeCap(Paint.Cap.ROUND);
                            }
                            int x02 = org.telegram.ui.ActionBar.j6.x0(zArr, org.telegram.ui.ActionBar.j6.ok, z10);
                            int x03 = org.telegram.ui.ActionBar.j6.x0(zArr, org.telegram.ui.ActionBar.j6.q7, z10);
                            l7.d.d(i0.a.f(0.25f, x02, x03), x03, z10 ? 1 : 0, z10 ? 1 : 0);
                            l7.d.b(imageReceiver5.L0, imageReceiver5.M0, imageReceiver5.y(), imageReceiver5.A());
                            Paint paint2 = l7.d.c;
                            paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
                            paint2.setAlpha((int) (255.0f * f16));
                            canvas2.drawCircle(f19, f20, h7Var.b() * (f10 + org.telegram.messenger.g0.L(4.0f)), paint2);
                        }
                        d = f16;
                    }
                }
                f15 = 0.0f;
                h7Var2.f = f15;
                h7Var2.l = this.c;
                h7Var2.m = this.d;
                h7Var2.u = 1.0f - f25;
                z12 = this.G;
                if (z12) {
                }
                h7Var2.s = 0L;
                if (z12) {
                }
                ImageReceiver imageReceiver52 = imageReceiver2;
                if (f16 > 0.0f) {
                }
                d = f16;
            } else {
                canvas2 = canvas;
                h7Var = h7Var2;
                qvVar = qvVar3;
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
                    Paint paint3 = qvVar.H;
                    paint3.setColor(org.telegram.ui.ActionBar.j6.r1(d, qvVar.f(org.telegram.ui.ActionBar.j6.q7)));
                    if (i7 == 0) {
                        paint.setColor(org.telegram.ui.ActionBar.j6.r1(d, qvVar.f(org.telegram.ui.ActionBar.j6.s8)));
                    } else {
                        paint.setColor(org.telegram.ui.ActionBar.j6.r1(d, qvVar.f(org.telegram.ui.ActionBar.j6.M8)));
                    }
                    float interpolation = er.k.getInterpolation(d) * org.telegram.messenger.g0.L(9.0f);
                    canvas2.drawCircle(L4, L5, org.telegram.messenger.g0.L(2.0f) + interpolation, paint);
                    canvas2.drawCircle(L4, L5, interpolation, paint3);
                    paint3.setColor(org.telegram.ui.ActionBar.j6.r1(d, qvVar.getTextColor()));
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
                this.Q = h7Var.n == 2 ? 0.7f : 1.0f;
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
            qv qvVar = this.c0;
            i iVar = qvVar.r;
            if (parent == iVar) {
                iVar.invalidate();
            } else {
                qvVar.invalidate();
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
        i7 i7Var = this.e;
        if (i7Var != null) {
            i7Var.a();
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
                TLRPC.User a22 = np.s1(i7).a2(Long.valueOf(j3));
                this.f = a22;
                this.h = null;
                chat = a22;
            } else {
                TLRPC.Chat M0 = np.s1(i7).M0(Long.valueOf(-j3));
                this.h = M0;
                this.f = null;
                chat = M0;
            }
            if (chat != null) {
                org.telegram.ui.Components.t8 t8Var = this.w;
                t8Var.p(chat);
                imageReceiver.i0(chat, t8Var, null);
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
        r6 r6Var;
        qv qvVar = this.c0;
        int i7 = qvVar.f;
        s6 s6Var = qvVar.s;
        long j10 = this.F;
        int i10 = 0;
        boolean z10 = j10 == j3;
        if (!z10 && this.e != null) {
            s6Var.h0(j10, false);
            this.e.a();
            this.e = null;
        }
        this.F = j3;
        this.G = j3 == m10.i(i7).e();
        this.H = s6Var.Q(j3);
        if (j3 > 0) {
            TLRPC.User a22 = np.s1(i7).a2(Long.valueOf(j3));
            this.f = a22;
            this.h = null;
            chat = a22;
        } else {
            TLRPC.Chat M0 = np.s1(i7).M0(Long.valueOf(-j3));
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
        org.telegram.ui.Components.t8 t8Var = this.n;
        t8Var.p(chat);
        imageReceiver.i0(chat, t8Var, null);
        if (this.O) {
            return;
        }
        this.E.i(null);
        if (s6Var.Q(j3)) {
            this.E.setTextSize(10);
            this.E.l(hd.M0(2131750845, null), false);
            this.V = false;
            return;
        }
        if (!Utilities.x(s6Var.F(j3))) {
            this.E.setTextSize(10);
            l7.a(this.E);
            this.V = true;
            return;
        }
        HashMap hashMap = (HashMap) s6Var.e.f(j3);
        if (hashMap != null && !hashMap.isEmpty()) {
            Collection values = hashMap.values();
            if (!values.isEmpty()) {
                r6Var = (r6) values.iterator().next();
                if (r6Var == null) {
                    this.E.setTextSize(10);
                    l7.a(this.E);
                    this.V = true;
                    return;
                }
                if (this.G) {
                    if (z10 && this.V && !this.O) {
                        org.telegram.ui.ActionBar.j5 j5Var = this.E;
                        b();
                        ValueAnimator valueAnimator = qvVar.k0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            qvVar.k0 = null;
                        }
                        int i11 = 2;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        qvVar.k0 = ofFloat;
                        ofFloat.addUpdateListener(new ch.v(i11, this, j5Var));
                        qvVar.k0.addListener(new ah.l(i11, this, j5Var));
                        qvVar.k0.setDuration(150L);
                        this.E.setAlpha(0.0f);
                        this.E.setTranslationY(org.telegram.messenger.g0.L(5.0f));
                        qvVar.l0 = new o(this, i10);
                    }
                    org.telegram.messenger.g0.i3(qvVar.l0, 500L);
                    this.V = false;
                    this.E.setTextSize(10);
                    this.E.l(hd.M0(2131748301, null), false);
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
                    Drawable mutate = qvVar.getContext().getDrawable(R.drawable.verified_area).mutate();
                    Drawable mutate2 = qvVar.getContext().getDrawable(R.drawable.verified_check).mutate();
                    g gVar = new g(qvVar, mutate, mutate2, mutate, mutate2);
                    gVar.x = true;
                    this.T = gVar;
                }
                this.E.l(org.telegram.messenger.j6.m(str2, this.E.getPaint().getFontMetricsInt(), false, null, 0), false);
                this.E.i(this.T);
                return;
            }
        }
        r6Var = null;
        if (r6Var == null) {
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        h7 h7Var = this.P;
        if (z10 && h7Var.H == null) {
            h7Var.H = new dc(this, 1.5f, 5.0f);
        }
        dc dcVar = h7Var.H;
        if (dcVar != null) {
            dcVar.c(z10);
        }
    }

    @Override // android.view.View
    public final void invalidate(int i7, int i10, int i11, int i12) {
        if (this.O || (this.a && getParent() != null)) {
            ViewParent parent = getParent();
            qv qvVar = this.c0;
            i iVar = qvVar.r;
            if (parent == iVar) {
                iVar.invalidate();
            }
            qvVar.invalidate();
        }
        super.invalidate(i7, i10, i11, i12);
    }
}
