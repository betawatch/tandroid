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
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.ti;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class sa {
    public final ti a;
    public final ViewGroup b;
    public final View c;
    public final n7 d;
    public final o6 e;
    public final TL_wallet.walletTransaction f;
    public final Runnable g;
    public final qa h;
    public final n7 i;
    public final ga j = new ga();
    public final PathInterpolator k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float l;
    public final AnimatorSet m;
    public final RectF n;
    public final RectF o;
    public g4 p;
    public boolean q;
    public boolean r;
    public boolean s;
    public final long t;
    public final pa u;

    /* JADX WARN: Type inference failed for: r1v3, types: [org.telegram.ui.Wallet.pa] */
    public sa(ViewGroup viewGroup, View view, n7 n7Var, o6 o6Var, TL_wallet.walletTransaction wallettransaction, Runnable runnable, ti tiVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.m = animatorSet;
        this.o = new RectF();
        this.t = SystemClock.uptimeMillis();
        final int i7 = 0;
        this.u = new Runnable(this) { // from class: org.telegram.ui.Wallet.pa
            public final /* synthetic */ sa b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                g4 g4Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (i7) {
                    case 0:
                        sa saVar = this.b;
                        n7 n7Var2 = saVar.d;
                        ViewGroup viewGroup2 = saVar.b;
                        AnimatorSet animatorSet2 = saVar.m;
                        n7 n7Var3 = saVar.i;
                        RectF rectF = saVar.o;
                        RectF rectF2 = saVar.n;
                        if (!saVar.s && !saVar.r) {
                            saVar.e();
                            saVar.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            o6 o6Var2 = saVar.e;
                            TL_wallet.walletTransaction wallettransaction3 = saVar.f;
                            g51 g51Var = o6Var2.u0[0];
                            g4 g4Var2 = null;
                            if (g51Var != null) {
                                int i10 = 0;
                                while (true) {
                                    if (i10 < g51Var.getChildCount()) {
                                        View childAt = g51Var.getChildAt(i10);
                                        if ((childAt instanceof g4) && (wallettransaction2 = (g4Var = (g4) childAt).S) != null && e4.j(wallettransaction2, wallettransaction3)) {
                                            g4Var2 = g4Var;
                                        } else {
                                            i10++;
                                        }
                                    }
                                }
                            }
                            if (g4Var2 != null && g4Var2.getWidth() > 0) {
                                g4 g4Var3 = saVar.p;
                                if (g4Var3 != g4Var2) {
                                    if (g4Var3 != null) {
                                        g4Var3.g(false);
                                    }
                                    saVar.p = g4Var2;
                                    g4Var2.g(true);
                                }
                                n7 pendingDiamond = saVar.p.getPendingDiamond();
                                if (saVar.q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !saVar.p.isLayoutRequested()) {
                                    rectF.set(saVar.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        saVar.r = true;
                                        n7Var3.f(n7Var2);
                                        n7Var3.setAlpha(1.0f);
                                        n7Var2.setAlpha(0.0f);
                                        saVar.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - saVar.t <= 450 && viewGroup2.isAttachedToWindow()) {
                                saVar.h.postOnAnimation(saVar.u);
                                break;
                            } else {
                                saVar.r = true;
                                n7Var3.setAlpha(0.0f);
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
        this.a = tiVar;
        this.b = viewGroup;
        this.c = view;
        this.d = n7Var;
        this.l = n7Var.getAlpha();
        this.e = o6Var;
        this.f = wallettransaction;
        this.g = runnable;
        RectF a10 = a(n7Var, viewGroup);
        this.n = a10;
        qa qaVar = new qa(this, viewGroup.getContext());
        this.h = qaVar;
        qaVar.setClipChildren(false);
        qaVar.setClipToPadding(false);
        final int i10 = 1;
        qaVar.setClickable(true);
        n7 n7Var2 = new n7(60, viewGroup.getContext(), true);
        this.i = n7Var2;
        n7Var2.setContinuousRotation(540.0f);
        n7Var2.f(n7Var);
        n7Var2.setAlpha(0.0f);
        qaVar.addView(n7Var2, c8.na.e(60, 60, 51));
        viewGroup.addView(qaVar, new ViewGroup.LayoutParams(-1, -1));
        c(a10.centerX(), a10.centerY(), a10.width());
        n7Var2.l(new Runnable(this) { // from class: org.telegram.ui.Wallet.pa
            public final /* synthetic */ sa b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                g4 g4Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (i10) {
                    case 0:
                        sa saVar = this.b;
                        n7 n7Var22 = saVar.d;
                        ViewGroup viewGroup2 = saVar.b;
                        AnimatorSet animatorSet2 = saVar.m;
                        n7 n7Var3 = saVar.i;
                        RectF rectF = saVar.o;
                        RectF rectF2 = saVar.n;
                        if (!saVar.s && !saVar.r) {
                            saVar.e();
                            saVar.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            o6 o6Var2 = saVar.e;
                            TL_wallet.walletTransaction wallettransaction3 = saVar.f;
                            g51 g51Var = o6Var2.u0[0];
                            g4 g4Var2 = null;
                            if (g51Var != null) {
                                int i102 = 0;
                                while (true) {
                                    if (i102 < g51Var.getChildCount()) {
                                        View childAt = g51Var.getChildAt(i102);
                                        if ((childAt instanceof g4) && (wallettransaction2 = (g4Var = (g4) childAt).S) != null && e4.j(wallettransaction2, wallettransaction3)) {
                                            g4Var2 = g4Var;
                                        } else {
                                            i102++;
                                        }
                                    }
                                }
                            }
                            if (g4Var2 != null && g4Var2.getWidth() > 0) {
                                g4 g4Var3 = saVar.p;
                                if (g4Var3 != g4Var2) {
                                    if (g4Var3 != null) {
                                        g4Var3.g(false);
                                    }
                                    saVar.p = g4Var2;
                                    g4Var2.g(true);
                                }
                                n7 pendingDiamond = saVar.p.getPendingDiamond();
                                if (saVar.q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !saVar.p.isLayoutRequested()) {
                                    rectF.set(saVar.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        saVar.r = true;
                                        n7Var3.f(n7Var22);
                                        n7Var3.setAlpha(1.0f);
                                        n7Var22.setAlpha(0.0f);
                                        saVar.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - saVar.t <= 450 && viewGroup2.isAttachedToWindow()) {
                                saVar.h.postOnAnimation(saVar.u);
                                break;
                            } else {
                                saVar.r = true;
                                n7Var3.setAlpha(0.0f);
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
        ofFloat.addUpdateListener(new a4(this, 10));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new ra(this, tiVar, n7Var));
        o6Var.T0();
        o6Var.c1(false);
        bi.i6 i6Var = o6Var.a;
        if (i6Var != null) {
            i6Var.C0();
            o6Var.a.f3.h1(0, 0);
            g51 g51Var = o6Var.u0[0];
            if (g51Var != null) {
                b51 b51Var = g51Var.g3;
                g51Var.C0();
                b51Var.O(false);
                for (int i11 = 0; i11 < b51Var.E.size(); i11++) {
                    n41 G = b51Var.G(i11);
                    if (G != null) {
                        Object obj = G.H;
                        if (obj instanceof TL_wallet.walletTransaction) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                            int i12 = e4.b;
                            if ((wallettransaction2 instanceof d4 ? ((d4) wallettransaction2).a : wallettransaction2) == wallettransaction || v0.t0((TL_wallet.walletTransaction) obj, wallettransaction)) {
                                g51Var.f3.h1(i11, 0);
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
        pa paVar = this.u;
        qa qaVar = this.h;
        qaVar.removeCallbacks(paVar);
        n7 n7Var = this.i;
        n7Var.l(null);
        g4 g4Var = this.p;
        if (g4Var != null && (wallettransaction = g4Var.S) != null && e4.j(wallettransaction, this.f)) {
            n7 pendingDiamond = this.p.getPendingDiamond();
            if (pendingDiamond != null) {
                pendingDiamond.f(n7Var);
            }
            this.p.g(false);
            RectF rectF = this.o;
            if (!rectF.isEmpty()) {
                float centerY = (((rectF.centerY() - (Math.min(this.n.centerY(), rectF.centerY()) - org.telegram.messenger.g0.L(150.0f))) * 2.0f) / 0.6f) / org.telegram.messenger.g0.p;
                g4 g4Var2 = this.p;
                g4Var2.e();
                r1.g gVar = new r1.g(new r1.f(0.0f));
                g4Var2.I = gVar;
                r1.h hVar = new r1.h(0.0f);
                hVar.a(0.65f);
                hVar.b(200.0f);
                gVar.m = hVar;
                g4Var2.I.f(0.001f);
                g4Var2.I.a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                g4Var2.I.b(new z3(g4Var2, 0));
                g4Var2.I.h();
            }
        }
        n7Var.setPaused(true);
        qaVar.removeView(n7Var);
        qaVar.setClickable(false);
        this.d.setAlpha(this.l);
        ti tiVar = this.a;
        if (tiVar == null) {
            this.c.setTranslationY(0.0f);
        } else {
            tiVar.y1(1.0f);
        }
        ViewGroup viewGroup = this.b;
        if (tiVar != null && this.j.d()) {
            o6 o6Var = this.e;
            if (o6Var.getParentLayout() != null) {
                ViewGroup view = o6Var.getParentLayout().getView();
                if (view.isAttachedToWindow()) {
                    viewGroup.getLocationOnScreen(new int[2]);
                    view.getLocationOnScreen(new int[2]);
                    viewGroup.removeView(qaVar);
                    qaVar.setTranslationX(r6[0] - r4[0]);
                    qaVar.setTranslationY(r6[1] - r4[1]);
                    view.addView(qaVar, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.g.run();
        org.telegram.messenger.g0.h3(new r(18, this, viewGroup), 650L);
    }

    public final void c(float f10, float f11, float f12) {
        float L = org.telegram.messenger.g0.L(60.0f);
        qa qaVar = this.h;
        float f13 = L / 2.0f;
        n7 n7Var = this.i;
        n7Var.setTranslationX((f10 - qaVar.getLeft()) - f13);
        n7Var.setTranslationY((f11 - qaVar.getTop()) - f13);
        float f14 = f12 / L;
        n7Var.setScaleX(f14);
        n7Var.setScaleY(f14);
    }

    public final RectF d(n7 n7Var) {
        ti tiVar = this.a;
        ViewGroup viewGroup = this.b;
        if (tiVar == null) {
            return a(n7Var, viewGroup);
        }
        ViewGroup viewGroup2 = (ViewGroup) n7Var.getRootView();
        RectF a10 = a(n7Var, viewGroup2);
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
        n7 n7Var = this.d;
        ti tiVar = this.a;
        if (tiVar == null) {
            f(n7Var, this.c, viewGroup, rectF);
        } else if (n7Var.isAttachedToWindow() && n7Var.getRootView() == viewGroup.getRootView()) {
            rectF.set(a(n7Var, viewGroup));
            rectF.offset(0.0f, tiVar.j4 - tiVar.t2);
        }
    }
}
