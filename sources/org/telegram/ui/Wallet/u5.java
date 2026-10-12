package org.telegram.ui.Wallet;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.vi;
import org.telegram.ui.fo;
import org.telegram.ui.je1;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class u5 {
    public final ViewGroup a;
    public final View b;
    public final vi c;
    public final b6 d;
    public final fo e;
    public final TL_wallet.walletTransaction f;
    public final Runnable g;
    public final r5 h;
    public final b6 i;
    public final k8 j = new k8();
    public final PathInterpolator k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float l;
    public final AnimatorSet m;
    public final RectF n;
    public final RectF o;
    public org.telegram.ui.Cells.x0 p;
    public final s5 q;
    public float r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public final long w;
    public final q5 x;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Runnable, org.telegram.ui.Wallet.q5] */
    /* JADX WARN: Type inference failed for: r7v0, types: [org.telegram.ui.Wallet.q5] */
    public u5(ViewGroup viewGroup, View view, b6 b6Var, fo foVar, TL_wallet.walletTransaction wallettransaction, Runnable runnable, vi viVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.m = animatorSet;
        this.o = new RectF();
        this.w = SystemClock.uptimeMillis();
        final int i10 = 0;
        ?? r12 = new Runnable(this) { // from class: org.telegram.ui.Wallet.q5
            public final /* synthetic */ u5 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        u5 u5Var = this.b;
                        b6 b6Var2 = u5Var.d;
                        float f7 = u5Var.l;
                        ViewGroup viewGroup2 = u5Var.a;
                        s5 s5Var = u5Var.q;
                        AnimatorSet animatorSet2 = u5Var.m;
                        b6 b6Var3 = u5Var.i;
                        RectF rectF = u5Var.o;
                        RectF rectF2 = u5Var.n;
                        if (!u5Var.v && !u5Var.u) {
                            u5Var.e();
                            u5Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.x0 u82 = u5Var.e.u8(u5Var.f);
                            if (u82 != null && u82.getWidth() > 0) {
                                org.telegram.ui.Cells.x0 x0Var = u5Var.p;
                                if (x0Var != u82) {
                                    if (x0Var != null) {
                                        x0Var.I0.i(false);
                                    }
                                    u5Var.p = u82;
                                }
                                c3 c3Var = u5Var.p.I0.m;
                                if (u5Var.t && s5Var.h && c3Var != null && c3Var.h && c3Var.getWidth() > 0 && !u5Var.p.isLayoutRequested()) {
                                    rectF.set(u5Var.c(c3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        u5Var.u = true;
                                        u5Var.p.I0.i(true);
                                        b6Var3.f(b6Var2);
                                        b6Var3.setAlpha(f7);
                                        b6Var2.setAlpha(0.0f);
                                        u5Var.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    } else {
                                        rectF.setEmpty();
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - u5Var.w <= 700 && !u5Var.s && viewGroup2.isAttachedToWindow()) {
                                u5Var.h.postOnAnimation(u5Var.x);
                                break;
                            } else {
                                u5Var.u = true;
                                b6Var3.setAlpha(0.0f);
                                s5Var.setAlpha(0.0f);
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
        this.c = viVar;
        this.a = viewGroup;
        this.b = view;
        this.d = b6Var;
        this.l = b6Var.getAlpha();
        this.e = foVar;
        this.f = wallettransaction;
        this.g = runnable;
        RectF a2 = w8.a(viewGroup, b6Var);
        this.n = a2;
        e();
        r5 r5Var = new r5(this, viewGroup.getContext());
        this.h = r5Var;
        r5Var.setClipChildren(false);
        r5Var.setClipToPadding(false);
        final int i11 = 1;
        r5Var.setClickable(true);
        b6 b6Var2 = new b6(60, viewGroup.getContext(), true);
        this.i = b6Var2;
        b6Var2.setContinuousRotation(540.0f);
        b6Var2.f(b6Var);
        b6Var2.setAlpha(0.0f);
        r5Var.addView(b6Var2, w7.a6.e(60, 60, 51));
        s5 s5Var = new s5(this, viewGroup.getContext(), new Runnable(this) { // from class: org.telegram.ui.Wallet.q5
            public final /* synthetic */ u5 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        u5 u5Var = this.b;
                        b6 b6Var22 = u5Var.d;
                        float f7 = u5Var.l;
                        ViewGroup viewGroup2 = u5Var.a;
                        s5 s5Var2 = u5Var.q;
                        AnimatorSet animatorSet2 = u5Var.m;
                        b6 b6Var3 = u5Var.i;
                        RectF rectF = u5Var.o;
                        RectF rectF2 = u5Var.n;
                        if (!u5Var.v && !u5Var.u) {
                            u5Var.e();
                            u5Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.x0 u82 = u5Var.e.u8(u5Var.f);
                            if (u82 != null && u82.getWidth() > 0) {
                                org.telegram.ui.Cells.x0 x0Var = u5Var.p;
                                if (x0Var != u82) {
                                    if (x0Var != null) {
                                        x0Var.I0.i(false);
                                    }
                                    u5Var.p = u82;
                                }
                                c3 c3Var = u5Var.p.I0.m;
                                if (u5Var.t && s5Var2.h && c3Var != null && c3Var.h && c3Var.getWidth() > 0 && !u5Var.p.isLayoutRequested()) {
                                    rectF.set(u5Var.c(c3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        u5Var.u = true;
                                        u5Var.p.I0.i(true);
                                        b6Var3.f(b6Var22);
                                        b6Var3.setAlpha(f7);
                                        b6Var22.setAlpha(0.0f);
                                        u5Var.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    } else {
                                        rectF.setEmpty();
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - u5Var.w <= 700 && !u5Var.s && viewGroup2.isAttachedToWindow()) {
                                u5Var.h.postOnAnimation(u5Var.x);
                                break;
                            } else {
                                u5Var.u = true;
                                b6Var3.setAlpha(0.0f);
                                s5Var2.setAlpha(0.0f);
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
        this.q = s5Var;
        s5Var.setAlpha(0.001f);
        s5Var.setPaused(false);
        r5Var.addView(s5Var, w7.a6.e(60, 60, 51));
        viewGroup.addView(r5Var, new ViewGroup.LayoutParams(-1, -1));
        b(a2.centerX(), a2.centerY(), a2.width());
        final int i12 = 2;
        b6Var2.l(new Runnable(this) { // from class: org.telegram.ui.Wallet.q5
            public final /* synthetic */ u5 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        u5 u5Var = this.b;
                        b6 b6Var22 = u5Var.d;
                        float f7 = u5Var.l;
                        ViewGroup viewGroup2 = u5Var.a;
                        s5 s5Var2 = u5Var.q;
                        AnimatorSet animatorSet2 = u5Var.m;
                        b6 b6Var3 = u5Var.i;
                        RectF rectF = u5Var.o;
                        RectF rectF2 = u5Var.n;
                        if (!u5Var.v && !u5Var.u) {
                            u5Var.e();
                            u5Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.x0 u82 = u5Var.e.u8(u5Var.f);
                            if (u82 != null && u82.getWidth() > 0) {
                                org.telegram.ui.Cells.x0 x0Var = u5Var.p;
                                if (x0Var != u82) {
                                    if (x0Var != null) {
                                        x0Var.I0.i(false);
                                    }
                                    u5Var.p = u82;
                                }
                                c3 c3Var = u5Var.p.I0.m;
                                if (u5Var.t && s5Var2.h && c3Var != null && c3Var.h && c3Var.getWidth() > 0 && !u5Var.p.isLayoutRequested()) {
                                    rectF.set(u5Var.c(c3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        u5Var.u = true;
                                        u5Var.p.I0.i(true);
                                        b6Var3.f(b6Var22);
                                        b6Var3.setAlpha(f7);
                                        b6Var22.setAlpha(0.0f);
                                        u5Var.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    } else {
                                        rectF.setEmpty();
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - u5Var.w <= 700 && !u5Var.s && viewGroup2.isAttachedToWindow()) {
                                u5Var.h.postOnAnimation(u5Var.x);
                                break;
                            } else {
                                u5Var.u = true;
                                b6Var3.setAlpha(0.0f);
                                s5Var2.setAlpha(0.0f);
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
        ofFloat.addUpdateListener(new s2(this, 4));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new t5(this, viVar, b6Var));
        r5Var.post(r12);
    }

    public final void a(boolean z10) {
        if (this.v) {
            return;
        }
        this.v = true;
        q5 q5Var = this.x;
        r5 r5Var = this.h;
        r5Var.removeCallbacks(q5Var);
        b6 b6Var = this.i;
        b6Var.l(null);
        org.telegram.ui.Cells.x0 x0Var = this.p;
        if (x0Var != null) {
            x0Var.I0.i(false);
            if (z10 && this.r >= 1.0f) {
                RectF rectF = this.o;
                if (!rectF.isEmpty() && this.p.isAttachedToWindow() && j0.F(this.p.getMessageObject(), this.f)) {
                    float centerY = (((rectF.centerY() - (Math.min(this.n.centerY(), rectF.centerY()) - AndroidUtilities.dp(150.0f))) * 2.0f) / 0.6f) / AndroidUtilities.density;
                    d3 d3Var = this.p.I0;
                    d3Var.l();
                    o1.k kVar = new o1.k(new o1.j(0.0f));
                    d3Var.b0 = kVar;
                    o1.l lVar = new o1.l(0.0f);
                    lVar.a(0.65f);
                    lVar.b(200.0f);
                    kVar.u = lVar;
                    d3Var.b0.e(0.001f);
                    d3Var.b0.a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                    d3Var.b0.b(new y2(d3Var, 1));
                    d3Var.b0.h();
                }
            }
        }
        s5 s5Var = this.q;
        s5Var.setPaused(true);
        r5Var.removeView(s5Var);
        b6Var.setPaused(true);
        r5Var.removeView(b6Var);
        r5Var.setClickable(false);
        this.d.setAlpha(this.l);
        vi viVar = this.c;
        if (viVar == null) {
            this.b.setTranslationY(0.0f);
        } else {
            viVar.M1(1.0f);
        }
        ViewGroup viewGroup = this.a;
        if (viVar != null && z10 && this.j.d()) {
            fo foVar = this.e;
            if (foVar.getParentLayout() != null) {
                ViewGroup view = foVar.getParentLayout().getView();
                if (view.isAttachedToWindow()) {
                    viewGroup.getLocationOnScreen(new int[2]);
                    view.getLocationOnScreen(new int[2]);
                    viewGroup.removeView(r5Var);
                    r5Var.setTranslationX(r4[0] - r1[0]);
                    r5Var.setTranslationY(r4[1] - r1[1]);
                    view.addView(r5Var, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.g.run();
        AndroidUtilities.runOnUIThread(new je1(24, this, viewGroup), 650L);
    }

    public final void b(float f7, float f10, float f11) {
        float dp = AndroidUtilities.dp(60.0f);
        r5 r5Var = this.h;
        float f12 = dp / 2.0f;
        b6 b6Var = this.i;
        b6Var.setTranslationX((f7 - r5Var.getLeft()) - f12);
        b6Var.setTranslationY((f10 - r5Var.getTop()) - f12);
        float f13 = f11 / dp;
        b6Var.setScaleX(f13);
        b6Var.setScaleY(f13);
        float translationX = b6Var.getTranslationX();
        s5 s5Var = this.q;
        s5Var.setTranslationX(translationX);
        s5Var.setTranslationY(b6Var.getTranslationY());
        s5Var.setScaleX(f13);
        s5Var.setScaleY(f13);
    }

    public final RectF c(c3 c3Var) {
        vi viVar = this.c;
        ViewGroup viewGroup = this.a;
        if (viVar == null) {
            return w8.a(viewGroup, c3Var);
        }
        ViewGroup viewGroup2 = (ViewGroup) c3Var.getRootView();
        RectF a2 = w8.a(viewGroup2, c3Var);
        int[] iArr = new int[2];
        viewGroup2.getLocationOnScreen(iArr);
        a2.offset(iArr[0], iArr[1]);
        viewGroup.getLocationOnScreen(iArr);
        a2.offset(-iArr[0], -iArr[1]);
        return a2;
    }

    public final void d() {
        s5 s5Var = this.q;
        if (s5Var == null) {
            return;
        }
        b6 b6Var = this.i;
        float flightYaw = b6Var.getFlightYaw();
        float flightPitch = b6Var.getFlightPitch();
        if (this.p != null) {
            float max = Math.max(0.0f, Math.min(1.0f, (this.r - 0.55f) / 0.45f));
            float B = com.google.android.gms.internal.play_billing.k3.B(max, 2.0f, 3.0f, max * max);
            flightYaw += ((float) Math.IEEEremainder(this.p.I0.g() - flightYaw, 6.283185307179586d)) * B;
            flightPitch += ((this.p.I0.k.E * 0.14f) - flightPitch) * B;
        }
        s5Var.n = flightYaw;
        s5Var.r = flightPitch;
        s5Var.s = true;
        s5Var.v = true;
    }

    public final void e() {
        b6 b6Var = this.d;
        if (b6Var.isAttachedToWindow()) {
            View rootView = b6Var.getRootView();
            ViewGroup viewGroup = this.a;
            if (rootView != viewGroup.getRootView()) {
                return;
            }
            vi viVar = this.c;
            RectF rectF = this.n;
            if (viVar == null) {
                w8.f(b6Var, this.b, viewGroup, rectF);
            } else {
                rectF.set(w8.a(viewGroup, b6Var));
                rectF.offset(0.0f, viVar.o2 - viVar.y0);
            }
        }
    }
}
