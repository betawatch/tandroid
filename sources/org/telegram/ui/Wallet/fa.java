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
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.u51;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class fa {
    public final bi a;
    public final ViewGroup b;
    public final View c;
    public final a7 d;
    public final b6 e;
    public final TL_wallet.walletTransaction f;
    public final Runnable g;
    public final da h;
    public final a7 i;
    public final t9 j = new t9();
    public final PathInterpolator k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float l;
    public final AnimatorSet m;
    public final RectF n;
    public final RectF o;
    public w3 p;
    public boolean q;
    public boolean r;
    public boolean s;
    public final long t;
    public final ca u;

    /* JADX WARN: Type inference failed for: r1v3, types: [org.telegram.ui.Wallet.ca] */
    public fa(ViewGroup viewGroup, View view, a7 a7Var, b6 b6Var, TL_wallet.walletTransaction wallettransaction, Runnable runnable, bi biVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.m = animatorSet;
        this.o = new RectF();
        this.t = SystemClock.uptimeMillis();
        final int i10 = 0;
        this.u = new Runnable(this) { // from class: org.telegram.ui.Wallet.ca
            public final /* synthetic */ fa b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                w3 w3Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (i10) {
                    case 0:
                        fa faVar = this.b;
                        a7 a7Var2 = faVar.d;
                        ViewGroup viewGroup2 = faVar.b;
                        AnimatorSet animatorSet2 = faVar.m;
                        a7 a7Var3 = faVar.i;
                        RectF rectF = faVar.o;
                        RectF rectF2 = faVar.n;
                        if (!faVar.s && !faVar.r) {
                            faVar.e();
                            faVar.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            b6 b6Var2 = faVar.e;
                            TL_wallet.walletTransaction wallettransaction3 = faVar.f;
                            u51 u51Var = b6Var2.r0[0];
                            w3 w3Var2 = null;
                            if (u51Var != null) {
                                int i11 = 0;
                                while (true) {
                                    if (i11 < u51Var.getChildCount()) {
                                        View childAt = u51Var.getChildAt(i11);
                                        if ((childAt instanceof w3) && (wallettransaction2 = (w3Var = (w3) childAt).R) != null && u3.i(wallettransaction2, wallettransaction3)) {
                                            w3Var2 = w3Var;
                                        } else {
                                            i11++;
                                        }
                                    }
                                }
                            }
                            if (w3Var2 != null && w3Var2.getWidth() > 0) {
                                w3 w3Var3 = faVar.p;
                                if (w3Var3 != w3Var2) {
                                    if (w3Var3 != null) {
                                        w3Var3.f(false);
                                    }
                                    faVar.p = w3Var2;
                                    w3Var2.f(true);
                                }
                                a7 pendingDiamond = faVar.p.getPendingDiamond();
                                if (faVar.q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !faVar.p.isLayoutRequested()) {
                                    rectF.set(faVar.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        faVar.r = true;
                                        a7Var3.f(a7Var2);
                                        a7Var3.setAlpha(1.0f);
                                        a7Var2.setAlpha(0.0f);
                                        faVar.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - faVar.t <= 450 && viewGroup2.isAttachedToWindow()) {
                                faVar.h.postOnAnimation(faVar.u);
                                break;
                            } else {
                                faVar.r = true;
                                a7Var3.setAlpha(0.0f);
                                animatorSet2.setDuration(180L);
                                animatorSet2.start();
                                break;
                            }
                        }
                        break;
                    default:
                        this.b.q = true;
                        break;
                }
            }
        };
        this.a = biVar;
        this.b = viewGroup;
        this.c = view;
        this.d = a7Var;
        this.l = a7Var.getAlpha();
        this.e = b6Var;
        this.f = wallettransaction;
        this.g = runnable;
        RectF a2 = a(a7Var, viewGroup);
        this.n = a2;
        da daVar = new da(this, viewGroup.getContext());
        this.h = daVar;
        daVar.setClipChildren(false);
        daVar.setClipToPadding(false);
        final int i11 = 1;
        daVar.setClickable(true);
        a7 a7Var2 = new a7(60, viewGroup.getContext(), true);
        this.i = a7Var2;
        a7Var2.setContinuousRotation(540.0f);
        a7Var2.f(a7Var);
        a7Var2.setAlpha(0.0f);
        daVar.addView(a7Var2, w7.b6.e(60, 60, 51));
        viewGroup.addView(daVar, new ViewGroup.LayoutParams(-1, -1));
        c(a2.centerX(), a2.centerY(), a2.width());
        a7Var2.l(new Runnable(this) { // from class: org.telegram.ui.Wallet.ca
            public final /* synthetic */ fa b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                w3 w3Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (i11) {
                    case 0:
                        fa faVar = this.b;
                        a7 a7Var22 = faVar.d;
                        ViewGroup viewGroup2 = faVar.b;
                        AnimatorSet animatorSet2 = faVar.m;
                        a7 a7Var3 = faVar.i;
                        RectF rectF = faVar.o;
                        RectF rectF2 = faVar.n;
                        if (!faVar.s && !faVar.r) {
                            faVar.e();
                            faVar.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            b6 b6Var2 = faVar.e;
                            TL_wallet.walletTransaction wallettransaction3 = faVar.f;
                            u51 u51Var = b6Var2.r0[0];
                            w3 w3Var2 = null;
                            if (u51Var != null) {
                                int i112 = 0;
                                while (true) {
                                    if (i112 < u51Var.getChildCount()) {
                                        View childAt = u51Var.getChildAt(i112);
                                        if ((childAt instanceof w3) && (wallettransaction2 = (w3Var = (w3) childAt).R) != null && u3.i(wallettransaction2, wallettransaction3)) {
                                            w3Var2 = w3Var;
                                        } else {
                                            i112++;
                                        }
                                    }
                                }
                            }
                            if (w3Var2 != null && w3Var2.getWidth() > 0) {
                                w3 w3Var3 = faVar.p;
                                if (w3Var3 != w3Var2) {
                                    if (w3Var3 != null) {
                                        w3Var3.f(false);
                                    }
                                    faVar.p = w3Var2;
                                    w3Var2.f(true);
                                }
                                a7 pendingDiamond = faVar.p.getPendingDiamond();
                                if (faVar.q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !faVar.p.isLayoutRequested()) {
                                    rectF.set(faVar.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        faVar.r = true;
                                        a7Var3.f(a7Var22);
                                        a7Var3.setAlpha(1.0f);
                                        a7Var22.setAlpha(0.0f);
                                        faVar.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - faVar.t <= 450 && viewGroup2.isAttachedToWindow()) {
                                faVar.h.postOnAnimation(faVar.u);
                                break;
                            } else {
                                faVar.r = true;
                                a7Var3.setAlpha(0.0f);
                                animatorSet2.setDuration(180L);
                                animatorSet2.start();
                                break;
                            }
                        }
                        break;
                    default:
                        this.b.q = true;
                        break;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new r3(this, 10));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new ea(this, biVar, a7Var));
        b6Var.N0();
        b6Var.W0(false);
        ii iiVar = b6Var.a;
        if (iiVar != null) {
            iiVar.C0();
            b6Var.a.e3.h1(0, 0);
            u51 u51Var = b6Var.r0[0];
            if (u51Var != null) {
                p51 p51Var = u51Var.f3;
                u51Var.C0();
                p51Var.O(false);
                for (int i12 = 0; i12 < p51Var.D.size(); i12++) {
                    a51 G = p51Var.G(i12);
                    if (G != null) {
                        Object obj = G.G;
                        if (obj instanceof TL_wallet.walletTransaction) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                            int i13 = u3.b;
                            if ((wallettransaction2 instanceof t3 ? ((t3) wallettransaction2).a : wallettransaction2) == wallettransaction || k0.i0((TL_wallet.walletTransaction) obj, wallettransaction)) {
                                u51Var.e3.h1(i12, 0);
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        this.h.post(this.u);
    }

    public static RectF a(View view, ViewGroup viewGroup) {
        RectF rectF = new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        while (view != viewGroup) {
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
            rectF.offset(-view.getScrollX(), -view.getScrollY());
        }
        return rectF;
    }

    public static void f(View view, View view2, ViewGroup viewGroup, RectF rectF) {
        if (!view.isAttachedToWindow() || view.getWidth() <= 0 || view.getHeight() <= 0) {
            return;
        }
        RectF rectF2 = new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        while (view != viewGroup) {
            view.getMatrix().mapRect(rectF2);
            if (view == view2) {
                rectF2.offset(0.0f, -view2.getTranslationY());
            }
            rectF2.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            if (!(parent instanceof View)) {
                return;
            }
            view = (View) parent;
            rectF2.offset(-view.getScrollX(), -view.getScrollY());
        }
        rectF.set(rectF2);
    }

    public final void b() {
        TL_wallet.walletTransaction wallettransaction;
        if (this.s) {
            return;
        }
        this.s = true;
        ca caVar = this.u;
        da daVar = this.h;
        daVar.removeCallbacks(caVar);
        a7 a7Var = this.i;
        a7Var.l(null);
        w3 w3Var = this.p;
        if (w3Var != null && (wallettransaction = w3Var.R) != null && u3.i(wallettransaction, this.f)) {
            a7 pendingDiamond = this.p.getPendingDiamond();
            if (pendingDiamond != null) {
                pendingDiamond.f(a7Var);
            }
            this.p.f(false);
            RectF rectF = this.o;
            if (!rectF.isEmpty()) {
                float centerY = (((rectF.centerY() - (Math.min(this.n.centerY(), rectF.centerY()) - org.telegram.messenger.i0.L(150.0f))) * 2.0f) / 0.6f) / org.telegram.messenger.i0.p;
                w3 w3Var2 = this.p;
                w3Var2.d();
                o1.j jVar = new o1.j(new o1.i(0.0f));
                w3Var2.H = jVar;
                o1.k kVar = new o1.k(0.0f);
                kVar.a(0.65f);
                kVar.b(200.0f);
                jVar.m = kVar;
                w3Var2.H.f(0.001f);
                w3Var2.H.a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                w3Var2.H.b(new q3(w3Var2, 0));
                w3Var2.H.h();
            }
        }
        a7Var.setPaused(true);
        daVar.removeView(a7Var);
        daVar.setClickable(false);
        this.d.setAlpha(this.l);
        bi biVar = this.a;
        if (biVar == null) {
            this.c.setTranslationY(0.0f);
        } else {
            biVar.w1(1.0f);
        }
        ViewGroup viewGroup = this.b;
        if (biVar != null && this.j.d()) {
            b6 b6Var = this.e;
            if (b6Var.getParentLayout() != null) {
                ViewGroup view = b6Var.getParentLayout().getView();
                if (view.isAttachedToWindow()) {
                    viewGroup.getLocationOnScreen(new int[2]);
                    view.getLocationOnScreen(new int[2]);
                    viewGroup.removeView(daVar);
                    daVar.setTranslationX(r6[0] - r4[0]);
                    daVar.setTranslationY(r6[1] - r4[1]);
                    view.addView(daVar, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.g.run();
        org.telegram.messenger.i0.h3(new k3(17, this, viewGroup), 650L);
    }

    public final void c(float f7, float f10, float f11) {
        float L = org.telegram.messenger.i0.L(60.0f);
        da daVar = this.h;
        float f12 = L / 2.0f;
        a7 a7Var = this.i;
        a7Var.setTranslationX((f7 - daVar.getLeft()) - f12);
        a7Var.setTranslationY((f10 - daVar.getTop()) - f12);
        float f13 = f11 / L;
        a7Var.setScaleX(f13);
        a7Var.setScaleY(f13);
    }

    public final RectF d(a7 a7Var) {
        bi biVar = this.a;
        ViewGroup viewGroup = this.b;
        if (biVar == null) {
            return a(a7Var, viewGroup);
        }
        ViewGroup viewGroup2 = (ViewGroup) a7Var.getRootView();
        RectF a2 = a(a7Var, viewGroup2);
        int[] iArr = new int[2];
        viewGroup2.getLocationOnScreen(iArr);
        a2.offset(iArr[0], iArr[1]);
        viewGroup.getLocationOnScreen(iArr);
        a2.offset(-iArr[0], -iArr[1]);
        return a2;
    }

    public final void e() {
        RectF rectF = this.n;
        ViewGroup viewGroup = this.b;
        a7 a7Var = this.d;
        bi biVar = this.a;
        if (biVar == null) {
            f(a7Var, this.c, viewGroup, rectF);
        } else if (a7Var.isAttachedToWindow() && a7Var.getRootView() == viewGroup.getRootView()) {
            rectF.set(a(a7Var, viewGroup));
            rectF.offset(0.0f, biVar.f4 - biVar.p2);
        }
    }
}
