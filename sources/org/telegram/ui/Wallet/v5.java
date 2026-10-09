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
import org.telegram.ui.Components.yi;
import org.telegram.ui.ii1;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class v5 {
    public final ViewGroup a;
    public final View b;
    public final yi c;
    public final c6 d;
    public final zn e;
    public final TL_wallet.walletTransaction f;
    public final Runnable g;
    public final s5 h;
    public final c6 i;
    public final l8 j = new l8();
    public final PathInterpolator k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float l;
    public final AnimatorSet m;
    public final RectF n;
    public final RectF o;
    public org.telegram.ui.Cells.w0 p;
    public final t5 q;
    public float r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public final long w;
    public final r5 x;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Runnable, org.telegram.ui.Wallet.r5] */
    /* JADX WARN: Type inference failed for: r7v0, types: [org.telegram.ui.Wallet.r5] */
    public v5(ViewGroup viewGroup, View view, c6 c6Var, zn znVar, TL_wallet.walletTransaction wallettransaction, Runnable runnable, yi yiVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.m = animatorSet;
        this.o = new RectF();
        this.w = SystemClock.uptimeMillis();
        final int i10 = 0;
        ?? r12 = new Runnable(this) { // from class: org.telegram.ui.Wallet.r5
            public final /* synthetic */ v5 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        v5 v5Var = this.b;
                        c6 c6Var2 = v5Var.d;
                        float f7 = v5Var.l;
                        ViewGroup viewGroup2 = v5Var.a;
                        t5 t5Var = v5Var.q;
                        AnimatorSet animatorSet2 = v5Var.m;
                        c6 c6Var3 = v5Var.i;
                        RectF rectF = v5Var.o;
                        RectF rectF2 = v5Var.n;
                        if (!v5Var.v && !v5Var.u) {
                            v5Var.e();
                            v5Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.w0 u82 = v5Var.e.u8(v5Var.f);
                            if (u82 != null && u82.getWidth() > 0) {
                                org.telegram.ui.Cells.w0 w0Var = v5Var.p;
                                if (w0Var != u82) {
                                    if (w0Var != null) {
                                        w0Var.I0.i(false);
                                    }
                                    v5Var.p = u82;
                                }
                                c3 c3Var = v5Var.p.I0.m;
                                if (v5Var.t && t5Var.h && c3Var != null && c3Var.h && c3Var.getWidth() > 0 && !v5Var.p.isLayoutRequested()) {
                                    rectF.set(v5Var.c(c3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        v5Var.u = true;
                                        v5Var.p.I0.i(true);
                                        c6Var3.f(c6Var2);
                                        c6Var3.setAlpha(f7);
                                        c6Var2.setAlpha(0.0f);
                                        v5Var.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    } else {
                                        rectF.setEmpty();
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - v5Var.w <= 700 && !v5Var.s && viewGroup2.isAttachedToWindow()) {
                                v5Var.h.postOnAnimation(v5Var.x);
                                break;
                            } else {
                                v5Var.u = true;
                                c6Var3.setAlpha(0.0f);
                                t5Var.setAlpha(0.0f);
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
        this.c = yiVar;
        this.a = viewGroup;
        this.b = view;
        this.d = c6Var;
        this.l = c6Var.getAlpha();
        this.e = znVar;
        this.f = wallettransaction;
        this.g = runnable;
        RectF a2 = w8.a(viewGroup, c6Var);
        this.n = a2;
        e();
        s5 s5Var = new s5(this, viewGroup.getContext());
        this.h = s5Var;
        s5Var.setClipChildren(false);
        s5Var.setClipToPadding(false);
        final int i11 = 1;
        s5Var.setClickable(true);
        c6 c6Var2 = new c6(60, viewGroup.getContext(), true);
        this.i = c6Var2;
        c6Var2.setContinuousRotation(540.0f);
        c6Var2.f(c6Var);
        c6Var2.setAlpha(0.0f);
        s5Var.addView(c6Var2, w7.x5.e(60, 60, 51));
        t5 t5Var = new t5(this, viewGroup.getContext(), new Runnable(this) { // from class: org.telegram.ui.Wallet.r5
            public final /* synthetic */ v5 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        v5 v5Var = this.b;
                        c6 c6Var22 = v5Var.d;
                        float f7 = v5Var.l;
                        ViewGroup viewGroup2 = v5Var.a;
                        t5 t5Var2 = v5Var.q;
                        AnimatorSet animatorSet2 = v5Var.m;
                        c6 c6Var3 = v5Var.i;
                        RectF rectF = v5Var.o;
                        RectF rectF2 = v5Var.n;
                        if (!v5Var.v && !v5Var.u) {
                            v5Var.e();
                            v5Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.w0 u82 = v5Var.e.u8(v5Var.f);
                            if (u82 != null && u82.getWidth() > 0) {
                                org.telegram.ui.Cells.w0 w0Var = v5Var.p;
                                if (w0Var != u82) {
                                    if (w0Var != null) {
                                        w0Var.I0.i(false);
                                    }
                                    v5Var.p = u82;
                                }
                                c3 c3Var = v5Var.p.I0.m;
                                if (v5Var.t && t5Var2.h && c3Var != null && c3Var.h && c3Var.getWidth() > 0 && !v5Var.p.isLayoutRequested()) {
                                    rectF.set(v5Var.c(c3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        v5Var.u = true;
                                        v5Var.p.I0.i(true);
                                        c6Var3.f(c6Var22);
                                        c6Var3.setAlpha(f7);
                                        c6Var22.setAlpha(0.0f);
                                        v5Var.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    } else {
                                        rectF.setEmpty();
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - v5Var.w <= 700 && !v5Var.s && viewGroup2.isAttachedToWindow()) {
                                v5Var.h.postOnAnimation(v5Var.x);
                                break;
                            } else {
                                v5Var.u = true;
                                c6Var3.setAlpha(0.0f);
                                t5Var2.setAlpha(0.0f);
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
        this.q = t5Var;
        t5Var.setAlpha(0.001f);
        t5Var.setPaused(false);
        s5Var.addView(t5Var, w7.x5.e(60, 60, 51));
        viewGroup.addView(s5Var, new ViewGroup.LayoutParams(-1, -1));
        b(a2.centerX(), a2.centerY(), a2.width());
        final int i12 = 2;
        c6Var2.l(new Runnable(this) { // from class: org.telegram.ui.Wallet.r5
            public final /* synthetic */ v5 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        v5 v5Var = this.b;
                        c6 c6Var22 = v5Var.d;
                        float f7 = v5Var.l;
                        ViewGroup viewGroup2 = v5Var.a;
                        t5 t5Var2 = v5Var.q;
                        AnimatorSet animatorSet2 = v5Var.m;
                        c6 c6Var3 = v5Var.i;
                        RectF rectF = v5Var.o;
                        RectF rectF2 = v5Var.n;
                        if (!v5Var.v && !v5Var.u) {
                            v5Var.e();
                            v5Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.w0 u82 = v5Var.e.u8(v5Var.f);
                            if (u82 != null && u82.getWidth() > 0) {
                                org.telegram.ui.Cells.w0 w0Var = v5Var.p;
                                if (w0Var != u82) {
                                    if (w0Var != null) {
                                        w0Var.I0.i(false);
                                    }
                                    v5Var.p = u82;
                                }
                                c3 c3Var = v5Var.p.I0.m;
                                if (v5Var.t && t5Var2.h && c3Var != null && c3Var.h && c3Var.getWidth() > 0 && !v5Var.p.isLayoutRequested()) {
                                    rectF.set(v5Var.c(c3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        v5Var.u = true;
                                        v5Var.p.I0.i(true);
                                        c6Var3.f(c6Var22);
                                        c6Var3.setAlpha(f7);
                                        c6Var22.setAlpha(0.0f);
                                        v5Var.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    } else {
                                        rectF.setEmpty();
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - v5Var.w <= 700 && !v5Var.s && viewGroup2.isAttachedToWindow()) {
                                v5Var.h.postOnAnimation(v5Var.x);
                                break;
                            } else {
                                v5Var.u = true;
                                c6Var3.setAlpha(0.0f);
                                t5Var2.setAlpha(0.0f);
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
        animatorSet.addListener(new u5(this, yiVar, c6Var));
        s5Var.post(r12);
    }

    public final void a(boolean z10) {
        if (this.v) {
            return;
        }
        this.v = true;
        r5 r5Var = this.x;
        s5 s5Var = this.h;
        s5Var.removeCallbacks(r5Var);
        c6 c6Var = this.i;
        c6Var.l(null);
        org.telegram.ui.Cells.w0 w0Var = this.p;
        if (w0Var != null) {
            w0Var.I0.i(false);
            if (z10 && this.r >= 1.0f) {
                RectF rectF = this.o;
                if (!rectF.isEmpty() && this.p.isAttachedToWindow() && k0.F(this.p.getMessageObject(), this.f)) {
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
        t5 t5Var = this.q;
        t5Var.setPaused(true);
        s5Var.removeView(t5Var);
        c6Var.setPaused(true);
        s5Var.removeView(c6Var);
        s5Var.setClickable(false);
        this.d.setAlpha(this.l);
        yi yiVar = this.c;
        if (yiVar == null) {
            this.b.setTranslationY(0.0f);
        } else {
            yiVar.M1(1.0f);
        }
        ViewGroup viewGroup = this.a;
        if (yiVar != null && z10 && this.j.d()) {
            zn znVar = this.e;
            if (znVar.getParentLayout() != null) {
                ViewGroup view = znVar.getParentLayout().getView();
                if (view.isAttachedToWindow()) {
                    viewGroup.getLocationOnScreen(new int[2]);
                    view.getLocationOnScreen(new int[2]);
                    viewGroup.removeView(s5Var);
                    s5Var.setTranslationX(r4[0] - r1[0]);
                    s5Var.setTranslationY(r4[1] - r1[1]);
                    view.addView(s5Var, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.g.run();
        AndroidUtilities.runOnUIThread(new ii1(13, this, viewGroup), 650L);
    }

    public final void b(float f7, float f10, float f11) {
        float dp = AndroidUtilities.dp(60.0f);
        s5 s5Var = this.h;
        float f12 = dp / 2.0f;
        c6 c6Var = this.i;
        c6Var.setTranslationX((f7 - s5Var.getLeft()) - f12);
        c6Var.setTranslationY((f10 - s5Var.getTop()) - f12);
        float f13 = f11 / dp;
        c6Var.setScaleX(f13);
        c6Var.setScaleY(f13);
        float translationX = c6Var.getTranslationX();
        t5 t5Var = this.q;
        t5Var.setTranslationX(translationX);
        t5Var.setTranslationY(c6Var.getTranslationY());
        t5Var.setScaleX(f13);
        t5Var.setScaleY(f13);
    }

    public final RectF c(c3 c3Var) {
        yi yiVar = this.c;
        ViewGroup viewGroup = this.a;
        if (yiVar == null) {
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
        t5 t5Var = this.q;
        if (t5Var == null) {
            return;
        }
        c6 c6Var = this.i;
        float flightYaw = c6Var.getFlightYaw();
        float flightPitch = c6Var.getFlightPitch();
        if (this.p != null) {
            float max = Math.max(0.0f, Math.min(1.0f, (this.r - 0.55f) / 0.45f));
            float B = com.google.android.gms.internal.vision.e2.B(max, 2.0f, 3.0f, max * max);
            flightYaw += ((float) Math.IEEEremainder(this.p.I0.g() - flightYaw, 6.283185307179586d)) * B;
            flightPitch += ((this.p.I0.k.E * 0.14f) - flightPitch) * B;
        }
        t5Var.n = flightYaw;
        t5Var.r = flightPitch;
        t5Var.s = true;
        t5Var.v = true;
    }

    public final void e() {
        c6 c6Var = this.d;
        if (c6Var.isAttachedToWindow()) {
            View rootView = c6Var.getRootView();
            ViewGroup viewGroup = this.a;
            if (rootView != viewGroup.getRootView()) {
                return;
            }
            yi yiVar = this.c;
            RectF rectF = this.n;
            if (yiVar == null) {
                w8.f(c6Var, this.b, viewGroup, rectF);
            } else {
                rectF.set(w8.a(viewGroup, c6Var));
                rectF.offset(0.0f, yiVar.o2 - yiVar.y0);
            }
        }
    }
}
