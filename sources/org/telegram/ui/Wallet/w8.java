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
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.vi;
import org.telegram.ui.wg1;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class w8 {
    public final vi a;
    public final ViewGroup b;
    public final View c;
    public final c6 d;
    public final a5 e;
    public final TL_wallet.walletTransaction f;
    public final Runnable g;
    public final u8 h;
    public final c6 i;
    public final l8 j = new l8();
    public final PathInterpolator k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float l;
    public final AnimatorSet m;
    public final RectF n;
    public final RectF o;
    public y2 p;
    public boolean q;
    public boolean r;
    public boolean s;
    public final long t;
    public final t8 u;

    /* JADX WARN: Type inference failed for: r1v3, types: [org.telegram.ui.Wallet.t8] */
    public w8(ViewGroup viewGroup, View view, c6 c6Var, a5 a5Var, TL_wallet.walletTransaction wallettransaction, Runnable runnable, vi viVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.m = animatorSet;
        this.o = new RectF();
        this.t = SystemClock.uptimeMillis();
        final int i10 = 0;
        this.u = new Runnable(this) { // from class: org.telegram.ui.Wallet.t8
            public final /* synthetic */ w8 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                y2 y2Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (i10) {
                    case 0:
                        w8 w8Var = this.b;
                        c6 c6Var2 = w8Var.d;
                        ViewGroup viewGroup2 = w8Var.b;
                        AnimatorSet animatorSet2 = w8Var.m;
                        c6 c6Var3 = w8Var.i;
                        RectF rectF = w8Var.o;
                        RectF rectF2 = w8Var.n;
                        if (!w8Var.s && !w8Var.r) {
                            w8Var.e();
                            w8Var.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            a5 a5Var2 = w8Var.e;
                            TL_wallet.walletTransaction wallettransaction3 = w8Var.f;
                            i71 i71Var = a5Var2.p0[0];
                            y2 y2Var2 = null;
                            if (i71Var != null) {
                                int i11 = 0;
                                while (true) {
                                    if (i11 < i71Var.getChildCount()) {
                                        View childAt = i71Var.getChildAt(i11);
                                        if ((childAt instanceof y2) && (wallettransaction2 = (y2Var = (y2) childAt).R) != null && w2.a(wallettransaction2, wallettransaction3)) {
                                            y2Var2 = y2Var;
                                        } else {
                                            i11++;
                                        }
                                    }
                                }
                            }
                            if (y2Var2 != null && y2Var2.getWidth() > 0) {
                                y2 y2Var3 = w8Var.p;
                                if (y2Var3 != y2Var2) {
                                    if (y2Var3 != null) {
                                        y2Var3.g(false);
                                    }
                                    w8Var.p = y2Var2;
                                    y2Var2.g(true);
                                }
                                c6 pendingDiamond = w8Var.p.getPendingDiamond();
                                if (w8Var.q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !w8Var.p.isLayoutRequested()) {
                                    rectF.set(w8Var.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        w8Var.r = true;
                                        c6Var3.f(c6Var2);
                                        c6Var3.setAlpha(1.0f);
                                        c6Var2.setAlpha(0.0f);
                                        w8Var.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - w8Var.t <= 450 && viewGroup2.isAttachedToWindow()) {
                                w8Var.h.postOnAnimation(w8Var.u);
                                break;
                            } else {
                                w8Var.r = true;
                                c6Var3.setAlpha(0.0f);
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
        this.a = viVar;
        this.b = viewGroup;
        this.c = view;
        this.d = c6Var;
        this.l = c6Var.getAlpha();
        this.e = a5Var;
        this.f = wallettransaction;
        this.g = runnable;
        RectF a2 = a(viewGroup, c6Var);
        this.n = a2;
        u8 u8Var = new u8(this, viewGroup.getContext());
        this.h = u8Var;
        u8Var.setClipChildren(false);
        u8Var.setClipToPadding(false);
        final int i11 = 1;
        u8Var.setClickable(true);
        c6 c6Var2 = new c6(60, viewGroup.getContext(), false);
        this.i = c6Var2;
        c6Var2.setContinuousRotation(540.0f);
        c6Var2.f(c6Var);
        c6Var2.setAlpha(0.0f);
        u8Var.addView(c6Var2, w7.z5.e(60, 60, 51));
        viewGroup.addView(u8Var, new ViewGroup.LayoutParams(-1, -1));
        c(a2.centerX(), a2.centerY(), a2.width());
        c6Var2.l(new Runnable(this) { // from class: org.telegram.ui.Wallet.t8
            public final /* synthetic */ w8 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                y2 y2Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (i11) {
                    case 0:
                        w8 w8Var = this.b;
                        c6 c6Var22 = w8Var.d;
                        ViewGroup viewGroup2 = w8Var.b;
                        AnimatorSet animatorSet2 = w8Var.m;
                        c6 c6Var3 = w8Var.i;
                        RectF rectF = w8Var.o;
                        RectF rectF2 = w8Var.n;
                        if (!w8Var.s && !w8Var.r) {
                            w8Var.e();
                            w8Var.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            a5 a5Var2 = w8Var.e;
                            TL_wallet.walletTransaction wallettransaction3 = w8Var.f;
                            i71 i71Var = a5Var2.p0[0];
                            y2 y2Var2 = null;
                            if (i71Var != null) {
                                int i112 = 0;
                                while (true) {
                                    if (i112 < i71Var.getChildCount()) {
                                        View childAt = i71Var.getChildAt(i112);
                                        if ((childAt instanceof y2) && (wallettransaction2 = (y2Var = (y2) childAt).R) != null && w2.a(wallettransaction2, wallettransaction3)) {
                                            y2Var2 = y2Var;
                                        } else {
                                            i112++;
                                        }
                                    }
                                }
                            }
                            if (y2Var2 != null && y2Var2.getWidth() > 0) {
                                y2 y2Var3 = w8Var.p;
                                if (y2Var3 != y2Var2) {
                                    if (y2Var3 != null) {
                                        y2Var3.g(false);
                                    }
                                    w8Var.p = y2Var2;
                                    y2Var2.g(true);
                                }
                                c6 pendingDiamond = w8Var.p.getPendingDiamond();
                                if (w8Var.q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !w8Var.p.isLayoutRequested()) {
                                    rectF.set(w8Var.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        w8Var.r = true;
                                        c6Var3.f(c6Var22);
                                        c6Var3.setAlpha(1.0f);
                                        c6Var22.setAlpha(0.0f);
                                        w8Var.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - w8Var.t <= 450 && viewGroup2.isAttachedToWindow()) {
                                w8Var.h.postOnAnimation(w8Var.u);
                                break;
                            } else {
                                w8Var.r = true;
                                c6Var3.setAlpha(0.0f);
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
        ofFloat.addUpdateListener(new t2(this, 9));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new v8(this, viVar, c6Var));
        a5Var.f0 = 0;
        di.h1 h1Var = a5Var.n0;
        if (h1Var != null) {
            h1Var.setPosition(0);
        }
        a5Var.F0(false);
        c71 c71Var = a5Var.a;
        if (c71Var != null) {
            c71Var.B0();
            a5Var.a.V2.h1(0, 0);
            i71 i71Var = a5Var.p0[0];
            if (i71Var != null) {
                a71 a71Var = i71Var.W2;
                i71Var.B0();
                a71Var.N(false);
                for (int i12 = 0; i12 < a71Var.x.size(); i12++) {
                    m61 G = a71Var.G(i12);
                    if (G != null) {
                        Object obj = G.G;
                        if (obj instanceof TL_wallet.walletTransaction) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                            int i13 = w2.a;
                            if ((wallettransaction2 instanceof v2 ? ((v2) wallettransaction2).a : wallettransaction2) == wallettransaction || k0.d0((TL_wallet.walletTransaction) obj, wallettransaction)) {
                                i71Var.V2.h1(i12, 0);
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
        t8 t8Var = this.u;
        u8 u8Var = this.h;
        u8Var.removeCallbacks(t8Var);
        c6 c6Var = this.i;
        c6Var.l(null);
        y2 y2Var = this.p;
        if (y2Var != null && (wallettransaction = y2Var.R) != null && w2.a(wallettransaction, this.f)) {
            c6 pendingDiamond = this.p.getPendingDiamond();
            if (pendingDiamond != null) {
                pendingDiamond.f(c6Var);
            }
            this.p.g(false);
            RectF rectF = this.o;
            if (!rectF.isEmpty()) {
                float centerY = (((rectF.centerY() - (Math.min(this.n.centerY(), rectF.centerY()) - AndroidUtilities.dp(150.0f))) * 2.0f) / 0.6f) / AndroidUtilities.density;
                y2 y2Var2 = this.p;
                y2Var2.e();
                o1.k kVar = new o1.k(new o1.j(0.0f));
                y2Var2.H = kVar;
                o1.l lVar = new o1.l(0.0f);
                lVar.a(0.65f);
                lVar.b(200.0f);
                kVar.u = lVar;
                y2Var2.H.e(0.001f);
                y2Var2.H.a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                y2Var2.H.b(new s2(y2Var2, 0));
                y2Var2.H.h();
            }
        }
        c6Var.setPaused(true);
        u8Var.removeView(c6Var);
        u8Var.setClickable(false);
        this.d.setAlpha(this.l);
        vi viVar = this.a;
        if (viVar == null) {
            this.c.setTranslationY(0.0f);
        } else {
            viVar.M1(1.0f);
        }
        ViewGroup viewGroup = this.b;
        if (viVar != null && this.j.d()) {
            a5 a5Var = this.e;
            if (a5Var.getParentLayout() != null) {
                ViewGroup view = a5Var.getParentLayout().getView();
                if (view.isAttachedToWindow()) {
                    viewGroup.getLocationOnScreen(new int[2]);
                    view.getLocationOnScreen(new int[2]);
                    viewGroup.removeView(u8Var);
                    u8Var.setTranslationX(r6[0] - r4[0]);
                    u8Var.setTranslationY(r6[1] - r4[1]);
                    view.addView(u8Var, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.g.run();
        AndroidUtilities.runOnUIThread(new wg1(25, this, viewGroup), 650L);
    }

    public final void c(float f7, float f10, float f11) {
        float dp = AndroidUtilities.dp(60.0f);
        u8 u8Var = this.h;
        float f12 = dp / 2.0f;
        c6 c6Var = this.i;
        c6Var.setTranslationX((f7 - u8Var.getLeft()) - f12);
        c6Var.setTranslationY((f10 - u8Var.getTop()) - f12);
        float f13 = f11 / dp;
        c6Var.setScaleX(f13);
        c6Var.setScaleY(f13);
    }

    public final RectF d(c6 c6Var) {
        vi viVar = this.a;
        ViewGroup viewGroup = this.b;
        if (viVar == null) {
            return a(viewGroup, c6Var);
        }
        ViewGroup viewGroup2 = (ViewGroup) c6Var.getRootView();
        RectF a2 = a(viewGroup2, c6Var);
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
        c6 c6Var = this.d;
        vi viVar = this.a;
        if (viVar == null) {
            f(c6Var, this.c, viewGroup, rectF);
        } else if (c6Var.isAttachedToWindow() && c6Var.getRootView() == viewGroup.getRootView()) {
            rectF.set(a(viewGroup, c6Var));
            rectF.offset(0.0f, viVar.o2 - viVar.y0);
        }
    }
}
