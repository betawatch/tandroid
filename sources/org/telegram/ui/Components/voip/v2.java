package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import bi.b5;
import bi.s7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.b90;
import org.telegram.ui.Components.vv0;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.au0;
import org.telegram.ui.bq0;
import org.telegram.ui.bu0;
import org.telegram.ui.bv0;
import org.telegram.ui.dr0;
import org.telegram.ui.er0;
import org.telegram.ui.gi;
import org.telegram.ui.gk0;
import org.telegram.ui.gr0;
import org.telegram.ui.hf0;
import org.telegram.ui.hu;
import org.telegram.ui.id0;
import org.telegram.ui.j50;
import org.telegram.ui.j60;
import org.telegram.ui.j80;
import org.telegram.ui.kj0;
import org.telegram.ui.nc;
import org.telegram.ui.nv;
import org.telegram.ui.ov;
import org.telegram.ui.pv;
import org.telegram.ui.py;
import org.telegram.ui.ql0;
import org.telegram.ui.st0;
import org.telegram.ui.sy;
import org.telegram.ui.vt0;
import org.telegram.ui.vy;
import org.telegram.ui.wt0;
import org.telegram.ui.wy;
import org.telegram.ui.x50;
import org.telegram.ui.zw;
import org.webrtc.OrientationHelper;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class v2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 15:
                ((hf0) this.b).s = null;
                break;
            case 21:
                ((PhotoViewer) ((vv0) this.b).c).A2 = null;
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
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        org.telegram.ui.ActionBar.l lVar3;
        switch (this.a) {
            case 0:
                ((w2) this.b).c.unlock();
                AndroidUtilities.unlockOrientation(((w2) this.b).a);
                if (((w2) this.b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((w2) this.b).a.getSystemService("window");
                    ((w2) this.b).setVisibility(8);
                    try {
                        windowManager.removeView((w2) this.b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    break;
                }
                break;
            case 1:
                c3 c3Var = (c3) this.b;
                c3Var.J = false;
                c3Var.T.e = false;
                if (c3Var.U && (animatorSet = c3Var.Q) != null) {
                    animatorSet.cancel();
                    c3Var.Q.start();
                }
                c3Var.c();
                break;
            case 2:
                ((k3) this.b).e.setVisibility(8);
                break;
            case 3:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    break;
                }
                break;
            case 4:
                hu huVar = (hu) this.b;
                if (animator.equals(huVar.n[0])) {
                    huVar.n[0] = null;
                    break;
                }
                break;
            case 5:
                nv nvVar = (nv) this.b;
                pv pvVar = nvVar.n;
                ov[] ovVarArr = pvVar.f;
                pvVar.h = null;
                if (pvVar.s) {
                    ovVarArr[1].setVisibility(8);
                } else {
                    ov ovVar = ovVarArr[0];
                    ovVarArr[0] = ovVarArr[1];
                    ovVarArr[1] = ovVar;
                    ovVar.setVisibility(8);
                    pvVar.w = pvVar.f[0].f == pvVar.e.getFirstTabId();
                    pvVar.e.j(1.0f, pvVar.f[0].f);
                }
                pvVar.n = false;
                nvVar.c = false;
                nvVar.b = false;
                lVar = ((org.telegram.ui.ActionBar.p2) pvVar).actionBar;
                lVar.setEnabled(true);
                pvVar.e.setEnabled(true);
                break;
            case 6:
                zw zwVar = (zw) this.b;
                wy.q1(zwVar.M, zwVar.L, 0.0f);
                break;
            case 7:
                wy wyVar = (wy) this.b;
                boolean z10 = wyVar.G0;
                wyVar.H0 = z10 ? 1.0f : 0.0f;
                if (!z10) {
                    wyVar.E0.setVisibility(8);
                }
                View view = wyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 8:
                wy wyVar2 = ((py) this.b).E0;
                wyVar2.f3 = null;
                if (!wyVar2.j3) {
                    vy[] vyVarArr = wyVar2.e0;
                    vy vyVar = vyVarArr[0];
                    vy vyVar2 = vyVarArr[1];
                    vyVarArr[0] = vyVar2;
                    vyVarArr[1] = vyVar;
                    wyVar2.z0.g(1.0f, vyVar2.h);
                    wyVar2.T4(false);
                    wyVar2.e0[0].d.getClass();
                    wyVar2.e0[1].d.getClass();
                }
                wyVar2.e0[1].setVisibility(8);
                wy.f1(wyVar2, true);
                wyVar2.g3 = false;
                wyVar2.m3 = false;
                lVar2 = ((org.telegram.ui.ActionBar.p2) wyVar2).actionBar;
                lVar2.setEnabled(true);
                wyVar2.z0.setEnabled(true);
                wyVar2.r3(wyVar2.e0[0]);
                break;
            case 9:
                super.onAnimationEnd(animator);
                ((sy) this.b).setScrollEnabled(true);
                break;
            case 10:
                b90 b90Var = (b90) this.b;
                FrameLayout frameLayout = b90Var.b;
                s7 s7Var = (s7) b90Var.c;
                if (s7Var.getParent() != null) {
                    frameLayout.removeView(s7Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((gi) b90Var.d);
                break;
            case 11:
                j60 j60Var = ((j50) this.b).o;
                j60 j60Var2 = j60.D3;
                j60Var.b1();
                viewGroup = ((org.telegram.ui.ActionBar.h3) j60Var).containerView;
                viewGroup.invalidate();
                j60Var.Q.invalidate();
                if (j60Var.s0) {
                    j60Var.s0 = false;
                    j60Var.O0(true);
                    break;
                }
                break;
            case 12:
                super.onAnimationEnd(animator);
                x50 x50Var = (x50) this.b;
                x50Var.G = null;
                j60 j60Var3 = x50Var.L;
                j60Var3.Q.invalidate();
                j60Var3.a2.invalidate();
                viewGroup2 = ((org.telegram.ui.ActionBar.h3) j60Var3).containerView;
                viewGroup2.invalidate();
                j60.J0(j60Var3);
                x50Var.H.clear();
                x50Var.I.clear();
                break;
            case 13:
                j80 j80Var = (j80) this.b;
                j80Var.d = null;
                j80Var.a = null;
                j80Var.b = false;
                break;
            case 14:
                id0 id0Var = (id0) this.b;
                id0Var.H = false;
                id0Var.o0();
                break;
            case 15:
                hf0 hf0Var = (hf0) this.b;
                if (hf0Var.s != null && hf0Var.n != null) {
                    hf0Var.r.setVisibility(4);
                    hf0Var.s = null;
                    break;
                }
                break;
            case 16:
                ((kj0) this.b).T.setVisibility(8);
                break;
            case 17:
                gk0 gk0Var = (gk0) this.b;
                gk0Var.f = 1.0f;
                gk0Var.invalidate();
                break;
            case 18:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.b;
                if (animator.equals(notificationsCustomSettingsActivity.e)) {
                    notificationsCustomSettingsActivity.e = null;
                    break;
                }
                break;
            case 19:
                bq0 bq0Var = (bq0) this.b;
                nc ncVar = bq0Var.X;
                if (ncVar != null) {
                    if (ncVar.getParent() != null) {
                        ((ViewGroup) bq0Var.X.getParent()).removeView(bq0Var.X);
                    }
                    bq0Var.X = null;
                }
                bq0Var.Z = null;
                super.onAnimationEnd(animator);
                break;
            case 20:
                dr0 dr0Var = (dr0) this.b;
                gr0 gr0Var = dr0Var.D0;
                er0[] er0VarArr = gr0Var.n;
                gr0Var.r = null;
                if (gr0Var.w) {
                    er0VarArr[1].setVisibility(8);
                } else {
                    er0 er0Var = er0VarArr[0];
                    er0VarArr[0] = er0VarArr[1];
                    er0VarArr[1] = er0Var;
                    er0Var.setVisibility(8);
                    gr0Var.e = gr0Var.n[0].e == gr0Var.h.getFirstTabId();
                    gr0Var.h.j(1.0f, gr0Var.n[0].e);
                }
                gr0Var.s = false;
                dr0Var.y0 = false;
                dr0Var.x0 = false;
                lVar3 = ((org.telegram.ui.ActionBar.p2) gr0Var).actionBar;
                lVar3.setEnabled(true);
                gr0Var.h.setEnabled(true);
                break;
            case 21:
                PhotoViewer photoViewer = (PhotoViewer) ((vv0) this.b).c;
                if (photoViewer.A2 != null) {
                    ql0 ql0Var = new ql0(this, 17);
                    photoViewer.I2 = ql0Var;
                    AndroidUtilities.runOnUIThread(ql0Var, 860L);
                    break;
                }
                break;
            case 22:
                vt0 vt0Var = (vt0) this.b;
                PhotoViewer photoViewer2 = vt0Var.b;
                kg.p pVar = photoViewer2.C1.b;
                pVar.q();
                CropAreaView cropAreaView = pVar.a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.C1.b.J = true;
                photoViewer2.p6 = null;
                photoViewer2.u4 = vt0Var.a;
                photoViewer2.f1().L.b(photoViewer2.u4 != 0);
                b5 b5Var = photoViewer2.K1;
                if (b5Var != null) {
                    b5Var.b(photoViewer2.u4 != 3);
                }
                if (photoViewer2.u4 != 3) {
                    photoViewer2.Z5 = 0.0f;
                }
                photoViewer2.o6 = -1;
                photoViewer2.e6 = 1.0f;
                photoViewer2.a6 = 1.0f;
                photoViewer2.c6 = 0.0f;
                photoViewer2.d6 = 0.0f;
                photoViewer2.w3(1.0f);
                photoViewer2.t2 = true;
                photoViewer2.e0.invalidate();
                break;
            case 23:
                wt0 wt0Var = (wt0) this.b;
                PhotoViewer photoViewer3 = wt0Var.b;
                photoViewer3.I1.i0.setVisibility(0);
                photoViewer3.p6 = null;
                photoViewer3.u4 = wt0Var.a;
                photoViewer3.f1().L.b(photoViewer3.u4 != 0);
                b5 b5Var2 = photoViewer3.K1;
                if (b5Var2 != null) {
                    b5Var2.b(photoViewer3.u4 != 3);
                }
                if (photoViewer3.u4 != 3) {
                    photoViewer3.Z5 = 0.0f;
                }
                photoViewer3.o6 = -1;
                photoViewer3.e6 = 1.0f;
                photoViewer3.a6 = 1.0f;
                photoViewer3.c6 = 0.0f;
                photoViewer3.d6 = 0.0f;
                photoViewer3.w3(1.0f);
                photoViewer3.t2 = true;
                photoViewer3.e0.invalidate();
                break;
            case 24:
                ((PhotoViewer) ((au0) this.b).q0).y3[0].setTag(null);
                break;
            case 25:
                ((bu0) this.b).d.T1.k0 = 1.0f;
                break;
            case 26:
                PhotoViewer photoViewer4 = ((bu0) this.b).d;
                photoViewer4.T1.setVisibility(4);
                photoViewer4.T1.k0 = 1.0f;
                break;
            case 27:
                AndroidUtilities.runOnUIThread(new ql0(this, 19));
                break;
            case 28:
                st0 st0Var = (st0) this.b;
                if (animator.equals(st0Var.c.T7)) {
                    st0Var.c.T7 = null;
                    break;
                }
                break;
            default:
                bv0 bv0Var = (bv0) this.b;
                if (bv0Var.e == animator) {
                    bv0Var.c[1].setVisibility(8);
                    bv0Var.e = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 22:
                vt0 vt0Var = (vt0) this.b;
                vt0Var.b.U0.setVisibility(0);
                vt0Var.b.C1.setVisibility(0);
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
