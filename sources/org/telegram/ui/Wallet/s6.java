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
import org.telegram.ui.Components.bi;
import org.telegram.ui.un;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class s6 {
    public final ViewGroup a;
    public final View b;
    public final bi c;
    public final a7 d;
    public final un e;
    public final TL_wallet.walletTransaction f;
    public final Runnable g;
    public final p6 h;
    public final a7 i;
    public final t9 j = new t9();
    public final PathInterpolator k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float l;
    public final AnimatorSet m;
    public final RectF n;
    public final RectF o;
    public org.telegram.ui.Cells.s0 p;
    public final q6 q;
    public float r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public final long w;
    public final o6 x;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Runnable, org.telegram.ui.Wallet.o6] */
    /* JADX WARN: Type inference failed for: r7v0, types: [org.telegram.ui.Wallet.o6] */
    public s6(ViewGroup viewGroup, View view, a7 a7Var, un unVar, TL_wallet.walletTransaction wallettransaction, Runnable runnable, bi biVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.m = animatorSet;
        this.o = new RectF();
        this.w = SystemClock.uptimeMillis();
        final int i10 = 0;
        ?? r12 = new Runnable(this) { // from class: org.telegram.ui.Wallet.o6
            public final /* synthetic */ s6 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        s6 s6Var = this.b;
                        a7 a7Var2 = s6Var.d;
                        float f7 = s6Var.l;
                        ViewGroup viewGroup2 = s6Var.a;
                        q6 q6Var = s6Var.q;
                        AnimatorSet animatorSet2 = s6Var.m;
                        a7 a7Var3 = s6Var.i;
                        RectF rectF = s6Var.o;
                        RectF rectF2 = s6Var.n;
                        if (!s6Var.v && !s6Var.u) {
                            s6Var.e();
                            s6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.s0 B8 = s6Var.e.B8(s6Var.f);
                            if (B8 != null && B8.getWidth() > 0) {
                                org.telegram.ui.Cells.s0 s0Var = s6Var.p;
                                if (s0Var != B8) {
                                    if (s0Var != null) {
                                        s0Var.I0.i(false);
                                    }
                                    s6Var.p = B8;
                                }
                                c4 c4Var = s6Var.p.I0.m;
                                if (s6Var.t && q6Var.n && c4Var != null && c4Var.n && c4Var.getWidth() > 0 && !s6Var.p.isLayoutRequested()) {
                                    rectF.set(s6Var.c(c4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        s6Var.u = true;
                                        s6Var.p.I0.i(true);
                                        a7Var3.f(a7Var2);
                                        a7Var3.setAlpha(f7);
                                        a7Var2.setAlpha(0.0f);
                                        s6Var.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    } else {
                                        rectF.setEmpty();
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - s6Var.w <= 700 && !s6Var.s && viewGroup2.isAttachedToWindow()) {
                                s6Var.h.postOnAnimation(s6Var.x);
                                break;
                            } else {
                                s6Var.u = true;
                                a7Var3.setAlpha(0.0f);
                                q6Var.setAlpha(0.0f);
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
        this.c = biVar;
        this.a = viewGroup;
        this.b = view;
        this.d = a7Var;
        this.l = a7Var.getAlpha();
        this.e = unVar;
        this.f = wallettransaction;
        this.g = runnable;
        RectF a2 = fa.a(a7Var, viewGroup);
        this.n = a2;
        e();
        p6 p6Var = new p6(this, viewGroup.getContext());
        this.h = p6Var;
        p6Var.setClipChildren(false);
        p6Var.setClipToPadding(false);
        final int i11 = 1;
        p6Var.setClickable(true);
        a7 a7Var2 = new a7(60, viewGroup.getContext(), true);
        this.i = a7Var2;
        a7Var2.setContinuousRotation(540.0f);
        a7Var2.f(a7Var);
        a7Var2.setAlpha(0.0f);
        p6Var.addView(a7Var2, w7.b6.e(60, 60, 51));
        q6 q6Var = new q6(this, viewGroup.getContext(), new Runnable(this) { // from class: org.telegram.ui.Wallet.o6
            public final /* synthetic */ s6 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        s6 s6Var = this.b;
                        a7 a7Var22 = s6Var.d;
                        float f7 = s6Var.l;
                        ViewGroup viewGroup2 = s6Var.a;
                        q6 q6Var2 = s6Var.q;
                        AnimatorSet animatorSet2 = s6Var.m;
                        a7 a7Var3 = s6Var.i;
                        RectF rectF = s6Var.o;
                        RectF rectF2 = s6Var.n;
                        if (!s6Var.v && !s6Var.u) {
                            s6Var.e();
                            s6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.s0 B8 = s6Var.e.B8(s6Var.f);
                            if (B8 != null && B8.getWidth() > 0) {
                                org.telegram.ui.Cells.s0 s0Var = s6Var.p;
                                if (s0Var != B8) {
                                    if (s0Var != null) {
                                        s0Var.I0.i(false);
                                    }
                                    s6Var.p = B8;
                                }
                                c4 c4Var = s6Var.p.I0.m;
                                if (s6Var.t && q6Var2.n && c4Var != null && c4Var.n && c4Var.getWidth() > 0 && !s6Var.p.isLayoutRequested()) {
                                    rectF.set(s6Var.c(c4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        s6Var.u = true;
                                        s6Var.p.I0.i(true);
                                        a7Var3.f(a7Var22);
                                        a7Var3.setAlpha(f7);
                                        a7Var22.setAlpha(0.0f);
                                        s6Var.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    } else {
                                        rectF.setEmpty();
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - s6Var.w <= 700 && !s6Var.s && viewGroup2.isAttachedToWindow()) {
                                s6Var.h.postOnAnimation(s6Var.x);
                                break;
                            } else {
                                s6Var.u = true;
                                a7Var3.setAlpha(0.0f);
                                q6Var2.setAlpha(0.0f);
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
        this.q = q6Var;
        q6Var.setAlpha(0.001f);
        q6Var.setPaused(false);
        p6Var.addView(q6Var, w7.b6.e(60, 60, 51));
        viewGroup.addView(p6Var, new ViewGroup.LayoutParams(-1, -1));
        b(a2.centerX(), a2.centerY(), a2.width());
        final int i12 = 2;
        a7Var2.l(new Runnable(this) { // from class: org.telegram.ui.Wallet.o6
            public final /* synthetic */ s6 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        s6 s6Var = this.b;
                        a7 a7Var22 = s6Var.d;
                        float f7 = s6Var.l;
                        ViewGroup viewGroup2 = s6Var.a;
                        q6 q6Var2 = s6Var.q;
                        AnimatorSet animatorSet2 = s6Var.m;
                        a7 a7Var3 = s6Var.i;
                        RectF rectF = s6Var.o;
                        RectF rectF2 = s6Var.n;
                        if (!s6Var.v && !s6Var.u) {
                            s6Var.e();
                            s6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.s0 B8 = s6Var.e.B8(s6Var.f);
                            if (B8 != null && B8.getWidth() > 0) {
                                org.telegram.ui.Cells.s0 s0Var = s6Var.p;
                                if (s0Var != B8) {
                                    if (s0Var != null) {
                                        s0Var.I0.i(false);
                                    }
                                    s6Var.p = B8;
                                }
                                c4 c4Var = s6Var.p.I0.m;
                                if (s6Var.t && q6Var2.n && c4Var != null && c4Var.n && c4Var.getWidth() > 0 && !s6Var.p.isLayoutRequested()) {
                                    rectF.set(s6Var.c(c4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        s6Var.u = true;
                                        s6Var.p.I0.i(true);
                                        a7Var3.f(a7Var22);
                                        a7Var3.setAlpha(f7);
                                        a7Var22.setAlpha(0.0f);
                                        s6Var.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    } else {
                                        rectF.setEmpty();
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - s6Var.w <= 700 && !s6Var.s && viewGroup2.isAttachedToWindow()) {
                                s6Var.h.postOnAnimation(s6Var.x);
                                break;
                            } else {
                                s6Var.u = true;
                                a7Var3.setAlpha(0.0f);
                                q6Var2.setAlpha(0.0f);
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
        animatorSet.addListener(new r6(this, biVar, a7Var));
        p6Var.post(r12);
    }

    public final void a(boolean z10) {
        if (this.v) {
            return;
        }
        this.v = true;
        o6 o6Var = this.x;
        p6 p6Var = this.h;
        p6Var.removeCallbacks(o6Var);
        a7 a7Var = this.i;
        a7Var.l(null);
        org.telegram.ui.Cells.s0 s0Var = this.p;
        if (s0Var != null) {
            s0Var.I0.i(false);
            if (z10 && this.r >= 1.0f) {
                RectF rectF = this.o;
                if (!rectF.isEmpty() && this.p.isAttachedToWindow() && k0.I(this.p.getMessageObject(), this.f)) {
                    float centerY = (((rectF.centerY() - (Math.min(this.n.centerY(), rectF.centerY()) - org.telegram.messenger.i0.L(150.0f))) * 2.0f) / 0.6f) / org.telegram.messenger.i0.p;
                    d4 d4Var = this.p.I0;
                    d4Var.l();
                    o1.j jVar = new o1.j(new o1.i(0.0f));
                    d4Var.b0 = jVar;
                    o1.k kVar = new o1.k(0.0f);
                    kVar.a(0.65f);
                    kVar.b(200.0f);
                    jVar.m = kVar;
                    d4Var.b0.f(0.001f);
                    d4Var.b0.a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                    d4Var.b0.b(new x3(d4Var, 1));
                    d4Var.b0.h();
                }
            }
        }
        q6 q6Var = this.q;
        q6Var.setPaused(true);
        p6Var.removeView(q6Var);
        a7Var.setPaused(true);
        p6Var.removeView(a7Var);
        p6Var.setClickable(false);
        this.d.setAlpha(this.l);
        bi biVar = this.c;
        if (biVar == null) {
            this.b.setTranslationY(0.0f);
        } else {
            biVar.w1(1.0f);
        }
        ViewGroup viewGroup = this.a;
        if (biVar != null && z10 && this.j.d()) {
            un unVar = this.e;
            if (unVar.getParentLayout() != null) {
                ViewGroup view = unVar.getParentLayout().getView();
                if (view.isAttachedToWindow()) {
                    viewGroup.getLocationOnScreen(new int[2]);
                    view.getLocationOnScreen(new int[2]);
                    viewGroup.removeView(p6Var);
                    p6Var.setTranslationX(r4[0] - r1[0]);
                    p6Var.setTranslationY(r4[1] - r1[1]);
                    view.addView(p6Var, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.g.run();
        org.telegram.messenger.i0.h3(new k3(10, this, viewGroup), 650L);
    }

    public final void b(float f7, float f10, float f11) {
        float L = org.telegram.messenger.i0.L(60.0f);
        p6 p6Var = this.h;
        float f12 = L / 2.0f;
        a7 a7Var = this.i;
        a7Var.setTranslationX((f7 - p6Var.getLeft()) - f12);
        a7Var.setTranslationY((f10 - p6Var.getTop()) - f12);
        float f13 = f11 / L;
        a7Var.setScaleX(f13);
        a7Var.setScaleY(f13);
        float translationX = a7Var.getTranslationX();
        q6 q6Var = this.q;
        q6Var.setTranslationX(translationX);
        q6Var.setTranslationY(a7Var.getTranslationY());
        q6Var.setScaleX(f13);
        q6Var.setScaleY(f13);
    }

    public final RectF c(c4 c4Var) {
        bi biVar = this.c;
        ViewGroup viewGroup = this.a;
        if (biVar == null) {
            return fa.a(c4Var, viewGroup);
        }
        ViewGroup viewGroup2 = (ViewGroup) c4Var.getRootView();
        RectF a2 = fa.a(c4Var, viewGroup2);
        int[] iArr = new int[2];
        viewGroup2.getLocationOnScreen(iArr);
        a2.offset(iArr[0], iArr[1]);
        viewGroup.getLocationOnScreen(iArr);
        a2.offset(-iArr[0], -iArr[1]);
        return a2;
    }

    public final void d() {
        q6 q6Var = this.q;
        if (q6Var == null) {
            return;
        }
        a7 a7Var = this.i;
        float flightYaw = a7Var.getFlightYaw();
        float flightPitch = a7Var.getFlightPitch();
        if (this.p != null) {
            float max = Math.max(0.0f, Math.min(1.0f, (this.r - 0.55f) / 0.45f));
            float D = c3.i0.D(max, 2.0f, 3.0f, max * max);
            flightYaw += ((float) Math.IEEEremainder(this.p.I0.g() - flightYaw, 6.283185307179586d)) * D;
            flightPitch += ((this.p.I0.k.E * 0.14f) - flightPitch) * D;
        }
        q6Var.r = flightYaw;
        q6Var.s = flightPitch;
        q6Var.w = true;
        q6Var.x = true;
    }

    public final void e() {
        a7 a7Var = this.d;
        if (a7Var.isAttachedToWindow()) {
            View rootView = a7Var.getRootView();
            ViewGroup viewGroup = this.a;
            if (rootView != viewGroup.getRootView()) {
                return;
            }
            bi biVar = this.c;
            RectF rectF = this.n;
            if (biVar == null) {
                fa.f(a7Var, this.b, viewGroup, rectF);
            } else {
                rectF.set(fa.a(a7Var, viewGroup));
                rectF.offset(0.0f, biVar.f4 - biVar.p2);
            }
        }
    }
}
