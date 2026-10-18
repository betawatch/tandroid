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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class v9 {
    public final ti a;
    public final ViewGroup b;
    public final View c;
    public final m6 d;
    public final n5 e;
    public final TL_wallet.walletTransaction f;
    public final Runnable g;
    public final t9 h;
    public final m6 i;
    public final k9 j = new k9();
    public final PathInterpolator k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float l;
    public final AnimatorSet m;
    public final RectF n;
    public final RectF o;
    public f3 p;
    public boolean q;
    public boolean r;
    public boolean s;
    public final long t;
    public final s9 u;

    /* JADX WARN: Type inference failed for: r1v3, types: [org.telegram.ui.Wallet.s9] */
    public v9(ViewGroup viewGroup, View view, m6 m6Var, n5 n5Var, TL_wallet.walletTransaction wallettransaction, Runnable runnable, ti tiVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.m = animatorSet;
        this.o = new RectF();
        this.t = SystemClock.uptimeMillis();
        final int i10 = 0;
        this.u = new Runnable(this) { // from class: org.telegram.ui.Wallet.s9
            public final /* synthetic */ v9 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                f3 f3Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (i10) {
                    case 0:
                        v9 v9Var = this.b;
                        m6 m6Var2 = v9Var.d;
                        ViewGroup viewGroup2 = v9Var.b;
                        AnimatorSet animatorSet2 = v9Var.m;
                        m6 m6Var3 = v9Var.i;
                        RectF rectF = v9Var.o;
                        RectF rectF2 = v9Var.n;
                        if (!v9Var.s && !v9Var.r) {
                            v9Var.e();
                            v9Var.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            n5 n5Var2 = v9Var.e;
                            TL_wallet.walletTransaction wallettransaction3 = v9Var.f;
                            a71 a71Var = n5Var2.q0[0];
                            f3 f3Var2 = null;
                            if (a71Var != null) {
                                int i11 = 0;
                                while (true) {
                                    if (i11 < a71Var.getChildCount()) {
                                        View childAt = a71Var.getChildAt(i11);
                                        if ((childAt instanceof f3) && (wallettransaction2 = (f3Var = (f3) childAt).R) != null && d3.a(wallettransaction2, wallettransaction3)) {
                                            f3Var2 = f3Var;
                                        } else {
                                            i11++;
                                        }
                                    }
                                }
                            }
                            if (f3Var2 != null && f3Var2.getWidth() > 0) {
                                f3 f3Var3 = v9Var.p;
                                if (f3Var3 != f3Var2) {
                                    if (f3Var3 != null) {
                                        f3Var3.g(false);
                                    }
                                    v9Var.p = f3Var2;
                                    f3Var2.g(true);
                                }
                                m6 pendingDiamond = v9Var.p.getPendingDiamond();
                                if (v9Var.q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !v9Var.p.isLayoutRequested()) {
                                    rectF.set(v9Var.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        v9Var.r = true;
                                        m6Var3.f(m6Var2);
                                        m6Var3.setAlpha(1.0f);
                                        m6Var2.setAlpha(0.0f);
                                        v9Var.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - v9Var.t <= 450 && viewGroup2.isAttachedToWindow()) {
                                v9Var.h.postOnAnimation(v9Var.u);
                                break;
                            } else {
                                v9Var.r = true;
                                m6Var3.setAlpha(0.0f);
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
        this.d = m6Var;
        this.l = m6Var.getAlpha();
        this.e = n5Var;
        this.f = wallettransaction;
        this.g = runnable;
        RectF a2 = a(viewGroup, m6Var);
        this.n = a2;
        t9 t9Var = new t9(this, viewGroup.getContext());
        this.h = t9Var;
        t9Var.setClipChildren(false);
        t9Var.setClipToPadding(false);
        final int i11 = 1;
        t9Var.setClickable(true);
        m6 m6Var2 = new m6(60, viewGroup.getContext(), true);
        this.i = m6Var2;
        m6Var2.setContinuousRotation(540.0f);
        m6Var2.f(m6Var);
        m6Var2.setAlpha(0.0f);
        t9Var.addView(m6Var2, w7.z5.e(60, 60, 51));
        viewGroup.addView(t9Var, new ViewGroup.LayoutParams(-1, -1));
        c(a2.centerX(), a2.centerY(), a2.width());
        m6Var2.l(new Runnable(this) { // from class: org.telegram.ui.Wallet.s9
            public final /* synthetic */ v9 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                f3 f3Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (i11) {
                    case 0:
                        v9 v9Var = this.b;
                        m6 m6Var22 = v9Var.d;
                        ViewGroup viewGroup2 = v9Var.b;
                        AnimatorSet animatorSet2 = v9Var.m;
                        m6 m6Var3 = v9Var.i;
                        RectF rectF = v9Var.o;
                        RectF rectF2 = v9Var.n;
                        if (!v9Var.s && !v9Var.r) {
                            v9Var.e();
                            v9Var.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            n5 n5Var2 = v9Var.e;
                            TL_wallet.walletTransaction wallettransaction3 = v9Var.f;
                            a71 a71Var = n5Var2.q0[0];
                            f3 f3Var2 = null;
                            if (a71Var != null) {
                                int i112 = 0;
                                while (true) {
                                    if (i112 < a71Var.getChildCount()) {
                                        View childAt = a71Var.getChildAt(i112);
                                        if ((childAt instanceof f3) && (wallettransaction2 = (f3Var = (f3) childAt).R) != null && d3.a(wallettransaction2, wallettransaction3)) {
                                            f3Var2 = f3Var;
                                        } else {
                                            i112++;
                                        }
                                    }
                                }
                            }
                            if (f3Var2 != null && f3Var2.getWidth() > 0) {
                                f3 f3Var3 = v9Var.p;
                                if (f3Var3 != f3Var2) {
                                    if (f3Var3 != null) {
                                        f3Var3.g(false);
                                    }
                                    v9Var.p = f3Var2;
                                    f3Var2.g(true);
                                }
                                m6 pendingDiamond = v9Var.p.getPendingDiamond();
                                if (v9Var.q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !v9Var.p.isLayoutRequested()) {
                                    rectF.set(v9Var.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        v9Var.r = true;
                                        m6Var3.f(m6Var22);
                                        m6Var3.setAlpha(1.0f);
                                        m6Var22.setAlpha(0.0f);
                                        v9Var.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - v9Var.t <= 450 && viewGroup2.isAttachedToWindow()) {
                                v9Var.h.postOnAnimation(v9Var.u);
                                break;
                            } else {
                                v9Var.r = true;
                                m6Var3.setAlpha(0.0f);
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
        ofFloat.addUpdateListener(new v2(this, 11));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new u9(this, tiVar, m6Var));
        n5Var.I0();
        n5Var.Q0(false);
        u61 u61Var = n5Var.a;
        if (u61Var != null) {
            u61Var.B0();
            n5Var.a.V2.h1(0, 0);
            a71 a71Var = n5Var.q0[0];
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
                            int i13 = d3.a;
                            if ((wallettransaction2 instanceof c3 ? ((c3) wallettransaction2).a : wallettransaction2) == wallettransaction || m0.f0((TL_wallet.walletTransaction) obj, wallettransaction)) {
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
        s9 s9Var = this.u;
        t9 t9Var = this.h;
        t9Var.removeCallbacks(s9Var);
        m6 m6Var = this.i;
        m6Var.l(null);
        f3 f3Var = this.p;
        if (f3Var != null && (wallettransaction = f3Var.R) != null && d3.a(wallettransaction, this.f)) {
            m6 pendingDiamond = this.p.getPendingDiamond();
            if (pendingDiamond != null) {
                pendingDiamond.f(m6Var);
            }
            this.p.g(false);
            RectF rectF = this.o;
            if (!rectF.isEmpty()) {
                float centerY = (((rectF.centerY() - (Math.min(this.n.centerY(), rectF.centerY()) - AndroidUtilities.dp(150.0f))) * 2.0f) / 0.6f) / AndroidUtilities.density;
                f3 f3Var2 = this.p;
                f3Var2.e();
                o1.k kVar = new o1.k(new o1.j(0.0f));
                f3Var2.H = kVar;
                o1.l lVar = new o1.l(0.0f);
                lVar.a(0.65f);
                lVar.b(200.0f);
                kVar.u = lVar;
                f3Var2.H.e(0.001f);
                f3Var2.H.a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                f3Var2.H.b(new a3(f3Var2, 0));
                f3Var2.H.h();
            }
        }
        m6Var.setPaused(true);
        t9Var.removeView(m6Var);
        t9Var.setClickable(false);
        this.d.setAlpha(this.l);
        ti tiVar = this.a;
        if (tiVar == null) {
            this.c.setTranslationY(0.0f);
        } else {
            tiVar.M1(1.0f);
        }
        ViewGroup viewGroup = this.b;
        if (tiVar != null && this.j.d()) {
            n5 n5Var = this.e;
            if (n5Var.getParentLayout() != null) {
                ViewGroup view = n5Var.getParentLayout().getView();
                if (view.isAttachedToWindow()) {
                    viewGroup.getLocationOnScreen(new int[2]);
                    view.getLocationOnScreen(new int[2]);
                    viewGroup.removeView(t9Var);
                    t9Var.setTranslationX(r6[0] - r4[0]);
                    t9Var.setTranslationY(r6[1] - r4[1]);
                    view.addView(t9Var, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.g.run();
        AndroidUtilities.runOnUIThread(new v3(17, this, viewGroup), 650L);
    }

    public final void c(float f7, float f10, float f11) {
        float dp = AndroidUtilities.dp(60.0f);
        t9 t9Var = this.h;
        float f12 = dp / 2.0f;
        m6 m6Var = this.i;
        m6Var.setTranslationX((f7 - t9Var.getLeft()) - f12);
        m6Var.setTranslationY((f10 - t9Var.getTop()) - f12);
        float f13 = f11 / dp;
        m6Var.setScaleX(f13);
        m6Var.setScaleY(f13);
    }

    public final RectF d(m6 m6Var) {
        ti tiVar = this.a;
        ViewGroup viewGroup = this.b;
        if (tiVar == null) {
            return a(viewGroup, m6Var);
        }
        ViewGroup viewGroup2 = (ViewGroup) m6Var.getRootView();
        RectF a2 = a(viewGroup2, m6Var);
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
        m6 m6Var = this.d;
        ti tiVar = this.a;
        if (tiVar == null) {
            f(m6Var, this.c, viewGroup, rectF);
        } else if (m6Var.isAttachedToWindow() && m6Var.getRootView() == viewGroup.getRootView()) {
            rectF.set(a(viewGroup, m6Var));
            rectF.offset(0.0f, tiVar.o2 - tiVar.y0);
        }
    }
}
