package org.telegram.ui.Wallet;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.di;
import org.telegram.ui.an;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class n6 {
    public final ViewGroup a;
    public final View b;
    public final di c;
    public final v6 d;
    public final an e;
    public final TL_wallet.walletTransaction f;
    public final Runnable g;
    public final k6 h;
    public final v6 i;
    public final o9 j = new o9();
    public final PathInterpolator k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float l;
    public final AnimatorSet m;
    public final RectF n;
    public final RectF o;
    public org.telegram.ui.Cells.t0 p;
    public final l6 q;
    public float r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public final long w;
    public final j6 x;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Runnable, org.telegram.ui.Wallet.j6] */
    /* JADX WARN: Type inference failed for: r7v0, types: [org.telegram.ui.Wallet.j6] */
    public n6(ViewGroup viewGroup, View view, v6 v6Var, an anVar, TL_wallet.walletTransaction wallettransaction, Runnable runnable, di diVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.m = animatorSet;
        this.o = new RectF();
        this.w = SystemClock.uptimeMillis();
        final int i7 = 0;
        ?? r12 = new Runnable(this) { // from class: org.telegram.ui.Wallet.j6
            public final /* synthetic */ n6 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        n6 n6Var = this.b;
                        v6 v6Var2 = n6Var.d;
                        float f10 = n6Var.l;
                        ViewGroup viewGroup2 = n6Var.a;
                        l6 l6Var = n6Var.q;
                        AnimatorSet animatorSet2 = n6Var.m;
                        v6 v6Var3 = n6Var.i;
                        RectF rectF = n6Var.o;
                        RectF rectF2 = n6Var.n;
                        if (!n6Var.v && !n6Var.u) {
                            n6Var.e();
                            n6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.t0 I8 = n6Var.e.I8(n6Var.f);
                            if (I8 != null && I8.getWidth() > 0) {
                                org.telegram.ui.Cells.t0 t0Var = n6Var.p;
                                if (t0Var != I8) {
                                    if (t0Var != null) {
                                        t0Var.I0.i(false);
                                    }
                                    n6Var.p = I8;
                                }
                                b4 b4Var = n6Var.p.I0.m;
                                if (n6Var.t && l6Var.n && b4Var != null && b4Var.n && b4Var.getWidth() > 0 && !n6Var.p.isLayoutRequested()) {
                                    rectF.set(n6Var.c(b4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f10 > 0.01f) {
                                        n6Var.u = true;
                                        n6Var.p.I0.i(true);
                                        v6Var3.f(v6Var2);
                                        v6Var3.setAlpha(f10);
                                        v6Var2.setAlpha(0.0f);
                                        n6Var.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    } else {
                                        rectF.setEmpty();
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - n6Var.w <= 700 && !n6Var.s && viewGroup2.isAttachedToWindow()) {
                                n6Var.h.postOnAnimation(n6Var.x);
                                break;
                            } else {
                                n6Var.u = true;
                                v6Var3.setAlpha(0.0f);
                                l6Var.setAlpha(0.0f);
                                animatorSet2.setDuration(180L);
                                animatorSet2.start();
                                break;
                            }
                        }
                        break;
                    case 1:
                        this.b.d();
                        break;
                    default:
                        this.b.t = true;
                        break;
                }
            }
        };
        this.x = r12;
        this.c = diVar;
        this.a = viewGroup;
        this.b = view;
        this.d = v6Var;
        this.l = v6Var.getAlpha();
        this.e = anVar;
        this.f = wallettransaction;
        this.g = runnable;
        RectF a10 = aa.a(v6Var, viewGroup);
        this.n = a10;
        e();
        k6 k6Var = new k6(this, viewGroup.getContext());
        this.h = k6Var;
        k6Var.setClipChildren(false);
        k6Var.setClipToPadding(false);
        final int i10 = 1;
        k6Var.setClickable(true);
        v6 v6Var2 = new v6(60, viewGroup.getContext(), true);
        this.i = v6Var2;
        v6Var2.setContinuousRotation(540.0f);
        v6Var2.f(v6Var);
        v6Var2.setAlpha(0.0f);
        k6Var.addView(v6Var2, c8.ha.e(60, 60, 51));
        l6 l6Var = new l6(this, viewGroup.getContext(), new Runnable(this) { // from class: org.telegram.ui.Wallet.j6
            public final /* synthetic */ n6 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        n6 n6Var = this.b;
                        v6 v6Var22 = n6Var.d;
                        float f10 = n6Var.l;
                        ViewGroup viewGroup2 = n6Var.a;
                        l6 l6Var2 = n6Var.q;
                        AnimatorSet animatorSet2 = n6Var.m;
                        v6 v6Var3 = n6Var.i;
                        RectF rectF = n6Var.o;
                        RectF rectF2 = n6Var.n;
                        if (!n6Var.v && !n6Var.u) {
                            n6Var.e();
                            n6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.t0 I8 = n6Var.e.I8(n6Var.f);
                            if (I8 != null && I8.getWidth() > 0) {
                                org.telegram.ui.Cells.t0 t0Var = n6Var.p;
                                if (t0Var != I8) {
                                    if (t0Var != null) {
                                        t0Var.I0.i(false);
                                    }
                                    n6Var.p = I8;
                                }
                                b4 b4Var = n6Var.p.I0.m;
                                if (n6Var.t && l6Var2.n && b4Var != null && b4Var.n && b4Var.getWidth() > 0 && !n6Var.p.isLayoutRequested()) {
                                    rectF.set(n6Var.c(b4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f10 > 0.01f) {
                                        n6Var.u = true;
                                        n6Var.p.I0.i(true);
                                        v6Var3.f(v6Var22);
                                        v6Var3.setAlpha(f10);
                                        v6Var22.setAlpha(0.0f);
                                        n6Var.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    } else {
                                        rectF.setEmpty();
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - n6Var.w <= 700 && !n6Var.s && viewGroup2.isAttachedToWindow()) {
                                n6Var.h.postOnAnimation(n6Var.x);
                                break;
                            } else {
                                n6Var.u = true;
                                v6Var3.setAlpha(0.0f);
                                l6Var2.setAlpha(0.0f);
                                animatorSet2.setDuration(180L);
                                animatorSet2.start();
                                break;
                            }
                        }
                        break;
                    case 1:
                        this.b.d();
                        break;
                    default:
                        this.b.t = true;
                        break;
                }
            }
        });
        this.q = l6Var;
        l6Var.setAlpha(0.001f);
        l6Var.setPaused(false);
        k6Var.addView(l6Var, c8.ha.e(60, 60, 51));
        viewGroup.addView(k6Var, new ViewGroup.LayoutParams(-1, -1));
        b(a10.centerX(), a10.centerY(), a10.width());
        final int i11 = 2;
        v6Var2.l(new Runnable(this) { // from class: org.telegram.ui.Wallet.j6
            public final /* synthetic */ n6 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        n6 n6Var = this.b;
                        v6 v6Var22 = n6Var.d;
                        float f10 = n6Var.l;
                        ViewGroup viewGroup2 = n6Var.a;
                        l6 l6Var2 = n6Var.q;
                        AnimatorSet animatorSet2 = n6Var.m;
                        v6 v6Var3 = n6Var.i;
                        RectF rectF = n6Var.o;
                        RectF rectF2 = n6Var.n;
                        if (!n6Var.v && !n6Var.u) {
                            n6Var.e();
                            n6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.t0 I8 = n6Var.e.I8(n6Var.f);
                            if (I8 != null && I8.getWidth() > 0) {
                                org.telegram.ui.Cells.t0 t0Var = n6Var.p;
                                if (t0Var != I8) {
                                    if (t0Var != null) {
                                        t0Var.I0.i(false);
                                    }
                                    n6Var.p = I8;
                                }
                                b4 b4Var = n6Var.p.I0.m;
                                if (n6Var.t && l6Var2.n && b4Var != null && b4Var.n && b4Var.getWidth() > 0 && !n6Var.p.isLayoutRequested()) {
                                    rectF.set(n6Var.c(b4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f10 > 0.01f) {
                                        n6Var.u = true;
                                        n6Var.p.I0.i(true);
                                        v6Var3.f(v6Var22);
                                        v6Var3.setAlpha(f10);
                                        v6Var22.setAlpha(0.0f);
                                        n6Var.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    } else {
                                        rectF.setEmpty();
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - n6Var.w <= 700 && !n6Var.s && viewGroup2.isAttachedToWindow()) {
                                n6Var.h.postOnAnimation(n6Var.x);
                                break;
                            } else {
                                n6Var.u = true;
                                v6Var3.setAlpha(0.0f);
                                l6Var2.setAlpha(0.0f);
                                animatorSet2.setDuration(180L);
                                animatorSet2.start();
                                break;
                            }
                        }
                        break;
                    case 1:
                        this.b.d();
                        break;
                    default:
                        this.b.t = true;
                        break;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new q3(this, 3));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new m6(this, diVar, v6Var));
        k6Var.post(r12);
    }

    public final void a(boolean z9) {
        if (this.v) {
            return;
        }
        this.v = true;
        j6 j6Var = this.x;
        k6 k6Var = this.h;
        k6Var.removeCallbacks(j6Var);
        v6 v6Var = this.i;
        v6Var.l(null);
        org.telegram.ui.Cells.t0 t0Var = this.p;
        if (t0Var != null) {
            t0Var.I0.i(false);
            if (z9 && this.r >= 1.0f) {
                RectF rectF = this.o;
                if (!rectF.isEmpty() && this.p.isAttachedToWindow() && m0.I(this.p.getMessageObject(), this.f)) {
                    float centerY = (((rectF.centerY() - (Math.min(this.n.centerY(), rectF.centerY()) - org.telegram.messenger.g0.L(150.0f))) * 2.0f) / 0.6f) / org.telegram.messenger.g0.p;
                    c4 c4Var = this.p.I0;
                    c4Var.l();
                    r1.g gVar = new r1.g(new r1.f(0.0f));
                    c4Var.b0 = gVar;
                    r1.h hVar = new r1.h(0.0f);
                    hVar.a(0.65f);
                    hVar.b(200.0f);
                    gVar.m = hVar;
                    c4Var.b0.f(0.001f);
                    c4Var.b0.a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                    c4Var.b0.b(new w3(c4Var, 1));
                    c4Var.b0.h();
                }
            }
        }
        l6 l6Var = this.q;
        l6Var.setPaused(true);
        k6Var.removeView(l6Var);
        v6Var.setPaused(true);
        k6Var.removeView(v6Var);
        k6Var.setClickable(false);
        this.d.setAlpha(this.l);
        di diVar = this.c;
        if (diVar == null) {
            this.b.setTranslationY(0.0f);
        } else {
            diVar.x1(1.0f);
        }
        ViewGroup viewGroup = this.a;
        if (diVar != null && z9 && this.j.d()) {
            an anVar = this.e;
            if (anVar.getParentLayout() != null) {
                ViewGroup view = anVar.getParentLayout().getView();
                if (view.isAttachedToWindow()) {
                    viewGroup.getLocationOnScreen(new int[2]);
                    view.getLocationOnScreen(new int[2]);
                    viewGroup.removeView(k6Var);
                    k6Var.setTranslationX(r4[0] - r1[0]);
                    k6Var.setTranslationY(r4[1] - r1[1]);
                    view.addView(k6Var, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.g.run();
        org.telegram.messenger.g0.i3(new n(17, this, viewGroup), 650L);
    }

    public final void b(float f10, float f11, float f12) {
        float L = org.telegram.messenger.g0.L(60.0f);
        k6 k6Var = this.h;
        float f13 = L / 2.0f;
        v6 v6Var = this.i;
        v6Var.setTranslationX((f10 - k6Var.getLeft()) - f13);
        v6Var.setTranslationY((f11 - k6Var.getTop()) - f13);
        float f14 = f12 / L;
        v6Var.setScaleX(f14);
        v6Var.setScaleY(f14);
        float translationX = v6Var.getTranslationX();
        l6 l6Var = this.q;
        l6Var.setTranslationX(translationX);
        l6Var.setTranslationY(v6Var.getTranslationY());
        l6Var.setScaleX(f14);
        l6Var.setScaleY(f14);
    }

    public final RectF c(b4 b4Var) {
        di diVar = this.c;
        ViewGroup viewGroup = this.a;
        if (diVar == null) {
            return aa.a(b4Var, viewGroup);
        }
        ViewGroup viewGroup2 = (ViewGroup) b4Var.getRootView();
        RectF a10 = aa.a(b4Var, viewGroup2);
        int[] iArr = new int[2];
        viewGroup2.getLocationOnScreen(iArr);
        a10.offset(iArr[0], iArr[1]);
        viewGroup.getLocationOnScreen(iArr);
        a10.offset(-iArr[0], -iArr[1]);
        return a10;
    }

    public final void d() {
        l6 l6Var = this.q;
        if (l6Var == null) {
            return;
        }
        v6 v6Var = this.i;
        float flightYaw = v6Var.getFlightYaw();
        float flightPitch = v6Var.getFlightPitch();
        if (this.p != null) {
            float max = Math.max(0.0f, Math.min(1.0f, (this.r - 0.55f) / 0.45f));
            float C = com.google.android.recaptcha.internal.a.C(max, 2.0f, 3.0f, max * max);
            flightYaw += ((float) Math.IEEEremainder(this.p.I0.g() - flightYaw, 6.283185307179586d)) * C;
            flightPitch += ((this.p.I0.k.E * 0.14f) - flightPitch) * C;
        }
        l6Var.r = flightYaw;
        l6Var.s = flightPitch;
        l6Var.w = true;
        l6Var.x = true;
    }

    public final void e() {
        v6 v6Var = this.d;
        if (v6Var.isAttachedToWindow()) {
            View rootView = v6Var.getRootView();
            ViewGroup viewGroup = this.a;
            if (rootView != viewGroup.getRootView()) {
                return;
            }
            di diVar = this.c;
            RectF rectF = this.n;
            if (diVar == null) {
                aa.f(v6Var, this.b, viewGroup, rectF);
            } else {
                rectF.set(aa.a(v6Var, viewGroup));
                rectF.offset(0.0f, diVar.f4 - diVar.p2);
            }
        }
    }
}
