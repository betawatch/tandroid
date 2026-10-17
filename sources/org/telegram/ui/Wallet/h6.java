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

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class h6 {
    public final ViewGroup a;
    public final View b;
    public final ti c;
    public final p6 d;
    public final sn e;
    public final TL_wallet.walletTransaction f;
    public final Runnable g;
    public final e6 h;
    public final p6 i;
    public final n9 j = new n9();
    public final PathInterpolator k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float l;
    public final AnimatorSet m;
    public final RectF n;
    public final RectF o;
    public org.telegram.ui.Cells.x0 p;
    public final f6 q;
    public float r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public final long w;
    public final d6 x;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Runnable, org.telegram.ui.Wallet.d6] */
    /* JADX WARN: Type inference failed for: r7v0, types: [org.telegram.ui.Wallet.d6] */
    public h6(ViewGroup viewGroup, View view, p6 p6Var, sn snVar, TL_wallet.walletTransaction wallettransaction, Runnable runnable, ti tiVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.m = animatorSet;
        this.o = new RectF();
        this.w = SystemClock.uptimeMillis();
        final int i10 = 0;
        ?? r12 = new Runnable(this) { // from class: org.telegram.ui.Wallet.d6
            public final /* synthetic */ h6 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        h6 h6Var = this.b;
                        p6 p6Var2 = h6Var.d;
                        float f7 = h6Var.l;
                        ViewGroup viewGroup2 = h6Var.a;
                        f6 f6Var = h6Var.q;
                        AnimatorSet animatorSet2 = h6Var.m;
                        p6 p6Var3 = h6Var.i;
                        RectF rectF = h6Var.o;
                        RectF rectF2 = h6Var.n;
                        if (!h6Var.v && !h6Var.u) {
                            h6Var.e();
                            h6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.x0 u82 = h6Var.e.u8(h6Var.f);
                            if (u82 != null && u82.getWidth() > 0) {
                                org.telegram.ui.Cells.x0 x0Var = h6Var.p;
                                if (x0Var != u82) {
                                    if (x0Var != null) {
                                        x0Var.I0.k(false);
                                    }
                                    h6Var.p = u82;
                                }
                                j3 j3Var = h6Var.p.I0.m;
                                if (h6Var.t && f6Var.n && j3Var != null && j3Var.n && j3Var.getWidth() > 0 && !h6Var.p.isLayoutRequested()) {
                                    rectF.set(h6Var.c(j3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        h6Var.u = true;
                                        h6Var.p.I0.k(true);
                                        p6Var3.f(p6Var2);
                                        p6Var3.setAlpha(f7);
                                        p6Var2.setAlpha(0.0f);
                                        h6Var.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    } else {
                                        rectF.setEmpty();
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - h6Var.w <= 700 && !h6Var.s && viewGroup2.isAttachedToWindow()) {
                                h6Var.h.postOnAnimation(h6Var.x);
                                break;
                            } else {
                                h6Var.u = true;
                                p6Var3.setAlpha(0.0f);
                                f6Var.setAlpha(0.0f);
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
        this.d = p6Var;
        this.l = p6Var.getAlpha();
        this.e = snVar;
        this.f = wallettransaction;
        this.g = runnable;
        RectF a2 = x9.a(viewGroup, p6Var);
        this.n = a2;
        e();
        e6 e6Var = new e6(this, viewGroup.getContext());
        this.h = e6Var;
        e6Var.setClipChildren(false);
        e6Var.setClipToPadding(false);
        final int i11 = 1;
        e6Var.setClickable(true);
        p6 p6Var2 = new p6(60, viewGroup.getContext(), true);
        this.i = p6Var2;
        p6Var2.setContinuousRotation(540.0f);
        p6Var2.f(p6Var);
        p6Var2.setAlpha(0.0f);
        e6Var.addView(p6Var2, w7.z5.e(60, 60, 51));
        f6 f6Var = new f6(this, viewGroup.getContext(), new Runnable(this) { // from class: org.telegram.ui.Wallet.d6
            public final /* synthetic */ h6 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        h6 h6Var = this.b;
                        p6 p6Var22 = h6Var.d;
                        float f7 = h6Var.l;
                        ViewGroup viewGroup2 = h6Var.a;
                        f6 f6Var2 = h6Var.q;
                        AnimatorSet animatorSet2 = h6Var.m;
                        p6 p6Var3 = h6Var.i;
                        RectF rectF = h6Var.o;
                        RectF rectF2 = h6Var.n;
                        if (!h6Var.v && !h6Var.u) {
                            h6Var.e();
                            h6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.x0 u82 = h6Var.e.u8(h6Var.f);
                            if (u82 != null && u82.getWidth() > 0) {
                                org.telegram.ui.Cells.x0 x0Var = h6Var.p;
                                if (x0Var != u82) {
                                    if (x0Var != null) {
                                        x0Var.I0.k(false);
                                    }
                                    h6Var.p = u82;
                                }
                                j3 j3Var = h6Var.p.I0.m;
                                if (h6Var.t && f6Var2.n && j3Var != null && j3Var.n && j3Var.getWidth() > 0 && !h6Var.p.isLayoutRequested()) {
                                    rectF.set(h6Var.c(j3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        h6Var.u = true;
                                        h6Var.p.I0.k(true);
                                        p6Var3.f(p6Var22);
                                        p6Var3.setAlpha(f7);
                                        p6Var22.setAlpha(0.0f);
                                        h6Var.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    } else {
                                        rectF.setEmpty();
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - h6Var.w <= 700 && !h6Var.s && viewGroup2.isAttachedToWindow()) {
                                h6Var.h.postOnAnimation(h6Var.x);
                                break;
                            } else {
                                h6Var.u = true;
                                p6Var3.setAlpha(0.0f);
                                f6Var2.setAlpha(0.0f);
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
        this.q = f6Var;
        f6Var.setAlpha(0.001f);
        f6Var.setPaused(false);
        e6Var.addView(f6Var, w7.z5.e(60, 60, 51));
        viewGroup.addView(e6Var, new ViewGroup.LayoutParams(-1, -1));
        b(a2.centerX(), a2.centerY(), a2.width());
        final int i12 = 2;
        p6Var2.l(new Runnable(this) { // from class: org.telegram.ui.Wallet.d6
            public final /* synthetic */ h6 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        h6 h6Var = this.b;
                        p6 p6Var22 = h6Var.d;
                        float f7 = h6Var.l;
                        ViewGroup viewGroup2 = h6Var.a;
                        f6 f6Var2 = h6Var.q;
                        AnimatorSet animatorSet2 = h6Var.m;
                        p6 p6Var3 = h6Var.i;
                        RectF rectF = h6Var.o;
                        RectF rectF2 = h6Var.n;
                        if (!h6Var.v && !h6Var.u) {
                            h6Var.e();
                            h6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.x0 u82 = h6Var.e.u8(h6Var.f);
                            if (u82 != null && u82.getWidth() > 0) {
                                org.telegram.ui.Cells.x0 x0Var = h6Var.p;
                                if (x0Var != u82) {
                                    if (x0Var != null) {
                                        x0Var.I0.k(false);
                                    }
                                    h6Var.p = u82;
                                }
                                j3 j3Var = h6Var.p.I0.m;
                                if (h6Var.t && f6Var2.n && j3Var != null && j3Var.n && j3Var.getWidth() > 0 && !h6Var.p.isLayoutRequested()) {
                                    rectF.set(h6Var.c(j3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        h6Var.u = true;
                                        h6Var.p.I0.k(true);
                                        p6Var3.f(p6Var22);
                                        p6Var3.setAlpha(f7);
                                        p6Var22.setAlpha(0.0f);
                                        h6Var.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    } else {
                                        rectF.setEmpty();
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - h6Var.w <= 700 && !h6Var.s && viewGroup2.isAttachedToWindow()) {
                                h6Var.h.postOnAnimation(h6Var.x);
                                break;
                            } else {
                                h6Var.u = true;
                                p6Var3.setAlpha(0.0f);
                                f6Var2.setAlpha(0.0f);
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
        animatorSet.addListener(new g6(this, tiVar, p6Var));
        e6Var.post(r12);
    }

    public final void a(boolean z10) {
        if (this.v) {
            return;
        }
        this.v = true;
        d6 d6Var = this.x;
        e6 e6Var = this.h;
        e6Var.removeCallbacks(d6Var);
        p6 p6Var = this.i;
        p6Var.l(null);
        org.telegram.ui.Cells.x0 x0Var = this.p;
        if (x0Var != null) {
            x0Var.I0.k(false);
            if (z10 && this.r >= 1.0f) {
                RectF rectF = this.o;
                if (!rectF.isEmpty() && this.p.isAttachedToWindow() && m0.G(this.p.getMessageObject(), this.f)) {
                    float centerY = (((rectF.centerY() - (Math.min(this.n.centerY(), rectF.centerY()) - AndroidUtilities.dp(150.0f))) * 2.0f) / 0.6f) / AndroidUtilities.density;
                    k3 k3Var = this.p.I0;
                    k3Var.n();
                    o1.k kVar = new o1.k(new o1.j(0.0f));
                    k3Var.b0 = kVar;
                    o1.l lVar = new o1.l(0.0f);
                    lVar.a(0.65f);
                    lVar.b(200.0f);
                    kVar.u = lVar;
                    k3Var.b0.e(0.001f);
                    k3Var.b0.a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                    k3Var.b0.b(new e3(k3Var, 1));
                    k3Var.b0.h();
                }
            }
        }
        f6 f6Var = this.q;
        f6Var.setPaused(true);
        e6Var.removeView(f6Var);
        p6Var.setPaused(true);
        e6Var.removeView(p6Var);
        e6Var.setClickable(false);
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
                    viewGroup.removeView(e6Var);
                    e6Var.setTranslationX(r4[0] - r1[0]);
                    e6Var.setTranslationY(r4[1] - r1[1]);
                    view.addView(e6Var, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.g.run();
        AndroidUtilities.runOnUIThread(new t3(9, this, viewGroup), 650L);
    }

    public final void b(float f7, float f10, float f11) {
        float dp = AndroidUtilities.dp(60.0f);
        e6 e6Var = this.h;
        float f12 = dp / 2.0f;
        p6 p6Var = this.i;
        p6Var.setTranslationX((f7 - e6Var.getLeft()) - f12);
        p6Var.setTranslationY((f10 - e6Var.getTop()) - f12);
        float f13 = f11 / dp;
        p6Var.setScaleX(f13);
        p6Var.setScaleY(f13);
        float translationX = p6Var.getTranslationX();
        f6 f6Var = this.q;
        f6Var.setTranslationX(translationX);
        f6Var.setTranslationY(p6Var.getTranslationY());
        f6Var.setScaleX(f13);
        f6Var.setScaleY(f13);
    }

    public final RectF c(j3 j3Var) {
        ti tiVar = this.c;
        ViewGroup viewGroup = this.a;
        if (tiVar == null) {
            return x9.a(viewGroup, j3Var);
        }
        ViewGroup viewGroup2 = (ViewGroup) j3Var.getRootView();
        RectF a2 = x9.a(viewGroup2, j3Var);
        int[] iArr = new int[2];
        viewGroup2.getLocationOnScreen(iArr);
        a2.offset(iArr[0], iArr[1]);
        viewGroup.getLocationOnScreen(iArr);
        a2.offset(-iArr[0], -iArr[1]);
        return a2;
    }

    public final void d() {
        f6 f6Var = this.q;
        if (f6Var == null) {
            return;
        }
        p6 p6Var = this.i;
        float flightYaw = p6Var.getFlightYaw();
        float flightPitch = p6Var.getFlightPitch();
        if (this.p != null) {
            float max = Math.max(0.0f, Math.min(1.0f, (this.r - 0.55f) / 0.45f));
            float B = com.google.android.gms.internal.cast.a6.B(max, 2.0f, 3.0f, max * max);
            flightYaw += ((float) Math.IEEEremainder(this.p.I0.i() - flightYaw, 6.283185307179586d)) * B;
            flightPitch += ((this.p.I0.k.E * 0.14f) - flightPitch) * B;
        }
        f6Var.r = flightYaw;
        f6Var.s = flightPitch;
        f6Var.v = true;
        f6Var.w = true;
    }

    public final void e() {
        p6 p6Var = this.d;
        if (p6Var.isAttachedToWindow()) {
            View rootView = p6Var.getRootView();
            ViewGroup viewGroup = this.a;
            if (rootView != viewGroup.getRootView()) {
                return;
            }
            ti tiVar = this.c;
            RectF rectF = this.n;
            if (tiVar == null) {
                x9.f(p6Var, this.b, viewGroup, rectF);
            } else {
                rectF.set(x9.a(viewGroup, p6Var));
                rectF.offset(0.0f, tiVar.o2 - tiVar.y0);
            }
        }
    }
}
