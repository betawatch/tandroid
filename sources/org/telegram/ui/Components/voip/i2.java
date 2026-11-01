package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.f80;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.a50;
import org.telegram.ui.av;
import org.telegram.ui.b40;
import org.telegram.ui.bv;
import org.telegram.ui.cs0;
import org.telegram.ui.cv;
import org.telegram.ui.dr0;
import org.telegram.ui.e7;
import org.telegram.ui.er0;
import org.telegram.ui.gi0;
import org.telegram.ui.gw;
import org.telegram.ui.ic;
import org.telegram.ui.kg0;
import org.telegram.ui.lo0;
import org.telegram.ui.mo0;
import org.telegram.ui.o40;
import org.telegram.ui.oy;
import org.telegram.ui.qh0;
import org.telegram.ui.rn0;
import org.telegram.ui.sx;
import org.telegram.ui.vd0;
import org.telegram.ui.vq0;
import org.telegram.ui.vx;
import org.telegram.ui.w60;
import org.telegram.ui.xb0;
import org.telegram.ui.xt;
import org.telegram.ui.yq0;
import org.telegram.ui.yx;
import org.telegram.ui.zq0;
import org.telegram.ui.zx;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class i2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 15:
                ((vd0) this.b).s = null;
                break;
            case 21:
                ((PhotoViewer) ((jw0) this.b).c).A2 = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AnimatorSet animatorSet;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                k2 k2Var = (k2) obj;
                k2Var.J = false;
                k2Var.T.e = false;
                if (k2Var.U && (animatorSet = k2Var.Q) != null) {
                    animatorSet.cancel();
                    k2Var.Q.start();
                }
                k2Var.c();
                break;
            case 1:
                ((s2) obj).e.setVisibility(8);
                break;
            case 2:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) obj;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    break;
                }
                break;
            case 3:
                xt xtVar = (xt) obj;
                if (animator.equals(xtVar.n[0])) {
                    xtVar.n[0] = null;
                    break;
                }
                break;
            case 4:
                av avVar = (av) obj;
                cv cvVar = avVar.n;
                bv[] bvVarArr = cvVar.f;
                cvVar.h = null;
                if (cvVar.s) {
                    bvVarArr[1].setVisibility(8);
                } else {
                    bv bvVar = bvVarArr[0];
                    bvVarArr[0] = bvVarArr[1];
                    bvVarArr[1] = bvVar;
                    bvVar.setVisibility(8);
                    cvVar.x = cvVar.f[0].f == cvVar.e.getFirstTabId();
                    cvVar.e.i(1.0f, cvVar.f[0].f);
                }
                cvVar.n = false;
                avVar.c = false;
                avVar.b = false;
                lVar = ((org.telegram.ui.ActionBar.k2) cvVar).actionBar;
                lVar.setEnabled(true);
                cvVar.e.setEnabled(true);
                break;
            case 5:
                gw gwVar = (gw) obj;
                zx.u1(gwVar.M, gwVar.L, 0.0f);
                break;
            case 6:
                zx zxVar = (zx) obj;
                boolean z10 = zxVar.G0;
                zxVar.H0 = z10 ? 1.0f : 0.0f;
                if (!z10) {
                    zxVar.E0.setVisibility(8);
                }
                View view = zxVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 7:
                zx zxVar2 = ((sx) obj).n0;
                zxVar2.g3 = null;
                if (!zxVar2.k3) {
                    yx[] yxVarArr = zxVar2.e0;
                    yx yxVar = yxVarArr[0];
                    yx yxVar2 = yxVarArr[1];
                    yxVarArr[0] = yxVar2;
                    yxVarArr[1] = yxVar;
                    zxVar2.z0.g(1.0f, yxVar2.h);
                    zxVar2.f5(false);
                    zxVar2.e0[0].d.getClass();
                    zxVar2.e0[1].d.getClass();
                }
                zxVar2.e0[1].setVisibility(8);
                zx.j1(zxVar2, true);
                zxVar2.h3 = false;
                zxVar2.n3 = false;
                lVar2 = ((org.telegram.ui.ActionBar.k2) zxVar2).actionBar;
                lVar2.setEnabled(true);
                zxVar2.z0.setEnabled(true);
                zxVar2.C3(zxVar2.e0[0]);
                break;
            case 8:
                super.onAnimationEnd(animator);
                ((vx) obj).setScrollEnabled(true);
                break;
            case 9:
                oy oyVar = (oy) obj;
                if (oyVar.w == animator) {
                    oyVar.w = null;
                    break;
                }
                break;
            case 10:
                f80 f80Var = (f80) obj;
                FrameLayout frameLayout = f80Var.b;
                kg.f0 f0Var = (kg.f0) f80Var.c;
                if (f0Var.getParent() != null) {
                    frameLayout.removeView(f0Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((e7) f80Var.d);
                break;
            case 11:
                a50 a50Var = ((b40) obj).o;
                a50 a50Var2 = a50.u5;
                a50Var.d1();
                a50Var.b.invalidate();
                a50Var.H1.invalidate();
                if (a50Var.j2) {
                    a50Var.j2 = false;
                    a50Var.Q0(true);
                    break;
                }
                break;
            case 12:
                super.onAnimationEnd(animator);
                o40 o40Var = (o40) obj;
                o40Var.G = null;
                a50 a50Var3 = o40Var.L;
                a50Var3.H1.invalidate();
                a50Var3.R3.invalidate();
                a50Var3.b.invalidate();
                a50.P0(a50Var3);
                o40Var.H.clear();
                o40Var.I.clear();
                break;
            case 13:
                w60 w60Var = (w60) obj;
                w60Var.a = null;
                w60Var.b = false;
                break;
            case 14:
                xb0 xb0Var = (xb0) obj;
                xb0Var.F = false;
                xb0Var.A0();
                break;
            case 15:
                vd0 vd0Var = (vd0) obj;
                if (vd0Var.s != null && vd0Var.n != null) {
                    vd0Var.r.setVisibility(4);
                    vd0Var.s = null;
                    break;
                }
                break;
            case 16:
                ((qh0) obj).T.setVisibility(8);
                break;
            case 17:
                gi0 gi0Var = (gi0) obj;
                gi0Var.f = 1.0f;
                gi0Var.invalidate();
                break;
            case 18:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (animator.equals(notificationsCustomSettingsActivity.e)) {
                    notificationsCustomSettingsActivity.e = null;
                    break;
                }
                break;
            case 19:
                rn0 rn0Var = (rn0) obj;
                ic icVar = rn0Var.X;
                if (icVar != null) {
                    if (icVar.getParent() != null) {
                        ((ViewGroup) rn0Var.X.getParent()).removeView(rn0Var.X);
                    }
                    rn0Var.X = null;
                }
                rn0Var.Z = null;
                super.onAnimationEnd(animator);
                break;
            case 20:
                lo0 lo0Var = (lo0) obj;
                mo0 mo0Var = lo0Var.m0;
                h5[] h5VarArr = mo0Var.n;
                mo0Var.r = null;
                if (mo0Var.x) {
                    h5VarArr[1].setVisibility(8);
                } else {
                    h5 h5Var = h5VarArr[0];
                    h5VarArr[0] = h5VarArr[1];
                    h5VarArr[1] = h5Var;
                    h5Var.setVisibility(8);
                    mo0Var.e = mo0Var.n[0].b == mo0Var.h.getFirstTabId();
                    mo0Var.h.i(1.0f, mo0Var.n[0].b);
                }
                mo0Var.s = false;
                lo0Var.h0 = false;
                lo0Var.g0 = false;
                lVar3 = ((org.telegram.ui.ActionBar.k2) mo0Var).actionBar;
                lVar3.setEnabled(true);
                mo0Var.h.setEnabled(true);
                break;
            case 21:
                PhotoViewer photoViewer = (PhotoViewer) ((jw0) obj).c;
                if (photoViewer.A2 != null) {
                    kg0 kg0Var = new kg0(this, 21);
                    photoViewer.I2 = kg0Var;
                    org.telegram.messenger.i0.h3(kg0Var, 860L);
                    break;
                }
                break;
            case 22:
                yq0 yq0Var = (yq0) obj;
                PhotoViewer photoViewer2 = yq0Var.b;
                eg.q qVar = photoViewer2.C1.b;
                qVar.q();
                CropAreaView cropAreaView = qVar.a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.C1.b.J = true;
                photoViewer2.p6 = null;
                photoViewer2.u4 = yq0Var.a;
                photoViewer2.h1().L.b(photoViewer2.u4 != 0);
                vh.r2 r2Var = photoViewer2.K1;
                if (r2Var != null) {
                    r2Var.b(photoViewer2.u4 != 3);
                }
                if (photoViewer2.u4 != 3) {
                    photoViewer2.Z5 = 0.0f;
                }
                photoViewer2.o6 = -1;
                photoViewer2.e6 = 1.0f;
                photoViewer2.a6 = 1.0f;
                photoViewer2.c6 = 0.0f;
                photoViewer2.d6 = 0.0f;
                photoViewer2.z3(1.0f);
                photoViewer2.t2 = true;
                photoViewer2.e0.invalidate();
                break;
            case 23:
                zq0 zq0Var = (zq0) obj;
                PhotoViewer photoViewer3 = zq0Var.b;
                photoViewer3.I1.i0.setVisibility(0);
                photoViewer3.p6 = null;
                photoViewer3.u4 = zq0Var.a;
                photoViewer3.h1().L.b(photoViewer3.u4 != 0);
                vh.r2 r2Var2 = photoViewer3.K1;
                if (r2Var2 != null) {
                    r2Var2.b(photoViewer3.u4 != 3);
                }
                if (photoViewer3.u4 != 3) {
                    photoViewer3.Z5 = 0.0f;
                }
                photoViewer3.o6 = -1;
                photoViewer3.e6 = 1.0f;
                photoViewer3.a6 = 1.0f;
                photoViewer3.c6 = 0.0f;
                photoViewer3.d6 = 0.0f;
                photoViewer3.z3(1.0f);
                photoViewer3.t2 = true;
                photoViewer3.e0.invalidate();
                break;
            case 24:
                ((PhotoViewer) ((dr0) obj).q0).y3[0].setTag(null);
                break;
            case 25:
                ((er0) obj).d.T1.k0 = 1.0f;
                break;
            case 26:
                PhotoViewer photoViewer4 = ((er0) obj).d;
                photoViewer4.T1.setVisibility(4);
                photoViewer4.T1.k0 = 1.0f;
                break;
            case 27:
                org.telegram.messenger.i0.g3(new kg0(this, 23));
                break;
            case 28:
                vq0 vq0Var = (vq0) obj;
                if (animator.equals(vq0Var.c.U7)) {
                    vq0Var.c.U7 = null;
                    break;
                }
                break;
            default:
                cs0 cs0Var = (cs0) obj;
                if (cs0Var.e == animator) {
                    cs0Var.c[1].setVisibility(8);
                    cs0Var.e = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 22:
                yq0 yq0Var = (yq0) this.b;
                yq0Var.b.U0.setVisibility(0);
                yq0Var.b.C1.setVisibility(0);
                break;
            case 23:
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
