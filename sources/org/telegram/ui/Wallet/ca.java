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
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.sb1;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class ca {
    public final ci a;
    public final ViewGroup b;
    public final View c;
    public final x6 d;
    public final z5 e;
    public final TL_wallet.walletTransaction f;
    public final Runnable g;
    public final aa h;
    public final x6 i;
    public final q9 j = new q9();
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
    public final z9 u;

    /* JADX WARN: Type inference failed for: r1v3, types: [org.telegram.ui.Wallet.z9] */
    public ca(ViewGroup viewGroup, View view, x6 x6Var, z5 z5Var, TL_wallet.walletTransaction wallettransaction, Runnable runnable, ci ciVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.m = animatorSet;
        this.o = new RectF();
        this.t = SystemClock.uptimeMillis();
        final int i7 = 0;
        this.u = new Runnable(this) { // from class: org.telegram.ui.Wallet.z9
            public final /* synthetic */ ca b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                w3 w3Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (i7) {
                    case 0:
                        ca caVar = this.b;
                        x6 x6Var2 = caVar.d;
                        ViewGroup viewGroup2 = caVar.b;
                        AnimatorSet animatorSet2 = caVar.m;
                        x6 x6Var3 = caVar.i;
                        RectF rectF = caVar.o;
                        RectF rectF2 = caVar.n;
                        if (!caVar.s && !caVar.r) {
                            caVar.e();
                            caVar.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            z5 z5Var2 = caVar.e;
                            TL_wallet.walletTransaction wallettransaction3 = caVar.f;
                            r41 r41Var = z5Var2.r0[0];
                            w3 w3Var2 = null;
                            if (r41Var != null) {
                                int i10 = 0;
                                while (true) {
                                    if (i10 < r41Var.getChildCount()) {
                                        View childAt = r41Var.getChildAt(i10);
                                        if ((childAt instanceof w3) && (wallettransaction2 = (w3Var = (w3) childAt).R) != null && u3.i(wallettransaction2, wallettransaction3)) {
                                            w3Var2 = w3Var;
                                        } else {
                                            i10++;
                                        }
                                    }
                                }
                            }
                            if (w3Var2 != null && w3Var2.getWidth() > 0) {
                                w3 w3Var3 = caVar.p;
                                if (w3Var3 != w3Var2) {
                                    if (w3Var3 != null) {
                                        w3Var3.f(false);
                                    }
                                    caVar.p = w3Var2;
                                    w3Var2.f(true);
                                }
                                x6 pendingDiamond = caVar.p.getPendingDiamond();
                                if (caVar.q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !caVar.p.isLayoutRequested()) {
                                    rectF.set(caVar.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        caVar.r = true;
                                        x6Var3.f(x6Var2);
                                        x6Var3.setAlpha(1.0f);
                                        x6Var2.setAlpha(0.0f);
                                        caVar.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - caVar.t <= 450 && viewGroup2.isAttachedToWindow()) {
                                caVar.h.postOnAnimation(caVar.u);
                                break;
                            } else {
                                caVar.r = true;
                                x6Var3.setAlpha(0.0f);
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
        this.a = ciVar;
        this.b = viewGroup;
        this.c = view;
        this.d = x6Var;
        this.l = x6Var.getAlpha();
        this.e = z5Var;
        this.f = wallettransaction;
        this.g = runnable;
        RectF a10 = a(x6Var, viewGroup);
        this.n = a10;
        aa aaVar = new aa(this, viewGroup.getContext());
        this.h = aaVar;
        aaVar.setClipChildren(false);
        aaVar.setClipToPadding(false);
        final int i10 = 1;
        aaVar.setClickable(true);
        x6 x6Var2 = new x6(60, viewGroup.getContext(), true);
        this.i = x6Var2;
        x6Var2.setContinuousRotation(540.0f);
        x6Var2.f(x6Var);
        x6Var2.setAlpha(0.0f);
        aaVar.addView(x6Var2, c8.ha.e(60, 60, 51));
        viewGroup.addView(aaVar, new ViewGroup.LayoutParams(-1, -1));
        c(a10.centerX(), a10.centerY(), a10.width());
        x6Var2.l(new Runnable(this) { // from class: org.telegram.ui.Wallet.z9
            public final /* synthetic */ ca b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                w3 w3Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (i10) {
                    case 0:
                        ca caVar = this.b;
                        x6 x6Var22 = caVar.d;
                        ViewGroup viewGroup2 = caVar.b;
                        AnimatorSet animatorSet2 = caVar.m;
                        x6 x6Var3 = caVar.i;
                        RectF rectF = caVar.o;
                        RectF rectF2 = caVar.n;
                        if (!caVar.s && !caVar.r) {
                            caVar.e();
                            caVar.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            z5 z5Var2 = caVar.e;
                            TL_wallet.walletTransaction wallettransaction3 = caVar.f;
                            r41 r41Var = z5Var2.r0[0];
                            w3 w3Var2 = null;
                            if (r41Var != null) {
                                int i102 = 0;
                                while (true) {
                                    if (i102 < r41Var.getChildCount()) {
                                        View childAt = r41Var.getChildAt(i102);
                                        if ((childAt instanceof w3) && (wallettransaction2 = (w3Var = (w3) childAt).R) != null && u3.i(wallettransaction2, wallettransaction3)) {
                                            w3Var2 = w3Var;
                                        } else {
                                            i102++;
                                        }
                                    }
                                }
                            }
                            if (w3Var2 != null && w3Var2.getWidth() > 0) {
                                w3 w3Var3 = caVar.p;
                                if (w3Var3 != w3Var2) {
                                    if (w3Var3 != null) {
                                        w3Var3.f(false);
                                    }
                                    caVar.p = w3Var2;
                                    w3Var2.f(true);
                                }
                                x6 pendingDiamond = caVar.p.getPendingDiamond();
                                if (caVar.q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !caVar.p.isLayoutRequested()) {
                                    rectF.set(caVar.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        caVar.r = true;
                                        x6Var3.f(x6Var22);
                                        x6Var3.setAlpha(1.0f);
                                        x6Var22.setAlpha(0.0f);
                                        caVar.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - caVar.t <= 450 && viewGroup2.isAttachedToWindow()) {
                                caVar.h.postOnAnimation(caVar.u);
                                break;
                            } else {
                                caVar.r = true;
                                x6Var3.setAlpha(0.0f);
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
        animatorSet.addListener(new ba(this, ciVar, x6Var));
        z5Var.P0();
        z5Var.Y0(false);
        fi.w3 w3Var = z5Var.a;
        if (w3Var != null) {
            w3Var.C0();
            z5Var.a.e3.h1(0, 0);
            r41 r41Var = z5Var.r0[0];
            if (r41Var != null) {
                m41 m41Var = r41Var.f3;
                r41Var.C0();
                m41Var.O(false);
                for (int i11 = 0; i11 < m41Var.D.size(); i11++) {
                    x31 G = m41Var.G(i11);
                    if (G != null) {
                        Object obj = G.G;
                        if (obj instanceof TL_wallet.walletTransaction) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                            int i12 = u3.b;
                            if ((wallettransaction2 instanceof t3 ? ((t3) wallettransaction2).a : wallettransaction2) == wallettransaction || l0.i0((TL_wallet.walletTransaction) obj, wallettransaction)) {
                                r41Var.e3.h1(i11, 0);
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
        z9 z9Var = this.u;
        aa aaVar = this.h;
        aaVar.removeCallbacks(z9Var);
        x6 x6Var = this.i;
        x6Var.l(null);
        w3 w3Var = this.p;
        if (w3Var != null && (wallettransaction = w3Var.R) != null && u3.i(wallettransaction, this.f)) {
            x6 pendingDiamond = this.p.getPendingDiamond();
            if (pendingDiamond != null) {
                pendingDiamond.f(x6Var);
            }
            this.p.f(false);
            RectF rectF = this.o;
            if (!rectF.isEmpty()) {
                float centerY = (((rectF.centerY() - (Math.min(this.n.centerY(), rectF.centerY()) - org.telegram.messenger.g0.L(150.0f))) * 2.0f) / 0.6f) / org.telegram.messenger.g0.p;
                w3 w3Var2 = this.p;
                w3Var2.d();
                r1.g gVar = new r1.g(new r1.f(0.0f));
                w3Var2.H = gVar;
                r1.h hVar = new r1.h(0.0f);
                hVar.a(0.65f);
                hVar.b(200.0f);
                gVar.m = hVar;
                w3Var2.H.f(0.001f);
                w3Var2.H.a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                w3Var2.H.b(new q3(w3Var2, 0));
                w3Var2.H.h();
            }
        }
        x6Var.setPaused(true);
        aaVar.removeView(x6Var);
        aaVar.setClickable(false);
        this.d.setAlpha(this.l);
        ci ciVar = this.a;
        if (ciVar == null) {
            this.c.setTranslationY(0.0f);
        } else {
            ciVar.x1(1.0f);
        }
        ViewGroup viewGroup = this.b;
        if (ciVar != null && this.j.d()) {
            z5 z5Var = this.e;
            if (z5Var.getParentLayout() != null) {
                ViewGroup view = z5Var.getParentLayout().getView();
                if (view.isAttachedToWindow()) {
                    viewGroup.getLocationOnScreen(new int[2]);
                    view.getLocationOnScreen(new int[2]);
                    viewGroup.removeView(aaVar);
                    aaVar.setTranslationX(r6[0] - r4[0]);
                    aaVar.setTranslationY(r6[1] - r4[1]);
                    view.addView(aaVar, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.g.run();
        org.telegram.messenger.g0.i3(new sb1(25, this, viewGroup), 650L);
    }

    public final void c(float f10, float f11, float f12) {
        float L = org.telegram.messenger.g0.L(60.0f);
        aa aaVar = this.h;
        float f13 = L / 2.0f;
        x6 x6Var = this.i;
        x6Var.setTranslationX((f10 - aaVar.getLeft()) - f13);
        x6Var.setTranslationY((f11 - aaVar.getTop()) - f13);
        float f14 = f12 / L;
        x6Var.setScaleX(f14);
        x6Var.setScaleY(f14);
    }

    public final RectF d(x6 x6Var) {
        ci ciVar = this.a;
        ViewGroup viewGroup = this.b;
        if (ciVar == null) {
            return a(x6Var, viewGroup);
        }
        ViewGroup viewGroup2 = (ViewGroup) x6Var.getRootView();
        RectF a10 = a(x6Var, viewGroup2);
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
        x6 x6Var = this.d;
        ci ciVar = this.a;
        if (ciVar == null) {
            f(x6Var, this.c, viewGroup, rectF);
        } else if (x6Var.isAttachedToWindow() && x6Var.getRootView() == viewGroup.getRootView()) {
            rectF.set(a(x6Var, viewGroup));
            rectF.offset(0.0f, ciVar.i4 - ciVar.s2);
        }
    }
}
