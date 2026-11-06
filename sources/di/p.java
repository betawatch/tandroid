package di;

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
import bi.de;
import c8.ha;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.e10;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.xq;
import org.telegram.ui.pv;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class p extends FrameLayout {
    public org.telegram.ui.ActionBar.k5 D;
    public long E;
    public boolean F;
    public boolean G;
    public boolean H;
    public long I;
    public float J;
    public float K;
    public float L;
    public float M;
    public boolean N;
    public final n7 O;
    public float P;
    public float Q;
    public dh0 R;
    public g S;
    public final float T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean a;
    public final org.telegram.ui.Components.w5 a0;
    public int b;
    public final /* synthetic */ pv b0;
    public boolean c;
    public boolean d;
    public o7 e;
    public TLRPC.User f;
    public TLRPC.Chat h;
    public final org.telegram.ui.Components.w8 n;
    public final ImageReceiver r;
    public final ImageReceiver s;
    public final org.telegram.ui.Components.w8 w;
    public boolean x;
    public final FrameLayout y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(pv pvVar, Context context) {
        super(context);
        this.b0 = pvVar;
        this.n = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.r = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.s = imageReceiver2;
        this.w = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        this.x = true;
        n7 n7Var = new n7(null, true);
        this.O = n7Var;
        this.P = 1.0f;
        this.Q = 1.0f;
        this.T = 1.0f;
        this.a0 = new org.telegram.ui.Components.w5(this, 0L, 350L, xq.h);
        n7Var.o = pvVar.b == 1;
        n7Var.D = true;
        imageReceiver.J0 = true;
        imageReceiver.z1 = true;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.y = frameLayout;
        frameLayout.setClipChildren(false);
        if (!this.N) {
            setClipChildren(false);
        }
        b();
        addView(frameLayout, ha.c(-2.0f, -1));
        imageReceiver.J0(org.telegram.messenger.g0.L(48.0f) / 2);
        imageReceiver2.J0(org.telegram.messenger.g0.L(48.0f) / 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClipInParent(boolean z9) {
        if (getParent() != null) {
            ((ViewGroup) getParent()).setClipChildren(z9);
        }
        if (getParent() == null || getParent().getParent() == null || getParent().getParent().getParent() == null) {
            return;
        }
        ((ViewGroup) getParent().getParent().getParent()).setClipChildren(z9);
    }

    public final void b() {
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(getContext());
        this.D = k5Var;
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        this.D.setGravity(17);
        this.D.setTextSize(11);
        this.D.setTextColor(this.b0.getTextColor());
        qs.i(this.D);
        this.D.setMaxLines(1);
        this.y.addView(this.D, ha.d(-1, -2.0f, 0, 1.0f, 0.0f, 1.0f, 0.0f));
        this.r.J0(org.telegram.messenger.g0.L(48.0f) / 2);
        this.s.J0(org.telegram.messenger.g0.L(48.0f) / 2);
    }

    public final void c(Canvas canvas, float f10, float f11, float f12) {
        pv pvVar = this.b0;
        int i7 = pvVar.b;
        Paint paint = pvVar.G;
        y6 y6Var = pvVar.s;
        Paint paint2 = pvVar.H;
        Drawable drawable = pvVar.c;
        if (this.F && !y6Var.K(this.E) && Utilities.x(y6Var.F(this.E))) {
            float L = f10 + org.telegram.messenger.g0.L(16.0f);
            float L2 = f11 + org.telegram.messenger.g0.L(16.0f);
            paint.setColor(org.telegram.ui.ActionBar.k6.r1(f12, pvVar.f(org.telegram.ui.ActionBar.k6.Vl)));
            if (i7 == 0) {
                paint2.setColor(org.telegram.ui.ActionBar.k6.r1(f12, pvVar.f(org.telegram.ui.ActionBar.k6.s8)));
            } else {
                paint2.setColor(org.telegram.ui.ActionBar.k6.r1(f12, pvVar.f(org.telegram.ui.ActionBar.k6.M8)));
            }
            canvas.drawCircle(L, L2, org.telegram.messenger.g0.L(11.0f), paint2);
            canvas.drawCircle(L, L2, org.telegram.messenger.g0.L(9.0f), paint);
            int f13 = pvVar.f(i7 == 0 ? org.telegram.ui.ActionBar.k6.s8 : org.telegram.ui.ActionBar.k6.M8);
            if (f13 != pvVar.e) {
                pvVar.e = f13;
                drawable.setColorFilter(new PorterDuffColorFilter(f13, PorterDuff.Mode.MULTIPLY));
            }
            drawable.setAlpha((int) (f12 * 255.0f));
            drawable.setBounds((int) (L - (drawable.getIntrinsicWidth() / 2.0f)), (int) (L2 - (drawable.getIntrinsicHeight() / 2.0f)), (int) ((drawable.getIntrinsicWidth() / 2.0f) + L), (int) ((drawable.getIntrinsicHeight() / 2.0f) + L2));
            drawable.draw(canvas);
        }
    }

    public final void d(float f10, float f11, float f12, boolean z9) {
        float f13 = this.J;
        pv pvVar = this.b0;
        if (f13 != f10 || this.K != f11 || 0.0f != f12 || this.V != z9) {
            this.V = z9;
            this.J = f10;
            this.K = f11;
            invalidate();
            pvVar.h.invalidate();
        }
        float i7 = this.N ? 0.0f : 1.0f - Utilities.i(pvVar.N / pvVar.B0, 1.0f, 0.0f);
        this.Q = i7;
        float f14 = i7 * this.P;
        FrameLayout frameLayout = this.y;
        frameLayout.setAlpha(f14);
        frameLayout.setVisibility(f14 > 0.0f ? 0 : 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x020b  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        ImageReceiver imageReceiver;
        float f11;
        Canvas canvas2;
        n7 n7Var;
        float f12;
        boolean z9;
        float f13;
        float size;
        boolean z10;
        float f14;
        pv pvVar;
        pv pvVar2;
        float f15;
        boolean z11;
        float f16;
        ImageReceiver imageReceiver2;
        boolean[] zArr;
        dh0 dh0Var;
        float L = org.telegram.messenger.g0.L(48.0f);
        float L2 = org.telegram.messenger.g0.L(26.33f);
        float L3 = org.telegram.messenger.g0.L(8.0f);
        pv pvVar3 = this.b0;
        int i7 = pvVar3.b;
        y6 y6Var = pvVar3.s;
        Paint paint = pvVar3.H;
        float i10 = Utilities.i(pvVar3.n0 / 0.5f, 1.0f, 0.0f) * L3;
        if (this.V) {
            i10 += Utilities.i((pvVar3.n0 - 0.5f) / 0.5f, 1.0f, 0.0f) * org.telegram.messenger.g0.L(16.0f);
        }
        float T1 = org.telegram.messenger.g0.T1(L + i10, L2, this.J);
        float f17 = T1 / 2.0f;
        float measuredWidth = (getMeasuredWidth() / 2.0f) - f17;
        float T12 = org.telegram.messenger.g0.T1(measuredWidth, 0.0f, this.J);
        float T13 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(5.0f), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - L2) / 2.0f, this.J);
        float i11 = Utilities.i(this.J / 0.5f, 1.0f, 0.0f);
        n7 n7Var2 = this.O;
        n7Var2.a = true;
        RectF rectF = n7Var2.F;
        if (!n7Var2.p) {
            n7Var2.e = 1.0f - pvVar3.d0;
        }
        float f18 = T13 + T1;
        rectF.set(T12, T13, T12 + T1, f18);
        n7Var2.G = org.telegram.messenger.g0.N(1.33f) * this.J;
        ImageReceiver imageReceiver3 = this.r;
        imageReceiver3.setAlpha(1.0f);
        imageReceiver3.J0((int) f17);
        float f19 = T12 + f17;
        this.L = f19;
        float f20 = T13 + f17;
        this.M = f20;
        if (i7 == 0) {
            f10 = f17;
            paint.setColor(pvVar3.f(org.telegram.ui.ActionBar.k6.s8));
        } else {
            f10 = f17;
            paint.setColor(pvVar3.f(org.telegram.ui.ActionBar.k6.M8));
        }
        if (this.J != 0.0f) {
            imageReceiver = imageReceiver3;
            f11 = T12;
            canvas.drawCircle(this.L, this.M, org.telegram.messenger.g0.N(1.5f) + f10, paint);
        } else {
            imageReceiver = imageReceiver3;
            f11 = T12;
        }
        canvas.save();
        float f21 = this.L;
        float f22 = this.M;
        float f23 = this.T;
        canvas.scale(f23, f23, f21, f22);
        if (this.R == null) {
            this.R = pvVar3.n;
        }
        ArrayList arrayList = (ArrayList) y6Var.c.f(this.E);
        boolean z12 = (arrayList == null || arrayList.isEmpty()) ? false : true;
        if (z12 || (this.W && (dh0Var = this.R) != null && dh0Var.f < 0.98f)) {
            canvas2 = canvas;
            n7Var = n7Var2;
            ImageReceiver imageReceiver4 = imageReceiver;
            f12 = f11;
            z9 = false;
            f13 = f18;
            if (z12) {
                float f24 = 0.0f;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    f24 += ((x6) arrayList.get(i12)).h;
                }
                size = (y6Var.d + f24) / (arrayList.size() + r4);
                z10 = ((x6) jg.g.i(1, arrayList)).G;
                pvVar3.m0 = z10;
            } else {
                z10 = pvVar3.m0;
                size = 1.0f;
            }
            invalidate();
            if (this.R == null) {
                dh0 dh0Var2 = pvVar3.n;
                if (dh0Var2 != null) {
                    this.R = dh0Var2;
                } else {
                    dh0 dh0Var3 = new dh0(this);
                    this.R = dh0Var3;
                    pvVar3.n = dh0Var3;
                    dh0Var3.d(null, true, false);
                }
            }
            if (this.x) {
                canvas2.save();
                canvas2.scale(n7Var.b(), n7Var.b(), rectF.centerX(), rectF.centerY());
                imageReceiver4.A0(rectF);
                imageReceiver4.h(canvas2, null);
                canvas2.restore();
            }
            this.R.q = 0;
            Paint o4 = z10 ? r7.o(imageReceiver4) : r7.t(imageReceiver4, true);
            o4.setAlpha(qs.e4);
            dh0 dh0Var4 = this.R;
            dh0Var4.t = o4;
            dh0Var4.f((int) (imageReceiver4.K0 - org.telegram.messenger.g0.L(3.0f)), (int) (imageReceiver4.L0 - org.telegram.messenger.g0.L(3.0f)), (int) (imageReceiver4.y() + org.telegram.messenger.g0.L(3.0f)), (int) (imageReceiver4.A() + org.telegram.messenger.g0.L(3.0f)));
            this.R.e(this.W, Utilities.i(size, 1.0f, 0.0f));
            if (imageReceiver4.Q0) {
                this.R.a(canvas2);
            }
            this.W = true;
            invalidate();
        } else {
            float d = this.a0.d(this.G);
            if (this.x) {
                if (this.W) {
                    n7Var2.p = true;
                    n7Var2.e = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new ah.h(this, 12));
                    ofFloat.addListener(new bi.t5(this, 7));
                    pvVar2 = pvVar3;
                    ofFloat.setDuration(100L);
                    ofFloat.start();
                } else {
                    pvVar2 = pvVar3;
                }
                float f25 = d * n7Var2.e;
                n7Var2.b = !this.W;
                pvVar = pvVar2;
                if (!this.c && pvVar.n0 <= 0.0f) {
                    if (org.telegram.messenger.g0.W1(xq.g.getInterpolation(this.J), getMeasuredWidth(), org.telegram.messenger.g0.L(16.0f)) < (org.telegram.messenger.g0.N(3.5f) + f10) * 2.0f) {
                        f15 = ((float) Math.toDegrees(Math.acos((r1 / 2.0f) / r4))) * 2.0f;
                        n7Var2.f = f15;
                        n7Var2.l = this.c;
                        n7Var2.m = this.d;
                        n7Var2.u = 1.0f - f25;
                        z11 = this.F;
                        if (z11 && this.H) {
                            n7Var2.s = this.I;
                        } else {
                            n7Var2.s = 0L;
                        }
                        if (z11) {
                            n7Var = n7Var2;
                            f16 = f25;
                            imageReceiver2 = imageReceiver;
                            f12 = f11;
                            z9 = false;
                            f13 = f18;
                            zArr = null;
                            long j3 = this.E;
                            canvas2 = canvas;
                            r7.i(j3, canvas2, imageReceiver2, y6Var.K(j3), n7Var);
                        } else {
                            n7Var = n7Var2;
                            f16 = f25;
                            imageReceiver2 = imageReceiver;
                            f12 = f11;
                            z9 = false;
                            f13 = f18;
                            zArr = null;
                            canvas2 = canvas;
                            r7.i(this.E, canvas2, imageReceiver2, y6Var.J(), n7Var);
                        }
                        ImageReceiver imageReceiver5 = imageReceiver2;
                        if (f16 > 0.0f) {
                            if (r7.d == null) {
                                e10 e10Var = new e10();
                                r7.d = e10Var;
                                e10Var.a = true;
                                e10Var.b = true;
                                e10Var.c.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
                                r7.d.c.setStyle(Paint.Style.STROKE);
                                r7.d.c.setStrokeCap(Paint.Cap.ROUND);
                            }
                            int x02 = org.telegram.ui.ActionBar.k6.x0(zArr, org.telegram.ui.ActionBar.k6.lk, z9);
                            int x03 = org.telegram.ui.ActionBar.k6.x0(zArr, org.telegram.ui.ActionBar.k6.q7, z9);
                            r7.d.d(i0.a.f(0.25f, x02, x03), x03, z9 ? 1 : 0, z9 ? 1 : 0);
                            r7.d.b(imageReceiver5.K0, imageReceiver5.L0, imageReceiver5.y(), imageReceiver5.A());
                            Paint paint2 = r7.d.c;
                            paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
                            paint2.setAlpha((int) (255.0f * f16));
                            canvas2.drawCircle(f19, f20, n7Var.b() * (f10 + org.telegram.messenger.g0.L(4.0f)), paint2);
                        }
                        d = f16;
                    }
                }
                f15 = 0.0f;
                n7Var2.f = f15;
                n7Var2.l = this.c;
                n7Var2.m = this.d;
                n7Var2.u = 1.0f - f25;
                z11 = this.F;
                if (z11) {
                }
                n7Var2.s = 0L;
                if (z11) {
                }
                ImageReceiver imageReceiver52 = imageReceiver2;
                if (f16 > 0.0f) {
                }
                d = f16;
            } else {
                canvas2 = canvas;
                n7Var = n7Var2;
                pvVar = pvVar3;
                f13 = f18;
                f12 = f11;
                z9 = false;
            }
            this.W = z9;
            if (this.x) {
                canvas2.save();
                float f26 = 1.0f - i11;
                canvas2.scale(f26, f26, this.L + org.telegram.messenger.g0.L(16.0f), this.M + org.telegram.messenger.g0.L(16.0f));
                c(canvas2, this.L, this.M, 1.0f);
                float f27 = this.L;
                float f28 = this.M;
                if (d > 0.0f) {
                    float L4 = f27 + org.telegram.messenger.g0.L(17.0f);
                    float L5 = f28 + org.telegram.messenger.g0.L(17.0f);
                    Paint paint3 = pvVar.G;
                    paint3.setColor(org.telegram.ui.ActionBar.k6.r1(d, pvVar.f(org.telegram.ui.ActionBar.k6.q7)));
                    if (i7 == 0) {
                        paint.setColor(org.telegram.ui.ActionBar.k6.r1(d, pvVar.f(org.telegram.ui.ActionBar.k6.s8)));
                    } else {
                        paint.setColor(org.telegram.ui.ActionBar.k6.r1(d, pvVar.f(org.telegram.ui.ActionBar.k6.M8)));
                    }
                    float interpolation = xq.k.getInterpolation(d) * org.telegram.messenger.g0.L(9.0f);
                    canvas2.drawCircle(L4, L5, org.telegram.messenger.g0.L(2.0f) + interpolation, paint);
                    canvas2.drawCircle(L4, L5, interpolation, paint3);
                    paint3.setColor(org.telegram.ui.ActionBar.k6.r1(d, pvVar.getTextColor()));
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
        if (!this.H || this.K <= 0.0f) {
            f14 = f12;
        } else {
            ImageReceiver imageReceiver6 = this.s;
            f14 = f12;
            imageReceiver6.y0(f14, T13, T1, T1);
            imageReceiver6.setAlpha(this.K);
            imageReceiver6.h(canvas2, null);
        }
        float L6 = ((1.0f - this.J) * org.telegram.messenger.g0.L(7.0f)) + f13;
        FrameLayout frameLayout = this.y;
        frameLayout.setTranslationY(L6);
        frameLayout.setTranslationX(f14 - measuredWidth);
        if (!this.N) {
            if (this.F) {
                this.P = 1.0f;
            } else {
                this.P = n7Var.n == 2 ? 0.7f : 1.0f;
            }
            float f29 = this.Q * this.P;
            frameLayout.setAlpha(f29);
            frameLayout.setVisibility(f29 > 0.0f ? z9 : 4);
        }
        super.dispatchDraw(canvas);
    }

    public float getCy() {
        float L = org.telegram.messenger.g0.L(48.0f);
        float L2 = org.telegram.messenger.g0.L(26.33f);
        return org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(5.0f), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - L2) / 2.0f, this.b0.c0) + (org.telegram.messenger.g0.T1(L, L2, this.J) / 2.0f);
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.N || (this.a && getParent() != null)) {
            ViewParent parent = getParent();
            pv pvVar = this.b0;
            i iVar = pvVar.r;
            if (parent == iVar) {
                iVar.invalidate();
            } else {
                pvVar.invalidate();
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
        this.O.g();
        o7 o7Var = this.e;
        if (o7Var != null) {
            o7Var.a();
            this.e = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.N ? org.telegram.messenger.g0.L(70.0f) : this.b0.M, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(81.0f), TLObject.FLAG_30));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCrossfadeTo(long j3) {
        TLRPC.Chat chat;
        int i7 = this.b0.f;
        if (this.I != j3) {
            this.I = j3;
            boolean z9 = j3 != -1;
            this.H = z9;
            ImageReceiver imageReceiver = this.s;
            if (!z9) {
                imageReceiver.f();
                return;
            }
            if (j3 > 0) {
                TLRPC.User a22 = qp.s1(i7).a2(Long.valueOf(j3));
                this.f = a22;
                this.h = null;
                chat = a22;
            } else {
                TLRPC.Chat M0 = qp.s1(i7).M0(Long.valueOf(-j3));
                this.h = M0;
                this.f = null;
                chat = M0;
            }
            if (chat != null) {
                org.telegram.ui.Components.w8 w8Var = this.w;
                w8Var.p(chat);
                imageReceiver.i0(chat, w8Var, null);
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
        x6 x6Var;
        pv pvVar = this.b0;
        int i7 = pvVar.f;
        y6 y6Var = pvVar.s;
        long j10 = this.E;
        int i10 = 0;
        boolean z9 = j10 == j3;
        if (!z9 && this.e != null) {
            y6Var.h0(j10, false);
            this.e.a();
            this.e = null;
        }
        this.E = j3;
        this.F = j3 == p10.i(i7).e();
        this.G = y6Var.Q(j3);
        if (j3 > 0) {
            TLRPC.User a22 = qp.s1(i7).a2(Long.valueOf(j3));
            this.f = a22;
            this.h = null;
            chat = a22;
        } else {
            TLRPC.Chat M0 = qp.s1(i7).M0(Long.valueOf(-j3));
            this.h = M0;
            this.f = null;
            chat = M0;
        }
        ImageReceiver imageReceiver = this.r;
        if (chat == null) {
            this.D.l("", false);
            imageReceiver.f();
            return;
        }
        org.telegram.ui.Components.w8 w8Var = this.n;
        w8Var.p(chat);
        imageReceiver.i0(chat, w8Var, null);
        if (this.N) {
            return;
        }
        this.D.i(null);
        if (y6Var.Q(j3)) {
            this.D.setTextSize(10);
            this.D.l(hd.M0(2131750846, null), false);
            this.U = false;
            return;
        }
        if (!Utilities.x(y6Var.F(j3))) {
            this.D.setTextSize(10);
            r7.a(this.D);
            this.U = true;
            return;
        }
        HashMap hashMap = (HashMap) y6Var.e.f(j3);
        if (hashMap != null && !hashMap.isEmpty()) {
            Collection values = hashMap.values();
            if (!values.isEmpty()) {
                x6Var = (x6) values.iterator().next();
                if (x6Var == null) {
                    this.D.setTextSize(10);
                    r7.a(this.D);
                    this.U = true;
                    return;
                }
                if (this.F) {
                    if (z9 && this.U && !this.N) {
                        org.telegram.ui.ActionBar.k5 k5Var = this.D;
                        b();
                        ValueAnimator valueAnimator = pvVar.j0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            pvVar.j0 = null;
                        }
                        int i11 = 2;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        pvVar.j0 = ofFloat;
                        ofFloat.addUpdateListener(new de(i11, this, k5Var));
                        pvVar.j0.addListener(new ah.l(i11, this, k5Var));
                        pvVar.j0.setDuration(150L);
                        this.D.setAlpha(0.0f);
                        this.D.setTranslationY(org.telegram.messenger.g0.L(5.0f));
                        pvVar.k0 = new o(this, i10);
                    }
                    org.telegram.messenger.g0.i3(pvVar.k0, 500L);
                    this.U = false;
                    this.D.setTextSize(10);
                    this.D.l(hd.M0(2131748300, null), false);
                    return;
                }
                if (this.f == null) {
                    this.D.setTextSize(11);
                    this.D.l(org.telegram.messenger.i6.m(this.h.title, this.D.getPaint().getFontMetricsInt(), false, null, 0), false);
                    this.D.i(null);
                    return;
                }
                this.D.setTextSize(11);
                String str = this.f.first_name;
                String trim = str != null ? str.trim() : "";
                int indexOf = trim.indexOf(" ");
                if (indexOf > 0) {
                    trim = trim.substring(0, indexOf);
                }
                String str2 = trim;
                if (!this.f.verified) {
                    this.D.l(org.telegram.messenger.i6.m(str2, this.D.getPaint().getFontMetricsInt(), false, null, 0), false);
                    this.D.i(null);
                    return;
                }
                if (this.S == null) {
                    Drawable mutate = pvVar.getContext().getDrawable(R.drawable.verified_area).mutate();
                    Drawable mutate2 = pvVar.getContext().getDrawable(R.drawable.verified_check).mutate();
                    g gVar = new g(pvVar, mutate, mutate2, mutate, mutate2);
                    gVar.x = true;
                    this.S = gVar;
                }
                this.D.l(org.telegram.messenger.i6.m(str2, this.D.getPaint().getFontMetricsInt(), false, null, 0), false);
                this.D.i(this.S);
                return;
            }
        }
        x6Var = null;
        if (x6Var == null) {
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z9) {
        super.setPressed(z9);
        n7 n7Var = this.O;
        if (z9 && n7Var.H == null) {
            n7Var.H = new ic(this, 1.5f, 5.0f);
        }
        ic icVar = n7Var.H;
        if (icVar != null) {
            icVar.c(z9);
        }
    }

    @Override // android.view.View
    public final void invalidate(int i7, int i10, int i11, int i12) {
        if (this.N || (this.a && getParent() != null)) {
            ViewParent parent = getParent();
            pv pvVar = this.b0;
            i iVar = pvVar.r;
            if (parent == iVar) {
                iVar.invalidate();
            }
            pvVar.invalidate();
        }
        super.invalidate(i7, i10, i11, i12);
    }
}
