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
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class aa {
    public final di a;
    public final ViewGroup b;
    public final View c;
    public final v6 d;
    public final x5 e;
    public final TL_wallet.walletTransaction f;
    public final Runnable g;
    public final y9 h;
    public final v6 i;
    public final o9 j = new o9();
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
    public final x9 u;

    /* JADX WARN: Type inference failed for: r1v3, types: [org.telegram.ui.Wallet.x9] */
    public aa(ViewGroup viewGroup, View view, v6 v6Var, x5 x5Var, TL_wallet.walletTransaction wallettransaction, Runnable runnable, di diVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.m = animatorSet;
        this.o = new RectF();
        this.t = SystemClock.uptimeMillis();
        final int i7 = 0;
        this.u = new Runnable(this) { // from class: org.telegram.ui.Wallet.x9
            public final /* synthetic */ aa b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                v3 v3Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (i7) {
                    case 0:
                        aa aaVar = this.b;
                        v6 v6Var2 = aaVar.d;
                        ViewGroup viewGroup2 = aaVar.b;
                        AnimatorSet animatorSet2 = aaVar.m;
                        v6 v6Var3 = aaVar.i;
                        RectF rectF = aaVar.o;
                        RectF rectF2 = aaVar.n;
                        if (!aaVar.s && !aaVar.r) {
                            aaVar.e();
                            aaVar.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            x5 x5Var2 = aaVar.e;
                            TL_wallet.walletTransaction wallettransaction3 = aaVar.f;
                            q41 q41Var = x5Var2.r0[0];
                            v3 v3Var2 = null;
                            if (q41Var != null) {
                                int i10 = 0;
                                while (true) {
                                    if (i10 < q41Var.getChildCount()) {
                                        View childAt = q41Var.getChildAt(i10);
                                        if ((childAt instanceof v3) && (wallettransaction2 = (v3Var = (v3) childAt).R) != null && t3.i(wallettransaction2, wallettransaction3)) {
                                            v3Var2 = v3Var;
                                        } else {
                                            i10++;
                                        }
                                    }
                                }
                            }
                            if (v3Var2 != null && v3Var2.getWidth() > 0) {
                                v3 v3Var3 = aaVar.p;
                                if (v3Var3 != v3Var2) {
                                    if (v3Var3 != null) {
                                        v3Var3.f(false);
                                    }
                                    aaVar.p = v3Var2;
                                    v3Var2.f(true);
                                }
                                v6 pendingDiamond = aaVar.p.getPendingDiamond();
                                if (aaVar.q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !aaVar.p.isLayoutRequested()) {
                                    rectF.set(aaVar.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        aaVar.r = true;
                                        v6Var3.f(v6Var2);
                                        v6Var3.setAlpha(1.0f);
                                        v6Var2.setAlpha(0.0f);
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
                                v6Var3.setAlpha(0.0f);
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
        this.d = v6Var;
        this.l = v6Var.getAlpha();
        this.e = x5Var;
        this.f = wallettransaction;
        this.g = runnable;
        RectF a10 = a(v6Var, viewGroup);
        this.n = a10;
        y9 y9Var = new y9(this, viewGroup.getContext());
        this.h = y9Var;
        y9Var.setClipChildren(false);
        y9Var.setClipToPadding(false);
        final int i10 = 1;
        y9Var.setClickable(true);
        v6 v6Var2 = new v6(60, viewGroup.getContext(), true);
        this.i = v6Var2;
        v6Var2.setContinuousRotation(540.0f);
        v6Var2.f(v6Var);
        v6Var2.setAlpha(0.0f);
        y9Var.addView(v6Var2, c8.ha.e(60, 60, 51));
        viewGroup.addView(y9Var, new ViewGroup.LayoutParams(-1, -1));
        c(a10.centerX(), a10.centerY(), a10.width());
        v6Var2.l(new Runnable(this) { // from class: org.telegram.ui.Wallet.x9
            public final /* synthetic */ aa b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                v3 v3Var;
                TL_wallet.walletTransaction wallettransaction2;
                switch (i10) {
                    case 0:
                        aa aaVar = this.b;
                        v6 v6Var22 = aaVar.d;
                        ViewGroup viewGroup2 = aaVar.b;
                        AnimatorSet animatorSet2 = aaVar.m;
                        v6 v6Var3 = aaVar.i;
                        RectF rectF = aaVar.o;
                        RectF rectF2 = aaVar.n;
                        if (!aaVar.s && !aaVar.r) {
                            aaVar.e();
                            aaVar.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            x5 x5Var2 = aaVar.e;
                            TL_wallet.walletTransaction wallettransaction3 = aaVar.f;
                            q41 q41Var = x5Var2.r0[0];
                            v3 v3Var2 = null;
                            if (q41Var != null) {
                                int i102 = 0;
                                while (true) {
                                    if (i102 < q41Var.getChildCount()) {
                                        View childAt = q41Var.getChildAt(i102);
                                        if ((childAt instanceof v3) && (wallettransaction2 = (v3Var = (v3) childAt).R) != null && t3.i(wallettransaction2, wallettransaction3)) {
                                            v3Var2 = v3Var;
                                        } else {
                                            i102++;
                                        }
                                    }
                                }
                            }
                            if (v3Var2 != null && v3Var2.getWidth() > 0) {
                                v3 v3Var3 = aaVar.p;
                                if (v3Var3 != v3Var2) {
                                    if (v3Var3 != null) {
                                        v3Var3.f(false);
                                    }
                                    aaVar.p = v3Var2;
                                    v3Var2.f(true);
                                }
                                v6 pendingDiamond = aaVar.p.getPendingDiamond();
                                if (aaVar.q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !aaVar.p.isLayoutRequested()) {
                                    rectF.set(aaVar.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        aaVar.r = true;
                                        v6Var3.f(v6Var22);
                                        v6Var3.setAlpha(1.0f);
                                        v6Var22.setAlpha(0.0f);
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
                                v6Var3.setAlpha(0.0f);
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
        animatorSet.addListener(new z9(this, diVar, v6Var));
        x5Var.O0();
        x5Var.X0(false);
        fi.w3 w3Var = x5Var.a;
        if (w3Var != null) {
            w3Var.C0();
            x5Var.a.e3.h1(0, 0);
            q41 q41Var = x5Var.r0[0];
            if (q41Var != null) {
                l41 l41Var = q41Var.f3;
                q41Var.C0();
                l41Var.O(false);
                for (int i11 = 0; i11 < l41Var.D.size(); i11++) {
                    x31 G = l41Var.G(i11);
                    if (G != null) {
                        Object obj = G.G;
                        if (obj instanceof TL_wallet.walletTransaction) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                            int i12 = t3.b;
                            if ((wallettransaction2 instanceof s3 ? ((s3) wallettransaction2).a : wallettransaction2) == wallettransaction || m0.i0((TL_wallet.walletTransaction) obj, wallettransaction)) {
                                q41Var.e3.h1(i11, 0);
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
        v6 v6Var = this.i;
        v6Var.l(null);
        v3 v3Var = this.p;
        if (v3Var != null && (wallettransaction = v3Var.R) != null && t3.i(wallettransaction, this.f)) {
            v6 pendingDiamond = this.p.getPendingDiamond();
            if (pendingDiamond != null) {
                pendingDiamond.f(v6Var);
            }
            this.p.f(false);
            RectF rectF = this.o;
            if (!rectF.isEmpty()) {
                float centerY = (((rectF.centerY() - (Math.min(this.n.centerY(), rectF.centerY()) - org.telegram.messenger.g0.L(150.0f))) * 2.0f) / 0.6f) / org.telegram.messenger.g0.p;
                v3 v3Var2 = this.p;
                v3Var2.d();
                r1.g gVar = new r1.g(new r1.f(0.0f));
                v3Var2.H = gVar;
                r1.h hVar = new r1.h(0.0f);
                hVar.a(0.65f);
                hVar.b(200.0f);
                gVar.m = hVar;
                v3Var2.H.f(0.001f);
                v3Var2.H.a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                v3Var2.H.b(new p3(v3Var2, 0));
                v3Var2.H.h();
            }
        }
        v6Var.setPaused(true);
        y9Var.removeView(v6Var);
        y9Var.setClickable(false);
        this.d.setAlpha(this.l);
        di diVar = this.a;
        if (diVar == null) {
            this.c.setTranslationY(0.0f);
        } else {
            diVar.x1(1.0f);
        }
        ViewGroup viewGroup = this.b;
        if (diVar != null && this.j.d()) {
            x5 x5Var = this.e;
            if (x5Var.getParentLayout() != null) {
                ViewGroup view = x5Var.getParentLayout().getView();
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
        org.telegram.messenger.g0.i3(new n(24, this, viewGroup), 650L);
    }

    public final void c(float f10, float f11, float f12) {
        float L = org.telegram.messenger.g0.L(60.0f);
        y9 y9Var = this.h;
        float f13 = L / 2.0f;
        v6 v6Var = this.i;
        v6Var.setTranslationX((f10 - y9Var.getLeft()) - f13);
        v6Var.setTranslationY((f11 - y9Var.getTop()) - f13);
        float f14 = f12 / L;
        v6Var.setScaleX(f14);
        v6Var.setScaleY(f14);
    }

    public final RectF d(v6 v6Var) {
        di diVar = this.a;
        ViewGroup viewGroup = this.b;
        if (diVar == null) {
            return a(v6Var, viewGroup);
        }
        ViewGroup viewGroup2 = (ViewGroup) v6Var.getRootView();
        RectF a10 = a(v6Var, viewGroup2);
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
        v6 v6Var = this.d;
        di diVar = this.a;
        if (diVar == null) {
            f(v6Var, this.c, viewGroup, rectF);
        } else if (v6Var.isAttachedToWindow() && v6Var.getRootView() == viewGroup.getRootView()) {
            rectF.set(a(v6Var, viewGroup));
            rectF.offset(0.0f, diVar.f4 - diVar.p2);
        }
    }
}
