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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class o6 {
    public final ViewGroup a;
    public final View b;
    public final di c;
    public final w6 d;
    public final an e;
    public final TL_wallet.walletTransaction f;
    public final Runnable g;
    public final l6 h;
    public final w6 i;
    public final p9 j = new p9();
    public final PathInterpolator k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float l;
    public final AnimatorSet m;
    public final RectF n;
    public final RectF o;
    public org.telegram.ui.Cells.t0 p;
    public final m6 q;
    public float r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public final long w;
    public final k6 x;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Runnable, org.telegram.ui.Wallet.k6] */
    /* JADX WARN: Type inference failed for: r7v0, types: [org.telegram.ui.Wallet.k6] */
    public o6(ViewGroup viewGroup, View view, w6 w6Var, an anVar, TL_wallet.walletTransaction wallettransaction, Runnable runnable, di diVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.m = animatorSet;
        this.o = new RectF();
        this.w = SystemClock.uptimeMillis();
        final int i7 = 0;
        ?? r12 = new Runnable(this) { // from class: org.telegram.ui.Wallet.k6
            public final /* synthetic */ o6 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        o6 o6Var = this.b;
                        w6 w6Var2 = o6Var.d;
                        float f10 = o6Var.l;
                        ViewGroup viewGroup2 = o6Var.a;
                        m6 m6Var = o6Var.q;
                        AnimatorSet animatorSet2 = o6Var.m;
                        w6 w6Var3 = o6Var.i;
                        RectF rectF = o6Var.o;
                        RectF rectF2 = o6Var.n;
                        if (!o6Var.v && !o6Var.u) {
                            o6Var.e();
                            o6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.t0 I8 = o6Var.e.I8(o6Var.f);
                            if (I8 != null && I8.getWidth() > 0) {
                                org.telegram.ui.Cells.t0 t0Var = o6Var.p;
                                if (t0Var != I8) {
                                    if (t0Var != null) {
                                        t0Var.I0.i(false);
                                    }
                                    o6Var.p = I8;
                                }
                                c4 c4Var = o6Var.p.I0.m;
                                if (o6Var.t && m6Var.n && c4Var != null && c4Var.n && c4Var.getWidth() > 0 && !o6Var.p.isLayoutRequested()) {
                                    rectF.set(o6Var.c(c4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f10 > 0.01f) {
                                        o6Var.u = true;
                                        o6Var.p.I0.i(true);
                                        w6Var3.f(w6Var2);
                                        w6Var3.setAlpha(f10);
                                        w6Var2.setAlpha(0.0f);
                                        o6Var.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    } else {
                                        rectF.setEmpty();
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - o6Var.w <= 700 && !o6Var.s && viewGroup2.isAttachedToWindow()) {
                                o6Var.h.postOnAnimation(o6Var.x);
                                break;
                            } else {
                                o6Var.u = true;
                                w6Var3.setAlpha(0.0f);
                                m6Var.setAlpha(0.0f);
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
        this.d = w6Var;
        this.l = w6Var.getAlpha();
        this.e = anVar;
        this.f = wallettransaction;
        this.g = runnable;
        RectF a10 = ba.a(w6Var, viewGroup);
        this.n = a10;
        e();
        l6 l6Var = new l6(this, viewGroup.getContext());
        this.h = l6Var;
        l6Var.setClipChildren(false);
        l6Var.setClipToPadding(false);
        final int i10 = 1;
        l6Var.setClickable(true);
        w6 w6Var2 = new w6(60, viewGroup.getContext(), true);
        this.i = w6Var2;
        w6Var2.setContinuousRotation(540.0f);
        w6Var2.f(w6Var);
        w6Var2.setAlpha(0.0f);
        l6Var.addView(w6Var2, c8.ha.e(60, 60, 51));
        m6 m6Var = new m6(this, viewGroup.getContext(), new Runnable(this) { // from class: org.telegram.ui.Wallet.k6
            public final /* synthetic */ o6 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        o6 o6Var = this.b;
                        w6 w6Var22 = o6Var.d;
                        float f10 = o6Var.l;
                        ViewGroup viewGroup2 = o6Var.a;
                        m6 m6Var2 = o6Var.q;
                        AnimatorSet animatorSet2 = o6Var.m;
                        w6 w6Var3 = o6Var.i;
                        RectF rectF = o6Var.o;
                        RectF rectF2 = o6Var.n;
                        if (!o6Var.v && !o6Var.u) {
                            o6Var.e();
                            o6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.t0 I8 = o6Var.e.I8(o6Var.f);
                            if (I8 != null && I8.getWidth() > 0) {
                                org.telegram.ui.Cells.t0 t0Var = o6Var.p;
                                if (t0Var != I8) {
                                    if (t0Var != null) {
                                        t0Var.I0.i(false);
                                    }
                                    o6Var.p = I8;
                                }
                                c4 c4Var = o6Var.p.I0.m;
                                if (o6Var.t && m6Var2.n && c4Var != null && c4Var.n && c4Var.getWidth() > 0 && !o6Var.p.isLayoutRequested()) {
                                    rectF.set(o6Var.c(c4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f10 > 0.01f) {
                                        o6Var.u = true;
                                        o6Var.p.I0.i(true);
                                        w6Var3.f(w6Var22);
                                        w6Var3.setAlpha(f10);
                                        w6Var22.setAlpha(0.0f);
                                        o6Var.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    } else {
                                        rectF.setEmpty();
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - o6Var.w <= 700 && !o6Var.s && viewGroup2.isAttachedToWindow()) {
                                o6Var.h.postOnAnimation(o6Var.x);
                                break;
                            } else {
                                o6Var.u = true;
                                w6Var3.setAlpha(0.0f);
                                m6Var2.setAlpha(0.0f);
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
        this.q = m6Var;
        m6Var.setAlpha(0.001f);
        m6Var.setPaused(false);
        l6Var.addView(m6Var, c8.ha.e(60, 60, 51));
        viewGroup.addView(l6Var, new ViewGroup.LayoutParams(-1, -1));
        b(a10.centerX(), a10.centerY(), a10.width());
        final int i11 = 2;
        w6Var2.l(new Runnable(this) { // from class: org.telegram.ui.Wallet.k6
            public final /* synthetic */ o6 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        o6 o6Var = this.b;
                        w6 w6Var22 = o6Var.d;
                        float f10 = o6Var.l;
                        ViewGroup viewGroup2 = o6Var.a;
                        m6 m6Var2 = o6Var.q;
                        AnimatorSet animatorSet2 = o6Var.m;
                        w6 w6Var3 = o6Var.i;
                        RectF rectF = o6Var.o;
                        RectF rectF2 = o6Var.n;
                        if (!o6Var.v && !o6Var.u) {
                            o6Var.e();
                            o6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.t0 I8 = o6Var.e.I8(o6Var.f);
                            if (I8 != null && I8.getWidth() > 0) {
                                org.telegram.ui.Cells.t0 t0Var = o6Var.p;
                                if (t0Var != I8) {
                                    if (t0Var != null) {
                                        t0Var.I0.i(false);
                                    }
                                    o6Var.p = I8;
                                }
                                c4 c4Var = o6Var.p.I0.m;
                                if (o6Var.t && m6Var2.n && c4Var != null && c4Var.n && c4Var.getWidth() > 0 && !o6Var.p.isLayoutRequested()) {
                                    rectF.set(o6Var.c(c4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f10 > 0.01f) {
                                        o6Var.u = true;
                                        o6Var.p.I0.i(true);
                                        w6Var3.f(w6Var22);
                                        w6Var3.setAlpha(f10);
                                        w6Var22.setAlpha(0.0f);
                                        o6Var.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    } else {
                                        rectF.setEmpty();
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - o6Var.w <= 700 && !o6Var.s && viewGroup2.isAttachedToWindow()) {
                                o6Var.h.postOnAnimation(o6Var.x);
                                break;
                            } else {
                                o6Var.u = true;
                                w6Var3.setAlpha(0.0f);
                                m6Var2.setAlpha(0.0f);
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
        animatorSet.addListener(new n6(this, diVar, w6Var));
        l6Var.post(r12);
    }

    public final void a(boolean z9) {
        if (this.v) {
            return;
        }
        this.v = true;
        k6 k6Var = this.x;
        l6 l6Var = this.h;
        l6Var.removeCallbacks(k6Var);
        w6 w6Var = this.i;
        w6Var.l(null);
        org.telegram.ui.Cells.t0 t0Var = this.p;
        if (t0Var != null) {
            t0Var.I0.i(false);
            if (z9 && this.r >= 1.0f) {
                RectF rectF = this.o;
                if (!rectF.isEmpty() && this.p.isAttachedToWindow() && n0.I(this.p.getMessageObject(), this.f)) {
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
        m6 m6Var = this.q;
        m6Var.setPaused(true);
        l6Var.removeView(m6Var);
        w6Var.setPaused(true);
        l6Var.removeView(w6Var);
        l6Var.setClickable(false);
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
                    viewGroup.removeView(l6Var);
                    l6Var.setTranslationX(r4[0] - r1[0]);
                    l6Var.setTranslationY(r4[1] - r1[1]);
                    view.addView(l6Var, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.g.run();
        org.telegram.messenger.g0.i3(new n(17, this, viewGroup), 650L);
    }

    public final void b(float f10, float f11, float f12) {
        float L = org.telegram.messenger.g0.L(60.0f);
        l6 l6Var = this.h;
        float f13 = L / 2.0f;
        w6 w6Var = this.i;
        w6Var.setTranslationX((f10 - l6Var.getLeft()) - f13);
        w6Var.setTranslationY((f11 - l6Var.getTop()) - f13);
        float f14 = f12 / L;
        w6Var.setScaleX(f14);
        w6Var.setScaleY(f14);
        float translationX = w6Var.getTranslationX();
        m6 m6Var = this.q;
        m6Var.setTranslationX(translationX);
        m6Var.setTranslationY(w6Var.getTranslationY());
        m6Var.setScaleX(f14);
        m6Var.setScaleY(f14);
    }

    public final RectF c(c4 c4Var) {
        di diVar = this.c;
        ViewGroup viewGroup = this.a;
        if (diVar == null) {
            return ba.a(c4Var, viewGroup);
        }
        ViewGroup viewGroup2 = (ViewGroup) c4Var.getRootView();
        RectF a10 = ba.a(c4Var, viewGroup2);
        int[] iArr = new int[2];
        viewGroup2.getLocationOnScreen(iArr);
        a10.offset(iArr[0], iArr[1]);
        viewGroup.getLocationOnScreen(iArr);
        a10.offset(-iArr[0], -iArr[1]);
        return a10;
    }

    public final void d() {
        m6 m6Var = this.q;
        if (m6Var == null) {
            return;
        }
        w6 w6Var = this.i;
        float flightYaw = w6Var.getFlightYaw();
        float flightPitch = w6Var.getFlightPitch();
        if (this.p != null) {
            float max = Math.max(0.0f, Math.min(1.0f, (this.r - 0.55f) / 0.45f));
            float C = com.google.android.recaptcha.internal.a.C(max, 2.0f, 3.0f, max * max);
            flightYaw += ((float) Math.IEEEremainder(this.p.I0.g() - flightYaw, 6.283185307179586d)) * C;
            flightPitch += ((this.p.I0.k.E * 0.14f) - flightPitch) * C;
        }
        m6Var.r = flightYaw;
        m6Var.s = flightPitch;
        m6Var.w = true;
        m6Var.x = true;
    }

    public final void e() {
        w6 w6Var = this.d;
        if (w6Var.isAttachedToWindow()) {
            View rootView = w6Var.getRootView();
            ViewGroup viewGroup = this.a;
            if (rootView != viewGroup.getRootView()) {
                return;
            }
            di diVar = this.c;
            RectF rectF = this.n;
            if (diVar == null) {
                ba.f(w6Var, this.b, viewGroup, rectF);
            } else {
                rectF.set(ba.a(w6Var, viewGroup));
                rectF.offset(0.0f, diVar.f4 - diVar.p2);
            }
        }
    }
}
