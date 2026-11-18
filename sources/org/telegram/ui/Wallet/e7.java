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
import org.telegram.ui.Components.si;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class e7 {
    public final ViewGroup a;
    public final View b;
    public final si c;
    public final m7 d;
    public final bn e;
    public final TL_wallet.walletTransaction f;
    public final Runnable g;
    public final b7 h;
    public final m7 i;
    public final fa j = new fa();
    public final PathInterpolator k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float l;
    public final AnimatorSet m;
    public final RectF n;
    public final RectF o;
    public org.telegram.ui.Cells.u0 p;
    public final c7 q;
    public float r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public final long w;
    public final a7 x;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Runnable, org.telegram.ui.Wallet.a7] */
    /* JADX WARN: Type inference failed for: r7v0, types: [org.telegram.ui.Wallet.a7] */
    public e7(ViewGroup viewGroup, View view, m7 m7Var, bn bnVar, TL_wallet.walletTransaction wallettransaction, Runnable runnable, si siVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.m = animatorSet;
        this.o = new RectF();
        this.w = SystemClock.uptimeMillis();
        final int i7 = 0;
        ?? r12 = new Runnable(this) { // from class: org.telegram.ui.Wallet.a7
            public final /* synthetic */ e7 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        e7 e7Var = this.b;
                        m7 m7Var2 = e7Var.d;
                        float f10 = e7Var.l;
                        ViewGroup viewGroup2 = e7Var.a;
                        c7 c7Var = e7Var.q;
                        AnimatorSet animatorSet2 = e7Var.m;
                        m7 m7Var3 = e7Var.i;
                        RectF rectF = e7Var.o;
                        RectF rectF2 = e7Var.n;
                        if (!e7Var.v && !e7Var.u) {
                            e7Var.e();
                            e7Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.u0 K8 = e7Var.e.K8(e7Var.f);
                            if (K8 != null && K8.getWidth() > 0) {
                                org.telegram.ui.Cells.u0 u0Var = e7Var.p;
                                if (u0Var != K8) {
                                    if (u0Var != null) {
                                        u0Var.J0.i(false);
                                    }
                                    e7Var.p = K8;
                                }
                                l4 l4Var = e7Var.p.J0.m;
                                if (e7Var.t && c7Var.n && l4Var != null && l4Var.n && l4Var.getWidth() > 0 && !e7Var.p.isLayoutRequested()) {
                                    rectF.set(e7Var.c(l4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f10 > 0.01f) {
                                        e7Var.u = true;
                                        e7Var.p.J0.i(true);
                                        m7Var3.f(m7Var2);
                                        m7Var3.setAlpha(f10);
                                        m7Var2.setAlpha(0.0f);
                                        e7Var.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    } else {
                                        rectF.setEmpty();
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - e7Var.w <= 700 && !e7Var.s && viewGroup2.isAttachedToWindow()) {
                                e7Var.h.postOnAnimation(e7Var.x);
                                break;
                            } else {
                                e7Var.u = true;
                                m7Var3.setAlpha(0.0f);
                                c7Var.setAlpha(0.0f);
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
        this.c = siVar;
        this.a = viewGroup;
        this.b = view;
        this.d = m7Var;
        this.l = m7Var.getAlpha();
        this.e = bnVar;
        this.f = wallettransaction;
        this.g = runnable;
        RectF a10 = ra.a(m7Var, viewGroup);
        this.n = a10;
        e();
        b7 b7Var = new b7(this, viewGroup.getContext());
        this.h = b7Var;
        b7Var.setClipChildren(false);
        b7Var.setClipToPadding(false);
        final int i10 = 1;
        b7Var.setClickable(true);
        m7 m7Var2 = new m7(60, viewGroup.getContext(), true);
        this.i = m7Var2;
        m7Var2.setContinuousRotation(540.0f);
        m7Var2.f(m7Var);
        m7Var2.setAlpha(0.0f);
        b7Var.addView(m7Var2, c8.ma.e(60, 60, 51));
        c7 c7Var = new c7(this, viewGroup.getContext(), new Runnable(this) { // from class: org.telegram.ui.Wallet.a7
            public final /* synthetic */ e7 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        e7 e7Var = this.b;
                        m7 m7Var22 = e7Var.d;
                        float f10 = e7Var.l;
                        ViewGroup viewGroup2 = e7Var.a;
                        c7 c7Var2 = e7Var.q;
                        AnimatorSet animatorSet2 = e7Var.m;
                        m7 m7Var3 = e7Var.i;
                        RectF rectF = e7Var.o;
                        RectF rectF2 = e7Var.n;
                        if (!e7Var.v && !e7Var.u) {
                            e7Var.e();
                            e7Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.u0 K8 = e7Var.e.K8(e7Var.f);
                            if (K8 != null && K8.getWidth() > 0) {
                                org.telegram.ui.Cells.u0 u0Var = e7Var.p;
                                if (u0Var != K8) {
                                    if (u0Var != null) {
                                        u0Var.J0.i(false);
                                    }
                                    e7Var.p = K8;
                                }
                                l4 l4Var = e7Var.p.J0.m;
                                if (e7Var.t && c7Var2.n && l4Var != null && l4Var.n && l4Var.getWidth() > 0 && !e7Var.p.isLayoutRequested()) {
                                    rectF.set(e7Var.c(l4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f10 > 0.01f) {
                                        e7Var.u = true;
                                        e7Var.p.J0.i(true);
                                        m7Var3.f(m7Var22);
                                        m7Var3.setAlpha(f10);
                                        m7Var22.setAlpha(0.0f);
                                        e7Var.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    } else {
                                        rectF.setEmpty();
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - e7Var.w <= 700 && !e7Var.s && viewGroup2.isAttachedToWindow()) {
                                e7Var.h.postOnAnimation(e7Var.x);
                                break;
                            } else {
                                e7Var.u = true;
                                m7Var3.setAlpha(0.0f);
                                c7Var2.setAlpha(0.0f);
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
        this.q = c7Var;
        c7Var.setAlpha(0.001f);
        c7Var.setPaused(false);
        b7Var.addView(c7Var, c8.ma.e(60, 60, 51));
        viewGroup.addView(b7Var, new ViewGroup.LayoutParams(-1, -1));
        b(a10.centerX(), a10.centerY(), a10.width());
        final int i11 = 2;
        m7Var2.l(new Runnable(this) { // from class: org.telegram.ui.Wallet.a7
            public final /* synthetic */ e7 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        e7 e7Var = this.b;
                        m7 m7Var22 = e7Var.d;
                        float f10 = e7Var.l;
                        ViewGroup viewGroup2 = e7Var.a;
                        c7 c7Var2 = e7Var.q;
                        AnimatorSet animatorSet2 = e7Var.m;
                        m7 m7Var3 = e7Var.i;
                        RectF rectF = e7Var.o;
                        RectF rectF2 = e7Var.n;
                        if (!e7Var.v && !e7Var.u) {
                            e7Var.e();
                            e7Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.u0 K8 = e7Var.e.K8(e7Var.f);
                            if (K8 != null && K8.getWidth() > 0) {
                                org.telegram.ui.Cells.u0 u0Var = e7Var.p;
                                if (u0Var != K8) {
                                    if (u0Var != null) {
                                        u0Var.J0.i(false);
                                    }
                                    e7Var.p = K8;
                                }
                                l4 l4Var = e7Var.p.J0.m;
                                if (e7Var.t && c7Var2.n && l4Var != null && l4Var.n && l4Var.getWidth() > 0 && !e7Var.p.isLayoutRequested()) {
                                    rectF.set(e7Var.c(l4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f10 > 0.01f) {
                                        e7Var.u = true;
                                        e7Var.p.J0.i(true);
                                        m7Var3.f(m7Var22);
                                        m7Var3.setAlpha(f10);
                                        m7Var22.setAlpha(0.0f);
                                        e7Var.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    } else {
                                        rectF.setEmpty();
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - e7Var.w <= 700 && !e7Var.s && viewGroup2.isAttachedToWindow()) {
                                e7Var.h.postOnAnimation(e7Var.x);
                                break;
                            } else {
                                e7Var.u = true;
                                m7Var3.setAlpha(0.0f);
                                c7Var2.setAlpha(0.0f);
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
        ofFloat.addUpdateListener(new z3(this, 3));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new d7(this, siVar, m7Var));
        b7Var.post(r12);
    }

    public final void a(boolean z10) {
        if (this.v) {
            return;
        }
        this.v = true;
        a7 a7Var = this.x;
        b7 b7Var = this.h;
        b7Var.removeCallbacks(a7Var);
        m7 m7Var = this.i;
        m7Var.l(null);
        org.telegram.ui.Cells.u0 u0Var = this.p;
        if (u0Var != null) {
            u0Var.J0.i(false);
            if (z10 && this.r >= 1.0f) {
                RectF rectF = this.o;
                if (!rectF.isEmpty() && this.p.isAttachedToWindow() && u0.Q(this.p.getMessageObject(), this.f)) {
                    float centerY = (((rectF.centerY() - (Math.min(this.n.centerY(), rectF.centerY()) - org.telegram.messenger.g0.L(150.0f))) * 2.0f) / 0.6f) / org.telegram.messenger.g0.p;
                    m4 m4Var = this.p.J0;
                    m4Var.l();
                    r1.g gVar = new r1.g(new r1.f(0.0f));
                    m4Var.b0 = gVar;
                    r1.h hVar = new r1.h(0.0f);
                    hVar.a(0.65f);
                    hVar.b(200.0f);
                    gVar.m = hVar;
                    m4Var.b0.f(0.001f);
                    m4Var.b0.a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                    m4Var.b0.b(new g4(m4Var, 1));
                    m4Var.b0.h();
                }
            }
        }
        c7 c7Var = this.q;
        c7Var.setPaused(true);
        b7Var.removeView(c7Var);
        m7Var.setPaused(true);
        b7Var.removeView(m7Var);
        b7Var.setClickable(false);
        this.d.setAlpha(this.l);
        si siVar = this.c;
        if (siVar == null) {
            this.b.setTranslationY(0.0f);
        } else {
            siVar.y1(1.0f);
        }
        ViewGroup viewGroup = this.a;
        if (siVar != null && z10 && this.j.d()) {
            bn bnVar = this.e;
            if (bnVar.getParentLayout() != null) {
                ViewGroup view = bnVar.getParentLayout().getView();
                if (view.isAttachedToWindow()) {
                    viewGroup.getLocationOnScreen(new int[2]);
                    view.getLocationOnScreen(new int[2]);
                    viewGroup.removeView(b7Var);
                    b7Var.setTranslationX(r4[0] - r1[0]);
                    b7Var.setTranslationY(r4[1] - r1[1]);
                    view.addView(b7Var, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.g.run();
        org.telegram.messenger.g0.h3(new c5(5, this, viewGroup), 650L);
    }

    public final void b(float f10, float f11, float f12) {
        float L = org.telegram.messenger.g0.L(60.0f);
        b7 b7Var = this.h;
        float f13 = L / 2.0f;
        m7 m7Var = this.i;
        m7Var.setTranslationX((f10 - b7Var.getLeft()) - f13);
        m7Var.setTranslationY((f11 - b7Var.getTop()) - f13);
        float f14 = f12 / L;
        m7Var.setScaleX(f14);
        m7Var.setScaleY(f14);
        float translationX = m7Var.getTranslationX();
        c7 c7Var = this.q;
        c7Var.setTranslationX(translationX);
        c7Var.setTranslationY(m7Var.getTranslationY());
        c7Var.setScaleX(f14);
        c7Var.setScaleY(f14);
    }

    public final RectF c(l4 l4Var) {
        si siVar = this.c;
        ViewGroup viewGroup = this.a;
        if (siVar == null) {
            return ra.a(l4Var, viewGroup);
        }
        ViewGroup viewGroup2 = (ViewGroup) l4Var.getRootView();
        RectF a10 = ra.a(l4Var, viewGroup2);
        int[] iArr = new int[2];
        viewGroup2.getLocationOnScreen(iArr);
        a10.offset(iArr[0], iArr[1]);
        viewGroup.getLocationOnScreen(iArr);
        a10.offset(-iArr[0], -iArr[1]);
        return a10;
    }

    public final void d() {
        c7 c7Var = this.q;
        if (c7Var == null) {
            return;
        }
        m7 m7Var = this.i;
        float flightYaw = m7Var.getFlightYaw();
        float flightPitch = m7Var.getFlightPitch();
        if (this.p != null) {
            float max = Math.max(0.0f, Math.min(1.0f, (this.r - 0.55f) / 0.45f));
            float C = com.google.android.gms.internal.vision.e2.C(max, 2.0f, 3.0f, max * max);
            flightYaw += ((float) Math.IEEEremainder(this.p.J0.g() - flightYaw, 6.283185307179586d)) * C;
            flightPitch += ((this.p.J0.k.F * 0.14f) - flightPitch) * C;
        }
        c7Var.r = flightYaw;
        c7Var.s = flightPitch;
        c7Var.w = true;
        c7Var.x = true;
    }

    public final void e() {
        m7 m7Var = this.d;
        if (m7Var.isAttachedToWindow()) {
            View rootView = m7Var.getRootView();
            ViewGroup viewGroup = this.a;
            if (rootView != viewGroup.getRootView()) {
                return;
            }
            si siVar = this.c;
            RectF rectF = this.n;
            if (siVar == null) {
                ra.f(m7Var, this.b, viewGroup, rectF);
            } else {
                rectF.set(ra.a(m7Var, viewGroup));
                rectF.offset(0.0f, siVar.j4 - siVar.t2);
            }
        }
    }
}
