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
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.u61;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class x9 {
    public final ti a;
    public final ViewGroup b;
    public final View c;
    public final p6 d;
    public final l5 e;
    public final TL_wallet.walletTransaction f;
    public final Runnable g;
    public final v9 h;
    public final p6 i;
    public final n9 j = new n9();
    public final PathInterpolator k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float l;
    public final AnimatorSet m;
    public final RectF n;
    public final RectF o;
    public d3 p;
    public boolean q;
    public boolean r;
    public boolean s;
    public final long t;
    public final u9 u;

    /* JADX WARN: Type inference failed for: r1v3, types: [org.telegram.ui.Wallet.u9] */
    public x9(ViewGroup viewGroup, View view, p6 p6Var, l5 l5Var, TL_wallet.walletTransaction wallettransaction, Runnable runnable, ti tiVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.m = animatorSet;
        this.o = new RectF();
        this.t = SystemClock.uptimeMillis();
        final int i10 = 0;
        this.u = new Runnable(this) { // from class: org.telegram.ui.Wallet.u9
            public final /* synthetic */ x9 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                d3 d3Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (i10) {
                    case 0:
                        x9 x9Var = this.b;
                        p6 p6Var2 = x9Var.d;
                        ViewGroup viewGroup2 = x9Var.b;
                        AnimatorSet animatorSet2 = x9Var.m;
                        p6 p6Var3 = x9Var.i;
                        RectF rectF = x9Var.o;
                        RectF rectF2 = x9Var.n;
                        if (!x9Var.s && !x9Var.r) {
                            x9Var.e();
                            x9Var.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            l5 l5Var2 = x9Var.e;
                            TL_wallet.walletTransaction wallettransaction3 = x9Var.f;
                            a71 a71Var = l5Var2.s0[0];
                            d3 d3Var2 = null;
                            if (a71Var != null) {
                                int i11 = 0;
                                while (true) {
                                    if (i11 < a71Var.getChildCount()) {
                                        View childAt = a71Var.getChildAt(i11);
                                        if ((childAt instanceof d3) && (wallettransaction2 = (d3Var = (d3) childAt).R) != null && b3.a(wallettransaction2, wallettransaction3)) {
                                            d3Var2 = d3Var;
                                        } else {
                                            i11++;
                                        }
                                    }
                                }
                            }
                            if (d3Var2 != null && d3Var2.getWidth() > 0) {
                                d3 d3Var3 = x9Var.p;
                                if (d3Var3 != d3Var2) {
                                    if (d3Var3 != null) {
                                        d3Var3.g(false);
                                    }
                                    x9Var.p = d3Var2;
                                    d3Var2.g(true);
                                }
                                p6 pendingDiamond = x9Var.p.getPendingDiamond();
                                if (x9Var.q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !x9Var.p.isLayoutRequested()) {
                                    rectF.set(x9Var.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        x9Var.r = true;
                                        p6Var3.f(p6Var2);
                                        p6Var3.setAlpha(1.0f);
                                        p6Var2.setAlpha(0.0f);
                                        x9Var.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - x9Var.t <= 450 && viewGroup2.isAttachedToWindow()) {
                                x9Var.h.postOnAnimation(x9Var.u);
                                break;
                            } else {
                                x9Var.r = true;
                                p6Var3.setAlpha(0.0f);
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
        this.d = p6Var;
        this.l = p6Var.getAlpha();
        this.e = l5Var;
        this.f = wallettransaction;
        this.g = runnable;
        RectF a2 = a(viewGroup, p6Var);
        this.n = a2;
        v9 v9Var = new v9(this, viewGroup.getContext());
        this.h = v9Var;
        v9Var.setClipChildren(false);
        v9Var.setClipToPadding(false);
        final int i11 = 1;
        v9Var.setClickable(true);
        p6 p6Var2 = new p6(60, viewGroup.getContext(), false);
        this.i = p6Var2;
        p6Var2.setContinuousRotation(540.0f);
        p6Var2.f(p6Var);
        p6Var2.setAlpha(0.0f);
        v9Var.addView(p6Var2, w7.z5.e(60, 60, 51));
        viewGroup.addView(v9Var, new ViewGroup.LayoutParams(-1, -1));
        c(a2.centerX(), a2.centerY(), a2.width());
        p6Var2.l(new Runnable(this) { // from class: org.telegram.ui.Wallet.u9
            public final /* synthetic */ x9 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                d3 d3Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (i11) {
                    case 0:
                        x9 x9Var = this.b;
                        p6 p6Var22 = x9Var.d;
                        ViewGroup viewGroup2 = x9Var.b;
                        AnimatorSet animatorSet2 = x9Var.m;
                        p6 p6Var3 = x9Var.i;
                        RectF rectF = x9Var.o;
                        RectF rectF2 = x9Var.n;
                        if (!x9Var.s && !x9Var.r) {
                            x9Var.e();
                            x9Var.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            l5 l5Var2 = x9Var.e;
                            TL_wallet.walletTransaction wallettransaction3 = x9Var.f;
                            a71 a71Var = l5Var2.s0[0];
                            d3 d3Var2 = null;
                            if (a71Var != null) {
                                int i112 = 0;
                                while (true) {
                                    if (i112 < a71Var.getChildCount()) {
                                        View childAt = a71Var.getChildAt(i112);
                                        if ((childAt instanceof d3) && (wallettransaction2 = (d3Var = (d3) childAt).R) != null && b3.a(wallettransaction2, wallettransaction3)) {
                                            d3Var2 = d3Var;
                                        } else {
                                            i112++;
                                        }
                                    }
                                }
                            }
                            if (d3Var2 != null && d3Var2.getWidth() > 0) {
                                d3 d3Var3 = x9Var.p;
                                if (d3Var3 != d3Var2) {
                                    if (d3Var3 != null) {
                                        d3Var3.g(false);
                                    }
                                    x9Var.p = d3Var2;
                                    d3Var2.g(true);
                                }
                                p6 pendingDiamond = x9Var.p.getPendingDiamond();
                                if (x9Var.q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !x9Var.p.isLayoutRequested()) {
                                    rectF.set(x9Var.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        x9Var.r = true;
                                        p6Var3.f(p6Var22);
                                        p6Var3.setAlpha(1.0f);
                                        p6Var22.setAlpha(0.0f);
                                        x9Var.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - x9Var.t <= 450 && viewGroup2.isAttachedToWindow()) {
                                x9Var.h.postOnAnimation(x9Var.u);
                                break;
                            } else {
                                x9Var.r = true;
                                p6Var3.setAlpha(0.0f);
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
        ofFloat.addUpdateListener(new u2(this, 11));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new w9(this, tiVar, p6Var));
        l5Var.I0();
        l5Var.Q0(false);
        u61 u61Var = l5Var.a;
        if (u61Var != null) {
            u61Var.B0();
            l5Var.a.V2.h1(0, 0);
            a71 a71Var = l5Var.s0[0];
            if (a71Var != null) {
                s61 s61Var = a71Var.W2;
                a71Var.B0();
                s61Var.N(false);
                for (int i12 = 0; i12 < s61Var.x.size(); i12++) {
                    f61 G = s61Var.G(i12);
                    if (G != null) {
                        Object obj = G.G;
                        if (obj instanceof TL_wallet.walletTransaction) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                            int i13 = b3.a;
                            if ((wallettransaction2 instanceof a3 ? ((a3) wallettransaction2).a : wallettransaction2) == wallettransaction || m0.f0((TL_wallet.walletTransaction) obj, wallettransaction)) {
                                a71Var.V2.h1(i12, 0);
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

    public static RectF a(ViewGroup viewGroup, View view) {
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
        u9 u9Var = this.u;
        v9 v9Var = this.h;
        v9Var.removeCallbacks(u9Var);
        p6 p6Var = this.i;
        p6Var.l(null);
        d3 d3Var = this.p;
        if (d3Var != null && (wallettransaction = d3Var.R) != null && b3.a(wallettransaction, this.f)) {
            p6 pendingDiamond = this.p.getPendingDiamond();
            if (pendingDiamond != null) {
                pendingDiamond.f(p6Var);
            }
            this.p.g(false);
            RectF rectF = this.o;
            if (!rectF.isEmpty()) {
                float centerY = (((rectF.centerY() - (Math.min(this.n.centerY(), rectF.centerY()) - AndroidUtilities.dp(150.0f))) * 2.0f) / 0.6f) / AndroidUtilities.density;
                d3 d3Var2 = this.p;
                d3Var2.e();
                o1.k kVar = new o1.k(new o1.j(0.0f));
                d3Var2.H = kVar;
                o1.l lVar = new o1.l(0.0f);
                lVar.a(0.65f);
                lVar.b(200.0f);
                kVar.u = lVar;
                d3Var2.H.e(0.001f);
                d3Var2.H.a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                d3Var2.H.b(new y2(d3Var2, 0));
                d3Var2.H.h();
            }
        }
        p6Var.setPaused(true);
        v9Var.removeView(p6Var);
        v9Var.setClickable(false);
        this.d.setAlpha(this.l);
        ti tiVar = this.a;
        if (tiVar == null) {
            this.c.setTranslationY(0.0f);
        } else {
            tiVar.M1(1.0f);
        }
        ViewGroup viewGroup = this.b;
        if (tiVar != null && this.j.d()) {
            l5 l5Var = this.e;
            if (l5Var.getParentLayout() != null) {
                ViewGroup view = l5Var.getParentLayout().getView();
                if (view.isAttachedToWindow()) {
                    viewGroup.getLocationOnScreen(new int[2]);
                    view.getLocationOnScreen(new int[2]);
                    viewGroup.removeView(v9Var);
                    v9Var.setTranslationX(r6[0] - r4[0]);
                    v9Var.setTranslationY(r6[1] - r4[1]);
                    view.addView(v9Var, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.g.run();
        AndroidUtilities.runOnUIThread(new t3(16, this, viewGroup), 650L);
    }

    public final void c(float f7, float f10, float f11) {
        float dp = AndroidUtilities.dp(60.0f);
        v9 v9Var = this.h;
        float f12 = dp / 2.0f;
        p6 p6Var = this.i;
        p6Var.setTranslationX((f7 - v9Var.getLeft()) - f12);
        p6Var.setTranslationY((f10 - v9Var.getTop()) - f12);
        float f13 = f11 / dp;
        p6Var.setScaleX(f13);
        p6Var.setScaleY(f13);
    }

    public final RectF d(p6 p6Var) {
        ti tiVar = this.a;
        ViewGroup viewGroup = this.b;
        if (tiVar == null) {
            return a(viewGroup, p6Var);
        }
        ViewGroup viewGroup2 = (ViewGroup) p6Var.getRootView();
        RectF a2 = a(viewGroup2, p6Var);
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
        p6 p6Var = this.d;
        ti tiVar = this.a;
        if (tiVar == null) {
            f(p6Var, this.c, viewGroup, rectF);
        } else if (p6Var.isAttachedToWindow() && p6Var.getRootView() == viewGroup.getRootView()) {
            rectF.set(a(viewGroup, p6Var));
            rectF.offset(0.0f, tiVar.o2 - tiVar.y0);
        }
    }
}
