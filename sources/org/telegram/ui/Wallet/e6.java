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
import org.telegram.ui.qn;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class e6 {
    public final ViewGroup a;
    public final View b;
    public final ti c;
    public final m6 d;
    public final qn e;
    public final TL_wallet.walletTransaction f;
    public final Runnable g;
    public final b6 h;
    public final m6 i;
    public final k9 j = new k9();
    public final PathInterpolator k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float l;
    public final AnimatorSet m;
    public final RectF n;
    public final RectF o;
    public org.telegram.ui.Cells.w0 p;
    public final c6 q;
    public float r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public final long w;
    public final a6 x;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Runnable, org.telegram.ui.Wallet.a6] */
    /* JADX WARN: Type inference failed for: r7v0, types: [org.telegram.ui.Wallet.a6] */
    public e6(ViewGroup viewGroup, View view, m6 m6Var, qn qnVar, TL_wallet.walletTransaction wallettransaction, Runnable runnable, ti tiVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.m = animatorSet;
        this.o = new RectF();
        this.w = SystemClock.uptimeMillis();
        final int i10 = 0;
        ?? r12 = new Runnable(this) { // from class: org.telegram.ui.Wallet.a6
            public final /* synthetic */ e6 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        e6 e6Var = this.b;
                        m6 m6Var2 = e6Var.d;
                        float f7 = e6Var.l;
                        ViewGroup viewGroup2 = e6Var.a;
                        c6 c6Var = e6Var.q;
                        AnimatorSet animatorSet2 = e6Var.m;
                        m6 m6Var3 = e6Var.i;
                        RectF rectF = e6Var.o;
                        RectF rectF2 = e6Var.n;
                        if (!e6Var.v && !e6Var.u) {
                            e6Var.e();
                            e6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.w0 u82 = e6Var.e.u8(e6Var.f);
                            if (u82 != null && u82.getWidth() > 0) {
                                org.telegram.ui.Cells.w0 w0Var = e6Var.p;
                                if (w0Var != u82) {
                                    if (w0Var != null) {
                                        w0Var.I0.i(false);
                                    }
                                    e6Var.p = u82;
                                }
                                m3 m3Var = e6Var.p.I0.m;
                                if (e6Var.t && c6Var.n && m3Var != null && m3Var.n && m3Var.getWidth() > 0 && !e6Var.p.isLayoutRequested()) {
                                    rectF.set(e6Var.c(m3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        e6Var.u = true;
                                        e6Var.p.I0.i(true);
                                        m6Var3.f(m6Var2);
                                        m6Var3.setAlpha(f7);
                                        m6Var2.setAlpha(0.0f);
                                        e6Var.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    } else {
                                        rectF.setEmpty();
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - e6Var.w <= 700 && !e6Var.s && viewGroup2.isAttachedToWindow()) {
                                e6Var.h.postOnAnimation(e6Var.x);
                                break;
                            } else {
                                e6Var.u = true;
                                m6Var3.setAlpha(0.0f);
                                c6Var.setAlpha(0.0f);
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
        this.d = m6Var;
        this.l = m6Var.getAlpha();
        this.e = qnVar;
        this.f = wallettransaction;
        this.g = runnable;
        RectF a2 = v9.a(viewGroup, m6Var);
        this.n = a2;
        e();
        b6 b6Var = new b6(this, viewGroup.getContext());
        this.h = b6Var;
        b6Var.setClipChildren(false);
        b6Var.setClipToPadding(false);
        final int i11 = 1;
        b6Var.setClickable(true);
        m6 m6Var2 = new m6(60, viewGroup.getContext(), true);
        this.i = m6Var2;
        m6Var2.setContinuousRotation(540.0f);
        m6Var2.f(m6Var);
        m6Var2.setAlpha(0.0f);
        b6Var.addView(m6Var2, w7.z5.e(60, 60, 51));
        c6 c6Var = new c6(this, viewGroup.getContext(), new Runnable(this) { // from class: org.telegram.ui.Wallet.a6
            public final /* synthetic */ e6 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        e6 e6Var = this.b;
                        m6 m6Var22 = e6Var.d;
                        float f7 = e6Var.l;
                        ViewGroup viewGroup2 = e6Var.a;
                        c6 c6Var2 = e6Var.q;
                        AnimatorSet animatorSet2 = e6Var.m;
                        m6 m6Var3 = e6Var.i;
                        RectF rectF = e6Var.o;
                        RectF rectF2 = e6Var.n;
                        if (!e6Var.v && !e6Var.u) {
                            e6Var.e();
                            e6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.w0 u82 = e6Var.e.u8(e6Var.f);
                            if (u82 != null && u82.getWidth() > 0) {
                                org.telegram.ui.Cells.w0 w0Var = e6Var.p;
                                if (w0Var != u82) {
                                    if (w0Var != null) {
                                        w0Var.I0.i(false);
                                    }
                                    e6Var.p = u82;
                                }
                                m3 m3Var = e6Var.p.I0.m;
                                if (e6Var.t && c6Var2.n && m3Var != null && m3Var.n && m3Var.getWidth() > 0 && !e6Var.p.isLayoutRequested()) {
                                    rectF.set(e6Var.c(m3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        e6Var.u = true;
                                        e6Var.p.I0.i(true);
                                        m6Var3.f(m6Var22);
                                        m6Var3.setAlpha(f7);
                                        m6Var22.setAlpha(0.0f);
                                        e6Var.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    } else {
                                        rectF.setEmpty();
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - e6Var.w <= 700 && !e6Var.s && viewGroup2.isAttachedToWindow()) {
                                e6Var.h.postOnAnimation(e6Var.x);
                                break;
                            } else {
                                e6Var.u = true;
                                m6Var3.setAlpha(0.0f);
                                c6Var2.setAlpha(0.0f);
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
        this.q = c6Var;
        c6Var.setAlpha(0.001f);
        c6Var.setPaused(false);
        b6Var.addView(c6Var, w7.z5.e(60, 60, 51));
        viewGroup.addView(b6Var, new ViewGroup.LayoutParams(-1, -1));
        b(a2.centerX(), a2.centerY(), a2.width());
        final int i12 = 2;
        m6Var2.l(new Runnable(this) { // from class: org.telegram.ui.Wallet.a6
            public final /* synthetic */ e6 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        e6 e6Var = this.b;
                        m6 m6Var22 = e6Var.d;
                        float f7 = e6Var.l;
                        ViewGroup viewGroup2 = e6Var.a;
                        c6 c6Var2 = e6Var.q;
                        AnimatorSet animatorSet2 = e6Var.m;
                        m6 m6Var3 = e6Var.i;
                        RectF rectF = e6Var.o;
                        RectF rectF2 = e6Var.n;
                        if (!e6Var.v && !e6Var.u) {
                            e6Var.e();
                            e6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.w0 u82 = e6Var.e.u8(e6Var.f);
                            if (u82 != null && u82.getWidth() > 0) {
                                org.telegram.ui.Cells.w0 w0Var = e6Var.p;
                                if (w0Var != u82) {
                                    if (w0Var != null) {
                                        w0Var.I0.i(false);
                                    }
                                    e6Var.p = u82;
                                }
                                m3 m3Var = e6Var.p.I0.m;
                                if (e6Var.t && c6Var2.n && m3Var != null && m3Var.n && m3Var.getWidth() > 0 && !e6Var.p.isLayoutRequested()) {
                                    rectF.set(e6Var.c(m3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        e6Var.u = true;
                                        e6Var.p.I0.i(true);
                                        m6Var3.f(m6Var22);
                                        m6Var3.setAlpha(f7);
                                        m6Var22.setAlpha(0.0f);
                                        e6Var.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    } else {
                                        rectF.setEmpty();
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - e6Var.w <= 700 && !e6Var.s && viewGroup2.isAttachedToWindow()) {
                                e6Var.h.postOnAnimation(e6Var.x);
                                break;
                            } else {
                                e6Var.u = true;
                                m6Var3.setAlpha(0.0f);
                                c6Var2.setAlpha(0.0f);
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
        ofFloat.addUpdateListener(new b3(this, 3));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new d6(this, tiVar, m6Var));
        b6Var.post(r12);
    }

    public final void a(boolean z10) {
        if (this.v) {
            return;
        }
        this.v = true;
        a6 a6Var = this.x;
        b6 b6Var = this.h;
        b6Var.removeCallbacks(a6Var);
        m6 m6Var = this.i;
        m6Var.l(null);
        org.telegram.ui.Cells.w0 w0Var = this.p;
        if (w0Var != null) {
            w0Var.I0.i(false);
            if (z10 && this.r >= 1.0f) {
                RectF rectF = this.o;
                if (!rectF.isEmpty() && this.p.isAttachedToWindow() && m0.G(this.p.getMessageObject(), this.f)) {
                    float centerY = (((rectF.centerY() - (Math.min(this.n.centerY(), rectF.centerY()) - AndroidUtilities.dp(150.0f))) * 2.0f) / 0.6f) / AndroidUtilities.density;
                    n3 n3Var = this.p.I0;
                    n3Var.l();
                    o1.k kVar = new o1.k(new o1.j(0.0f));
                    n3Var.b0 = kVar;
                    o1.l lVar = new o1.l(0.0f);
                    lVar.a(0.65f);
                    lVar.b(200.0f);
                    kVar.u = lVar;
                    n3Var.b0.e(0.001f);
                    n3Var.b0.a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                    n3Var.b0.b(new h3(n3Var, 1));
                    n3Var.b0.h();
                }
            }
        }
        c6 c6Var = this.q;
        c6Var.setPaused(true);
        b6Var.removeView(c6Var);
        m6Var.setPaused(true);
        b6Var.removeView(m6Var);
        b6Var.setClickable(false);
        this.d.setAlpha(this.l);
        ti tiVar = this.c;
        if (tiVar == null) {
            this.b.setTranslationY(0.0f);
        } else {
            tiVar.M1(1.0f);
        }
        ViewGroup viewGroup = this.a;
        if (tiVar != null && z10 && this.j.d()) {
            qn qnVar = this.e;
            if (qnVar.getParentLayout() != null) {
                ViewGroup view = qnVar.getParentLayout().getView();
                if (view.isAttachedToWindow()) {
                    viewGroup.getLocationOnScreen(new int[2]);
                    view.getLocationOnScreen(new int[2]);
                    viewGroup.removeView(b6Var);
                    b6Var.setTranslationX(r4[0] - r1[0]);
                    b6Var.setTranslationY(r4[1] - r1[1]);
                    view.addView(b6Var, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.g.run();
        AndroidUtilities.runOnUIThread(new z3(9, this, viewGroup), 650L);
    }

    public final void b(float f7, float f10, float f11) {
        float dp = AndroidUtilities.dp(60.0f);
        b6 b6Var = this.h;
        float f12 = dp / 2.0f;
        m6 m6Var = this.i;
        m6Var.setTranslationX((f7 - b6Var.getLeft()) - f12);
        m6Var.setTranslationY((f10 - b6Var.getTop()) - f12);
        float f13 = f11 / dp;
        m6Var.setScaleX(f13);
        m6Var.setScaleY(f13);
        float translationX = m6Var.getTranslationX();
        c6 c6Var = this.q;
        c6Var.setTranslationX(translationX);
        c6Var.setTranslationY(m6Var.getTranslationY());
        c6Var.setScaleX(f13);
        c6Var.setScaleY(f13);
    }

    public final RectF c(m3 m3Var) {
        ti tiVar = this.c;
        ViewGroup viewGroup = this.a;
        if (tiVar == null) {
            return v9.a(viewGroup, m3Var);
        }
        ViewGroup viewGroup2 = (ViewGroup) m3Var.getRootView();
        RectF a2 = v9.a(viewGroup2, m3Var);
        int[] iArr = new int[2];
        viewGroup2.getLocationOnScreen(iArr);
        a2.offset(iArr[0], iArr[1]);
        viewGroup.getLocationOnScreen(iArr);
        a2.offset(-iArr[0], -iArr[1]);
        return a2;
    }

    public final void d() {
        c6 c6Var = this.q;
        if (c6Var == null) {
            return;
        }
        m6 m6Var = this.i;
        float flightYaw = m6Var.getFlightYaw();
        float flightPitch = m6Var.getFlightPitch();
        if (this.p != null) {
            float max = Math.max(0.0f, Math.min(1.0f, (this.r - 0.55f) / 0.45f));
            float B = com.google.android.gms.internal.play_billing.k3.B(max, 2.0f, 3.0f, max * max);
            flightYaw += ((float) Math.IEEEremainder(this.p.I0.g() - flightYaw, 6.283185307179586d)) * B;
            flightPitch += ((this.p.I0.k.E * 0.14f) - flightPitch) * B;
        }
        c6Var.r = flightYaw;
        c6Var.s = flightPitch;
        c6Var.v = true;
        c6Var.w = true;
    }

    public final void e() {
        m6 m6Var = this.d;
        if (m6Var.isAttachedToWindow()) {
            View rootView = m6Var.getRootView();
            ViewGroup viewGroup = this.a;
            if (rootView != viewGroup.getRootView()) {
                return;
            }
            ti tiVar = this.c;
            RectF rectF = this.n;
            if (tiVar == null) {
                v9.f(m6Var, this.b, viewGroup, rectF);
            } else {
                rectF.set(v9.a(viewGroup, m6Var));
                rectF.offset(0.0f, tiVar.o2 - tiVar.y0);
            }
        }
    }
}
