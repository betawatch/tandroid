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
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class da {
    public final ki a;
    public final ViewGroup b;
    public final View c;
    public final w6 d;
    public final y5 e;
    public final TL_wallet.walletTransaction f;
    public final Runnable g;
    public final ba h;
    public final w6 i;
    public final r9 j = new r9();
    public final PathInterpolator k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float l;
    public final AnimatorSet m;
    public final RectF n;
    public final RectF o;
    public v3 p;
    public boolean q;
    public boolean r;
    public boolean s;
    public final long t;
    public final aa u;

    /* JADX WARN: Type inference failed for: r1v3, types: [org.telegram.ui.Wallet.aa] */
    public da(ViewGroup viewGroup, View view, w6 w6Var, y5 y5Var, TL_wallet.walletTransaction wallettransaction, Runnable runnable, ki kiVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.m = animatorSet;
        this.o = new RectF();
        this.t = SystemClock.uptimeMillis();
        final int i7 = 0;
        this.u = new Runnable(this) { // from class: org.telegram.ui.Wallet.aa
            public final /* synthetic */ da b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                v3 v3Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (i7) {
                    case 0:
                        da daVar = this.b;
                        w6 w6Var2 = daVar.d;
                        ViewGroup viewGroup2 = daVar.b;
                        AnimatorSet animatorSet2 = daVar.m;
                        w6 w6Var3 = daVar.i;
                        RectF rectF = daVar.o;
                        RectF rectF2 = daVar.n;
                        if (!daVar.s && !daVar.r) {
                            daVar.e();
                            daVar.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            y5 y5Var2 = daVar.e;
                            TL_wallet.walletTransaction wallettransaction3 = daVar.f;
                            u41 u41Var = y5Var2.s0[0];
                            v3 v3Var2 = null;
                            if (u41Var != null) {
                                int i10 = 0;
                                while (true) {
                                    if (i10 < u41Var.getChildCount()) {
                                        View childAt = u41Var.getChildAt(i10);
                                        if ((childAt instanceof v3) && (wallettransaction2 = (v3Var = (v3) childAt).S) != null && t3.i(wallettransaction2, wallettransaction3)) {
                                            v3Var2 = v3Var;
                                        } else {
                                            i10++;
                                        }
                                    }
                                }
                            }
                            if (v3Var2 != null && v3Var2.getWidth() > 0) {
                                v3 v3Var3 = daVar.p;
                                if (v3Var3 != v3Var2) {
                                    if (v3Var3 != null) {
                                        v3Var3.f(false);
                                    }
                                    daVar.p = v3Var2;
                                    v3Var2.f(true);
                                }
                                w6 pendingDiamond = daVar.p.getPendingDiamond();
                                if (daVar.q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !daVar.p.isLayoutRequested()) {
                                    rectF.set(daVar.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        daVar.r = true;
                                        w6Var3.f(w6Var2);
                                        w6Var3.setAlpha(1.0f);
                                        w6Var2.setAlpha(0.0f);
                                        daVar.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - daVar.t <= 450 && viewGroup2.isAttachedToWindow()) {
                                daVar.h.postOnAnimation(daVar.u);
                                break;
                            } else {
                                daVar.r = true;
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
        this.a = kiVar;
        this.b = viewGroup;
        this.c = view;
        this.d = w6Var;
        this.l = w6Var.getAlpha();
        this.e = y5Var;
        this.f = wallettransaction;
        this.g = runnable;
        RectF a10 = a(w6Var, viewGroup);
        this.n = a10;
        ba baVar = new ba(this, viewGroup.getContext());
        this.h = baVar;
        baVar.setClipChildren(false);
        baVar.setClipToPadding(false);
        final int i10 = 1;
        baVar.setClickable(true);
        w6 w6Var2 = new w6(60, viewGroup.getContext(), true);
        this.i = w6Var2;
        w6Var2.setContinuousRotation(540.0f);
        w6Var2.f(w6Var);
        w6Var2.setAlpha(0.0f);
        baVar.addView(w6Var2, c8.ja.e(60, 60, 51));
        viewGroup.addView(baVar, new ViewGroup.LayoutParams(-1, -1));
        c(a10.centerX(), a10.centerY(), a10.width());
        w6Var2.l(new Runnable(this) { // from class: org.telegram.ui.Wallet.aa
            public final /* synthetic */ da b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                v3 v3Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (i10) {
                    case 0:
                        da daVar = this.b;
                        w6 w6Var22 = daVar.d;
                        ViewGroup viewGroup2 = daVar.b;
                        AnimatorSet animatorSet2 = daVar.m;
                        w6 w6Var3 = daVar.i;
                        RectF rectF = daVar.o;
                        RectF rectF2 = daVar.n;
                        if (!daVar.s && !daVar.r) {
                            daVar.e();
                            daVar.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            y5 y5Var2 = daVar.e;
                            TL_wallet.walletTransaction wallettransaction3 = daVar.f;
                            u41 u41Var = y5Var2.s0[0];
                            v3 v3Var2 = null;
                            if (u41Var != null) {
                                int i102 = 0;
                                while (true) {
                                    if (i102 < u41Var.getChildCount()) {
                                        View childAt = u41Var.getChildAt(i102);
                                        if ((childAt instanceof v3) && (wallettransaction2 = (v3Var = (v3) childAt).S) != null && t3.i(wallettransaction2, wallettransaction3)) {
                                            v3Var2 = v3Var;
                                        } else {
                                            i102++;
                                        }
                                    }
                                }
                            }
                            if (v3Var2 != null && v3Var2.getWidth() > 0) {
                                v3 v3Var3 = daVar.p;
                                if (v3Var3 != v3Var2) {
                                    if (v3Var3 != null) {
                                        v3Var3.f(false);
                                    }
                                    daVar.p = v3Var2;
                                    v3Var2.f(true);
                                }
                                w6 pendingDiamond = daVar.p.getPendingDiamond();
                                if (daVar.q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !daVar.p.isLayoutRequested()) {
                                    rectF.set(daVar.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        daVar.r = true;
                                        w6Var3.f(w6Var22);
                                        w6Var3.setAlpha(1.0f);
                                        w6Var22.setAlpha(0.0f);
                                        daVar.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - daVar.t <= 450 && viewGroup2.isAttachedToWindow()) {
                                daVar.h.postOnAnimation(daVar.u);
                                break;
                            } else {
                                daVar.r = true;
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
        ofFloat.addUpdateListener(new q3(this, 10));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new ca(this, kiVar, w6Var));
        y5Var.P0();
        y5Var.Y0(false);
        bi.v3 v3Var = y5Var.a;
        if (v3Var != null) {
            v3Var.C0();
            y5Var.a.f3.h1(0, 0);
            u41 u41Var = y5Var.s0[0];
            if (u41Var != null) {
                p41 p41Var = u41Var.g3;
                u41Var.C0();
                p41Var.O(false);
                for (int i11 = 0; i11 < p41Var.E.size(); i11++) {
                    b41 G = p41Var.G(i11);
                    if (G != null) {
                        Object obj = G.G;
                        if (obj instanceof TL_wallet.walletTransaction) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                            int i12 = t3.b;
                            if ((wallettransaction2 instanceof s3 ? ((s3) wallettransaction2).a : wallettransaction2) == wallettransaction || l0.i0((TL_wallet.walletTransaction) obj, wallettransaction)) {
                                u41Var.f3.h1(i11, 0);
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
        aa aaVar = this.u;
        ba baVar = this.h;
        baVar.removeCallbacks(aaVar);
        w6 w6Var = this.i;
        w6Var.l(null);
        v3 v3Var = this.p;
        if (v3Var != null && (wallettransaction = v3Var.S) != null && t3.i(wallettransaction, this.f)) {
            w6 pendingDiamond = this.p.getPendingDiamond();
            if (pendingDiamond != null) {
                pendingDiamond.f(w6Var);
            }
            this.p.f(false);
            RectF rectF = this.o;
            if (!rectF.isEmpty()) {
                float centerY = (((rectF.centerY() - (Math.min(this.n.centerY(), rectF.centerY()) - org.telegram.messenger.g0.L(150.0f))) * 2.0f) / 0.6f) / org.telegram.messenger.g0.p;
                v3 v3Var2 = this.p;
                v3Var2.d();
                r1.g gVar = new r1.g(new r1.f(0.0f));
                v3Var2.I = gVar;
                r1.h hVar = new r1.h(0.0f);
                hVar.a(0.65f);
                hVar.b(200.0f);
                gVar.m = hVar;
                v3Var2.I.f(0.001f);
                v3Var2.I.a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                v3Var2.I.b(new p3(v3Var2, 0));
                v3Var2.I.h();
            }
        }
        w6Var.setPaused(true);
        baVar.removeView(w6Var);
        baVar.setClickable(false);
        this.d.setAlpha(this.l);
        ki kiVar = this.a;
        if (kiVar == null) {
            this.c.setTranslationY(0.0f);
        } else {
            kiVar.x1(1.0f);
        }
        ViewGroup viewGroup = this.b;
        if (kiVar != null && this.j.d()) {
            y5 y5Var = this.e;
            if (y5Var.getParentLayout() != null) {
                ViewGroup view = y5Var.getParentLayout().getView();
                if (view.isAttachedToWindow()) {
                    viewGroup.getLocationOnScreen(new int[2]);
                    view.getLocationOnScreen(new int[2]);
                    viewGroup.removeView(baVar);
                    baVar.setTranslationX(r6[0] - r4[0]);
                    baVar.setTranslationY(r6[1] - r4[1]);
                    view.addView(baVar, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.g.run();
        org.telegram.messenger.g0.i3(new r(20, this, viewGroup), 650L);
    }

    public final void c(float f10, float f11, float f12) {
        float L = org.telegram.messenger.g0.L(60.0f);
        ba baVar = this.h;
        float f13 = L / 2.0f;
        w6 w6Var = this.i;
        w6Var.setTranslationX((f10 - baVar.getLeft()) - f13);
        w6Var.setTranslationY((f11 - baVar.getTop()) - f13);
        float f14 = f12 / L;
        w6Var.setScaleX(f14);
        w6Var.setScaleY(f14);
    }

    public final RectF d(w6 w6Var) {
        ki kiVar = this.a;
        ViewGroup viewGroup = this.b;
        if (kiVar == null) {
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
        ki kiVar = this.a;
        if (kiVar == null) {
            f(w6Var, this.c, viewGroup, rectF);
        } else if (w6Var.isAttachedToWindow() && w6Var.getRootView() == viewGroup.getRootView()) {
            rectF.set(a(w6Var, viewGroup));
            rectF.offset(0.0f, kiVar.j4 - kiVar.t2);
        }
    }
}
