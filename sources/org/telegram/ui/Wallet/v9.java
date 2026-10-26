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
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.ti;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class v9 {
    public final ti a;
    public final ViewGroup b;
    public final View c;
    public final l6 d;
    public final m5 e;
    public final TL_wallet.walletTransaction f;
    public final Runnable g;
    public final t9 h;
    public final l6 i;
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
    public v9(ViewGroup viewGroup, View view, l6 l6Var, m5 m5Var, TL_wallet.walletTransaction wallettransaction, Runnable runnable, ti tiVar) {
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
                        l6 l6Var2 = v9Var.d;
                        ViewGroup viewGroup2 = v9Var.b;
                        AnimatorSet animatorSet2 = v9Var.m;
                        l6 l6Var3 = v9Var.i;
                        RectF rectF = v9Var.o;
                        RectF rectF2 = v9Var.n;
                        if (!v9Var.s && !v9Var.r) {
                            v9Var.e();
                            v9Var.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            m5 m5Var2 = v9Var.e;
                            TL_wallet.walletTransaction wallettransaction3 = v9Var.f;
                            r71 r71Var = m5Var2.r0[0];
                            f3 f3Var2 = null;
                            if (r71Var != null) {
                                int i11 = 0;
                                while (true) {
                                    if (i11 < r71Var.getChildCount()) {
                                        View childAt = r71Var.getChildAt(i11);
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
                                        f3Var3.f(false);
                                    }
                                    v9Var.p = f3Var2;
                                    f3Var2.f(true);
                                }
                                l6 pendingDiamond = v9Var.p.getPendingDiamond();
                                if (v9Var.q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !v9Var.p.isLayoutRequested()) {
                                    rectF.set(v9Var.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        v9Var.r = true;
                                        l6Var3.f(l6Var2);
                                        l6Var3.setAlpha(1.0f);
                                        l6Var2.setAlpha(0.0f);
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
                                l6Var3.setAlpha(0.0f);
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
        this.d = l6Var;
        this.l = l6Var.getAlpha();
        this.e = m5Var;
        this.f = wallettransaction;
        this.g = runnable;
        RectF a2 = a(viewGroup, l6Var);
        this.n = a2;
        t9 t9Var = new t9(this, viewGroup.getContext());
        this.h = t9Var;
        t9Var.setClipChildren(false);
        t9Var.setClipToPadding(false);
        final int i11 = 1;
        t9Var.setClickable(true);
        l6 l6Var2 = new l6(60, viewGroup.getContext(), true);
        this.i = l6Var2;
        l6Var2.setContinuousRotation(540.0f);
        l6Var2.f(l6Var);
        l6Var2.setAlpha(0.0f);
        t9Var.addView(l6Var2, gb1.i(60, 60, 51));
        viewGroup.addView(t9Var, new ViewGroup.LayoutParams(-1, -1));
        c(a2.centerX(), a2.centerY(), a2.width());
        l6Var2.l(new Runnable(this) { // from class: org.telegram.ui.Wallet.s9
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
                        l6 l6Var22 = v9Var.d;
                        ViewGroup viewGroup2 = v9Var.b;
                        AnimatorSet animatorSet2 = v9Var.m;
                        l6 l6Var3 = v9Var.i;
                        RectF rectF = v9Var.o;
                        RectF rectF2 = v9Var.n;
                        if (!v9Var.s && !v9Var.r) {
                            v9Var.e();
                            v9Var.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            m5 m5Var2 = v9Var.e;
                            TL_wallet.walletTransaction wallettransaction3 = v9Var.f;
                            r71 r71Var = m5Var2.r0[0];
                            f3 f3Var2 = null;
                            if (r71Var != null) {
                                int i112 = 0;
                                while (true) {
                                    if (i112 < r71Var.getChildCount()) {
                                        View childAt = r71Var.getChildAt(i112);
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
                                        f3Var3.f(false);
                                    }
                                    v9Var.p = f3Var2;
                                    f3Var2.f(true);
                                }
                                l6 pendingDiamond = v9Var.p.getPendingDiamond();
                                if (v9Var.q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !v9Var.p.isLayoutRequested()) {
                                    rectF.set(v9Var.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        v9Var.r = true;
                                        l6Var3.f(l6Var22);
                                        l6Var3.setAlpha(1.0f);
                                        l6Var22.setAlpha(0.0f);
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
                                l6Var3.setAlpha(0.0f);
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
        ofFloat.addUpdateListener(new a3(this, 10));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new u9(this, tiVar, l6Var));
        m5Var.K0();
        m5Var.T0(false);
        l71 l71Var = m5Var.a;
        if (l71Var != null) {
            l71Var.C0();
            m5Var.a.f3.h1(0, 0);
            r71 r71Var = m5Var.r0[0];
            if (r71Var != null) {
                j71 j71Var = r71Var.g3;
                r71Var.C0();
                j71Var.O(false);
                for (int i12 = 0; i12 < j71Var.y.size(); i12++) {
                    t61 G = j71Var.G(i12);
                    if (G != null) {
                        Object obj = G.G;
                        if (obj instanceof TL_wallet.walletTransaction) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                            int i13 = d3.a;
                            if ((wallettransaction2 instanceof c3 ? ((c3) wallettransaction2).a : wallettransaction2) == wallettransaction || l0.f0((TL_wallet.walletTransaction) obj, wallettransaction)) {
                                r71Var.f3.h1(i12, 0);
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
        l6 l6Var = this.i;
        l6Var.l(null);
        f3 f3Var = this.p;
        if (f3Var != null && (wallettransaction = f3Var.R) != null && d3.a(wallettransaction, this.f)) {
            l6 pendingDiamond = this.p.getPendingDiamond();
            if (pendingDiamond != null) {
                pendingDiamond.f(l6Var);
            }
            this.p.f(false);
            RectF rectF = this.o;
            if (!rectF.isEmpty()) {
                float centerY = (((rectF.centerY() - (Math.min(this.n.centerY(), rectF.centerY()) - AndroidUtilities.dp(150.0f))) * 2.0f) / 0.6f) / AndroidUtilities.density;
                f3 f3Var2 = this.p;
                f3Var2.d();
                o1.j jVar = new o1.j(new ac.a(0.0f));
                f3Var2.H = jVar;
                o1.k kVar = new o1.k(0.0f);
                kVar.a(0.65f);
                kVar.b(200.0f);
                jVar.u = kVar;
                f3Var2.H.e(0.001f);
                f3Var2.H.a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                f3Var2.H.b(new z2(f3Var2, 0));
                f3Var2.H.h();
            }
        }
        l6Var.setPaused(true);
        t9Var.removeView(l6Var);
        t9Var.setClickable(false);
        this.d.setAlpha(this.l);
        ti tiVar = this.a;
        if (tiVar == null) {
            this.c.setTranslationY(0.0f);
        } else {
            tiVar.P1(1.0f);
        }
        ViewGroup viewGroup = this.b;
        if (tiVar != null && this.j.d()) {
            m5 m5Var = this.e;
            if (m5Var.getParentLayout() != null) {
                ViewGroup view = m5Var.getParentLayout().getView();
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
        AndroidUtilities.runOnUIThread(new q6(6, this, viewGroup), 650L);
    }

    public final void c(float f7, float f10, float f11) {
        float dp = AndroidUtilities.dp(60.0f);
        t9 t9Var = this.h;
        float f12 = dp / 2.0f;
        l6 l6Var = this.i;
        l6Var.setTranslationX((f7 - t9Var.getLeft()) - f12);
        l6Var.setTranslationY((f10 - t9Var.getTop()) - f12);
        float f13 = f11 / dp;
        l6Var.setScaleX(f13);
        l6Var.setScaleY(f13);
    }

    public final RectF d(l6 l6Var) {
        ti tiVar = this.a;
        ViewGroup viewGroup = this.b;
        if (tiVar == null) {
            return a(viewGroup, l6Var);
        }
        ViewGroup viewGroup2 = (ViewGroup) l6Var.getRootView();
        RectF a2 = a(viewGroup2, l6Var);
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
        l6 l6Var = this.d;
        ti tiVar = this.a;
        if (tiVar == null) {
            f(l6Var, this.c, viewGroup, rectF);
        } else if (l6Var.isAttachedToWindow() && l6Var.getRootView() == viewGroup.getRootView()) {
            rectF.set(a(viewGroup, l6Var));
            rectF.offset(0.0f, tiVar.o2 - tiVar.y0);
        }
    }
}
