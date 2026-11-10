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
import org.telegram.ui.Components.ci;
import org.telegram.ui.cn;
import org.telegram.ui.sb1;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class p6 {
    public final ViewGroup a;
    public final View b;
    public final ci c;
    public final x6 d;
    public final cn e;
    public final TL_wallet.walletTransaction f;
    public final Runnable g;
    public final m6 h;
    public final x6 i;
    public final q9 j = new q9();
    public final PathInterpolator k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float l;
    public final AnimatorSet m;
    public final RectF n;
    public final RectF o;
    public org.telegram.ui.Cells.t0 p;
    public final n6 q;
    public float r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public final long w;
    public final l6 x;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Runnable, org.telegram.ui.Wallet.l6] */
    /* JADX WARN: Type inference failed for: r7v0, types: [org.telegram.ui.Wallet.l6] */
    public p6(ViewGroup viewGroup, View view, x6 x6Var, cn cnVar, TL_wallet.walletTransaction wallettransaction, Runnable runnable, ci ciVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.m = animatorSet;
        this.o = new RectF();
        this.w = SystemClock.uptimeMillis();
        final int i7 = 0;
        ?? r12 = new Runnable(this) { // from class: org.telegram.ui.Wallet.l6
            public final /* synthetic */ p6 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        p6 p6Var = this.b;
                        x6 x6Var2 = p6Var.d;
                        float f10 = p6Var.l;
                        ViewGroup viewGroup2 = p6Var.a;
                        n6 n6Var = p6Var.q;
                        AnimatorSet animatorSet2 = p6Var.m;
                        x6 x6Var3 = p6Var.i;
                        RectF rectF = p6Var.o;
                        RectF rectF2 = p6Var.n;
                        if (!p6Var.v && !p6Var.u) {
                            p6Var.e();
                            p6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.t0 J8 = p6Var.e.J8(p6Var.f);
                            if (J8 != null && J8.getWidth() > 0) {
                                org.telegram.ui.Cells.t0 t0Var = p6Var.p;
                                if (t0Var != J8) {
                                    if (t0Var != null) {
                                        t0Var.I0.i(false);
                                    }
                                    p6Var.p = J8;
                                }
                                c4 c4Var = p6Var.p.I0.m;
                                if (p6Var.t && n6Var.n && c4Var != null && c4Var.n && c4Var.getWidth() > 0 && !p6Var.p.isLayoutRequested()) {
                                    rectF.set(p6Var.c(c4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f10 > 0.01f) {
                                        p6Var.u = true;
                                        p6Var.p.I0.i(true);
                                        x6Var3.f(x6Var2);
                                        x6Var3.setAlpha(f10);
                                        x6Var2.setAlpha(0.0f);
                                        p6Var.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    } else {
                                        rectF.setEmpty();
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - p6Var.w <= 700 && !p6Var.s && viewGroup2.isAttachedToWindow()) {
                                p6Var.h.postOnAnimation(p6Var.x);
                                break;
                            } else {
                                p6Var.u = true;
                                x6Var3.setAlpha(0.0f);
                                n6Var.setAlpha(0.0f);
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
        this.c = ciVar;
        this.a = viewGroup;
        this.b = view;
        this.d = x6Var;
        this.l = x6Var.getAlpha();
        this.e = cnVar;
        this.f = wallettransaction;
        this.g = runnable;
        RectF a10 = ca.a(x6Var, viewGroup);
        this.n = a10;
        e();
        m6 m6Var = new m6(this, viewGroup.getContext());
        this.h = m6Var;
        m6Var.setClipChildren(false);
        m6Var.setClipToPadding(false);
        final int i10 = 1;
        m6Var.setClickable(true);
        x6 x6Var2 = new x6(60, viewGroup.getContext(), true);
        this.i = x6Var2;
        x6Var2.setContinuousRotation(540.0f);
        x6Var2.f(x6Var);
        x6Var2.setAlpha(0.0f);
        m6Var.addView(x6Var2, c8.ha.e(60, 60, 51));
        n6 n6Var = new n6(this, viewGroup.getContext(), new Runnable(this) { // from class: org.telegram.ui.Wallet.l6
            public final /* synthetic */ p6 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        p6 p6Var = this.b;
                        x6 x6Var22 = p6Var.d;
                        float f10 = p6Var.l;
                        ViewGroup viewGroup2 = p6Var.a;
                        n6 n6Var2 = p6Var.q;
                        AnimatorSet animatorSet2 = p6Var.m;
                        x6 x6Var3 = p6Var.i;
                        RectF rectF = p6Var.o;
                        RectF rectF2 = p6Var.n;
                        if (!p6Var.v && !p6Var.u) {
                            p6Var.e();
                            p6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.t0 J8 = p6Var.e.J8(p6Var.f);
                            if (J8 != null && J8.getWidth() > 0) {
                                org.telegram.ui.Cells.t0 t0Var = p6Var.p;
                                if (t0Var != J8) {
                                    if (t0Var != null) {
                                        t0Var.I0.i(false);
                                    }
                                    p6Var.p = J8;
                                }
                                c4 c4Var = p6Var.p.I0.m;
                                if (p6Var.t && n6Var2.n && c4Var != null && c4Var.n && c4Var.getWidth() > 0 && !p6Var.p.isLayoutRequested()) {
                                    rectF.set(p6Var.c(c4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f10 > 0.01f) {
                                        p6Var.u = true;
                                        p6Var.p.I0.i(true);
                                        x6Var3.f(x6Var22);
                                        x6Var3.setAlpha(f10);
                                        x6Var22.setAlpha(0.0f);
                                        p6Var.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    } else {
                                        rectF.setEmpty();
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - p6Var.w <= 700 && !p6Var.s && viewGroup2.isAttachedToWindow()) {
                                p6Var.h.postOnAnimation(p6Var.x);
                                break;
                            } else {
                                p6Var.u = true;
                                x6Var3.setAlpha(0.0f);
                                n6Var2.setAlpha(0.0f);
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
        this.q = n6Var;
        n6Var.setAlpha(0.001f);
        n6Var.setPaused(false);
        m6Var.addView(n6Var, c8.ha.e(60, 60, 51));
        viewGroup.addView(m6Var, new ViewGroup.LayoutParams(-1, -1));
        b(a10.centerX(), a10.centerY(), a10.width());
        final int i11 = 2;
        x6Var2.l(new Runnable(this) { // from class: org.telegram.ui.Wallet.l6
            public final /* synthetic */ p6 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        p6 p6Var = this.b;
                        x6 x6Var22 = p6Var.d;
                        float f10 = p6Var.l;
                        ViewGroup viewGroup2 = p6Var.a;
                        n6 n6Var2 = p6Var.q;
                        AnimatorSet animatorSet2 = p6Var.m;
                        x6 x6Var3 = p6Var.i;
                        RectF rectF = p6Var.o;
                        RectF rectF2 = p6Var.n;
                        if (!p6Var.v && !p6Var.u) {
                            p6Var.e();
                            p6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.t0 J8 = p6Var.e.J8(p6Var.f);
                            if (J8 != null && J8.getWidth() > 0) {
                                org.telegram.ui.Cells.t0 t0Var = p6Var.p;
                                if (t0Var != J8) {
                                    if (t0Var != null) {
                                        t0Var.I0.i(false);
                                    }
                                    p6Var.p = J8;
                                }
                                c4 c4Var = p6Var.p.I0.m;
                                if (p6Var.t && n6Var2.n && c4Var != null && c4Var.n && c4Var.getWidth() > 0 && !p6Var.p.isLayoutRequested()) {
                                    rectF.set(p6Var.c(c4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f10 > 0.01f) {
                                        p6Var.u = true;
                                        p6Var.p.I0.i(true);
                                        x6Var3.f(x6Var22);
                                        x6Var3.setAlpha(f10);
                                        x6Var22.setAlpha(0.0f);
                                        p6Var.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    } else {
                                        rectF.setEmpty();
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - p6Var.w <= 700 && !p6Var.s && viewGroup2.isAttachedToWindow()) {
                                p6Var.h.postOnAnimation(p6Var.x);
                                break;
                            } else {
                                p6Var.u = true;
                                x6Var3.setAlpha(0.0f);
                                n6Var2.setAlpha(0.0f);
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
        ofFloat.addUpdateListener(new r3(this, 3));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new o6(this, ciVar, x6Var));
        m6Var.post(r12);
    }

    public final void a(boolean z9) {
        if (this.v) {
            return;
        }
        this.v = true;
        l6 l6Var = this.x;
        m6 m6Var = this.h;
        m6Var.removeCallbacks(l6Var);
        x6 x6Var = this.i;
        x6Var.l(null);
        org.telegram.ui.Cells.t0 t0Var = this.p;
        if (t0Var != null) {
            t0Var.I0.i(false);
            if (z9 && this.r >= 1.0f) {
                RectF rectF = this.o;
                if (!rectF.isEmpty() && this.p.isAttachedToWindow() && l0.I(this.p.getMessageObject(), this.f)) {
                    float centerY = (((rectF.centerY() - (Math.min(this.n.centerY(), rectF.centerY()) - org.telegram.messenger.g0.L(150.0f))) * 2.0f) / 0.6f) / org.telegram.messenger.g0.p;
                    d4 d4Var = this.p.I0;
                    d4Var.l();
                    r1.g gVar = new r1.g(new r1.f(0.0f));
                    d4Var.b0 = gVar;
                    r1.h hVar = new r1.h(0.0f);
                    hVar.a(0.65f);
                    hVar.b(200.0f);
                    gVar.m = hVar;
                    d4Var.b0.f(0.001f);
                    d4Var.b0.a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                    d4Var.b0.b(new x3(d4Var, 1));
                    d4Var.b0.h();
                }
            }
        }
        n6 n6Var = this.q;
        n6Var.setPaused(true);
        m6Var.removeView(n6Var);
        x6Var.setPaused(true);
        m6Var.removeView(x6Var);
        m6Var.setClickable(false);
        this.d.setAlpha(this.l);
        ci ciVar = this.c;
        if (ciVar == null) {
            this.b.setTranslationY(0.0f);
        } else {
            ciVar.x1(1.0f);
        }
        ViewGroup viewGroup = this.a;
        if (ciVar != null && z9 && this.j.d()) {
            cn cnVar = this.e;
            if (cnVar.getParentLayout() != null) {
                ViewGroup view = cnVar.getParentLayout().getView();
                if (view.isAttachedToWindow()) {
                    viewGroup.getLocationOnScreen(new int[2]);
                    view.getLocationOnScreen(new int[2]);
                    viewGroup.removeView(m6Var);
                    m6Var.setTranslationX(r4[0] - r1[0]);
                    m6Var.setTranslationY(r4[1] - r1[1]);
                    view.addView(m6Var, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.g.run();
        org.telegram.messenger.g0.i3(new sb1(18, this, viewGroup), 650L);
    }

    public final void b(float f10, float f11, float f12) {
        float L = org.telegram.messenger.g0.L(60.0f);
        m6 m6Var = this.h;
        float f13 = L / 2.0f;
        x6 x6Var = this.i;
        x6Var.setTranslationX((f10 - m6Var.getLeft()) - f13);
        x6Var.setTranslationY((f11 - m6Var.getTop()) - f13);
        float f14 = f12 / L;
        x6Var.setScaleX(f14);
        x6Var.setScaleY(f14);
        float translationX = x6Var.getTranslationX();
        n6 n6Var = this.q;
        n6Var.setTranslationX(translationX);
        n6Var.setTranslationY(x6Var.getTranslationY());
        n6Var.setScaleX(f14);
        n6Var.setScaleY(f14);
    }

    public final RectF c(c4 c4Var) {
        ci ciVar = this.c;
        ViewGroup viewGroup = this.a;
        if (ciVar == null) {
            return ca.a(c4Var, viewGroup);
        }
        ViewGroup viewGroup2 = (ViewGroup) c4Var.getRootView();
        RectF a10 = ca.a(c4Var, viewGroup2);
        int[] iArr = new int[2];
        viewGroup2.getLocationOnScreen(iArr);
        a10.offset(iArr[0], iArr[1]);
        viewGroup.getLocationOnScreen(iArr);
        a10.offset(-iArr[0], -iArr[1]);
        return a10;
    }

    public final void d() {
        n6 n6Var = this.q;
        if (n6Var == null) {
            return;
        }
        x6 x6Var = this.i;
        float flightYaw = x6Var.getFlightYaw();
        float flightPitch = x6Var.getFlightPitch();
        if (this.p != null) {
            float max = Math.max(0.0f, Math.min(1.0f, (this.r - 0.55f) / 0.45f));
            float C = com.google.android.recaptcha.internal.a.C(max, 2.0f, 3.0f, max * max);
            flightYaw += ((float) Math.IEEEremainder(this.p.I0.g() - flightYaw, 6.283185307179586d)) * C;
            flightPitch += ((this.p.I0.k.E * 0.14f) - flightPitch) * C;
        }
        n6Var.r = flightYaw;
        n6Var.s = flightPitch;
        n6Var.w = true;
        n6Var.x = true;
    }

    public final void e() {
        x6 x6Var = this.d;
        if (x6Var.isAttachedToWindow()) {
            View rootView = x6Var.getRootView();
            ViewGroup viewGroup = this.a;
            if (rootView != viewGroup.getRootView()) {
                return;
            }
            ci ciVar = this.c;
            RectF rectF = this.n;
            if (ciVar == null) {
                ca.f(x6Var, this.b, viewGroup, rectF);
            } else {
                rectF.set(ca.a(x6Var, viewGroup));
                rectF.offset(0.0f, ciVar.i4 - ciVar.s2);
            }
        }
    }
}
