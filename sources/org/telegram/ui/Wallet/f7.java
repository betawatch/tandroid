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
import org.telegram.ui.Components.ti;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class f7 {
    public final ViewGroup a;
    public final View b;
    public final ti c;
    public final n7 d;
    public final bn e;
    public final TL_wallet.walletTransaction f;
    public final Runnable g;
    public final c7 h;
    public final n7 i;
    public final ga j = new ga();
    public final PathInterpolator k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float l;
    public final AnimatorSet m;
    public final RectF n;
    public final RectF o;
    public org.telegram.ui.Cells.v0 p;
    public final d7 q;
    public float r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public final long w;
    public final b7 x;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Runnable, org.telegram.ui.Wallet.b7] */
    /* JADX WARN: Type inference failed for: r7v0, types: [org.telegram.ui.Wallet.b7] */
    public f7(ViewGroup viewGroup, View view, n7 n7Var, bn bnVar, TL_wallet.walletTransaction wallettransaction, Runnable runnable, ti tiVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.m = animatorSet;
        this.o = new RectF();
        this.w = SystemClock.uptimeMillis();
        final int i7 = 0;
        ?? r12 = new Runnable(this) { // from class: org.telegram.ui.Wallet.b7
            public final /* synthetic */ f7 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        f7 f7Var = this.b;
                        n7 n7Var2 = f7Var.d;
                        float f10 = f7Var.l;
                        ViewGroup viewGroup2 = f7Var.a;
                        d7 d7Var = f7Var.q;
                        AnimatorSet animatorSet2 = f7Var.m;
                        n7 n7Var3 = f7Var.i;
                        RectF rectF = f7Var.o;
                        RectF rectF2 = f7Var.n;
                        if (!f7Var.v && !f7Var.u) {
                            f7Var.e();
                            f7Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.v0 K8 = f7Var.e.K8(f7Var.f);
                            if (K8 != null && K8.getWidth() > 0) {
                                org.telegram.ui.Cells.v0 v0Var = f7Var.p;
                                if (v0Var != K8) {
                                    if (v0Var != null) {
                                        v0Var.J0.i(false);
                                    }
                                    f7Var.p = K8;
                                }
                                m4 m4Var = f7Var.p.J0.m;
                                if (f7Var.t && d7Var.n && m4Var != null && m4Var.n && m4Var.getWidth() > 0 && !f7Var.p.isLayoutRequested()) {
                                    rectF.set(f7Var.c(m4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f10 > 0.01f) {
                                        f7Var.u = true;
                                        f7Var.p.J0.i(true);
                                        n7Var3.f(n7Var2);
                                        n7Var3.setAlpha(f10);
                                        n7Var2.setAlpha(0.0f);
                                        f7Var.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    } else {
                                        rectF.setEmpty();
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - f7Var.w <= 700 && !f7Var.s && viewGroup2.isAttachedToWindow()) {
                                f7Var.h.postOnAnimation(f7Var.x);
                                break;
                            } else {
                                f7Var.u = true;
                                n7Var3.setAlpha(0.0f);
                                d7Var.setAlpha(0.0f);
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
        this.c = tiVar;
        this.a = viewGroup;
        this.b = view;
        this.d = n7Var;
        this.l = n7Var.getAlpha();
        this.e = bnVar;
        this.f = wallettransaction;
        this.g = runnable;
        RectF a10 = sa.a(n7Var, viewGroup);
        this.n = a10;
        e();
        c7 c7Var = new c7(this, viewGroup.getContext());
        this.h = c7Var;
        c7Var.setClipChildren(false);
        c7Var.setClipToPadding(false);
        final int i10 = 1;
        c7Var.setClickable(true);
        n7 n7Var2 = new n7(60, viewGroup.getContext(), true);
        this.i = n7Var2;
        n7Var2.setContinuousRotation(540.0f);
        n7Var2.f(n7Var);
        n7Var2.setAlpha(0.0f);
        c7Var.addView(n7Var2, c8.na.e(60, 60, 51));
        d7 d7Var = new d7(this, viewGroup.getContext(), new Runnable(this) { // from class: org.telegram.ui.Wallet.b7
            public final /* synthetic */ f7 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        f7 f7Var = this.b;
                        n7 n7Var22 = f7Var.d;
                        float f10 = f7Var.l;
                        ViewGroup viewGroup2 = f7Var.a;
                        d7 d7Var2 = f7Var.q;
                        AnimatorSet animatorSet2 = f7Var.m;
                        n7 n7Var3 = f7Var.i;
                        RectF rectF = f7Var.o;
                        RectF rectF2 = f7Var.n;
                        if (!f7Var.v && !f7Var.u) {
                            f7Var.e();
                            f7Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.v0 K8 = f7Var.e.K8(f7Var.f);
                            if (K8 != null && K8.getWidth() > 0) {
                                org.telegram.ui.Cells.v0 v0Var = f7Var.p;
                                if (v0Var != K8) {
                                    if (v0Var != null) {
                                        v0Var.J0.i(false);
                                    }
                                    f7Var.p = K8;
                                }
                                m4 m4Var = f7Var.p.J0.m;
                                if (f7Var.t && d7Var2.n && m4Var != null && m4Var.n && m4Var.getWidth() > 0 && !f7Var.p.isLayoutRequested()) {
                                    rectF.set(f7Var.c(m4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f10 > 0.01f) {
                                        f7Var.u = true;
                                        f7Var.p.J0.i(true);
                                        n7Var3.f(n7Var22);
                                        n7Var3.setAlpha(f10);
                                        n7Var22.setAlpha(0.0f);
                                        f7Var.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    } else {
                                        rectF.setEmpty();
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - f7Var.w <= 700 && !f7Var.s && viewGroup2.isAttachedToWindow()) {
                                f7Var.h.postOnAnimation(f7Var.x);
                                break;
                            } else {
                                f7Var.u = true;
                                n7Var3.setAlpha(0.0f);
                                d7Var2.setAlpha(0.0f);
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
        this.q = d7Var;
        d7Var.setAlpha(0.001f);
        d7Var.setPaused(false);
        c7Var.addView(d7Var, c8.na.e(60, 60, 51));
        viewGroup.addView(c7Var, new ViewGroup.LayoutParams(-1, -1));
        b(a10.centerX(), a10.centerY(), a10.width());
        final int i11 = 2;
        n7Var2.l(new Runnable(this) { // from class: org.telegram.ui.Wallet.b7
            public final /* synthetic */ f7 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        f7 f7Var = this.b;
                        n7 n7Var22 = f7Var.d;
                        float f10 = f7Var.l;
                        ViewGroup viewGroup2 = f7Var.a;
                        d7 d7Var2 = f7Var.q;
                        AnimatorSet animatorSet2 = f7Var.m;
                        n7 n7Var3 = f7Var.i;
                        RectF rectF = f7Var.o;
                        RectF rectF2 = f7Var.n;
                        if (!f7Var.v && !f7Var.u) {
                            f7Var.e();
                            f7Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.v0 K8 = f7Var.e.K8(f7Var.f);
                            if (K8 != null && K8.getWidth() > 0) {
                                org.telegram.ui.Cells.v0 v0Var = f7Var.p;
                                if (v0Var != K8) {
                                    if (v0Var != null) {
                                        v0Var.J0.i(false);
                                    }
                                    f7Var.p = K8;
                                }
                                m4 m4Var = f7Var.p.J0.m;
                                if (f7Var.t && d7Var2.n && m4Var != null && m4Var.n && m4Var.getWidth() > 0 && !f7Var.p.isLayoutRequested()) {
                                    rectF.set(f7Var.c(m4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f10 > 0.01f) {
                                        f7Var.u = true;
                                        f7Var.p.J0.i(true);
                                        n7Var3.f(n7Var22);
                                        n7Var3.setAlpha(f10);
                                        n7Var22.setAlpha(0.0f);
                                        f7Var.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    } else {
                                        rectF.setEmpty();
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - f7Var.w <= 700 && !f7Var.s && viewGroup2.isAttachedToWindow()) {
                                f7Var.h.postOnAnimation(f7Var.x);
                                break;
                            } else {
                                f7Var.u = true;
                                n7Var3.setAlpha(0.0f);
                                d7Var2.setAlpha(0.0f);
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
        ofFloat.addUpdateListener(new a4(this, 3));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new e7(this, tiVar, n7Var));
        c7Var.post(r12);
    }

    public final void a(boolean z10) {
        if (this.v) {
            return;
        }
        this.v = true;
        b7 b7Var = this.x;
        c7 c7Var = this.h;
        c7Var.removeCallbacks(b7Var);
        n7 n7Var = this.i;
        n7Var.l(null);
        org.telegram.ui.Cells.v0 v0Var = this.p;
        if (v0Var != null) {
            v0Var.J0.i(false);
            if (z10 && this.r >= 1.0f) {
                RectF rectF = this.o;
                if (!rectF.isEmpty() && this.p.isAttachedToWindow() && v0.Q(this.p.getMessageObject(), this.f)) {
                    float centerY = (((rectF.centerY() - (Math.min(this.n.centerY(), rectF.centerY()) - org.telegram.messenger.g0.L(150.0f))) * 2.0f) / 0.6f) / org.telegram.messenger.g0.p;
                    n4 n4Var = this.p.J0;
                    n4Var.l();
                    r1.g gVar = new r1.g(new r1.f(0.0f));
                    n4Var.b0 = gVar;
                    r1.h hVar = new r1.h(0.0f);
                    hVar.a(0.65f);
                    hVar.b(200.0f);
                    gVar.m = hVar;
                    n4Var.b0.f(0.001f);
                    n4Var.b0.a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                    n4Var.b0.b(new h4(n4Var, 1));
                    n4Var.b0.h();
                }
            }
        }
        d7 d7Var = this.q;
        d7Var.setPaused(true);
        c7Var.removeView(d7Var);
        n7Var.setPaused(true);
        c7Var.removeView(n7Var);
        c7Var.setClickable(false);
        this.d.setAlpha(this.l);
        ti tiVar = this.c;
        if (tiVar == null) {
            this.b.setTranslationY(0.0f);
        } else {
            tiVar.y1(1.0f);
        }
        ViewGroup viewGroup = this.a;
        if (tiVar != null && z10 && this.j.d()) {
            bn bnVar = this.e;
            if (bnVar.getParentLayout() != null) {
                ViewGroup view = bnVar.getParentLayout().getView();
                if (view.isAttachedToWindow()) {
                    viewGroup.getLocationOnScreen(new int[2]);
                    view.getLocationOnScreen(new int[2]);
                    viewGroup.removeView(c7Var);
                    c7Var.setTranslationX(r4[0] - r1[0]);
                    c7Var.setTranslationY(r4[1] - r1[1]);
                    view.addView(c7Var, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.g.run();
        org.telegram.messenger.g0.h3(new r(11, this, viewGroup), 650L);
    }

    public final void b(float f10, float f11, float f12) {
        float L = org.telegram.messenger.g0.L(60.0f);
        c7 c7Var = this.h;
        float f13 = L / 2.0f;
        n7 n7Var = this.i;
        n7Var.setTranslationX((f10 - c7Var.getLeft()) - f13);
        n7Var.setTranslationY((f11 - c7Var.getTop()) - f13);
        float f14 = f12 / L;
        n7Var.setScaleX(f14);
        n7Var.setScaleY(f14);
        float translationX = n7Var.getTranslationX();
        d7 d7Var = this.q;
        d7Var.setTranslationX(translationX);
        d7Var.setTranslationY(n7Var.getTranslationY());
        d7Var.setScaleX(f14);
        d7Var.setScaleY(f14);
    }

    public final RectF c(m4 m4Var) {
        ti tiVar = this.c;
        ViewGroup viewGroup = this.a;
        if (tiVar == null) {
            return sa.a(m4Var, viewGroup);
        }
        ViewGroup viewGroup2 = (ViewGroup) m4Var.getRootView();
        RectF a10 = sa.a(m4Var, viewGroup2);
        int[] iArr = new int[2];
        viewGroup2.getLocationOnScreen(iArr);
        a10.offset(iArr[0], iArr[1]);
        viewGroup.getLocationOnScreen(iArr);
        a10.offset(-iArr[0], -iArr[1]);
        return a10;
    }

    public final void d() {
        d7 d7Var = this.q;
        if (d7Var == null) {
            return;
        }
        n7 n7Var = this.i;
        float flightYaw = n7Var.getFlightYaw();
        float flightPitch = n7Var.getFlightPitch();
        if (this.p != null) {
            float max = Math.max(0.0f, Math.min(1.0f, (this.r - 0.55f) / 0.45f));
            float C = com.google.android.gms.internal.vision.e2.C(max, 2.0f, 3.0f, max * max);
            flightYaw += ((float) Math.IEEEremainder(this.p.J0.g() - flightYaw, 6.283185307179586d)) * C;
            flightPitch += ((this.p.J0.k.F * 0.14f) - flightPitch) * C;
        }
        d7Var.r = flightYaw;
        d7Var.s = flightPitch;
        d7Var.w = true;
        d7Var.x = true;
    }

    public final void e() {
        n7 n7Var = this.d;
        if (n7Var.isAttachedToWindow()) {
            View rootView = n7Var.getRootView();
            ViewGroup viewGroup = this.a;
            if (rootView != viewGroup.getRootView()) {
                return;
            }
            ti tiVar = this.c;
            RectF rectF = this.n;
            if (tiVar == null) {
                sa.f(n7Var, this.b, viewGroup, rectF);
            } else {
                rectF.set(sa.a(n7Var, viewGroup));
                rectF.offset(0.0f, tiVar.j4 - tiVar.t2);
            }
        }
    }
}
