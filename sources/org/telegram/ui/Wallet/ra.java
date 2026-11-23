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
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.ui;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class ra {
    public final ui a;
    public final ViewGroup b;
    public final View c;
    public final m7 d;
    public final n6 e;
    public final TL_wallet.walletTransaction f;
    public final Runnable g;
    public final pa h;
    public final m7 i;
    public final fa j = new fa();
    public final PathInterpolator k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float l;
    public final AnimatorSet m;
    public final RectF n;
    public final RectF o;
    public f4 p;
    public boolean q;
    public boolean r;
    public boolean s;
    public final long t;
    public final oa u;

    /* JADX WARN: Type inference failed for: r1v3, types: [org.telegram.ui.Wallet.oa] */
    public ra(ViewGroup viewGroup, View view, m7 m7Var, n6 n6Var, TL_wallet.walletTransaction wallettransaction, Runnable runnable, ui uiVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.m = animatorSet;
        this.o = new RectF();
        this.t = SystemClock.uptimeMillis();
        final int i7 = 0;
        this.u = new Runnable(this) { // from class: org.telegram.ui.Wallet.oa
            public final /* synthetic */ ra b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                f4 f4Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (i7) {
                    case 0:
                        ra raVar = this.b;
                        m7 m7Var2 = raVar.d;
                        ViewGroup viewGroup2 = raVar.b;
                        AnimatorSet animatorSet2 = raVar.m;
                        m7 m7Var3 = raVar.i;
                        RectF rectF = raVar.o;
                        RectF rectF2 = raVar.n;
                        if (!raVar.s && !raVar.r) {
                            raVar.e();
                            raVar.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            n6 n6Var2 = raVar.e;
                            TL_wallet.walletTransaction wallettransaction3 = raVar.f;
                            h51 h51Var = n6Var2.u0[0];
                            f4 f4Var2 = null;
                            if (h51Var != null) {
                                int i10 = 0;
                                while (true) {
                                    if (i10 < h51Var.getChildCount()) {
                                        View childAt = h51Var.getChildAt(i10);
                                        if ((childAt instanceof f4) && (wallettransaction2 = (f4Var = (f4) childAt).S) != null && d4.j(wallettransaction2, wallettransaction3)) {
                                            f4Var2 = f4Var;
                                        } else {
                                            i10++;
                                        }
                                    }
                                }
                            }
                            if (f4Var2 != null && f4Var2.getWidth() > 0) {
                                f4 f4Var3 = raVar.p;
                                if (f4Var3 != f4Var2) {
                                    if (f4Var3 != null) {
                                        f4Var3.g(false);
                                    }
                                    raVar.p = f4Var2;
                                    f4Var2.g(true);
                                }
                                m7 pendingDiamond = raVar.p.getPendingDiamond();
                                if (raVar.q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !raVar.p.isLayoutRequested()) {
                                    rectF.set(raVar.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        raVar.r = true;
                                        m7Var3.f(m7Var2);
                                        m7Var3.setAlpha(1.0f);
                                        m7Var2.setAlpha(0.0f);
                                        raVar.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - raVar.t <= 450 && viewGroup2.isAttachedToWindow()) {
                                raVar.h.postOnAnimation(raVar.u);
                                break;
                            } else {
                                raVar.r = true;
                                m7Var3.setAlpha(0.0f);
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
        this.a = uiVar;
        this.b = viewGroup;
        this.c = view;
        this.d = m7Var;
        this.l = m7Var.getAlpha();
        this.e = n6Var;
        this.f = wallettransaction;
        this.g = runnable;
        RectF a10 = a(m7Var, viewGroup);
        this.n = a10;
        pa paVar = new pa(this, viewGroup.getContext());
        this.h = paVar;
        paVar.setClipChildren(false);
        paVar.setClipToPadding(false);
        final int i10 = 1;
        paVar.setClickable(true);
        m7 m7Var2 = new m7(60, viewGroup.getContext(), true);
        this.i = m7Var2;
        m7Var2.setContinuousRotation(540.0f);
        m7Var2.f(m7Var);
        m7Var2.setAlpha(0.0f);
        paVar.addView(m7Var2, c8.ma.e(60, 60, 51));
        viewGroup.addView(paVar, new ViewGroup.LayoutParams(-1, -1));
        c(a10.centerX(), a10.centerY(), a10.width());
        m7Var2.l(new Runnable(this) { // from class: org.telegram.ui.Wallet.oa
            public final /* synthetic */ ra b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                f4 f4Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (i10) {
                    case 0:
                        ra raVar = this.b;
                        m7 m7Var22 = raVar.d;
                        ViewGroup viewGroup2 = raVar.b;
                        AnimatorSet animatorSet2 = raVar.m;
                        m7 m7Var3 = raVar.i;
                        RectF rectF = raVar.o;
                        RectF rectF2 = raVar.n;
                        if (!raVar.s && !raVar.r) {
                            raVar.e();
                            raVar.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            n6 n6Var2 = raVar.e;
                            TL_wallet.walletTransaction wallettransaction3 = raVar.f;
                            h51 h51Var = n6Var2.u0[0];
                            f4 f4Var2 = null;
                            if (h51Var != null) {
                                int i102 = 0;
                                while (true) {
                                    if (i102 < h51Var.getChildCount()) {
                                        View childAt = h51Var.getChildAt(i102);
                                        if ((childAt instanceof f4) && (wallettransaction2 = (f4Var = (f4) childAt).S) != null && d4.j(wallettransaction2, wallettransaction3)) {
                                            f4Var2 = f4Var;
                                        } else {
                                            i102++;
                                        }
                                    }
                                }
                            }
                            if (f4Var2 != null && f4Var2.getWidth() > 0) {
                                f4 f4Var3 = raVar.p;
                                if (f4Var3 != f4Var2) {
                                    if (f4Var3 != null) {
                                        f4Var3.g(false);
                                    }
                                    raVar.p = f4Var2;
                                    f4Var2.g(true);
                                }
                                m7 pendingDiamond = raVar.p.getPendingDiamond();
                                if (raVar.q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !raVar.p.isLayoutRequested()) {
                                    rectF.set(raVar.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        raVar.r = true;
                                        m7Var3.f(m7Var22);
                                        m7Var3.setAlpha(1.0f);
                                        m7Var22.setAlpha(0.0f);
                                        raVar.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - raVar.t <= 450 && viewGroup2.isAttachedToWindow()) {
                                raVar.h.postOnAnimation(raVar.u);
                                break;
                            } else {
                                raVar.r = true;
                                m7Var3.setAlpha(0.0f);
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
        ofFloat.addUpdateListener(new z3(this, 10));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new qa(this, uiVar, m7Var));
        n6Var.T0();
        n6Var.c1(false);
        bi.f6 f6Var = n6Var.a;
        if (f6Var != null) {
            f6Var.C0();
            n6Var.a.f3.h1(0, 0);
            h51 h51Var = n6Var.u0[0];
            if (h51Var != null) {
                c51 c51Var = h51Var.g3;
                h51Var.C0();
                c51Var.O(false);
                for (int i11 = 0; i11 < c51Var.E.size(); i11++) {
                    o41 G = c51Var.G(i11);
                    if (G != null) {
                        Object obj = G.H;
                        if (obj instanceof TL_wallet.walletTransaction) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                            int i12 = d4.b;
                            if ((wallettransaction2 instanceof c4 ? ((c4) wallettransaction2).a : wallettransaction2) == wallettransaction || u0.t0((TL_wallet.walletTransaction) obj, wallettransaction)) {
                                h51Var.f3.h1(i11, 0);
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
        oa oaVar = this.u;
        pa paVar = this.h;
        paVar.removeCallbacks(oaVar);
        m7 m7Var = this.i;
        m7Var.l(null);
        f4 f4Var = this.p;
        if (f4Var != null && (wallettransaction = f4Var.S) != null && d4.j(wallettransaction, this.f)) {
            m7 pendingDiamond = this.p.getPendingDiamond();
            if (pendingDiamond != null) {
                pendingDiamond.f(m7Var);
            }
            this.p.g(false);
            RectF rectF = this.o;
            if (!rectF.isEmpty()) {
                float centerY = (((rectF.centerY() - (Math.min(this.n.centerY(), rectF.centerY()) - org.telegram.messenger.g0.L(150.0f))) * 2.0f) / 0.6f) / org.telegram.messenger.g0.p;
                f4 f4Var2 = this.p;
                f4Var2.e();
                r1.g gVar = new r1.g(new r1.f(0.0f));
                f4Var2.I = gVar;
                r1.h hVar = new r1.h(0.0f);
                hVar.a(0.65f);
                hVar.b(200.0f);
                gVar.m = hVar;
                f4Var2.I.f(0.001f);
                f4Var2.I.a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                f4Var2.I.b(new y3(f4Var2, 0));
                f4Var2.I.h();
            }
        }
        m7Var.setPaused(true);
        paVar.removeView(m7Var);
        paVar.setClickable(false);
        this.d.setAlpha(this.l);
        ui uiVar = this.a;
        if (uiVar == null) {
            this.c.setTranslationY(0.0f);
        } else {
            uiVar.y1(1.0f);
        }
        ViewGroup viewGroup = this.b;
        if (uiVar != null && this.j.d()) {
            n6 n6Var = this.e;
            if (n6Var.getParentLayout() != null) {
                ViewGroup view = n6Var.getParentLayout().getView();
                if (view.isAttachedToWindow()) {
                    viewGroup.getLocationOnScreen(new int[2]);
                    view.getLocationOnScreen(new int[2]);
                    viewGroup.removeView(paVar);
                    paVar.setTranslationX(r6[0] - r4[0]);
                    paVar.setTranslationY(r6[1] - r4[1]);
                    view.addView(paVar, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.g.run();
        org.telegram.messenger.g0.h3(new u4(14, this, viewGroup), 650L);
    }

    public final void c(float f10, float f11, float f12) {
        float L = org.telegram.messenger.g0.L(60.0f);
        pa paVar = this.h;
        float f13 = L / 2.0f;
        m7 m7Var = this.i;
        m7Var.setTranslationX((f10 - paVar.getLeft()) - f13);
        m7Var.setTranslationY((f11 - paVar.getTop()) - f13);
        float f14 = f12 / L;
        m7Var.setScaleX(f14);
        m7Var.setScaleY(f14);
    }

    public final RectF d(m7 m7Var) {
        ui uiVar = this.a;
        ViewGroup viewGroup = this.b;
        if (uiVar == null) {
            return a(m7Var, viewGroup);
        }
        ViewGroup viewGroup2 = (ViewGroup) m7Var.getRootView();
        RectF a10 = a(m7Var, viewGroup2);
        int[] iArr = new int[2];
        viewGroup2.getLocationOnScreen(iArr);
        a10.offset(iArr[0], iArr[1]);
        viewGroup.getLocationOnScreen(iArr);
        a10.offset(-iArr[0], -iArr[1]);
        return a10;
    }

    public final void e() {
        RectF rectF = this.n;
        ViewGroup viewGroup = this.b;
        m7 m7Var = this.d;
        ui uiVar = this.a;
        if (uiVar == null) {
            f(m7Var, this.c, viewGroup, rectF);
        } else if (m7Var.isAttachedToWindow() && m7Var.getRootView() == viewGroup.getRootView()) {
            rectF.set(a(m7Var, viewGroup));
            rectF.offset(0.0f, uiVar.j4 - uiVar.t2);
        }
    }
}
