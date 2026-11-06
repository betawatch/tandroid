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
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.r31;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class ba {
    public final di a;
    public final ViewGroup b;
    public final View c;
    public final w6 d;
    public final y5 e;
    public final TL_wallet.walletTransaction f;
    public final Runnable g;
    public final z9 h;
    public final w6 i;
    public final p9 j = new p9();
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
    public final y9 u;

    /* JADX WARN: Type inference failed for: r1v3, types: [org.telegram.ui.Wallet.y9] */
    public ba(ViewGroup viewGroup, View view, w6 w6Var, y5 y5Var, TL_wallet.walletTransaction wallettransaction, Runnable runnable, di diVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.m = animatorSet;
        this.o = new RectF();
        this.t = SystemClock.uptimeMillis();
        final int i7 = 0;
        this.u = new Runnable(this) { // from class: org.telegram.ui.Wallet.y9
            public final /* synthetic */ ba b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                w3 w3Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (i7) {
                    case 0:
                        ba baVar = this.b;
                        w6 w6Var2 = baVar.d;
                        ViewGroup viewGroup2 = baVar.b;
                        AnimatorSet animatorSet2 = baVar.m;
                        w6 w6Var3 = baVar.i;
                        RectF rectF = baVar.o;
                        RectF rectF2 = baVar.n;
                        if (!baVar.s && !baVar.r) {
                            baVar.e();
                            baVar.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            y5 y5Var2 = baVar.e;
                            TL_wallet.walletTransaction wallettransaction3 = baVar.f;
                            k41 k41Var = y5Var2.r0[0];
                            w3 w3Var2 = null;
                            if (k41Var != null) {
                                int i10 = 0;
                                while (true) {
                                    if (i10 < k41Var.getChildCount()) {
                                        View childAt = k41Var.getChildAt(i10);
                                        if ((childAt instanceof w3) && (wallettransaction2 = (w3Var = (w3) childAt).R) != null && u3.i(wallettransaction2, wallettransaction3)) {
                                            w3Var2 = w3Var;
                                        } else {
                                            i10++;
                                        }
                                    }
                                }
                            }
                            if (w3Var2 != null && w3Var2.getWidth() > 0) {
                                w3 w3Var3 = baVar.p;
                                if (w3Var3 != w3Var2) {
                                    if (w3Var3 != null) {
                                        w3Var3.f(false);
                                    }
                                    baVar.p = w3Var2;
                                    w3Var2.f(true);
                                }
                                w6 pendingDiamond = baVar.p.getPendingDiamond();
                                if (baVar.q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !baVar.p.isLayoutRequested()) {
                                    rectF.set(baVar.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        baVar.r = true;
                                        w6Var3.f(w6Var2);
                                        w6Var3.setAlpha(1.0f);
                                        w6Var2.setAlpha(0.0f);
                                        baVar.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - baVar.t <= 450 && viewGroup2.isAttachedToWindow()) {
                                baVar.h.postOnAnimation(baVar.u);
                                break;
                            } else {
                                baVar.r = true;
                                w6Var3.setAlpha(0.0f);
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
        this.a = diVar;
        this.b = viewGroup;
        this.c = view;
        this.d = w6Var;
        this.l = w6Var.getAlpha();
        this.e = y5Var;
        this.f = wallettransaction;
        this.g = runnable;
        RectF a10 = a(w6Var, viewGroup);
        this.n = a10;
        z9 z9Var = new z9(this, viewGroup.getContext());
        this.h = z9Var;
        z9Var.setClipChildren(false);
        z9Var.setClipToPadding(false);
        final int i10 = 1;
        z9Var.setClickable(true);
        w6 w6Var2 = new w6(60, viewGroup.getContext(), true);
        this.i = w6Var2;
        w6Var2.setContinuousRotation(540.0f);
        w6Var2.f(w6Var);
        w6Var2.setAlpha(0.0f);
        z9Var.addView(w6Var2, c8.ha.e(60, 60, 51));
        viewGroup.addView(z9Var, new ViewGroup.LayoutParams(-1, -1));
        c(a10.centerX(), a10.centerY(), a10.width());
        w6Var2.l(new Runnable(this) { // from class: org.telegram.ui.Wallet.y9
            public final /* synthetic */ ba b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                w3 w3Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (i10) {
                    case 0:
                        ba baVar = this.b;
                        w6 w6Var22 = baVar.d;
                        ViewGroup viewGroup2 = baVar.b;
                        AnimatorSet animatorSet2 = baVar.m;
                        w6 w6Var3 = baVar.i;
                        RectF rectF = baVar.o;
                        RectF rectF2 = baVar.n;
                        if (!baVar.s && !baVar.r) {
                            baVar.e();
                            baVar.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            y5 y5Var2 = baVar.e;
                            TL_wallet.walletTransaction wallettransaction3 = baVar.f;
                            k41 k41Var = y5Var2.r0[0];
                            w3 w3Var2 = null;
                            if (k41Var != null) {
                                int i102 = 0;
                                while (true) {
                                    if (i102 < k41Var.getChildCount()) {
                                        View childAt = k41Var.getChildAt(i102);
                                        if ((childAt instanceof w3) && (wallettransaction2 = (w3Var = (w3) childAt).R) != null && u3.i(wallettransaction2, wallettransaction3)) {
                                            w3Var2 = w3Var;
                                        } else {
                                            i102++;
                                        }
                                    }
                                }
                            }
                            if (w3Var2 != null && w3Var2.getWidth() > 0) {
                                w3 w3Var3 = baVar.p;
                                if (w3Var3 != w3Var2) {
                                    if (w3Var3 != null) {
                                        w3Var3.f(false);
                                    }
                                    baVar.p = w3Var2;
                                    w3Var2.f(true);
                                }
                                w6 pendingDiamond = baVar.p.getPendingDiamond();
                                if (baVar.q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !baVar.p.isLayoutRequested()) {
                                    rectF.set(baVar.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        baVar.r = true;
                                        w6Var3.f(w6Var22);
                                        w6Var3.setAlpha(1.0f);
                                        w6Var22.setAlpha(0.0f);
                                        baVar.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - baVar.t <= 450 && viewGroup2.isAttachedToWindow()) {
                                baVar.h.postOnAnimation(baVar.u);
                                break;
                            } else {
                                baVar.r = true;
                                w6Var3.setAlpha(0.0f);
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
        animatorSet.addListener(new aa(this, diVar, w6Var));
        y5Var.O0();
        y5Var.X0(false);
        fi.w3 w3Var = y5Var.a;
        if (w3Var != null) {
            w3Var.C0();
            y5Var.a.e3.h1(0, 0);
            k41 k41Var = y5Var.r0[0];
            if (k41Var != null) {
                f41 f41Var = k41Var.f3;
                k41Var.C0();
                f41Var.O(false);
                for (int i11 = 0; i11 < f41Var.D.size(); i11++) {
                    r31 G = f41Var.G(i11);
                    if (G != null) {
                        Object obj = G.G;
                        if (obj instanceof TL_wallet.walletTransaction) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                            int i12 = u3.b;
                            if ((wallettransaction2 instanceof t3 ? ((t3) wallettransaction2).a : wallettransaction2) == wallettransaction || n0.i0((TL_wallet.walletTransaction) obj, wallettransaction)) {
                                k41Var.e3.h1(i11, 0);
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
        y9 y9Var = this.u;
        z9 z9Var = this.h;
        z9Var.removeCallbacks(y9Var);
        w6 w6Var = this.i;
        w6Var.l(null);
        w3 w3Var = this.p;
        if (w3Var != null && (wallettransaction = w3Var.R) != null && u3.i(wallettransaction, this.f)) {
            w6 pendingDiamond = this.p.getPendingDiamond();
            if (pendingDiamond != null) {
                pendingDiamond.f(w6Var);
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
        w6Var.setPaused(true);
        z9Var.removeView(w6Var);
        z9Var.setClickable(false);
        this.d.setAlpha(this.l);
        di diVar = this.a;
        if (diVar == null) {
            this.c.setTranslationY(0.0f);
        } else {
            diVar.x1(1.0f);
        }
        ViewGroup viewGroup = this.b;
        if (diVar != null && this.j.d()) {
            y5 y5Var = this.e;
            if (y5Var.getParentLayout() != null) {
                ViewGroup view = y5Var.getParentLayout().getView();
                if (view.isAttachedToWindow()) {
                    viewGroup.getLocationOnScreen(new int[2]);
                    view.getLocationOnScreen(new int[2]);
                    viewGroup.removeView(z9Var);
                    z9Var.setTranslationX(r6[0] - r4[0]);
                    z9Var.setTranslationY(r6[1] - r4[1]);
                    view.addView(z9Var, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.g.run();
        org.telegram.messenger.g0.i3(new n(24, this, viewGroup), 650L);
    }

    public final void c(float f10, float f11, float f12) {
        float L = org.telegram.messenger.g0.L(60.0f);
        z9 z9Var = this.h;
        float f13 = L / 2.0f;
        w6 w6Var = this.i;
        w6Var.setTranslationX((f10 - z9Var.getLeft()) - f13);
        w6Var.setTranslationY((f11 - z9Var.getTop()) - f13);
        float f14 = f12 / L;
        w6Var.setScaleX(f14);
        w6Var.setScaleY(f14);
    }

    public final RectF d(w6 w6Var) {
        di diVar = this.a;
        ViewGroup viewGroup = this.b;
        if (diVar == null) {
            return a(w6Var, viewGroup);
        }
        ViewGroup viewGroup2 = (ViewGroup) w6Var.getRootView();
        RectF a10 = a(w6Var, viewGroup2);
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
        w6 w6Var = this.d;
        di diVar = this.a;
        if (diVar == null) {
            f(w6Var, this.c, viewGroup, rectF);
        } else if (w6Var.isAttachedToWindow() && w6Var.getRootView() == viewGroup.getRootView()) {
            rectF.set(a(w6Var, viewGroup));
            rectF.offset(0.0f, diVar.f4 - diVar.p2);
        }
    }
}
