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
import org.telegram.ui.Components.ti;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class k6 {
    public final ViewGroup a;
    public final View b;
    public final ti c;
    public final s6 d;
    public final sn e;
    public final TL_wallet.walletTransaction f;
    public final Runnable g;
    public final h6 h;
    public final s6 i;
    public final q9 j = new q9();
    public final PathInterpolator k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float l;
    public final AnimatorSet m;
    public final RectF n;
    public final RectF o;
    public org.telegram.ui.Cells.w0 p;
    public final i6 q;
    public float r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public final long w;
    public final g6 x;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Runnable, org.telegram.ui.Wallet.g6] */
    /* JADX WARN: Type inference failed for: r7v0, types: [org.telegram.ui.Wallet.g6] */
    public k6(ViewGroup viewGroup, View view, s6 s6Var, sn snVar, TL_wallet.walletTransaction wallettransaction, Runnable runnable, ti tiVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.m = animatorSet;
        this.o = new RectF();
        this.w = SystemClock.uptimeMillis();
        final int i10 = 0;
        ?? r12 = new Runnable(this) { // from class: org.telegram.ui.Wallet.g6
            public final /* synthetic */ k6 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        k6 k6Var = this.b;
                        s6 s6Var2 = k6Var.d;
                        float f7 = k6Var.l;
                        ViewGroup viewGroup2 = k6Var.a;
                        i6 i6Var = k6Var.q;
                        AnimatorSet animatorSet2 = k6Var.m;
                        s6 s6Var3 = k6Var.i;
                        RectF rectF = k6Var.o;
                        RectF rectF2 = k6Var.n;
                        if (!k6Var.v && !k6Var.u) {
                            k6Var.e();
                            k6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.w0 u82 = k6Var.e.u8(k6Var.f);
                            if (u82 != null && u82.getWidth() > 0) {
                                org.telegram.ui.Cells.w0 w0Var = k6Var.p;
                                if (w0Var != u82) {
                                    if (w0Var != null) {
                                        w0Var.I0.k(false);
                                    }
                                    k6Var.p = u82;
                                }
                                k3 k3Var = k6Var.p.I0.m;
                                if (k6Var.t && i6Var.n && k3Var != null && k3Var.n && k3Var.getWidth() > 0 && !k6Var.p.isLayoutRequested()) {
                                    rectF.set(k6Var.c(k3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        k6Var.u = true;
                                        k6Var.p.I0.k(true);
                                        s6Var3.f(s6Var2);
                                        s6Var3.setAlpha(f7);
                                        s6Var2.setAlpha(0.0f);
                                        k6Var.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    } else {
                                        rectF.setEmpty();
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - k6Var.w <= 700 && !k6Var.s && viewGroup2.isAttachedToWindow()) {
                                k6Var.h.postOnAnimation(k6Var.x);
                                break;
                            } else {
                                k6Var.u = true;
                                s6Var3.setAlpha(0.0f);
                                i6Var.setAlpha(0.0f);
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
        this.d = s6Var;
        this.l = s6Var.getAlpha();
        this.e = snVar;
        this.f = wallettransaction;
        this.g = runnable;
        RectF a2 = aa.a(viewGroup, s6Var);
        this.n = a2;
        e();
        h6 h6Var = new h6(this, viewGroup.getContext());
        this.h = h6Var;
        h6Var.setClipChildren(false);
        h6Var.setClipToPadding(false);
        final int i11 = 1;
        h6Var.setClickable(true);
        s6 s6Var2 = new s6(60, viewGroup.getContext(), true);
        this.i = s6Var2;
        s6Var2.setContinuousRotation(540.0f);
        s6Var2.f(s6Var);
        s6Var2.setAlpha(0.0f);
        h6Var.addView(s6Var2, w7.z5.e(60, 60, 51));
        i6 i6Var = new i6(this, viewGroup.getContext(), new Runnable(this) { // from class: org.telegram.ui.Wallet.g6
            public final /* synthetic */ k6 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        k6 k6Var = this.b;
                        s6 s6Var22 = k6Var.d;
                        float f7 = k6Var.l;
                        ViewGroup viewGroup2 = k6Var.a;
                        i6 i6Var2 = k6Var.q;
                        AnimatorSet animatorSet2 = k6Var.m;
                        s6 s6Var3 = k6Var.i;
                        RectF rectF = k6Var.o;
                        RectF rectF2 = k6Var.n;
                        if (!k6Var.v && !k6Var.u) {
                            k6Var.e();
                            k6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.w0 u82 = k6Var.e.u8(k6Var.f);
                            if (u82 != null && u82.getWidth() > 0) {
                                org.telegram.ui.Cells.w0 w0Var = k6Var.p;
                                if (w0Var != u82) {
                                    if (w0Var != null) {
                                        w0Var.I0.k(false);
                                    }
                                    k6Var.p = u82;
                                }
                                k3 k3Var = k6Var.p.I0.m;
                                if (k6Var.t && i6Var2.n && k3Var != null && k3Var.n && k3Var.getWidth() > 0 && !k6Var.p.isLayoutRequested()) {
                                    rectF.set(k6Var.c(k3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        k6Var.u = true;
                                        k6Var.p.I0.k(true);
                                        s6Var3.f(s6Var22);
                                        s6Var3.setAlpha(f7);
                                        s6Var22.setAlpha(0.0f);
                                        k6Var.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    } else {
                                        rectF.setEmpty();
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - k6Var.w <= 700 && !k6Var.s && viewGroup2.isAttachedToWindow()) {
                                k6Var.h.postOnAnimation(k6Var.x);
                                break;
                            } else {
                                k6Var.u = true;
                                s6Var3.setAlpha(0.0f);
                                i6Var2.setAlpha(0.0f);
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
        this.q = i6Var;
        i6Var.setAlpha(0.001f);
        i6Var.setPaused(false);
        h6Var.addView(i6Var, w7.z5.e(60, 60, 51));
        viewGroup.addView(h6Var, new ViewGroup.LayoutParams(-1, -1));
        b(a2.centerX(), a2.centerY(), a2.width());
        final int i12 = 2;
        s6Var2.l(new Runnable(this) { // from class: org.telegram.ui.Wallet.g6
            public final /* synthetic */ k6 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        k6 k6Var = this.b;
                        s6 s6Var22 = k6Var.d;
                        float f7 = k6Var.l;
                        ViewGroup viewGroup2 = k6Var.a;
                        i6 i6Var2 = k6Var.q;
                        AnimatorSet animatorSet2 = k6Var.m;
                        s6 s6Var3 = k6Var.i;
                        RectF rectF = k6Var.o;
                        RectF rectF2 = k6Var.n;
                        if (!k6Var.v && !k6Var.u) {
                            k6Var.e();
                            k6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.w0 u82 = k6Var.e.u8(k6Var.f);
                            if (u82 != null && u82.getWidth() > 0) {
                                org.telegram.ui.Cells.w0 w0Var = k6Var.p;
                                if (w0Var != u82) {
                                    if (w0Var != null) {
                                        w0Var.I0.k(false);
                                    }
                                    k6Var.p = u82;
                                }
                                k3 k3Var = k6Var.p.I0.m;
                                if (k6Var.t && i6Var2.n && k3Var != null && k3Var.n && k3Var.getWidth() > 0 && !k6Var.p.isLayoutRequested()) {
                                    rectF.set(k6Var.c(k3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        k6Var.u = true;
                                        k6Var.p.I0.k(true);
                                        s6Var3.f(s6Var22);
                                        s6Var3.setAlpha(f7);
                                        s6Var22.setAlpha(0.0f);
                                        k6Var.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    } else {
                                        rectF.setEmpty();
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - k6Var.w <= 700 && !k6Var.s && viewGroup2.isAttachedToWindow()) {
                                k6Var.h.postOnAnimation(k6Var.x);
                                break;
                            } else {
                                k6Var.u = true;
                                s6Var3.setAlpha(0.0f);
                                i6Var2.setAlpha(0.0f);
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
        ofFloat.addUpdateListener(new u2(this, 4));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new j6(this, tiVar, s6Var));
        h6Var.post(r12);
    }

    public final void a(boolean z10) {
        if (this.v) {
            return;
        }
        this.v = true;
        g6 g6Var = this.x;
        h6 h6Var = this.h;
        h6Var.removeCallbacks(g6Var);
        s6 s6Var = this.i;
        s6Var.l(null);
        org.telegram.ui.Cells.w0 w0Var = this.p;
        if (w0Var != null) {
            w0Var.I0.k(false);
            if (z10 && this.r >= 1.0f) {
                RectF rectF = this.o;
                if (!rectF.isEmpty() && this.p.isAttachedToWindow() && m0.G(this.p.getMessageObject(), this.f)) {
                    float centerY = (((rectF.centerY() - (Math.min(this.n.centerY(), rectF.centerY()) - AndroidUtilities.dp(150.0f))) * 2.0f) / 0.6f) / AndroidUtilities.density;
                    l3 l3Var = this.p.I0;
                    l3Var.n();
                    o1.k kVar = new o1.k(new o1.j(0.0f));
                    l3Var.b0 = kVar;
                    o1.l lVar = new o1.l(0.0f);
                    lVar.a(0.65f);
                    lVar.b(200.0f);
                    kVar.u = lVar;
                    l3Var.b0.e(0.001f);
                    l3Var.b0.a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                    l3Var.b0.b(new f3(l3Var, 1));
                    l3Var.b0.h();
                }
            }
        }
        i6 i6Var = this.q;
        i6Var.setPaused(true);
        h6Var.removeView(i6Var);
        s6Var.setPaused(true);
        h6Var.removeView(s6Var);
        h6Var.setClickable(false);
        this.d.setAlpha(this.l);
        ti tiVar = this.c;
        if (tiVar == null) {
            this.b.setTranslationY(0.0f);
        } else {
            tiVar.M1(1.0f);
        }
        ViewGroup viewGroup = this.a;
        if (tiVar != null && z10 && this.j.d()) {
            sn snVar = this.e;
            if (snVar.getParentLayout() != null) {
                ViewGroup view = snVar.getParentLayout().getView();
                if (view.isAttachedToWindow()) {
                    viewGroup.getLocationOnScreen(new int[2]);
                    view.getLocationOnScreen(new int[2]);
                    viewGroup.removeView(h6Var);
                    h6Var.setTranslationX(r4[0] - r1[0]);
                    h6Var.setTranslationY(r4[1] - r1[1]);
                    view.addView(h6Var, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.g.run();
        AndroidUtilities.runOnUIThread(new u3(9, this, viewGroup), 650L);
    }

    public final void b(float f7, float f10, float f11) {
        float dp = AndroidUtilities.dp(60.0f);
        h6 h6Var = this.h;
        float f12 = dp / 2.0f;
        s6 s6Var = this.i;
        s6Var.setTranslationX((f7 - h6Var.getLeft()) - f12);
        s6Var.setTranslationY((f10 - h6Var.getTop()) - f12);
        float f13 = f11 / dp;
        s6Var.setScaleX(f13);
        s6Var.setScaleY(f13);
        float translationX = s6Var.getTranslationX();
        i6 i6Var = this.q;
        i6Var.setTranslationX(translationX);
        i6Var.setTranslationY(s6Var.getTranslationY());
        i6Var.setScaleX(f13);
        i6Var.setScaleY(f13);
    }

    public final RectF c(k3 k3Var) {
        ti tiVar = this.c;
        ViewGroup viewGroup = this.a;
        if (tiVar == null) {
            return aa.a(viewGroup, k3Var);
        }
        ViewGroup viewGroup2 = (ViewGroup) k3Var.getRootView();
        RectF a2 = aa.a(viewGroup2, k3Var);
        int[] iArr = new int[2];
        viewGroup2.getLocationOnScreen(iArr);
        a2.offset(iArr[0], iArr[1]);
        viewGroup.getLocationOnScreen(iArr);
        a2.offset(-iArr[0], -iArr[1]);
        return a2;
    }

    public final void d() {
        i6 i6Var = this.q;
        if (i6Var == null) {
            return;
        }
        s6 s6Var = this.i;
        float flightYaw = s6Var.getFlightYaw();
        float flightPitch = s6Var.getFlightPitch();
        if (this.p != null) {
            float max = Math.max(0.0f, Math.min(1.0f, (this.r - 0.55f) / 0.45f));
            float B = com.google.android.gms.internal.play_billing.k3.B(max, 2.0f, 3.0f, max * max);
            flightYaw += ((float) Math.IEEEremainder(this.p.I0.i() - flightYaw, 6.283185307179586d)) * B;
            flightPitch += ((this.p.I0.k.E * 0.14f) - flightPitch) * B;
        }
        i6Var.r = flightYaw;
        i6Var.s = flightPitch;
        i6Var.v = true;
        i6Var.w = true;
    }

    public final void e() {
        s6 s6Var = this.d;
        if (s6Var.isAttachedToWindow()) {
            View rootView = s6Var.getRootView();
            ViewGroup viewGroup = this.a;
            if (rootView != viewGroup.getRootView()) {
                return;
            }
            ti tiVar = this.c;
            RectF rectF = this.n;
            if (tiVar == null) {
                aa.f(s6Var, this.b, viewGroup, rectF);
            } else {
                rectF.set(aa.a(viewGroup, s6Var));
                rectF.offset(0.0f, tiVar.o2 - tiVar.y0);
            }
        }
    }
}
