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
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.yi;
import org.telegram.ui.ii1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class w8 {
    public final yi a;
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
    public x2 p;
    public boolean q;
    public boolean r;
    public boolean s;
    public final long t;
    public final t8 u;

    /* JADX WARN: Type inference failed for: r1v3, types: [org.telegram.ui.Wallet.t8] */
    public w8(ViewGroup viewGroup, View view, c6 c6Var, a5 a5Var, TL_wallet.walletTransaction wallettransaction, Runnable runnable, yi yiVar) {
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
                x2 x2Var;
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
                            k71 k71Var = a5Var2.p0[0];
                            x2 x2Var2 = null;
                            if (k71Var != null) {
                                int i11 = 0;
                                while (true) {
                                    if (i11 < k71Var.getChildCount()) {
                                        View childAt = k71Var.getChildAt(i11);
                                        if ((childAt instanceof x2) && (wallettransaction2 = (x2Var = (x2) childAt).R) != null && v2.a(wallettransaction2, wallettransaction3)) {
                                            x2Var2 = x2Var;
                                        } else {
                                            i11++;
                                        }
                                    }
                                }
                            }
                            if (x2Var2 != null && x2Var2.getWidth() > 0) {
                                x2 x2Var3 = w8Var.p;
                                if (x2Var3 != x2Var2) {
                                    if (x2Var3 != null) {
                                        x2Var3.g(false);
                                    }
                                    w8Var.p = x2Var2;
                                    x2Var2.g(true);
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
        this.a = yiVar;
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
        u8Var.addView(c6Var2, w7.x5.e(60, 60, 51));
        viewGroup.addView(u8Var, new ViewGroup.LayoutParams(-1, -1));
        c(a2.centerX(), a2.centerY(), a2.width());
        c6Var2.l(new Runnable(this) { // from class: org.telegram.ui.Wallet.t8
            public final /* synthetic */ w8 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                x2 x2Var;
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
                            k71 k71Var = a5Var2.p0[0];
                            x2 x2Var2 = null;
                            if (k71Var != null) {
                                int i112 = 0;
                                while (true) {
                                    if (i112 < k71Var.getChildCount()) {
                                        View childAt = k71Var.getChildAt(i112);
                                        if ((childAt instanceof x2) && (wallettransaction2 = (x2Var = (x2) childAt).R) != null && v2.a(wallettransaction2, wallettransaction3)) {
                                            x2Var2 = x2Var;
                                        } else {
                                            i112++;
                                        }
                                    }
                                }
                            }
                            if (x2Var2 != null && x2Var2.getWidth() > 0) {
                                x2 x2Var3 = w8Var.p;
                                if (x2Var3 != x2Var2) {
                                    if (x2Var3 != null) {
                                        x2Var3.g(false);
                                    }
                                    w8Var.p = x2Var2;
                                    x2Var2.g(true);
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
        ofFloat.addUpdateListener(new s2(this, 9));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new v8(this, yiVar, c6Var));
        a5Var.f0 = 0;
        ci.h1 h1Var = a5Var.n0;
        if (h1Var != null) {
            h1Var.setPosition(0);
        }
        a5Var.F0(false);
        e71 e71Var = a5Var.a;
        if (e71Var != null) {
            e71Var.B0();
            a5Var.a.V2.h1(0, 0);
            k71 k71Var = a5Var.p0[0];
            if (k71Var != null) {
                c71 c71Var = k71Var.W2;
                k71Var.B0();
                c71Var.N(false);
                for (int i12 = 0; i12 < c71Var.x.size(); i12++) {
                    p61 G = c71Var.G(i12);
                    if (G != null) {
                        Object obj = G.G;
                        if (obj instanceof TL_wallet.walletTransaction) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                            int i13 = v2.a;
                            if ((wallettransaction2 instanceof u2 ? ((u2) wallettransaction2).a : wallettransaction2) == wallettransaction || k0.d0((TL_wallet.walletTransaction) obj, wallettransaction)) {
                                k71Var.V2.h1(i12, 0);
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
        x2 x2Var = this.p;
        if (x2Var != null && (wallettransaction = x2Var.R) != null && v2.a(wallettransaction, this.f)) {
            c6 pendingDiamond = this.p.getPendingDiamond();
            if (pendingDiamond != null) {
                pendingDiamond.f(c6Var);
            }
            this.p.g(false);
            RectF rectF = this.o;
            if (!rectF.isEmpty()) {
                float centerY = (((rectF.centerY() - (Math.min(this.n.centerY(), rectF.centerY()) - AndroidUtilities.dp(150.0f))) * 2.0f) / 0.6f) / AndroidUtilities.density;
                x2 x2Var2 = this.p;
                x2Var2.d();
                o1.k kVar = new o1.k(new o1.j(0.0f));
                x2Var2.H = kVar;
                o1.l lVar = new o1.l(0.0f);
                lVar.a(0.65f);
                lVar.b(200.0f);
                kVar.u = lVar;
                x2Var2.H.e(0.001f);
                x2Var2.H.a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                x2Var2.H.b(new r2(x2Var2, 0));
                x2Var2.H.h();
            }
        }
        c6Var.setPaused(true);
        u8Var.removeView(c6Var);
        u8Var.setClickable(false);
        this.d.setAlpha(this.l);
        yi yiVar = this.a;
        if (yiVar == null) {
            this.c.setTranslationY(0.0f);
        } else {
            yiVar.M1(1.0f);
        }
        ViewGroup viewGroup = this.b;
        if (yiVar != null && this.j.d()) {
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
        AndroidUtilities.runOnUIThread(new ii1(19, this, viewGroup), 650L);
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
        yi yiVar = this.a;
        ViewGroup viewGroup = this.b;
        if (yiVar == null) {
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
        yi yiVar = this.a;
        if (yiVar == null) {
            f(c6Var, this.c, viewGroup, rectF);
        } else if (c6Var.isAttachedToWindow() && c6Var.getRootView() == viewGroup.getRootView()) {
            rectF.set(a(viewGroup, c6Var));
            rectF.offset(0.0f, yiVar.o2 - yiVar.y0);
        }
    }
}
