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
import org.telegram.ui.cn;
import org.telegram.ui.wb1;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class m6 {
    public final ViewGroup a;
    public final View b;
    public final di c;
    public final u6 d;
    public final cn e;
    public final TL_wallet.walletTransaction f;
    public final Runnable g;
    public final j6 h;
    public final u6 i;
    public final n9 j = new n9();
    public final PathInterpolator k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float l;
    public final AnimatorSet m;
    public final RectF n;
    public final RectF o;
    public org.telegram.ui.Cells.t0 p;
    public final k6 q;
    public float r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public final long w;
    public final i6 x;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Runnable, org.telegram.ui.Wallet.i6] */
    /* JADX WARN: Type inference failed for: r7v0, types: [org.telegram.ui.Wallet.i6] */
    public m6(ViewGroup viewGroup, View view, u6 u6Var, cn cnVar, TL_wallet.walletTransaction wallettransaction, Runnable runnable, di diVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.m = animatorSet;
        this.o = new RectF();
        this.w = SystemClock.uptimeMillis();
        final int i7 = 0;
        ?? r12 = new Runnable(this) { // from class: org.telegram.ui.Wallet.i6
            public final /* synthetic */ m6 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        m6 m6Var = this.b;
                        u6 u6Var2 = m6Var.d;
                        float f10 = m6Var.l;
                        ViewGroup viewGroup2 = m6Var.a;
                        k6 k6Var = m6Var.q;
                        AnimatorSet animatorSet2 = m6Var.m;
                        u6 u6Var3 = m6Var.i;
                        RectF rectF = m6Var.o;
                        RectF rectF2 = m6Var.n;
                        if (!m6Var.v && !m6Var.u) {
                            m6Var.e();
                            m6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.t0 J8 = m6Var.e.J8(m6Var.f);
                            if (J8 != null && J8.getWidth() > 0) {
                                org.telegram.ui.Cells.t0 t0Var = m6Var.p;
                                if (t0Var != J8) {
                                    if (t0Var != null) {
                                        t0Var.I0.i(false);
                                    }
                                    m6Var.p = J8;
                                }
                                a4 a4Var = m6Var.p.I0.m;
                                if (m6Var.t && k6Var.n && a4Var != null && a4Var.n && a4Var.getWidth() > 0 && !m6Var.p.isLayoutRequested()) {
                                    rectF.set(m6Var.c(a4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f10 > 0.01f) {
                                        m6Var.u = true;
                                        m6Var.p.I0.i(true);
                                        u6Var3.f(u6Var2);
                                        u6Var3.setAlpha(f10);
                                        u6Var2.setAlpha(0.0f);
                                        m6Var.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    } else {
                                        rectF.setEmpty();
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - m6Var.w <= 700 && !m6Var.s && viewGroup2.isAttachedToWindow()) {
                                m6Var.h.postOnAnimation(m6Var.x);
                                break;
                            } else {
                                m6Var.u = true;
                                u6Var3.setAlpha(0.0f);
                                k6Var.setAlpha(0.0f);
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
        this.d = u6Var;
        this.l = u6Var.getAlpha();
        this.e = cnVar;
        this.f = wallettransaction;
        this.g = runnable;
        RectF a10 = z9.a(u6Var, viewGroup);
        this.n = a10;
        e();
        j6 j6Var = new j6(this, viewGroup.getContext());
        this.h = j6Var;
        j6Var.setClipChildren(false);
        j6Var.setClipToPadding(false);
        final int i10 = 1;
        j6Var.setClickable(true);
        u6 u6Var2 = new u6(60, viewGroup.getContext(), true);
        this.i = u6Var2;
        u6Var2.setContinuousRotation(540.0f);
        u6Var2.f(u6Var);
        u6Var2.setAlpha(0.0f);
        j6Var.addView(u6Var2, c8.ha.e(60, 60, 51));
        k6 k6Var = new k6(this, viewGroup.getContext(), new Runnable(this) { // from class: org.telegram.ui.Wallet.i6
            public final /* synthetic */ m6 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        m6 m6Var = this.b;
                        u6 u6Var22 = m6Var.d;
                        float f10 = m6Var.l;
                        ViewGroup viewGroup2 = m6Var.a;
                        k6 k6Var2 = m6Var.q;
                        AnimatorSet animatorSet2 = m6Var.m;
                        u6 u6Var3 = m6Var.i;
                        RectF rectF = m6Var.o;
                        RectF rectF2 = m6Var.n;
                        if (!m6Var.v && !m6Var.u) {
                            m6Var.e();
                            m6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.t0 J8 = m6Var.e.J8(m6Var.f);
                            if (J8 != null && J8.getWidth() > 0) {
                                org.telegram.ui.Cells.t0 t0Var = m6Var.p;
                                if (t0Var != J8) {
                                    if (t0Var != null) {
                                        t0Var.I0.i(false);
                                    }
                                    m6Var.p = J8;
                                }
                                a4 a4Var = m6Var.p.I0.m;
                                if (m6Var.t && k6Var2.n && a4Var != null && a4Var.n && a4Var.getWidth() > 0 && !m6Var.p.isLayoutRequested()) {
                                    rectF.set(m6Var.c(a4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f10 > 0.01f) {
                                        m6Var.u = true;
                                        m6Var.p.I0.i(true);
                                        u6Var3.f(u6Var22);
                                        u6Var3.setAlpha(f10);
                                        u6Var22.setAlpha(0.0f);
                                        m6Var.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    } else {
                                        rectF.setEmpty();
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - m6Var.w <= 700 && !m6Var.s && viewGroup2.isAttachedToWindow()) {
                                m6Var.h.postOnAnimation(m6Var.x);
                                break;
                            } else {
                                m6Var.u = true;
                                u6Var3.setAlpha(0.0f);
                                k6Var2.setAlpha(0.0f);
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
        this.q = k6Var;
        k6Var.setAlpha(0.001f);
        k6Var.setPaused(false);
        j6Var.addView(k6Var, c8.ha.e(60, 60, 51));
        viewGroup.addView(j6Var, new ViewGroup.LayoutParams(-1, -1));
        b(a10.centerX(), a10.centerY(), a10.width());
        final int i11 = 2;
        u6Var2.l(new Runnable(this) { // from class: org.telegram.ui.Wallet.i6
            public final /* synthetic */ m6 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        m6 m6Var = this.b;
                        u6 u6Var22 = m6Var.d;
                        float f10 = m6Var.l;
                        ViewGroup viewGroup2 = m6Var.a;
                        k6 k6Var2 = m6Var.q;
                        AnimatorSet animatorSet2 = m6Var.m;
                        u6 u6Var3 = m6Var.i;
                        RectF rectF = m6Var.o;
                        RectF rectF2 = m6Var.n;
                        if (!m6Var.v && !m6Var.u) {
                            m6Var.e();
                            m6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.t0 J8 = m6Var.e.J8(m6Var.f);
                            if (J8 != null && J8.getWidth() > 0) {
                                org.telegram.ui.Cells.t0 t0Var = m6Var.p;
                                if (t0Var != J8) {
                                    if (t0Var != null) {
                                        t0Var.I0.i(false);
                                    }
                                    m6Var.p = J8;
                                }
                                a4 a4Var = m6Var.p.I0.m;
                                if (m6Var.t && k6Var2.n && a4Var != null && a4Var.n && a4Var.getWidth() > 0 && !m6Var.p.isLayoutRequested()) {
                                    rectF.set(m6Var.c(a4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f10 > 0.01f) {
                                        m6Var.u = true;
                                        m6Var.p.I0.i(true);
                                        u6Var3.f(u6Var22);
                                        u6Var3.setAlpha(f10);
                                        u6Var22.setAlpha(0.0f);
                                        m6Var.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    } else {
                                        rectF.setEmpty();
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - m6Var.w <= 700 && !m6Var.s && viewGroup2.isAttachedToWindow()) {
                                m6Var.h.postOnAnimation(m6Var.x);
                                break;
                            } else {
                                m6Var.u = true;
                                u6Var3.setAlpha(0.0f);
                                k6Var2.setAlpha(0.0f);
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
        ofFloat.addUpdateListener(new p3(this, 3));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new l6(this, diVar, u6Var));
        j6Var.post(r12);
    }

    public final void a(boolean z9) {
        if (this.v) {
            return;
        }
        this.v = true;
        i6 i6Var = this.x;
        j6 j6Var = this.h;
        j6Var.removeCallbacks(i6Var);
        u6 u6Var = this.i;
        u6Var.l(null);
        org.telegram.ui.Cells.t0 t0Var = this.p;
        if (t0Var != null) {
            t0Var.I0.i(false);
            if (z9 && this.r >= 1.0f) {
                RectF rectF = this.o;
                if (!rectF.isEmpty() && this.p.isAttachedToWindow() && l0.I(this.p.getMessageObject(), this.f)) {
                    float centerY = (((rectF.centerY() - (Math.min(this.n.centerY(), rectF.centerY()) - org.telegram.messenger.g0.L(150.0f))) * 2.0f) / 0.6f) / org.telegram.messenger.g0.p;
                    b4 b4Var = this.p.I0;
                    b4Var.l();
                    r1.g gVar = new r1.g(new r1.f(0.0f));
                    b4Var.b0 = gVar;
                    r1.h hVar = new r1.h(0.0f);
                    hVar.a(0.65f);
                    hVar.b(200.0f);
                    gVar.m = hVar;
                    b4Var.b0.f(0.001f);
                    b4Var.b0.a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                    b4Var.b0.b(new v3(b4Var, 1));
                    b4Var.b0.h();
                }
            }
        }
        k6 k6Var = this.q;
        k6Var.setPaused(true);
        j6Var.removeView(k6Var);
        u6Var.setPaused(true);
        j6Var.removeView(u6Var);
        j6Var.setClickable(false);
        this.d.setAlpha(this.l);
        di diVar = this.c;
        if (diVar == null) {
            this.b.setTranslationY(0.0f);
        } else {
            diVar.x1(1.0f);
        }
        ViewGroup viewGroup = this.a;
        if (diVar != null && z9 && this.j.d()) {
            cn cnVar = this.e;
            if (cnVar.getParentLayout() != null) {
                ViewGroup view = cnVar.getParentLayout().getView();
                if (view.isAttachedToWindow()) {
                    viewGroup.getLocationOnScreen(new int[2]);
                    view.getLocationOnScreen(new int[2]);
                    viewGroup.removeView(j6Var);
                    j6Var.setTranslationX(r4[0] - r1[0]);
                    j6Var.setTranslationY(r4[1] - r1[1]);
                    view.addView(j6Var, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.g.run();
        org.telegram.messenger.g0.i3(new wb1(18, this, viewGroup), 650L);
    }

    public final void b(float f10, float f11, float f12) {
        float L = org.telegram.messenger.g0.L(60.0f);
        j6 j6Var = this.h;
        float f13 = L / 2.0f;
        u6 u6Var = this.i;
        u6Var.setTranslationX((f10 - j6Var.getLeft()) - f13);
        u6Var.setTranslationY((f11 - j6Var.getTop()) - f13);
        float f14 = f12 / L;
        u6Var.setScaleX(f14);
        u6Var.setScaleY(f14);
        float translationX = u6Var.getTranslationX();
        k6 k6Var = this.q;
        k6Var.setTranslationX(translationX);
        k6Var.setTranslationY(u6Var.getTranslationY());
        k6Var.setScaleX(f14);
        k6Var.setScaleY(f14);
    }

    public final RectF c(a4 a4Var) {
        di diVar = this.c;
        ViewGroup viewGroup = this.a;
        if (diVar == null) {
            return z9.a(a4Var, viewGroup);
        }
        ViewGroup viewGroup2 = (ViewGroup) a4Var.getRootView();
        RectF a10 = z9.a(a4Var, viewGroup2);
        int[] iArr = new int[2];
        viewGroup2.getLocationOnScreen(iArr);
        a10.offset(iArr[0], iArr[1]);
        viewGroup.getLocationOnScreen(iArr);
        a10.offset(-iArr[0], -iArr[1]);
        return a10;
    }

    public final void d() {
        k6 k6Var = this.q;
        if (k6Var == null) {
            return;
        }
        u6 u6Var = this.i;
        float flightYaw = u6Var.getFlightYaw();
        float flightPitch = u6Var.getFlightPitch();
        if (this.p != null) {
            float max = Math.max(0.0f, Math.min(1.0f, (this.r - 0.55f) / 0.45f));
            float C = com.google.android.recaptcha.internal.a.C(max, 2.0f, 3.0f, max * max);
            flightYaw += ((float) Math.IEEEremainder(this.p.I0.g() - flightYaw, 6.283185307179586d)) * C;
            flightPitch += ((this.p.I0.k.E * 0.14f) - flightPitch) * C;
        }
        k6Var.r = flightYaw;
        k6Var.s = flightPitch;
        k6Var.w = true;
        k6Var.x = true;
    }

    public final void e() {
        u6 u6Var = this.d;
        if (u6Var.isAttachedToWindow()) {
            View rootView = u6Var.getRootView();
            ViewGroup viewGroup = this.a;
            if (rootView != viewGroup.getRootView()) {
                return;
            }
            di diVar = this.c;
            RectF rectF = this.n;
            if (diVar == null) {
                z9.f(u6Var, this.b, viewGroup, rectF);
            } else {
                rectF.set(z9.a(u6Var, viewGroup));
                rectF.offset(0.0f, diVar.f4 - diVar.p2);
            }
        }
    }
}
