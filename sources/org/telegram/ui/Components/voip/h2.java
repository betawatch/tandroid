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
import org.telegram.ui.Components.iw0;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ar0;
import org.telegram.ui.ay;
import org.telegram.ui.b50;
import org.telegram.ui.br0;
import org.telegram.ui.bv;
import org.telegram.ui.c40;
import org.telegram.ui.cv;
import org.telegram.ui.ds0;
import org.telegram.ui.dv;
import org.telegram.ui.e7;
import org.telegram.ui.fr0;
import org.telegram.ui.gr0;
import org.telegram.ui.hw;
import org.telegram.ui.ic;
import org.telegram.ui.ii0;
import org.telegram.ui.mg0;
import org.telegram.ui.no0;
import org.telegram.ui.oo0;
import org.telegram.ui.p40;
import org.telegram.ui.py;
import org.telegram.ui.sh0;
import org.telegram.ui.tn0;
import org.telegram.ui.tx;
import org.telegram.ui.wd0;
import org.telegram.ui.wx;
import org.telegram.ui.x60;
import org.telegram.ui.xq0;
import org.telegram.ui.yb0;
import org.telegram.ui.yt;
import org.telegram.ui.zx;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 15:
                ((wd0) this.b).s = null;
                break;
            case 21:
                ((PhotoViewer) ((iw0) this.b).c).A2 = null;
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
                j2 j2Var = (j2) obj;
                j2Var.J = false;
                j2Var.T.e = false;
                if (j2Var.U && (animatorSet = j2Var.Q) != null) {
                    animatorSet.cancel();
                    j2Var.Q.start();
                }
                j2Var.c();
                break;
            case 1:
                ((r2) obj).e.setVisibility(8);
                break;
            case 2:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) obj;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    break;
                }
                break;
            case 3:
                yt ytVar = (yt) obj;
                if (animator.equals(ytVar.n[0])) {
                    ytVar.n[0] = null;
                    break;
                }
                break;
            case 4:
                bv bvVar = (bv) obj;
                dv dvVar = bvVar.n;
                cv[] cvVarArr = dvVar.f;
                dvVar.h = null;
                if (dvVar.s) {
                    cvVarArr[1].setVisibility(8);
                } else {
                    cv cvVar = cvVarArr[0];
                    cvVarArr[0] = cvVarArr[1];
                    cvVarArr[1] = cvVar;
                    cvVar.setVisibility(8);
                    dvVar.x = dvVar.f[0].f == dvVar.e.getFirstTabId();
                    dvVar.e.i(1.0f, dvVar.f[0].f);
                }
                dvVar.n = false;
                bvVar.c = false;
                bvVar.b = false;
                lVar = ((org.telegram.ui.ActionBar.k2) dvVar).actionBar;
                lVar.setEnabled(true);
                dvVar.e.setEnabled(true);
                break;
            case 5:
                hw hwVar = (hw) obj;
                ay.t1(hwVar.M, hwVar.L, 0.0f);
                break;
            case 6:
                ay ayVar = (ay) obj;
                boolean z10 = ayVar.G0;
                ayVar.H0 = z10 ? 1.0f : 0.0f;
                if (!z10) {
                    ayVar.E0.setVisibility(8);
                }
                View view = ayVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 7:
                ay ayVar2 = ((tx) obj).n0;
                ayVar2.g3 = null;
                if (!ayVar2.k3) {
                    zx[] zxVarArr = ayVar2.e0;
                    zx zxVar = zxVarArr[0];
                    zx zxVar2 = zxVarArr[1];
                    zxVarArr[0] = zxVar2;
                    zxVarArr[1] = zxVar;
                    ayVar2.z0.g(1.0f, zxVar2.h);
                    ayVar2.e5(false);
                    ayVar2.e0[0].d.getClass();
                    ayVar2.e0[1].d.getClass();
                }
                ayVar2.e0[1].setVisibility(8);
                ay.i1(ayVar2, true);
                ayVar2.h3 = false;
                ayVar2.n3 = false;
                lVar2 = ((org.telegram.ui.ActionBar.k2) ayVar2).actionBar;
                lVar2.setEnabled(true);
                ayVar2.z0.setEnabled(true);
                ayVar2.B3(ayVar2.e0[0]);
                break;
            case 8:
                super.onAnimationEnd(animator);
                ((wx) obj).setScrollEnabled(true);
                break;
            case 9:
                py pyVar = (py) obj;
                if (pyVar.w == animator) {
                    pyVar.w = null;
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
                b50 b50Var = ((c40) obj).o;
                b50 b50Var2 = b50.u5;
                b50Var.d1();
                b50Var.b.invalidate();
                b50Var.H1.invalidate();
                if (b50Var.j2) {
                    b50Var.j2 = false;
                    b50Var.Q0(true);
                    break;
                }
                break;
            case 12:
                super.onAnimationEnd(animator);
                p40 p40Var = (p40) obj;
                p40Var.G = null;
                b50 b50Var3 = p40Var.L;
                b50Var3.H1.invalidate();
                b50Var3.R3.invalidate();
                b50Var3.b.invalidate();
                b50.P0(b50Var3);
                p40Var.H.clear();
                p40Var.I.clear();
                break;
            case 13:
                x60 x60Var = (x60) obj;
                x60Var.a = null;
                x60Var.b = false;
                break;
            case 14:
                yb0 yb0Var = (yb0) obj;
                yb0Var.F = false;
                yb0Var.z0();
                break;
            case 15:
                wd0 wd0Var = (wd0) obj;
                if (wd0Var.s != null && wd0Var.n != null) {
                    wd0Var.r.setVisibility(4);
                    wd0Var.s = null;
                    break;
                }
                break;
            case 16:
                ((sh0) obj).T.setVisibility(8);
                break;
            case 17:
                ii0 ii0Var = (ii0) obj;
                ii0Var.f = 1.0f;
                ii0Var.invalidate();
                break;
            case 18:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (animator.equals(notificationsCustomSettingsActivity.e)) {
                    notificationsCustomSettingsActivity.e = null;
                    break;
                }
                break;
            case 19:
                tn0 tn0Var = (tn0) obj;
                ic icVar = tn0Var.X;
                if (icVar != null) {
                    if (icVar.getParent() != null) {
                        ((ViewGroup) tn0Var.X.getParent()).removeView(tn0Var.X);
                    }
                    tn0Var.X = null;
                }
                tn0Var.Z = null;
                super.onAnimationEnd(animator);
                break;
            case 20:
                no0 no0Var = (no0) obj;
                oo0 oo0Var = no0Var.m0;
                h5[] h5VarArr = oo0Var.n;
                oo0Var.r = null;
                if (oo0Var.x) {
                    h5VarArr[1].setVisibility(8);
                } else {
                    h5 h5Var = h5VarArr[0];
                    h5VarArr[0] = h5VarArr[1];
                    h5VarArr[1] = h5Var;
                    h5Var.setVisibility(8);
                    oo0Var.e = oo0Var.n[0].b == oo0Var.h.getFirstTabId();
                    oo0Var.h.i(1.0f, oo0Var.n[0].b);
                }
                oo0Var.s = false;
                no0Var.h0 = false;
                no0Var.g0 = false;
                lVar3 = ((org.telegram.ui.ActionBar.k2) oo0Var).actionBar;
                lVar3.setEnabled(true);
                oo0Var.h.setEnabled(true);
                break;
            case 21:
                PhotoViewer photoViewer = (PhotoViewer) ((iw0) obj).c;
                if (photoViewer.A2 != null) {
                    mg0 mg0Var = new mg0(this, 21);
                    photoViewer.I2 = mg0Var;
                    org.telegram.messenger.i0.h3(mg0Var, 860L);
                    break;
                }
                break;
            case 22:
                ar0 ar0Var = (ar0) obj;
                PhotoViewer photoViewer2 = ar0Var.b;
                eg.q qVar = photoViewer2.C1.b;
                qVar.q();
                CropAreaView cropAreaView = qVar.a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.C1.b.J = true;
                photoViewer2.p6 = null;
                photoViewer2.u4 = ar0Var.a;
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
                br0 br0Var = (br0) obj;
                PhotoViewer photoViewer3 = br0Var.b;
                photoViewer3.I1.i0.setVisibility(0);
                photoViewer3.p6 = null;
                photoViewer3.u4 = br0Var.a;
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
                ((PhotoViewer) ((fr0) obj).q0).y3[0].setTag(null);
                break;
            case 25:
                ((gr0) obj).d.T1.k0 = 1.0f;
                break;
            case 26:
                PhotoViewer photoViewer4 = ((gr0) obj).d;
                photoViewer4.T1.setVisibility(4);
                photoViewer4.T1.k0 = 1.0f;
                break;
            case 27:
                org.telegram.messenger.i0.g3(new mg0(this, 23));
                break;
            case 28:
                xq0 xq0Var = (xq0) obj;
                if (animator.equals(xq0Var.c.U7)) {
                    xq0Var.c.U7 = null;
                    break;
                }
                break;
            default:
                ds0 ds0Var = (ds0) obj;
                if (ds0Var.e == animator) {
                    ds0Var.c[1].setVisibility(8);
                    ds0Var.e = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 22:
                ar0 ar0Var = (ar0) this.b;
                ar0Var.b.U0.setVisibility(0);
                ar0Var.b.C1.setVisibility(0);
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
