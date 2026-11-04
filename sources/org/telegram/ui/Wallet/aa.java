package org.telegram.ui.Wallet;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import b8.mf;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.r31;
import org.telegram.ui.ma1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class aa {
    public final bi a;
    public final ViewGroup b;
    public final View c;
    public final u6 d;
    public final w5 e;
    public final TL_wallet.walletTransaction f;
    public final Runnable g;
    public final y9 h;
    public final u6 i;
    public final o9 j = new o9();
    public final PathInterpolator k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float l;
    public final AnimatorSet m;
    public final RectF n;
    public final RectF o;
    public u3 p;
    public boolean q;
    public boolean r;
    public boolean s;
    public final long t;
    public final x9 u;

    /* JADX WARN: Type inference failed for: r1v3, types: [org.telegram.ui.Wallet.x9] */
    public aa(ViewGroup viewGroup, View view, u6 u6Var, w5 w5Var, TL_wallet.walletTransaction wallettransaction, Runnable runnable, bi biVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.m = animatorSet;
        this.o = new RectF();
        this.t = SystemClock.uptimeMillis();
        final int i3 = 0;
        this.u = new Runnable(this) { // from class: org.telegram.ui.Wallet.x9
            public final /* synthetic */ aa b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                u3 u3Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (i3) {
                    case 0:
                        aa aaVar = this.b;
                        u6 u6Var2 = aaVar.d;
                        ViewGroup viewGroup2 = aaVar.b;
                        AnimatorSet animatorSet2 = aaVar.m;
                        u6 u6Var3 = aaVar.i;
                        RectF rectF = aaVar.o;
                        RectF rectF2 = aaVar.n;
                        if (!aaVar.s && !aaVar.r) {
                            aaVar.e();
                            aaVar.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            w5 w5Var2 = aaVar.e;
                            TL_wallet.walletTransaction wallettransaction3 = aaVar.f;
                            l41 l41Var = w5Var2.s0[0];
                            u3 u3Var2 = null;
                            if (l41Var != null) {
                                int i10 = 0;
                                while (true) {
                                    if (i10 < l41Var.getChildCount()) {
                                        View childAt = l41Var.getChildAt(i10);
                                        if ((childAt instanceof u3) && (wallettransaction2 = (u3Var = (u3) childAt).S) != null && s3.i(wallettransaction2, wallettransaction3)) {
                                            u3Var2 = u3Var;
                                        } else {
                                            i10++;
                                        }
                                    }
                                }
                            }
                            if (u3Var2 != null && u3Var2.getWidth() > 0) {
                                u3 u3Var3 = aaVar.p;
                                if (u3Var3 != u3Var2) {
                                    if (u3Var3 != null) {
                                        u3Var3.f(false);
                                    }
                                    aaVar.p = u3Var2;
                                    u3Var2.f(true);
                                }
                                u6 pendingDiamond = aaVar.p.getPendingDiamond();
                                if (aaVar.q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !aaVar.p.isLayoutRequested()) {
                                    rectF.set(aaVar.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        aaVar.r = true;
                                        u6Var3.f(u6Var2);
                                        u6Var3.setAlpha(1.0f);
                                        u6Var2.setAlpha(0.0f);
                                        aaVar.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - aaVar.t <= 450 && viewGroup2.isAttachedToWindow()) {
                                aaVar.h.postOnAnimation(aaVar.u);
                                break;
                            } else {
                                aaVar.r = true;
                                u6Var3.setAlpha(0.0f);
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
        this.a = biVar;
        this.b = viewGroup;
        this.c = view;
        this.d = u6Var;
        this.l = u6Var.getAlpha();
        this.e = w5Var;
        this.f = wallettransaction;
        this.g = runnable;
        RectF a10 = a(u6Var, viewGroup);
        this.n = a10;
        y9 y9Var = new y9(this, viewGroup.getContext());
        this.h = y9Var;
        y9Var.setClipChildren(false);
        y9Var.setClipToPadding(false);
        final int i10 = 1;
        y9Var.setClickable(true);
        u6 u6Var2 = new u6(60, viewGroup.getContext(), true);
        this.i = u6Var2;
        u6Var2.setContinuousRotation(540.0f);
        u6Var2.f(u6Var);
        u6Var2.setAlpha(0.0f);
        y9Var.addView(u6Var2, mf.e(60, 60, 51));
        viewGroup.addView(y9Var, new ViewGroup.LayoutParams(-1, -1));
        c(a10.centerX(), a10.centerY(), a10.width());
        u6Var2.l(new Runnable(this) { // from class: org.telegram.ui.Wallet.x9
            public final /* synthetic */ aa b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                u3 u3Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (i10) {
                    case 0:
                        aa aaVar = this.b;
                        u6 u6Var22 = aaVar.d;
                        ViewGroup viewGroup2 = aaVar.b;
                        AnimatorSet animatorSet2 = aaVar.m;
                        u6 u6Var3 = aaVar.i;
                        RectF rectF = aaVar.o;
                        RectF rectF2 = aaVar.n;
                        if (!aaVar.s && !aaVar.r) {
                            aaVar.e();
                            aaVar.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            w5 w5Var2 = aaVar.e;
                            TL_wallet.walletTransaction wallettransaction3 = aaVar.f;
                            l41 l41Var = w5Var2.s0[0];
                            u3 u3Var2 = null;
                            if (l41Var != null) {
                                int i102 = 0;
                                while (true) {
                                    if (i102 < l41Var.getChildCount()) {
                                        View childAt = l41Var.getChildAt(i102);
                                        if ((childAt instanceof u3) && (wallettransaction2 = (u3Var = (u3) childAt).S) != null && s3.i(wallettransaction2, wallettransaction3)) {
                                            u3Var2 = u3Var;
                                        } else {
                                            i102++;
                                        }
                                    }
                                }
                            }
                            if (u3Var2 != null && u3Var2.getWidth() > 0) {
                                u3 u3Var3 = aaVar.p;
                                if (u3Var3 != u3Var2) {
                                    if (u3Var3 != null) {
                                        u3Var3.f(false);
                                    }
                                    aaVar.p = u3Var2;
                                    u3Var2.f(true);
                                }
                                u6 pendingDiamond = aaVar.p.getPendingDiamond();
                                if (aaVar.q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !aaVar.p.isLayoutRequested()) {
                                    rectF.set(aaVar.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        aaVar.r = true;
                                        u6Var3.f(u6Var22);
                                        u6Var3.setAlpha(1.0f);
                                        u6Var22.setAlpha(0.0f);
                                        aaVar.j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        break;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - aaVar.t <= 450 && viewGroup2.isAttachedToWindow()) {
                                aaVar.h.postOnAnimation(aaVar.u);
                                break;
                            } else {
                                aaVar.r = true;
                                u6Var3.setAlpha(0.0f);
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
        ofFloat.addUpdateListener(new p3(this, 10));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new z9(this, biVar, u6Var));
        w5Var.O0();
        w5Var.X0(false);
        ai.h4 h4Var = w5Var.a;
        if (h4Var != null) {
            h4Var.C0();
            w5Var.a.f3.h1(0, 0);
            l41 l41Var = w5Var.s0[0];
            if (l41Var != null) {
                f41 f41Var = l41Var.g3;
                l41Var.C0();
                f41Var.O(false);
                for (int i11 = 0; i11 < f41Var.E.size(); i11++) {
                    r31 G = f41Var.G(i11);
                    if (G != null) {
                        Object obj = G.G;
                        if (obj instanceof TL_wallet.walletTransaction) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                            int i12 = s3.b;
                            if ((wallettransaction2 instanceof r3 ? ((r3) wallettransaction2).a : wallettransaction2) == wallettransaction || k0.i0((TL_wallet.walletTransaction) obj, wallettransaction)) {
                                l41Var.f3.h1(i11, 0);
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
        x9 x9Var = this.u;
        y9 y9Var = this.h;
        y9Var.removeCallbacks(x9Var);
        u6 u6Var = this.i;
        u6Var.l(null);
        u3 u3Var = this.p;
        if (u3Var != null && (wallettransaction = u3Var.S) != null && s3.i(wallettransaction, this.f)) {
            u6 pendingDiamond = this.p.getPendingDiamond();
            if (pendingDiamond != null) {
                pendingDiamond.f(u6Var);
            }
            this.p.f(false);
            RectF rectF = this.o;
            if (!rectF.isEmpty()) {
                float centerY = (((rectF.centerY() - (Math.min(this.n.centerY(), rectF.centerY()) - org.telegram.messenger.g0.L(150.0f))) * 2.0f) / 0.6f) / org.telegram.messenger.g0.p;
                u3 u3Var2 = this.p;
                u3Var2.d();
                q1.g gVar = new q1.g(new q1.f(0.0f));
                u3Var2.I = gVar;
                q1.h hVar = new q1.h(0.0f);
                hVar.a(0.65f);
                hVar.b(200.0f);
                gVar.m = hVar;
                u3Var2.I.f(0.001f);
                u3Var2.I.a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                u3Var2.I.b(new o3(u3Var2, 0));
                u3Var2.I.h();
            }
        }
        u6Var.setPaused(true);
        y9Var.removeView(u6Var);
        y9Var.setClickable(false);
        this.d.setAlpha(this.l);
        bi biVar = this.a;
        if (biVar == null) {
            this.c.setTranslationY(0.0f);
        } else {
            biVar.x1(1.0f);
        }
        ViewGroup viewGroup = this.b;
        if (biVar != null && this.j.d()) {
            w5 w5Var = this.e;
            if (w5Var.getParentLayout() != null) {
                ViewGroup view = w5Var.getParentLayout().getView();
                if (view.isAttachedToWindow()) {
                    viewGroup.getLocationOnScreen(new int[2]);
                    view.getLocationOnScreen(new int[2]);
                    viewGroup.removeView(y9Var);
                    y9Var.setTranslationX(r6[0] - r4[0]);
                    y9Var.setTranslationY(r6[1] - r4[1]);
                    view.addView(y9Var, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.g.run();
        org.telegram.messenger.g0.i3(new ma1(29, this, viewGroup), 650L);
    }

    public final void c(float f10, float f11, float f12) {
        float L = org.telegram.messenger.g0.L(60.0f);
        y9 y9Var = this.h;
        float f13 = L / 2.0f;
        u6 u6Var = this.i;
        u6Var.setTranslationX((f10 - y9Var.getLeft()) - f13);
        u6Var.setTranslationY((f11 - y9Var.getTop()) - f13);
        float f14 = f12 / L;
        u6Var.setScaleX(f14);
        u6Var.setScaleY(f14);
    }

    public final RectF d(u6 u6Var) {
        bi biVar = this.a;
        ViewGroup viewGroup = this.b;
        if (biVar == null) {
            return a(u6Var, viewGroup);
        }
        ViewGroup viewGroup2 = (ViewGroup) u6Var.getRootView();
        RectF a10 = a(u6Var, viewGroup2);
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
        u6 u6Var = this.d;
        bi biVar = this.a;
        if (biVar == null) {
            f(u6Var, this.c, viewGroup, rectF);
        } else if (u6Var.isAttachedToWindow() && u6Var.getRootView() == viewGroup.getRootView()) {
            rectF.set(a(u6Var, viewGroup));
            rectF.offset(0.0f, biVar.g4 - biVar.q2);
        }
    }
}
